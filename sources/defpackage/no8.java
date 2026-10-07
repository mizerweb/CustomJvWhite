package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class no8 extends t1 {
    public final /* synthetic */ int b;

    @Override // defpackage.t1
    public final long f() {
        switch (this.b) {
            case 0:
                return Double.doubleToRawLongBits(Double.NaN);
            default:
                return Float.floatToRawIntBits(Float.NaN);
        }
    }

    @Override // defpackage.t1
    public final long g() {
        switch (this.b) {
            case 0:
                return Double.doubleToRawLongBits(Double.NEGATIVE_INFINITY);
            default:
                return Float.floatToRawIntBits(Float.NEGATIVE_INFINITY);
        }
    }

    @Override // defpackage.t1
    public final long j() {
        switch (this.b) {
            case 0:
                return Double.doubleToRawLongBits(Double.POSITIVE_INFINITY);
            default:
                return Float.floatToRawIntBits(Float.POSITIVE_INFINITY);
        }
    }

    @Override // defpackage.t1
    public final long m(CharSequence charSequence, int i, boolean z, long j, int i2, boolean z2, int i3) {
        switch (this.b) {
            case 0:
                double dL = ti8.l(i2, i3, j, z, z2);
                if (Double.isNaN(dL)) {
                    dL = Double.parseDouble(charSequence.subSequence(0, i).toString());
                }
                return Double.doubleToRawLongBits(dL);
            default:
                float f = ml9.f(i2, i3, j, z, z2);
                if (Float.isNaN(f)) {
                    f = Float.parseFloat(charSequence.subSequence(0, i).toString());
                }
                return Float.floatToRawIntBits(f);
        }
    }

    @Override // defpackage.t1
    public final long o(CharSequence charSequence, int i, boolean z, long j, int i2, boolean z2, int i3) {
        switch (this.b) {
            case 0:
                double dN = ti8.n(j, i2, i3, z, z2);
                if (Double.isNaN(dN)) {
                    dN = Double.parseDouble(charSequence.subSequence(0, i).toString());
                }
                return Double.doubleToRawLongBits(dN);
            default:
                float fH = ml9.h(i2, i3, j, z, z2);
                if (Float.isNaN(fH)) {
                    fH = Float.parseFloat(charSequence.subSequence(0, i).toString());
                }
                return Float.floatToRawIntBits(fH);
        }
    }
}
