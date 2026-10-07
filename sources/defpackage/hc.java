package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hc implements nc {
    public final q24 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;

    public hc(q24 q24Var, long j, long j2, long j3, long j4, int i) {
        this.a = q24Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc)) {
            return false;
        }
        hc hcVar = (hc) obj;
        return cqk.d(this.a, hcVar.a) && this.b == hcVar.b && this.c == hcVar.c && this.d == hcVar.d && this.e == hcVar.e && this.f == hcVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + qt4.g(qt4.g(qt4.g(qt4.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlockUser(commentsId=");
        sb.append(this.a);
        sb.append(", channelChatId=");
        sb.append(this.b);
        qt4.z(this.c, ", channelChatServerId=", ", authorUserId=", sb);
        sb.append(this.d);
        qt4.z(this.e, ", triggerCommentServerId=", ", cleanMsgPeriod=", sb);
        return zo5.t(sb, this.f, ")");
    }
}
