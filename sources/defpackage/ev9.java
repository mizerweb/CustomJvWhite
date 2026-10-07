package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ev9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jv9 b;

    public /* synthetic */ ev9(jv9 jv9Var, int i) {
        this.a = i;
        this.b = jv9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        jv9 jv9Var = this.b;
        switch (i) {
            case 0:
                hv9 hv9Var = jv9Var.o;
                if (hv9Var != null) {
                    jv9Var.d.unbindService(hv9Var);
                    jv9Var.o = null;
                }
                jv9Var.c.c.clear();
                break;
            default:
                c4d c4dVar = jv9Var.H;
                if (c4dVar != null) {
                    jv9Var.k0(c4dVar, a4d.c);
                }
                break;
        }
    }
}
