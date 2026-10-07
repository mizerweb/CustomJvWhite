package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g1e {
    public final w2j a;
    public final long b;
    public final boolean c;
    public final float d;
    public final int e;
    public final f1e f;

    public g1e(w2j w2jVar, long j, boolean z, float f, int i, f1e f1eVar) {
        this.a = w2jVar;
        this.b = j;
        this.c = z;
        this.d = f;
        this.e = i;
        this.f = f1eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1e)) {
            return false;
        }
        g1e g1eVar = (g1e) obj;
        return this.a.equals(g1eVar.a) && bj8.b(this.b, g1eVar.b) && this.c == g1eVar.c && Float.compare(this.d, g1eVar.d) == 0 && this.e == g1eVar.e && this.f == g1eVar.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + zo5.c(this.e, nbh.m(nbh.n(qt4.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31), 31);
    }

    public final String toString() {
        return "NormalizedVideoParams(originalParams=" + this.a + ", size=" + b1e.a(this.b) + ", rotated=" + this.c + ", frameRate=" + this.d + ", bitrate=" + this.e + ", bitrateSource=" + this.f + ")";
    }
}
