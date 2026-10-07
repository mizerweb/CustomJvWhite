package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class gig extends LinearLayout implements eph {
    public static final /* synthetic */ zv8[] g;
    public final qjg a;
    public final ny8 b;
    public final ifh c;
    public final t5d d;
    public ValueAnimator e;
    public int f;

    static {
        z8b z8bVar = new z8b(gig.class, "expandableState", "getExpandableState()Lone/me/sdk/uikit/common/chat/StartMiniAppActionView$ExpandableState;");
        zfe.a.getClass();
        g = new zv8[]{z8bVar};
    }

    public gig(Context context) {
        super(context, null);
        qjg qjgVar = new qjg(null, null);
        int[] iArr = {R.attr.state_enabled};
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 20.0f);
        qjgVar.a(iArr, gradientDrawable);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(yl5.d().getDisplayMetrics().density * 20.0f);
        qjgVar.a(new int[]{-16842910}, gradientDrawable2);
        this.a = qjgVar;
        this.b = rx8.P(3, new ize(25, this));
        cs csVar = new cs(context);
        csVar.setId(ru.oneme.app.R.id.oneme_message_input_left_outer_icon);
        csVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        csVar.setImageDrawable(getLeftOuterDrawable());
        this.c = new ifh(new twf(context, 12));
        this.d = new t5d(this);
        setId(ru.oneme.app.R.id.oneme_message_input_start_mini_app_action_view);
        setMinimumWidth(gm0.K(44.0f * yl5.d().getDisplayMetrics().density));
        setOrientation(0);
        addView(csVar);
        onThemeChanged(pq3.j.h(this));
        setBackground(qjgVar);
        setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(10.0f * yl5.d().getDisplayMetrics().density), gm0.K(6.0f * yl5.d().getDisplayMetrics().density));
    }

    public static final void a(gig gigVar) {
        ifh ifhVar = gigVar.c;
        if (ifhVar.d()) {
            TextView textView = (TextView) ifhVar.getValue();
            if (textView.isAttachedToWindow() && textView.getText().length() > 0 && textView.getMeasuredWidth() == 0) {
                textView.measure(0, 0);
            }
            gigVar.f = textView.getMeasuredWidth();
            ValueAnimator valueAnimator = gigVar.e;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorB = b(gigVar, textView, true);
            gigVar.e = valueAnimatorB;
            valueAnimatorB.start();
        }
    }

    public static final ValueAnimator b(gig gigVar, TextView textView, boolean z) {
        ValueAnimator duration = ValueAnimator.ofInt(z ? gigVar.f : 0, z ? 0 : gigVar.f).setDuration(150L);
        duration.addUpdateListener(new xcf(3, textView));
        duration.addListener(new fig(z, textView, 1));
        duration.addListener(new fig(z, textView, 0));
        return duration;
    }

    private final Drawable getLeftOuterDrawable() {
        return (Drawable) this.b.getValue();
    }

    public final eig getExpandableState() {
        zv8 zv8Var = g[0];
        return (eig) this.d.b;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, qv1.a(36.0f, yl5.d().getDisplayMetrics().density, 1073741824));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        sb8.m0(-1, getLeftOuterDrawable());
        int[] iArr = {R.attr.state_enabled};
        qjg qjgVar = this.a;
        ((GradientDrawable) jrl.b(qjgVar, iArr)).setColor(kbcVar.h().a);
        ((GradientDrawable) jrl.b(qjgVar, new int[]{-16842910})).setColor(((fn8) kbcVar.u().c.a).d);
    }

    public final void setExpandableState(eig eigVar) {
        this.d.B(this, g[0], eigVar);
    }

    public final void setText(CharSequence charSequence) {
        ifh ifhVar = this.c;
        if (charSequence != null && charSequence.length() != 0) {
            n7j.a(this, (View) ifhVar.getValue(), -1);
            ((TextView) ifhVar.getValue()).setText(charSequence);
            ((View) ifhVar.getValue()).setVisibility(0);
        } else if (ifhVar.d()) {
            a(this);
        }
    }
}
