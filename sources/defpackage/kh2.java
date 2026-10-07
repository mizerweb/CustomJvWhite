package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kh2 {
    public final of2 a;
    public final xg0 b;

    public kh2(of2 of2Var, xg0 xg0Var) {
        this.a = of2Var;
        this.b = xg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh2)) {
            return false;
        }
        kh2 kh2Var = (kh2) obj;
        return this.a == kh2Var.a && cqk.d(this.b, kh2Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xg0 xg0Var = this.b;
        return iHashCode + (xg0Var == null ? 0 : xg0Var.hashCode());
    }

    public final String toString() {
        return "CombinedCameraState(state=" + this.a + ", error=" + this.b + ')';
    }
}
