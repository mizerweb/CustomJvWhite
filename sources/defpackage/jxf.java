package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public abstract class jxf {
    public static final yx0 a = new yx0(10, 2);
    public static final Matrix b = new Matrix();
    public static final Paint c;

    static {
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        c = paint;
    }

    public static final void a(Path path, double d, Rect rect) {
        if (rect == null || rect.isEmpty()) {
            path.reset();
            return;
        }
        Matrix matrix = new Matrix();
        int iMin = Math.min(rect.width(), rect.height()) / 2;
        Path pathB = (Path) a.c(new pfg(iMin, d));
        if (pathB == null) {
            pathB = b(iMin, d);
        }
        path.set(pathB);
        float f = iMin;
        matrix.setTranslate(rect.left + ((rect.width() / 2.0f) - f), rect.top + ((rect.height() / 2.0f) - f));
        path.transform(matrix);
    }

    public static final Path b(int i, double d) {
        double d2;
        double d3;
        double d4;
        Path path = new Path();
        if (i <= 0) {
            return path;
        }
        double d5 = i;
        double dPow = Math.pow(d5, d);
        float f = i;
        path.moveTo(-f, 0.0f);
        double d6 = -d5;
        double dT = d6;
        boolean z = false;
        while (true) {
            double dPow2 = dPow - Math.pow(Math.abs(dT), d);
            d2 = d5;
            d3 = 1.0d / d;
            d4 = dPow;
            double d7 = dT;
            path.lineTo((float) d7, (float) (Math.pow(Math.abs(dPow2), d3) * Math.signum(dPow2)));
            if (z) {
                break;
            }
            dT = oc9.t(d2 / 80.0d, 0.2d) + d7;
            dPow = d4;
            if (dT >= d2) {
                d5 = d2;
                dT = d5;
                z = true;
            } else {
                d5 = d2;
            }
        }
        double dT2 = d2;
        boolean z2 = false;
        while (true) {
            double dPow3 = d4 - Math.pow(Math.abs(dT2), d);
            path.lineTo((float) dT2, (float) (Math.pow(Math.abs(dPow3), d3) * (-Math.signum(dPow3))));
            if (z2) {
                path.close();
                path.offset(f, f);
                return path;
            }
            dT2 -= oc9.t(d2 / 80.0d, 0.2d);
            if (dT2 <= (-i)) {
                dT2 = d6;
                z2 = true;
            }
        }
    }
}
