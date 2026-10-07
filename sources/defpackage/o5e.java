package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o5e extends p5e {
    public final long a;
    public final long b;
    public final float c;
    public final String d;
    public final oji e;

    public o5e(long j, long j2, float f, String str, oji ojiVar) {
        this.a = j;
        this.b = j2;
        this.c = f;
        this.d = str;
        this.e = ojiVar;
    }

    @Override // defpackage.p5e
    public final oji a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5e)) {
            return false;
        }
        o5e o5eVar = (o5e) obj;
        return this.a == o5eVar.a && this.b == o5eVar.b && Float.compare(this.c, o5eVar.c) == 0 && cqk.d(this.d, o5eVar.d) && this.e == o5eVar.e;
    }

    public final int hashCode() {
        int iM = nbh.m(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), this.c, 31);
        String str = this.d;
        int iHashCode = (iM + (str == null ? 0 : str.hashCode())) * 31;
        oji ojiVar = this.e;
        return iHashCode + (ojiVar != null ? ojiVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "Uploading(messageId=", ", totalBytes=");
        sbS.append(this.b);
        sbS.append(", progress=");
        sbS.append(this.c);
        sbS.append(", attachId=");
        sbS.append(this.d);
        sbS.append(", uploadType=");
        sbS.append(this.e);
        sbS.append(")");
        return sbS.toString();
    }
}
