package defpackage;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class h44 {
    public static vg8 a(e0b e0bVar) {
        throw null;
    }

    public static int b(int i) {
        int i2 = 17;
        if (i != 17) {
            i2 = 35;
            if (i != 35) {
                i2 = vg8.j;
                if (i != 842094169) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public static int c(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 90) {
            return 1;
        }
        if (i == 180) {
            return 2;
        }
        if (i == 270) {
            return 3;
        }
        ore.p(zo5.h(i, "Invalid rotation: "));
        return 0;
    }

    public static void d(Point[] pointArr, Matrix matrix) {
        int length = pointArr.length;
        float[] fArr = new float[length + length];
        for (int i = 0; i < pointArr.length; i++) {
            Point point = pointArr[i];
            int i2 = i + i;
            fArr[i2] = point.x;
            fArr[i2 + 1] = point.y;
        }
        matrix.mapPoints(fArr);
        for (int i3 = 0; i3 < pointArr.length; i3++) {
            int i4 = i3 + i3;
            pointArr[i3].set((int) fArr[i4], (int) fArr[i4 + 1]);
        }
    }

    public static void e(PointF pointF, Matrix matrix) {
        float[] fArr = {pointF.x, pointF.y};
        matrix.mapPoints(fArr);
        pointF.set(fArr[0], fArr[1]);
    }

    public static void f(List<PointF> list, Matrix matrix) {
        int size = list.size();
        float[] fArr = new float[size + size];
        for (int i = 0; i < list.size(); i++) {
            int i2 = i + i;
            fArr[i2] = list.get(i).x;
            fArr[i2 + 1] = list.get(i).y;
        }
        matrix.mapPoints(fArr);
        for (int i3 = 0; i3 < list.size(); i3++) {
            int i4 = i3 + i3;
            list.get(i3).set(fArr[i4], fArr[i4 + 1]);
        }
    }

    public static void g(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    private static void h(int i, int i2, long j, int i3, int i4, int i5, int i6) {
        stl.b().a(new vtl(i, i2, SystemClock.elapsedRealtime() - j, i5, i3, i4, i6), yhl.ODML_IMAGE);
    }
}
