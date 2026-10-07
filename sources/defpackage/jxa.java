package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Rational;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jxa {
    public Rational a;

    public final ixa a(float f, float f2, float f3) {
        PointF pointF;
        ihd ihdVar = (ihd) this;
        float[] fArr = {f, f2};
        synchronized (ihdVar) {
            try {
                Matrix matrix = ihdVar.d;
                if (matrix == null) {
                    pointF = ihd.e;
                } else {
                    matrix.mapPoints(fArr);
                    pointF = new PointF(fArr[0], fArr[1]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        float f4 = pointF.x;
        float f5 = pointF.y;
        Rational rational = this.a;
        ixa ixaVar = new ixa();
        ixaVar.a = f4;
        ixaVar.b = f5;
        ixaVar.c = f3;
        ixaVar.d = rational;
        return ixaVar;
    }
}
