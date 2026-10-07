package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class z1i extends a2i {
    public final agf g;
    public final float h;
    public final float i;
    public lu5 j;
    public ju5 l;
    public Rect m;
    public final RectF k = new RectF();
    public float n = -1.0f;
    public final Matrix o = new Matrix();
    public final float[] p = new float[2];
    public final RectF q = new RectF();

    public z1i(lu5 lu5Var, Rect rect, agf agfVar, float f, float f2) {
        this.g = agfVar;
        this.h = f;
        this.i = f2;
        this.j = lu5Var;
        this.l = xr8.g(lu5Var, rect);
        this.m = new Rect(rect);
        s();
    }

    @Override // defpackage.a2i
    public final long a() {
        return this.j.a;
    }

    @Override // defpackage.a2i
    public final boolean i(float f, float f2) {
        return t(f, f2, this.i);
    }

    @Override // defpackage.a2i
    public final boolean j(float f, float f2) {
        return t(f, f2, this.i * 2.0f);
    }

    @Override // defpackage.a2i
    public final boolean k() {
        return false;
    }

    @Override // defpackage.a2i
    public final void l(Canvas canvas, float f) {
        if (f != this.n) {
            this.n = f;
            r(this.k, f, this.g.a.a, this.h);
        }
        this.l.draw(canvas);
    }

    @Override // defpackage.a2i
    public final void m(Canvas canvas, float f) {
        this.g.a(canvas, this.c, f);
    }

    public final void s() {
        ju5 ju5Var = this.l;
        Path path = ju5Var.b;
        RectF rectF = this.k;
        path.computeBounds(rectF, true);
        float f = -(ju5Var.c.getStrokeWidth() / 2.0f);
        rectF.inset(f, f);
        float fCenterX = rectF.centerX();
        va2 va2Var = this.a;
        va2Var.a = fCenterX;
        float fCenterY = rectF.centerY();
        va2Var.b = fCenterY;
        va2Var.c = va2Var.a;
        va2Var.d = fCenterY;
        o(1.0f);
        va2Var.e = 0.0f;
        this.n = -1.0f;
        float f2 = va2Var.f;
        if (f2 == -1.0f) {
            return;
        }
        this.n = f2;
        r(rectF, f2, this.g.a.a, this.h);
    }

    public final boolean t(float f, float f2, float f3) {
        Matrix matrixF = f();
        Matrix matrix = this.e;
        if (matrixF.invert(matrix)) {
            float[] fArr = this.p;
            fArr[0] = f;
            fArr[1] = f2;
            matrix.mapPoints(fArr);
            float strokeWidth = (f3 / this.a.f) + (this.l.c.getStrokeWidth() / 2.0f);
            RectF rectF = this.c;
            RectF rectF2 = this.q;
            rectF2.set(rectF);
            float f4 = -strokeWidth;
            rectF2.inset(f4, f4);
            if (rectF2.contains(fArr[0], fArr[1])) {
                ArrayList<mu5> arrayList = this.l.a;
                float f5 = fArr[0];
                float f6 = fArr[1];
                float f7 = strokeWidth * strokeWidth;
                for (mu5 mu5Var : arrayList) {
                    float[] fArr2 = mu5Var.b;
                    if (fArr2 != null) {
                        int i = mu5Var.a;
                        int i2 = i == 0 ? -1 : pu5.$EnumSwitchMapping$0[qt4.D(i)];
                        if (i2 == -1) {
                            continue;
                        } else if (i2 == 1) {
                            if (fArr2.length >= 4 && btl.a(f5, f6, fArr2[0], fArr2[1], fArr2[2], fArr2[3]) <= f7) {
                                return true;
                            }
                        } else if (i2 != 2) {
                            if (i2 != 3) {
                                ore.o();
                                return false;
                            }
                            if (fArr2.length < 8) {
                                continue;
                            } else {
                                float f8 = fArr2[0];
                                float f9 = fArr2[1];
                                float f10 = fArr2[2];
                                float f11 = fArr2[3];
                                float f12 = fArr2[4];
                                float f13 = fArr2[5];
                                float f14 = fArr2[6];
                                float f15 = fArr2[7];
                                float f16 = f8;
                                int i3 = 1;
                                float f17 = f9;
                                while (i3 < 5) {
                                    float f18 = i3 / 4.0f;
                                    float f19 = 1.0f - f18;
                                    float f20 = f19 * f19 * f19;
                                    float f21 = 3.0f * f19;
                                    float f22 = f19 * f21 * f18;
                                    float f23 = f21 * f18 * f18;
                                    float f24 = f18 * f18 * f18;
                                    float f25 = (f24 * f14) + (f23 * f12) + (f22 * f10) + (f20 * f8);
                                    float f26 = (f24 * f15) + (f23 * f13) + (f22 * f11) + (f20 * f9);
                                    int i4 = i3;
                                    if (btl.a(f5, f6, f16, f17, f25, f26) <= f7) {
                                        return true;
                                    }
                                    i3 = i4 + 1;
                                    f16 = f25;
                                    f17 = f26;
                                }
                            }
                        } else if (fArr2.length < 6) {
                            continue;
                        } else {
                            float f27 = fArr2[0];
                            float f28 = fArr2[1];
                            float f29 = fArr2[2];
                            float f30 = fArr2[3];
                            float f31 = fArr2[4];
                            float f32 = fArr2[5];
                            if (btl.a(f5, f6, f27, f28, f29, f30) <= f7 || btl.a(f5, f6, f27, f28, f31, f32) <= f7) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
