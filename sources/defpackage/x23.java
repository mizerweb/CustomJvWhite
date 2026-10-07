package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x23 extends s7g {
    public void H(x7a x7aVar, cf7 cf7Var, qf7 qf7Var) {
        ee eeVar = new ee(cf7Var, 15, x7aVar);
        View view = this.a;
        qe7.H(view, 300L, eeVar);
        view.setOnLongClickListener(new o03(qf7Var, x7aVar, this, 1));
    }
}
