package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class phh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qhh b;

    public /* synthetic */ phh(qhh qhhVar, int i) {
        this.a = i;
        this.b = qhhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        qhh qhhVar = this.b;
        switch (i) {
            case 0:
                qhhVar.d = null;
                qhhVar.c();
                break;
            default:
                qhhVar.c();
                break;
        }
    }
}
