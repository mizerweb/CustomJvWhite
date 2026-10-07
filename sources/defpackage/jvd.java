package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class jvd implements q9b {
    public final Long a;
    public final q9b b;
    public final c5f c;
    public float d;
    public Integer e;

    public jvd(Long l, q9b q9bVar, c5f c5fVar) {
        this.a = l;
        this.b = q9bVar;
        this.c = c5fVar;
    }

    @Override // defpackage.q9b
    public final int b0(b87 b87Var) {
        int iB0 = this.b.b0(b87Var);
        if (uya.m(b87Var.n)) {
            this.e = Integer.valueOf(iB0);
        }
        return iB0;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        this.b.close();
    }

    @Override // defpackage.q9b
    public final void k(jwa jwaVar) {
        this.b.k(jwaVar);
    }

    @Override // defpackage.q9b
    public final void w0(int i, ByteBuffer byteBuffer, u31 u31Var) {
        Long l;
        this.b.w0(i, byteBuffer, u31Var);
        Integer num = this.e;
        if (num == null || i != num.intValue() || (l = this.a) == null || l.longValue() == 0 || (u31Var.c & 2) != 0) {
            return;
        }
        float fMin = Math.min(100.0f, ((int) ((u31Var.a / this.a.longValue()) * 10000.0d)) / 100.0f);
        if (fMin > this.d) {
            this.d = fMin;
            c5f c5fVar = this.c;
            kvd kvdVar = (kvd) c5fVar.b;
            v56 v56Var = (v56) c5fVar.c;
            kvdVar.b = fMin;
            v56Var.K(kvdVar);
        }
    }
}
