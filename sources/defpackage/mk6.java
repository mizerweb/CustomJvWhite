package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mk6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ nk6 b;
    public final /* synthetic */ lk6 c;

    public /* synthetic */ mk6(nk6 nk6Var, lk6 lk6Var, int i) {
        this.a = i;
        this.b = nk6Var;
        this.c = lk6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        lk6 lk6Var = this.c;
        nk6 nk6Var = this.b;
        switch (i) {
            case 0:
                n61 n61Var = nk6Var.u;
                if (n61Var != null) {
                    n61Var.invoke(Long.valueOf(lk6Var.a));
                }
                break;
            case 1:
                n61 n61Var2 = nk6Var.v;
                if (n61Var2 != null) {
                    n61Var2.invoke(Long.valueOf(lk6Var.a));
                }
                break;
            case 2:
                n61 n61Var3 = nk6Var.u;
                if (n61Var3 != null) {
                    n61Var3.invoke(Long.valueOf(lk6Var.a));
                }
                break;
            default:
                n61 n61Var4 = nk6Var.v;
                if (n61Var4 != null) {
                    n61Var4.invoke(Long.valueOf(lk6Var.a));
                }
                break;
        }
    }
}
