package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bu7 {
    public static final d71 d = qyj.x(":");
    public static final d71 e = qyj.x(":status");
    public static final d71 f = qyj.x(":method");
    public static final d71 g = qyj.x(":path");
    public static final d71 h = qyj.x(":scheme");
    public static final d71 i = qyj.x(":authority");
    public final d71 a;
    public final d71 b;
    public final int c;

    public bu7(String str, String str2) {
        d71 d71Var = new d71(str.getBytes(pt2.a));
        d71Var.c = str;
        d71 d71Var2 = new d71(str2.getBytes(pt2.a));
        d71Var2.c = str2;
        this(d71Var, d71Var2);
    }

    public final d71 a() {
        return this.a;
    }

    public final d71 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu7)) {
            return false;
        }
        bu7 bu7Var = (bu7) obj;
        return cqk.d(this.a, bu7Var.a) && cqk.d(this.b, bu7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.p() + ": " + this.b.p();
    }

    public bu7(d71 d71Var, String str) {
        d71 d71Var2 = new d71(str.getBytes(pt2.a));
        d71Var2.c = str;
        this(d71Var, d71Var2);
    }

    public bu7(d71 d71Var, d71 d71Var2) {
        this.a = d71Var;
        this.b = d71Var2;
        this.c = d71Var2.a() + d71Var.a() + 32;
    }
}
