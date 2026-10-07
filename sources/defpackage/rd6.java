package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class rd6 extends AtomicReference implements Runnable, ko5 {
    public final j66 a;
    public final j66 b;

    public rd6(Runnable runnable) {
        super(runnable);
        this.a = new j66(2);
        this.b = new j66(2);
    }

    @Override // defpackage.ko5
    public final void dispose() {
        if (getAndSet(null) != null) {
            j66 j66Var = this.a;
            j66Var.getClass();
            oo5.a(j66Var);
            j66 j66Var2 = this.b;
            j66Var2.getClass();
            oo5.a(j66Var2);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        j66 j66Var = this.b;
        j66 j66Var2 = this.a;
        oo5 oo5Var = oo5.a;
        Runnable runnable = (Runnable) get();
        if (runnable != null) {
            try {
                runnable.run();
            } finally {
                lazySet(null);
                j66Var2.lazySet(oo5Var);
                j66Var.lazySet(oo5Var);
            }
        }
    }
}
