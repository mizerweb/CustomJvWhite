package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import java.util.ArrayList;
import one.me.videoeditor.trimslider.VideoTrimSliderWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class x6a extends View implements eph {
    public float A;
    public final RectF B;
    public ValueAnimator C;
    public w6a D;
    public int E;
    public final u6a a;
    public final int b;
    public final Rect c;
    public final Rect d;
    public final ArrayList e;
    public Bitmap f;
    public float g;
    public float h;
    public float i;
    public boolean j;
    public float k;
    public float l;
    public t6a m;
    public final Paint n;
    public final Paint o;
    public final Paint p;
    public final Paint q;
    public final Paint r;
    public final Paint s;
    public final Paint t;
    public final Paint u;
    public final Path v;
    public final Path w;
    public final Path x;
    public final ny8 y;
    public final RectF z;

    public x6a(Context context) {
        super(context);
        this.a = new u6a();
        this.b = ViewConfiguration.get(context).getScaledTouchSlop();
        this.c = new Rect();
        this.d = new Rect();
        this.e = new ArrayList();
        this.h = 1.0f;
        this.E = 1;
        kbc kbcVarH = pq3.j.h(this);
        this.m = new t6a(kbcVarH.b().b, kbcVarH.getIcon().h, kbcVarH.getIcon().h, tre.I0(kbcVarH.b().c, 0.6f), tre.I0(((bs0) kbcVarH.i().d).b, 0.5f));
        this.n = new Paint(1);
        this.o = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.p = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.q = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        this.r = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(style);
        this.s = paint4;
        Paint paint5 = new Paint(1);
        paint5.setStyle(style);
        paint5.setMaskFilter(new BlurMaskFilter(yl5.d().getDisplayMetrics().density * 4.0f, BlurMaskFilter.Blur.NORMAL));
        this.t = paint5;
        Paint paint6 = new Paint(1);
        paint6.setStyle(style);
        this.u = paint6;
        this.v = new Path();
        this.w = new Path();
        this.x = new Path();
        this.y = rx8.P(3, new bh9(22));
        this.z = new RectF();
        this.A = 1.0f;
        this.B = new RectF();
        b();
    }

    private final float[] getOverlayRadiiArray() {
        return (float[]) this.y.getValue();
    }

    public final void a(float f, long j) {
        this.B.set(this.a.x);
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.A, f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new en1(this, f, 1));
        valueAnimatorOfFloat.start();
        this.C = valueAnimatorOfFloat;
    }

    public final void b() {
        this.o.setColor(this.m.a);
        this.p.setColor(this.m.c);
        this.m.getClass();
        this.r.setColor(-1);
        this.s.setColor(this.m.d);
        this.m.getClass();
        this.u.setColor(-1);
        this.t.setColor(this.m.e);
    }

    public final void c(int i, float f) {
        w6a w6aVar;
        w6a w6aVar2;
        w6a w6aVar3;
        int iD = qt4.D(i);
        if (iD != 0) {
            u6a u6aVar = this.a;
            if (iD == 1) {
                float fU = oc9.u(f, 0.0f, u6aVar.c(u6aVar.a(this.h) - ((u6aVar.l + u6aVar.B) * 2.0f)));
                if (fU == this.g || (w6aVar = this.D) == null) {
                    return;
                }
                ((fpi) w6aVar).a(fU, this.h);
                return;
            }
            if (iD == 2) {
                float fU2 = oc9.u(f, u6aVar.c(((u6aVar.l + u6aVar.B) * 2.0f) + u6aVar.a(this.g)), 1.0f);
                if (fU2 == this.h || (w6aVar2 = this.D) == null) {
                    return;
                }
                ((fpi) w6aVar2).a(this.g, fU2);
                return;
            }
            if (iD != 3) {
                ore.o();
                return;
            }
            float f2 = this.g;
            float f3 = this.h;
            float fA = u6aVar.a(f2);
            float f4 = u6aVar.l;
            float f5 = u6aVar.B;
            float f6 = fA + f4 + f5;
            float fA2 = (u6aVar.a(f3) - f4) - f5;
            float fA3 = u6aVar.a(f);
            if (fA2 < f6 || fA3 < f6) {
                f = f2;
            } else if (fA3 > fA2) {
                f = f3;
            }
            if (f == this.i || (w6aVar3 = this.D) == null) {
                return;
            }
            VideoTrimSliderWidget videoTrimSliderWidget = (VideoTrimSliderWidget) ((fpi) w6aVar3).b;
            zv8[] zv8VarArr = VideoTrimSliderWidget.f;
            videoTrimSliderWidget.p1().D(f);
        }
    }

    public final void d(Canvas canvas, RectF rectF) {
        u6a u6aVar = this.a;
        float f = u6aVar.u;
        float f2 = u6aVar.t;
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        float f3 = f2 / 2.0f;
        float f4 = f / 2.0f;
        float f5 = fCenterY + f4;
        RectF rectF2 = this.z;
        rectF2.set(fCenterX - f3, fCenterY - f4, fCenterX + f3, f5);
        canvas.drawRoundRect(rectF2, f3, f3, this.r);
    }

    public final void e() {
        float f = this.g;
        float f2 = this.h;
        float f3 = this.i;
        u6a u6aVar = this.a;
        u6aVar.getClass();
        u6aVar.a = oc9.u(f, 0.0f, 1.0f);
        u6aVar.b = oc9.u(f2, 0.0f, 1.0f);
        u6aVar.c = oc9.u(f3, 0.0f, 1.0f);
        u6aVar.b();
        float f4 = u6aVar.n;
        Path path = this.v;
        path.reset();
        RectF rectF = u6aVar.m;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f4, f4, direction);
        Path path2 = this.w;
        path2.reset();
        RectF rectF2 = u6aVar.v;
        if (rectF2.width() > 0.0f) {
            float f5 = rectF2.left;
            float f6 = rectF2.top;
            float f7 = rectF2.right + f4;
            float f8 = rectF2.bottom;
            float[] overlayRadiiArray = getOverlayRadiiArray();
            overlayRadiiArray[0] = f4;
            overlayRadiiArray[1] = f4;
            overlayRadiiArray[2] = 0.0f;
            overlayRadiiArray[3] = 0.0f;
            overlayRadiiArray[4] = 0.0f;
            overlayRadiiArray[5] = 0.0f;
            overlayRadiiArray[6] = f4;
            overlayRadiiArray[7] = f4;
            path2.addRoundRect(f5, f6, f7, f8, overlayRadiiArray, direction);
        }
        Path path3 = this.x;
        path3.reset();
        RectF rectF3 = u6aVar.w;
        if (rectF3.width() > 0.0f) {
            float f9 = rectF3.left - f4;
            float f10 = rectF3.top;
            float f11 = rectF3.right;
            float f12 = rectF3.bottom;
            float[] overlayRadiiArray2 = getOverlayRadiiArray();
            overlayRadiiArray2[0] = 0.0f;
            overlayRadiiArray2[1] = 0.0f;
            overlayRadiiArray2[2] = f4;
            overlayRadiiArray2[3] = f4;
            overlayRadiiArray2[4] = f4;
            overlayRadiiArray2[5] = f4;
            overlayRadiiArray2[6] = 0.0f;
            overlayRadiiArray2[7] = 0.0f;
            path3.addRoundRect(f9, f10, f11, f12, overlayRadiiArray2, direction);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.e;
            arrayList.clear();
            Rect rect = u6aVar.p;
            Rect rect2 = this.c;
            rect2.set(rect);
            arrayList.add(rect2);
            Rect rect3 = u6aVar.r;
            Rect rect4 = this.d;
            rect4.set(rect3);
            arrayList.add(rect4);
            setSystemGestureExclusionRects(arrayList);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.C = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSave = canvas.save();
        canvas.clipPath(this.v);
        try {
            canvas.drawPaint(this.o);
            Bitmap bitmap = this.f;
            u6a u6aVar = this.a;
            if (bitmap != null && !bitmap.isRecycled()) {
                canvas.drawBitmap(bitmap, (Rect) null, u6aVar.m, this.n);
            }
            canvas.restoreToCount(iSave);
            RectF rectF = u6aVar.v;
            float fWidth = rectF.width();
            Paint paint = this.s;
            if (fWidth > 0.0f) {
                int iSave2 = canvas.save();
                canvas.clipPath(this.w);
                try {
                    canvas.drawRect(rectF, paint);
                    canvas.restoreToCount(iSave2);
                } catch (Throwable th) {
                    canvas.restoreToCount(iSave2);
                    throw th;
                }
            }
            RectF rectF2 = u6aVar.w;
            if (rectF2.width() > 0.0f) {
                int iSave3 = canvas.save();
                canvas.clipPath(this.x);
                try {
                    canvas.drawRect(rectF2, paint);
                    canvas.restoreToCount(iSave3);
                } catch (Throwable th2) {
                    canvas.restoreToCount(iSave3);
                    throw th2;
                }
            }
            RectF rectF3 = u6aVar.g;
            float f = u6aVar.h;
            RectF rectF4 = u6aVar.i;
            float f2 = u6aVar.j;
            int iSaveLayer = canvas.saveLayer(rectF3, null);
            canvas.drawRoundRect(rectF3, f, f, this.p);
            canvas.drawRoundRect(rectF4, f2, f2, this.q);
            canvas.restoreToCount(iSaveLayer);
            d(canvas, u6aVar.o);
            d(canvas, u6aVar.q);
            if (this.A <= 0.0f) {
                return;
            }
            ValueAnimator valueAnimator = this.C;
            RectF rectF5 = (valueAnimator == null || !valueAnimator.isStarted()) ? u6aVar.x : this.B;
            float f3 = this.A;
            int i = (int) (f3 * 255.0f);
            int i2 = this.m.e;
            int iI0 = lvb.I0(i2, (((i2 >> 24) & 255) / 255.0f) * f3);
            Paint paint2 = this.t;
            paint2.setColor(iI0);
            canvas.drawRect(rectF5, paint2);
            Paint paint3 = this.u;
            paint3.setAlpha(i);
            float f4 = u6aVar.y;
            canvas.drawRoundRect(rectF5, f4, f4, paint3);
        } catch (Throwable th3) {
            canvas.restoreToCount(iSave);
            throw th3;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        u6a u6aVar = this.a;
        u6aVar.getClass();
        RectF rectF = u6aVar.m;
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        if (paddingTop < 0) {
            paddingTop = 0;
        }
        if (paddingRight < 0) {
            paddingRight = 0;
        }
        if (paddingBottom < 0) {
            paddingBottom = 0;
        }
        RectF rectF2 = u6aVar.d;
        rectF2.set(paddingLeft, paddingTop, i - paddingRight, i2 - paddingBottom);
        RectF rectF3 = u6aVar.e;
        float f = rectF2.left;
        float f2 = rectF2.top;
        float f3 = u6aVar.f;
        rectF3.set(f, f2 + f3, rectF2.right, rectF2.bottom - f3);
        rectF.set(rectF3);
        u6aVar.b();
        e();
        w6a w6aVar = this.D;
        if (w6aVar != null) {
            float fWidth = rectF.width();
            if (fWidth < 0.0f) {
                fWidth = 0.0f;
            }
            int i5 = (int) fWidth;
            float fHeight = rectF.height();
            int i6 = (int) (fHeight >= 0.0f ? fHeight : 0.0f);
            VideoTrimSliderWidget videoTrimSliderWidget = (VideoTrimSliderWidget) ((fpi) w6aVar).b;
            zv8[] zv8VarArr = VideoTrimSliderWidget.f;
            a5j a5jVarP1 = videoTrimSliderWidget.p1();
            a5jVarP1.getClass();
            if (i5 <= 0 || i6 <= 0) {
                return;
            }
            int i7 = (int) (i6 * 0.6666667f);
            int i8 = i7 < 1 ? 1 : i7;
            int i9 = ((int) (i5 / i8)) + 1;
            if (i9 == a5jVarP1.t && i8 == a5jVarP1.u && i6 == a5jVarP1.v) {
                return;
            }
            a5jVarP1.t = i9;
            a5jVarP1.u = i8;
            a5jVarP1.v = i6;
            a5jVarP1.w = i5;
            a5jVarP1.C(a5jVarP1.s, i9, i8, i6, i5);
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.m = new t6a(kbcVar.b().b, kbcVar.getIcon().h, kbcVar.getIcon().h, tre.I0(kbcVar.b().c, 0.6f), tre.I0(((bs0) kbcVar.i().d).b, 0.5f));
        b();
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        ViewParent parent;
        w6a w6aVar;
        int i3;
        b5j b5jVar;
        int action = motionEvent.getAction();
        u6a u6aVar = this.a;
        if (action == 0) {
            this.k = motionEvent.getX();
            this.l = motionEvent.getY();
            this.j = false;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (u6aVar.p.contains(gm0.K(x), gm0.K(y))) {
                i = 2;
            } else if (u6aVar.r.contains(gm0.K(x), gm0.K(y))) {
                i = 3;
            } else {
                i = u6aVar.z.contains(x, y) ? 4 : 1;
            }
            this.E = i;
            if (i != 1) {
                w6a w6aVar2 = this.D;
                if (w6aVar2 != null) {
                    float fC = u6aVar.c(motionEvent.getX());
                    VideoTrimSliderWidget videoTrimSliderWidget = (VideoTrimSliderWidget) ((fpi) w6aVar2).b;
                    zv8[] zv8VarArr = VideoTrimSliderWidget.f;
                    b5j b5jVar2 = videoTrimSliderWidget.p1().x;
                    if (b5jVar2 != null) {
                        b5jVar2.m(i, fC);
                    }
                }
                p0m.a(this, lt7.GESTURE_START);
                ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                }
                int i4 = this.E;
                if (i4 == 2 || i4 == 3) {
                    a(0.0f, 150L);
                }
                if (this.E == 4 && !this.j) {
                    this.j = true;
                    c(4, u6aVar.c(motionEvent.getX()));
                }
            }
        } else if (action == 1) {
            i2 = this.E;
            if (i2 != 1) {
                if (i2 != 2 || i2 == 3) {
                    a(1.0f, 200L);
                }
                w6aVar = this.D;
                if (w6aVar != null) {
                    i3 = this.E;
                    u6aVar.c(motionEvent.getX());
                    VideoTrimSliderWidget videoTrimSliderWidget2 = (VideoTrimSliderWidget) ((fpi) w6aVar).b;
                    zv8[] zv8VarArr2 = VideoTrimSliderWidget.f;
                    b5jVar = videoTrimSliderWidget2.p1().x;
                    if (b5jVar != null) {
                        b5jVar.h(i3);
                    }
                }
                p0m.a(this, kt7.GESTURE_END);
            }
            this.E = 1;
            this.j = false;
            parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
                return true;
            }
        } else if (action != 2) {
            if (action == 3) {
                i2 = this.E;
                if (i2 != 1) {
                    if (i2 != 2) {
                        a(1.0f, 200L);
                    } else {
                        a(1.0f, 200L);
                    }
                    w6aVar = this.D;
                    if (w6aVar != null) {
                        i3 = this.E;
                        u6aVar.c(motionEvent.getX());
                        VideoTrimSliderWidget videoTrimSliderWidget3 = (VideoTrimSliderWidget) ((fpi) w6aVar).b;
                        zv8[] zv8VarArr3 = VideoTrimSliderWidget.f;
                        b5jVar = videoTrimSliderWidget3.p1().x;
                        if (b5jVar != null) {
                            b5jVar.h(i3);
                        }
                    }
                    p0m.a(this, kt7.GESTURE_END);
                }
                this.E = 1;
                this.j = false;
                parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                    return true;
                }
            }
        } else if (this.E != 1) {
            if (!this.j) {
                float fAbs = Math.abs(motionEvent.getX() - this.k);
                float fAbs2 = Math.abs(motionEvent.getY() - this.l);
                float f = this.b;
                if (fAbs > f || fAbs2 > f) {
                    this.j = true;
                }
            }
            if (this.j) {
                c(this.E, u6aVar.c(motionEvent.getX()));
                return true;
            }
        }
        return true;
    }

    public final void setBackgroundBitmap(Bitmap bitmap) {
        if (cqk.d(this.f, bitmap)) {
            return;
        }
        Bitmap bitmap2 = this.f;
        if (bitmap2 != null) {
            rel.b(bitmap2);
        }
        this.f = bitmap;
        invalidate();
    }

    public final void setListener(w6a w6aVar) {
        this.D = w6aVar;
    }

    public final void setPlayheadPosition(float f) {
        if (this.i == f) {
            return;
        }
        this.i = oc9.u(f, 0.0f, 1.0f);
        e();
        invalidate();
    }
}
