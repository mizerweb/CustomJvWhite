package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a2i implements x26 {
    public final va2 a;
    public boolean b;
    public final RectF c;
    public final Matrix d;
    public final Matrix e;
    public final float[] f;

    public a2i() {
        va2 va2Var = new va2();
        va2Var.f = 1.0f;
        this.a = va2Var;
        this.c = new RectF();
        this.d = new Matrix();
        this.e = new Matrix();
        this.f = new float[2];
    }

    public abstract long a();

    public float b() {
        return this.a.a;
    }

    public float c() {
        return this.a.b;
    }

    public float d() {
        return this.a.e;
    }

    @Override // defpackage.x26
    public final void draw(Canvas canvas) {
        float fE = e();
        Matrix matrixF = f();
        int iSave = canvas.save();
        try {
            canvas.concat(matrixF);
            l(canvas, fE);
            if (this.b) {
                m(canvas, fE);
            }
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public float e() {
        return this.a.f;
    }

    public final Matrix f() {
        float fG = g();
        float fH = h();
        float fE = e();
        float fD = d();
        float fB = b();
        float fC = c();
        Matrix matrix = this.d;
        matrix.reset();
        matrix.postTranslate(-fB, -fC);
        matrix.postScale(fE, fE);
        matrix.postRotate(fD);
        matrix.postTranslate(fG, fH);
        return matrix;
    }

    public float g() {
        return this.a.c;
    }

    public float h() {
        return this.a.d;
    }

    public boolean i(float f, float f2) {
        Matrix matrixF = f();
        Matrix matrix = this.e;
        if (!matrixF.invert(matrix)) {
            return false;
        }
        float[] fArr = this.f;
        fArr[0] = f;
        fArr[1] = f2;
        matrix.mapPoints(fArr);
        return this.c.contains(fArr[0], fArr[1]);
    }

    public boolean j(float f, float f2) {
        Matrix matrixF = f();
        Matrix matrix = this.e;
        if (!matrixF.invert(matrix)) {
            return false;
        }
        float[] fArr = this.f;
        fArr[0] = f;
        fArr[1] = f2;
        matrix.mapPoints(fArr);
        return this.c.contains(fArr[0], fArr[1]);
    }

    public boolean k() {
        return true;
    }

    public abstract void l(Canvas canvas, float f);

    public void m(Canvas canvas, float f) {
    }

    public void n(float f) {
        this.a.e = f;
    }

    public void o(float f) {
        if (f < 0.1f) {
            f = 0.1f;
        }
        this.a.f = f;
    }

    public void p(float f) {
        this.a.c = f;
    }

    public void q(float f) {
        this.a.d = f;
    }

    public final void r(RectF rectF, float f, float f2, float f3) {
        float f4 = f > 0.0f ? 1.0f / f : 1.0f;
        RectF rectF2 = this.c;
        rectF2.set(rectF);
        float f5 = -(f2 * f4);
        rectF2.inset(f5, f5);
        float f6 = f3 * f4;
        if (rectF2.width() < f6) {
            float fCenterX = rectF2.centerX();
            float f7 = f6 / 2.0f;
            rectF2.left = fCenterX - f7;
            rectF2.right = fCenterX + f7;
        }
        if (rectF2.height() < f6) {
            float fCenterY = rectF2.centerY();
            float f8 = f6 / 2.0f;
            rectF2.top = fCenterY - f8;
            rectF2.bottom = fCenterY + f8;
        }
    }
}
