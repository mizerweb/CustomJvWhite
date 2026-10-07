package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e70 {
    public final boolean A;
    public final boolean B;
    public final String C;
    public final y60 a;
    public final o60 b;
    public final h60 c;
    public final d70 d;
    public final b60 e;
    public final w60 f;
    public final t60 g;
    public final z50 h;
    public final e60 i;
    public final j60 j;
    public final f60 k;
    public final p60 l;
    public final l60 m;
    public final qvj n;
    public final o5d o;
    public final ntg p;
    public final u60 q;
    public final long r;
    public final float s;
    public final String t;
    public final String u;
    public final boolean v;
    public final long w;
    public final long x;
    public final long y;
    public final q60 z;

    public e70(c60 c60Var) {
        this.a = c60Var.a;
        this.b = c60Var.b;
        this.c = c60Var.c;
        this.d = c60Var.d;
        this.e = c60Var.e;
        this.f = c60Var.f;
        this.g = c60Var.g;
        this.h = c60Var.h;
        this.i = c60Var.q;
        this.j = c60Var.r;
        this.k = c60Var.s;
        this.l = c60Var.t;
        this.q = c60Var.i;
        this.r = c60Var.j;
        this.s = c60Var.k;
        this.t = c60Var.l;
        this.u = c60Var.m;
        this.v = c60Var.n;
        this.w = c60Var.o;
        this.x = c60Var.p;
        this.y = c60Var.u;
        this.m = c60Var.v;
        this.n = c60Var.w;
        this.o = c60Var.x;
        this.z = c60Var.y;
        this.A = c60Var.z;
        this.B = c60Var.A;
        this.C = c60Var.B;
        this.p = c60Var.C;
    }

    public final boolean a() {
        return this.e != null;
    }

    public final boolean b() {
        return this.k != null;
    }

    public final boolean c() {
        return this.j != null;
    }

    public final boolean d() {
        o60 o60Var = this.b;
        return o60Var != null && o60Var.e;
    }

    public final boolean e() {
        return this.b != null;
    }

    public final boolean f() {
        return h() && this.d.b == 1;
    }

    public final boolean g() {
        return this.g != null;
    }

    public final boolean h() {
        return this.d != null;
    }

    public final boolean i() {
        d70 d70Var = this.d;
        return d70Var != null && d70Var.b == 2;
    }

    public final c60 j() {
        c60 c60Var = new c60();
        c60Var.a = this.a;
        c60Var.b = this.b;
        c60Var.c = this.c;
        c60Var.d = this.d;
        c60Var.e = this.e;
        c60Var.f = this.f;
        c60Var.g = this.g;
        c60Var.h = this.h;
        c60Var.q = this.i;
        c60Var.r = this.j;
        c60Var.s = this.k;
        c60Var.t = this.l;
        c60Var.i = this.q;
        c60Var.j = this.r;
        c60Var.k = this.s;
        c60Var.l = this.t;
        c60Var.m = this.u;
        c60Var.n = this.v;
        c60Var.o = this.w;
        c60Var.p = this.x;
        c60Var.u = this.y;
        c60Var.v = this.m;
        c60Var.y = this.z;
        c60Var.z = this.A;
        c60Var.A = this.B;
        c60Var.w = this.n;
        c60Var.x = this.o;
        c60Var.C = this.p;
        return c60Var;
    }

    public final String toString() {
        return nbh.y(qv1.q("Attach{type=", String.valueOf(this.a), ", status=", String.valueOf(this.q), ", localId='"), this.t, "', localPath='", gm0.c() ? this.u : "***", "'}");
    }
}
