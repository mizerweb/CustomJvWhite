package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.UpdateAppearance;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class s9h extends ClickableSpan implements UpdateAppearance, eph {
    public static final /* synthetic */ int d = 0;
    public final u9h a;
    public final qf7 b;
    public int c;

    public s9h(af7 af7Var, u9h u9hVar, qf7 qf7Var) {
        this.a = u9hVar;
        this.b = qf7Var;
        this.c = ((kbc) af7Var.invoke()).h().a;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.invoke(view, this.a);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.c = kbcVar.h().a;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.c);
        textPaint.setUnderlineText(false);
    }
}
