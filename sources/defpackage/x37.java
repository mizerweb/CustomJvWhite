package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x37 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cf7 b;
    public final /* synthetic */ zmi c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ x37(fg7 fg7Var, zmi zmiVar, int i) {
        this.a = i;
        this.b = (cf7) fg7Var;
        this.c = zmiVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        zmi zmiVar = this.c;
        cf7 cf7Var = this.b;
        switch (i) {
            case 0:
                cf7Var.invoke(zmiVar);
                break;
            default:
                cf7Var.invoke(zmiVar);
                break;
        }
    }
}
