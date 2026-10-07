package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mcb {
    public final ncb a;
    public final ncb b;

    public mcb(ncb ncbVar, ncb ncbVar2) {
        this.a = ncbVar;
        this.b = ncbVar2;
    }

    public final ncb a() {
        return this.a;
    }

    public final ncb b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcb)) {
            return false;
        }
        mcb mcbVar = (mcb) obj;
        return cqk.d(this.a, mcbVar.a) && cqk.d(this.b, mcbVar.b);
    }

    public final int hashCode() {
        ncb ncbVar = this.a;
        int iHashCode = (ncbVar == null ? 0 : ncbVar.hashCode()) * 31;
        ncb ncbVar2 = this.b;
        return iHashCode + (ncbVar2 != null ? ncbVar2.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkSnapshot(healthStats=" + this.a + ", trafficStats=" + this.b + ")";
    }
}
