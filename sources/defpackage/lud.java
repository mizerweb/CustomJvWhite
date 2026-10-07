package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lud extends qud {
    public final tnh a;
    public final Integer b;
    public final ynh c;

    public lud(tnh tnhVar, ynh ynhVar, Integer num) {
        this.a = tnhVar;
        this.b = num;
        this.c = ynhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lud)) {
            return false;
        }
        lud ludVar = (lud) obj;
        return this.a.equals(ludVar.a) && cqk.d(this.b, ludVar.b) && cqk.d(this.c, ludVar.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a.c) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        ynh ynhVar = this.c;
        return iHashCode2 + (ynhVar != null ? ynhVar.hashCode() : 0);
    }

    public final String toString() {
        return "ShowInfoSnackbar(title=" + this.a + ", iconRes=" + this.b + ", description=" + this.c + ")";
    }
}
