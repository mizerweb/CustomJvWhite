package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j1b extends h1 implements Runnable {
    public final Runnable h;

    public j1b(Runnable runnable) {
        runnable.getClass();
        this.h = runnable;
    }

    @Override // defpackage.o1
    public final String k() {
        return "task=[" + this.h + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.h.run();
        } catch (Throwable th) {
            n(th);
            throw th;
        }
    }
}
