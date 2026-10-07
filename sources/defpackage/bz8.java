package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bz8 implements dz8 {
    public final int a;
    public final int b;
    public final int c;

    public bz8(int i, int i2, int i3) {
        i2 = (i3 & 2) != 0 ? 0 : i2;
        int i4 = (i3 & 4) != 0 ? 1 : 2;
        this.a = i;
        this.b = i2;
        this.c = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz8)) {
            return false;
        }
        bz8 bz8Var = (bz8) obj;
        return this.a == bz8Var.a && this.b == bz8Var.b && this.c == bz8Var.c;
    }

    public final int hashCode() {
        return qt4.D(this.c) + zo5.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sbP = qv1.p("Icon(res=", this.a, ", tintColor=", this.b, ", scaleType=");
        int i = this.c;
        if (i != 1) {
            str = i != 2 ? "null" : "CENTER_INSIDE";
        } else {
            str = "DEFAULT";
        }
        sbP.append(str);
        sbP.append(")");
        return sbP.toString();
    }
}
