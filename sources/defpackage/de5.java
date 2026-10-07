package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class de5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ich b;

    public /* synthetic */ de5(ich ichVar, int i) {
        this.a = i;
        this.b = ichVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ich ichVar = this.b;
        switch (i) {
            case 0:
                ichVar.d();
                break;
            default:
                ichVar.h.cancel(true);
                break;
        }
    }
}
