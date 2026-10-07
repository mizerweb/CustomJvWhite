package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gak implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hak b;

    public /* synthetic */ gak(hak hakVar, int i) {
        this.a = i;
        this.b = hakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        hak hakVar = this.b;
        switch (i) {
            case 0:
                try {
                    hakVar.r = true;
                    while (hakVar.r) {
                        hakVar.j();
                    }
                    break;
                } catch (Throwable th) {
                    if (hakVar.r) {
                        hakVar.e.j(th);
                        return;
                    } else {
                        th.toString();
                        return;
                    }
                }
                break;
            default:
                hakVar.h();
                break;
        }
    }
}
