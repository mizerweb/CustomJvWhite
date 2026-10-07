package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.WeakHashMap;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import one.me.keyboardmedia.MediaKeyboardWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class kz9 {
    public static final /* synthetic */ zv8[] p;
    public final hve a;
    public final View b;
    public final View c;
    public final af7 d;
    public final boolean e;
    public final v09 f;
    public boolean g;
    public final IntConsumer h;
    public final boolean i;
    public final boolean j;
    public final IntSupplier k;
    public final af7 l;
    public AnimatorSet m;
    public final p3c n;
    public boolean o;

    static {
        z8b z8bVar = new z8b(kz9.class, "keyboardObserverJob", "getKeyboardObserverJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        p = new zv8[]{z8bVar};
    }

    public kz9(hve hveVar, tp2 tp2Var, ViewGroup viewGroup, af7 af7Var, boolean z, v09 v09Var, boolean z2, IntConsumer intConsumer, w2e w2eVar, af7 af7Var2, int i) {
        intConsumer = (i & np0.m) != 0 ? null : intConsumer;
        boolean z3 = (i & np0.n) != 0;
        boolean z4 = (i & np0.o) == 0;
        w2e w2eVar2 = (i & 1024) == 0 ? w2eVar : null;
        this.a = hveVar;
        this.b = tp2Var;
        this.c = viewGroup;
        this.d = af7Var;
        this.e = z;
        this.f = v09Var;
        this.g = z2;
        this.h = intConsumer;
        this.i = z3;
        this.j = z4;
        this.k = w2eVar2;
        this.l = af7Var2;
        this.n = qyj.S();
    }

    public final int a(int i) {
        if (this.i) {
            return i;
        }
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public final int b(int i) {
        Integer numH;
        Integer numValueOf = null;
        IntSupplier intSupplier = this.k;
        Integer numValueOf2 = intSupplier != null ? Integer.valueOf(intSupplier.getAsInt()) : null;
        View view = this.b;
        if (numValueOf2 == null || numValueOf2.intValue() <= 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                numValueOf = Integer.valueOf(viewGroup.getMeasuredHeight());
            }
        } else {
            numValueOf = numValueOf2;
        }
        int iIntValue = (numValueOf == null || numValueOf.intValue() == 0) ? view.getContext().getResources().getDisplayMetrics().heightPixels : numValueOf.intValue();
        int iIntValue2 = 0;
        if (Build.VERSION.SDK_INT <= 30 && (numH = n7j.h(view)) != null) {
            iIntValue2 = numH.intValue();
        }
        return (iIntValue - i) - iIntValue2;
    }

    public final void c() {
        zv8[] zv8VarArr = p;
        zv8 zv8Var = zv8VarArr[0];
        p3c p3cVar = this.n;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        p3cVar.B(this, zv8VarArr[0], null);
        AnimatorSet animatorSet = this.m;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.m = null;
        hve hveVar = this.a;
        if (hveVar.o()) {
            hveVar.D();
        }
    }

    public final void d(af7 af7Var) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view;
        View view2;
        boolean z = this.e;
        View view3 = this.b;
        int i = 0;
        if (z) {
            int iG = g();
            int iG2 = g();
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int iA = a(iG2 + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0));
            AnimatorSet animatorSet = this.m;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            ValueAnimator valueAnimatorE = e(iA);
            MediaKeyboardWidget mediaKeyboardWidgetH = h();
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt((mediaKeyboardWidgetH == null || (view2 = mediaKeyboardWidgetH.getView()) == null) ? 0 : view2.getHeight(), iG);
            valueAnimatorOfInt.addUpdateListener(new hz9(this, i));
            animatorSet2.playTogether(valueAnimatorE, valueAnimatorOfInt);
            animatorSet2.setDuration(200L);
            lsk.d(animatorSet2, new vx9(this, 2, af7Var));
            animatorSet2.start();
            this.m = animatorSet2;
        } else {
            int iG3 = g();
            MediaKeyboardWidget mediaKeyboardWidgetH2 = h();
            if (mediaKeyboardWidgetH2 != null && (view = mediaKeyboardWidgetH2.getView()) != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 == null) {
                    ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return;
                } else {
                    layoutParams2.height = iG3;
                    view.setLayoutParams(layoutParams2);
                }
            }
            ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
            marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            i = marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0;
            View view4 = this.c;
            view4.setPadding(view4.getPaddingLeft(), view4.getPaddingTop(), view4.getPaddingRight(), iG3 + i);
            af7Var.invoke();
        }
        IntConsumer intConsumer = this.h;
        if (intConsumer != null) {
            intConsumer.accept(g());
        }
    }

    public final ValueAnimator e(int i) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.c.getPaddingBottom(), i);
        valueAnimatorOfInt.addUpdateListener(new hz9(this, 1));
        return valueAnimatorOfInt;
    }

    public final void f(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view;
        boolean z = this.e;
        IntConsumer intConsumer = this.h;
        int i2 = 0;
        View view2 = this.b;
        if (z) {
            int iB = b(i);
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i3 = iB - (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
            AnimatorSet animatorSet = this.m;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            ValueAnimator valueAnimatorE = e(a(iB));
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(g(), i3);
            valueAnimatorOfInt.addUpdateListener(new hz9(this, i2));
            animatorSet2.playTogether(valueAnimatorE, valueAnimatorOfInt);
            animatorSet2.setDuration(200L);
            animatorSet2.start();
            this.m = animatorSet2;
            if (intConsumer != null) {
                intConsumer.accept(i3);
                return;
            }
            return;
        }
        int iB2 = b(i);
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i4 = iB2 - (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
        MediaKeyboardWidget mediaKeyboardWidgetH = h();
        if (mediaKeyboardWidgetH != null && (view = mediaKeyboardWidgetH.getView()) != null) {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            if (layoutParams3 == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            } else {
                layoutParams3.height = i4;
                view.setLayoutParams(layoutParams3);
            }
        }
        int iA = a(iB2);
        View view3 = this.c;
        view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), iA);
        if (intConsumer != null) {
            intConsumer.accept(i4);
        }
    }

    public final int g() {
        int i = uw8.a;
        return uw8.a(this.b.getContext());
    }

    public final MediaKeyboardWidget h() {
        lve lveVar = (lve) ww3.t1(this.a.e());
        br4 br4Var = lveVar != null ? lveVar.a : null;
        if (br4Var instanceof MediaKeyboardWidget) {
            return (MediaKeyboardWidget) br4Var;
        }
        return null;
    }

    public final void i(boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (this.a.o()) {
            boolean z2 = this.e;
            View view = this.b;
            if (z2) {
                int i = 1;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getTranslationY(), view.getHeight());
                AnimatorSet animatorSet = this.m;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                if (z) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    animatorSet2.playTogether(e(marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0), objectAnimatorOfFloat);
                } else {
                    animatorSet2.play(objectAnimatorOfFloat);
                }
                animatorSet2.setDuration(200L);
                lsk.d(animatorSet2, new gz9(this, i));
                animatorSet2.start();
                this.m = animatorSet2;
            } else {
                if (this.i) {
                    view.setTranslationY(view.getHeight());
                } else {
                    view.setTranslationY(0.0f);
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 == null) {
                        ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        return;
                    } else {
                        layoutParams2.height = 0;
                        view.setLayoutParams(layoutParams2);
                    }
                }
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                int i2 = marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0;
                View view2 = this.c;
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), i2);
                if (this.j) {
                    view.setVisibility(8);
                }
                this.o = false;
                c();
            }
            IntConsumer intConsumer = this.h;
            if (intConsumer != null) {
                intConsumer.accept(0);
            }
        }
    }

    public final boolean j() {
        View view;
        MediaKeyboardWidget mediaKeyboardWidgetH = h();
        return ((mediaKeyboardWidgetH == null || (view = mediaKeyboardWidgetH.getView()) == null) ? 0 : view.getHeight()) > g();
    }

    public final void k() {
        if (this.o && this.g) {
            int iG = g();
            View view = this.b;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int iA = a(iG + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0));
            View view2 = this.c;
            if (view2.getPaddingBottom() != iA) {
                this.g = false;
                AnimatorSet animatorSet = this.m;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                view.setTranslationY(0.0f);
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), iA);
            }
        }
    }

    public final void l() {
        this.o = true;
        boolean z = this.i;
        View view = this.b;
        if (!z) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            } else {
                layoutParams.height = -2;
                view.setLayoutParams(layoutParams);
            }
        }
        boolean z2 = this.e;
        View view2 = this.c;
        int i = 0;
        lq4 lq4Var = null;
        if (z2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getTranslationY(), 0.0f);
            int iG = g();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int iA = a(iG + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0));
            boolean z3 = view2.getPaddingBottom() != iA;
            AnimatorSet animatorSet = this.m;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            if (z3) {
                animatorSet2.playTogether(e(iA), objectAnimatorOfFloat);
            } else {
                animatorSet2.play(objectAnimatorOfFloat);
            }
            animatorSet2.setDuration(200L);
            animatorSet2.addListener(new bl(animatorSet2, new gz9(this, i), 1));
            animatorSet2.start();
            this.m = animatorSet2;
        } else {
            int i2 = uw8.a;
            boolean zB = uw8.b(uw8.c);
            tw8 tw8Var = (tw8) this.d.invoke();
            if (tw8Var != null) {
                tw8Var.i();
            }
            if (this.j) {
                view.setVisibility(0);
            }
            int iG2 = g();
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            int iA2 = a(iG2 + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0));
            if (zB) {
                jz9 jz9Var = new jz9(view2, this, iA2);
                WeakHashMap weakHashMap = i7j.a;
                swj.a(view2, jz9Var);
            } else {
                boolean z4 = view2.getPaddingBottom() != iA2;
                view.setTranslationY(0.0f);
                if (z4) {
                    view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), iA2);
                }
            }
        }
        IntConsumer intConsumer = this.h;
        if (intConsumer != null) {
            intConsumer.accept(g());
        }
        mjg mjgVar = uw8.f;
        xx6 xc3Var = new xc3(mjgVar, 14);
        if (((Boolean) mjgVar.getValue()).booleanValue()) {
            xc3Var = e9i.K(xc3Var, 1);
        }
        this.n.B(this, p[0], mmc.d(new fz6(xc3Var, new c37(this, lq4Var, 7), 3), this.f));
    }
}
