package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class e8 extends wod {
    public e8(Context context) {
        super(new atf(context));
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        ((atf) this.a).setModelItem(((f8) k79Var).b);
    }

    @Override // defpackage.s7g
    public final void G() {
        atf atfVar = (atf) this.a;
        atfVar.setOnClickListener(null);
        atfVar.setOnSwitchListener(null);
        atfVar.setSwitchInterceptor(null);
        atfVar.getClass();
        psf.N0.getClass();
        atfVar.setModelItem(bsf.b);
        atfVar.p(false);
        atfVar.t = null;
    }
}
