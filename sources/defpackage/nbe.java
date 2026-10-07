package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nbe implements pbe {
    public final ynh a;
    public final Integer b;

    public nbe(ynh ynhVar, Integer num) {
        this.a = ynhVar;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbe)) {
            return false;
        }
        nbe nbeVar = (nbe) obj;
        return this.a.equals(nbeVar.a) && cqk.d(this.b, nbeVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ShowSnackbar(textSource=" + this.a + ", iconRes=" + this.b + ")";
    }
}
