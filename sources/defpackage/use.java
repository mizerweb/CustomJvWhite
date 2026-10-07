package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class use {
    public final yt1 a;
    public final String b;
    public final dnf c;

    public use(yt1 yt1Var, String str, dnf dnfVar) {
        this.a = yt1Var;
        this.b = str;
        this.c = dnfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof use)) {
            return false;
        }
        use useVar = (use) obj;
        return this.a.equals(useVar.a) && cqk.d(this.b, useVar.b) && this.c.equals(useVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "RoomSignalingUrlSharingInfo(initiator=" + this.a + ", url=" + this.b + ", roomId=" + this.c + ")";
    }
}
