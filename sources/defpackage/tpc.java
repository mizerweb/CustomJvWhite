package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tpc {
    public final wyg a;
    public final u8b b;

    public tpc(wyg wygVar, u8b u8bVar) {
        this.a = wygVar;
        this.b = u8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpc)) {
            return false;
        }
        tpc tpcVar = (tpc) obj;
        return this.a.equals(tpcVar.a) && cqk.d(this.b, tpcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PeerStoriesApi(owner=" + this.a + ", stories=" + this.b + ")";
    }
}
