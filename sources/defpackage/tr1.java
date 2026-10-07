package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class tr1 extends s7g {
    public final ade u;

    public tr1(Context context, ade adeVar) {
        atf atfVar = new atf(context);
        super(atfVar);
        this.u = adeVar;
        atfVar.setThemeDepended(usf.b);
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        this.u.a.add(this);
        if (k79Var instanceof r91) {
            ((atf) this.a).setModelItem((psf) k79Var);
        }
    }
}
