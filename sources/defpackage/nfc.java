package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nfc {
    public final lg a;
    public final ne2 b;

    public nfc(lg lgVar, ne2 ne2Var, int i) {
        lgVar = (i & 1) != 0 ? null : lgVar;
        ne2Var = (i & 2) != 0 ? null : ne2Var;
        this.a = lgVar;
        this.b = ne2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfc)) {
            return false;
        }
        nfc nfcVar = (nfc) obj;
        return cqk.d(this.a, nfcVar.a) && cqk.d(this.b, nfcVar.b);
    }

    public final int hashCode() {
        lg lgVar = this.a;
        int iHashCode = (lgVar == null ? 0 : lgVar.hashCode()) * 31;
        ne2 ne2Var = this.b;
        return iHashCode + (ne2Var != null ? Integer.hashCode(ne2Var.a) : 0);
    }

    public final String toString() {
        return "OpenCameraResult(cameraState=" + this.a + ", errorCode=" + this.b + ')';
    }
}
