package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wbh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wf5 b;

    public /* synthetic */ wbh(wf5 wf5Var, int i) {
        this.a = i;
        this.b = wf5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        wf5 wf5Var = this.b;
        switch (i) {
            case 0:
                wf5Var.a();
                break;
            default:
                wf5Var.b();
                break;
        }
    }
}
