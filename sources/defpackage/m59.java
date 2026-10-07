package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m59 implements j59 {
    public final /* synthetic */ r59 a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m59(r59 r59Var, Object obj) {
        this.a = r59Var;
        this.b = obj;
    }

    @Override // defpackage.j59
    public void b(View view, String str) {
        this.a.b(view, str, t59.f, (ClickableSpan) this.b);
    }
}
