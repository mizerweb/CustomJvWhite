package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zub implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ af7 b;

    public /* synthetic */ zub(int i, af7 af7Var) {
        this.a = i;
        this.b = af7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        af7 af7Var = this.b;
        switch (i) {
            case 0:
                if (af7Var != null) {
                    af7Var.invoke();
                }
                break;
            case 1:
                if (af7Var != null) {
                    af7Var.invoke();
                }
                break;
            default:
                af7Var.invoke();
                break;
        }
    }
}
