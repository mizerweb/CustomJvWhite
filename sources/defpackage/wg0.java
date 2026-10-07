package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wg0 {
    public final ih2 a;
    public final xg0 b;

    public wg0(ih2 ih2Var, xg0 xg0Var) {
        this.a = ih2Var;
        this.b = xg0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wg0)) {
            return false;
        }
        wg0 wg0Var = (wg0) obj;
        if (!this.a.equals(wg0Var.a)) {
            return false;
        }
        xg0 xg0Var = wg0Var.b;
        xg0 xg0Var2 = this.b;
        if (xg0Var2 == null) {
            return xg0Var == null;
        }
        return xg0Var2.equals(xg0Var);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        xg0 xg0Var = this.b;
        return (xg0Var == null ? 0 : xg0Var.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return "CameraState{type=" + this.a + ", error=" + this.b + "}";
    }
}
