package defpackage;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class h6a {
    public static final d6a Companion = new d6a();
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final g6a g;
    public final double h;
    public final boolean i;
    public final boolean j;

    public /* synthetic */ h6a(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, g6a g6aVar, double d, boolean z7, boolean z8) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z2;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z3;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z4;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z5;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z6;
        }
        if ((i & 64) == 0) {
            this.g = new g6a();
        } else {
            this.g = g6aVar;
        }
        if ((i & np0.m) == 0) {
            this.h = 0.1d;
        } else {
            this.h = d;
        }
        if ((i & np0.n) == 0) {
            this.i = false;
        } else {
            this.i = z7;
        }
        if ((i & np0.o) == 0) {
            this.j = false;
        } else {
            this.j = z8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6a)) {
            return false;
        }
        h6a h6aVar = (h6a) obj;
        return this.a == h6aVar.a && this.b == h6aVar.b && this.c == h6aVar.c && this.d == h6aVar.d && this.e == h6aVar.e && this.f == h6aVar.f && cqk.d(this.g, h6aVar.g) && Double.compare(this.h, h6aVar.h) == 0 && this.i == h6aVar.i && this.j == h6aVar.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + nbh.n((Double.hashCode(this.h) + ((this.g.hashCode() + nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31, 31, this.i);
    }

    public final String toString() {
        StringBuilder sbB = zo5.B("MediaTransformModel(isTransformWithHevcAllowed=", this.a, ", isTransformWithKeepingHdrAllowed=", this.b, ", isToneMappingViaCodecEnabled=");
        qt4.B(", isPortraitEncodingAllowed=", ", isStreamableMp4Enabled=", sbB, this.c, this.d);
        qt4.B(", isPlatformMuxerEnabled=", ", encoderConfig=", sbB, this.e, this.f);
        sbB.append(this.g);
        sbB.append(", bppf=");
        sbB.append(this.h);
        qv1.v(", isBFramesDisabled=", ", isEncoderPerformanceParametersDisabled=", sbB, this.i, this.j);
        sbB.append(")");
        return sbB.toString();
    }

    public h6a() {
        g6a g6aVar = new g6a();
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = g6aVar;
        this.h = 0.1d;
        this.i = false;
        this.j = false;
    }
}
