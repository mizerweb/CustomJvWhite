package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class jfh implements fb0 {
    public final Object b;
    public final fdg c = new fdg(true);

    public jfh(Object obj) {
        this.b = obj;
    }

    @Override // defpackage.fb0
    public final boolean c() {
        boolean zC;
        synchronized (this.b) {
            zC = this.c.c();
        }
        return zC;
    }

    @Override // defpackage.fb0
    public final ByteBuffer d() {
        ByteBuffer byteBufferD;
        synchronized (this.b) {
            byteBufferD = this.c.d();
        }
        return byteBufferD;
    }

    @Override // defpackage.fb0
    public final void e(db0 db0Var) {
        synchronized (this.b) {
            this.c.e(db0Var);
        }
    }

    @Override // defpackage.fb0
    public final void f(ByteBuffer byteBuffer) {
        synchronized (this.b) {
            this.c.f(byteBuffer);
        }
    }

    @Override // defpackage.fb0
    public final cb0 g(cb0 cb0Var) {
        cb0 cb0VarG;
        synchronized (this.b) {
            cb0VarG = this.c.g(cb0Var);
        }
        return cb0VarG;
    }

    @Override // defpackage.fb0
    public final void h() {
        synchronized (this.b) {
            this.c.h();
        }
    }

    @Override // defpackage.fb0
    public final long i(long j) {
        long jA;
        synchronized (this.b) {
            jA = this.c.a(j);
        }
        return jA;
    }

    @Override // defpackage.fb0
    public final boolean isActive() {
        boolean zIsActive;
        synchronized (this.b) {
            zIsActive = this.c.isActive();
        }
        return zIsActive;
    }

    @Override // defpackage.fb0
    public final void reset() {
        synchronized (this.b) {
            this.c.reset();
        }
    }
}
