package defpackage;

import android.opengl.Matrix;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pwe {
    public static final float[][] a = {new float[]{1.0f, 0.0f, 0.0f, 1.0f}, new float[]{-1.0f, 0.0f, 0.0f, 1.0f}, new float[]{0.0f, 1.0f, 0.0f, 1.0f}, new float[]{0.0f, -1.0f, 0.0f, 1.0f}, new float[]{0.0f, 0.0f, 1.0f, 1.0f}, new float[]{0.0f, 0.0f, -1.0f, 1.0f}};

    public static final p29 a(t51 t51Var, xhh xhhVar) {
        return new p29(t51Var, xhhVar);
    }

    public static int b(int i, boolean z) {
        return nbh.n(i, 31, z);
    }

    public static float[] c(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        lvb.O("Expecting 4 plane parameters", fArr2.length == 4);
        float f = fArr[0];
        float f2 = fArr3[0];
        float f3 = fArr2[0];
        float f4 = fArr[1];
        float f5 = fArr3[1];
        float f6 = fArr2[1];
        float f7 = fArr[2];
        float f8 = fArr3[2];
        float f9 = fArr2[2];
        float f10 = ((f7 - f8) * f9) + ((f4 - f5) * f6) + ((f - f2) * f3);
        float f11 = fArr4[0] - f2;
        float f12 = fArr4[1] - f5;
        float f13 = fArr4[2] - f8;
        float f14 = f10 / ((f9 * f13) + ((f6 * f12) + (f3 * f11)));
        return new float[]{(f11 * f14) + f2, (f12 * f14) + f5, (f13 * f14) + f8, 1.0f};
    }

    public static lag d(int i, int i2, List list) {
        lvb.O("inputWidth must be positive", i > 0);
        lvb.O("inputHeight must be positive", i2 > 0);
        lag lagVar = new lag(i, i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            lagVar = ((po9) list.get(i3)).d(lagVar.a, lagVar.b);
        }
        return lagVar;
    }

    public static boolean e(float[] fArr, float[] fArr2) {
        lvb.O("Expecting 4 plane parameters", fArr2.length == 4);
        return (fArr2[2] * fArr[2]) + ((fArr2[1] * fArr[1]) + (fArr2[0] * fArr[0])) <= fArr2[3];
    }

    public static ghe f(float[] fArr, c98 c98Var) {
        oc9.p(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i = 0;
        int i2 = 0;
        while (i < c98Var.size()) {
            float[] fArr2 = new float[4];
            float[] fArr3 = fArr;
            Matrix.multiplyMV(fArr2, 0, fArr3, 0, (float[]) c98Var.get(i), 0);
            float f = fArr2[0];
            float f2 = fArr2[3];
            fArr2[0] = f / f2;
            fArr2[1] = fArr2[1] / f2;
            fArr2[2] = fArr2[2] / f2;
            fArr2[3] = 1.0f;
            int i3 = i2 + 1;
            int iB = r88.b(objArrCopyOf.length, i3);
            if (iB > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
            }
            objArrCopyOf[i2] = fArr2;
            i++;
            i2 = i3;
            fArr = fArr3;
        }
        return c98.j(objArrCopyOf, i2);
    }
}
