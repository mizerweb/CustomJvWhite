package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ecd extends FrameLayout {
    public static final /* synthetic */ int i = 0;
    public xbd a;
    public ccd b;
    public boolean c;
    public boolean d;
    public ValueAnimator e;
    public final j7j f;
    public final ny8 g;
    public int h;

    public ecd(Context context) {
        super(context, null);
        this.b = ccd.a;
        this.c = true;
        this.f = new j7j(getContext(), this, new dcd(this));
        this.g = rx8.P(3, new ubd(this, 2));
        this.h = -1;
        qe7.H(this, 300L, new gwc(8, this));
    }

    public static void a(ecd ecdVar, float f) {
        ecdVar.setBackgroundAlpha(f);
    }

    public static void b(ecd ecdVar, qf7 qf7Var, float f, ValueAnimator valueAnimator) {
        View viewE;
        xbd xbdVar = ecdVar.a;
        if (xbdVar == null || (viewE = xbdVar.e()) == null) {
            return;
        }
        viewE.offsetTopAndBottom(((Integer) valueAnimator.getAnimatedValue()).intValue() - viewE.getTop());
        ecdVar.getHalfExpandedViewHelper().a(viewE.getTop());
        xbdVar.m(viewE.getTop());
        qf7Var.invoke(Float.valueOf(valueAnimator.getAnimatedFraction()), Float.valueOf(f));
    }

    public static void c(ecd ecdVar, float f, float f2) {
        if (f2 != 0.0f) {
            f2 = 1.0f - f2;
        }
        if (f > f2) {
            ecdVar.setBackgroundAlpha(1.0f - f);
        }
    }

    public static void d(ecd ecdVar, float f) {
        ecdVar.setBackgroundAlpha(f);
    }

    public final tbd getHalfExpandedViewHelper() {
        return (tbd) this.g.getValue();
    }

    public final int getScrollStateOffset() {
        int iOrdinal = this.b.ordinal();
        Integer numValueOf = null;
        if (iOrdinal == 0) {
            xbd xbdVar = this.a;
            if (xbdVar != null) {
                numValueOf = Integer.valueOf(xbdVar.d());
            }
        } else if (iOrdinal == 1) {
            xbd xbdVar2 = this.a;
            if (xbdVar2 != null) {
                numValueOf = Integer.valueOf(xbdVar2.b());
            }
        } else {
            if (iOrdinal != 2) {
                ore.o();
                return 0;
            }
            xbd xbdVar3 = this.a;
            if (xbdVar3 != null) {
                numValueOf = Integer.valueOf(xbdVar3.a());
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    private final int getViewDragHeight() {
        View viewE;
        xbd xbdVar = this.a;
        if (xbdVar == null || (viewE = xbdVar.e()) == null) {
            return 0;
        }
        return viewE.getHeight();
    }

    public static /* synthetic */ void i(ecd ecdVar, int i2, ubd ubdVar, ubd ubdVar2, qf7 qf7Var, int i3) {
        af7 vbdVar = ubdVar;
        if ((i3 & 2) != 0) {
            vbdVar = new vbd(0);
        }
        af7 vbdVar2 = ubdVar2;
        if ((i3 & 4) != 0) {
            vbdVar2 = new vbd(0);
        }
        ecdVar.h(i2, vbdVar, vbdVar2, qf7Var);
    }

    public final void setBackgroundAlpha(float f) {
        Drawable background = getBackground();
        if (background != null) {
            background.setAlpha((int) (oc9.u(f, 0.0f, 1.0f) * 255.0f));
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        if (this.f.f()) {
            WeakHashMap weakHashMap = i7j.a;
            postInvalidateOnAnimation();
        }
    }

    public final xbd getCallback() {
        return this.a;
    }

    public final ccd getScrollState() {
        return this.b;
    }

    public final boolean getStackFromBottom() {
        return this.c;
    }

    public final void h(int i2, af7 af7Var, af7 af7Var2, qf7 qf7Var) {
        View viewE;
        ValueAnimator valueAnimator = this.e;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        ValueAnimator valueAnimator2 = this.e;
        if (valueAnimator2 != null) {
            lsk.a(valueAnimator2);
        }
        xbd xbdVar = this.a;
        if (xbdVar == null || (viewE = xbdVar.e()) == null) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(viewE.getTop(), i2);
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.addUpdateListener(new mj(this, qf7Var, animatedFraction, 2));
        valueAnimatorOfInt.addListener(new pk(af7Var2, this, af7Var, 1));
        valueAnimatorOfInt.start();
        this.e = valueAnimatorOfInt;
    }

    public final void j(boolean z) {
        ecd ecdVar;
        View viewE;
        this.b = ccd.a;
        setClickable(false);
        setFocusable(false);
        if (getViewDragHeight() > 0) {
            int scrollStateOffset = getScrollStateOffset();
            xbd xbdVar = this.a;
            if (xbdVar != null) {
                xbdVar.i();
            }
            if (z) {
                ecdVar = this;
                i(ecdVar, scrollStateOffset, new ubd(this, 1), null, new wbd(this, 1), 4);
            } else {
                ecdVar = this;
                xbd xbdVar2 = ecdVar.a;
                if (xbdVar2 != null && (viewE = xbdVar2.e()) != null) {
                    viewE.offsetTopAndBottom(scrollStateOffset);
                }
                xbd xbdVar3 = ecdVar.a;
                if (xbdVar3 != null) {
                    xbdVar3.h();
                }
                ecdVar.setBackgroundAlpha(0.0f);
            }
        } else {
            ecdVar = this;
        }
        ecdVar.invalidate();
    }

    public final void k() {
        ecd ecdVar;
        this.b = ccd.c;
        setClickable(true);
        setFocusable(true);
        if (getViewDragHeight() > 0) {
            ecdVar = this;
            i(ecdVar, getScrollStateOffset(), null, new ubd(this, 0), new wbd(this, 0), 2);
        } else {
            ecdVar = this;
        }
        ecdVar.invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Object poeVar;
        xbd xbdVar;
        xbd xbdVar2;
        if (motionEvent.getAction() == 0 && (xbdVar2 = this.a) != null) {
            motionEvent.getX();
            xbdVar2.g(motionEvent.getY());
        }
        if (motionEvent.getAction() == 2 && (xbdVar = this.a) != null) {
            z = xbdVar.n(this.b, motionEvent.getX(), motionEvent.getY());
        }
        this.d = z;
        try {
            poeVar = Boolean.valueOf(this.f.p(motionEvent));
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V("PopupLayout", "onInterceptTouchEvent fail, issue ONEME-9645", new zbd(thA));
        }
        Boolean bool = Boolean.FALSE;
        if (poeVar instanceof poe) {
            poeVar = bool;
        }
        return ((Boolean) poeVar).booleanValue();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View viewE;
        xbd xbdVar = this.a;
        if (xbdVar == null || (viewE = xbdVar.e()) == null) {
            return;
        }
        int scrollStateOffset = (this.e == null && this.f.a == 0) ? getScrollStateOffset() : viewE.getTop();
        super.onLayout(z, i2, i3, i4, i5);
        ViewGroup.LayoutParams layoutParams = viewE.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i6 = scrollStateOffset - (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        viewE.offsetTopAndBottom(i6);
        tbd halfExpandedViewHelper = getHalfExpandedViewHelper();
        halfExpandedViewHelper.b = 0;
        halfExpandedViewHelper.a(i6);
        if (this.h != viewE.getMeasuredHeight()) {
            this.h = viewE.getMeasuredHeight();
            if (this.e != null) {
                int iOrdinal = this.b.ordinal();
                if (iOrdinal == 0) {
                    j(true);
                    return;
                }
                if (iOrdinal == 1) {
                    setHalfScreen(null);
                } else if (iOrdinal == 2) {
                    k();
                } else {
                    ore.o();
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof bcd)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        bcd bcdVar = (bcd) parcelable;
        super.onRestoreInstanceState(bcdVar.getSuperState());
        ccd ccdVar = (ccd) ccd.e.get(bcdVar.a);
        this.b = ccdVar;
        this.c = bcdVar.b;
        int iOrdinal = ccdVar.ordinal();
        if (iOrdinal == 0) {
            j(false);
        } else if (iOrdinal == 1) {
            setHalfScreen(null);
        } else {
            if (iOrdinal != 2) {
                ore.o();
                return;
            }
            k();
        }
        post(new h7b(9, this));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new bcd(super.onSaveInstanceState(), this.b.ordinal(), this.c);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object poeVar;
        j7j j7jVar = this.f;
        if (j7jVar.r == null) {
            return super.onTouchEvent(motionEvent);
        }
        this.d = true;
        try {
            j7jVar.j(motionEvent);
            poeVar = Boolean.TRUE;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V("PopupLayout", "onTouchEvent fail, issue ONEME-9645", new zbd(thA));
        }
        Boolean bool = Boolean.FALSE;
        if (poeVar instanceof poe) {
            poeVar = bool;
        }
        return ((Boolean) poeVar).booleanValue();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        j7j j7jVar = this.f;
        int i2 = j7jVar.a;
        if (i2 == 2 || i2 == 1) {
            return;
        }
        OverScroller overScroller = j7jVar.p;
        j7jVar.a();
        if (j7jVar.a == 2) {
            overScroller.getCurrX();
            overScroller.getCurrY();
            overScroller.abortAnimation();
            j7jVar.q.i(j7jVar.r, overScroller.getCurrX(), overScroller.getCurrY());
        }
        j7jVar.n(0);
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        if (this.b == ccd.a) {
            setBackgroundAlpha(0.0f);
        } else {
            setBackgroundAlpha(1.0f);
        }
    }

    public final void setCallback(xbd xbdVar) {
        this.a = xbdVar;
    }

    public final void setHalfScreen(qf7 qf7Var) {
        this.b = ccd.b;
        setClickable(true);
        setFocusable(true);
        if (getViewDragHeight() > 0) {
            int scrollStateOffset = getScrollStateOffset();
            if (qf7Var == null) {
                qf7Var = new wbd(this, 2);
            }
            h(scrollStateOffset, new vbd(this), new ubd(this, 3), qf7Var);
        } else if (this.b == ccd.a) {
            setBackgroundAlpha(0.0f);
        } else {
            setBackgroundAlpha(1.0f);
        }
        invalidate();
    }

    public final void setScrollState(ccd ccdVar) {
        this.b = ccdVar;
    }

    public final void setStackFromBottom(boolean z) {
        this.c = z;
    }
}
