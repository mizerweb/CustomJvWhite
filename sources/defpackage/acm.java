package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class acm extends hcm {
    private final float a;
    private final float b;
    private final float c;
    private final float d;

    public acm(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.hcm
    public final float a() {
        return 0.0f;
    }

    @Override // defpackage.hcm
    public final float b() {
        return this.c;
    }

    @Override // defpackage.hcm
    public final float c() {
        return this.a;
    }

    @Override // defpackage.hcm
    public final float d() {
        return this.d;
    }

    @Override // defpackage.hcm
    public final float e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hcm) {
            hcm hcmVar = (hcm) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(hcmVar.c()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(hcmVar.e()) && Float.floatToIntBits(this.c) == Float.floatToIntBits(hcmVar.b()) && Float.floatToIntBits(this.d) == Float.floatToIntBits(hcmVar.d())) {
                int iFloatToIntBits = Float.floatToIntBits(0.0f);
                hcmVar.a();
                if (iFloatToIntBits == Float.floatToIntBits(0.0f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = ((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c);
        return ((Float.floatToIntBits(this.d) ^ (iFloatToIntBits * 1000003)) * 1000003) ^ Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        return "PredictedArea{xMin=" + this.a + ", yMin=" + this.b + ", xMax=" + this.c + ", yMax=" + this.d + ", confidenceScore=0.0}";
    }
}
