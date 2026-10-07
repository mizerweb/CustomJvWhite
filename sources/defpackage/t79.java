package defpackage;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class t79 extends DataSetObserver {
    public final /* synthetic */ w79 a;

    public t79(w79 w79Var) {
        this.a = w79Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        w79 w79Var = this.a;
        if (w79Var.z.isShowing()) {
            w79Var.m();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.dismiss();
    }
}
