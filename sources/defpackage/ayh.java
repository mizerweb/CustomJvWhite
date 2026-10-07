package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ayh {
    public final b87 a;
    public boolean g;
    public byte[] h;
    public final boolean j;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayDeque e = new ArrayDeque();
    public final ArrayDeque f = new ArrayDeque();
    public long i = -9223372036854775807L;

    public ayh(int i, b87 b87Var, boolean z) {
        this.a = b87Var;
        this.j = z;
    }

    public final int a() {
        b87 b87Var = this.a;
        if (uya.i(b87Var.n)) {
            return b87Var.G;
        }
        return 90000;
    }

    public final void b(ByteBuffer byteBuffer, u31 u31Var) {
        lvb.O("Samples can not be written after writing a sample with MediaCodec.BUFFER_FLAG_END_OF_STREAM flag", this.i == -9223372036854775807L);
        int i = u31Var.b;
        long j = u31Var.a;
        int i2 = u31Var.c;
        if (i == 0 || byteBuffer.remaining() == 0) {
            if ((i2 & 4) != 0) {
                this.i = j;
                return;
            }
            return;
        }
        if ((i2 & 1) > 0) {
            this.g = true;
        }
        if (this.g || !uya.m(this.a.n)) {
            if (this.j) {
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
                byteBufferAllocateDirect.put(byteBuffer);
                byteBufferAllocateDirect.rewind();
                byteBuffer = byteBufferAllocateDirect;
            }
            this.e.addLast(new u31(byteBuffer.remaining(), i2, j));
            this.f.addLast(byteBuffer);
        }
    }
}
