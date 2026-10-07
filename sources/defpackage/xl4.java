package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import one.me.profile.ProfileScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class xl4 extends LinearLayout implements o59, zs3 {
    public wl4 a;
    public final r59 b;
    public final TextView c;
    public final xg6 d;

    public xl4(Context context) {
        super(context, null);
        this.b = new r59(this, new pe3(14, this), 4);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        q9i.a(q9i.i, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        n1g.N(new f7(3, null, 15), textView);
        textView.setGravity(8388627);
        textView.setSingleLine(true);
        this.c = textView;
        xg6 xg6Var = new xg6(context);
        xg6Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setGravity(16);
        xg6Var.setTypography(q9i.e);
        xg6Var.setCollapsedLines(5);
        xg6Var.setExpandWithAnimation(true);
        xg6Var.setLinkMovementMethod(new at3(context, this));
        this.d = xg6Var;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setOrientation(1);
        setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        addView(textView);
        addView(xg6Var);
        ViewGroup.LayoutParams layoutParams = xg6Var.getLayoutParams();
        if (layoutParams == null) {
            ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            throw null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
        xg6Var.setLayoutParams(marginLayoutParams);
    }

    @Override // defpackage.o59
    public final void a(String str, t59 t59Var, ClickableSpan clickableSpan) {
        wl4 wl4Var = this.a;
        if (wl4Var != null) {
            ProfileScreen profileScreen = ((dud) ((b1k) ((b1k) wl4Var).b).b).f;
            profileScreen.v1().M(1, str, t59Var);
            profileScreen.v1().H(str, t59Var);
        }
    }

    public final wl4 getListener() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SpannableString text = this.d.getText();
        if (text == null) {
            text = null;
        }
        if (text == null) {
            return;
        }
        this.b.c(text);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SpannableString text = this.d.getText();
        if (text == null) {
            text = null;
        }
        if (text == null) {
            return;
        }
        this.b.getClass();
        r59.a(text);
    }

    public final void setDescription(CharSequence charSequence) {
        xg6 xg6Var = this.d;
        SpannableString text = xg6Var.getText();
        if (text == null) {
            text = null;
        }
        r59 r59Var = this.b;
        if (text != null) {
            r59Var.getClass();
            r59.a(text);
        }
        xg6Var.setText(r59Var.getTransformation(charSequence, xg6Var));
        SpannableString text2 = xg6Var.getText();
        SpannableString spannableString = text2 != null ? text2 : null;
        if (spannableString == null) {
            return;
        }
        r59Var.c(spannableString);
    }

    public final void setListener(wl4 wl4Var) {
        this.a = wl4Var;
    }

    public final void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    @Override // defpackage.zs3
    public final boolean u(ClickableSpan clickableSpan, int i, int i2, String str, t59 t59Var, MotionEvent motionEvent) {
        wl4 wl4Var = this.a;
        if (wl4Var == null) {
            return false;
        }
        ((b1k) ((b1k) wl4Var).b).E(str, t59Var, motionEvent);
        return true;
    }
}
