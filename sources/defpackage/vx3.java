package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vx3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cle b;
    public final /* synthetic */ jme c;
    public final /* synthetic */ long d;
    public final /* synthetic */ wg e;

    public /* synthetic */ vx3(cle cleVar, jme jmeVar, long j, wg wgVar, int i) {
        this.a = i;
        this.b = cleVar;
        this.c = jmeVar;
        this.d = j;
        this.e = wgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        wg wgVar = this.e;
        long j = this.d;
        jme jmeVar = this.c;
        cle cleVar = this.b;
        switch (i) {
            case 0:
                cleVar.k0(jmeVar, j, wgVar);
                break;
            default:
                cleVar.W(jmeVar, j, wgVar);
                break;
        }
    }
}
