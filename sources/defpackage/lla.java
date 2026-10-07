package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lla {
    public final int a;
    public final ynh b;
    public final boolean c;
    public final n40 d;
    public final boolean e;
    public final Integer f;
    public final boolean g;

    public lla(int i, ynh ynhVar, boolean z, n40 n40Var, boolean z2, Integer num, boolean z3) {
        this.a = i;
        this.b = ynhVar;
        this.c = z;
        this.d = n40Var;
        this.e = z2;
        this.f = num;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lla)) {
            return false;
        }
        lla llaVar = (lla) obj;
        return this.a == llaVar.a && cqk.d(this.b, llaVar.b) && this.c == llaVar.c && cqk.d(this.d, llaVar.d) && this.e == llaVar.e && cqk.d(this.f, llaVar.f) && this.g == llaVar.g;
    }

    public final int hashCode() {
        int iN = nbh.n(bc1.h(qt4.D(this.a) * 31, 31, this.b), 31, this.c);
        n40 n40Var = this.d;
        int iN2 = nbh.n((iN + (n40Var == null ? 0 : n40Var.hashCode())) * 31, 31, this.e);
        Integer num = this.f;
        return Boolean.hashCode(this.g) + ((iN2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuoteData(type=");
        sb.append(r5a.n(this.a));
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", showVerificationMark=");
        sb.append(this.c);
        sb.append(", attachDescription=");
        sb.append(this.d);
        sb.append(", isForwardAuthorHidden=");
        sb.append(this.e);
        sb.append(", startIconResId=");
        sb.append(this.f);
        sb.append(", isAuthorVisibilityAvailable=");
        return qt4.r(sb, this.g, ")");
    }
}
