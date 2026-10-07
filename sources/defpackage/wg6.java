package defpackage;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class wg6 extends ClickableSpan {
    public final /* synthetic */ xg6 a;

    public wg6(xg6 xg6Var) {
        this.a = xg6Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Layout layout;
        Layout layout2;
        xg6 xg6Var = this.a;
        if (!xg6Var.m) {
            xg6Var.n = true;
            xg6Var.i = xg6Var.k;
            xg6Var.requestLayout();
        } else {
            if (xg6Var.n || (layout = xg6Var.k) == null || (layout2 = xg6Var.j) == null) {
                return;
            }
            xg6Var.n = true;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(layout2.getHeight(), layout.getHeight());
            valueAnimatorOfInt.setInterpolator(new ll6());
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addUpdateListener(new ak(13, xg6Var));
            valueAnimatorOfInt.addListener(new d7(xg6Var, 2, layout));
            valueAnimatorOfInt.addListener(new li(7, xg6Var));
            valueAnimatorOfInt.start();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(pq3.j.h(this.a).getText().h);
    }
}
