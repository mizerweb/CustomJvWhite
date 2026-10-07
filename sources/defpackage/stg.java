package defpackage;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class stg {
    public static final rtg Companion = new rtg();
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public /* synthetic */ stg(int i, int i2, int i3, int i4, long j, int i5) {
        this.a = (i & 1) == 0 ? 60 : i2;
        if ((i & 2) == 0) {
            this.b = 3000;
        } else {
            this.b = i3;
        }
        if ((i & 4) == 0) {
            this.c = 1080;
        } else {
            this.c = i4;
        }
        if ((i & 8) == 0) {
            this.d = 60000L;
        } else {
            this.d = j;
        }
        if ((i & 16) == 0) {
            this.e = 3;
        } else {
            this.e = i5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stg)) {
            return false;
        }
        stg stgVar = (stg) obj;
        return this.a == stgVar.a && this.b == stgVar.b && this.c == stgVar.c && this.d == stgVar.d && this.e == stgVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + qt4.g(zo5.c(this.c, zo5.c(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("StoriesVideoGenerationSettings(fps=", this.a, ", bitrateKbps=", this.b, ", quality=");
        c0a.v(sbP, this.c, ", chunkDurationMs=", this.d);
        return qv1.o(sbP, ", maxChunks=", this.e, ")");
    }

    public stg(int i, int i2, int i3, long j, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = i4;
    }

    public /* synthetic */ stg() {
        this(60, 3000, 1080, 60000L, 3);
    }
}
