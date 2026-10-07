package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bmd extends cmd {
    public final ynh b;
    public final ynh c;
    public final boolean d;
    public final Integer e;

    public bmd(ynh ynhVar, tnh tnhVar, boolean z, Integer num) {
        this.b = ynhVar;
        this.c = tnhVar;
        this.d = z;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmd)) {
            return false;
        }
        bmd bmdVar = (bmd) obj;
        return cqk.d(this.b, bmdVar.b) && cqk.d(this.c, bmdVar.c) && this.d == bmdVar.d && cqk.d(this.e, bmdVar.e);
    }

    public final int hashCode() {
        ynh ynhVar = this.b;
        int iHashCode = (ynhVar == null ? 0 : ynhVar.hashCode()) * 31;
        ynh ynhVar2 = this.c;
        int iN = nbh.n((iHashCode + (ynhVar2 == null ? 0 : ynhVar2.hashCode())) * 31, 31, this.d);
        Integer num = this.e;
        return iN + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ShowSnackbar(title=" + this.b + ", description=" + this.c + ", showOnTop=" + this.d + ", icon=" + this.e + ")";
    }

    public /* synthetic */ bmd(int i, ynh ynhVar, Integer num) {
        this(ynhVar, null, false, (i & 8) != 0 ? null : num);
    }
}
