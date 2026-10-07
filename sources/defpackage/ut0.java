package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ut0 extends u55 {
    public long i;
    public int j;
    public int k;

    @Override // defpackage.u55
    public final void q() {
        super.q();
        this.j = 0;
    }

    public final boolean u(u55 u55Var) {
        ByteBuffer byteBuffer;
        lvb.R(!u55Var.d(1073741824));
        lvb.R(!u55Var.d(268435456));
        lvb.R(!u55Var.d(4));
        if (v()) {
            if (this.j >= this.k) {
                return false;
            }
            ByteBuffer byteBuffer2 = u55Var.d;
            if (byteBuffer2 != null && (byteBuffer = this.d) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.j;
        this.j = i + 1;
        if (i == 0) {
            this.f = u55Var.f;
            if (u55Var.d(1)) {
                this.a = 1;
            }
        }
        ByteBuffer byteBuffer3 = u55Var.d;
        if (byteBuffer3 != null) {
            s(byteBuffer3.remaining());
            this.d.put(byteBuffer3);
        }
        this.i = u55Var.f;
        return true;
    }

    public final boolean v() {
        return this.j > 0;
    }
}
