package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xjb extends kih {
    public final long c;
    public final long d;
    public final long e;
    public final int f;

    public xjb(int i, long j, long j2, long j3) {
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjb)) {
            return false;
        }
        xjb xjbVar = (xjb) obj;
        return this.c == xjbVar.c && this.d == xjbVar.d && this.e == xjbVar.e && this.f == xjbVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + qt4.g(qt4.g(Long.hashCode(this.c) * 31, 31, this.d), 31, this.e);
    }

    @Override // defpackage.sq0
    public final String toString() {
        StringBuilder sbS = qt4.s(this.c, "Response(chatId=", ", userId=");
        sbS.append(this.d);
        qt4.z(this.e, ", mark=", ", unread=", sbS);
        return zo5.t(sbS, this.f, ")");
    }
}
