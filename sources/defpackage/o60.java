package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class o60 implements Serializable {
    public static final o60 l = new o60(new n60());
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final byte[] f;
    public final byte[] g;
    public final String h;
    public final long i;
    public final String j;
    public final String k;

    public o60(n60 n60Var) {
        this.a = n60Var.a;
        this.b = n60Var.b;
        this.c = n60Var.c;
        this.d = n60Var.d;
        this.e = n60Var.e;
        this.f = n60Var.f;
        this.g = n60Var.g;
        this.h = n60Var.h;
        this.i = n60Var.i;
        this.j = n60Var.j;
        this.k = n60Var.k;
    }

    public final String a() {
        String str = this.a;
        if (ch3.r(str)) {
            return null;
        }
        return vs0.b(str, "legacy_44");
    }

    public final String b(us0 us0Var) {
        String str = this.b;
        if (!ch3.r(str)) {
            return str;
        }
        String str2 = this.a;
        if (ch3.r(str2)) {
            return null;
        }
        return vs0.d(str2, us0Var, rs0.b);
    }

    public final n60 c() {
        n60 n60Var = new n60();
        n60Var.a = this.a;
        n60Var.b = this.b;
        n60Var.c = this.c;
        n60Var.d = this.d;
        n60Var.e = this.e;
        n60Var.f = this.f;
        n60Var.g = this.g;
        n60Var.h = this.h;
        n60Var.i = this.i;
        n60Var.j = this.j;
        n60Var.k = this.k;
        return n60Var;
    }
}
