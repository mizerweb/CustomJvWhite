package defpackage;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class jog extends s7g implements xaf {
    public vaf u;

    public jog(Context context) {
        super(new atf(context));
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        if (k79Var instanceof uaf) {
            this.u = (vaf) k79Var;
            ((atf) this.a).setModelItem(((uaf) k79Var).a);
        }
    }

    @Override // defpackage.xaf
    public final void i(mog mogVar) {
        View view = this.a;
        if (mogVar != null) {
            qe7.H(view, 300L, new jvf(this, 9, mogVar));
        } else {
            ((atf) view).setOnClickListener(null);
        }
    }
}
