package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class pyi extends View implements eph {
    public static final /* synthetic */ zv8[] A;
    public nyi a;
    public boolean b;
    public int c;
    public final Paint d;
    public int e;
    public PorterDuffColorFilter f;
    public final ny8 g;
    public final Paint h;
    public int i;
    public final Paint j;
    public final t5d k;
    public float l;
    public ValueAnimator m;
    public float n;
    public boolean o;
    public boolean p;
    public Float q;
    public ValueAnimator r;
    public float s;
    public float t;
    public ValueAnimator u;
    public boolean v;
    public final RectF w;
    public final ny8 x;
    public final ny8 y;
    public final GestureDetector z;

    static {
        z8b z8bVar = new z8b(pyi.class, "isInPause", "isInPause()Z");
        zfe.a.getClass();
        A = new zv8[]{z8bVar};
    }

    public pyi(Context context) {
        super(context);
        this.b = true;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(yl5.d().getDisplayMetrics().density * 4.0f);
        this.d = paint;
        this.g = rx8.P(3, new yfi(23));
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(yl5.d().getDisplayMetrics().density * 4.0f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.h = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.FILL);
        this.j = paint3;
        this.k = new t5d(this);
        this.s = yl5.d().getDisplayMetrics().density * 4.0f;
        this.t = yl5.d().getDisplayMetrics().density * 16.0f;
        this.w = new RectF();
        r7 r7Var = r7.a;
        this.x = new h(r7.d(ha9.b)).getAccessor().d(927);
        ny8 ny8VarP = rx8.P(3, new j0i(this, 8, context));
        this.y = ny8VarP;
        this.z = new GestureDetector(context, new pi9(15, this));
        setElevation(2.0f);
        onThemeChanged(pq3.j.h(this));
        if (isAttachedToWindow()) {
            addOnAttachStateChangeListener(new ga0(this, 15, this));
        } else if (ny8VarP.d()) {
            getBitmapPool().d(ny8VarP.getValue());
        }
    }

    public static Bitmap a(pyi pyiVar, Context context) {
        return uel.b(pyiVar.getBitmapPool(), context, R.drawable.icon_play_fill);
    }

    public final fy0 getBitmapPool() {
        return (fy0) this.x.getValue();
    }

    private final Paint getDragPaint() {
        return (Paint) this.g.getValue();
    }

    public final void setInPause(boolean z) {
        this.k.B(this, A[0], Boolean.valueOf(z));
    }

    public final void d(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        ValueAnimator valueAnimator = this.u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f5 = this.t;
        if (z) {
            f = yl5.d().getDisplayMetrics().density;
            f2 = 12.0f;
        } else {
            f = yl5.d().getDisplayMetrics().density;
            f2 = 16.0f;
        }
        float f6 = f * f2;
        float f7 = this.s;
        if (z) {
            f3 = yl5.d().getDisplayMetrics().density;
            f4 = 5.0f;
        } else {
            f3 = yl5.d().getDisplayMetrics().density;
            f4 = 4.0f;
        }
        float f8 = f3 * f4;
        if (!z) {
            this.v = true;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new i2e(this, f5, f6, f7, f8, 1));
        valueAnimatorOfFloat.addListener(new oyi(this, 0));
        valueAnimatorOfFloat.start();
        this.u = valueAnimatorOfFloat;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        ValueAnimator valueAnimator = this.r;
        if ((valueAnimator == null || !valueAnimator.isRunning() || this.v) && (!i() || this.o)) {
            canvas2 = canvas;
        } else {
            int iF = f(this.i);
            Paint paint = this.j;
            paint.setAlpha(iF);
            canvas2 = canvas;
            canvas2.drawOval(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), paint);
            getDragPaint().setAlpha(f(this.e));
            float f = (yl5.d().getDisplayMetrics().density * 48.0f) / 2.0f;
            RectF rectF = this.w;
            rectF.set(width - f, height - f, width + f, f + height);
            canvas2.drawBitmap((Bitmap) this.y.getValue(), (Rect) null, rectF, getDragPaint());
        }
        ValueAnimator valueAnimator2 = this.r;
        if ((valueAnimator2 == null || !valueAnimator2.isRunning()) && !i()) {
            if (i()) {
                return;
            }
            h(canvas2, width, height);
            return;
        }
        int iF2 = f(this.c);
        Paint paint2 = this.d;
        paint2.setAlpha(iF2);
        canvas2.drawCircle(width, height, this.n, paint2);
        h(canvas2, width, height);
        getDragPaint().setAlpha(f(this.e));
        long jE = e(width, height);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE & 4294967295L));
        ValueAnimator valueAnimator3 = this.r;
        float animatedFraction = valueAnimator3 != null ? valueAnimator3.getAnimatedFraction() : 0.0f;
        ValueAnimator valueAnimator4 = this.r;
        boolean z = valueAnimator4 != null && valueAnimator4.isRunning() && i();
        float f2 = this.t;
        canvas2.drawCircle(fIntBitsToFloat, fIntBitsToFloat2, z ? animatedFraction * f2 : (1.0f - animatedFraction) * f2, getDragPaint());
    }

    public final long e(float f, float f2) {
        double radians = Math.toRadians(((this.l * 360.0f) / 100.0f) - 90.0f);
        return qx6.a((this.n * ((float) Math.cos(radians))) + f, (this.n * ((float) Math.sin(radians))) + f2);
    }

    public final int f(int i) {
        ValueAnimator valueAnimator = this.r;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        ValueAnimator valueAnimator2 = this.r;
        return (valueAnimator2 != null && valueAnimator2.isRunning() && i()) ? gm0.K(animatedFraction * i) : zo5.D(animatedFraction, i, i);
    }

    public final float g() {
        int iMin = Math.min(getWidth(), getHeight());
        return (i() ? r5a.f(27.0f, yl5.d().getDisplayMetrics().density, 2, iMin) : r5a.f(8.0f, yl5.d().getDisplayMetrics().density, 2, iMin)) / 2.0f;
    }

    public final nyi getListener() {
        return this.a;
    }

    public final void h(Canvas canvas, float f, float f2) {
        float f3 = (this.l * 360.0f) / 100.0f;
        float f4 = this.n;
        RectF rectF = this.w;
        rectF.set(f - f4, f2 - f4, f + f4, f2 + f4);
        canvas.drawArc(rectF, -90.0f, f3, false, this.h);
    }

    public final boolean i() {
        zv8 zv8Var = A[0];
        return ((Boolean) this.k.b).booleanValue();
    }

    public final void j() {
        if (this.b) {
            setInPause(true);
        }
    }

    public final void k() {
        ValueAnimator valueAnimator = this.m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.l = 0.0f;
        setInPause(false);
    }

    public final void l(float f, boolean z) {
        if (this.o) {
            return;
        }
        if (i()) {
            setInPause(false);
        }
        if (!z) {
            setProgressForced(f);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.l, oc9.u(f, 0.0f, 100.0f));
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new myi(this, 0));
        valueAnimatorOfFloat.start();
        this.m = valueAnimatorOfFloat;
    }

    public final void m(float f, float f2) {
        this.l = ((((((float) Math.toDegrees(Math.atan2(f2, f))) + 90.0f) + 360.0f) % 360.0f) / 360.0f) * 100.0f;
        postInvalidateOnAnimation();
        Float f3 = this.q;
        if (f3 != null && Math.signum(f) != Math.signum(f3.floatValue()) && f2 < 0.0f) {
            p0m.a(this, mt7.LONG_PRESS);
        }
        this.q = Float.valueOf(f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.n = g();
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        Paint paint = this.d;
        paint.setColor(1392508927);
        this.c = paint.getAlpha();
        this.f = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        getDragPaint().setColor(-1);
        Paint dragPaint = getDragPaint();
        PorterDuffColorFilter porterDuffColorFilter = this.f;
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = null;
        }
        dragPaint.setColorFilter(porterDuffColorFilter);
        this.e = getDragPaint().getAlpha();
        this.h.setColor(-1191182337);
        int i = kbcVar.b().g;
        Paint paint2 = this.j;
        paint2.setColor(i);
        this.i = paint2.getAlpha();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.b) {
            return false;
        }
        if (this.o && motionEvent.getAction() == 1) {
            m(motionEvent.getX() - (getWidth() / 2.0f), motionEvent.getY() - (getHeight() / 2.0f));
            nyi nyiVar = this.a;
            if (nyiVar != null) {
                ((izi) nyiVar).a0();
            }
            this.o = false;
            this.q = null;
            getParent().requestDisallowInterceptTouchEvent(false);
            d(false);
            return true;
        }
        if (!this.o || motionEvent.getAction() != 2) {
            return this.z.onTouchEvent(motionEvent);
        }
        this.p = true;
        m(motionEvent.getX() - (getWidth() / 2.0f), motionEvent.getY() - (getHeight() / 2.0f));
        nyi nyiVar2 = this.a;
        if (nyiVar2 != null) {
            ((izi) nyiVar2).b0(this.l, true);
        }
        return true;
    }

    public final void setListener(nyi nyiVar) {
        this.a = nyiVar;
    }

    public final void setPausingEnabled(boolean z) {
        this.b = z;
    }

    public final void setProgressForced(float f) {
        if (isAttachedToWindow() && (this.o || i())) {
            return;
        }
        this.l = oc9.u(f, 0.0f, 100.0f);
        postInvalidateOnAnimation();
    }
}
