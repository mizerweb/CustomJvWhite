package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mcc {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final zxb e;
    public final Integer f;

    public mcc(int i, int i2, int i3, boolean z, Integer num, int i4) {
        z = (i4 & 8) != 0 ? false : z;
        num = (i4 & 32) != 0 ? null : num;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = zxb.GHOST;
        this.f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcc)) {
            return false;
        }
        mcc mccVar = (mcc) obj;
        return this.a == mccVar.a && this.b == mccVar.b && this.c == mccVar.c && this.d == mccVar.d && this.e == mccVar.e && cqk.d(this.f, mccVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + nbh.n(zo5.c(this.c, zo5.c(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d)) * 31;
        Integer num = this.f;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("MenuItem(id=", this.a, ", titleRes=", this.b, ", iconRes=");
        sbP.append(this.c);
        sbP.append(", isDisabled=");
        sbP.append(this.d);
        sbP.append(", optionalAppearance=");
        sbP.append(this.e);
        sbP.append(", iconColorAttr=");
        sbP.append(this.f);
        sbP.append(")");
        return sbP.toString();
    }
}
