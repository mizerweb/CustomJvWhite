package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class e01 extends ClickableSpan {
    public final String a;
    public final int b;
    public m59 c;

    public e01(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        m59 m59Var = this.c;
        if (m59Var != null) {
            r59 r59Var = m59Var.a;
            Object obj = m59Var.b;
            r59Var.b(view, this.a, t59.c, (ClickableSpan) obj);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.b);
        textPaint.setUnderlineText(true);
    }
}
