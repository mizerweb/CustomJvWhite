package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e7c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7c b;

    public /* synthetic */ e7c(h7c h7cVar, int i) {
        this.a = i;
        this.b = h7cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        h7c h7cVar = this.b;
        switch (i) {
            case 0:
                h7cVar.d(false);
                break;
            case 1:
                h7cVar.d(true);
                break;
            default:
                h7cVar.d(true);
                break;
        }
    }
}
