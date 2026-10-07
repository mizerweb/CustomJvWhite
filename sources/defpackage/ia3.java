package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import one.me.profile.ProfileScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class ia3 extends LinearLayout implements o59, zs3 {
    public ha3 a;
    public final r59 b;
    public final TextView c;

    public ia3(Context context) {
        super(context, null);
        at3 at3Var = new at3(context, this);
        r59 r59Var = new r59(this, new yk1(29, this), 4);
        this.b = r59Var;
        TextView textView = new TextView(context);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        q9i.a(q9i.e, textView);
        textView.setMovementMethod(at3Var);
        textView.setTransformationMethod(r59Var);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        n1g.N(new f7(3, null, 7), textView);
        textView.setGravity(16);
        this.c = textView;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setOrientation(1);
        setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        addView(textView);
    }

    @Override // defpackage.o59
    public final void a(String str, t59 t59Var, ClickableSpan clickableSpan) {
        ha3 ha3Var = this.a;
        if (ha3Var != null) {
            ProfileScreen profileScreen = ((dud) ((b1k) ((vn7) ha3Var).b).b).f;
            profileScreen.v1().M(1, str, t59Var);
            profileScreen.v1().H(str, t59Var);
        }
    }

    public final ha3 getListener() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        CharSequence text = this.c.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable == null) {
            return;
        }
        this.b.c(spannable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CharSequence text = this.c.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable == null) {
            return;
        }
        this.b.getClass();
        r59.a(spannable);
    }

    public final void setDescription(CharSequence charSequence) {
        TextView textView = this.c;
        CharSequence text = textView.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        r59 r59Var = this.b;
        if (spannable != null) {
            r59Var.getClass();
            r59.a(spannable);
        }
        textView.setText(charSequence);
        textView.setTransformationMethod(r59Var);
        CharSequence text2 = textView.getText();
        Spannable spannable2 = text2 instanceof Spannable ? (Spannable) text2 : null;
        if (spannable2 == null) {
            return;
        }
        r59Var.c(spannable2);
    }

    public final void setListener(ha3 ha3Var) {
        this.a = ha3Var;
    }

    @Override // defpackage.zs3
    public final boolean u(ClickableSpan clickableSpan, int i, int i2, String str, t59 t59Var, MotionEvent motionEvent) {
        ha3 ha3Var = this.a;
        if (ha3Var == null) {
            return false;
        }
        ((b1k) ((vn7) ha3Var).b).E(str, t59Var, motionEvent);
        return true;
    }
}
