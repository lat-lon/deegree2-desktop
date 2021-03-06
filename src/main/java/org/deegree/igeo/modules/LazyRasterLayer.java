//$HeadURL$
/*----------------    FILE HEADER  ------------------------------------------
 This file is part of deegree.
 Copyright (C) 2001-2008 by:
 Department of Geography, University of Bonn
 http://www.giub.uni-bonn.de/deegree/
 lat/lon GmbH
 http://www.lat-lon.de

 This library is free software; you can redistribute it and/or
 modify it under the terms of the GNU Lesser General Public
 License as published by the Free Software Foundation; either
 version 2.1 of the License, or (at your option) any later version.
 This library is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 Lesser General Public License for more details.
 You should have received a copy of the GNU Lesser General Public
 License along with this library; if not, write to the Free Software
 Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 Contact:

 Andreas Poth
 lat/lon GmbH
 Aennchenstr. 19
 53177 Bonn
 Germany
 E-Mail: poth@lat-lon.de

 Prof. Dr. Klaus Greve
 Department of Geography
 University of Bonn
 Meckenheimer Allee 166
 53115 Bonn
 Germany
 E-Mail: greve@giub.uni-bonn.de
 ---------------------------------------------------------------------------*/

package org.deegree.igeo.modules;

import java.io.IOException;

import org.deegree.igeo.dataadapter.GridCoverageAdapter;
import org.deegree.igeo.mapmodel.Datasource;
import org.deegree.model.coverage.grid.GridCoverage;
import org.deegree.model.crs.CoordinateSystem;
import org.deegree.model.spatialschema.Envelope;
import org.deegree.model.spatialschema.GeometryFactory;
import org.deegree.ogcwebservices.InvalidParameterValueException;

/**
 * 
 * 
 * @author <a href="mailto:poth@lat-lon.de">Andreas Poth</a>
 * @author last edited by: $Author$
 * 
 * @version. $Revision$, $Date$
 */
public class LazyRasterLayer extends org.deegree.graphics.LazyRasterLayer {

    private GridCoverageAdapter gridCoverageAdapter;

    /**
     * 
     * @param name
     * @param crs
     * @param gridCoverageAdapter
     * @throws Exception
     */
    public LazyRasterLayer( String name, CoordinateSystem crs, GridCoverageAdapter gridCoverageAdapter )
                            throws Exception {
        super( name, crs, null );
        this.gridCoverageAdapter = gridCoverageAdapter;
    }

    @Override
    public Envelope getBoundingBox() {
        Envelope env = gridCoverageAdapter.getCoverage().getEnvelope();
        return GeometryFactory.createEnvelope( env.getMin(), env.getMax(), getCoordinatesSystem() );
    }

    @Override
    public GridCoverage getRaster( Envelope envelope, double resolution )
                            throws InvalidParameterValueException, IOException {
        return gridCoverageAdapter.getCoverage();
    }

    @Override
    public boolean isValid() {
        Datasource ds = gridCoverageAdapter.getDatasource();
        double sc = gridCoverageAdapter.getLayer().getOwner().getScaleDenominator();
        return ds.getMinScaleDenominator() <= sc && ds.getMaxScaleDenominator() >= sc;
    }
}
