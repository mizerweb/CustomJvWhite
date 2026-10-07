package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uig implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yig b;
    public final /* synthetic */ aak c;

    public /* synthetic */ uig(yig yigVar, aak aakVar, int i) {
        this.a = i;
        this.b = yigVar;
        this.c = aakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        aak aakVar = this.c;
        yig yigVar = this.b;
        switch (i) {
            case 0:
                yigVar.b(aakVar);
                break;
            default:
                yigVar.h.remove(aakVar);
                break;
        }
    }
}
