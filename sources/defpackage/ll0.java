package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ll0 {
    public final le2 a;
    public final lg b;

    public ll0(le2 le2Var, lg lgVar) {
        this.a = le2Var;
        this.b = lgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll0)) {
            return false;
        }
        ll0 ll0Var = (ll0) obj;
        return cqk.d(this.a, ll0Var.a) && cqk.d(this.b, ll0Var.b);
    }

    public final int hashCode() {
        le2 le2Var = this.a;
        int iHashCode = (le2Var == null ? 0 : le2Var.hashCode()) * 31;
        lg lgVar = this.b;
        return iHashCode + (lgVar != null ? lgVar.hashCode() : 0);
    }

    public final String toString() {
        return "AwaitOpenCameraResult(cameraDeviceWrapper=" + this.a + ", androidCameraState=" + this.b + ')';
    }
}
