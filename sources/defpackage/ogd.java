package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import android.widget.TextView;
import one.me.chatscreen.ChatScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ogd extends yk {
    public static final long o;
    public static final long p;
    public static final /* synthetic */ int q = 0;
    public final long k;
    public final int[] l;
    public int m;
    public final b7 n;

    static {
        new PathInterpolator(0.4f, 0.0f, 0.0f, 1.0f);
        o = qx6.a(0.5f, 10.0f);
        p = qx6.a(0.0f, 0.1f);
    }

    public ogd(long j) {
        super(0L, false);
        this.k = j;
        this.l = new int[2];
        this.n = new b7(3, this);
    }

    public static void o(View view, View view2, float f, float f2, float f3) {
        float fC = tqk.c(f2, 1.0f, f);
        view.setScaleX(fC);
        view.setScaleY(fC);
        view.setTranslationX(((1.0f - f) * f3) + view2.getLeft());
        view.setTranslationY(view2.getTop());
    }

    public static sz0 p(ViewGroup viewGroup, View view, va3 va3Var) {
        View viewFindViewById = viewGroup.findViewById(R.id.preview_blur_overlay);
        lq4 lq4Var = null;
        if (viewFindViewById != null) {
            ViewParent parent = viewFindViewById.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewFindViewById);
            }
        }
        Context context = viewGroup.getContext();
        View view2 = new View(context);
        view2.setId(R.id.preview_blur_overlay);
        view2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        view2.setElevation(yl5.d().getDisplayMetrics().density * 9.0f);
        view2.setClickable(true);
        n1g.N(new vc3(context, view, lq4Var, 6), view2);
        qe7.H(view2, 300L, new sl1(va3Var));
        viewGroup.addView(view2);
        return (sz0) view2.getBackground();
    }

    public static final void q(View view, View view2, View view3, View view4, View view5, float f) {
        Drawable background;
        view.setAlpha(f);
        view2.setAlpha(f);
        if (view3 != null && (background = view3.getBackground()) != null) {
            background.setAlpha((int) (255.0f * f));
        }
        if (view4 != null) {
            view4.setAlpha(f);
        }
        view5.setAlpha(f);
    }

    public static ObjectAnimator r(View view, boolean z, af7 af7Var) {
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        ylc ylcVar = z ? new ylc(fValueOf2, fValueOf) : new ylc(fValueOf, fValueOf2);
        float fFloatValue = ((Number) ylcVar.a).floatValue();
        float fFloatValue2 = ((Number) ylcVar.b).floatValue();
        view.setAlpha(fFloatValue);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, fFloatValue, fFloatValue2);
        objectAnimatorOfFloat.setDuration(z ? 500L : 300L);
        objectAnimatorOfFloat.setInterpolator(objectAnimatorOfFloat.getInterpolator());
        if (af7Var != null) {
            objectAnimatorOfFloat.addListener(new mgd(0, af7Var));
        }
        return objectAnimatorOfFloat;
    }

    public static float t(int i, float f, View view, int i2) {
        return ((gm0.K(56.0f * yl5.d().getDisplayMetrics().density) - i2) / 2.0f) + ((i - f) - view.getLeft());
    }

    public static float u(float f) {
        float fU = oc9.u(tqk.b(0.05f, 1.0f, f), 0.0f, 1.0f);
        long j = o;
        if (fU >= 1.0f) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return tqk.c(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)), ((int) (fU / 0.2f)) * 0.2f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yk
    public final Animator l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        xu2 xu2VarI0;
        boolean z3;
        b7 b7Var = this.n;
        long j = this.k;
        int[] iArr = this.l;
        if (!z || view2 == 0 || view == 0) {
            if (z || view == 0 || view2 == 0) {
                return new AnimatorSet();
            }
            chd chdVar = view2 instanceof chd ? (chd) view2 : null;
            if (chdVar == null || (xu2VarI0 = chdVar.i0(j)) == null) {
                return r(view, false, new yp4(view, 2));
            }
            va3 va3Var = view instanceof va3 ? (va3) view : null;
            if (va3Var == null) {
                return r(view, false, new yp4(view, 3));
            }
            kwb kwbVar = xu2VarI0.a;
            TextView textView = xu2VarI0.b;
            View viewFindViewById = view.findViewById(R.id.oneme_toolbar_title_avatar);
            ViewParent parent = viewFindViewById.getParent();
            rcc rccVar = parent instanceof rcc ? (rcc) parent : null;
            if (rccVar == null) {
                return r(view, false, new yp4(view, 4));
            }
            kwbVar.getLocationInWindow(iArr);
            int i = iArr[0];
            int iK = gm0.K(rccVar.getForm().a * yl5.d().getDisplayMetrics().density);
            float fK = gm0.K(yl5.d().getDisplayMetrics().density * 56.0f) / iK;
            rccVar.getLocationInWindow(iArr);
            float fT = t(i, iArr[0] - view.getTranslationX(), viewFindViewById, iK);
            viewGroup.getLocationInWindow(iArr);
            c79 c79VarJ = rccVar.j(i - iArr[0], false);
            kgd kgdVarV = v(viewGroup, xu2VarI0, rccVar, view);
            int i2 = kgdVarV.e;
            View viewFindViewById2 = view2.findViewById(R.id.preview_blur_overlay);
            Drawable background = viewFindViewById2 != null ? viewFindViewById2.getBackground() : null;
            sz0 sz0Var = background instanceof sz0 ? (sz0) background : null;
            View viewFindViewById3 = rccVar.findViewById(R.id.preview_avatar_overlay);
            float f = kgdVarV.f / kgdVarV.g;
            c79 c79VarW = yab.w();
            rcc rccVar2 = rccVar;
            sz0 sz0Var2 = sz0Var;
            c79VarW.add(fsk.a(view, View.TRANSLATION_X, kgdVarV.c, 0.0f, 0L, 0L, false, 248));
            c79VarW.add(fsk.a(view, View.TRANSLATION_Y, kgdVarV.b, kgdVarV.a, 0L, 0L, false, 248));
            c79VarW.add(fsk.a(view, View.SCALE_X, 1.0f, f, 0L, 0L, false, 248));
            int i3 = kgdVarV.d;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, i3);
            valueAnimatorOfInt.addUpdateListener(new mk(this, 7, view));
            valueAnimatorOfInt.addListener(new g7e(this, i3, view));
            c79VarW.add(valueAnimatorOfInt);
            Object parent2 = rccVar2.getParent();
            View view3 = parent2 instanceof View ? (View) parent2 : null;
            ChatScreen chatScreen = va3Var.d;
            ou7 ou7Var = ChatScreen.L1;
            c79VarW.add(s(false, f, rccVar2, viewFindViewById, viewFindViewById3, fK, fT, view3, chatScreen.M1(), sz0Var2));
            c79 c79VarJ2 = yab.j(c79VarW);
            if (viewFindViewById3 != null) {
                viewFindViewById3.setVisibility(0);
            }
            viewFindViewById.setAlpha(0.0f);
            kwbVar.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            this.m = i2;
            view.setScaleX(1.0f);
            view.setPivotX(0.0f);
            view.setClipToOutline(true);
            view.setOutlineProvider(b7Var);
            view.invalidateOutline();
            rccVar2.setPivotX(0.0f);
            rccVar2.setScaleX(1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ww3.G1(c79VarJ, c79VarJ2));
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(animatorSet.getInterpolator());
            animatorSet.addListener(new c7(view, 5));
            return animatorSet;
        }
        chd chdVar2 = view instanceof chd ? (chd) view : null;
        if (chdVar2 != null) {
            xu2 xu2VarI1 = chdVar2.i0(j);
            if (xu2VarI1 != null) {
                kwb kwbVar2 = xu2VarI1.a;
                va3 va3Var2 = view2 instanceof va3 ? (va3) view2 : null;
                if (va3Var2 == null) {
                    return r(view2, true, null);
                }
                ChatScreen chatScreen2 = va3Var2.d;
                TextView textView2 = xu2VarI1.b;
                ou7 ou7Var2 = ChatScreen.L1;
                rcc rccVarG2 = chatScreen2.g2();
                rcc rccVar3 = rccVarG2 != null ? rccVarG2 : null;
                if (rccVar3 == null) {
                    return r(view2, true, null);
                }
                View viewFindViewById4 = rccVar3.findViewById(R.id.oneme_toolbar_title_avatar);
                View viewM1 = chatScreen2.M1();
                int iK2 = gm0.K(rccVar3.getForm().a * yl5.d().getDisplayMetrics().density);
                float fK2 = gm0.K(yl5.d().getDisplayMetrics().density * 56.0f) / iK2;
                Object parent3 = rccVar3.getParent();
                View view4 = parent3 instanceof View ? (View) parent3 : null;
                ote oteVarD = kwbVar2.b.d();
                ku2 ku2Var = new ku2(rccVar3.getContext());
                ku2Var.setId(R.id.preview_avatar_overlay);
                ku2Var.setLayoutParams(new ViewGroup.LayoutParams(iK2, iK2));
                rccVar3.addView(ku2Var);
                View view5 = view4;
                ku2Var.measure(View.MeasureSpec.makeMeasureSpec(iK2, 1073741824), View.MeasureSpec.makeMeasureSpec(iK2, 1073741824));
                ku2Var.layout(0, 0, ku2Var.getMeasuredWidth(), ku2Var.getMeasuredHeight());
                ku2Var.b = kwbVar2;
                ku2Var.a = oteVarD;
                if (oteVarD != null) {
                    oteVarD.setCallback(ku2Var);
                }
                ku2Var.invalidate();
                bdc.a(ku2Var, new sda(ku2Var, kwbVar2, 1));
                sz0 sz0VarP = p((ViewGroup) view, view2, va3Var2);
                kwbVar2.getLocationInWindow(iArr);
                int i4 = iArr[0];
                rccVar3.getLocationInWindow(iArr);
                float fT2 = t(i4, iArr[0], viewFindViewById4, iK2);
                viewGroup.getLocationInWindow(iArr);
                c79 c79VarJ3 = rccVar3.j(i4 - iArr[0], true);
                kgd kgdVarV2 = v(viewGroup, xu2VarI1, rccVar3, view2);
                int i5 = kgdVarV2.e;
                int i6 = kgdVarV2.d;
                int i7 = kgdVarV2.f;
                int i8 = kgdVarV2.g;
                float f2 = i7 / i8;
                c79 c79VarW2 = yab.w();
                rcc rccVar4 = rccVar3;
                c79VarW2.add(fsk.a(view2, View.TRANSLATION_X, 0.0f, kgdVarV2.c, 0L, 0L, true, 120));
                c79VarW2.add(fsk.a(view2, View.TRANSLATION_Y, kgdVarV2.a, kgdVarV2.b, 0L, 0L, true, 120));
                c79VarW2.add(fsk.a(view2, View.SCALE_X, f2, 1.0f, 0L, 0L, true, 120));
                ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i6, i5);
                valueAnimatorOfInt2.addUpdateListener(new mk(this, 7, view2));
                valueAnimatorOfInt2.addListener(new g7e(this, i5, view2));
                c79VarW2.add(valueAnimatorOfInt2);
                c79VarW2.add(s(true, f2, rccVar4, viewFindViewById4, ku2Var, fK2, fT2, view5, viewM1, sz0VarP));
                c79 c79VarJ4 = yab.j(c79VarW2);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(kgdVarV2.a);
                view2.setScaleX(f2);
                view2.setPivotX(0.0f);
                this.m = i6;
                view2.setClipToOutline(true);
                view2.setOutlineProvider(b7Var);
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    p51.d();
                    return null;
                }
                layoutParams.height = i5;
                layoutParams.width = i8;
                view2.setLayoutParams(layoutParams);
                view2.invalidateOutline();
                rccVar4.setPivotX(0.0f);
                rccVar4.setScaleX(1.0f / f2);
                q(viewFindViewById4, textView2, view5, viewM1, kwbVar2, 0.0f);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ww3.G1(c79VarJ4, c79VarJ3));
                animatorSet2.setDuration(500L);
                animatorSet2.setInterpolator(animatorSet2.getInterpolator());
                animatorSet2.addListener(new lgd(ku2Var, viewFindViewById4, textView2, view5, viewM1, kwbVar2));
                return animatorSet2;
            }
            z3 = true;
        } else {
            z3 = true;
        }
        return r(view2, z3, null);
    }

    @Override // defpackage.yk
    public final void n(View view) {
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
        view.setClipToOutline(false);
        view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            p51.d();
            return;
        }
        layoutParams.width = -1;
        layoutParams.height = -1;
        view.setLayoutParams(layoutParams);
    }

    public final ValueAnimator s(boolean z, final float f, final rcc rccVar, final View view, final View view2, final float f2, final float f3, final View view3, final View view4, final sz0 sz0Var) {
        float f4 = z ? 0.0f : 1.0f;
        float f5 = z ? 1.0f : 0.0f;
        float f6 = z ? 1.0f : 1.0f / f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f4, f5);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(view3, view4, view2, this, view, f2, f3, rccVar, f, sz0Var) { // from class: jgd
            public final /* synthetic */ View a;
            public final /* synthetic */ View b;
            public final /* synthetic */ View c;
            public final /* synthetic */ View d;
            public final /* synthetic */ float e;
            public final /* synthetic */ float f;
            public final /* synthetic */ rcc g;
            public final /* synthetic */ float h;
            public final /* synthetic */ sz0 i;

            {
                this.d = view;
                this.e = f2;
                this.f = f3;
                this.g = rccVar;
                this.h = f;
                this.i = sz0Var;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Drawable background;
                int i = ogd.q;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                long j = ogd.p;
                float fU = oc9.u(tqk.b(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), fFloatValue), 0.0f, 1.0f);
                View view5 = this.a;
                if (view5 != null && (background = view5.getBackground()) != null) {
                    background.setAlpha((int) (255.0f * fU));
                }
                View view6 = this.b;
                if (view6 != null) {
                    view6.setAlpha(fU);
                }
                View view7 = this.c;
                if (view7 != null) {
                    ogd.o(view7, this.d, fFloatValue, this.e, this.f);
                }
                this.g.setScaleX(1.0f / tqk.c(this.h, 1.0f, fFloatValue));
                sz0 sz0Var2 = this.i;
                if (sz0Var2 != null) {
                    float fU2 = oc9.u(ogd.u(fFloatValue), 0.0f, 25.0f);
                    float f7 = sz0Var2.k;
                    sz0Var2.k = fU2;
                    if (f7 == fU2) {
                        return;
                    }
                    sz0Var2.invalidateSelf();
                }
            }
        });
        valueAnimatorOfFloat.addListener(new ngd(view2, this, view, f5, f2, f3, rccVar, f6, sz0Var));
        return valueAnimatorOfFloat;
    }

    public final kgd v(ViewGroup viewGroup, xu2 xu2Var, rcc rccVar, View view) {
        int[] iArr = this.l;
        xu2Var.getLocationInWindow(iArr);
        int i = iArr[1];
        rccVar.getLocationInWindow(iArr);
        float translationY = view.getTranslationY() + (i - iArr[1]);
        viewGroup.getLocationInWindow(iArr);
        int i2 = iArr[1];
        Integer numL = n7j.l(viewGroup);
        int iIntValue = numL != null ? numL.intValue() : 0;
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        int iK2 = iIntValue + gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        return new kgd(translationY, iK2 - i2, iK, gm0.K(80.0f * yl5.d().getDisplayMetrics().density), ((viewGroup.getHeight() + i2) - gm0.K(120.0f * yl5.d().getDisplayMetrics().density)) - iK2, viewGroup.getWidth(), viewGroup.getWidth() - (iK * 2));
    }

    public ogd() {
        this(0L);
    }
}
