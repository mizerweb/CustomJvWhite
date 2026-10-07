package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xh0 {
    public final int a;
    public final ff2 b;

    public xh0(int i, ff2 ff2Var) {
        this.a = i;
        if (ff2Var != null) {
            this.b = ff2Var;
        } else {
            ore.n("Null cameraIdentifier");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xh0) {
            xh0 xh0Var = (xh0) obj;
            if (this.a == xh0Var.a && this.b.equals(xh0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Key{lifecycleOwnerHash=" + this.a + ", cameraIdentifier=" + this.b + "}";
    }
}
