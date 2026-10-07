package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k5e extends p5e {
    public final long a;
    public final long b;
    public final float c;
    public final long d;
    public final Long e;
    public final Long f;
    public final String g;
    public final oji h;

    public k5e(long j, long j2, float f, long j3, Long l, Long l2, String str, oji ojiVar) {
        this.a = j;
        this.b = j2;
        this.c = f;
        this.d = j3;
        this.e = l;
        this.f = l2;
        this.g = str;
        this.h = ojiVar;
    }

    @Override // defpackage.p5e
    public final oji a() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5e)) {
            return false;
        }
        k5e k5eVar = (k5e) obj;
        return this.a == k5eVar.a && this.b == k5eVar.b && Float.compare(this.c, k5eVar.c) == 0 && this.d == k5eVar.d && cqk.d(this.e, k5eVar.e) && cqk.d(this.f, k5eVar.f) && cqk.d(this.g, k5eVar.g) && this.h == k5eVar.h;
    }

    public final int hashCode() {
        int iG = qt4.g(nbh.m(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), this.c, 31), 31, this.d);
        Long l = this.e;
        int iHashCode = (iG + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.g;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        oji ojiVar = this.h;
        return iHashCode3 + (ojiVar != null ? ojiVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "Downloading(messageId=", ", totalBytes=");
        sbS.append(this.b);
        sbS.append(", progress=");
        sbS.append(this.c);
        qt4.z(this.d, ", bytesDownloaded=", ", fileId=", sbS);
        sbS.append(this.e);
        sbS.append(", fileSize=");
        sbS.append(this.f);
        sbS.append(", attachId=");
        sbS.append(this.g);
        sbS.append(", uploadType=");
        sbS.append(this.h);
        sbS.append(")");
        return sbS.toString();
    }
}
