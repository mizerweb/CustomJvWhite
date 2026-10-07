package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import one.me.mediapicker.crop.CropPhotoScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class mx4 extends z1k implements y1k {
    public static final /* synthetic */ zv8[] Q1;
    public final Rect A;
    public final RectF A1;
    public final RectF B;
    public final float B1;
    public final RectF C;
    public final Paint C1;
    public final RectF D;
    public final Paint D1;
    public final RectF E;
    public final Paint E1;
    public final float[] F;
    public final float F1;
    public final RectF G;
    public long G1;
    public int H;
    public tx4 H1;
    public int I;
    public float I1;
    public final qx6[] J;
    public ValueAnimator J1;
    public final float[] K;
    public final zb K1;
    public int L1;
    public tx4 M1;
    public final Path N1;
    public boolean O1;
    public tx4 P1;
    public final float[] n1;
    public final float[] o1;
    public ix4 p1;
    public ValueAnimator q1;
    public final hx4 r1;
    public final int s;
    public final u8b s1;
    public final int t;
    public final u8b t1;
    public final int u;
    public tw4 u1;
    public final int v;
    public final float v1;
    public final float w;
    public final Paint w1;
    public final Path x;
    public final float x1;
    public final Paint y;
    public final float y1;
    public final int z;
    public final RectF z1;

    static {
        z8b z8bVar = new z8b(mx4.class, "mode", "getMode()Lone/me/image/crop/view/CropPhotoView$Mode;");
        zfe.a.getClass();
        Q1 = new zv8[]{z8bVar};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx4(Context context) {
        super(context, 0);
        this.s = gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
        this.t = gm0.K(144.0f * yl5.d().getDisplayMetrics().density);
        this.u = gm0.K(288.0f * yl5.d().getDisplayMetrics().density);
        this.v = gm0.K(220.0f * yl5.d().getDisplayMetrics().density);
        this.w = yl5.d().getDisplayMetrics().density * 16.0f;
        this.x = new Path();
        Paint paint = new Paint();
        paint.setColor(pq3.j.e(context).m().b().g);
        paint.setAntiAlias(true);
        this.y = paint;
        this.z = Color.alpha(paint.getColor());
        this.A = new Rect();
        this.B = new RectF();
        this.C = new RectF();
        this.D = new RectF();
        this.E = new RectF();
        this.F = new float[2];
        this.G = new RectF();
        qx6[] qx6VarArr = new qx6[4];
        for (int i = 0; i < 4; i++) {
            qx6VarArr[i] = new qx6(qx6.a(0.0f, 0.0f));
        }
        this.J = qx6VarArr;
        this.K = new float[8];
        this.n1 = new float[8];
        this.o1 = new float[4];
        this.r1 = new hx4(this, 1);
        this.s1 = new u8b();
        this.t1 = new u8b();
        this.v1 = yl5.d().getDisplayMetrics().density * 40.0f;
        Paint paint2 = new Paint();
        paint2.setColor(context.getColor(R.color.white));
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        this.w1 = paint2;
        this.x1 = yl5.d().getDisplayMetrics().density * 4.0f;
        this.y1 = yl5.d().getDisplayMetrics().density * 34.0f;
        this.z1 = new RectF();
        this.A1 = new RectF();
        float f = yl5.d().getDisplayMetrics().density * 4.0f;
        this.B1 = f;
        Paint paint3 = new Paint(1);
        paint3.setColor(context.getColor(R.color.white));
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setStrokeWidth(f);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint3.setStrokeJoin(join);
        this.C1 = paint3;
        Paint paint4 = new Paint();
        paint4.setColor(context.getColor(R.color.white));
        paint4.setStyle(style);
        paint4.setStrokeJoin(join);
        paint4.setStrokeCap(cap);
        paint4.setAntiAlias(true);
        paint4.setStrokeWidth(yl5.d().getDisplayMetrics().density * 1.0f);
        this.D1 = paint4;
        Paint paint5 = new Paint();
        paint5.setColor(context.getColor(R.color.white));
        paint5.setStyle(style);
        paint5.setAntiAlias(true);
        paint5.setStrokeWidth(yl5.d().getDisplayMetrics().density * 1.0f);
        paint5.setAlpha(150);
        this.E1 = paint5;
        this.F1 = yl5.d().getDisplayMetrics().density * 64.0f;
        this.G1 = qx6.a(0.0f, 0.0f);
        this.I1 = 1.0f;
        this.K1 = new zb(this);
        this.N1 = new Path();
        this.O1 = true;
        setOnReleaseListener(this);
    }

    public static /* synthetic */ void J(mx4 mx4Var, RectF rectF, float f) {
        mx4Var.I(rectF, f, qx6.a(-1.0f, -1.0f));
    }

    public static void O(mx4 mx4Var) {
        mx4Var.E();
        mx4Var.Q();
        mx4Var.invalidate();
    }

    public static void R(mx4 mx4Var) {
        mx4Var.getCropController().t(false);
        if (mx4Var.H > 0) {
            mx4Var.getCropController().s(mx4Var.H);
        }
    }

    private final ay4 getCropController() {
        return (ay4) getZoomableController();
    }

    public static void k(l68 l68Var, mx4 mx4Var) {
        if (l68Var == null) {
            return;
        }
        mx4Var.H = l68Var.getWidth();
        mx4Var.I = l68Var.getHeight();
        mx4Var.F(mx4Var.getWidth(), mx4Var.getHeight());
        ay4 cropController = mx4Var.getCropController();
        cropController.q(mx4Var.G);
        cropController.t(true);
        cropController.s(mx4Var.H);
        cropController.v.set(cropController.m);
        mx4Var.getCropController().E = mx4Var;
        mx4Var.M();
        mx4Var.P1 = null;
        mx4Var.O1 = true;
        mx4Var.invalidate();
    }

    public static void l(mx4 mx4Var, tfe tfeVar) {
        boolean zIsAttachedToWindow = mx4Var.isAttachedToWindow();
        RectF rectF = mx4Var.G;
        RectF rectF2 = mx4Var.B;
        if (zIsAttachedToWindow) {
            R(mx4Var);
            if (tfeVar.a > 1.0f) {
                mx4Var.u(rectF2);
                if (!rectF2.isEmpty()) {
                    rectF.set(rectF2);
                    mx4Var.getCropController().q(rectF);
                    O(mx4Var);
                }
            } else {
                mx4Var.n();
            }
            mx4Var.A();
        }
    }

    public static void m(mx4 mx4Var, float f, tfe tfeVar, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        RectF rectF = mx4Var.G;
        RectF rectF2 = mx4Var.C;
        float f2 = rectF2.left;
        RectF rectF3 = mx4Var.D;
        rectF.set(esk.b(f2, rectF3.left, fFloatValue), esk.b(rectF2.top, rectF3.top, fFloatValue), esk.b(rectF2.right, rectF3.right, fFloatValue), esk.b(rectF2.bottom, rectF3.bottom, fFloatValue));
        mx4Var.E();
        mx4Var.Q();
        mx4Var.invalidate();
        mx4Var.getCropController().q(rectF);
        float fB = esk.b(1.0f, f, fFloatValue);
        float f3 = tfeVar.a;
        if (f3 == 0.0f) {
            return;
        }
        float f4 = fB / f3;
        tfeVar.a = fB;
        ay4 cropController = mx4Var.getCropController();
        float[] fArr = mx4Var.F;
        float f5 = fArr[0];
        float f6 = fArr[1];
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        if (cropController.j == null) {
            return;
        }
        if (f4 <= 0.0f || f4 == 1.0f) {
            cropController.r(f5, f6, fCenterX, fCenterY);
            return;
        }
        float fH = cropController.h();
        float f7 = f4 * fH;
        float f8 = cropController.h;
        if (f8 <= 0.0f) {
            f8 = f7;
        }
        float fMin = fH > 0.0f ? Math.min(f7, f8) / fH : 1.0f;
        if (fMin != 1.0f) {
            cropController.m.postScale(fMin, fMin, fCenterX, fCenterY);
        }
        cropController.r(f5, f6, fCenterX, fCenterY);
    }

    public static final boolean q(mx4 mx4Var, ps7 ps7Var, float f, float f2, RectF rectF, float f3) {
        RectF rectF2 = mx4Var.G;
        rectF2.set(mx4Var.B);
        float f4 = f * f3;
        float f5 = f2 * f3;
        switch (ps7Var.ordinal()) {
            case 0:
                rectF2.left += f4;
                rectF2.top += f5;
                break;
            case 1:
                rectF2.right += f4;
                rectF2.top += f5;
                break;
            case 2:
                rectF2.left += f4;
                rectF2.bottom += f5;
                break;
            case 3:
                rectF2.right += f4;
                rectF2.bottom += f5;
                break;
            case 4:
                rectF2.top += f5;
                break;
            case 5:
                rectF2.bottom += f5;
                break;
            case 6:
                rectF2.left += f4;
                break;
            case 7:
                rectF2.right += f4;
                break;
            default:
                ore.o();
                return false;
        }
        float f6 = mx4Var.F1;
        float f7 = rectF.left;
        float f8 = rectF.top;
        float f9 = rectF.right;
        float f10 = rectF.bottom;
        switch (ps7Var.ordinal()) {
            case 0:
                rectF2.left = y(rectF2.left, f7, rectF2.right - f6);
                rectF2.top = y(rectF2.top, f8, rectF2.bottom - f6);
                break;
            case 1:
                rectF2.right = y(rectF2.right, rectF2.left + f6, f9);
                rectF2.top = y(rectF2.top, f8, rectF2.bottom - f6);
                break;
            case 2:
                rectF2.left = y(rectF2.left, f7, rectF2.right - f6);
                rectF2.bottom = y(rectF2.bottom, rectF2.top + f6, f10);
                break;
            case 3:
                rectF2.right = y(rectF2.right, rectF2.left + f6, f9);
                rectF2.bottom = y(rectF2.bottom, rectF2.top + f6, f10);
                break;
            case 4:
                rectF2.top = y(rectF2.top, f8, rectF2.bottom - f6);
                break;
            case 5:
                rectF2.bottom = y(rectF2.bottom, rectF2.top + f6, f10);
                break;
            case 6:
                rectF2.left = y(rectF2.left, f7, rectF2.right - f6);
                break;
            case 7:
                rectF2.right = y(rectF2.right, rectF2.left + f6, f9);
                break;
            default:
                ore.o();
                return false;
        }
        ay4 cropController = mx4Var.getCropController();
        float[] fArr = mx4Var.K;
        cropController.i(fArr);
        qx6[] qx6VarArr = mx4Var.J;
        qx6VarArr[0] = new qx6(qx6.a(fArr[0], fArr[1]));
        qx6VarArr[1] = new qx6(qx6.a(fArr[2], fArr[3]));
        qx6VarArr[2] = new qx6(qx6.a(fArr[4], fArr[5]));
        qx6VarArr[3] = new qx6(qx6.a(fArr[6], fArr[7]));
        int i = 0;
        while (i < 4) {
            long j = qx6VarArr[i].a;
            long j2 = qx6VarArr[i == 3 ? 0 : i + 1].a;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (j >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) - Float.intBitsToFloat((int) (j & 4294967295L));
            float[] fArr2 = mx4Var.o1;
            float fSqrt = (float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat));
            if (fSqrt < 0.001f) {
                fSqrt = 0.001f;
            }
            fArr2[i] = fSqrt;
            i++;
        }
        float f11 = rectF2.left;
        float f12 = rectF2.top;
        float f13 = rectF2.right;
        float f14 = rectF2.bottom;
        return mx4Var.D(qx6.a(f11, f12), qx6VarArr) && mx4Var.D(qx6.a(f13, f12), qx6VarArr) && mx4Var.D(qx6.a(f13, f14), qx6VarArr) && mx4Var.D(qx6.a(f11, f14), qx6VarArr);
    }

    public static final void r(float f, Path path, float f2, float f3, float f4, float f5, float f6, float f7, boolean z) {
        float f8 = f2 - f4;
        float f9 = f3 - f5;
        float f10 = f6 - f4;
        float f11 = f7 - f5;
        float fSqrt = (float) Math.sqrt((f9 * f9) + (f8 * f8));
        if (fSqrt < 0.001f) {
            fSqrt = 0.001f;
        }
        float fSqrt2 = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        float f12 = fSqrt2 >= 0.001f ? fSqrt2 : 0.001f;
        float fMin = Math.min(f, Math.min(fSqrt * 0.5f, f12 * 0.5f));
        float f13 = ((f8 / fSqrt) * fMin) + f4;
        float f14 = ((f9 / fSqrt) * fMin) + f5;
        float f15 = ((f10 / f12) * fMin) + f4;
        float f16 = ((f11 / f12) * fMin) + f5;
        if (z) {
            path.moveTo(f13, f14);
        } else {
            path.lineTo(f13, f14);
        }
        path.quadTo(f4, f5, f15, f16);
    }

    public static long v(ps7 ps7Var, RectF rectF) {
        switch (kx4.$EnumSwitchMapping$0[ps7Var.ordinal()]) {
            case 1:
                return qx6.a(rectF.left, rectF.top);
            case 2:
                return qx6.a(rectF.right, rectF.top);
            case 3:
                return qx6.a(rectF.left, rectF.bottom);
            case 4:
                return qx6.a(rectF.right, rectF.bottom);
            case 5:
                return qx6.a(rectF.left, rectF.centerY());
            case 6:
                return qx6.a(rectF.right, rectF.centerY());
            case 7:
                return qx6.a(rectF.centerX(), rectF.top);
            case 8:
                return qx6.a(rectF.centerX(), rectF.bottom);
            default:
                ore.o();
                return 0L;
        }
    }

    public static float y(float f, float f2, float f3) {
        return oc9.u(f, Math.min(f2, f3), Math.max(f2, f3));
    }

    public final void A() {
        ValueAnimator valueAnimator = this.J1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.I1, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new ak(10, this));
        valueAnimatorOfFloat.addListener(new lx4(this, 3));
        valueAnimatorOfFloat.addListener(new lx4(this, 2));
        this.J1 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    public final void B() {
        s();
        ValueAnimator valueAnimator = this.J1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.J1 = null;
        this.I1 = 0.0f;
        invalidate();
        ay4 cropController = getCropController();
        int i = 0;
        hx4 hx4Var = new hx4(this, 0);
        if (cropController.e) {
            A();
            return;
        }
        cropController.z = false;
        float f = cropController.w;
        Matrix matrix = new Matrix(cropController.m);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.addUpdateListener(new mk(cropController, 2, matrix));
        valueAnimatorOfFloat.addListener(cropController);
        valueAnimatorOfFloat.addListener(new zx4(cropController, f, hx4Var, i));
        valueAnimatorOfFloat.start();
        cropController.y = valueAnimatorOfFloat;
    }

    public final Rect C(int i) {
        ay4 cropController = getCropController();
        RectF rectF = cropController.o;
        RectF rectF2 = cropController.p;
        RectF rectF3 = cropController.j;
        if (rectF3 == null || rectF.isEmpty()) {
            return null;
        }
        cropController.m.mapRect(rectF2, rectF3);
        float fWidth = rectF2.width();
        if (fWidth <= 0.0f) {
            return null;
        }
        float f = i / fWidth;
        float f2 = rectF.left;
        float f3 = rectF2.left;
        float f4 = rectF.top;
        float f5 = rectF2.top;
        return new Rect((int) ((f2 - f3) * f), (int) ((f4 - f5) * f), (int) ((rectF.right - f3) * f), (int) ((rectF.bottom - f5) * f));
    }

    public final boolean D(long j, qx6[] qx6VarArr) {
        int i = 0;
        while (i < 4) {
            long j2 = qx6VarArr[i].a;
            long j3 = qx6VarArr[i == 3 ? 0 : i + 1].a;
            int i2 = (int) (j2 >> 32);
            int i3 = (int) (j2 & 4294967295L);
            if (((Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat(i3)) * (Float.intBitsToFloat((int) (j3 >> 32)) - Float.intBitsToFloat(i2))) - ((Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat(i2)) * (Float.intBitsToFloat((int) (j3 & 4294967295L)) - Float.intBitsToFloat(i3))) < this.o1[i] * (-0.5f)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public final void E() {
        Path path = this.x;
        path.reset();
        int iOrdinal = getMode().ordinal();
        RectF rectF = this.G;
        if (iOrdinal == 0) {
            path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CCW);
        } else if (iOrdinal != 1) {
            ore.o();
        } else {
            float f = this.w;
            path.addRoundRect(rectF, f, f, Path.Direction.CCW);
        }
    }

    public final void F(int i, int i2) {
        if (K(i, i2)) {
            return;
        }
        int iOrdinal = getMode().ordinal();
        Rect rect = this.A;
        int i3 = 0;
        int i4 = this.s;
        RectF rectF = this.G;
        if (iOrdinal == 0) {
            int i5 = i - (i4 * 2);
            int i6 = i2 - (this.t * 2);
            if (i5 > i6) {
                i5 = i6;
            }
            int i7 = i / 2;
            int i8 = (i5 >= 0 ? i5 : 0) / 2;
            int i9 = i2 / 2;
            rect.set(i7 - i8, i9 - i8, i7 + i8, i9 + i8);
            rectF.set(rect.left, rect.top, rect.right, rect.bottom);
            E();
            return;
        }
        if (iOrdinal != 1) {
            ore.o();
            return;
        }
        int i10 = i - (i4 * 2);
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = i2 - this.u;
        if (i11 < 0) {
            i11 = 0;
        }
        int i12 = i2 - this.v;
        if (i12 < 0) {
            i12 = 0;
        }
        int i13 = i / 2;
        int i14 = i10 / 2;
        int i15 = i2 / 2;
        rect.set(i13 - i14, i15 - (i11 / 2), i13 + i14, (i12 / 2) + i15);
        J(this, rectF, this.H / this.I);
        E();
        getCropController().q(rectF);
        u8b u8bVar = this.s1;
        u8bVar.f();
        y1 y1Var = new y1(i3, ps7.b);
        while (y1Var.hasNext()) {
            ps7 ps7Var = (ps7) y1Var.next();
            u8bVar.b(new tw4(v(ps7Var, rectF), ps7Var));
        }
        P();
        invalidate();
    }

    public final void G() {
        ValueAnimator valueAnimator = this.J1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.J1 = null;
        this.I1 = 1.0f;
        if (getMode() == jx4.b) {
            s();
            this.L1 = 0;
            if (!K(getWidth(), getHeight())) {
                float f = this.H / this.I;
                if (this.L1 % 2 != 0) {
                    f = 1.0f / f;
                }
                RectF rectF = this.G;
                J(this, rectF, f);
                O(this);
                getCropController().q(rectF);
            }
        }
        getCropController().d();
        getCropController().t(true);
        if (this.H > 0) {
            getCropController().s(this.H);
        }
    }

    public final void H() {
        int i;
        int i2 = 1;
        this.L1 = (this.L1 + 1) % 4;
        tfe tfeVar = new tfe();
        tfeVar.a = 1.0f;
        s();
        if (getMode() == jx4.b) {
            Rect rect = this.A;
            float fWidth = rect.width();
            float fHeight = rect.height();
            if (fWidth <= 0.0f || fHeight <= 0.0f) {
                return;
            }
            RectF rectF = this.G;
            float fWidth2 = rectF.width();
            float fHeight2 = rectF.height();
            float fCenterX = rectF.centerX();
            float fCenterY = rectF.centerY();
            float fHeight3 = rectF.height();
            float fWidth3 = rectF.width();
            if (fHeight3 > 0.0f && fWidth3 > 0.0f && (fHeight3 > fWidth || fWidth3 > fHeight)) {
                float fMin = Math.min(fWidth / fHeight3, fHeight / fWidth3);
                fHeight3 *= fMin;
                fWidth3 *= fMin;
            }
            float f = fHeight3 / 2.0f;
            float f2 = fWidth3 / 2.0f;
            rectF.set(fCenterX - f, fCenterY - f2, fCenterX + f, fCenterY + f2);
            float f3 = rectF.left;
            float f4 = rect.left;
            if (f3 < f4) {
                rectF.offset(f4 - f3, 0.0f);
            }
            float f5 = rectF.right;
            float f6 = rect.right;
            if (f5 > f6) {
                rectF.offset(f6 - f5, 0.0f);
            }
            float f7 = rectF.top;
            float f8 = rect.top;
            if (f7 < f8) {
                rectF.offset(0.0f, f8 - f7);
            }
            float f9 = rectF.bottom;
            float f10 = rect.bottom;
            if (f9 > f10) {
                rectF.offset(0.0f, f10 - f9);
            }
            E();
            Q();
            getCropController().q(rectF);
            int i3 = this.H;
            if (i3 > 0 && (i = this.I) > 0 && fWidth2 > 0.0f && fHeight2 > 0.0f) {
                float f11 = i3;
                float f12 = i;
                boolean z = Math.abs((this.L1 - 1) % 2) == 1;
                float f13 = z ? f12 : f11;
                if (!z) {
                    f11 = f12;
                }
                float fMax = Math.max(fWidth2 / f13, fHeight2 / f11);
                float fWidth4 = rectF.width();
                float fHeight4 = rectF.height();
                if (fWidth4 <= 0.0f || fHeight4 <= 0.0f) {
                    return;
                }
                float fWidth5 = rectF.width() / fHeight4;
                RectF rectF2 = this.B;
                J(this, rectF2, fWidth5);
                float fMax2 = Math.max(rectF2.width() / f11, rectF2.height() / f13);
                if (fMax > 0.0f) {
                    float f14 = fMax2 / fMax;
                    if (Math.abs(f14 - 1.0f) > 0.001f) {
                        tfeVar.a = f14;
                    }
                }
            }
        }
        ValueAnimator valueAnimator = this.J1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.J1 = null;
        this.I1 = 0.0f;
        invalidate();
        final ay4 cropController = getCropController();
        final float f15 = tfeVar.a;
        f92 f92Var = new f92(this, 20, tfeVar);
        if (cropController.e) {
            this.L1 = (this.L1 + 3) % 4;
            A();
            return;
        }
        cropController.z = false;
        float f16 = cropController.x;
        final tfe tfeVar2 = new tfe();
        final tfe tfeVar3 = new tfe();
        tfeVar3.a = 1.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yx4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ay4 ay4Var = cropController;
                boolean z2 = ay4Var.z;
                Matrix matrix = ay4Var.m;
                if (z2) {
                    return;
                }
                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f17 = 90.0f * fFloatValue;
                tfe tfeVar4 = tfeVar2;
                float f18 = f17 - tfeVar4.a;
                tfeVar4.a = f17;
                matrix.postRotate(f18, ay4Var.k(), ay4Var.l());
                float f19 = ((f15 - 1.0f) * fFloatValue) + 1.0f;
                tfe tfeVar5 = tfeVar3;
                float f20 = f19 / tfeVar5.a;
                tfeVar5.a = f19;
                if (Math.abs(f20 - 1.0f) > 0.001f) {
                    matrix.postScale(f20, f20, ay4Var.k(), ay4Var.l());
                }
                ay4Var.l.set(matrix);
                z1k z1kVar = ay4Var.b;
                if (z1kVar != null) {
                    z1kVar.h(matrix);
                }
            }
        });
        valueAnimatorOfFloat.addListener(cropController);
        valueAnimatorOfFloat.addListener(new zx4(cropController, f16, f92Var, i2));
        valueAnimatorOfFloat.start();
        cropController.y = valueAnimatorOfFloat;
    }

    public final void I(RectF rectF, float f, long j) {
        float f2;
        Rect rect = this.A;
        float fWidth = rect.width();
        float fHeight = rect.height();
        float f3 = 0.0f;
        if (fWidth <= 0.0f || fHeight <= 0.0f || f == 0.0f) {
            rectF.setEmpty();
            return;
        }
        if (fWidth / fHeight >= f) {
            fWidth = fHeight * f;
        } else {
            fHeight = fWidth / f;
        }
        int i = (int) (j >> 32);
        float fExactCenterX = Float.intBitsToFloat(i) == -1.0f ? rect.exactCenterX() : Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fExactCenterY = Float.intBitsToFloat(i2) == -1.0f ? rect.exactCenterY() : Float.intBitsToFloat(i2);
        float f4 = fWidth / 2.0f;
        float f5 = fExactCenterX - f4;
        float f6 = fHeight / 2.0f;
        float f7 = fExactCenterY - f6;
        float f8 = fExactCenterX + f4;
        float f9 = fExactCenterY + f6;
        if (Float.intBitsToFloat(i) != -1.0f && Float.intBitsToFloat(i2) != -1.0f) {
            float f10 = rect.left;
            float f11 = rect.top;
            float f12 = rect.right;
            float f13 = rect.bottom;
            if (f5 < f10) {
                f2 = f10 - f5;
            } else {
                f2 = f8 > f12 ? f12 - f8 : 0.0f;
            }
            if (f7 < f11) {
                f3 = f11 - f7;
            } else if (f9 > f13) {
                f3 = f13 - f9;
            }
            f5 += f2;
            f8 += f2;
            f7 += f3;
            f9 += f3;
        }
        rectF.set(f5, f7, f8, f9);
    }

    public final boolean K(int i, int i2) {
        return this.H <= 0 || this.I <= 0 || i <= 0 || i2 <= 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    public final void L() {
        boolean z;
        ay4 cropController = getCropController();
        if (cropController.D) {
            return;
        }
        cropController.D = true;
        cropController.A.set(cropController.m);
        cropController.B = cropController.w;
        RectF rectF = cropController.j;
        if (rectF != null && !cropController.o.isEmpty()) {
            RectF rectF2 = cropController.p;
            z = (!cropController.o(rectF2) ? 1.0f : ay4.g(rectF2, rectF)) >= 0.97f;
        }
        cropController.C = z;
    }

    public final void M() {
        tx4 tx4Var = this.H1;
        if (tx4Var == null) {
            return;
        }
        Rect rect = this.A;
        if (K(rect.width(), rect.height())) {
            return;
        }
        s();
        this.L1 = tx4Var.a;
        jx4 mode = getMode();
        jx4 jx4Var = jx4.b;
        RectF rectF = this.G;
        if (mode == jx4Var) {
            RectF rectF2 = tx4Var.b;
            float fWidth = rect.width();
            float fHeight = rect.height();
            float f = rect.left;
            float f2 = (rectF2.left * fWidth) + f;
            float f3 = rect.top;
            rectF.set(f2, (rectF2.top * fHeight) + f3, (rectF2.right * fWidth) + f, (rectF2.bottom * fHeight) + f3);
            E();
            Q();
            N();
        } else {
            getCropController().q(rectF);
        }
        ay4 cropController = getCropController();
        float[] fArr = tx4Var.c;
        Matrix matrix = cropController.m;
        if (fArr.length >= 9) {
            cropController.z = true;
            ValueAnimator valueAnimator = cropController.y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            cropController.y = null;
            matrix.setValues(fArr);
            cropController.c();
            cropController.D = false;
            cropController.C = false;
            cropController.A.reset();
            cropController.l.set(matrix);
            cropController.e();
            z1k z1kVar = cropController.b;
            if (z1kVar != null) {
                z1kVar.h(matrix);
            }
        }
        getCropController().w = tx4Var.d;
        R(this);
        A();
        this.O1 = true;
        invalidate();
        this.H1 = null;
    }

    public final void N() {
        getCropController().q(this.G);
        ay4 cropController = getCropController();
        Matrix matrix = cropController.r;
        RectF rectF = cropController.p;
        RectF rectF2 = cropController.o;
        Matrix matrix2 = cropController.m;
        RectF rectF3 = cropController.j;
        if (rectF3 == null || rectF2.isEmpty()) {
            return;
        }
        matrix2.mapRect(rectF, rectF3);
        Float fJ = cropController.j(rectF);
        if (fJ != null) {
            float fFloatValue = fJ.floatValue();
            float fH = cropController.h();
            if (fH <= 0.0f) {
                return;
            }
            cropController.g = fH * fFloatValue;
            matrix.set(matrix2);
            if (fFloatValue > 1.001f) {
                matrix2.postScale(fFloatValue, fFloatValue, rectF2.centerX(), rectF2.centerY());
            }
            cropController.c();
            float[] fArr = cropController.t;
            matrix.getValues(fArr);
            float[] fArr2 = cropController.u;
            matrix2.getValues(fArr2);
            for (int i = 0; i < 9; i++) {
                if (Math.abs(fArr[i] - fArr2[i]) > 0.001f) {
                    cropController.p();
                    return;
                }
            }
        }
    }

    public final void P() {
        RectF rectF = this.G;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        if (fWidth <= 0.0f || fHeight <= 0.0f) {
            return;
        }
        float f5 = (fWidth / 3.0f) + f;
        float f6 = ((fWidth * 2.0f) / 3.0f) + f;
        float f7 = (fHeight / 3.0f) + f2;
        float f8 = ((fHeight * 2.0f) / 3.0f) + f2;
        u8b u8bVar = this.t1;
        u8bVar.f();
        u8bVar.d(xw3.P0(new nq7(qx6.a(f5, f2), qx6.a(f5, f4)), new nq7(qx6.a(f6, f2), qx6.a(f6, f4)), new nq7(qx6.a(f, f7), qx6.a(f3, f7)), new nq7(qx6.a(f, f8), qx6.a(f3, f8))));
    }

    public final void Q() {
        u8b u8bVar = this.s1;
        Object[] objArr = u8bVar.a;
        int i = u8bVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            tw4 tw4Var = (tw4) objArr[i2];
            tw4Var.a = v(tw4Var.b, this.G);
        }
        P();
    }

    @Override // defpackage.z1k
    public final void g(l68 l68Var) {
        super.g(l68Var);
        post(new f92(l68Var, 21, this));
    }

    public final RectF getDrawableCropRect() {
        return this.G;
    }

    public final RectF getImageBounds() {
        RectF rectF = new RectF();
        RectF rectF2 = getCropController().j;
        if (rectF2 == null) {
            rectF.setEmpty();
            return rectF;
        }
        rectF.set(rectF2);
        return rectF;
    }

    public final float[] getImageTransformValues() {
        float[] fArr = new float[9];
        getCropController().m.getValues(fArr);
        return fArr;
    }

    public final jx4 getMode() {
        zv8 zv8Var = Q1[0];
        return (jx4) this.K1.b;
    }

    public final tx4 getOnReleaseState() {
        return this.P1;
    }

    @Override // defpackage.z1k
    public final void h(Matrix matrix) {
        super.h(matrix);
        this.O1 = true;
        invalidate();
    }

    public final void n() {
        ValueAnimator valueAnimator;
        float[] fArr;
        ValueAnimator valueAnimator2 = this.q1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.q1 = null;
        ay4 cropController = getCropController();
        RectF rectF = this.G;
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        Matrix matrix = cropController.q;
        int i = 1;
        if (cropController.j != null && (fArr = this.F) != null && fArr.length >= 2 && cropController.m.invert(matrix)) {
            fArr[0] = fCenterX;
            fArr[1] = fCenterY;
            matrix.mapPoints(fArr);
        }
        RectF rectF2 = this.E;
        u(rectF2);
        if (rectF2.isEmpty()) {
            return;
        }
        RectF rectF3 = this.C;
        rectF3.set(rectF);
        RectF rectF4 = this.D;
        rectF4.set(rectF2);
        if (rectF3.width() == 0.0f) {
            return;
        }
        float fWidth = rectF4.width() / rectF3.width();
        if (fWidth < 1.0f) {
            fWidth = 1.0f;
        }
        tfe tfeVar = new tfe();
        tfeVar.a = 1.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.addUpdateListener(new mj(this, fWidth, tfeVar, i));
        valueAnimatorOfFloat.addListener(new lx4(this, 1));
        valueAnimatorOfFloat.addListener(new lx4(this, 0));
        this.q1 = valueAnimatorOfFloat;
        if (isAttachedToWindow() && (valueAnimator = this.q1) != null) {
            valueAnimator.start();
        }
    }

    public final void o(float f) {
        if (f <= 0.0f) {
            return;
        }
        RectF rectF = this.G;
        I(rectF, f, qx6.a(rectF.centerX(), rectF.centerY()));
        N();
        O(this);
        R(this);
        this.O1 = true;
    }

    @Override // defpackage.fu5, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        s();
        super.onDetachedFromWindow();
    }

    @Override // defpackage.z1k, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Path path;
        int i;
        float f;
        ylc ylcVar;
        Canvas canvas2 = canvas;
        boolean z = this.O1;
        int i2 = 4;
        int i3 = 3;
        int i4 = 2;
        int i5 = 1;
        Path path2 = this.N1;
        if (!z) {
            path = path2;
            break;
        }
        this.O1 = false;
        path2.reset();
        ay4 cropController = getCropController();
        float[] fArr = this.n1;
        cropController.i(fArr);
        int i6 = 0;
        while (true) {
            if (i6 >= 8) {
                path = path2;
                break;
            }
            if (fArr[i6] != 0.0f) {
                float f2 = fArr[0];
                float f3 = fArr[1];
                float f4 = fArr[2];
                float f5 = fArr[3];
                float f6 = fArr[4];
                float f7 = fArr[5];
                float f8 = fArr[6];
                float f9 = fArr[7];
                path2.reset();
                float f10 = this.w;
                r(f10, path2, f8, f9, f2, f3, f4, f5, true);
                r(f10, path2, f2, f3, f4, f5, f6, f7, false);
                r(f10, path2, f4, f5, f6, f7, f8, f9, false);
                r(f10, path2, f6, f7, f8, f9, f2, f3, false);
                path = path2;
                path.close();
                break;
            }
            i6++;
        }
        int iSave = canvas2.save();
        try {
            if (!path.isEmpty()) {
                canvas2.clipPath(path);
            }
            super.onDraw(canvas);
            canvas2.restoreToCount(iSave);
            int i7 = (int) (this.z * this.I1);
            Paint paint = this.y;
            paint.setAlpha(i7);
            int iSave2 = canvas2.save();
            try {
                canvas2.clipOutPath(this.x);
                canvas2.drawRect(0.0f, 0.0f, canvas2.getWidth(), canvas2.getHeight(), paint);
                canvas2.restoreToCount(iSave2);
                int i8 = (int) (255.0f * this.I1);
                int iOrdinal = getMode().ordinal();
                Paint paint2 = this.D1;
                if (iOrdinal == 0) {
                    paint2.setAlpha(i8);
                    Rect rect = this.A;
                    canvas2.drawCircle(rect.centerX(), rect.centerY(), rect.width() / 2, paint2);
                    return;
                }
                if (iOrdinal != 1) {
                    ore.o();
                    return;
                }
                paint2.setAlpha(i8);
                RectF rectF = this.G;
                float f11 = this.w;
                canvas2.drawRoundRect(rectF, f11, f11, paint2);
                Paint paint3 = this.w1;
                paint3.setAlpha(i8);
                Paint paint4 = this.C1;
                paint4.setAlpha(i8);
                u8b u8bVar = this.s1;
                Object[] objArr = u8bVar.a;
                int i9 = u8bVar.b;
                int i10 = 0;
                while (i10 < i9) {
                    tw4 tw4Var = (tw4) objArr[i10];
                    ps7 ps7Var = tw4Var.b;
                    int iOrdinal2 = ps7Var.ordinal();
                    int i11 = i9;
                    RectF rectF2 = this.z1;
                    if (iOrdinal2 == 0 || iOrdinal2 == i5 || iOrdinal2 == i4 || iOrdinal2 == i3) {
                        i10 = i10;
                        float f12 = 2.0f * f11;
                        float f13 = rectF.left;
                        float f14 = rectF.top;
                        float f15 = rectF.right;
                        float f16 = rectF.bottom;
                        int iOrdinal3 = ps7Var.ordinal();
                        if (iOrdinal3 != 0) {
                            i5 = 1;
                            if (iOrdinal3 != 1) {
                                if (iOrdinal3 == 2) {
                                    rectF2.set(f13, f16 - f12, f13 + f12, f16);
                                    f = 90.0f;
                                    i = 3;
                                } else if (iOrdinal3 != 3) {
                                    paint3 = paint3;
                                    i = 3;
                                } else {
                                    rectF2.set(f15 - f12, f16 - f12, f15, f16);
                                    i = 3;
                                    f = 0.0f;
                                }
                                canvas2.drawArc(rectF2, f, 90.0f, false, paint4);
                            } else {
                                i = 3;
                                rectF2.set(f15 - f12, f14, f15, f14 + f12);
                                f = 270.0f;
                            }
                        } else {
                            i5 = 1;
                            i = 3;
                            rectF2.set(f13, f14, f13 + f12, f14 + f12);
                            f = 180.0f;
                        }
                        canvas2.drawArc(rectF2, f, 90.0f, false, paint4);
                    } else {
                        int iOrdinal4 = ps7Var.ordinal();
                        float f17 = this.B1;
                        float f18 = this.y1;
                        if (iOrdinal4 == i2 || iOrdinal4 == 5) {
                            ylcVar = new ylc(Float.valueOf(f18), Float.valueOf(f17));
                        } else {
                            if (iOrdinal4 == 6 || iOrdinal4 == 7) {
                                ylcVar = new ylc(Float.valueOf(f17), Float.valueOf(f18));
                            }
                            paint3 = paint3;
                            i5 = 1;
                            i = 3;
                        }
                        float fFloatValue = ((Number) ylcVar.a).floatValue();
                        float fFloatValue2 = ((Number) ylcVar.b).floatValue();
                        long j = tw4Var.a;
                        int i12 = (int) (j >> 32);
                        float f19 = fFloatValue / 2.0f;
                        int i13 = (int) (j & 4294967295L);
                        float f20 = fFloatValue2 / 2.0f;
                        rectF2.set(Float.intBitsToFloat(i12) - f19, Float.intBitsToFloat(i13) - f20, Float.intBitsToFloat(i12) + f19, Float.intBitsToFloat(i13) + f20);
                        float f21 = this.x1;
                        canvas2.drawRoundRect(rectF2, f21, f21, paint3);
                        paint3 = paint3;
                        i5 = 1;
                        i = 3;
                    }
                    i10++;
                    canvas2 = canvas;
                    f11 = f11;
                    paint3 = paint3;
                    objArr = objArr;
                    i9 = i11;
                    i3 = i;
                    i2 = 4;
                    i4 = 2;
                }
                int i14 = (int) (150.0f * this.I1);
                Paint paint5 = this.E1;
                paint5.setAlpha(i14);
                u8b u8bVar2 = this.t1;
                Object[] objArr2 = u8bVar2.a;
                int i15 = u8bVar2.b;
                for (int i16 = 0; i16 < i15; i16++) {
                    nq7 nq7Var = (nq7) objArr2[i16];
                    long j2 = nq7Var.a;
                    long j3 = nq7Var.b;
                    canvas.drawLine(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (nq7Var.a & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), paint5);
                }
            } catch (Throwable th) {
                canvas2.restoreToCount(iSave2);
                throw th;
            }
        } catch (Throwable th2) {
            canvas2.restoreToCount(iSave);
            throw th2;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        F(i, i2);
        getCropController().q(this.G);
        R(this);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0084  */
    /* JADX WARN: Code duplicated, block: B:38:0x0088  */
    /* JADX WARN: Code duplicated, block: B:66:0x011f  */
    @Override // defpackage.z1k, defpackage.fu5, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        tx4 tx4VarW;
        ix4 ix4Var;
        int actionMasked = motionEvent.getActionMasked();
        tw4 tw4Var = null;
        if (actionMasked == 0) {
            this.M1 = z();
        } else if (actionMasked == 1 || actionMasked == 3) {
            tx4 tx4Var = this.M1;
            if (tx4Var != null && (tx4VarW = w()) != null) {
                if (tx4Var.a != tx4VarW.a) {
                    ix4Var = this.p1;
                    if (ix4Var != null) {
                        ((CropPhotoScreen) ix4Var).v1().I(tx4Var);
                    }
                } else {
                    RectF rectF = tx4Var.b;
                    RectF rectF2 = tx4VarW.b;
                    if (Math.abs(rectF.left - rectF2.left) > 0.001f || Math.abs(rectF.top - rectF2.top) > 0.001f || Math.abs(rectF.right - rectF2.right) > 0.001f || Math.abs(rectF.bottom - rectF2.bottom) > 0.001f) {
                        ix4Var = this.p1;
                        if (ix4Var != null) {
                            ((CropPhotoScreen) ix4Var).v1().I(tx4Var);
                        }
                    } else {
                        float[] fArr = tx4Var.c;
                        float[] fArr2 = tx4VarW.c;
                        if (fArr.length != fArr2.length) {
                            ix4Var = this.p1;
                            if (ix4Var != null) {
                                ((CropPhotoScreen) ix4Var).v1().I(tx4Var);
                            }
                        } else {
                            int length = fArr.length;
                            int i = 0;
                            while (true) {
                                if (i < length) {
                                    if (Math.abs(fArr[i] - fArr2[i]) > ((i == 2 || i == 5) ? 2.0f : 0.001f)) {
                                        ix4Var = this.p1;
                                        if (ix4Var != null) {
                                            ((CropPhotoScreen) ix4Var).v1().I(tx4Var);
                                        }
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.M1 = null;
        }
        if (getMode() == jx4.a) {
            return super.onTouchEvent(motionEvent);
        }
        ix4 ix4Var2 = this.p1;
        if (ix4Var2 != null) {
            ((CropPhotoScreen) ix4Var2).v1().H();
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            long jA = qx6.a(motionEvent.getX(), motionEvent.getY());
            this.G1 = jA;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.G1 & 4294967295L));
            u8b u8bVar = this.s1;
            Object[] objArr = u8bVar.a;
            int i2 = u8bVar.b;
            for (int i3 = 0; i3 < i2; i3++) {
                tw4 tw4Var2 = (tw4) objArr[i3];
                long j = tw4Var2.a;
                float fIntBitsToFloat3 = fIntBitsToFloat - Float.intBitsToFloat((int) (j >> 32));
                float fIntBitsToFloat4 = fIntBitsToFloat2 - Float.intBitsToFloat((int) (j & 4294967295L));
                float f = (fIntBitsToFloat4 * fIntBitsToFloat4) + (fIntBitsToFloat3 * fIntBitsToFloat3);
                float f2 = this.v1;
                if (f <= f2 * f2) {
                    tw4Var = tw4Var2;
                    break;
                }
            }
            this.u1 = tw4Var;
            s();
        } else if (actionMasked2 == 1) {
            this.u1 = null;
            hx4 hx4Var = this.r1;
            removeCallbacks(hx4Var);
            postDelayed(hx4Var, 100L);
        } else if (actionMasked2 == 2) {
            tw4 tw4Var3 = this.u1;
            if (tw4Var3 != null) {
                float x = motionEvent.getX() - Float.intBitsToFloat((int) (this.G1 >> 32));
                float y = motionEvent.getY() - Float.intBitsToFloat((int) (this.G1 & 4294967295L));
                Rect rect = this.A;
                RectF rectF3 = this.A1;
                rectF3.set(rect);
                ps7 ps7Var = tw4Var3.b;
                if (x != 0.0f) {
                    p(ps7Var, x, 0.0f, rectF3);
                }
                if (y != 0.0f) {
                    p(ps7Var, 0.0f, y, rectF3);
                }
                getCropController().q(this.G);
                O(this);
                this.G1 = qx6.a(motionEvent.getX(), motionEvent.getY());
                invalidate();
                return true;
            }
        } else if (actionMasked2 == 3) {
            this.u1 = null;
            hx4 hx4Var2 = this.r1;
            removeCallbacks(hx4Var2);
            postDelayed(hx4Var2, 100L);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(ps7 ps7Var, float f, float f2, RectF rectF) {
        RectF rectF2 = this.B;
        RectF rectF3 = this.G;
        rectF2.set(rectF3);
        if (q(this, ps7Var, f, f2, rectF, 1.0f)) {
            return;
        }
        if (!q(this, ps7Var, f, f2, rectF, 0.0f)) {
            rectF3.set(rectF2);
            return;
        }
        float f3 = 0.0f;
        float f4 = 1.0f;
        for (int i = 0; i < 6; i++) {
            float f5 = (f3 + f4) * 0.5f;
            if (q(this, ps7Var, f, f2, rectF, f5)) {
                f3 = f5;
            } else {
                f4 = f5;
            }
        }
        q(this, ps7Var, f, f2, rectF, f3);
    }

    public final void s() {
        removeCallbacks(this.r1);
        ValueAnimator valueAnimator = this.q1;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
        }
        this.q1 = null;
        if (getMode() == jx4.b) {
            RectF rectF = this.B;
            u(rectF);
            if (rectF.isEmpty()) {
                return;
            }
            RectF rectF2 = this.G;
            float fWidth = rectF2.width();
            float fHeight = rectF2.height();
            float fWidth2 = rectF.width();
            float fHeight2 = rectF.height();
            if (Math.abs(fWidth - fWidth2) >= 0.5f || Math.abs(fHeight - fHeight2) >= 0.5f) {
                rectF2.set(rectF);
                getCropController().q(rectF2);
                O(this);
                R(this);
            }
        }
    }

    public final void setCropRotationAngle(float f) {
        getCropController().w = f;
    }

    public final void setCropViewListener(ix4 ix4Var) {
        this.p1 = ix4Var;
    }

    public final void setMode(jx4 jx4Var) {
        this.K1.B(this, Q1[0], jx4Var);
    }

    public final void setOnReleaseState(tx4 tx4Var) {
        this.P1 = tx4Var;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    public final void t(float f) {
        RectF rectF;
        float f2;
        if (getMode() != jx4.b) {
            return;
        }
        s();
        ay4 cropController = getCropController();
        Matrix matrix = cropController.m;
        RectF rectF2 = cropController.o;
        if (!cropController.e && (rectF = cropController.j) != null && !rectF2.isEmpty()) {
            boolean z = cropController.D && cropController.C;
            float f3 = f - (z ? cropController.B : cropController.w);
            boolean z2 = Math.abs(f3) >= 0.001f;
            boolean z3 = Math.abs(f - cropController.w) >= 0.001f;
            if (z) {
                if (z2 || z3) {
                    matrix.set(cropController.A);
                    if (z2) {
                        matrix.postRotate(f3, cropController.k(), cropController.l());
                        cropController.w = f % 360.0f;
                    } else {
                        cropController.w = cropController.B;
                    }
                    f2 = cropController.f(rectF);
                    if (f2 > 1.0f) {
                        matrix.postScale(f2, f2, rectF2.centerX(), rectF2.centerY());
                    }
                    ay4.m(cropController);
                    cropController.p();
                }
            } else if (z2) {
                if (z2) {
                    matrix.postRotate(f3, cropController.k(), cropController.l());
                    cropController.w = f % 360.0f;
                } else {
                    cropController.w = cropController.B;
                }
                f2 = cropController.f(rectF);
                if (f2 > 1.0f) {
                    matrix.postScale(f2, f2, rectF2.centerX(), rectF2.centerY());
                }
                ay4.m(cropController);
                cropController.p();
            }
        }
        R(this);
    }

    public final void u(RectF rectF) {
        RectF rectF2 = this.G;
        float fWidth = rectF2.width();
        float fHeight = rectF2.height();
        if (fWidth <= 0.0f || fHeight <= 0.0f) {
            rectF.setEmpty();
        } else {
            J(this, rectF, fWidth / fHeight);
        }
    }

    public final tx4 w() {
        Rect rect = this.A;
        if (K(rect.width(), rect.height())) {
            return null;
        }
        float fWidth = rect.width();
        if (fWidth < 1.0f) {
            fWidth = 1.0f;
        }
        float fHeight = rect.height();
        float f = fHeight >= 1.0f ? fHeight : 1.0f;
        RectF rectF = this.G;
        float f2 = rectF.left;
        float f3 = rect.left;
        float f4 = rectF.top;
        float f5 = rect.top;
        RectF rectF2 = new RectF((f2 - f3) / fWidth, (f4 - f5) / f, (rectF.right - f3) / fWidth, (rectF.bottom - f5) / f);
        int i = this.L1;
        float[] fArr = new float[9];
        getCropController().m.getValues(fArr);
        return new tx4(i, rectF2, fArr, getCropController().w);
    }

    public final void x() {
        ay4 cropController = getCropController();
        cropController.D = false;
        cropController.C = false;
        cropController.A.reset();
    }

    public final tx4 z() {
        s();
        return w();
    }
}
