package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class j1c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l1c b;

    public /* synthetic */ j1c(l1c l1cVar, int i) {
        this.a = i;
        this.b = l1cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        l1c l1cVar = this.b;
        switch (i) {
            case 0:
                l1cVar.requestLayout();
                l1cVar.invalidate();
                break;
            case 1:
                l1cVar.requestLayout();
                l1cVar.invalidate();
                break;
            case 2:
                l1cVar.requestLayout();
                l1cVar.invalidate();
                break;
            default:
                l1cVar.requestLayout();
                l1cVar.invalidate();
                break;
        }
    }
}
