package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class x0l {
    static final x0l d = new x0l();
    final Runnable a;
    final Executor b;
    x0l c;

    public x0l() {
        this.a = null;
        this.b = null;
    }

    public x0l(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
