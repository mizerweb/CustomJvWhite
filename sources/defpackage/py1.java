package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class py1 extends ry1 {
    public final xx1 F;
    public final ynh G;
    public final ynh H;
    public final Integer I;

    public /* synthetic */ py1(int i, ynh ynhVar, Integer num) {
        this(xx1.a, ynhVar, null, (i & 8) != 0 ? null : num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof py1)) {
            return false;
        }
        py1 py1Var = (py1) obj;
        return this.F == py1Var.F && cqk.d(this.G, py1Var.G) && cqk.d(this.H, py1Var.H) && cqk.d(this.I, py1Var.I);
    }

    public final int hashCode() {
        int iH = bc1.h(this.F.hashCode() * 31, 31, this.G);
        ynh ynhVar = this.H;
        int iHashCode = (iH + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31;
        Integer num = this.I;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ShowSnackbar(priority=" + this.F + ", title=" + this.G + ", caption=" + this.H + ", icon=" + this.I + ")";
    }

    public py1(xx1 xx1Var, ynh ynhVar, tnh tnhVar, Integer num) {
        this.F = xx1Var;
        this.G = ynhVar;
        this.H = tnhVar;
        this.I = num;
    }
}
