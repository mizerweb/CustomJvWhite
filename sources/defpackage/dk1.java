package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dk1 {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final long j;
    public final Long k;
    public final Integer l;

    public dk1(long j, String str, String str2, long j2, Long l, long j3, String str3, String str4, String str5, long j4, Long l2, Integer num) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = l;
        this.f = j3;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = j4;
        this.k = l2;
        this.l = num;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.g;
    }

    public final long d() {
        return this.d;
    }

    public final long e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk1)) {
            return false;
        }
        dk1 dk1Var = (dk1) obj;
        return this.a == dk1Var.a && cqk.d(this.b, dk1Var.b) && cqk.d(this.c, dk1Var.c) && this.d == dk1Var.d && cqk.d(this.e, dk1Var.e) && this.f == dk1Var.f && cqk.d(this.g, dk1Var.g) && cqk.d(this.h, dk1Var.h) && cqk.d(this.i, dk1Var.i) && this.j == dk1Var.j && cqk.d(this.k, dk1Var.k) && cqk.d(this.l, dk1Var.l);
    }

    public final Long f() {
        return this.k;
    }

    public final Integer g() {
        return this.l;
    }

    public final String h() {
        return this.h;
    }

    public final int hashCode() {
        int iD = zo5.d(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iG = qt4.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        Long l = this.e;
        int iD2 = zo5.d(qt4.g((iG + (l == null ? 0 : l.hashCode())) * 31, 31, this.f), 31, this.g);
        String str2 = this.h;
        int iHashCode = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int iG2 = qt4.g((iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.j);
        Long l2 = this.k;
        int iHashCode2 = (iG2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.l;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final long i() {
        return this.a;
    }

    public final String j() {
        return this.i;
    }

    public final Long k() {
        return this.e;
    }

    public final long l() {
        return this.j;
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "CallHistoryEntity(historyId=", ", callId=", this.b);
        p.j(sbT, ", callName=", this.c, ", callerId=");
        sbT.append(this.d);
        sbT.append(", messageId=");
        sbT.append(this.e);
        qt4.z(this.f, ", chatId=", ", callType=", sbT);
        nbh.G(sbT, this.g, ", hangupType=", this.h, ", joinLink=");
        sbT.append(this.i);
        sbT.append(", time=");
        sbT.append(this.j);
        sbT.append(", durationMs=");
        sbT.append(this.k);
        sbT.append(", groupCallType=");
        sbT.append(this.l);
        sbT.append(")");
        return sbT.toString();
    }
}
