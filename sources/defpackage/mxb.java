package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mxb {
    public final rxb a;
    public final int b;
    public final Integer c;
    public final ynh d;
    public final Integer e;

    public mxb(rxb rxbVar, ynh ynhVar, Integer num, int i) {
        int i2 = rxbVar.c;
        Integer num2 = rxbVar.a;
        ynhVar = (i & 8) != 0 ? null : ynhVar;
        num = (i & 16) != 0 ? null : num;
        this.a = rxbVar;
        this.b = i2;
        this.c = num2;
        this.d = ynhVar;
        this.e = num;
    }

    public final rxb a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxb)) {
            return false;
        }
        mxb mxbVar = (mxb) obj;
        return this.a.equals(mxbVar.a) && this.b == mxbVar.b && cqk.d(this.c, mxbVar.c) && cqk.d(this.d, mxbVar.d) && cqk.d(this.e, mxbVar.e);
    }

    public final int hashCode() {
        int iC = zo5.c(this.b, this.a.hashCode() * 31, 31);
        Integer num = this.c;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        ynh ynhVar = this.d;
        int iHashCode2 = (iHashCode + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31;
        Integer num2 = this.e;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "ActionItem(item=" + this.a + ", actionId=" + this.b + ", popupTitleRes=" + this.c + ", popupTitle=" + this.d + ", iconTint=" + this.e + ")";
    }
}
