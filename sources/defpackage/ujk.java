package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ujk {
    public final Long a;
    public final String b;

    public ujk(String str, Long l) {
        this.a = l;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujk)) {
            return false;
        }
        ujk ujkVar = (ujk) obj;
        return cqk.d(this.a, ujkVar.a) && cqk.d(this.b, ujkVar.b);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PeerInfo(peerId=" + this.a + ", conversationId=" + this.b + ")";
    }
}
