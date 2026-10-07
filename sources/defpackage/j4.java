package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class j4 extends ClickableSpan {
    public final int a;
    public final x4 b;
    public final int c;

    public j4(int i, x4 x4Var, int i2) {
        this.a = i;
        this.b = x4Var;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.a.performAction(this.c, bundle);
    }
}
