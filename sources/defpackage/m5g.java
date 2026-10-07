package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class m5g {
    public final long a;
    public final qde b;
    public final yt1 c;
    public final long d;
    public final String e;
    public final String f;

    public m5g(long j, qde qdeVar, yt1 yt1Var, long j2, String str, String str2) {
        this.a = j;
        this.b = qdeVar;
        this.c = yt1Var;
        this.d = j2;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5g)) {
            return false;
        }
        m5g m5gVar = (m5g) obj;
        return this.a == m5gVar.a && this.b == m5gVar.b && this.c.equals(m5gVar.c) && this.d == m5gVar.d && cqk.d(this.e, m5gVar.e) && cqk.d(this.f, m5gVar.f);
    }

    public final int hashCode() {
        int iG = qt4.g((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SignalingRecordInfo(recordMovieId=");
        sb.append(this.a);
        sb.append(", recordType=");
        sb.append(this.b);
        sb.append(", initiator=");
        sb.append(this.c);
        sb.append(", recordStartTime=");
        qv1.s(this.d, ", recordExternalMovieId=", this.e, sb);
        return qt4.q(sb, ", recordExternalOwnerId=", this.f, ")");
    }
}
