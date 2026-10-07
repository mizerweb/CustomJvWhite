package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class nc5 implements q9b {
    public static final String b = fd7.f;
    public final ea8 a;

    public nc5(ea8 ea8Var) {
        this.a = ea8Var;
    }

    @Override // defpackage.q9b
    public final int b0(b87 b87Var) {
        return this.a.b0(b87Var);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.q9b
    public final void k(jwa jwaVar) {
        this.a.k(jwaVar);
    }

    @Override // defpackage.q9b
    public final void w0(int i, ByteBuffer byteBuffer, u31 u31Var) {
        this.a.w0(i, byteBuffer, u31Var);
    }
}
