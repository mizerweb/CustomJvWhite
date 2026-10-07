package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ovd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vvd b;

    public /* synthetic */ ovd(vvd vvdVar, int i) {
        this.a = i;
        this.b = vvdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        vvd vvdVar = this.b;
        switch (i) {
            case 0:
                vvdVar.K = true;
                break;
            case 1:
                vvdVar.z();
                break;
            default:
                if (!vvdVar.p1) {
                    t0a t0aVar = vvdVar.s;
                    t0aVar.getClass();
                    t0aVar.q(vvdVar);
                }
                break;
        }
    }
}
