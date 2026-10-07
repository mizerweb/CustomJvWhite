package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import one.me.messages.list.ui.MessagesListWidget;

/* JADX INFO: loaded from: classes4.dex */
public final class zh4 extends ClickableSpan {
    public final long a;
    public s63 b;

    public zh4(long j) {
        this.a = j;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        due dueVar;
        s63 s63Var = this.b;
        if (s63Var == null || (dueVar = ((pq4) s63Var.b).y) == null) {
            return;
        }
        MessagesListWidget messagesListWidget = (MessagesListWidget) dueVar.a;
        zv8[] zv8VarArr = MessagesListWidget.T1;
        messagesListWidget.F1().m0(this.a);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
