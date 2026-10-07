package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xpg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zpg b;

    public /* synthetic */ xpg(zpg zpgVar, int i) {
        this.a = i;
        this.b = zpgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zpg zpgVar = this.b;
        switch (i) {
            case 0:
                RecyclerView recyclerView = zpgVar.e;
                if (!recyclerView.Y()) {
                    recyclerView.X();
                }
                break;
            default:
                zpgVar.j.set(true);
                break;
        }
    }
}
