/*
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package jcifsng211.pac;


import jcifsng211.CIFSException;


@SuppressWarnings ( "javadoc" )
public class PACDecodingException extends CIFSException {

    private static final long serialVersionUID = 1L;


    public PACDecodingException () {
        this(null, null);
    }


    public PACDecodingException ( String message ) {
        this(message, null);
    }


    public PACDecodingException ( Throwable cause ) {
        this(null, cause);
    }


    public PACDecodingException ( String message, Throwable cause ) {
        super(message, cause);
    }

}
