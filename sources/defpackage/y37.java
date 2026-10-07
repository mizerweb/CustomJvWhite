package defpackage;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class y37 extends s7g {
    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        zmi zmiVar = (zmi) k79Var;
        ymi ymiVar = zmiVar.b;
        ymi ymiVar2 = ymi.a;
        View view = this.a;
        if (ymiVar == ymiVar2) {
            ((TextView) view).setEnabled(false);
        }
        ((TextView) view).setText(zmiVar.c.a(this));
    }
}
