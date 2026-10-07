package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ncb {
    public final ocb a;
    public final ocb b;

    public ncb(ocb ocbVar, ocb ocbVar2) {
        this.a = ocbVar;
        this.b = ocbVar2;
    }

    public final ocb a() {
        return this.a;
    }

    public final ocb b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncb)) {
            return false;
        }
        ncb ncbVar = (ncb) obj;
        return this.a.equals(ncbVar.a) && this.b.equals(ncbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PerTypeNetworkPair(mobile=" + this.a + ", wifi=" + this.b + ")";
    }
}
