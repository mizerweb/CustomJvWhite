package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class l9c extends wf4 implements eph {
    public static final /* synthetic */ zv8[] G = {new z8b(l9c.class, "leftElement", "getLeftElement()Lone/me/sdk/snackbar/OneMeSnackbarModel$Left;"), zo5.e(zfe.a, l9c.class, "rightElement", "getRightElement()Lone/me/sdk/snackbar/OneMeSnackbarModel$Right;"), new z8b(l9c.class, "styled", "getStyled()Lone/me/sdk/snackbar/OneMeSnackbarModel$Style;")};
    public final ny8 A;
    public final ny8 B;
    public final ViewStub C;
    public final ny8 D;
    public final ViewStub E;
    public final ny8 F;
    public final k9c s;
    public final k9c t;
    public final k9c u;
    public final ny8 v;
    public final ny8 w;
    public final ny8 x;
    public final TextView y;
    public final ny8 z;

    public l9c(final Context context) {
        super(context, null);
        final int i = 0;
        this.s = new k9c(this, 0);
        final int i2 = 1;
        this.t = new k9c(this, 1);
        this.u = new k9c(this, 2);
        this.v = rx8.P(3, new bzb(context, 8));
        this.w = rx8.P(3, new bzb(context, 9));
        this.x = rx8.P(3, new bzb(context, 10));
        TextView textViewE = qv1.e(context, R.id.oneme_snackbar_title_id);
        textViewE.setLayoutParams(new uf4(gm0.K(0.0f * yl5.d().getDisplayMetrics().density), -2));
        q9i.a(q9i.e, textViewE);
        a8g a8gVar = pq3.j;
        a8gVar.h(textViewE);
        textViewE.setTextColor(-1);
        textViewE.setMaxLines(3);
        textViewE.setEllipsize(TextUtils.TruncateAt.END);
        this.y = textViewE;
        this.z = rx8.P(3, new bzb(context, 11));
        this.A = rx8.P(3, new i9c(this, 0));
        this.B = rx8.P(3, new i9c(this, 1));
        ViewStub viewStubI = bc1.i(context, R.id.oneme_snackbar_style_shine);
        this.C = viewStubI;
        this.D = rx8.P(3, new af7() { // from class: j9c
            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i;
                l9c l9cVar = this;
                Context context2 = context;
                switch (i3) {
                    case 0:
                        View view = new View(context2);
                        view.setLayoutParams(new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(yl5.d().getDisplayMetrics().density * 40.0f)));
                        l9cVar.setClipToPadding(false);
                        view.setClipToOutline(false);
                        a1g a1gVar = new a1g(context2);
                        a1gVar.c();
                        int iK = gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
                        a1gVar.i.B(a1gVar, a1g.n[1], Integer.valueOf(iK));
                        view.setBackground(a1gVar);
                        return view;
                    default:
                        mi miVar = new mi(context2);
                        miVar.setLayoutParams(new uf4(-1, 0));
                        miVar.setClipToOutline(false);
                        l9cVar.setClipChildren(false);
                        return miVar;
                }
            }
        });
        ViewStub viewStubI2 = bc1.i(context, R.id.oneme_snackbar_style_circle);
        this.E = viewStubI2;
        this.F = rx8.P(3, new af7() { // from class: j9c
            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                l9c l9cVar = this;
                Context context2 = context;
                switch (i3) {
                    case 0:
                        View view = new View(context2);
                        view.setLayoutParams(new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(yl5.d().getDisplayMetrics().density * 40.0f)));
                        l9cVar.setClipToPadding(false);
                        view.setClipToOutline(false);
                        a1g a1gVar = new a1g(context2);
                        a1gVar.c();
                        int iK = gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
                        a1gVar.i.B(a1gVar, a1g.n[1], Integer.valueOf(iK));
                        view.setBackground(a1gVar);
                        return view;
                    default:
                        mi miVar = new mi(context2);
                        miVar.setLayoutParams(new uf4(-1, 0));
                        miVar.setClipToOutline(false);
                        l9cVar.setClipChildren(false);
                        return miVar;
                }
            }
        });
        setId(R.id.oneme_snackbar_container_id);
        setLayoutParams(new uf4(-1, -2));
        setMinimumHeight(gm0.K(56.0f * yl5.d().getDisplayMetrics().density));
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        setPadding(iK, iK, iK, iK);
        setClipToOutline(false);
        setClipChildren(false);
        setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 16.0f));
        setBackgroundColor(a8gVar.h(this).k().f);
        addView(viewStubI);
        addView(viewStubI2);
    }

    private final ValueAnimator getBgAnimator() {
        return (ValueAnimator) this.B.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLeft(a9c a9cVar) {
        if (a9cVar instanceof w8c) {
            setupLeftContrastIcon(((w8c) a9cVar).a);
            return;
        }
        if (a9cVar instanceof y8c) {
            setupLeftNegativeIcon(((y8c) a9cVar).a);
            return;
        }
        boolean z = a9cVar instanceof v8c;
        ny8 ny8Var = this.v;
        if (z) {
            v8c v8cVar = (v8c) a9cVar;
            int i = v8cVar.a;
            int i2 = v8cVar.b;
            cs csVar = (cs) ny8Var.getValue();
            csVar.setId(R.id.oneme_snackbar_left_icon_id);
            csVar.setImageDrawable(csVar.getContext().getDrawable(i).mutate());
            csVar.setImageTintList(ColorStateList.valueOf(i2));
            yab.e(this, csVar, null);
            return;
        }
        if (a9cVar instanceof z8c) {
            nu4 nu4Var = (nu4) this.w.getValue();
            nu4Var.setId(R.id.oneme_snackbar_left_icon_id);
            nu4Var.setLayoutParams(new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(28.0f * yl5.d().getDisplayMetrics().density)));
            nu4Var.setMaxValue(5000L);
            yab.e(this, nu4Var, null);
            return;
        }
        if (!(a9cVar instanceof x8c)) {
            ore.o();
        } else if (ny8Var.d()) {
            ((cs) ny8Var.getValue()).setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRight(f9c f9cVar) {
        Integer numValueOf = Integer.valueOf(R.attr.text_primary_inverse_static);
        boolean zD = cqk.d(f9cVar, b9c.a);
        zxb zxbVar = zxb.GHOST;
        ny8 ny8Var = this.x;
        if (zD) {
            cyb cybVar = (cyb) ny8Var.getValue();
            cybVar.setId(R.id.oneme_snackbar_right_button_id);
            cybVar.setText(np4.q(cybVar.getContext(), R.string.oneme_snackbar_cancel_btn_title));
            cybVar.setAppearance(zxbVar);
            cybVar.setTextColor(numValueOf);
            yab.e(this, cybVar, null);
            return;
        }
        if (cqk.d(f9cVar, c9c.a)) {
            cyb cybVar2 = (cyb) ny8Var.getValue();
            cybVar2.setId(R.id.oneme_snackbar_right_button_id);
            cybVar2.setIconResource(R.drawable.icon_chevron_right);
            cybVar2.setAppearance(zxbVar);
            cybVar2.setTextColor(numValueOf);
            yab.e(this, cybVar2, null);
            return;
        }
        if (cqk.d(f9cVar, d9c.a)) {
            if (ny8Var.d()) {
                ((cyb) ny8Var.getValue()).setVisibility(8);
            }
        } else if (f9cVar instanceof e9c) {
            setupRightTextButton(((e9c) f9cVar).a);
        } else {
            ore.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStyle(g9c g9cVar) {
        int iOrdinal = g9cVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                ore.o();
                return;
            }
            n7j.m(this.E, (View) this.F.getValue(), null);
            n7j.m(this.C, (View) this.D.getValue(), null);
        }
    }

    private final void setupLeftContrastIcon(int i) {
        cs csVar = (cs) this.v.getValue();
        csVar.setId(R.id.oneme_snackbar_left_icon_id);
        csVar.setImageDrawable(csVar.getContext().getDrawable(i).mutate());
        pq3.j.h(csVar);
        csVar.setImageTintList(ColorStateList.valueOf(-1));
        yab.e(this, csVar, null);
    }

    private final void setupLeftNegativeIcon(int i) {
        cs csVar = (cs) this.v.getValue();
        csVar.setId(R.id.oneme_snackbar_left_icon_id);
        csVar.setImageDrawable(csVar.getContext().getDrawable(i).mutate());
        csVar.setImageTintList(ColorStateList.valueOf(pq3.j.h(csVar).getIcon().j));
        yab.e(this, csVar, null);
    }

    private final void setupRightTextButton(ynh ynhVar) {
        cyb cybVar = (cyb) this.x.getValue();
        cybVar.setId(R.id.oneme_snackbar_right_button_id);
        CharSequence charSequenceB = ynhVar.b(cybVar.getContext());
        if (charSequenceB == null) {
            charSequenceB = "";
        }
        cybVar.setText(charSequenceB);
        cybVar.setAppearance(zxb.GHOST);
        cybVar.setTextColor(Integer.valueOf(R.attr.text_primary_inverse_static));
        yab.e(this, cybVar, null);
    }

    public static AnimatorSet u(l9c l9cVar) {
        final mi miVar = (mi) l9cVar.F.getValue();
        final int i = 2;
        i9c i9cVar = new i9c(l9cVar, 2);
        miVar.getClass();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(633L);
        valueAnimatorOfFloat.setInterpolator(new ki(new PathInterpolator(0.542f, 0.012f, 0.862f, 0.987f), new PathInterpolator(0.167f, 0.167f, 0.0f, 0.0f)));
        final int i2 = 0;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ji
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i3 = i2;
                mi miVar2 = miVar;
                switch (i3) {
                    case 0:
                        miVar2.g = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 23.25f;
                        miVar2.invalidate();
                        break;
                    case 1:
                        miVar2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        miVar2.invalidate();
                        break;
                    case 2:
                        int[] iArr = miVar2.b;
                        iArr[2] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        iArr[3] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        miVar2.invalidate();
                        break;
                    default:
                        miVar2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        miVar2.invalidate();
                        break;
                }
            }
        });
        valueAnimatorOfFloat.addListener(new li(i2, i9cVar));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.2f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(ybg.a);
        valueAnimatorOfFloat2.setDuration(100L);
        final int i3 = 1;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ji
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i4 = i3;
                mi miVar2 = miVar;
                switch (i4) {
                    case 0:
                        miVar2.g = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 23.25f;
                        miVar2.invalidate();
                        break;
                    case 1:
                        miVar2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        miVar2.invalidate();
                        break;
                    case 2:
                        int[] iArr = miVar2.b;
                        iArr[2] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        iArr[3] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        miVar2.invalidate();
                        break;
                    default:
                        miVar2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        miVar2.invalidate();
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(-69377, -5029377);
        valueAnimatorOfArgb.setDuration(733L);
        valueAnimatorOfArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ji
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i4 = i;
                mi miVar2 = miVar;
                switch (i4) {
                    case 0:
                        miVar2.g = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 23.25f;
                        miVar2.invalidate();
                        break;
                    case 1:
                        miVar2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        miVar2.invalidate();
                        break;
                    case 2:
                        int[] iArr = miVar2.b;
                        iArr[2] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        iArr[3] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        miVar2.invalidate();
                        break;
                    default:
                        miVar2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        miVar2.invalidate();
                        break;
                }
            }
        });
        valueAnimatorOfArgb.addListener(new li(i3, miVar));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setDuration(533L);
        valueAnimatorOfFloat3.setStartDelay(50L);
        final int i4 = 3;
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ji
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i5 = i4;
                mi miVar2 = miVar;
                switch (i5) {
                    case 0:
                        miVar2.g = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 23.25f;
                        miVar2.invalidate();
                        break;
                    case 1:
                        miVar2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        miVar2.invalidate();
                        break;
                    case 2:
                        int[] iArr = miVar2.b;
                        iArr[2] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        iArr[3] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        miVar2.invalidate();
                        break;
                    default:
                        miVar2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        miVar2.invalidate();
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(800L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(valueAnimatorOfFloat2, valueAnimatorOfFloat3);
        animatorSet.playTogether(animatorSet2, valueAnimatorOfArgb, valueAnimatorOfFloat);
        AnimatorSet animatorSet3 = new AnimatorSet();
        View view = (View) l9cVar.D.getValue();
        Property property = View.ROTATION;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, 257.0f);
        objectAnimatorOfFloat.setDuration(2500L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 257.0f, 360.0f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setInterpolator(new PathInterpolator(0.0f, 0.0f, 0.58f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 10.34f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 10.34f);
        objectAnimatorOfFloat3.setDuration(500L);
        objectAnimatorOfFloat4.setDuration(500L);
        objectAnimatorOfFloat3.setStartDelay(800L);
        objectAnimatorOfFloat4.setStartDelay(800L);
        objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        AnimatorSet animatorSet6 = new AnimatorSet();
        animatorSet6.playTogether(animatorSet5, animatorSet4);
        animatorSet3.playTogether(animatorSet6, animatorSet, l9cVar.getBgAnimator());
        return animatorSet3;
    }

    public final a9c getLeftElement() {
        zv8 zv8Var = G[0];
        return (a9c) this.s.b;
    }

    public final f9c getRightElement() {
        zv8 zv8Var = G[1];
        return (f9c) this.t.b;
    }

    public final g9c getStyled() {
        zv8 zv8Var = G[2];
        return (g9c) this.u.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ny8 ny8Var = this.v;
        if (ny8Var.d()) {
            Object drawable = ((cs) ny8Var.getValue()).getDrawable();
            Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
            if (animatable != null && !animatable.isRunning()) {
                animatable.start();
            }
        }
        if (getStyled() == g9c.b) {
            ((AnimatorSet) this.A.getValue()).start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ny8 ny8Var = this.v;
        if (ny8Var.d()) {
            Object drawable = ((cs) ny8Var.getValue()).getDrawable();
            Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
            if (animatable != null && animatable.isRunning()) {
                animatable.stop();
            }
        }
        ny8 ny8Var2 = this.A;
        if (ny8Var2.d() && ((AnimatorSet) ny8Var2.getValue()).isRunning()) {
            ((AnimatorSet) ny8Var2.getValue()).end();
        }
    }

    @Override // defpackage.wf4, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getStyled() == g9c.b) {
            cs csVar = (cs) this.v.getValue();
            int iD = zo5.D(12.0f, yl5.d().getDisplayMetrics().density, gm0.K(28.0f * yl5.d().getDisplayMetrics().density) / 2);
            ny8 ny8Var = this.F;
            mi miVar = (mi) ny8Var.getValue();
            float f = iD;
            float left = csVar.getLeft() + f;
            float top = csVar.getTop() + f;
            miVar.getClass();
            miVar.a = qx6.a(left, top);
            ((mi) ny8Var.getValue()).setBaseRadius(((mi) ny8Var.getValue()).getMeasuredHeight());
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        setBackgroundColor(kbcVar.k().f);
        Integer numValueOf = -1;
        this.y.setTextColor(-1);
        ny8 ny8Var = this.v;
        if (ny8Var.d()) {
            cs csVar = (cs) ny8Var.getValue();
            a9c leftElement = getLeftElement();
            if (!(leftElement instanceof w8c)) {
                if (leftElement instanceof y8c) {
                    numValueOf = Integer.valueOf(kbcVar.getIcon().j);
                } else if (!(leftElement instanceof z8c)) {
                    if (leftElement instanceof v8c) {
                        numValueOf = Integer.valueOf(((v8c) leftElement).b);
                    } else {
                        if (!cqk.d(leftElement, x8c.a)) {
                            ore.o();
                            return;
                        }
                        numValueOf = null;
                    }
                }
            }
            if (numValueOf != null) {
                csVar.setImageTintList(ColorStateList.valueOf(numValueOf.intValue()));
            }
        }
    }

    public final void setCaption(CharSequence charSequence) {
        TextView textView = (TextView) this.z.getValue();
        textView.setId(R.id.oneme_snackbar_caption_id);
        textView.setText(charSequence);
        textView.setVisibility(charSequence == null ? 8 : 0);
        yab.e(this, textView, null);
        y();
    }

    public final void setLeftElement(a9c a9cVar) {
        this.s.B(this, G[0], a9cVar);
    }

    public final void setRightBtnAction$snackbar(View.OnClickListener onClickListener) {
        ny8 ny8Var = this.x;
        if (ny8Var.d()) {
            cyb cybVar = (cyb) ny8Var.getValue();
            if (onClickListener == null) {
                cybVar.setOnClickListener(null);
            } else {
                qe7.H(cybVar, 300L, onClickListener);
            }
        }
    }

    public final void setRightElement(f9c f9cVar) {
        this.t.B(this, G[1], f9cVar);
    }

    public final void setStyled(g9c g9cVar) {
        this.u.B(this, G[2], g9cVar);
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = this.y;
        textView.setText(charSequence);
        yab.e(this, textView, null);
        y();
    }

    public final void y() {
        boolean z = n7j.o(this.v) || n7j.o(this.w);
        ny8 ny8Var = this.x;
        boolean zO = n7j.o(ny8Var);
        ny8 ny8Var2 = this.z;
        boolean zO2 = n7j.o(ny8Var2);
        eg4 eg4VarH = ch3.h(this);
        TextView textView = this.y;
        qf4 qf4Var = new qf4(eg4VarH, textView.getId());
        if (z) {
            qt4.w(12.0f, yl5.d().getDisplayMetrics().density, qf4Var.n(R.id.oneme_snackbar_left_icon_id));
        } else {
            qf4Var.o(0);
        }
        qf4Var.q(0);
        if (zO) {
            qt4.w(12.0f, yl5.d().getDisplayMetrics().density, qf4Var.g(((cyb) ny8Var.getValue()).getId()));
        } else {
            qf4Var.f(0);
        }
        if (zO2) {
            qf4Var.b(((TextView) ny8Var2.getValue()).getId());
        } else {
            qf4Var.a(0);
        }
        if (z) {
            qf4 qf4Var2 = new qf4(eg4VarH, this.C.getId());
            qf4Var2.o(R.id.oneme_snackbar_left_icon_id);
            qf4Var2.q(0);
            qf4Var2.a(0);
            qf4Var2.f(R.id.oneme_snackbar_left_icon_id);
            qf4 qf4Var3 = new qf4(eg4VarH, R.id.oneme_snackbar_left_icon_id);
            qf4Var3.o(0);
            qf4Var3.q(0);
            qf4Var3.a(0);
            qf4 qf4Var4 = new qf4(eg4VarH, this.E.getId());
            qf4Var4.o(R.id.oneme_snackbar_left_icon_id);
            qf4Var4.q(0);
            qf4Var4.a(0);
            qf4Var4.f(R.id.oneme_snackbar_left_icon_id);
        }
        if (zO2) {
            qf4 qf4Var5 = new qf4(eg4VarH, ((TextView) ny8Var2.getValue()).getId());
            if (z) {
                qt4.w(12.0f, yl5.d().getDisplayMetrics().density, qf4Var5.n(R.id.oneme_snackbar_left_icon_id));
            } else {
                qf4Var5.o(0);
            }
            if (zO) {
                qt4.w(12.0f, yl5.d().getDisplayMetrics().density, qf4Var5.g(((cyb) ny8Var.getValue()).getId()));
            } else {
                qf4Var5.f(0);
            }
            qt4.w(2.0f, yl5.d().getDisplayMetrics().density, qf4Var5.p(textView.getId()));
        }
        if (zO) {
            qf4 qf4Var6 = new qf4(eg4VarH, ((cyb) ny8Var.getValue()).getId());
            qf4Var6.q(0);
            qf4Var6.f(0);
            qf4Var6.a(0);
        }
        eg4VarH.a(this);
    }

    public final void setTitle(int i) {
        setTitle(np4.q(getContext(), i));
    }

    public final void setCaption(int i) {
        setCaption(np4.q(getContext(), i));
    }
}
