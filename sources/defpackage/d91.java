package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o91 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ d91(o91 o91Var, Runnable runnable, int i) {
        this.a = i;
        this.b = o91Var;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = 1;
        Runnable runnable = this.c;
        o91 o91Var = this.b;
        switch (i) {
            case 0:
                o91Var.l.post(new d91(o91Var, runnable, i2));
                break;
            default:
                o91Var.N.log("OKRTCCall", "disabling enhancer");
                if (!o91Var.u) {
                    o91Var.S = true;
                    o91Var.M(new vhb(false, true, true, false, null, null, 0, 0, 0, 0, 0, false, null, 0));
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                break;
        }
    }
}
