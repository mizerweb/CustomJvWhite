package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a6g {
    public final boolean a;
    public final String b;
    public final Long c;
    public final long d;

    public a6g(boolean z, String str, Long l, long j) {
        this.a = z;
        this.b = str;
        this.c = l;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6g)) {
            return false;
        }
        a6g a6gVar = (a6g) obj;
        return this.a == a6gVar.a && cqk.d(this.b, a6gVar.b) && cqk.d(this.c, a6gVar.c) && this.d == a6gVar.d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        return Long.hashCode(this.d) + ((iHashCode2 + (l != null ? l.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Params(forceWebSocket=" + this.a + ", conversationId=" + this.b + ", peerId=" + this.c + ", recoverTs=" + this.d + ")";
    }
}
