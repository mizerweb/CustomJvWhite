package defpackage;

import androidx.media3.muxer.MuxerException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class ca8 implements q9b {
    public final tb7 a;

    public ca8(tb7 tb7Var) {
        this.a = tb7Var;
    }

    @Override // defpackage.q9b
    public final int b0(b87 b87Var) {
        tb7 tb7Var = this.a;
        int iB0 = tb7Var.b0(b87Var);
        if (uya.m(b87Var.n)) {
            tb7Var.k(new t2b(b87Var.z));
        }
        return iB0;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws MuxerException {
        this.a.close();
    }

    @Override // defpackage.q9b
    public final void k(jwa jwaVar) {
        if (hwk.c(jwaVar)) {
            this.a.k(jwaVar);
        }
    }

    @Override // defpackage.q9b
    public final void w0(int i, ByteBuffer byteBuffer, u31 u31Var) throws MuxerException {
        this.a.w0(i, byteBuffer, u31Var);
    }
}
