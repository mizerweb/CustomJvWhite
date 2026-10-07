package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class k59 extends ClickableSpan implements gn9 {
    public int a;
    public boolean b;
    public final String c;
    public j59 d;
    public final int e = 6;

    public k59(String str, int i, boolean z) {
        this.a = i;
        this.b = z;
        this.c = r5h.y1(str).toString();
    }

    public final void c(j59 j59Var) {
        this.d = j59Var;
    }

    @Override // defpackage.ft4
    public final ft4 copy() {
        return new k59(this.c, this.a, true);
    }

    @Override // defpackage.gn9
    public final int getType() {
        return this.e;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        j59 j59Var = this.d;
        if (j59Var != null) {
            j59Var.b(view, this.c);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.a);
        textPaint.linkColor = this.a;
        textPaint.setUnderlineText(this.b);
    }
}
