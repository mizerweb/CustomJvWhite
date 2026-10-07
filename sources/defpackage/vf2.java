package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vf2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wf2 b;

    public /* synthetic */ vf2(wf2 wf2Var, int i) {
        this.a = i;
        this.b = wf2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        wf2 wf2Var = this.b;
        switch (i) {
            case 0:
                wf2Var.a.d(m09.ON_DESTROY);
                break;
            case 1:
                wf2Var.a.d(m09.ON_PAUSE);
                break;
            case 2:
                wf2Var.a.d(m09.ON_RESUME);
                break;
            default:
                wf2Var.a.d(m09.ON_STOP);
                break;
        }
    }
}
