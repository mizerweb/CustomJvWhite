package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class a42 extends wf4 {
    public static final /* synthetic */ int K = 0;
    public final TextView A;
    public final TextView B;
    public final ViewStub C;
    public final v9c D;
    public final ny8 E;
    public final wue F;
    public final wue G;
    public final ViewStub H;
    public final ny8 I;
    public Boolean J;
    public z32 s;
    public final ny8 t;
    public mvh u;
    public AnimatorSet v;
    public jvh w;
    public boolean x;
    public boolean y;
    public md1 z;

    public a42(final Context context) {
        super(context, null);
        this.t = rx8.P(3, new ca0(context, 14));
        wue wueVar = new wue(context);
        wueVar.setId(R.id.call_collapsing);
        wue.z(wueVar, R.drawable.icon_chevron_down);
        wueVar.setAccessibility(Integer.valueOf(R.string.call_collapsing_accessibility));
        rue rueVar = rue.a;
        wueVar.setMode(rueVar);
        final int i = 0;
        wueVar.setListener(new v32(this, 0));
        wueVar.setImageSize(new sue(bc1.f(40.0f), bc1.f(40.0f)));
        wueVar.setLayoutParams(new uf4(-2, -2));
        wueVar.setButtonPadding(gm0.K(yl5.c() * 3.0f));
        TextView textView = new TextView(context);
        textView.setId(R.id.call_name);
        textView.setGravity(8388611);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        final int i2 = 1;
        textView.setMaxLines(1);
        q9i.a(q9i.f, textView);
        a8g a8gVar = pq3.j;
        textView.setTextColor(a8gVar.l(textView).b.getText().b);
        np4.C(textView, false);
        textView.setVisibility(8);
        this.A = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(R.id.call_status);
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(1);
        textView2.setGravity(8388611);
        q9i.a(q9i.i, textView2);
        textView2.setTextColor(a8gVar.l(textView2).b.getText().c);
        np4.C(textView2, false);
        textView2.setVisibility(8);
        this.B = textView2;
        v9c v9cVar = new v9c(context);
        v9cVar.setChecked(false);
        v9cVar.setShowText(false);
        qe7.H(v9cVar, 300L, new ee(this, 10, v9cVar));
        this.D = v9cVar;
        this.E = rx8.P(3, new af7() { // from class: w32
            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i;
                a42 a42Var = this;
                Context context2 = context;
                switch (i3) {
                    case 0:
                        TextView textView3 = new TextView(context2);
                        q9i.a(q9i.f, textView3);
                        a8g a8gVar2 = pq3.j;
                        textView3.setTextColor(a8gVar2.l(textView3).b.getText().b);
                        textView3.setText(R.string.call_context_dialog_share_sound);
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setId(R.id.call_share_sound);
                        linearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                        linearLayout.setOrientation(0);
                        linearLayout.setVisibility(0);
                        linearLayout.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0, gm0.K(4.0f * yl5.d().getDisplayMetrics().density), 0);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setColor(a8gVar2.e(context2).j().b.h().b);
                        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 32.0f);
                        linearLayout.setBackground(gradientDrawable);
                        qe7.H(linearLayout, 300L, new x32(a42Var));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.setMarginEnd(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
                        linearLayout.addView(textView3, layoutParams);
                        linearLayout.addView(a42Var.D, -2, gm0.K(40.0f * yl5.d().getDisplayMetrics().density));
                        return linearLayout;
                    default:
                        return a42.v(context2, a42Var);
                }
            }
        });
        wue wueVar2 = new wue(context);
        wueVar2.setId(R.id.call_more);
        wueVar2.setMode(rueVar);
        wue.z(wueVar2, R.drawable.icon_dots_vertical);
        wueVar2.setAccessibility(Integer.valueOf(R.string.call_more_accessibility));
        wueVar2.setListener(new v32(this, wueVar2));
        wueVar2.setButtonPadding(gm0.K(yl5.c() * 3.0f));
        wueVar2.setImageSize(new sue(bc1.f(40.0f), bc1.f(40.0f)));
        wueVar2.setLayoutParams(new uf4(-2, -2));
        wueVar2.setVisibility(8);
        this.F = wueVar2;
        wue wueVar3 = new wue(context);
        wueVar3.setId(R.id.call_settings);
        wue.z(wueVar3, R.drawable.icon_users_fill);
        wueVar3.setAccessibility(Integer.valueOf(R.string.call_settings_accessibility));
        wueVar3.setMode(rueVar);
        wueVar3.setButtonPadding(gm0.K(yl5.c() * 3.0f));
        wueVar3.setImageSize(new sue(bc1.f(40.0f), bc1.f(40.0f)));
        wueVar3.setLayoutParams(new uf4(-2, -2));
        wueVar3.setListener(new v32(this, 2));
        wueVar3.setVisibility(8);
        this.G = wueVar3;
        this.I = rx8.P(3, new af7() { // from class: w32
            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                a42 a42Var = this;
                Context context2 = context;
                switch (i3) {
                    case 0:
                        TextView textView3 = new TextView(context2);
                        q9i.a(q9i.f, textView3);
                        a8g a8gVar2 = pq3.j;
                        textView3.setTextColor(a8gVar2.l(textView3).b.getText().b);
                        textView3.setText(R.string.call_context_dialog_share_sound);
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setId(R.id.call_share_sound);
                        linearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                        linearLayout.setOrientation(0);
                        linearLayout.setVisibility(0);
                        linearLayout.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0, gm0.K(4.0f * yl5.d().getDisplayMetrics().density), 0);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setColor(a8gVar2.e(context2).j().b.h().b);
                        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 32.0f);
                        linearLayout.setBackground(gradientDrawable);
                        qe7.H(linearLayout, 300L, new x32(a42Var));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.setMarginEnd(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
                        linearLayout.addView(textView3, layoutParams);
                        linearLayout.addView(a42Var.D, -2, gm0.K(40.0f * yl5.d().getDisplayMetrics().density));
                        return linearLayout;
                    default:
                        return a42.v(context2, a42Var);
                }
            }
        });
        setLayoutParams(new uf4(-1, -2));
        int iK = gm0.K(yl5.c() * 40.0f);
        ViewStub viewStubI = bc1.i(context, R.id.call_menu_record);
        this.H = viewStubI;
        ViewStub viewStubI2 = bc1.i(context, R.id.call_share_sound);
        this.C = viewStubI2;
        addView(wueVar);
        addView(textView, -2, -2);
        addView(textView2, 0, -2);
        addView(viewStubI2, -2, -2);
        addView(wueVar2);
        addView(viewStubI, iK, iK);
        addView(wueVar3);
        eg4 eg4VarH = ch3.h(this);
        int id = wueVar.getId();
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 4, 0, 4);
        qf4 qf4Var = new qf4(eg4VarH, textView.getId());
        qf4Var.n(wueVar.getId()).a(gm0.K(yl5.c() * 8.0f));
        qf4Var.q(wueVar.getId());
        qf4Var.b(textView2.getId());
        qf4Var.g(viewStubI2.getId()).a(gm0.K(yl5.c() * 8.0f));
        qf4Var.d();
        qf4Var.r();
        ((eg4) qf4Var.c).g(qf4Var.b).d.w = 0.0f;
        int id2 = textView2.getId();
        eg4VarH.d(id2, 6, wueVar.getId(), 7);
        new bsb(6, eg4VarH, id2).a(gm0.K(yl5.c() * 8.0f));
        eg4VarH.d(id2, 3, textView.getId(), 4);
        eg4VarH.d(id2, 7, wueVar3.getId(), 6);
        new bsb(7, eg4VarH, id2).a(gm0.K(yl5.c() * 8.0f));
        eg4VarH.d(id2, 4, wueVar.getId(), 4);
        eg4VarH.g(id2).d.l0 = true;
        int id3 = viewStubI2.getId();
        eg4VarH.d(id3, 7, wueVar3.getId(), 6);
        qt4.w(5.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH, id3));
        eg4VarH.d(id3, 3, 0, 3);
        eg4VarH.d(id3, 4, 0, 4);
        int id4 = wueVar3.getId();
        eg4VarH.d(id4, 7, wueVar2.getId(), 6);
        eg4VarH.d(id4, 3, 0, 3);
        eg4VarH.d(id4, 4, 0, 4);
        int id5 = wueVar2.getId();
        eg4VarH.d(id5, 7, viewStubI.getId(), 6);
        eg4VarH.d(id5, 3, 0, 3);
        eg4VarH.d(id5, 4, 0, 4);
        int id6 = viewStubI.getId();
        eg4VarH.d(id6, 7, 0, 7);
        eg4VarH.d(id6, 3, 0, 3);
        eg4VarH.d(id6, 4, 0, 4);
        eg4VarH.a(this);
    }

    public final View getCallShareSound() {
        return (View) this.E.getValue();
    }

    private final View getRecordButton() {
        return (View) this.I.getValue();
    }

    private final nde getRecordDrawable() {
        return (nde) this.t.getValue();
    }

    public static void u(a42 a42Var, boolean z) {
        a42Var.v = null;
        a42Var.getRecordButton().setVisibility(z ? 0 : 8);
        wue wueVar = a42Var.F;
        if (z) {
            ViewGroup.LayoutParams layoutParams = wueVar.getLayoutParams();
            if (layoutParams == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.rightMargin = bc1.f(4.0f);
            wueVar.setLayoutParams(marginLayoutParams);
            a42Var.getRecordDrawable().start();
            a42Var.y(a42Var.w);
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = wueVar.getLayoutParams();
        if (layoutParams2 == null) {
            ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.rightMargin = 0;
        wueVar.setLayoutParams(marginLayoutParams2);
        a42Var.getRecordDrawable().stop();
        mvh mvhVar = a42Var.u;
        if (mvhVar != null) {
            mvhVar.a();
        }
    }

    public static View v(Context context, a42 a42Var) {
        View view = new View(context);
        view.setId(R.id.call_menu_record);
        view.setVisibility(8);
        view.setLayoutParams(new ViewGroup.MarginLayoutParams(bc1.f(40.0f), bc1.f(40.0f)));
        qe7.H(view, 300L, new x32(a42Var, view));
        view.setBackground(a42Var.getRecordDrawable());
        return view;
    }

    public final v9c getSwitch() {
        return this.D;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (n7j.n(this.H) && getRecordButton().getVisibility() == 0) {
            getRecordDrawable().start();
        }
        Context context = getContext();
        ufe ufeVar = new ufe();
        ufeVar.a = context.getResources().getConfiguration().orientation;
        md1 md1Var = new md1(ufeVar, this, 10);
        context.registerComponentCallbacks(md1Var);
        if (ufeVar.a == 1) {
            getCallShareSound().setVisibility(8);
        } else if (this.x) {
            n7j.m(this.C, getCallShareSound(), null);
            getCallShareSound().setVisibility(0);
        }
        this.z = md1Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (n7j.n(this.H)) {
            getRecordDrawable().stop();
        }
        md1 md1Var = this.z;
        if (md1Var != null) {
            getContext().unregisterComponentCallbacks(md1Var);
        }
    }

    public final void setAddUserCount(int i) {
        this.G.setCounter(i);
    }

    public final void setAudioSharingEnabled(boolean z) {
        this.D.setChecked(z);
        this.y = z;
    }

    public final void setAudioSharingVisible(boolean z) {
        this.x = z;
        if (getContext().getResources().getConfiguration().orientation == 2) {
            n7j.m(this.C, getCallShareSound(), null);
            getCallShareSound().setVisibility(this.x ? 0 : 8);
        }
    }

    public final void setButtonsVisibility(y32 y32Var) {
        int measuredWidth;
        boolean z = y32Var.a && y32Var.b;
        wue wueVar = this.G;
        int visibility = wueVar.getVisibility();
        wue wueVar2 = this.F;
        boolean z2 = visibility == 0 && wueVar2.getVisibility() == 0;
        boolean z3 = wueVar.getVisibility() == 0 || wueVar2.getVisibility() == 0;
        if (!z || z2 || !z3) {
            isk.d(this.F, y32Var.a, 0L, null, 6);
            isk.d(this.G, y32Var.b, 0L, null, 6);
            return;
        }
        if (wueVar.getVisibility() == 0 && wueVar2.getVisibility() == 0) {
            return;
        }
        int width = wueVar2.getWidth();
        Integer numValueOf = Integer.valueOf(width);
        if (width == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            measuredWidth = numValueOf.intValue();
        } else {
            int width2 = wueVar.getWidth();
            Integer numValueOf2 = width2 != 0 ? Integer.valueOf(width2) : null;
            if (numValueOf2 != null) {
                measuredWidth = numValueOf2.intValue();
            } else {
                wueVar.measure(0, 0);
                measuredWidth = wueVar.getMeasuredWidth();
            }
        }
        float f = measuredWidth;
        ObjectAnimator objectAnimatorF = isk.f(wueVar, f, 0.0f, new AccelerateDecelerateInterpolator());
        ObjectAnimator objectAnimatorF2 = isk.f(wueVar2, f + bc1.f(3.0f), 0.0f, new AccelerateDecelerateInterpolator());
        wueVar.setAlpha(1.0f);
        wueVar2.setAlpha(1.0f);
        wueVar.setVisibility(0);
        wueVar2.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(a.Y0(new Animator[]{objectAnimatorF, objectAnimatorF2}));
        animatorSet.start();
    }

    public final void setChatUnreadMessageCount(int i) {
        this.F.setCounter(i);
    }

    public final void setClickListener(z32 z32Var) {
        this.s = z32Var;
    }

    public final void setStatus(CharSequence charSequence) {
        TextView textView = this.B;
        if (cqk.d(textView.getText(), charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = this.A;
        if (cqk.d(textView.getText(), charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    public final void setVerified(boolean z) {
        osi osiVar;
        TextView textView = this.A;
        int iI0 = oc9.i0(soh.e(textView));
        if (z) {
            osi osiVarA = soh.a(textView);
            if ((osiVarA != null ? osiVarA.a : 0) == iI0) {
                return;
            }
        }
        if (z) {
            osi osiVarA2 = soh.a(textView);
            if ((osiVarA2 != null ? osiVarA2.a : 0) != iI0) {
                osiVar = new osi(getContext(), iI0, dul.e);
            } else {
                osiVar = null;
            }
        } else {
            osiVar = null;
        }
        soh.d(textView, osiVar);
    }

    public final void x(boolean z, jvh jvhVar) {
        ViewStub viewStub = this.H;
        if (z || n7j.n(viewStub)) {
            y(jvhVar);
            if (cqk.d(this.J, Boolean.valueOf(z))) {
                return;
            }
            this.J = Boolean.valueOf(z);
            View recordButton = getRecordButton();
            if (!n7j.n(viewStub)) {
                ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
                int iIndexOfChild = viewGroup.indexOfChild(viewStub);
                viewGroup.removeViewInLayout(viewStub);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                layoutParams.height = recordButton.getLayoutParams().height;
                layoutParams.width = recordButton.getLayoutParams().width;
                recordButton.setId(viewStub.getId());
                viewGroup.addView(recordButton, iIndexOfChild, layoutParams);
                View recordButton2 = getRecordButton();
                ViewGroup.LayoutParams layoutParams2 = recordButton2.getLayoutParams();
                if (layoutParams2 == null) {
                    ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.topMargin = bc1.f(4.0f);
                    recordButton2.setLayoutParams(marginLayoutParams);
                }
            }
            this.w = jvhVar;
            AnimatorSet animatorSet = this.v;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            View recordButton3 = getRecordButton();
            cz1 cz1Var = new cz1(this, z, 1);
            AnimatorSet animatorSet2 = new AnimatorSet();
            String str = z ? "fade_in" : "fade_out";
            Property property = View.ALPHA;
            wue wueVar = this.F;
            if (z) {
                ViewGroup.LayoutParams layoutParams3 = wueVar.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) (layoutParams3 instanceof ViewGroup.MarginLayoutParams ? layoutParams3 : null);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0, recordButton3.getWidth());
                valueAnimatorOfInt.addUpdateListener(new z6(wueVar, 1));
                animatorSet2.playSequentially(valueAnimatorOfInt, ObjectAnimator.ofFloat(recordButton3, (Property<View, Float>) property, 0.0f, 1.0f));
            } else {
                ViewGroup.LayoutParams layoutParams4 = wueVar.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) (layoutParams4 instanceof ViewGroup.MarginLayoutParams ? layoutParams4 : null);
                ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0, -recordButton3.getWidth());
                valueAnimatorOfInt2.addUpdateListener(new z6(wueVar, 2));
                animatorSet2.playTogether(valueAnimatorOfInt2, ObjectAnimator.ofFloat(recordButton3, (Property<View, Float>) property, 1.0f, 0.0f));
            }
            animatorSet2.setDuration(150L);
            animatorSet2.setInterpolator(new LinearInterpolator());
            animatorSet2.addListener(new pk(recordButton3, str, cz1Var, 0));
            animatorSet2.start();
            this.v = animatorSet2;
        }
    }

    public final void y(jvh jvhVar) {
        AnimatorSet animatorSet = this.v;
        boolean z = animatorSet != null && animatorSet.isRunning();
        this.w = jvhVar;
        if (!n7j.n(this.H) || jvhVar == null) {
            mvh mvhVar = this.u;
            if (mvhVar != null) {
                mvhVar.a();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        if (z || getRecordButton().getVisibility() != 0) {
            mvh mvhVar2 = this.u;
            if (mvhVar2 != null) {
                mvhVar2.a();
                return;
            }
            return;
        }
        this.w = null;
        mvh mvhVar3 = this.u;
        if (mvhVar3 == null || !mvhVar3.isShowing()) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            Point point = new Point(getLeft(), getHeight() + iArr[1]);
            mvh mvhVar4 = this.u;
            if (mvhVar4 != null) {
                mvhVar4.dismiss();
            }
            mvh mvhVar5 = new mvh(getContext(), getRecordButton(), new u32(this, 0), new br1(27), 1, 3, false, np0.m);
            mvhVar5.c(jvhVar.a);
            tnh tnhVar = jvhVar.b;
            TextView textView = mvhVar5.i;
            textView.setText(tnhVar.b(textView.getContext()));
            CharSequence text = textView.getText();
            textView.setVisibility((text == null || text.length() == 0) ? 8 : 0);
            u32 u32Var = new u32(this, 1);
            ImageView imageView = mvhVar5.j;
            imageView.setVisibility(0);
            qe7.H(imageView, 300L, new jvf(u32Var, 17, mvhVar5));
            TextView textView2 = mvhVar5.h;
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            if (layoutParams == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
            textView2.setLayoutParams(marginLayoutParams);
            mvhVar5.d(point, 8388661);
            mvhVar5.setOnDismissListener(new nc1(1, this));
            this.u = mvhVar5;
        }
    }
}
