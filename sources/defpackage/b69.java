package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class b69 extends TextView implements o59, zs3 {
    public final rea a;
    public final r59 b;

    public b69(Context context, rea reaVar) {
        super(context);
        this.a = reaVar;
        MovementMethod at3Var = new at3(context, this);
        int i = 3;
        r59 r59Var = new r59(this, new ww8(i, this), 4);
        this.b = r59Var;
        setId(R.id.profile_link_view);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
        setLayoutParams(layoutParams);
        setGravity(1);
        q9i.a(q9i.i, this);
        setMovementMethod(at3Var);
        setTransformationMethod(r59Var);
        n1g.N(new ud9(i, (lq4) null, 24), this);
        setEllipsize(TextUtils.TruncateAt.END);
        setMaxLines(1);
    }

    @Override // defpackage.o59
    public final void a(String str, t59 t59Var, ClickableSpan clickableSpan) {
        this.a.invoke(str, t59Var);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        CharSequence text = getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable == null) {
            return;
        }
        this.b.c(spannable);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CharSequence text = getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable == null) {
            return;
        }
        this.b.getClass();
        r59.a(spannable);
    }

    @Override // defpackage.zs3
    public final boolean u(ClickableSpan clickableSpan, int i, int i2, String str, t59 t59Var, MotionEvent motionEvent) {
        this.a.invoke(str, t59Var);
        return true;
    }
}
