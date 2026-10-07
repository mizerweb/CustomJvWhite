package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d12 {
    public final dnf a;
    public final xmf b;

    public d12(dnf dnfVar, xmf xmfVar) {
        this.a = dnfVar;
        this.b = xmfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d12)) {
            return false;
        }
        d12 d12Var = (d12) obj;
        return this.a.equals(d12Var.a) && cqk.d(this.b, d12Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xmf xmfVar = this.b;
        return iHashCode + (xmfVar == null ? 0 : xmfVar.hashCode());
    }

    public final String toString() {
        return "ActiveRoomChangedParams(roomId=" + this.a + ", room=" + this.b + ")";
    }
}
