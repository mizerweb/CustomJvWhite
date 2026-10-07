package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fxd implements hxd {
    public final ne2 a;

    public fxd(ne2 ne2Var) {
        this.a = ne2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fxd) && cqk.d(this.a, ((fxd) obj).a);
    }

    public final int hashCode() {
        ne2 ne2Var = this.a;
        if (ne2Var == null) {
            return 0;
        }
        return Integer.hashCode(ne2Var.a);
    }

    public final String toString() {
        return "Error(lastCameraError=" + this.a + ')';
    }
}
