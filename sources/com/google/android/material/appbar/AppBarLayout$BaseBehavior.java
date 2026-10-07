package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import defpackage.b1j;
import defpackage.bt4;
import defpackage.cy5;
import defpackage.dcb;
import defpackage.e0;
import defpackage.et4;
import defpackage.fik;
import defpackage.h6g;
import defpackage.i7j;
import defpackage.lk;
import defpackage.lq;
import defpackage.mq;
import defpackage.n8j;
import defpackage.np4;
import defpackage.nq;
import defpackage.o8j;
import defpackage.pq;
import defpackage.rq;
import defpackage.ys4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T extends rq> extends n8j {
    public b1j c;
    public OverScroller d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public VelocityTracker i;
    public int j;
    public int k;
    public ValueAnimator l;
    public nq m;
    public WeakReference n;
    public cy5 o;

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.f = -1;
        this.h = -1;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    public static void H(et4 et4Var, rq rqVar, int i, int i2, boolean z) {
        View childAt;
        boolean zI;
        int iAbs = Math.abs(i);
        int childCount = rqVar.getChildCount();
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                childAt = null;
                break;
            }
            childAt = rqVar.getChildAt(i3);
            if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                break;
            } else {
                i3++;
            }
        }
        if (childAt != null) {
            int i4 = ((pq) childAt.getLayoutParams()).a;
            if ((i4 & 1) != 0) {
                WeakHashMap weakHashMap = i7j.a;
                int minimumHeight = childAt.getMinimumHeight();
                zI = true;
                if (i2 <= 0 || (i4 & 12) == 0 ? (i4 & 2) == 0 || (-i) < (childAt.getBottom() - minimumHeight) - rqVar.getTopInset() : (-i) < (childAt.getBottom() - minimumHeight) - rqVar.getTopInset()) {
                    zI = false;
                }
            } else {
                zI = false;
            }
        } else {
            zI = false;
        }
        if (rqVar.l) {
            zI = rqVar.i(w(et4Var));
        }
        boolean zH = rqVar.h(zI);
        if (!z) {
            if (zH) {
                ArrayList arrayList = (ArrayList) ((h6g) et4Var.b.c).get(rqVar);
                List arrayList2 = arrayList != null ? new ArrayList(arrayList) : null;
                if (arrayList2 == null) {
                    arrayList2 = Collections.EMPTY_LIST;
                }
                int size = arrayList2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ys4 ys4Var = ((bt4) ((View) arrayList2.get(i5)).getLayoutParams()).a;
                    if (ys4Var instanceof AppBarLayout$ScrollingViewBehavior) {
                        if (((AppBarLayout$ScrollingViewBehavior) ys4Var).f == 0) {
                            return;
                        }
                    }
                }
                return;
            }
            return;
        }
        if (rqVar.getBackground() != null) {
            rqVar.getBackground().jumpToCurrentState();
        }
        if (rqVar.getForeground() != null) {
            rqVar.getForeground().jumpToCurrentState();
        }
        if (rqVar.getStateListAnimator() != null) {
            rqVar.getStateListAnimator().jumpToCurrentState();
        }
    }

    public static View u(AppBarLayout$BaseBehavior appBarLayout$BaseBehavior, et4 et4Var) {
        int childCount = et4Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = et4Var.getChildAt(i);
            if (((bt4) childAt.getLayoutParams()).a instanceof AppBarLayout$ScrollingViewBehavior) {
                return childAt;
            }
        }
        return null;
    }

    public static View w(et4 et4Var) {
        int childCount = et4Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = et4Var.getChildAt(i);
            if ((childAt instanceof dcb) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                return childAt;
            }
        }
        return null;
    }

    @Override // defpackage.ys4
    /* JADX INFO: renamed from: A */
    public void l(et4 et4Var, rq rqVar, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AppBarLayout$BaseBehavior<T> appBarLayout$BaseBehavior;
        et4 et4Var2;
        rq rqVar2;
        if (i4 < 0) {
            appBarLayout$BaseBehavior = this;
            et4Var2 = et4Var;
            rqVar2 = rqVar;
            iArr[1] = appBarLayout$BaseBehavior.E(et4Var2, rqVar2, x() - i4, -rqVar.getDownNestedScrollRange(), 0);
        } else {
            appBarLayout$BaseBehavior = this;
            et4Var2 = et4Var;
            rqVar2 = rqVar;
        }
        if (i4 == 0 && i7j.c(et4Var2) == null) {
            i7j.l(et4Var2, new mq(appBarLayout$BaseBehavior, rqVar2, et4Var2));
        }
    }

    @Override // defpackage.ys4
    /* JADX INFO: renamed from: B */
    public boolean p(et4 et4Var, rq rqVar, View view, View view2, int i, int i2) {
        ValueAnimator valueAnimator;
        boolean z = (i & 2) != 0 && (rqVar.l || (rqVar.getTotalScrollRange() != 0 && et4Var.getHeight() - view.getHeight() <= rqVar.getHeight()));
        if (z && (valueAnimator = this.l) != null) {
            valueAnimator.cancel();
        }
        this.n = null;
        this.k = i2;
        return z;
    }

    @Override // defpackage.ys4
    /* JADX INFO: renamed from: C */
    public void q(et4 et4Var, rq rqVar, View view, int i) {
        if (this.k == 0 || i == 1) {
            G(et4Var, rqVar);
            if (rqVar.l) {
                rqVar.h(rqVar.i(view));
            }
        }
        this.n = new WeakReference(view);
    }

    public final nq D(Parcelable parcelable, rq rqVar) {
        int iS = s();
        int childCount = rqVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = rqVar.getChildAt(i);
            int bottom = childAt.getBottom() + iS;
            if (childAt.getTop() + iS <= 0 && bottom >= 0) {
                if (parcelable == null) {
                    parcelable = e0.b;
                }
                nq nqVar = new nq(parcelable);
                boolean z = iS == 0;
                nqVar.d = z;
                nqVar.c = !z && (-iS) >= rqVar.getTotalScrollRange();
                nqVar.e = i;
                WeakHashMap weakHashMap = i7j.a;
                nqVar.g = bottom == rqVar.getTopInset() + childAt.getMinimumHeight();
                nqVar.f = bottom / childAt.getHeight();
                return nqVar;
            }
        }
        return null;
    }

    public final int E(et4 et4Var, View view, int i, int i2, int i3) {
        int top;
        boolean zB;
        ArrayList arrayList;
        int topInset;
        rq rqVar = (rq) view;
        int iX = x();
        int i4 = 0;
        if (i2 == 0 || iX < i2 || iX > i3) {
            this.j = 0;
        } else {
            int iF = np4.f(i, i2, i3);
            if (iX != iF) {
                if (!rqVar.e) {
                    top = iF;
                    break;
                }
                int iAbs = Math.abs(iF);
                int childCount = rqVar.getChildCount();
                int i5 = 0;
                while (true) {
                    if (i5 < childCount) {
                        View childAt = rqVar.getChildAt(i5);
                        pq pqVar = (pq) childAt.getLayoutParams();
                        Interpolator interpolator = pqVar.c;
                        if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                            i5++;
                        } else if (interpolator != null) {
                            int i6 = pqVar.a;
                            if ((i6 & 1) != 0) {
                                topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) pqVar).topMargin + ((LinearLayout.LayoutParams) pqVar).bottomMargin;
                                if ((i6 & 2) != 0) {
                                    WeakHashMap weakHashMap = i7j.a;
                                    topInset -= childAt.getMinimumHeight();
                                }
                            } else {
                                topInset = 0;
                            }
                            WeakHashMap weakHashMap2 = i7j.a;
                            if (childAt.getFitsSystemWindows()) {
                                topInset -= rqVar.getTopInset();
                            }
                            if (topInset > 0) {
                                float f = topInset;
                                top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f) * f)) * Integer.signum(iF);
                                break;
                            }
                        }
                    }
                    top = iF;
                    break;
                }
                o8j o8jVar = this.a;
                if (o8jVar != null) {
                    zB = o8jVar.b(top);
                } else {
                    this.b = top;
                    zB = false;
                }
                int i7 = iX - iF;
                this.j = iF - top;
                if (zB) {
                    for (int i8 = 0; i8 < rqVar.getChildCount(); i8++) {
                        pq pqVar2 = (pq) rqVar.getChildAt(i8).getLayoutParams();
                        fik fikVar = pqVar2.b;
                        if (fikVar != null && (pqVar2.a & 1) != 0) {
                            fikVar.w(rqVar, rqVar.getChildAt(i8), s());
                        }
                    }
                }
                if (!zB && rqVar.e && (arrayList = (ArrayList) ((h6g) et4Var.b.c).get(rqVar)) != null && !arrayList.isEmpty()) {
                    for (int i9 = 0; i9 < arrayList.size(); i9++) {
                        View view2 = (View) arrayList.get(i9);
                        ys4 ys4Var = ((bt4) view2.getLayoutParams()).a;
                        if (ys4Var != null) {
                            ys4Var.d(et4Var, view2, rqVar);
                        }
                    }
                }
                rqVar.e(s());
                H(et4Var, rqVar, iF, iF < iX ? -1 : 1, false);
                i4 = i7;
            }
        }
        if (i7j.c(et4Var) != null) {
            return i4;
        }
        i7j.l(et4Var, new mq(this, rqVar, et4Var));
        return i4;
    }

    public final void F(et4 et4Var, View view, int i) {
        E(et4Var, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public final void G(et4 et4Var, rq rqVar) {
        int paddingTop = rqVar.getPaddingTop() + rqVar.getTopInset();
        int iX = x() - paddingTop;
        int childCount = rqVar.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                i = -1;
                break;
            }
            View childAt = rqVar.getChildAt(i);
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            pq pqVar = (pq) childAt.getLayoutParams();
            if ((pqVar.a & 32) == 32) {
                top -= ((LinearLayout.LayoutParams) pqVar).topMargin;
                bottom += ((LinearLayout.LayoutParams) pqVar).bottomMargin;
            }
            int i2 = -iX;
            if (top <= i2 && bottom >= i2) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            View childAt2 = rqVar.getChildAt(i);
            pq pqVar2 = (pq) childAt2.getLayoutParams();
            int i3 = pqVar2.a;
            if ((i3 & 17) == 17) {
                int topInset = -childAt2.getTop();
                int minimumHeight = -childAt2.getBottom();
                if (i == 0) {
                    WeakHashMap weakHashMap = i7j.a;
                    if (rqVar.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        topInset -= rqVar.getTopInset();
                    }
                }
                if ((i3 & 2) == 2) {
                    WeakHashMap weakHashMap2 = i7j.a;
                    minimumHeight += childAt2.getMinimumHeight();
                } else if ((i3 & 5) == 5) {
                    WeakHashMap weakHashMap3 = i7j.a;
                    int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                    if (iX < minimumHeight2) {
                        topInset = minimumHeight2;
                    } else {
                        minimumHeight = minimumHeight2;
                    }
                }
                if ((i3 & 32) == 32) {
                    topInset += ((LinearLayout.LayoutParams) pqVar2).topMargin;
                    minimumHeight -= ((LinearLayout.LayoutParams) pqVar2).bottomMargin;
                }
                if (iX < (minimumHeight + topInset) / 2) {
                    topInset = minimumHeight;
                }
                v(et4Var, rqVar, np4.f(topInset + paddingTop, -rqVar.getTotalScrollRange(), 0));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0081  */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a7  */
    @Override // defpackage.ys4
    public final boolean g(et4 et4Var, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int y;
        boolean z;
        OverScroller overScroller;
        WeakReference weakReference;
        View view2;
        int iFindPointerIndex;
        if (this.h < 0) {
            this.h = ViewConfiguration.get(et4Var.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.e) {
            int i = this.f;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y2 - this.g) > this.h) {
                    this.g = y2;
                    return true;
                }
                if (motionEvent.getActionMasked() == 0) {
                    this.f = -1;
                    int x = (int) motionEvent.getX();
                    y = (int) motionEvent.getY();
                    if (this.o != null) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.e = z;
                    if (z) {
                        this.g = y;
                        this.f = motionEvent.getPointerId(0);
                        if (this.i == null) {
                            this.i = VelocityTracker.obtain();
                        }
                        overScroller = this.d;
                        if (overScroller != null) {
                            this.d.abortAnimation();
                            return true;
                        }
                    }
                }
                velocityTracker = this.i;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                this.f = -1;
                int x2 = (int) motionEvent.getX();
                y = (int) motionEvent.getY();
                if (this.o != null && (((weakReference = this.n) == null || !((view2 = (View) weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1))) && et4Var.l(view, x2, y))) {
                    z = true;
                } else {
                    z = false;
                }
                this.e = z;
                if (z) {
                    this.g = y;
                    this.f = motionEvent.getPointerId(0);
                    if (this.i == null) {
                        this.i = VelocityTracker.obtain();
                    }
                    overScroller = this.d;
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.d.abortAnimation();
                        return true;
                    }
                }
            }
            velocityTracker = this.i;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    @Override // defpackage.n8j, defpackage.ys4
    public /* bridge */ /* synthetic */ boolean h(et4 et4Var, View view, int i) {
        y(et4Var, (rq) view, i);
        return true;
    }

    @Override // defpackage.ys4
    public final boolean i(et4 et4Var, View view, int i, int i2, int i3) {
        rq rqVar = (rq) view;
        if (((ViewGroup.MarginLayoutParams) ((bt4) rqVar.getLayoutParams())).height != -2) {
            return false;
        }
        et4Var.r(rqVar, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
        return true;
    }

    @Override // defpackage.ys4
    public final /* bridge */ /* synthetic */ void k(et4 et4Var, View view, View view2, int i, int i2, int[] iArr, int i3) {
        z(et4Var, (rq) view, view2, i2, iArr);
    }

    @Override // defpackage.ys4
    public final void n(View view, Parcelable parcelable) {
        if (parcelable instanceof nq) {
            this.m = (nq) parcelable;
        } else {
            this.m = null;
        }
    }

    @Override // defpackage.ys4
    public final Parcelable o(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        nq nqVarD = D(absSavedState, (rq) view);
        return nqVarD == null ? absSavedState : nqVarD;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:45:0x0103 A[ADDED_TO_REGION] */
    @Override // defpackage.ys4
    public final boolean r(et4 et4Var, View view, MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        AppBarLayout$BaseBehavior<T> appBarLayout$BaseBehavior = this;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(appBarLayout$BaseBehavior.f);
                if (iFindPointerIndex != -1) {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i = appBarLayout$BaseBehavior.g - y;
                    appBarLayout$BaseBehavior.g = y;
                    rq rqVar = (rq) view;
                    appBarLayout$BaseBehavior.E(et4Var, view, appBarLayout$BaseBehavior.x() - i, rqVar.getTopInset() + (-rqVar.getDownNestedScrollRange()), 0);
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i2 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    appBarLayout$BaseBehavior.f = motionEvent.getPointerId(i2);
                    appBarLayout$BaseBehavior.g = (int) (motionEvent.getY(i2) + 0.5f);
                }
            }
            z = false;
            velocityTracker2 = appBarLayout$BaseBehavior.i;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !appBarLayout$BaseBehavior.e || z;
        }
        VelocityTracker velocityTracker3 = appBarLayout$BaseBehavior.i;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            appBarLayout$BaseBehavior.i.computeCurrentVelocity(1000);
            float yVelocity = appBarLayout$BaseBehavior.i.getYVelocity(appBarLayout$BaseBehavior.f);
            rq rqVar2 = (rq) view;
            int i3 = -rqVar2.getTotalScrollRange();
            Runnable runnable = appBarLayout$BaseBehavior.c;
            if (runnable != null) {
                view.removeCallbacks(runnable);
                appBarLayout$BaseBehavior.c = null;
            }
            if (appBarLayout$BaseBehavior.d == null) {
                appBarLayout$BaseBehavior.d = new OverScroller(view.getContext());
            }
            appBarLayout$BaseBehavior.d.fling(0, appBarLayout$BaseBehavior.s(), 0, Math.round(yVelocity), 0, 0, i3, 0);
            if (appBarLayout$BaseBehavior.d.computeScrollOffset()) {
                b1j b1jVar = new b1j(2, this, et4Var, view, false);
                appBarLayout$BaseBehavior = this;
                appBarLayout$BaseBehavior.c = b1jVar;
                WeakHashMap weakHashMap = i7j.a;
                view.postOnAnimation(b1jVar);
            } else {
                appBarLayout$BaseBehavior.G(et4Var, rqVar2);
                if (rqVar2.l) {
                    rqVar2.h(rqVar2.i(w(et4Var)));
                }
            }
            z = true;
        }
        appBarLayout$BaseBehavior.e = false;
        appBarLayout$BaseBehavior.f = -1;
        velocityTracker = appBarLayout$BaseBehavior.i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            appBarLayout$BaseBehavior.i = null;
        }
        velocityTracker2 = appBarLayout$BaseBehavior.i;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (appBarLayout$BaseBehavior.e) {
        }
        z = false;
        appBarLayout$BaseBehavior.e = false;
        appBarLayout$BaseBehavior.f = -1;
        velocityTracker = appBarLayout$BaseBehavior.i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            appBarLayout$BaseBehavior.i = null;
        }
        velocityTracker2 = appBarLayout$BaseBehavior.i;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (appBarLayout$BaseBehavior.e) {
        }
    }

    public final void v(et4 et4Var, rq rqVar, int i) {
        int iAbs = Math.abs(x() - i);
        float fAbs = Math.abs(0.0f);
        int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / rqVar.getHeight()) + 1.0f) * 150.0f);
        int iX = x();
        ValueAnimator valueAnimator = this.l;
        if (iX == i) {
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            this.l.cancel();
            return;
        }
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.l = valueAnimator2;
            valueAnimator2.setInterpolator(lk.e);
            this.l.addUpdateListener(new lq(this, et4Var, rqVar, 0));
        } else {
            valueAnimator.cancel();
        }
        this.l.setDuration(Math.min(iRound, 600));
        this.l.setIntValues(iX, i);
        this.l.start();
    }

    public final int x() {
        return s() + this.j;
    }

    public void y(et4 et4Var, rq rqVar, int i) {
        int iRound;
        super.h(et4Var, rqVar, i);
        int pendingAction = rqVar.getPendingAction();
        nq nqVar = this.m;
        if (nqVar == null || (pendingAction & 8) != 0) {
            if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i2 = -rqVar.getUpNestedPreScrollRange();
                    if (z) {
                        v(et4Var, rqVar, i2);
                    } else {
                        F(et4Var, rqVar, i2);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        v(et4Var, rqVar, 0);
                    } else {
                        F(et4Var, rqVar, 0);
                    }
                }
            }
        } else if (nqVar.c) {
            F(et4Var, rqVar, -rqVar.getTotalScrollRange());
        } else if (nqVar.d) {
            F(et4Var, rqVar, 0);
        } else {
            View childAt = rqVar.getChildAt(nqVar.e);
            int i3 = -childAt.getBottom();
            if (this.m.g) {
                WeakHashMap weakHashMap = i7j.a;
                iRound = rqVar.getTopInset() + childAt.getMinimumHeight() + i3;
            } else {
                iRound = Math.round(childAt.getHeight() * this.m.f) + i3;
            }
            F(et4Var, rqVar, iRound);
        }
        rqVar.f = 0;
        this.m = null;
        int iF = np4.f(s(), -rqVar.getTotalScrollRange(), 0);
        o8j o8jVar = this.a;
        if (o8jVar != null) {
            o8jVar.b(iF);
        } else {
            this.b = iF;
        }
        H(et4Var, rqVar, s(), 0, true);
        rqVar.e(s());
        if (i7j.c(et4Var) != null) {
            return;
        }
        i7j.l(et4Var, new mq(this, rqVar, et4Var));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public final void z(et4 et4Var, rq rqVar, View view, int i, int[] iArr) {
        rq rqVar2;
        int i2;
        int downNestedPreScrollRange;
        if (i == 0) {
            rqVar2 = rqVar;
        } else {
            if (i < 0) {
                i2 = -rqVar.getTotalScrollRange();
                downNestedPreScrollRange = rqVar.getDownNestedPreScrollRange() + i2;
            } else {
                i2 = -rqVar.getUpNestedPreScrollRange();
                downNestedPreScrollRange = 0;
            }
            int i3 = i2;
            int i4 = downNestedPreScrollRange;
            if (i3 != i4) {
                rqVar2 = rqVar;
                iArr[1] = E(et4Var, rqVar2, x() - i, i3, i4);
            } else {
                rqVar2 = rqVar;
            }
        }
        if (rqVar2.l) {
            rqVar2.h(rqVar2.i(view));
        }
    }

    public AppBarLayout$BaseBehavior() {
        this.f = -1;
        this.h = -1;
    }
}
