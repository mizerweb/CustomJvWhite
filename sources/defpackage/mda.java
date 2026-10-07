package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mda implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tda b;

    public /* synthetic */ mda(tda tdaVar, int i) {
        this.a = i;
        this.b = tdaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        tda tdaVar = this.b;
        switch (i) {
            case 0:
                tdaVar.e.invoke();
                break;
            default:
                tdaVar.f.invoke();
                break;
        }
    }
}
