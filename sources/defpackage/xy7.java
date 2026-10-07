package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class xy7 implements er1 {
    public final y8j a;
    public final ViewStub b;
    public final xd1 c;
    public final ViewStub d;
    public final lgb e;
    public final mr1 f;
    public final m g;
    public final xy1 h;
    public final xy1 i;
    public final RecyclerView j;
    public y8j k;
    public final int l;
    public VelocityTracker m;
    public final float n;
    public final float o;
    public float q;
    public float r;
    public float s;
    public boolean t;
    public boolean w;
    public boolean x;
    public boolean y;
    public final String p = xy7.class.getName();
    public int u = -1;
    public boolean v = true;
    public final ny8 z = rx8.P(3, new h57(12));
    public final ny8 A = rx8.P(3, new mp5(21, this));
    public final ny8 B = rx8.P(3, new h57(13));
    public final oo6 C = new oo6(8, this);
    public final wy7 D = new wy7(0, this);

    public xy7(y8j y8jVar, ViewStub viewStub, xd1 xd1Var, ViewStub viewStub2, lgb lgbVar, mr1 mr1Var, m mVar, xy1 xy1Var, xy1 xy1Var2) {
        this.a = y8jVar;
        this.b = viewStub;
        this.c = xd1Var;
        this.d = viewStub2;
        this.e = lgbVar;
        this.f = mr1Var;
        this.g = mVar;
        this.h = xy1Var;
        this.i = xy1Var2;
        this.j = (RecyclerView) y8jVar.getChildAt(0);
        this.l = ViewConfiguration.get(y8jVar.getContext()).getScaledTouchSlop() * 4;
        this.n = ViewConfiguration.get(y8jVar.getContext()).getScaledMinimumFlingVelocity();
        this.o = ViewConfiguration.get(y8jVar.getContext()).getScaledMaximumFlingVelocity();
    }

    public static void l(xy7 xy7Var, y8j y8jVar, float f) {
        if (!y8jVar.d()) {
            gm0.Y(y8j.class.getName(), "Early return in returnToCurrentPage cuz of !isFakeDragging");
            return;
        }
        tfe tfeVar = new tfe();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -f);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new uy7(tfeVar, y8jVar, 2));
        valueAnimatorOfFloat.addListener(new vy7(y8jVar, 2));
        valueAnimatorOfFloat.start();
    }

    @Override // defpackage.er1
    public final boolean a(MotionEvent motionEvent) {
        View viewR;
        float f;
        y8j y8jVarH;
        boolean z = false;
        if (((az7) this.A.getValue()).e || !k()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        y8j y8jVar = this.a;
        xd1 xd1Var = this.c;
        lgb lgbVar = this.e;
        if (actionMasked == 1) {
            VelocityTracker velocityTracker = this.m;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            y8j y8jVarH2 = h();
            if (y8jVarH2 == null || !y8jVarH2.d()) {
                if (Math.abs(this.s) >= gm0.K(yl5.d().getDisplayMetrics().density * 112.0f) || j()) {
                    int i = this.s > 0.0f ? 1 : -1;
                    float f2 = j() ? 0.0f : this.s;
                    boolean z2 = j() && Math.abs(this.s) < ((float) gm0.K(yl5.d().getDisplayMetrics().density * 112.0f));
                    if (y8jVar.d()) {
                        float measuredWidth = (y8jVar.getMeasuredWidth() * i) - f2;
                        tfe tfeVar = new tfe();
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, measuredWidth);
                        valueAnimatorOfFloat.setDuration(150L);
                        valueAnimatorOfFloat.addListener(new ck(z2, this, 1));
                        valueAnimatorOfFloat.addUpdateListener(new uy7(tfeVar, y8jVar, 0));
                        valueAnimatorOfFloat.addListener(new vy7(y8jVar, 1));
                        valueAnimatorOfFloat.start();
                    } else {
                        gm0.Y(y8j.class.getName(), "Early return in moveToNextPage cuz of !isFakeDragging");
                    }
                } else {
                    l(this, y8jVar, this.s);
                }
            } else if (Math.abs(this.s) > y8jVar.getWidth() / 2 || j()) {
                y8j y8jVarH3 = h();
                if (y8jVarH3 != null) {
                    if (y8jVarH3.d()) {
                        vee layoutManager = ((RecyclerView) y8jVarH3.getChildAt(0)).getLayoutManager();
                        float measuredWidth2 = y8jVarH3.getMeasuredWidth() - Math.abs((layoutManager == null || (viewR = layoutManager.r(y8jVarH3.getCurrentItem())) == null) ? 0.0f : -viewR.getLeft());
                        if (measuredWidth2 <= 0.0f) {
                            gm0.Y(y8j.class.getName(), "Early return in moveChildToNextPage cuz of remaining <= 0f");
                        } else {
                            tfe tfeVar2 = new tfe();
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, measuredWidth2);
                            valueAnimatorOfFloat2.setDuration(150L);
                            valueAnimatorOfFloat2.addUpdateListener(new uy7(tfeVar2, y8jVarH3, 1));
                            valueAnimatorOfFloat2.addListener(new vy7(y8jVarH3, 0));
                            valueAnimatorOfFloat2.start();
                        }
                    } else {
                        gm0.Y(y8j.class.getName(), "Early return in moveChildToNextPage cuz of !isFakeDragging");
                    }
                }
            } else {
                y8j y8jVarH4 = h();
                if (y8jVarH4 != null) {
                    l(this, y8jVarH4, this.s);
                }
            }
            y8j y8jVarH5 = h();
            if (y8jVarH5 != null) {
                y8jVarH5.setUserInputEnabled(true);
            }
            y8jVar.setUserInputEnabled(true);
            this.t = false;
            if (n7j.n(this.d)) {
                lgbVar.setVisibility(8);
            }
            if (n7j.n(this.b)) {
                xd1Var.setVisibility(8);
            }
            this.s = 0.0f;
            m();
            VelocityTracker velocityTracker2 = this.m;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
            }
            this.m = null;
            return true;
        }
        if (actionMasked != 2) {
            return true;
        }
        float x = motionEvent.getX() - this.q;
        if (y8jVar.d()) {
            if (lgbVar.getVisibility() != 0) {
                isk.d(this.e, true, 0L, null, 6);
            }
            if (xd1Var.getVisibility() != 0) {
                isk.d(this.c, true, 0L, null, 6);
            }
        }
        VelocityTracker velocityTracker3 = this.m;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
        }
        float fExp = ((float) Math.exp(Math.min(Math.abs(x) / gm0.K(yl5.d().getDisplayMetrics().density * 142.0f), 1.0f) * (-15.0f))) * x;
        boolean z3 = y8jVar.getCurrentItem() == 0;
        boolean z4 = !z3 || this.s + fExp < 0.0f;
        if ((Math.abs(this.s + fExp) <= gm0.K(yl5.d().getDisplayMetrics().density * 142.0f) || !y8jVar.d()) && z4) {
            float f3 = this.s;
            if (y8jVar.d()) {
                f = fExp;
            } else {
                y8j y8jVarH6 = h();
                f = (y8jVarH6 == null || !y8jVarH6.d()) ? 0.0f : x;
            }
            float f4 = f3 + f;
            this.s = f4;
            if (this.u == 1) {
                if (f4 < 0.0f) {
                    y8jVar.b();
                    y8j y8jVarH7 = h();
                    if (y8jVarH7 != null) {
                        y8jVarH7.a();
                    }
                } else {
                    y8j y8jVarH8 = h();
                    if (y8jVarH8 != null) {
                        y8jVarH8.b();
                    }
                    y8jVar.a();
                }
                y8j y8jVarH9 = h();
                if (y8jVarH9 != null && y8jVarH9.d() && (y8jVarH = h()) != null) {
                    y8jVarH.c(x);
                }
                if (y8jVar.d()) {
                    y8jVar.c(fExp);
                }
            } else {
                y8j y8jVarH10 = h();
                if (y8jVarH10 != null && y8jVarH10.d()) {
                    y8j y8jVarH11 = h();
                    if (y8jVarH11 != null) {
                        y8jVarH11.b();
                    }
                    y8jVar.a();
                }
                y8jVar.c(fExp);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                float fAbs = Math.abs(this.s);
                boolean z5 = this.w;
                xy1 xy1Var = this.i;
                if (!z5 && fAbs >= gm0.K(yl5.d().getDisplayMetrics().density * 112.0f) && y8jVar.d()) {
                    p0m.a(y8jVar, lt7.GESTURE_START);
                    this.w = true;
                    vq7 vq7Var = (vq7) xy1Var.invoke();
                    if (vq7Var != null) {
                        if (this.w && !z3) {
                            z = true;
                        }
                        vq7Var.setDrawZeroIcon(z);
                    }
                    gm0.n(this.p, "thresholdPassed: true");
                } else if (fAbs < gm0.K(yl5.d().getDisplayMetrics().density * 112.0f)) {
                    this.w = false;
                    vq7 vq7Var2 = (vq7) xy1Var.invoke();
                    if (vq7Var2 != null) {
                        if (!this.w && z3) {
                            z = true;
                        }
                        vq7Var2.setDrawZeroIcon(z);
                    }
                }
            }
            if (y8jVar.d()) {
                xd1Var.setTranslationX(xd1Var.getTranslationX() + fExp);
                lgbVar.setTranslationX(lgbVar.getTranslationX() + fExp);
                xd1Var.a(oc9.u(this.s / gm0.K(142.0f * yl5.d().getDisplayMetrics().density), -1.0f, 1.0f) * (z3 ? -1 : 1));
            }
        }
        this.q = motionEvent.getX();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0137  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if (r1 != 3) goto L101;
     */
    @Override // defpackage.er1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy7.b(android.view.MotionEvent):boolean");
    }

    @Override // defpackage.er1
    public final void c() {
        AnimatorSet animatorSet = ((az7) this.A.getValue()).d;
        if (animatorSet != null) {
            animatorSet.end();
        }
    }

    @Override // defpackage.er1
    public final void d() {
        y8j y8jVar = this.a;
        y8jVar.setPageTransformer(null);
        y8jVar.j(this.D);
    }

    @Override // defpackage.er1
    public final boolean e() {
        final int i = 0;
        if (!k() || this.a.d()) {
            String name = xy7.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, zo5.s("Early return in showHint cuz of parent.isFakeDragging: ", this.a.d()), null);
                }
            }
        } else {
            final az7 az7Var = (az7) this.A.getValue();
            az7Var.getClass();
            float fK = gm0.K(112.0f * yl5.d().getDisplayMetrics().density);
            final int i2 = 1;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, fK);
            valueAnimatorOfFloat.setDuration(800L);
            final tfe tfeVar = new tfe();
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zy7
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i3 = i;
                    az7 az7Var2 = az7Var;
                    tfe tfeVar2 = tfeVar;
                    switch (i3) {
                        case 0:
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            float f = tfeVar2.a;
                            az7Var2.a(fFloatValue - f, f);
                            tfeVar2.a = fFloatValue;
                            break;
                        default:
                            float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            float f2 = tfeVar2.a;
                            az7Var2.a(fFloatValue2 - f2, f2);
                            tfeVar2.a = fFloatValue2;
                            break;
                    }
                }
            });
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fK, 0.0f);
            valueAnimatorOfFloat2.setDuration(400L);
            valueAnimatorOfFloat2.setStartDelay(600L);
            final tfe tfeVar2 = new tfe();
            tfeVar2.a = fK;
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zy7
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i3 = i2;
                    az7 az7Var2 = az7Var;
                    tfe tfeVar3 = tfeVar2;
                    switch (i3) {
                        case 0:
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            float f = tfeVar3.a;
                            az7Var2.a(fFloatValue - f, f);
                            tfeVar3.a = fFloatValue;
                            break;
                        default:
                            float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            float f2 = tfeVar3.a;
                            az7Var2.a(fFloatValue2 - f2, f2);
                            tfeVar3.a = fFloatValue2;
                            break;
                    }
                }
            });
            AnimatorSet animatorSet = az7Var.d;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
            animatorSet2.addListener(new li(9, az7Var));
            if (az7Var.a.a()) {
                i();
                isk.d(az7Var.c, true, 0L, null, 6);
                isk.d(az7Var.b, true, 0L, null, 6);
                az7Var.e = true;
                animatorSet2.start();
                az7Var.d = animatorSet2;
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.er1
    public final void f() {
        if (n7j.n(this.d) && n7j.n(this.b)) {
            y8j y8jVarH = h();
            View viewFindViewById = y8jVarH != null ? y8jVarH.findViewById(R.id.call_opponents) : null;
            if (viewFindViewById != null) {
                bdc.a(viewFindViewById, new ng7(viewFindViewById, viewFindViewById, this, 8));
            }
        }
        m();
    }

    @Override // defpackage.er1
    public final void g() {
        oo6 oo6Var = this.C;
        y8j y8jVar = this.a;
        y8jVar.setPageTransformer(oo6Var);
        y8jVar.e(this.D);
    }

    public final y8j h() {
        if (this.k == null) {
            this.k = (y8j) this.a.findViewById(R.id.call_users_speakers_view_pager);
        }
        return this.k;
    }

    public final void i() {
        if (this.x) {
            return;
        }
        ViewStub viewStub = this.d;
        int i = 8;
        if (!n7j.n(viewStub)) {
            ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewStub);
            viewGroup.removeViewInLayout(viewStub);
            ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
            lgb lgbVar = this.e;
            layoutParams.height = lgbVar.getLayoutParams().height;
            layoutParams.width = lgbVar.getLayoutParams().width;
            lgbVar.setId(viewStub.getId());
            viewGroup.addView(lgbVar, iIndexOfChild, layoutParams);
            lgbVar.setVisibility(8);
        }
        ViewStub viewStub2 = this.b;
        if (!n7j.n(viewStub2)) {
            ViewGroup viewGroup2 = (ViewGroup) viewStub2.getParent();
            int iIndexOfChild2 = viewGroup2.indexOfChild(viewStub2);
            viewGroup2.removeViewInLayout(viewStub2);
            ViewGroup.LayoutParams layoutParams2 = viewStub2.getLayoutParams();
            xd1 xd1Var = this.c;
            layoutParams2.height = xd1Var.getLayoutParams().height;
            layoutParams2.width = xd1Var.getLayoutParams().width;
            xd1Var.setId(viewStub2.getId());
            viewGroup2.addView(xd1Var, iIndexOfChild2, layoutParams2);
            xd1Var.setVisibility(8);
        }
        if (h() != null) {
            y8j y8jVarH = h();
            View viewFindViewById = y8jVarH != null ? y8jVarH.findViewById(R.id.call_opponents) : null;
            if (viewFindViewById != null) {
                bdc.a(viewFindViewById, new ng7(viewFindViewById, viewFindViewById, this, i));
            }
        }
    }

    @Override // defpackage.er1
    public final boolean isIdle() {
        return this.v;
    }

    public final boolean j() {
        VelocityTracker velocityTracker = this.m;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000);
        }
        VelocityTracker velocityTracker2 = this.m;
        float xVelocity = velocityTracker2 != null ? velocityTracker2.getXVelocity() : 0.0f;
        float fAbs = Math.abs(xVelocity);
        if (this.n <= fAbs && fAbs <= this.o) {
            if (xVelocity < 0.0f && this.u == 1) {
                return true;
            }
            if (xVelocity > 0.0f && this.u == 1) {
                return true;
            }
            if (xVelocity < 0.0f && this.u == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        y8j y8jVar = this.a;
        boolean z = y8jVar.getCurrentItem() == 0;
        boolean z2 = y8jVar.getCurrentItem() == 1;
        y8j y8jVarH = h();
        return z || (z2 && ((y8jVarH != null ? y8jVarH.getCurrentItem() : 0) == 0));
    }

    public final void m() {
        int i = this.u;
        xy1 xy1Var = this.h;
        lgb lgbVar = this.e;
        xd1 xd1Var = this.c;
        if (i == 1) {
            xd1Var.setPullViewMovementParams$calls_ui((wd1) this.z.getValue());
            xd1Var.setTranslationX((-(((Number) xy1Var.invoke()).floatValue() / 2.0f)) - gm0.K(yl5.d().getDisplayMetrics().density * 62.0f));
            lgbVar.setTranslationX((-gm0.K(62.0f * yl5.d().getDisplayMetrics().density)) - gm0.K(80.0f * yl5.d().getDisplayMetrics().density));
            lgbVar.setMirrored(false);
            return;
        }
        xd1Var.setPullViewMovementParams$calls_ui((wd1) this.B.getValue());
        xd1Var.setTranslationX((((Number) xy1Var.invoke()).floatValue() / 2.0f) + gm0.K(yl5.d().getDisplayMetrics().density * 62.0f));
        lgbVar.setTranslationX(((Number) xy1Var.invoke()).intValue() + gm0.K(62.0f * yl5.d().getDisplayMetrics().density));
        lgbVar.setMirrored(true);
    }
}
