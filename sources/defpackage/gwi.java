package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gwi {
    public static final gwi l = new gwi(-1, 1, -1, -1, 1.0f, -1, -1, -1, -1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final int f;
    public final int g;
    public final long h;
    public final int i;
    public final int j;
    public final int k;

    public gwi(int i, int i2, int i3, int i4, float f, int i5, int i6, long j, int i7, int i8, int i9) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = f;
        this.f = i5;
        this.g = i6;
        this.h = j;
        this.i = i7;
        this.j = i8;
        this.k = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwi)) {
            return false;
        }
        gwi gwiVar = (gwi) obj;
        return this.a == gwiVar.a && this.b == gwiVar.b && this.c == gwiVar.c && this.d == gwiVar.d && this.e == gwiVar.e && this.f == gwiVar.f && this.g == gwiVar.g && this.h == gwiVar.h && this.i == gwiVar.i && this.j == gwiVar.j && this.k == gwiVar.k;
    }

    public final int hashCode() {
        int iFloatToIntBits = (((((Float.floatToIntBits(this.e) + ((((((((217 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31)) * 31) + this.f) * 31) + this.g) * 31;
        long j = this.h;
        return ((((((iFloatToIntBits + ((int) (j ^ (j >>> 32)))) * 31) + this.i) * 31) + this.j) * 31) + this.k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderSettings{bitrate=");
        sb.append(this.a);
        sb.append(", bitrateMode=");
        sb.append(this.b);
        sb.append(", profile=");
        sb.append(this.c);
        sb.append(", level=");
        sb.append(this.d);
        sb.append(", iFrameIntervalSeconds=");
        sb.append(this.e);
        sb.append(", operatingRate=");
        sb.append(this.f);
        sb.append(", priority=");
        sb.append(this.g);
        sb.append(", repeatPreviousFrameIntervalUs=");
        sb.append(this.h);
        sb.append(", maxBFrames=");
        sb.append(this.i);
        sb.append(", numNonBidirectionalTemporalLayers=");
        sb.append(this.j);
        sb.append(", numBidirectionalTemporalLayers=");
        return qt4.p(sb, this.k, '}');
    }
}
