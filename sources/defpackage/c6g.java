package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c6g {
    public final yt1 a;
    public final String b;

    public c6g(yt1 yt1Var, String str) {
        str.getClass();
        this.a = yt1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6g)) {
            return false;
        }
        c6g c6gVar = (c6g) obj;
        return this.a.equals(c6gVar.a) && cqk.d(this.b, c6gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SignalingUrlSharingInfo(initiator=" + this.a + ", url=" + this.b + ")";
    }
}
