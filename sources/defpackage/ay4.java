package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ay4 extends uf5 {
    public final Matrix A;
    public float B;
    public boolean C;
    public boolean D;
    public mx4 E;
    public final Integer[] F;
    public final float[] G;
    public final float[] H;
    public final qx6[] I;
    public final float[] J;
    public final int n;
    public final RectF o;
    public final RectF p;
    public final Matrix q;
    public final Matrix r;
    public final float[] s;
    public final float[] t;
    public final float[] u;
    public final Matrix v;
    public float w;
    public float x;
    public ValueAnimator y;
    public boolean z;

    public ay4(h6f h6fVar, int i) {
        super(h6fVar);
        this.n = i;
        this.o = new RectF();
        this.p = new RectF();
        this.q = new Matrix();
        this.r = new Matrix();
        this.s = new float[2];
        this.t = new float[9];
        this.u = new float[9];
        this.v = new Matrix();
        this.A = new Matrix();
        this.F = new Integer[]{0, 2, 4, 6};
        this.G = new float[8];
        this.H = new float[8];
        qx6[] qx6VarArr = new qx6[8];
        for (int i2 = 0; i2 < 8; i2++) {
            qx6VarArr[i2] = new qx6(qx6.a(0.0f, 0.0f));
        }
        this.I = qx6VarArr;
        this.J = new float[8];
    }

    public static float g(RectF rectF, RectF rectF2) {
        float fWidth = rectF.width();
        if (fWidth < 0.001f) {
            fWidth = 0.001f;
        }
        float fHeight = rectF.height();
        if (fHeight < 0.001f) {
            fHeight = 0.001f;
        }
        float fWidth2 = rectF2.width();
        if (fWidth2 < 0.001f) {
            fWidth2 = 0.001f;
        }
        float fHeight2 = rectF2.height();
        return Math.max(fWidth / fWidth2, fHeight / (fHeight2 >= 0.001f ? fHeight2 : 0.001f));
    }

    public static void m(ay4 ay4Var) {
        RectF rectF = ay4Var.o;
        float[] fArr = ay4Var.G;
        qx6[] qx6VarArr = ay4Var.I;
        if (ay4Var.j == null || rectF.isEmpty()) {
            return;
        }
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        float f5 = (f + f3) * 0.5f;
        float f6 = (f2 + f4) * 0.5f;
        char c = 0;
        qx6VarArr[0] = new qx6(qx6.a(f, f2));
        char c2 = 1;
        qx6VarArr[1] = new qx6(qx6.a(f3, f2));
        qx6VarArr[2] = new qx6(qx6.a(f3, f4));
        qx6VarArr[3] = new qx6(qx6.a(f, f4));
        char c3 = 4;
        qx6VarArr[4] = new qx6(qx6.a(f5, f2));
        qx6VarArr[5] = new qx6(qx6.a(f3, f6));
        qx6VarArr[6] = new qx6(qx6.a(f5, f4));
        qx6 qx6Var = new qx6(qx6.a(f, f6));
        char c4 = 7;
        qx6VarArr[7] = qx6Var;
        int i = 0;
        boolean z = false;
        while (i < 6) {
            ay4Var.i(fArr);
            long jA = qx6.a(fArr[c], fArr[c2]);
            long jA2 = qx6.a(fArr[2], fArr[3]);
            long jA3 = qx6.a(fArr[c3], fArr[5]);
            long jA4 = qx6.a(fArr[6], fArr[c4]);
            int i2 = i;
            tfe tfeVar = new tfe();
            vfe vfeVar = new vfe();
            vfeVar.a = qx6.a(0.0f, 0.0f);
            tfeVar.a = 0.0f;
            n(tfeVar, vfeVar, ay4Var, jA, jA2);
            n(tfeVar, vfeVar, ay4Var, jA2, jA3);
            n(tfeVar, vfeVar, ay4Var, jA3, jA4);
            n(tfeVar, vfeVar, ay4Var, jA4, jA);
            float f7 = tfeVar.a;
            if (f7 < -0.5d) {
                if (f7 < -128.0f) {
                    f7 = -128.0f;
                }
                ay4Var.m.postTranslate(Float.intBitsToFloat((int) (vfeVar.a >> 32)) * f7, Float.intBitsToFloat((int) (vfeVar.a & 4294967295L)) * f7);
                z = true;
            }
            i = i2 + 1;
            c3 = 4;
            c4 = 7;
            c = 0;
            c2 = 1;
        }
        if (z) {
            ay4Var.e();
        }
    }

    public static final void n(tfe tfeVar, vfe vfeVar, ay4 ay4Var, long j, long j2) {
        char c = ' ';
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float f = -(Float.intBitsToFloat((int) (j2 & 4294967295L)) - Float.intBitsToFloat(i2));
        float fSqrt = (float) Math.sqrt((fIntBitsToFloat * fIntBitsToFloat) + (f * f));
        if (fSqrt < 0.001f) {
            fSqrt = 0.001f;
        }
        long jA = qx6.a(f / fSqrt, fIntBitsToFloat / fSqrt);
        qx6[] qx6VarArr = ay4Var.I;
        int length = qx6VarArr.length;
        float f2 = Float.POSITIVE_INFINITY;
        int i3 = 0;
        while (i3 < length) {
            long j3 = qx6VarArr[i3].a;
            char c2 = c;
            qx6[] qx6VarArr2 = qx6VarArr;
            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (jA & 4294967295L)) * (Float.intBitsToFloat((int) (j3 & 4294967295L)) - Float.intBitsToFloat(i2))) + (Float.intBitsToFloat((int) (jA >> c2)) * (Float.intBitsToFloat((int) (j3 >> c)) - Float.intBitsToFloat(i)));
            if (fIntBitsToFloat2 < f2) {
                f2 = fIntBitsToFloat2;
            }
            i3++;
            qx6VarArr = qx6VarArr2;
            c = c2;
        }
        if (f2 < tfeVar.a) {
            tfeVar.a = f2;
            vfeVar.a = jA;
        }
    }

    @Override // defpackage.uf5, defpackage.u1k
    public final void a(float f, float f2) {
    }

    @Override // defpackage.uf5
    public final void b(float f, float f2) {
        RectF rectF = this.j;
        if (rectF != null && !this.o.isEmpty()) {
            float fH = h();
            if (fH > 0.0f) {
                this.g = f(rectF) * fH;
            }
        }
        float fH2 = h();
        if (fH2 <= 0.0f) {
            return;
        }
        float f3 = this.g;
        float f4 = f3 - 0.001f;
        Matrix matrix = this.m;
        if (fH2 < f4) {
            float f5 = f3 / fH2;
            matrix.postScale(f5, f5, f, f2);
            e();
        } else {
            float f6 = this.h;
            if (fH2 > f6) {
                float f7 = f6 / fH2;
                matrix.postScale(f7, f7, f, f2);
            }
        }
    }

    @Override // defpackage.uf5
    public final void c() {
        RectF rectF = this.j;
        if (rectF == null) {
            return;
        }
        RectF rectF2 = this.o;
        if (rectF2.isEmpty()) {
            return;
        }
        Matrix matrix = this.m;
        RectF rectF3 = this.p;
        matrix.mapRect(rectF3, rectF);
        boolean z = rectF3.width() <= rectF2.width() + 0.5f;
        boolean z2 = rectF3.height() <= rectF2.height() + 0.5f;
        if (z || z2) {
            float fCenterX = z ? rectF2.centerX() - rectF3.centerX() : 0.0f;
            float fCenterY = z2 ? rectF2.centerY() - rectF3.centerY() : 0.0f;
            if (fCenterX != 0.0f || fCenterY != 0.0f) {
                matrix.postTranslate(fCenterX, fCenterY);
                e();
            }
        }
        m(this);
    }

    @Override // defpackage.uf5
    public final void d() {
        super.d();
        this.w = 0.0f;
        this.D = false;
        this.C = false;
        this.A.reset();
        mx4 mx4Var = this.E;
        if (mx4Var != null) {
            ValueAnimator valueAnimator = mx4Var.J1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            mx4Var.J1 = null;
            mx4Var.I1 = 1.0f;
            tx4 tx4Var = mx4Var.P1;
            if (tx4Var != null) {
                mx4Var.H1 = tx4Var;
            }
        }
    }

    public final float f(RectF rectF) {
        RectF rectF2 = this.p;
        if (o(rectF2) && (rectF2.left < rectF.left - 1.0f || rectF2.top < rectF.top - 1.0f || rectF2.right > rectF.right + 1.0f || rectF2.bottom > rectF.bottom + 1.0f)) {
            float fG = g(rectF2, rectF);
            if (fG >= 1.0f) {
                return fG;
            }
        }
        return 1.0f;
    }

    public final float h() {
        Matrix matrix = this.m;
        float[] fArr = v3e.a;
        matrix.getValues(fArr);
        float f = fArr[0];
        matrix.getValues(fArr);
        float f2 = fArr[3];
        return (float) Math.sqrt((f2 * f2) + (f * f));
    }

    public final void i(float[] fArr) {
        float f;
        RectF rectF = this.j;
        if (rectF == null) {
            return;
        }
        float f2 = rectF.left;
        float[] fArr2 = this.H;
        fArr2[0] = f2;
        float f3 = rectF.top;
        fArr2[1] = f3;
        float f4 = rectF.right;
        fArr2[2] = f4;
        fArr2[3] = f3;
        fArr2[4] = f4;
        float f5 = rectF.bottom;
        fArr2[5] = f5;
        fArr2[6] = f2;
        fArr2[7] = f5;
        this.m.mapPoints(fArr2);
        tfe tfeVar = new tfe();
        tfe tfeVar2 = new tfe();
        int i = 0;
        while (true) {
            f = tfeVar.a;
            if (i >= 8) {
                break;
            }
            tfeVar.a = f + fArr2[i];
            tfeVar2.a += fArr2[i + 1];
            i += 2;
        }
        tfeVar.a = f * 0.25f;
        tfeVar2.a *= 0.25f;
        z70 z70Var = new z70(3, new xx4(0, tfeVar, tfeVar2, this));
        Integer[] numArr = this.F;
        if (numArr.length > 1) {
            Arrays.sort(numArr, z70Var);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            int iIntValue = numArr[i3].intValue();
            fArr[i2] = fArr2[iIntValue];
            fArr[i2 + 1] = fArr2[iIntValue + 1];
            i2 += 2;
        }
    }

    public final Float j(RectF rectF) {
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        if (fWidth <= 0.0f || fHeight <= 0.0f) {
            return null;
        }
        RectF rectF2 = this.o;
        return Float.valueOf(Math.max(rectF2.width() / fWidth, rectF2.height() / fHeight));
    }

    public final float k() {
        RectF rectF = this.o;
        return rectF.isEmpty() ? this.i.centerX() : rectF.centerX();
    }

    public final float l() {
        RectF rectF = this.o;
        return rectF.isEmpty() ? this.i.centerY() : rectF.centerY();
    }

    public final boolean o(RectF rectF) {
        Matrix matrix = this.m;
        Matrix matrix2 = this.q;
        if (!matrix.invert(matrix2)) {
            return false;
        }
        RectF rectF2 = this.o;
        float f = rectF2.left;
        float[] fArr = this.J;
        fArr[0] = f;
        float f2 = rectF2.top;
        fArr[1] = f2;
        float f3 = rectF2.right;
        fArr[2] = f3;
        fArr[3] = f2;
        fArr[4] = f3;
        float f4 = rectF2.bottom;
        fArr[5] = f4;
        fArr[6] = f;
        fArr[7] = f4;
        matrix2.mapPoints(fArr);
        float f5 = Float.NEGATIVE_INFINITY;
        float f6 = Float.POSITIVE_INFINITY;
        float f7 = Float.NEGATIVE_INFINITY;
        float f8 = Float.POSITIVE_INFINITY;
        for (int i = 0; i < fArr.length; i += 2) {
            float f9 = fArr[i];
            float f10 = fArr[i + 1];
            if (f9 < f8) {
                f8 = f9;
            }
            if (f10 < f6) {
                f6 = f10;
            }
            if (f9 > f5) {
                f5 = f9;
            }
            if (f10 > f7) {
                f7 = f10;
            }
        }
        rectF.set(f8, f6, f5, f7);
        return true;
    }

    public final void p() {
        Matrix matrix = this.l;
        Matrix matrix2 = this.m;
        matrix.set(matrix2);
        e();
        z1k z1kVar = this.b;
        if (z1kVar != null) {
            z1kVar.h(matrix2);
        }
    }

    public final void q(RectF rectF) {
        this.o.set(rectF);
    }

    public final void r(float f, float f2, float f3, float f4) {
        if (this.j == null) {
            return;
        }
        float[] fArr = this.s;
        fArr[0] = f;
        fArr[1] = f2;
        Matrix matrix = this.m;
        matrix.mapPoints(fArr);
        matrix.postTranslate(f3 - fArr[0], f4 - fArr[1]);
        c();
        p();
    }

    public final void s(int i) {
        RectF rectF = this.j;
        if (rectF == null) {
            return;
        }
        RectF rectF2 = this.o;
        if (rectF2.isEmpty() || rectF2.width() < 1.0f || rectF2.height() < 1.0f) {
            return;
        }
        Matrix matrix = this.m;
        RectF rectF3 = this.p;
        matrix.mapRect(rectF3, rectF);
        float fWidth = rectF3.width();
        if (fWidth <= 0.0f) {
            return;
        }
        float fWidth2 = ((rectF2.width() * (i / fWidth)) / this.n) - 0.05f;
        if (fWidth2 > 1.0f) {
            this.h = h() * fWidth2;
        }
    }

    public final void t(boolean z) {
        float f;
        RectF rectF = this.j;
        if (rectF == null) {
            return;
        }
        RectF rectF2 = this.o;
        if (rectF2.isEmpty()) {
            return;
        }
        float fH = h();
        if (fH <= 0.0f) {
            return;
        }
        Matrix matrix = this.m;
        if (z) {
            RectF rectF3 = this.p;
            matrix.mapRect(rectF3, rectF);
            Float fJ = j(rectF3);
            if (fJ == null) {
                return;
            } else {
                f = fJ.floatValue();
            }
        } else {
            f = f(rectF);
        }
        this.g = fH * f;
        if (z || f > 1.0f) {
            matrix.postScale(f, f, rectF2.centerX(), rectF2.centerY());
        }
        c();
        p();
    }
}
