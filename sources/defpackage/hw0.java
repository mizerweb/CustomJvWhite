package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hw0 implements xbf {
    public final jw0 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public hw0(jw0 jw0Var, long j, long j2, long j3, long j4, long j5) {
        this.a = jw0Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // defpackage.xbf
    public final wbf d(long j) {
        zbf zbfVar = new zbf(j, iw0.a(this.a.g(j), 0L, this.c, this.d, this.e, this.f));
        return new wbf(zbfVar, zbfVar);
    }

    @Override // defpackage.xbf
    public final boolean f() {
        return true;
    }

    @Override // defpackage.xbf
    public final long h() {
        return this.b;
    }
}
