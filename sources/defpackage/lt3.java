package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lt3 {
    public final ur0 a;
    public long b;
    public long c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;

    public lt3(ur0 ur0Var) {
        ur0Var.getClass();
        this.a = ur0Var;
        this.d = true;
        this.c = Long.MIN_VALUE;
    }

    public final nt3 a() {
        this.h = true;
        return new nt3(this);
    }

    public final void b(boolean z) {
        lvb.b0(!this.h);
        this.e = z;
    }

    public final void c(boolean z) {
        lvb.b0(!this.h);
        this.g = z;
    }

    public final void d(boolean z) {
        lvb.b0(!this.h);
        this.d = z;
    }

    public final void e(long j) {
        lvb.b0(!this.h);
        this.c = j;
    }

    public final void f(boolean z) {
        lvb.b0(!this.h);
        this.f = z;
    }

    public final void g(long j) {
        lvb.R(j >= 0);
        lvb.b0(!this.h);
        this.b = j;
    }
}
