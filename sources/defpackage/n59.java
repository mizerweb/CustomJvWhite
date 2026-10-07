package defpackage;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class n59 extends URLSpan {
    public o59 a;
    public int b;
    public final boolean c;
    public final s8 d;

    public n59(String str, int i, boolean z) {
        super(str);
        this.a = null;
        this.b = i;
        this.c = z;
        this.d = new s8();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        s8 s8Var = this.d;
        if (jCurrentTimeMillis - s8Var.a > 300) {
            s8Var.a = jCurrentTimeMillis;
            if (!(view instanceof TextView) || ((TextView) view).getLinksClickable()) {
                o59 o59Var = this.a;
                if (o59Var == null) {
                    o59Var = view instanceof o59 ? (o59) view : null;
                }
                if (o59Var != null) {
                    o59Var.a(getURL(), t59.a, this);
                }
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = textPaint.bgColor;
        int i2 = this.b;
        if (i != i2) {
            textPaint.setColor(i2);
        }
        textPaint.setUnderlineText(this.c);
    }
}
