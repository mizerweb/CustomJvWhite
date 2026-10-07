package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class be6 implements Runnable {
    public final Runnable a;
    public final ncj b;
    public final ce6 c;

    public be6(Runnable runnable, ncj ncjVar, ce6 ce6Var) {
        this.a = runnable;
        this.b = ncjVar;
        this.c = ce6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ncj ncjVar = this.b;
        ce6 ce6Var = this.c;
        long jK = ce6Var.K(ncjVar);
        ce6Var.P(jK);
        try {
            this.a.run();
        } finally {
            if (jK != -1) {
                ce6Var.b(jK);
            }
        }
    }
}
