package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vzh {
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;

    public vzh(int i, int i2, int i3, long j, long j2, long j3, String str) {
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
        if (!(obj instanceof vzh)) {
            return false;
        }
        vzh vzhVar = (vzh) obj;
        return this.a == vzhVar.a && this.b == vzhVar.b && this.c == vzhVar.c && this.d == vzhVar.d && this.e == vzhVar.e && this.f == vzhVar.f && this.g.equals(vzhVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + qt4.g(qt4.g(qt4.g(zo5.c(this.c, zo5.c(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("TranscodeOutput(outputWidth=", this.a, ", outputHeight=", this.b, ", outputBitrate=");
        c0a.v(sbP, this.c, ", outputFileSize=", this.d);
        qt4.z(this.e, ", inputDurationMs=", ", outputDurationMs=", sbP);
        qv1.s(this.f, ", encoderName=", this.g, sbP);
        sbP.append(")");
        return sbP.toString();
    }
}
