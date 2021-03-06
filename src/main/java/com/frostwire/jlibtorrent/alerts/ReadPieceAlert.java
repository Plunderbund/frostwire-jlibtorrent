package com.frostwire.jlibtorrent.alerts;

import com.frostwire.jlibtorrent.ErrorCode;
import com.frostwire.jlibtorrent.Vectors;
import com.frostwire.jlibtorrent.swig.byte_vector;
import com.frostwire.jlibtorrent.swig.read_piece_alert;

import static com.frostwire.jlibtorrent.swig.libtorrent.ed25519_create_seed;

/**
 * This alert is posted when the asynchronous read operation initiated by
 * a call to {@link com.frostwire.jlibtorrent.TorrentHandle#readPiece(int)}
 * is completed. If the read failed, the torrent
 * is paused and an error state is set and the buffer member of the alert
 * is 0. If successful, {@link #bufferPtr()} points to a buffer containing all the data
 * of the piece. {@link #piece()} is the piece index that was read. {@link #size()}
 * is the number of bytes that was read.
 * <p>
 * If the operation fails, {@link #error()} will indicate what went wrong.
 *
 * @author gubatron
 * @author aldenml
 */
public final class ReadPieceAlert extends TorrentAlert<read_piece_alert> {

    ReadPieceAlert(read_piece_alert alert) {
        super(alert);
    }

    /**
     * @return the error
     */
    public ErrorCode error() {
        return new ErrorCode(alert.getError());
    }

    /**
     * @return
     */
    public byte[] data() {
        return Vectors.byte_vector2bytes(alert.data());
    }

    /**
     * @return the piece index
     */
    public int piece() {
        return alert.getPiece();
    }

    /**
     * @return the piece size
     */
    public int size() {
        return alert.getSize();
    }
}
