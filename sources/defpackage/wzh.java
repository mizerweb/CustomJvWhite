package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wzh {
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;

    public wzh(int i, int i2, int i3, long j, long j2, long j3, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzh)) {
            return false;
        }
        wzh wzhVar = (wzh) obj;
        return this.a == wzhVar.a && this.b == wzhVar.b && this.c == wzhVar.c && this.d == wzhVar.d && this.e == wzhVar.e && this.f == wzhVar.f && cqk.d(this.g, wzhVar.g);
    }

    public final int hashCode() {
        int iG = qt4.g(qt4.g(qt4.g(zo5.c(this.c, zo5.c(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        return iG + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("TranscodeResult(outputWidth=", this.a, ", outputHeight=", this.b, ", outputBitrate=");
        c0a.v(sbP, this.c, ", outputFileSize=", this.d);
        qt4.z(this.e, ", outputDurationMs=", ", inputDurationMs=", sbP);
        qv1.s(this.f, ", videoEncoderName=", this.g, sbP);
        sbP.append(")");
        return sbP.toString();
    }
}
