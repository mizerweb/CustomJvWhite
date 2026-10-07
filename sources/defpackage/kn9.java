package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kn9 implements u0a, t0a {
    public final x4a a;
    public final long b;
    public final qf c;
    public ur0 d;
    public u0a e;
    public t0a f;
    public long g = -9223372036854775807L;

    public kn9(x4a x4aVar, qf qfVar, long j) {
        this.a = x4aVar;
        this.c = qfVar;
        this.b = j;
    }

    @Override // defpackage.t0a
    public final void C(u0a u0aVar) {
        t0a t0aVar = this.f;
        String str = vqi.a;
        t0aVar.C(this);
    }

    @Override // defpackage.u0a
    public final long a(rg6[] rg6VarArr, boolean[] zArr, xye[] xyeVarArr, boolean[] zArr2, long j) {
        long j2 = this.g;
        if (j2 != -9223372036854775807L && j == this.b) {
            j = j2;
        }
        this.g = -9223372036854775807L;
        u0a u0aVar = this.e;
        String str = vqi.a;
        return u0aVar.a(rg6VarArr, zArr, xyeVarArr, zArr2, j);
    }

    public final void b(x4a x4aVar) {
        long j = this.g;
        if (j == -9223372036854775807L) {
            j = this.b;
        }
        ur0 ur0Var = this.d;
        ur0Var.getClass();
        u0a u0aVarE = ur0Var.e(x4aVar, this.c, j);
        this.e = u0aVarE;
        if (this.f != null) {
            u0aVarE.s(this, j);
        }
    }

    @Override // defpackage.u0a
    public final long c(long j, ybf ybfVar) {
        u0a u0aVar = this.e;
        String str = vqi.a;
        return u0aVar.c(j, ybfVar);
    }

    @Override // defpackage.vhf
    public final long e() {
        u0a u0aVar = this.e;
        String str = vqi.a;
        return u0aVar.e();
    }

    @Override // defpackage.u0a
    public final long g(long j) {
        u0a u0aVar = this.e;
        String str = vqi.a;
        return u0aVar.g(j);
    }

    @Override // defpackage.vhf
    public final boolean i() {
        u0a u0aVar = this.e;
        return u0aVar != null && u0aVar.i();
    }

    @Override // defpackage.u0a
    public final long k() {
        u0a u0aVar = this.e;
        String str = vqi.a;
        return u0aVar.k();
    }

    @Override // defpackage.u0a
    public final void n() {
        u0a u0aVar = this.e;
        if (u0aVar != null) {
            u0aVar.n();
            return;
        }
        ur0 ur0Var = this.d;
        if (ur0Var != null) {
            ur0Var.m();
        }
    }

    @Override // defpackage.uhf
    public final void q(vhf vhfVar) {
        t0a t0aVar = this.f;
        String str = vqi.a;
        t0aVar.q(this);
    }

    @Override // defpackage.u0a
    public final void s(t0a t0aVar, long j) {
        this.f = t0aVar;
        u0a u0aVar = this.e;
        if (u0aVar != null) {
            long j2 = this.g;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            u0aVar.s(this, j2);
        }
    }

    @Override // defpackage.u0a
    public final iyh t() {
        u0a u0aVar = this.e;
        String str = vqi.a;
        return u0aVar.t();
    }

    @Override // defpackage.vhf
    public final boolean u(fa9 fa9Var) {
        u0a u0aVar = this.e;
        return u0aVar != null && u0aVar.u(fa9Var);
    }

    @Override // defpackage.vhf
    public final long v() {
        u0a u0aVar = this.e;
        String str = vqi.a;
        return u0aVar.v();
    }

    @Override // defpackage.u0a
    public final void w(long j, boolean z) {
        u0a u0aVar = this.e;
        String str = vqi.a;
        u0aVar.w(j, z);
    }

    @Override // defpackage.vhf
    public final void y(long j) {
        u0a u0aVar = this.e;
        String str = vqi.a;
        u0aVar.y(j);
    }
}
