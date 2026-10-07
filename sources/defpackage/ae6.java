package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class ae6 implements Callable {
    public final Callable a;
    public final ncj b;
    public final ce6 c;

    public ae6(Callable callable, ncj ncjVar, ce6 ce6Var) {
        this.a = callable;
        this.b = ncjVar;
        this.c = ce6Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ncj ncjVar = this.b;
        ce6 ce6Var = this.c;
        long jK = ce6Var.K(ncjVar);
        ce6Var.P(jK);
        try {
            return this.a.call();
        } finally {
            if (jK != -1) {
                ce6Var.b(jK);
            }
        }
    }
}
