/*
 
    Copyright IBM Corp. 2010, 2016
    This file is part of Anomaly Detection Engine for Linux Logs (ADE).

    ADE is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    ADE is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with ADE.  If not, see <http://www.gnu.org/licenses/>.
 
*/
package org.openmainframe.ade.impl.flow.hub;

import org.openmainframe.ade.flow.IStreamBlock;
import org.openmainframe.ade.flow.IStreamSource;
import org.openmainframe.ade.flow.IStreamTarget;

/**
 * This class extends {@link HubStreamSource} and implements {@link IStreamBlock}
 * so HubStreamBlock has both (@link StreamSource} and {@link IStreamTarget}.
 *
 * @param <T> - see {@link IStreamSource}
 * @param <U> - see {@link IStreamTarget}
 * 
 * @see HubStreamSource
 * @see IStreamTarget
 */
public abstract class HubStreamBlock<T, U> extends HubStreamSource<U>
        implements IStreamBlock<T, U> {

}
