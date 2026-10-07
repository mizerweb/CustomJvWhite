package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class gzb implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ af7 b;

    public /* synthetic */ gzb(int i, af7 af7Var) {
        this.a = i;
        this.b = af7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        af7 af7Var = this.b;
        switch (i) {
            case 0:
                af7Var.invoke();
                break;
            default:
                af7Var.invoke();
                break;
        }
    }
}
