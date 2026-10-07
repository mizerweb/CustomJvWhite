package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wvb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kwb b;

    public /* synthetic */ wvb(kwb kwbVar, int i) {
        this.a = i;
        this.b = kwbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        kwb kwbVar = this.b;
        switch (i) {
            case 0:
                kwbVar.l(true);
                break;
            default:
                kwbVar.start();
                break;
        }
    }
}
