package defpackage;

import org.webrtc.IceCandidate;

/* JADX INFO: loaded from: classes3.dex */
public final class lhk {
    public final IceCandidate a;
    public final IceCandidate b;

    public lhk(IceCandidate iceCandidate, IceCandidate iceCandidate2) {
        this.a = iceCandidate;
        this.b = iceCandidate2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhk)) {
            return false;
        }
        lhk lhkVar = (lhk) obj;
        return cqk.d(this.a, lhkVar.a) && cqk.d(this.b, lhkVar.b);
    }

    public final int hashCode() {
        IceCandidate iceCandidate = this.a;
        int iHashCode = (iceCandidate == null ? 0 : iceCandidate.hashCode()) * 31;
        IceCandidate iceCandidate2 = this.b;
        return iHashCode + (iceCandidate2 != null ? iceCandidate2.hashCode() : 0);
    }

    public final String toString() {
        return "[local=" + this.a + ",remote=" + this.b + "]";
    }
}
