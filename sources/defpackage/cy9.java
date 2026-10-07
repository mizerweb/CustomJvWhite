package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class cy9 {
    public static final cy9 i = new cy9(new by9());
    public static final String j = Integer.toString(0, 36);
    public static final String k = Integer.toString(1, 36);
    public static final String l = Integer.toString(2, 36);
    public static final String m = Integer.toString(3, 36);
    public static final String n = Integer.toString(4, 36);
    public static final String o = Integer.toString(5, 36);
    public static final String p = Integer.toString(6, 36);
    public static final String q = Integer.toString(7, 36);
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public cy9(by9 by9Var) {
        this.a = vqi.p0(by9Var.a);
        this.c = vqi.p0(by9Var.b);
        this.b = by9Var.a;
        this.d = by9Var.b;
        this.e = by9Var.c;
        this.f = by9Var.d;
        this.g = by9Var.e;
        this.h = by9Var.f;
    }

    public final by9 a() {
        by9 by9Var = new by9();
        by9Var.a = this.b;
        by9Var.b = this.d;
        by9Var.c = this.e;
        by9Var.d = this.f;
        by9Var.e = this.g;
        by9Var.f = this.h;
        return by9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy9)) {
            return false;
        }
        cy9 cy9Var = (cy9) obj;
        return this.b == cy9Var.b && this.d == cy9Var.d && this.e == cy9Var.e && this.f == cy9Var.f && this.g == cy9Var.g && this.h == cy9Var.h;
    }

    public final int hashCode() {
        long j2 = this.b;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        long j3 = this.d;
        return ((((((((i2 + ((int) ((j3 >>> 32) ^ j3))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
