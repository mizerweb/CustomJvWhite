package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ph5 {
    public final x0e a;
    public final int b;
    public final int c;

    public ph5(x0e x0eVar, int i, int i2) {
        this.a = x0eVar;
        this.b = i;
        this.c = i2;
    }

    public static ph5 a(Class cls) {
        return new ph5(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ph5)) {
            return false;
        }
        ph5 ph5Var = (ph5) obj;
        return this.a.equals(ph5Var.a) && this.b == ph5Var.b && this.c == ph5Var.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str2 = "direct";
        } else if (i2 == 1) {
            str2 = "provider";
        } else {
            if (i2 != 2) {
                c.e(zo5.h(i2, "Unsupported injection: "));
                return null;
            }
            str2 = "deferred";
        }
        return zo5.w(sb, str2, "}");
    }

    public ph5(int i, int i2, Class cls) {
        this(x0e.a(cls), i, i2);
    }
}
