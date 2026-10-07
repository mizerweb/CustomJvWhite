package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class i1f extends cqk {
    public static final i1f l = new i1f(0);
    public static final i1f m = new i1f(1);
    public static final i1f n = new i1f(2);
    public static final i1f o = new i1f(3);
    public final /* synthetic */ int k;

    public /* synthetic */ i1f(int i) {
        this.k = i;
    }

    public final String toString() {
        switch (this.k) {
            case 0:
                return "center_crop";
            case 1:
                return "center_inside";
            case 2:
                return "fit_center";
            default:
                return "fit_xy";
        }
    }

    @Override // defpackage.cqk
    public final void v(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float fWidth;
        float f5;
        switch (this.k) {
            case 0:
                if (f4 > f3) {
                    fWidth = ((rect.width() - (i * f4)) * 0.5f) + rect.left;
                    f5 = rect.top;
                    f3 = f4;
                } else {
                    float f6 = rect.left;
                    float fHeight = ((rect.height() - (i2 * f3)) * 0.5f) + rect.top;
                    fWidth = f6;
                    f5 = fHeight;
                }
                matrix.setScale(f3, f3);
                matrix.postTranslate((int) (fWidth + 0.5f), (int) (f5 + 0.5f));
                break;
            case 1:
                float fMin = Math.min(Math.min(f3, f4), 1.0f);
                float fWidth2 = ((rect.width() - (i * fMin)) * 0.5f) + rect.left;
                float fHeight2 = ((rect.height() - (i2 * fMin)) * 0.5f) + rect.top;
                matrix.setScale(fMin, fMin);
                matrix.postTranslate((int) (fWidth2 + 0.5f), (int) (fHeight2 + 0.5f));
                break;
            case 2:
                float fMin2 = Math.min(f3, f4);
                float fWidth3 = ((rect.width() - (i * fMin2)) * 0.5f) + rect.left;
                float fHeight3 = ((rect.height() - (i2 * fMin2)) * 0.5f) + rect.top;
                matrix.setScale(fMin2, fMin2);
                matrix.postTranslate((int) (fWidth3 + 0.5f), (int) (fHeight3 + 0.5f));
                break;
            default:
                float f7 = rect.left;
                float f8 = rect.top;
                matrix.setScale(f3, f4);
                matrix.postTranslate((int) (f7 + 0.5f), (int) (f8 + 0.5f));
                break;
        }
    }
}
