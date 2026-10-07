package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n5e extends p5e {
    public final long a;
    public final long b;
    public final String c;
    public final oji d;

    public n5e(long j, long j2, String str, oji ojiVar) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = ojiVar;
    }

    @Override // defpackage.p5e
    public final oji a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5e)) {
            return false;
        }
        n5e n5eVar = (n5e) obj;
        return this.a == n5eVar.a && this.b == n5eVar.b && cqk.d(this.c, n5eVar.c) && this.d == n5eVar.d;
    }

    public final int hashCode() {
        int iG = qt4.g(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        oji ojiVar = this.d;
        return iHashCode + (ojiVar != null ? ojiVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "Success(messageId=", ", totalBytes=");
        qv1.s(this.b, ", attachId=", this.c, sbS);
        sbS.append(", uploadType=");
        sbS.append(this.d);
        sbS.append(")");
        return sbS.toString();
    }
}
