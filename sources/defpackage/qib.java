package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qib extends kih {
    public final long c;
    public final long d;
    public final long e;
    public final String f;

    public qib(long j, long j2, long j3, String str) {
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qib)) {
            return false;
        }
        qib qibVar = (qib) obj;
        return this.c == qibVar.c && this.d == qibVar.d && this.e == qibVar.e && cqk.d(this.f, qibVar.f);
    }

    public final int hashCode() {
        int iG = qt4.g(qt4.g(Long.hashCode(this.c) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        return iG + (str == null ? 0 : str.hashCode());
    }

    @Override // defpackage.sq0
    public final String toString() {
        StringBuilder sbS = qt4.s(this.c, "Response(audioId=", ", videoId=");
        sbS.append(this.d);
        qt4.z(this.e, ", fileId=", ", error=", sbS);
        return zo5.w(sbS, this.f, ")");
    }
}
