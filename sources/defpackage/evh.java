package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class evh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hcc b;

    public /* synthetic */ evh(hcc hccVar, int i) {
        this.a = i;
        this.b = hccVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        hcc hccVar = this.b;
        switch (i) {
            case 0:
                hccVar.d.invoke(view);
                break;
            default:
                hccVar.d.invoke(view);
                break;
        }
    }
}
