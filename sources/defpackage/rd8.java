package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rd8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ td8 b;

    public /* synthetic */ rd8(td8 td8Var, int i) {
        this.a = i;
        this.b = td8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        td8 td8Var = this.b;
        switch (i) {
            case 0:
                td8Var.l.a(pr4.a);
                break;
            case 1:
                td8Var.l.a(qr4.a);
                break;
            default:
                td8Var.l.a(sr4.a);
                break;
        }
    }
}
