package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class hq9 extends t58 {
    public int C;
    public boolean D;
    public boolean E;

    public final int getBlurOffset() {
        return Math.abs(this.C);
    }

    public final boolean getIgnoreCropCriteria() {
        return this.E;
    }

    public final boolean getUseMaxDimensionsOnMeasure() {
        return this.D;
    }

    @Override // defpackage.t58, defpackage.fu5, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
        } else {
            float f2 = getImageAttach().c / getImageAttach().d;
            this.C = 0;
            if (f2 == 1.0f) {
                if (this.D || getImageAttach().c > 291) {
                    setMeasuredDimension(size, size);
                } else if (getImageAttach().c > 140) {
                    setMeasuredDimension(gm0.K(yl5.d().getDisplayMetrics().density * 256.0f), gm0.K(256.0f * yl5.d().getDisplayMetrics().density));
                } else {
                    setMeasuredDimension(gm0.K(yl5.d().getDisplayMetrics().density * 140.0f), gm0.K(140.0f * yl5.d().getDisplayMetrics().density));
                }
            } else if (f2 < 1.0f) {
                if (f2 < 0.42857143f) {
                    int iK = gm0.K(165.0f * yl5.d().getDisplayMetrics().density);
                    int iK2 = (int) (gm0.K(yl5.d().getDisplayMetrics().density * 384.0f) * f2);
                    if (this.E || iK - iK2 > iK * 0.25f) {
                        this.C = (iK - iK2) / 2;
                        setMeasuredDimension(iK2, gm0.K(384.0f * yl5.d().getDisplayMetrics().density));
                    } else {
                        setMeasuredDimension(iK, gm0.K(384.0f * yl5.d().getDisplayMetrics().density));
                    }
                } else if (this.D || getImageAttach().c > 291) {
                    int iK3 = (int) (gm0.K(yl5.d().getDisplayMetrics().density * 384.0f) * f2);
                    f = iK3 > size ? size / iK3 : 1.0f;
                    setMeasuredDimension((int) (iK3 * f), (int) (f * gm0.K(384.0f * yl5.d().getDisplayMetrics().density)));
                } else if (getImageAttach().c > 120) {
                    int iK4 = (int) (gm0.K(yl5.d().getDisplayMetrics().density * 345.0f) * f2);
                    f = iK4 > size ? size / iK4 : 1.0f;
                    setMeasuredDimension((int) (iK4 * f), (int) (f * gm0.K(345.0f * yl5.d().getDisplayMetrics().density)));
                } else {
                    setMeasuredDimension((int) (gm0.K(yl5.d().getDisplayMetrics().density * 280.0f) * f2), gm0.K(280.0f * yl5.d().getDisplayMetrics().density));
                }
            } else if (f2 <= 1.0f) {
                setMeasuredDimension(size, size2);
            } else if (f2 > 2.3333333f) {
                int iK5 = gm0.K(72.0f * yl5.d().getDisplayMetrics().density);
                int i3 = (int) (size / f2);
                int i4 = iK5 - i3;
                if (i4 > iK5 * 0.25f) {
                    this.C = (i4 * (-1)) / 2;
                    setMeasuredDimension(size, i3);
                } else {
                    setMeasuredDimension(size, iK5);
                }
            } else if (this.D || getImageAttach().c > 291) {
                setMeasuredDimension(size, (int) (size / f2));
            } else if (getImageAttach().c > 212) {
                setMeasuredDimension(gm0.K(yl5.d().getDisplayMetrics().density * 256.0f), (int) (gm0.K(256.0f * yl5.d().getDisplayMetrics().density) / f2));
            } else {
                setMeasuredDimension(gm0.K(yl5.d().getDisplayMetrics().density * 212.0f), (int) (gm0.K(212.0f * yl5.d().getDisplayMetrics().density) / f2));
            }
        }
        setMeasuredLayoutWidth(size);
        setMeasuredLayoutHeight(size2);
    }

    public final boolean s() {
        return this.C < 0;
    }

    public final void setIgnoreCropCriteria(boolean z) {
        this.E = z;
    }

    public final void setUseMaxDimensionsOnMeasure(boolean z) {
        this.D = z;
    }
}
