package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class h27 extends s7g {
    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        if (k79Var instanceof o27) {
            ((atf) this.a).setModelItem((psf) k79Var);
        }
    }

    @Override // defpackage.s7g
    public final void G() {
        View view = this.a;
        ((atf) view).setOnClickListener(null);
        ((atf) view).setOnSwitchListener(null);
    }
}
