package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rc2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zc2 b;
    public final /* synthetic */ jme c;

    public /* synthetic */ rc2(zc2 zc2Var, yc2 yc2Var, jme jmeVar, int i) {
        this.a = i;
        this.b = zc2Var;
        this.c = jmeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e(yc2.d(this.c));
                break;
            default:
                this.b.a(yc2.d(this.c));
                break;
        }
    }
}
