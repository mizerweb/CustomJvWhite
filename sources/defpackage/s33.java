package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s33 extends mk0 {
    public final tnh b;
    public final Integer c;
    public final ynh d;

    public s33(tnh tnhVar, ynh ynhVar, Integer num) {
        super(3);
        this.b = tnhVar;
        this.c = num;
        this.d = ynhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s33)) {
            return false;
        }
        s33 s33Var = (s33) obj;
        return cqk.d(this.b, s33Var.b) && cqk.d(this.c, s33Var.c) && cqk.d(this.d, s33Var.d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.b.c) * 31;
        Integer num = this.c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        ynh ynhVar = this.d;
        return iHashCode2 + (ynhVar != null ? ynhVar.hashCode() : 0);
    }

    public final String toString() {
        return "ShowSnackbar(text=" + this.b + ", icon=" + this.c + ", description=" + this.d + ")";
    }
}
