package defpackage;

import android.graphics.Matrix;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public abstract class as8 {
    public static final b50 a;

    static {
        b50 b50Var = new b50(4);
        Collections.addAll(b50Var, 2, 7, 4, 5);
        a = b50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int a(p76 p76Var, iue iueVar) {
        p76Var.Y();
        Integer numValueOf = Integer.valueOf(p76Var.d);
        b50 b50Var = a;
        int iIndexOf = b50Var.indexOf(numValueOf);
        int i = 0;
        if (iIndexOf < 0) {
            ore.p("Only accepts inverted exif orientations");
            return 0;
        }
        int i2 = iueVar.a;
        if (i2 != -1) {
            if (i2 == -1) {
                ore.k("Rotation is set to use EXIF");
                return 0;
            }
            i = i2;
        }
        return ((Number) b50Var.get(((i / 90) + iIndexOf) % b50Var.size())).intValue();
    }

    public static final int b(p76 p76Var, iue iueVar) {
        int i;
        int i2 = iueVar.a;
        if (i2 != -2) {
            p76Var.Y();
            int i3 = p76Var.c;
            if (i3 == 90 || i3 == 180 || i3 == 270) {
                p76Var.Y();
                i = p76Var.c;
            } else {
                i = 0;
            }
            if (i2 == -1) {
                return i;
            }
            if (i2 != -1) {
                return (i2 + i) % 360;
            }
            ore.k("Rotation is set to use EXIF");
        }
        return 0;
    }

    public static final int c(iue iueVar, bne bneVar, p76 p76Var, boolean z) {
        int i;
        int i2;
        if (z && bneVar != null) {
            int iB = b(p76Var, iueVar);
            p76Var.Y();
            int iA = a.contains(Integer.valueOf(p76Var.d)) ? a(p76Var, iueVar) : 0;
            boolean z2 = iB == 90 || iB == 270 || iA == 5 || iA == 7;
            if (z2) {
                p76Var.Y();
                i = p76Var.f;
            } else {
                p76Var.Y();
                i = p76Var.e;
            }
            if (z2) {
                p76Var.Y();
                i2 = p76Var.e;
            } else {
                p76Var.Y();
                i2 = p76Var.f;
            }
            float f = i;
            float f2 = i2;
            float fMax = Math.max(bneVar.a / f, bneVar.b / f2);
            float f3 = f * fMax;
            float f4 = bneVar.c;
            if (f3 > f4) {
                fMax = f4 / f;
            }
            if (f2 * fMax > f4) {
                fMax = f4 / f2;
            }
            int i3 = (int) ((fMax * 8.0f) + 0.6666667f);
            if (i3 <= 8) {
                if (i3 < 1) {
                    return 1;
                }
                return i3;
            }
        }
        return 8;
    }

    public static final Matrix d(p76 p76Var, iue iueVar) {
        p76Var.Y();
        if (!a.contains(Integer.valueOf(p76Var.d))) {
            int iB = b(p76Var, iueVar);
            if (iB == 0) {
                return null;
            }
            Matrix matrix = new Matrix();
            matrix.setRotate(iB);
            return matrix;
        }
        int iA = a(p76Var, iueVar);
        Matrix matrix2 = new Matrix();
        if (iA == 2) {
            matrix2.setScale(-1.0f, 1.0f);
            return matrix2;
        }
        if (iA == 7) {
            matrix2.setRotate(-90.0f);
            matrix2.postScale(-1.0f, 1.0f);
            return matrix2;
        }
        if (iA == 4) {
            matrix2.setRotate(180.0f);
            matrix2.postScale(-1.0f, 1.0f);
            return matrix2;
        }
        if (iA != 5) {
            return null;
        }
        matrix2.setRotate(90.0f);
        matrix2.postScale(-1.0f, 1.0f);
        return matrix2;
    }
}
