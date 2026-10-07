package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ech implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hch b;
    public final /* synthetic */ dj0 c;

    public /* synthetic */ ech(hch hchVar, dj0 dj0Var, int i) {
        this.a = i;
        this.b = hchVar;
        this.c = dj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        dj0 dj0Var = this.c;
        hch hchVar = this.b;
        switch (i) {
            case 0:
                hchVar.f(dj0Var);
                break;
            default:
                hchVar.f(dj0Var);
                break;
        }
    }
}
