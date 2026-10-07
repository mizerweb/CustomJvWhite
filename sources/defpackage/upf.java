package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class upf extends mk0 {
    public final ynh b;
    public final Integer c;
    public final ynh d;

    public upf(tnh tnhVar, ynh ynhVar, Integer num) {
        super(16);
        this.b = ynhVar;
        this.c = num;
        this.d = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upf)) {
            return false;
        }
        upf upfVar = (upf) obj;
        return cqk.d(this.b, upfVar.b) && cqk.d(this.c, upfVar.c) && cqk.d(this.d, upfVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        Integer num = this.c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        ynh ynhVar = this.d;
        return iHashCode2 + (ynhVar != null ? ynhVar.hashCode() : 0);
    }

    public final String toString() {
        return "ShowSnackbar(message=" + this.b + ", iconRes=" + this.c + ", description=" + this.d + ")";
    }

    public /* synthetic */ upf(int i, ynh ynhVar, Integer num) {
        this((tnh) null, ynhVar, (i & 2) != 0 ? null : num);
    }
}
