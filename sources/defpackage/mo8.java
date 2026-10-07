package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mo8 extends t1 {
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
    public final long n(char[] cArr, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        switch (this.b) {
            case 0:
                double dL = ti8.l(i3, i4, j, z, z2);
                if (Double.isNaN(dL)) {
                    dL = Double.parseDouble(new String(cArr, i, i2 - i));
                }
                return Double.doubleToRawLongBits(dL);
            default:
                float f = ml9.f(i3, i4, j, z, z2);
                if (Float.isNaN(f)) {
                    f = Float.parseFloat(new String(cArr, i, i2 - i));
                }
                return Float.floatToRawIntBits(f);
        }
    }

    @Override // defpackage.t1
    public final long p(char[] cArr, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        switch (this.b) {
            case 0:
                double dN = ti8.n(j, i3, i4, z, z2);
                if (Double.isNaN(dN)) {
                    dN = Double.parseDouble(new String(cArr, i, i2 - i));
                }
                return Double.doubleToRawLongBits(dN);
            default:
                float fH = ml9.h(i3, i4, j, z, z2);
                if (Float.isNaN(fH)) {
                    fH = Float.parseFloat(new String(cArr, i, i2 - i));
                }
                return Float.floatToRawIntBits(fH);
        }
    }
}
