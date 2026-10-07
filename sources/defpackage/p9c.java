package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p9c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q9c b;

    public /* synthetic */ p9c(q9c q9cVar, int i) {
        this.a = i;
        this.b = q9cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        q9c q9cVar = this.b;
        switch (i) {
            case 0:
                q9cVar.invalidate();
                break;
            default:
                q9cVar.invalidate();
                break;
        }
    }
}
