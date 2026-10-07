package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vbh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ybh b;

    public /* synthetic */ vbh(ybh ybhVar, int i) {
        this.a = i;
        this.b = ybhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ybh ybhVar = this.b;
        switch (i) {
            case 0:
                ybhVar.a();
                break;
            case 1:
                ybhVar.b();
                break;
            default:
                cch cchVar = ybhVar.q;
                if (cchVar != null) {
                    cchVar.l();
                }
                if (ybhVar.p == null) {
                    ybhVar.o.c();
                }
                ybhVar.p = null;
                break;
        }
    }
}
