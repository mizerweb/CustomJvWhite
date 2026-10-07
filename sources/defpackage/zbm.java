package defpackage;

/* JADX INFO: loaded from: classes4.dex */
final class zbm extends gcm {
    private final int b;
    private final int c;
    private final float d;
    private final float e;
    private final boolean f;
    private final float g;
    private final float h;
    private final long i;
    private final long j;
    private final boolean k;
    private final float l;
    private final float m;

    public /* synthetic */ zbm(int i, int i2, float f, float f2, boolean z, float f3, float f4, long j, long j2, boolean z2, float f5, float f6, ybm ybmVar) {
        this.b = i;
        this.c = i2;
        this.d = f;
        this.e = f2;
        this.f = z;
        this.g = f3;
        this.h = f4;
        this.i = j;
        this.j = j2;
        this.k = z2;
        this.l = f5;
        this.m = f6;
    }

    @Override // defpackage.gcm
    public final float a() {
        return this.h;
    }

    @Override // defpackage.gcm
    public final float b() {
        return this.g;
    }

    @Override // defpackage.gcm
    public final float c() {
        return this.e;
    }

    @Override // defpackage.gcm
    public final float d() {
        return this.d;
    }

    @Override // defpackage.gcm
    public final float e() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gcm) {
            gcm gcmVar = (gcm) obj;
            if (this.b == gcmVar.h() && this.c == gcmVar.g() && Float.floatToIntBits(this.d) == Float.floatToIntBits(gcmVar.d()) && Float.floatToIntBits(this.e) == Float.floatToIntBits(gcmVar.c()) && this.f == gcmVar.l() && Float.floatToIntBits(this.g) == Float.floatToIntBits(gcmVar.b()) && Float.floatToIntBits(this.h) == Float.floatToIntBits(gcmVar.a()) && this.i == gcmVar.j() && this.j == gcmVar.i() && this.k == gcmVar.k() && Float.floatToIntBits(this.l) == Float.floatToIntBits(gcmVar.e()) && Float.floatToIntBits(this.m) == Float.floatToIntBits(gcmVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gcm
    public final float f() {
        return this.m;
    }

    @Override // defpackage.gcm
    public final int g() {
        return this.c;
    }

    @Override // defpackage.gcm
    public final int h() {
        return this.b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.m) ^ ((((((((((((((((((((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ Float.floatToIntBits(this.d)) * 1000003) ^ Float.floatToIntBits(this.e)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.g)) * 1000003) ^ Float.floatToIntBits(this.h)) * 1000003) ^ ((int) this.i)) * 1000003) ^ ((int) this.j)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.l)) * 1000003);
    }

    @Override // defpackage.gcm
    public final long i() {
        return this.j;
    }

    @Override // defpackage.gcm
    public final long j() {
        return this.i;
    }

    @Override // defpackage.gcm
    public final boolean k() {
        return this.k;
    }

    @Override // defpackage.gcm
    public final boolean l() {
        return this.f;
    }

    public final String toString() {
        return "AutoZoomOptions{recentFramesToCheck=" + this.b + ", recentFramesContainingPredictedArea=" + this.c + ", recentFramesIou=" + this.d + ", maxCoverage=" + this.e + ", useConfidenceScore=" + this.f + ", lowerConfidenceScore=" + this.g + ", higherConfidenceScore=" + this.h + ", zoomIntervalInMillis=" + this.i + ", resetIntervalInMillis=" + this.j + ", enableZoomThreshold=" + this.k + ", zoomInThreshold=" + this.l + ", zoomOutThreshold=" + this.m + "}";
    }
}
