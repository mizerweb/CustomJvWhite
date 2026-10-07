package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class if1 extends zq0 {
    public final long b;
    public final String c;
    public final Long d;
    public final Long e;
    public final String f;
    public final String g;
    public final String h;

    public if1(long j, String str, Long l, Long l2, String str2, String str3, String str4) {
        this.b = j;
        this.c = str;
        this.d = l;
        this.e = l2;
        this.f = str2;
        this.g = str3;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if1)) {
            return false;
        }
        if1 if1Var = (if1) obj;
        return this.b == if1Var.b && cqk.d(this.c, if1Var.c) && cqk.d(this.d, if1Var.d) && cqk.d(this.e, if1Var.e) && this.f.equals(if1Var.f) && cqk.d(this.g, if1Var.g) && cqk.d(this.h, if1Var.h);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.b) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.d;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.e;
        int iD = zo5.d((iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.f);
        String str2 = this.g;
        int iHashCode4 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // defpackage.zq0
    public final String toString() {
        StringBuilder sbT = qt4.t(this.b, "CallCreateJoinLinkEvent(requestId=", ", callName=", this.c);
        sbT.append(", callerId=");
        sbT.append(this.d);
        sbT.append(", chatId=");
        sbT.append(this.e);
        nbh.G(sbT, ", conversationId=", this.f, ", joinLink=", this.g);
        return qt4.q(sbT, ", type=", this.h, ")");
    }
}
