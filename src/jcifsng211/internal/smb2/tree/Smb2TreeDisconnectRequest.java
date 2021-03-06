/*
 * © 2017 AgNO3 Gmbh & Co. KG
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
package jcifsng211.internal.smb2.tree;


import jcifsng211.CIFSContext;
import jcifsng211.Configuration;
import jcifsng211.internal.smb2.ServerMessageBlock2Request;
import jcifsng211.internal.smb2.Smb2Constants;
import jcifsng211.internal.util.SMBUtil;


/**
 * @author mbechler
 *
 */
public class Smb2TreeDisconnectRequest extends ServerMessageBlock2Request<Smb2TreeDisconnectResponse> {

    /**
     * @param config
     */
    public Smb2TreeDisconnectRequest ( Configuration config ) {
        super(config, SMB2_TREE_DISCONNECT);
    }


    @Override
    protected Smb2TreeDisconnectResponse createResponse ( CIFSContext tc, ServerMessageBlock2Request<Smb2TreeDisconnectResponse> req ) {
        return new Smb2TreeDisconnectResponse(tc.getConfig());
    }


    /**
     * {@inheritDoc}
     *
     * @see jcifsng211.internal.CommonServerMessageBlockRequest#size()
     */
    @Override
    public int size () {
        return size8(Smb2Constants.SMB2_HEADER_LENGTH + 4);
    }


    /**
     * {@inheritDoc}
     *
     * @see jcifsng211.internal.smb2.ServerMessageBlock2#writeBytesWireFormat(byte[], int)
     */
    @Override
    protected int writeBytesWireFormat ( byte[] dst, int dstIndex ) {
        SMBUtil.writeInt2(4, dst, dstIndex);
        SMBUtil.writeInt2(0, dst, dstIndex + 2);
        return 4;
    }


    /**
     * {@inheritDoc}
     *
     * @see jcifsng211.internal.smb2.ServerMessageBlock2#readBytesWireFormat(byte[], int)
     */
    @Override
    protected int readBytesWireFormat ( byte[] buffer, int bufferIndex ) {
        return 0;
    }

}
