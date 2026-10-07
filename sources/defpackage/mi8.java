package defpackage;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class mi8 {
    public static final mi8 e = new mi8(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public mi8(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static mi8 a(mi8 mi8Var, mi8 mi8Var2) {
        return b(Math.max(mi8Var.a, mi8Var2.a), Math.max(mi8Var.b, mi8Var2.b), Math.max(mi8Var.c, mi8Var2.c), Math.max(mi8Var.d, mi8Var2.d));
    }

    public static mi8 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new mi8(i, i2, i3, i4);
    }

    public static mi8 c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return li8.e(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mi8.class != obj.getClass()) {
            return false;
        }
        mi8 mi8Var = (mi8) obj;
        return this.d == mi8Var.d && this.a == mi8Var.a && this.c == mi8Var.c && this.b == mi8Var.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return qt4.p(sb, this.d, '}');
    }
}
