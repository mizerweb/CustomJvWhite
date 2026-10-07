package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wx3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cle b;
    public final /* synthetic */ jme c;

    public /* synthetic */ wx3(cle cleVar, jme jmeVar, int i) {
        this.a = i;
        this.b = cleVar;
        this.c = jmeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.K(this.c);
                break;
            case 1:
                this.b.E(this.c);
                break;
            default:
                this.b.y(this.c);
                break;
        }
    }
}
