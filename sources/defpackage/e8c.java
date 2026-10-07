package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class e8c extends View implements eph {
    public static final /* synthetic */ zv8[] C = {new z8b(e8c.class, "selectedTrackColor", "getSelectedTrackColor()I"), zo5.e(zfe.a, e8c.class, "rangeIndicatorColor", "getRangeIndicatorColor()I"), new z8b(e8c.class, "unselectedTrackColor", "getUnselectedTrackColor()I"), new z8b(e8c.class, "leftIndicatorSpace", "getLeftIndicatorSpace()F"), new z8b(e8c.class, "rightIndicatorSpace", "getRightIndicatorSpace()F"), new z8b(e8c.class, "leftIndicatorGap", "getLeftIndicatorGap()F"), new z8b(e8c.class, "rightIndicatorGap", "getRightIndicatorGap()F"), new z8b(e8c.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/theme/OneMeTheme;")};
    public ValueAnimator A;
    public ValueAnimator B;
    public final int a;
    public final rag b;
    public final Paint c;
    public final oag d;
    public final d8c e;
    public final d8c f;
    public final d8c g;
    public int h;
    public final a8c i;
    public final a8c j;
    public boolean k;
    public float l;
    public float m;
    public final Paint n;
    public final TextPaint o;
    public boolean p;
    public boolean q;
    public final d8c r;
    public final d8c s;
    public final d8c t;
    public final d8c u;
    public final ArrayList v;
    public final d8c w;
    public float x;
    public final int y;
    public final ny8 z;

    /* JADX WARN: Type inference failed for: r5v11, types: [a8c] */
    /* JADX WARN: Type inference failed for: r5v12, types: [a8c] */
    public e8c(Context context) {
        super(context);
        this.a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.b = new rag();
        Paint paint = new Paint();
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(yl5.d().getDisplayMetrics().density * 4.0f);
        this.c = paint;
        oag oagVar = new oag();
        oagVar.t = paint.getStrokeWidth();
        this.d = oagVar;
        this.e = new d8c(Integer.valueOf(R.attr.icon_themed), this);
        final int i = 1;
        this.f = new d8c(this, 1);
        this.g = new d8c(this, 2);
        final int i2 = 0;
        this.i = new Runnable(this) { // from class: a8c
            public final /* synthetic */ e8c b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                e8c e8cVar = this.b;
                switch (i3) {
                    case 0:
                        Iterator it = e8cVar.v.iterator();
                        while (it.hasNext()) {
                            ((c8c) it.next()).a(e8cVar, e8cVar.b.d, true);
                        }
                        break;
                    default:
                        Iterator it2 = e8cVar.v.iterator();
                        while (it2.hasNext()) {
                            ((c8c) it2.next()).a(e8cVar, e8cVar.b.d, false);
                        }
                        break;
                }
            }
        };
        this.j = new Runnable(this) { // from class: a8c
            public final /* synthetic */ e8c b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                e8c e8cVar = this.b;
                switch (i3) {
                    case 0:
                        Iterator it = e8cVar.v.iterator();
                        while (it.hasNext()) {
                            ((c8c) it.next()).a(e8cVar, e8cVar.b.d, true);
                        }
                        break;
                    default:
                        Iterator it2 = e8cVar.v.iterator();
                        while (it2.hasNext()) {
                            ((c8c) it2.next()).a(e8cVar, e8cVar.b.d, false);
                        }
                        break;
                }
            }
        };
        this.l = Float.NaN;
        this.m = -1.0f;
        Paint paint2 = new Paint();
        paint2.setShadowLayer(yl5.d().getDisplayMetrics().density * 4.0f, 0.0f, 0.0f, tre.I0(-16777216, 0.12f));
        this.n = paint2;
        TextPaint textPaint = new TextPaint();
        p90.Q(this, textPaint, q9i.f);
        this.o = textPaint;
        this.p = true;
        this.q = true;
        this.r = new d8c(this, 3);
        this.s = new d8c(this, 4);
        this.t = new d8c(this, 5);
        this.u = new d8c(this, 6);
        this.v = new ArrayList();
        this.w = new d8c(this, 7);
        this.x = yl5.d().getDisplayMetrics().density * 12.0f;
        this.y = gm0.K(68.0f * yl5.d().getDisplayMetrics().density);
        this.z = rx8.P(3, new cka(13));
        setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), getPaddingTop(), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), getPaddingBottom());
        onThemeChanged(getCurrentTheme());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kbc getCurrentTheme() {
        kbc customTheme = getCustomTheme();
        return customTheme == null ? pq3.j.h(this) : customTheme;
    }

    private final PathInterpolator getThumbInterpolator() {
        return (PathInterpolator) this.z.getValue();
    }

    private static /* synthetic */ void getThumbInterpolator$annotations() {
    }

    private final void setLastThumbSnap(float f) {
        rag ragVar = this.b;
        float f2 = ragVar.d;
        qag qagVar = ragVar.c;
        zv8 zv8Var = rag.g[2];
        float fFloatValue = ((Number) qagVar.b).floatValue() / 2.0f;
        int i = ragVar.e;
        for (int i2 = 0; i2 < i; i2++) {
            oag oagVar = this.d;
            RectF rectF = oagVar.b;
            float fB = oagVar.r.b(i2);
            rectF.left = fB;
            rectF.right = fB;
            rectF.top = oagVar.o;
            rectF.bottom = oagVar.p;
            if (Math.abs(rectF.centerX() - f) <= fFloatValue) {
                float fB2 = ragVar.b();
                zv8 zv8Var2 = rag.g[2];
                ragVar.d((((Number) qagVar.b).floatValue() * i2) + fB2);
                if (ragVar.d != f2) {
                    a8c a8cVar = this.i;
                    removeCallbacks(a8cVar);
                    removeCallbacks(this.j);
                    post(a8cVar);
                }
            }
        }
        this.l = f;
    }

    public final void b(float f) {
        float f2 = this.x;
        if (f2 == f) {
            return;
        }
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f);
        valueAnimatorOfFloat.setDuration(333L);
        valueAnimatorOfFloat.setInterpolator(getThumbInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new b8c(this, 1));
        valueAnimatorOfFloat.start();
        this.A = valueAnimatorOfFloat;
    }

    public final boolean c() {
        ViewParent parent = getParent();
        while (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    public final kbc getCustomTheme() {
        zv8 zv8Var = C[7];
        return (kbc) this.w.b;
    }

    public final float getFrom() {
        return this.b.b();
    }

    public final float getLeftIndicatorGap() {
        zv8 zv8Var = C[5];
        return ((Number) this.t.b).floatValue();
    }

    public final float getLeftIndicatorSpace() {
        zv8 zv8Var = C[3];
        return ((Number) this.r.b).floatValue();
    }

    public final int getRangeIndicatorColor() {
        zv8 zv8Var = C[1];
        return ((Number) this.f.b).intValue();
    }

    public final float getRightIndicatorGap() {
        zv8 zv8Var = C[6];
        return ((Number) this.u.b).floatValue();
    }

    public final float getRightIndicatorSpace() {
        zv8 zv8Var = C[4];
        return ((Number) this.s.b).floatValue();
    }

    public final int getSelectedTrackColor() {
        zv8 zv8Var = C[0];
        return ((Number) this.e.b).intValue();
    }

    public final boolean getThumbIsPressed() {
        return this.k;
    }

    public final float getTo() {
        return this.b.c();
    }

    public final int getUnselectedTrackColor() {
        zv8 zv8Var = C[2];
        return ((Number) this.g.b).intValue();
    }

    public final float getValue() {
        return this.b.d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z = this.p;
        oag oagVar = this.d;
        if (z) {
            float fApplyDimension = TypedValue.applyDimension(2, 12.0f, yl5.d().getDisplayMetrics());
            TextPaint textPaint = this.o;
            textPaint.setTextSize(fApplyDimension);
            PointF pointF = oagVar.a;
            float f = oagVar.u;
            int i = oagVar.e;
            float f2 = f > 0.0f ? ((f / 2.0f) + i) - (oagVar.j / 2.0f) : i;
            pointF.x = f2;
            float f3 = (oagVar.d / 2.0f) + oagVar.k;
            pointF.y = f3;
            canvas.drawText("A", f2, f3, textPaint);
            textPaint.setTextSize(TypedValue.applyDimension(2, 18.0f, yl5.d().getDisplayMetrics()));
            PointF pointF2 = oagVar.a;
            float f4 = oagVar.v;
            int i2 = oagVar.c;
            int i3 = oagVar.g;
            float f5 = oagVar.m;
            float f6 = f4 > 0.0f ? (i2 - i3) - ((f4 + f5) / 2.0f) : (i2 - i3) - f5;
            pointF2.x = f6;
            float f7 = (oagVar.d / 2.0f) + oagVar.n;
            pointF2.y = f7;
            canvas.drawText("A", f6, f7, textPaint);
        }
        RectF rectF = oagVar.z;
        RectF rectF2 = oagVar.y;
        PointF pointF3 = oagVar.a;
        pointF3.x = oagVar.A;
        pointF3.y = rectF2.centerY();
        float f8 = pointF3.x;
        int iZ = oc9.Z(getSelectedTrackColor(), getCurrentTheme());
        Paint paint = this.c;
        paint.setColor(iZ);
        canvas.drawLine(rectF.left, rectF.top, f8, rectF.bottom, paint);
        int i4 = this.b.e;
        for (int i5 = 0; i5 < i4; i5++) {
            RectF rectF3 = oagVar.b;
            float fB = oagVar.r.b(i5);
            rectF3.left = fB;
            rectF3.right = fB;
            rectF3.top = oagVar.o;
            rectF3.bottom = oagVar.p;
            if (fB > f8) {
                paint.setColor(this.h);
            }
            if (this.q) {
                Paint paint2 = paint;
                canvas.drawLine(rectF3.left, rectF3.top, rectF3.right, rectF3.bottom, paint2);
                paint = paint2;
            }
        }
        canvas.drawLine(f8, rectF.top, rectF.right, rectF.bottom, paint);
        pointF3.x = oagVar.A;
        float fCenterY = rectF2.centerY();
        pointF3.y = fCenterY;
        canvas.drawCircle(pointF3.x, fCenterY, this.x, this.n);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z = this.p;
        oag oagVar = this.d;
        if (z) {
            float f = yl5.d().getDisplayMetrics().density * 12.0f;
            TextPaint textPaint = this.o;
            textPaint.setTextSize(f);
            float fMeasureText = textPaint.measureText("A");
            float f2 = textPaint.getFontMetrics().descent;
            textPaint.setTextSize(yl5.d().getDisplayMetrics().density * 18.0f);
            float fMeasureText2 = textPaint.measureText("A");
            float f3 = textPaint.getFontMetrics().descent;
            oagVar.getClass();
            float rightIndicatorGap = 0.0f;
            float f4 = fMeasureText < 0.0f ? 0.0f : fMeasureText;
            oagVar.j = f4;
            oagVar.i = f4 + gm0.K(yl5.d().getDisplayMetrics().density * 20.0f);
            oagVar.k = f2;
            oagVar.d();
            oagVar.b(oagVar.q);
            float f5 = fMeasureText2 < 0.0f ? 0.0f : fMeasureText2;
            oagVar.m = f5;
            oagVar.l = f5 + gm0.K(yl5.d().getDisplayMetrics().density * 20.0f);
            oagVar.n = f3;
            oagVar.d();
            oagVar.b(oagVar.q);
            if (getLeftIndicatorSpace() > 0.0f || getRightIndicatorSpace() > 0.0f) {
                if (getLeftIndicatorSpace() > 0.0f) {
                    fMeasureText = yl5.d().getDisplayMetrics().density * getLeftIndicatorSpace();
                }
                if (getRightIndicatorSpace() > 0.0f) {
                    fMeasureText2 = getRightIndicatorSpace() * yl5.d().getDisplayMetrics().density;
                }
                float leftIndicatorGap = getLeftIndicatorGap() > 0.0f ? getLeftIndicatorGap() * yl5.d().getDisplayMetrics().density : 0.0f;
                if (getRightIndicatorGap() > 0.0f) {
                    rightIndicatorGap = yl5.d().getDisplayMetrics().density * getRightIndicatorGap();
                }
                oagVar.u = fMeasureText;
                oagVar.v = fMeasureText2;
                oagVar.w = leftIndicatorGap;
                oagVar.x = rightIndicatorGap;
                oagVar.d();
                oagVar.b(oagVar.q);
            } else {
                gm0.K(yl5.d().getDisplayMetrics().density * 20.0f);
                gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
                oagVar.u = 0.0f;
                oagVar.v = 0.0f;
                oagVar.w = 0.0f;
                oagVar.x = 0.0f;
                oagVar.d();
                oagVar.b(oagVar.q);
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.resolveSize(this.y, i2));
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        oagVar.getClass();
        if (measuredWidth < 0) {
            measuredWidth = 0;
        }
        oagVar.c = measuredWidth;
        if (measuredHeight < 0) {
            measuredHeight = 0;
        }
        oagVar.d = measuredHeight;
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        oagVar.e = paddingLeft;
        if (paddingTop < 0) {
            paddingTop = 0;
        }
        oagVar.f = paddingTop;
        if (paddingRight < 0) {
            paddingRight = 0;
        }
        oagVar.g = paddingRight;
        if (paddingBottom < 0) {
            paddingBottom = 0;
        }
        oagVar.h = paddingBottom;
        oagVar.d();
        oagVar.b(oagVar.q);
        oagVar.c(oagVar.A);
        rag ragVar = this.b;
        oagVar.b(ragVar.e);
        RectF rectF = oagVar.y;
        if (this.k) {
            return;
        }
        oagVar.c(oagVar.a((rectF.width() * ragVar.f) + rectF.left));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.h = getUnselectedTrackColor() != 0 ? getUnselectedTrackColor() : mx3.c(getCurrentTheme().B().b, getCurrentTheme().b().f);
        this.c.setColor(oc9.Z(getSelectedTrackColor(), kbcVar));
        getCurrentTheme().getIcon();
        this.n.setColor(-1);
        this.o.setColor(getRangeIndicatorColor() != 0 ? oc9.Z(getRangeIndicatorColor(), kbcVar) : getCurrentTheme().getText().d);
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b5  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        iua iuaVar;
        float f2;
        ValueAnimator valueAnimator;
        if (isEnabled()) {
            int action = motionEvent.getAction();
            oag oagVar = this.d;
            if (action == 0) {
                this.m = motionEvent.getX();
                if (!c()) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    requestFocus();
                    this.k = true;
                    b(yl5.d().getDisplayMetrics().density * 16.0f);
                    setLastThumbSnap(oagVar.a(motionEvent.getX()));
                    oagVar.c(motionEvent.getX());
                    p0m.a(this, lt7.GESTURE_START);
                }
            } else if (action == 1) {
                this.k = false;
                b(yl5.d().getDisplayMetrics().density * 12.0f);
                setLastThumbSnap(oagVar.a(motionEvent.getX()));
                removeCallbacks(this.i);
                f = this.l;
                iuaVar = new iua(14, this);
                PointF pointF = oagVar.a;
                pointF.x = oagVar.A;
                pointF.y = oagVar.y.centerY();
                f2 = pointF.x;
                if (Math.abs(f2 - f) < 1.0f) {
                    iuaVar.invoke();
                } else {
                    valueAnimator = this.B;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f);
                    valueAnimatorOfFloat.setDuration(180L);
                    valueAnimatorOfFloat.setInterpolator(new ll6());
                    valueAnimatorOfFloat.addUpdateListener(new b8c(this, 0));
                    valueAnimatorOfFloat.addListener(new li(12, iuaVar));
                    valueAnimatorOfFloat.start();
                    this.B = valueAnimatorOfFloat;
                }
            } else if (action == 2) {
                if (!this.k) {
                    if (!c() || Math.abs(motionEvent.getX() - this.m) >= this.a) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                }
                this.k = true;
                oagVar.c(motionEvent.getX());
                float fA = oagVar.a(motionEvent.getX());
                if (Math.abs(fA - this.l) > 1.0f) {
                    p0m.a(this, kt7.CLOCK_TICK);
                    setLastThumbSnap(fA);
                }
            } else if (action == 3) {
                this.k = false;
                b(yl5.d().getDisplayMetrics().density * 12.0f);
                setLastThumbSnap(oagVar.a(motionEvent.getX()));
                removeCallbacks(this.i);
                f = this.l;
                iuaVar = new iua(14, this);
                PointF pointF2 = oagVar.a;
                pointF2.x = oagVar.A;
                pointF2.y = oagVar.y.centerY();
                f2 = pointF2.x;
                if (Math.abs(f2 - f) < 1.0f) {
                    iuaVar.invoke();
                } else {
                    valueAnimator = this.B;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f2, f);
                    valueAnimatorOfFloat2.setDuration(180L);
                    valueAnimatorOfFloat2.setInterpolator(new ll6());
                    valueAnimatorOfFloat2.addUpdateListener(new b8c(this, 0));
                    valueAnimatorOfFloat2.addListener(new li(12, iuaVar));
                    valueAnimatorOfFloat2.start();
                    this.B = valueAnimatorOfFloat2;
                }
            }
            invalidate();
            return true;
        }
        return false;
    }

    public final void setCustomTheme(kbc kbcVar) {
        this.w.B(this, C[7], kbcVar);
    }

    public final void setDrawSteps(boolean z) {
        this.q = z;
    }

    public final void setExtendTrack(boolean z) {
        oag oagVar = this.d;
        oagVar.s = z;
        oagVar.d();
        if (z) {
            int iK = gm0.K(gm0.K(2.0f) * yl5.d().getDisplayMetrics().density);
            setPaddingRelative(iK, getPaddingTop(), iK, getPaddingBottom());
        } else {
            setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), getPaddingTop(), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), getPaddingBottom());
        }
    }

    public final void setLeftIndicatorGap(float f) {
        this.t.B(this, C[5], Float.valueOf(f));
    }

    public final void setLeftIndicatorSpace(float f) {
        this.r.B(this, C[3], Float.valueOf(f));
    }

    public final void setRangeIndicatorColor(int i) {
        this.f.B(this, C[1], Integer.valueOf(i));
    }

    public final void setRightIndicatorGap(float f) {
        this.u.B(this, C[6], Float.valueOf(f));
    }

    public final void setRightIndicatorSpace(float f) {
        this.s.B(this, C[4], Float.valueOf(f));
    }

    public final void setSelectedTrackColor(int i) {
        this.e.B(this, C[0], Integer.valueOf(i));
    }

    public final void setStepSize(float f) {
        rag ragVar = this.b;
        float f2 = ragVar.d;
        ragVar.c.B(ragVar, rag.g[2], Float.valueOf(f));
        int i = ragVar.e;
        oag oagVar = this.d;
        oagVar.b(i);
        RectF rectF = oagVar.y;
        oagVar.c(oagVar.a((rectF.width() * ragVar.f) + rectF.left));
        if (f2 != ragVar.d) {
            removeCallbacks(this.i);
            a8c a8cVar = this.j;
            removeCallbacks(a8cVar);
            post(a8cVar);
        }
        postInvalidate();
    }

    public final void setUnselectedTrackColor(int i) {
        this.g.B(this, C[2], Integer.valueOf(i));
    }

    public final void setValue(float f) {
        rag ragVar = this.b;
        float f2 = ragVar.d;
        ragVar.d(f);
        int i = ragVar.e;
        oag oagVar = this.d;
        oagVar.b(i);
        RectF rectF = oagVar.y;
        oagVar.c(oagVar.a((rectF.width() * ragVar.f) + rectF.left));
        if (f2 != ragVar.d) {
            removeCallbacks(this.i);
            a8c a8cVar = this.j;
            removeCallbacks(a8cVar);
            post(a8cVar);
        }
        postInvalidate();
    }

    public final void setValueFrom(float f) {
        rag ragVar = this.b;
        float f2 = ragVar.d;
        ragVar.a.B(ragVar, rag.g[0], Float.valueOf(f));
        int i = ragVar.e;
        oag oagVar = this.d;
        oagVar.b(i);
        RectF rectF = oagVar.y;
        oagVar.c(oagVar.a((rectF.width() * ragVar.f) + rectF.left));
        if (f2 != ragVar.d) {
            removeCallbacks(this.i);
            a8c a8cVar = this.j;
            removeCallbacks(a8cVar);
            post(a8cVar);
        }
        postInvalidate();
    }

    public final void setValueTo(float f) {
        rag ragVar = this.b;
        float f2 = ragVar.d;
        ragVar.b.B(ragVar, rag.g[1], Float.valueOf(f));
        int i = ragVar.e;
        oag oagVar = this.d;
        oagVar.b(i);
        RectF rectF = oagVar.y;
        oagVar.c(oagVar.a((rectF.width() * ragVar.f) + rectF.left));
        if (f2 != ragVar.d) {
            removeCallbacks(this.i);
            a8c a8cVar = this.j;
            removeCallbacks(a8cVar);
            post(a8cVar);
        }
        postInvalidate();
    }
}
