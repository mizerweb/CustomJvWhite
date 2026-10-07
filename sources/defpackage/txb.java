package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class txb extends LinearLayout implements eph {
    public static final nhb h;
    public static final /* synthetic */ zv8[] i;
    public static final PathInterpolator j;
    public static final PathInterpolator k;
    public final qj0 a;
    public final int b;
    public List c;
    public o6g d;
    public final ArrayList e;
    public ObjectAnimator f;
    public AnimatorSet g;

    static {
        z8b z8bVar = new z8b(txb.class, "isBlurEnabled", "isBlurEnabled()Ljava/lang/Boolean;");
        zfe.a.getClass();
        i = new zv8[]{z8bVar};
        h = new nhb(20);
        j = new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f);
        k = new PathInterpolator(0.4f, 0.0f, 0.0f, 1.0f);
    }

    public txb(Context context) {
        super(context, null);
        this.a = new qj0(3, this);
        int iK = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        this.b = iK;
        this.c = r66.a;
        this.e = new ArrayList();
        setOrientation(0);
        setElevation(16.0f * yl5.d().getDisplayMetrics().density);
        setClickable(true);
        setPadding(iK, getPaddingTop(), iK, getPaddingBottom());
        i7j.l(this, new g11(this, 1));
    }

    public static void d(txb txbVar, af7 af7Var, int i2) {
        txbVar.a(false, j, (i2 & 4) != 0, af7Var);
    }

    private final float getHiddenScale() {
        return !this.e.isEmpty() ? 0.75f : 0.85f;
    }

    public static void k(txb txbVar, int i2) {
        txbVar.a(true, j, (i2 & 4) != 0, null);
    }

    public final void a(boolean z, Interpolator interpolator, boolean z2, af7 af7Var) {
        ObjectAnimator objectAnimator = this.f;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f = null;
        AnimatorSet animatorSet = this.g;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.g = null;
        float hiddenScale = getHiddenScale();
        float f = (z || !z2) ? 1.0f : 0.0f;
        final float f2 = z ? hiddenScale : 1.0f;
        final float f3 = z ? 1.0f : hiddenScale;
        if (z) {
            setVisibility(0);
            e(f2);
        }
        if (getAlpha() == f && z2) {
            if (z) {
                setAlpha(1.0f);
                e(f3);
            } else {
                setVisibility(8);
                setAlpha(0.0f);
                e(f3);
            }
            if (af7Var != null) {
                af7Var.invoke();
                return;
            }
            return;
        }
        if (getAlpha() != f) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<txb, Float>) LinearLayout.ALPHA, getAlpha(), f);
            objectAnimatorOfFloat.setDuration(125L);
            objectAnimatorOfFloat.setInterpolator(interpolator);
            objectAnimatorOfFloat.addListener(new sxb(af7Var, z, this, f3));
            objectAnimatorOfFloat.start();
            this.f = objectAnimatorOfFloat;
        } else if (af7Var != null) {
            af7Var.invoke();
        }
        final long j2 = z2 ? 450L : 325L;
        qu6 qu6VarM0 = yhf.m0(new sw(4, this), new s9a(27));
        final PathInterpolator pathInterpolator = k;
        List listW0 = yhf.w0(yhf.q0(qu6VarM0, new cf7() { // from class: kxb
            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                View view = (View) obj;
                Property property = LinearLayout.SCALE_X;
                float f4 = f2;
                float f5 = f3;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f4, f5);
                long j3 = j2;
                objectAnimatorOfFloat2.setDuration(j3);
                Interpolator interpolator2 = pathInterpolator;
                objectAnimatorOfFloat2.setInterpolator(interpolator2);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) LinearLayout.SCALE_Y, f4, f5);
                objectAnimatorOfFloat3.setDuration(j3);
                objectAnimatorOfFloat3.setInterpolator(interpolator2);
                return xw3.P0(objectAnimatorOfFloat2, objectAnimatorOfFloat3);
            }
        }));
        if (listW0.isEmpty()) {
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(listW0);
        animatorSet2.addListener(new y7(6, this));
        animatorSet2.start();
        this.g = animatorSet2;
    }

    public final void b(h11 h11Var, mxb mxbVar, View.OnClickListener onClickListener, al9 al9Var) {
        rxb rxbVarA = mxbVar.a();
        int i2 = rxbVarA.e;
        qxb qxbVar = rxbVarA.b;
        h11Var.setId(i2);
        cs csVar = h11Var.t;
        tre.E0(R.id.tag_tab_item, h11Var, rxbVarA);
        Integer num = rxbVarA.a;
        if (num != null) {
            h11Var.setText(num.intValue());
        } else {
            h11Var.setText("");
        }
        int i3 = 0;
        if (qxbVar instanceof oxb) {
            oxb oxbVar = (oxb) qxbVar;
            Drawable drawable = (Drawable) oxbVar.a.invoke(getContext());
            tf7 tf7Var = oxbVar.b;
            csVar.setImageDrawable(drawable);
            h11Var.y = tf7Var;
            h11Var.u();
        } else {
            if (!(qxbVar instanceof pxb)) {
                ore.o();
                return;
            }
            int i4 = ((pxb) qxbVar).a;
            lxb lxbVar = new lxb(i3);
            csVar.setImageDrawable(wk8.o(h11Var.getContext(), i4));
            h11Var.y = lxbVar;
            h11Var.u();
        }
        h11Var.v.setVisibility(8);
        h11Var.u.setVisibility(8);
        h11Var.setSelected(false);
        h11Var.setVisibility(0);
        qe7.H(h11Var, 300L, onClickListener);
        h11Var.setOnLongClickListener(new ro2(al9Var, 6, mxbVar));
    }

    public final void c() {
        o6g o6gVar = this.d;
        if (o6gVar != null) {
            o6gVar.dismiss();
        }
        this.d = null;
    }

    public final void e(float f) {
        y1 y1Var = new y1(2, this);
        while (y1Var.hasNext()) {
            View view = (View) y1Var.next();
            if (view.getVisibility() == 0) {
                view.setScaleX(f);
                view.setScaleY(f);
            }
        }
    }

    public final void f() {
        y1 y1Var = new y1(2, this);
        int i2 = 0;
        while (y1Var.hasNext()) {
            if (((View) y1Var.next()).getVisibility() == 0 && (i2 = i2 + 1) < 0) {
                xw3.U0();
                throw null;
            }
        }
        setWeightSum(i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            if (i3 == 0) {
                marginLayoutParams.leftMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
                marginLayoutParams.rightMargin = getChildCount() == 1 ? gm0.K(12.0f * yl5.d().getDisplayMetrics().density) : gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
            } else if (i3 == getChildCount() - 1) {
                marginLayoutParams.rightMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
            } else {
                marginLayoutParams.rightMargin = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
            }
            childAt.setLayoutParams(marginLayoutParams);
        }
    }

    public final void g(rxb rxbVar) {
        y1 y1Var = new y1(2, this);
        while (y1Var.hasNext()) {
            View view = (View) y1Var.next();
            ((h11) view).setSelected(tre.h0(view, R.id.tag_tab_item) == rxbVar);
        }
    }

    public final int getSelectedItemId() {
        y1 y1Var = new y1(2, this);
        while (y1Var.hasNext()) {
            View view = (View) y1Var.next();
            if (view.isSelected()) {
                Object objH0 = tre.h0(view, R.id.tag_tab_item);
                rxb rxbVar = objH0 instanceof rxb ? (rxb) objH0 : null;
                if (rxbVar == null) {
                    break;
                }
                return rxbVar.c;
            }
        }
        return -1;
    }

    public final void h(nxb nxbVar) {
        int i2 = 0;
        while (true) {
            if (!(i2 < getChildCount())) {
                return;
            }
            int i3 = i2 + 1;
            View childAt = getChildAt(i2);
            if (childAt == null) {
                ore.i();
                return;
            }
            Object objH0 = tre.h0(childAt, R.id.tag_tab_item);
            rxb rxbVar = objH0 instanceof rxb ? (rxb) objH0 : null;
            if (rxbVar != null && rxbVar.c == R.id.oneme_main_chats_container) {
                h11 h11Var = (h11) childAt;
                int i4 = nxbVar.a;
                h11Var.setCounter(i4);
                CharSequence text = h11Var.getText();
                if (text != null) {
                    if (i4 > 0) {
                        text = ((Object) text) + " " + i4;
                    }
                    h11Var.setContentDescription(text);
                }
            }
            i2 = i3;
        }
    }

    public final void i(boolean z) {
        int i2 = 0;
        while (true) {
            if (!(i2 < getChildCount())) {
                return;
            }
            int i3 = i2 + 1;
            View childAt = getChildAt(i2);
            if (childAt == null) {
                ore.i();
                return;
            }
            Object objH0 = tre.h0(childAt, R.id.tag_tab_item);
            rxb rxbVar = objH0 instanceof rxb ? (rxb) objH0 : null;
            if (rxbVar != null && rxbVar.c == R.id.oneme_main_calls_container) {
                if ((childAt.getVisibility() == 0) == z) {
                    return;
                }
                childAt.setVisibility(z ? 0 : 8);
                f();
            }
            i2 = i3;
        }
    }

    public final void j(kbc kbcVar, Boolean bool) {
        Context context = getContext();
        int i2 = kbcVar.k().b;
        Boolean bool2 = Boolean.TRUE;
        Drawable drawableA = rx8.a(context, i2, 2.0f, cqk.d(bool, bool2));
        if (!cqk.d(bool, bool2)) {
            drawableA.setAlpha(255);
        }
        setBackground(drawableA);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ObjectAnimator objectAnimator = this.f;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f = null;
        AnimatorSet animatorSet = this.g;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.g = null;
        c();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        float f;
        mi8 mi8VarF = ixj.g(getRootWindowInsets(), this).a.f(2);
        int i4 = 0;
        while (true) {
            if (!(i4 < getChildCount())) {
                h.getClass();
                super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(getPaddingTop() + getPaddingBottom() + nhb.d(this), 1073741824));
                return;
            }
            int i5 = i4 + 1;
            View childAt = getChildAt(i4);
            if (childAt == null) {
                ore.i();
                return;
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams == null) {
                ore.n("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                return;
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            float f2 = 10.0f;
            layoutParams2.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 10.0f);
            if (mi8VarF.d > 0) {
                f = yl5.d().getDisplayMetrics().density;
            } else {
                f = yl5.d().getDisplayMetrics().density;
                f2 = 12.0f;
            }
            layoutParams2.bottomMargin = gm0.K(f2 * f);
            childAt.setLayoutParams(layoutParams2);
            i4 = i5;
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        zv8 zv8Var = i[0];
        j(kbcVar, (Boolean) this.a.b);
        int i2 = 0;
        while (true) {
            if (!(i2 < getChildCount())) {
                return;
            }
            int i3 = i2 + 1;
            View childAt = getChildAt(i2);
            if (childAt == null) {
                ore.i();
                return;
            } else {
                ((h11) childAt).u();
                i2 = i3;
            }
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        if (i2 != 0) {
            c();
        }
        super.onWindowVisibilityChanged(i2);
    }

    public final void setBlurEnabled(Boolean bool) {
        this.a.B(this, i[0], bool);
    }
}
