package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jxd implements lxd {
    public final ne2 a;

    public jxd(ne2 ne2Var) {
        this.a = ne2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jxd) && cqk.d(this.a, ((jxd) obj).a);
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
