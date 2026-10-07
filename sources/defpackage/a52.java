package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a52 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g52 b;

    public /* synthetic */ a52(g52 g52Var, int i) {
        this.a = i;
        this.b = g52Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        g52 g52Var = this.b;
        switch (i) {
            case 0:
                e52 e52Var = g52Var.F1;
                if (e52Var != null) {
                    e52Var.h(g52Var.I1);
                }
                break;
            default:
                e52 e52Var2 = g52Var.F1;
                if (e52Var2 != null) {
                    e52Var2.i();
                }
                break;
        }
    }
}
