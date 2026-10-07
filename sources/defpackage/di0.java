package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class di0 extends tcb {
    public final scb a;
    public final rcb b;

    public di0(scb scbVar, rcb rcbVar) {
        this.a = scbVar;
        this.b = rcbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tcb) {
            tcb tcbVar = (tcb) obj;
            scb scbVar = this.a;
            if (scbVar != null ? scbVar.equals(((di0) tcbVar).a) : ((di0) tcbVar).a == null) {
                rcb rcbVar = this.b;
                if (rcbVar != null ? rcbVar.equals(((di0) tcbVar).b) : ((di0) tcbVar).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        scb scbVar = this.a;
        int iHashCode = ((scbVar == null ? 0 : scbVar.hashCode()) ^ 1000003) * 1000003;
        rcb rcbVar = this.b;
        return iHashCode ^ (rcbVar != null ? rcbVar.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
