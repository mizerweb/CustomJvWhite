package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ok5 {
    public static final ok5 e = new nk5(0).b();
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final int b;
    public final int c;
    public final String d;

    static {
        String str = vqi.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        i = Integer.toString(3, 36);
    }

    public ok5(nk5 nk5Var) {
        this.a = nk5Var.a;
        this.b = nk5Var.b;
        this.c = nk5Var.c;
        this.d = (String) nk5Var.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok5)) {
            return false;
        }
        ok5 ok5Var = (ok5) obj;
        return this.a == ok5Var.a && this.b == ok5Var.b && this.c == ok5Var.c && Objects.equals(this.d, ok5Var.d);
    }

    public final int hashCode() {
        int i2 = (((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31;
        String str = this.d;
        return i2 + (str == null ? 0 : str.hashCode());
    }
}
