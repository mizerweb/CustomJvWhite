package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class rud extends ClickableSpan {
    public final String a;
    public int b;
    public boolean c = true;
    public p59 d;

    public rud(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        p59 p59Var = this.d;
        if (p59Var != null) {
            r59 r59Var = p59Var.a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            s8 s8Var = r59.d;
            if (jCurrentTimeMillis - s8Var.a > 300) {
                s8Var.a = jCurrentTimeMillis;
                o59 o59Var = r59Var.a;
                if (o59Var != null) {
                    o59Var.a(this.a, t59.e, null);
                }
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.b);
        textPaint.setUnderlineText(this.c);
    }
}
