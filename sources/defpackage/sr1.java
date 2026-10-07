package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class sr1 extends s7g {
    public final ee1 u;

    public sr1(Context context, ee1 ee1Var) {
        atf atfVar = new atf(context);
        super(atfVar);
        this.u = ee1Var;
        atfVar.setThemeDepended(usf.b);
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        if (k79Var instanceof r91) {
            this.u.a.a(this);
            ((atf) this.a).setModelItem((psf) k79Var);
        }
    }
}
