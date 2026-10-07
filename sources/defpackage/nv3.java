package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nv3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jv3 b;

    public /* synthetic */ nv3(jv3 jv3Var, int i) {
        this.a = i;
        this.b = jv3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        jv3 jv3Var = this.b;
        switch (i) {
            case 0:
                jv3Var.a();
                break;
            case 1:
                jv3Var.a();
                break;
            case 2:
                jv3Var.a();
                break;
            default:
                jv3Var.a();
                break;
        }
    }
}
