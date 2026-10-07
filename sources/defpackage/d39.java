package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d39 extends e39 {
    public final tnh a;
    public final Integer b;
    public final ynh c;

    public d39(tnh tnhVar, Integer num, tnh tnhVar2, int i) {
        num = (i & 2) != 0 ? null : num;
        tnhVar2 = (i & 4) != 0 ? null : tnhVar2;
        this.a = tnhVar;
        this.b = num;
        this.c = tnhVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d39)) {
            return false;
        }
        d39 d39Var = (d39) obj;
        return this.a.equals(d39Var.a) && cqk.d(this.b, d39Var.b) && cqk.d(this.c, d39Var.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a.c) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        ynh ynhVar = this.c;
        return iHashCode2 + (ynhVar != null ? ynhVar.hashCode() : 0);
    }

    public final String toString() {
        return "ShowSnackbar(text=" + this.a + ", icon=" + this.b + ", description=" + this.c + ")";
    }
}
