package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oi8 {
    public static final oi8 e = new oi8(0, 0, 0, null, 15);
    public static final oi8 f = new oi8(5, 3, 5, new j11(3, 3, false));
    public final int a;
    public final int b;
    public final int c;
    public final j11 d;

    public /* synthetic */ oi8(int i, int i2, int i3, j11 j11Var, int i4) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? null : j11Var);
    }

    public static oi8 a(oi8 oi8Var, int i) {
        return new oi8((i & 1) != 0 ? oi8Var.a : 5, (i & 2) != 0 ? oi8Var.b : 0, (i & 4) != 0 ? oi8Var.c : 5, (i & 8) != 0 ? oi8Var.d : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi8)) {
            return false;
        }
        oi8 oi8Var = (oi8) obj;
        int i = oi8Var.a;
        int i2 = this.a;
        if (i2 == 0) {
            if (i != 0) {
                return false;
            }
        } else if (i == 0 || i2 != i) {
            return false;
        }
        int i3 = oi8Var.b;
        int i4 = this.b;
        if (i4 == 0) {
            if (i3 != 0) {
                return false;
            }
        } else if (i3 == 0 || i4 != i3) {
            return false;
        }
        int i5 = oi8Var.c;
        int i6 = this.c;
        if (i6 == 0) {
            if (i5 != 0) {
                return false;
            }
        } else if (i5 == 0 || i6 != i5) {
            return false;
        }
        return cqk.d(this.d, oi8Var.d);
    }

    public final int hashCode() {
        int i = this.a;
        int iD = (i == 0 ? 0 : qt4.D(i)) * 31;
        int i2 = this.b;
        int iD2 = (iD + (i2 == 0 ? 0 : qt4.D(i2))) * 31;
        int i3 = this.c;
        int iD3 = (iD2 + (i3 == 0 ? 0 : qt4.D(i3))) * 31;
        j11 j11Var = this.d;
        return iD3 + (j11Var != null ? j11Var.hashCode() : 0);
    }

    public final String toString() {
        String str;
        String str2;
        String str3 = "null";
        int i = this.a;
        if (i == 0) {
            str = "null";
        } else {
            str = "LeftInsetConfig(persistentType=" + iic.t(i) + ")";
        }
        int i2 = this.b;
        if (i2 == 0) {
            str2 = "null";
        } else {
            str2 = "TopInsetConfig(persistentType=" + iic.t(i2) + ")";
        }
        int i3 = this.c;
        if (i3 != 0) {
            str3 = "RightInsetConfig(persistentType=" + iic.t(i3) + ")";
        }
        StringBuilder sbQ = qv1.q("InsetsConfig(leftInsetConfig=", str, ", topConfig=", str2, ", rightInsetConfig=");
        sbQ.append(str3);
        sbQ.append(", bottomConfig=");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }

    public oi8(int i, int i2, int i3, j11 j11Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j11Var;
    }
}
