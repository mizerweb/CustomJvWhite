package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class au7 extends ClickableSpan {
    public final String a;
    public m59 b;
    public int c;

    public au7(String str, int i) {
        this.a = str;
        this.c = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        m59 m59Var = this.b;
        if (m59Var != null) {
            r59 r59Var = m59Var.a;
            Object obj = m59Var.b;
            r59Var.b(view, this.a, t59.b, (ClickableSpan) obj);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.c);
        textPaint.setUnderlineText(true);
    }
}
