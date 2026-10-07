package defpackage;

import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class u55 extends n31 {
    public b87 b;
    public final ty4 c = new ty4();
    public ByteBuffer d;
    public boolean e;
    public long f;
    public ByteBuffer g;
    public final int h;

    static {
        sz9.a("media3.decoder");
    }

    public u55(int i) {
        this.h = i;
    }

    public void q() {
        this.a = 0;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.e = false;
    }

    public final ByteBuffer r(int i) {
        int i2 = this.h;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.d;
        throw new DecoderInputBuffer$InsufficientCapacityException(nbh.u("Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), " < ", i, ")"));
    }

    public final void s(int i) {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            this.d = r(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            this.d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferR = r(i2);
        byteBufferR.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferR.put(byteBuffer);
        }
        this.d = byteBufferR;
    }

    public final void t() {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
