package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e60 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final List f;

    static {
        new d60().a();
    }

    public e60(d60 d60Var) {
        this.a = (String) d60Var.d;
        this.b = (String) d60Var.e;
        this.c = d60Var.a;
        this.d = d60Var.b;
        this.e = d60Var.c;
        this.f = (List) d60Var.f;
    }

    public final int a() {
        return this.c;
    }

    public final List b() {
        return this.f;
    }

    public final String c() {
        return this.a;
    }

    public final long d() {
        return this.e;
    }

    public final int e() {
        return this.d;
    }

    public final String f() {
        return this.b;
    }

    public final boolean g() {
        return this.d == 3;
    }

    public final boolean h() {
        return i() || g() || j();
    }

    public final boolean i() {
        return this.d == 5;
    }

    public final boolean j() {
        return this.d == 4;
    }

    public final boolean k() {
        return this.c == 2;
    }
}
