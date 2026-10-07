package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class asi {
    public static final Matrix p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final xri g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final mw o;

    public asi(asi asiVar) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        mw mwVar = new mw(0);
        this.o = mwVar;
        this.g = new xri(asiVar.g, mwVar);
        this.a = new Path(asiVar.a);
        this.b = new Path(asiVar.b);
        this.h = asiVar.h;
        this.i = asiVar.i;
        this.j = asiVar.j;
        this.k = asiVar.k;
        this.l = asiVar.l;
        this.m = asiVar.m;
        String str = asiVar.m;
        if (str != null) {
            mwVar.put(str, this);
        }
        this.n = asiVar.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(xri xriVar, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        Matrix matrix2 = xriVar.a;
        ArrayList arrayList = xriVar.b;
        matrix2.set(matrix);
        Matrix matrix3 = xriVar.a;
        matrix3.preConcat(xriVar.j);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            yri yriVar = (yri) arrayList.get(i5);
            if (yriVar instanceof xri) {
                a((xri) yriVar, matrix3, canvas, i, i2);
            } else {
                if (yriVar instanceof zri) {
                    zri zriVar = (zri) yriVar;
                    float f2 = i / this.j;
                    float f3 = i2 / this.k;
                    float fMin = Math.min(f2, f3);
                    Matrix matrix4 = this.c;
                    matrix4.set(matrix3);
                    matrix4.postScale(f2, f3);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c], fArr[1]);
                    boolean z = c;
                    i3 = i5;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f4 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f4) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        Path path = this.a;
                        zriVar.d(path);
                        Path path2 = this.b;
                        path2.reset();
                        if (zriVar.c()) {
                            path2.setFillType(zriVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            wri wriVar = (wri) zriVar;
                            float f5 = wriVar.i;
                            if (f5 != 0.0f || wriVar.j != 1.0f) {
                                float f6 = wriVar.k;
                                float f7 = (f5 + f6) % 1.0f;
                                float f8 = (wriVar.j + f6) % 1.0f;
                                if (this.f == null) {
                                    this.f = new PathMeasure();
                                }
                                this.f.setPath(path, z);
                                float length = this.f.getLength();
                                float f9 = f7 * length;
                                float f10 = f8 * length;
                                path.reset();
                                PathMeasure pathMeasure = this.f;
                                if (f9 > f10) {
                                    pathMeasure.getSegment(f9, length, path, true);
                                    f = 0.0f;
                                    this.f.getSegment(0.0f, f10, path, true);
                                } else {
                                    f = 0.0f;
                                    pathMeasure.getSegment(f9, f10, path, true);
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix4);
                            float f11 = 255.0f;
                            if (wriVar.f.X()) {
                                ed7 ed7Var = wriVar.f;
                                if (this.e == null) {
                                    i4 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i4 = 16777215;
                                }
                                Paint paint2 = this.e;
                                if (ed7Var.L()) {
                                    Shader shaderJ = ed7Var.J();
                                    shaderJ.setLocalMatrix(matrix4);
                                    paint2.setShader(shaderJ);
                                    paint2.setAlpha(Math.round(wriVar.h * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int I = ed7Var.I();
                                    float f12 = wriVar.h;
                                    PorterDuff.Mode mode = dsi.j;
                                    paint2.setColor((I & i4) | (((int) (Color.alpha(I) * f12)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(wriVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            } else {
                                f11 = 255.0f;
                                i4 = 16777215;
                            }
                            if (wriVar.d.X()) {
                                ed7 ed7Var2 = wriVar.d;
                                if (this.d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.d;
                                Paint.Join join = wriVar.m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = wriVar.l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(wriVar.n);
                                if (ed7Var2.L()) {
                                    Shader shaderJ2 = ed7Var2.J();
                                    shaderJ2.setLocalMatrix(matrix4);
                                    paint4.setShader(shaderJ2);
                                    paint4.setAlpha(Math.round(wriVar.g * f11));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int I2 = ed7Var2.I();
                                    float f13 = wriVar.g;
                                    PorterDuff.Mode mode2 = dsi.j;
                                    paint4.setColor((I2 & i4) | (((int) (Color.alpha(I2) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(wriVar.e * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i5 = i3 + 1;
                c = 0;
            }
            i3 = i5;
            i5 = i3 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.l = i;
    }

    public asi() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.o = new mw(0);
        this.g = new xri();
        this.a = new Path();
        this.b = new Path();
    }
}
