package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zyb implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cf7 b;

    public /* synthetic */ zyb(int i, cf7 cf7Var) {
        this.a = i;
        this.b = cf7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        cf7 cf7Var = this.b;
        switch (i) {
            case 0:
                cf7Var.invoke(Boolean.FALSE);
                break;
            case 1:
                cf7Var.invoke(Boolean.TRUE);
                break;
            case 2:
                cf7Var.invoke(Boolean.FALSE);
                break;
            default:
                cf7Var.invoke(Boolean.TRUE);
                break;
        }
    }
}
