package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ac7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bc7 b;

    public /* synthetic */ ac7(bc7 bc7Var, int i) {
        this.a = i;
        this.b = bc7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        bc7 bc7Var = this.b;
        switch (i) {
            case 0:
                bc7Var.i = false;
                if (bc7Var.f != null) {
                    bc7Var.f.stopCapture();
                }
                bc7Var.j = false;
                break;
            default:
                bc7Var.i = false;
                if (bc7Var.f != null) {
                    bc7Var.f.stopCapture();
                }
                bc7Var.f = null;
                bc7Var.j = false;
                if (bc7Var.e != null) {
                    bc7Var.e.dispose();
                }
                bc7Var.e = null;
                break;
        }
    }
}
