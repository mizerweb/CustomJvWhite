package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kb1 {
    public final String a;
    public final long b;
    public final int c;
    public final long d;
    public final Long e;
    public final String f;
    public final Long g;
    public final Long h;
    public final Long i;
    public final String j;
    public final long k;

    public kb1(String str, long j, int i, long j2, Long l, String str2, Long l2, Long l3, Long l4, String str3, long j3) {
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = j2;
        this.e = l;
        this.f = str2;
        this.g = l2;
        this.h = l3;
        this.i = l4;
        this.j = str3;
        this.k = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb1)) {
            return false;
        }
        kb1 kb1Var = (kb1) obj;
        return cqk.d(this.a, kb1Var.a) && this.b == kb1Var.b && this.c == kb1Var.c && this.d == kb1Var.d && cqk.d(this.e, kb1Var.e) && cqk.d(this.f, kb1Var.f) && cqk.d(this.g, kb1Var.g) && cqk.d(this.h, kb1Var.h) && cqk.d(this.i, kb1Var.i) && cqk.d(this.j, kb1Var.j) && this.k == kb1Var.k;
    }

    public final int hashCode() {
        int iG = qt4.g(zo5.c(this.c, qt4.g(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
        Long l = this.e;
        int iHashCode = (iG + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.g;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.h;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.i;
        int iHashCode5 = (iHashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str2 = this.j;
        return Long.hashCode(this.k) + ((iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbB = nbh.B(this.b, "CallAnalyticsEntryDb(callId=", this.a, ", chatId=");
        sbB.append(", pushSource=");
        sbB.append(this.c);
        sbB.append(", receivedTime=");
        sbB.append(this.d);
        sbB.append(", pushId=");
        sbB.append(this.e);
        sbB.append(", eventKey=");
        sbB.append(this.f);
        sbB.append(", senderUserId=");
        sbB.append(this.g);
        sbB.append(", sentTime=");
        sbB.append(this.h);
        sbB.append(", fcmSentTime=");
        sbB.append(this.i);
        p.j(sbB, ", dropReason=", this.j, ", createdTime=");
        return c0a.m(this.k, ")", sbB);
    }
}
