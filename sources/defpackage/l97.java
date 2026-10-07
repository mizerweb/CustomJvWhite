package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l97 {
    public final ynh a;
    public final boolean b;
    public final n40 c;
    public final boolean d;

    public l97(ynh ynhVar, boolean z, n40 n40Var, boolean z2) {
        this.a = ynhVar;
        this.b = z;
        this.c = n40Var;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l97)) {
            return false;
        }
        l97 l97Var = (l97) obj;
        return cqk.d(this.a, l97Var.a) && this.b == l97Var.b && cqk.d(this.c, l97Var.c) && this.d == l97Var.d;
    }

    public final int hashCode() {
        int iN = nbh.n(this.a.hashCode() * 31, 31, this.b);
        n40 n40Var = this.c;
        return Boolean.hashCode(this.d) + ((iN + (n40Var == null ? 0 : n40Var.hashCode())) * 31);
    }

    public final String toString() {
        return "ForwardQuoteData(title=" + this.a + ", showVerificationMark=" + this.b + ", attachDescription=" + this.c + ", isAuthorVisibilityAvailable=" + this.d + ")";
    }
}
