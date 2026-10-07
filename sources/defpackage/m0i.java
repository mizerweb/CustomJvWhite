package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class m0i {
    public final long a;
    public final byte b;
    public final sdg c;
    public final long d;
    public final long e;

    public m0i(long j, byte b, sdg sdgVar, long j2, long j3) {
        this.a = j;
        this.b = b;
        this.c = sdgVar;
        this.d = j2;
        this.e = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0i)) {
            return false;
        }
        m0i m0iVar = (m0i) obj;
        return this.a == m0iVar.a && this.b == m0iVar.b && this.c.equals(m0iVar.c) && this.d == m0iVar.d && this.e == m0iVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + qt4.g((this.c.hashCode() + ((Byte.hashCode(this.b) + (Long.hashCode(this.a) * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = c0a.q(this.b, this.a, "TranscriptionAnalyticInfo(mediaId=", ", messageType=");
        sbQ.append(", sourceType=");
        sbQ.append(this.c);
        sbQ.append(", duration=");
        sbQ.append(this.d);
        return zo5.k(this.e, ", startRequestTime=", ")", sbQ);
    }
}
