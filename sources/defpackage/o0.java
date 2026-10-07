package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o0 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ d35 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ q0 d;

    public o0(q0 q0Var, boolean z, d35 d35Var, boolean z2) {
        this.d = q0Var;
        this.a = z;
        this.b = d35Var;
        this.c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.a;
        d35 d35Var = this.b;
        q0 q0Var = this.d;
        if (z) {
            d35Var.c(q0Var);
        } else if (this.c) {
            d35Var.a();
        } else {
            d35Var.d(q0Var);
        }
    }
}
