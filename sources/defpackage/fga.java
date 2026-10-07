package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class fga extends ClickableSpan {
    public final cga a;
    public int b;
    public q59 c;

    public fga(cga cgaVar, int i) {
        this.a = cgaVar;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        q59 q59Var = this.c;
        if (q59Var != null) {
            r59 r59Var = q59Var.a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            s8 s8Var = r59.d;
            if (jCurrentTimeMillis - s8Var.a > 300) {
                s8Var.a = jCurrentTimeMillis;
                o59 o59Var = r59Var.a;
                if (o59Var == null) {
                    o59Var = view instanceof o59 ? (o59) view : null;
                }
                if (o59Var != null) {
                    o59Var.b(this.a);
                }
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.b);
        textPaint.setUnderlineText(true);
    }
}
