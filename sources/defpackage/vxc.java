package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vxc implements xxc {
    public final ynh a;
    public final Integer b;

    public vxc(ynh ynhVar, Integer num) {
        this.a = ynhVar;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxc)) {
            return false;
        }
        vxc vxcVar = (vxc) obj;
        return this.a.equals(vxcVar.a) && cqk.d(this.b, vxcVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ShowSnackbar(message=" + this.a + ", icon=" + this.b + ")";
    }
}
