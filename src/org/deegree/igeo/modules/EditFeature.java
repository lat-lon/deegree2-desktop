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

import org.deegree.igeo.mapmodel.Layer;
import org.deegree.model.feature.Feature;
import org.deegree.model.feature.FeatureCollection;

/**
 * must be impleted by forms/panels that enables manipulation of alpha numeric properties of a
 * feature
 * 
 * @author <a href="mailto:poth@lat-lon.de">Andreas Poth</a>
 * @author last edited by: $Author: poth $
 * 
 * @version. $Revision: 6251 $, $Date: 2007-03-19 16:59:28 +0100 (Mo, 19 Mrz 2007) $
 */
public interface EditFeature {

    /**
     * sets a new feature to display
     * 
     * @param layerA
     * @param featureCollection
     */
    void setFeature( Layer layer, FeatureCollection featureCollection );

    /**
     * 
     * @return edited feature
     */
    FeatureCollection getFeatureCollection();
    
    /**
     * 
     * @return the feature that is currently edited/selected in the GUI
     */
    Feature getCurrentFeature();

    /**
     * sets {@link DigitizerModule} to be informed about changed feature properties
     * 
     * @param digitizerModule
     */
    void setDigitizerModule( DigitizerModule<?> digitizerModule );
    
    /**
     * sets an implementing GUI element visible or not
     * @param visible
     */
    void setVisible(boolean visible);
    
    /**
     * dispose an implementing class by removing all allocated resources
     *
     */
    void dispose();

}