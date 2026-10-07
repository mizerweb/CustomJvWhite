package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m52 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s52 b;

    public /* synthetic */ m52(s52 s52Var, int i) {
        this.a = i;
        this.b = s52Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        s52 s52Var = this.b;
        switch (i) {
            case 0:
                p52 p52Var = s52Var.s1;
                if (p52Var != null) {
                    p52Var.n(s52Var.x1);
                }
                break;
            case 1:
                p52 p52Var2 = s52Var.s1;
                if (p52Var2 != null) {
                    p52Var2.w();
                }
                break;
            default:
                p52 p52Var3 = s52Var.s1;
                if (p52Var3 != null) {
                    p52Var3.h(s52Var.x1);
                }
                break;
        }
    }
}
