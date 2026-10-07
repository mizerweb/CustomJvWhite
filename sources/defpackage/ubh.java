package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ubh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zbh b;

    public /* synthetic */ ubh(zbh zbhVar, int i) {
        this.a = i;
        this.b = zbhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zbh zbhVar = this.b;
        switch (i) {
            case 0:
                zjl.d().execute(new ubh(zbhVar, 1));
                break;
            default:
                if (!zbhVar.n) {
                    zbhVar.e();
                }
                break;
        }
    }
}
