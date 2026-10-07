package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class s1f extends r0 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        this.b = Thread.currentThread();
        try {
            this.a.run();
            this.b = null;
        } catch (Throwable th) {
            iwl.a(th);
            this.b = null;
            lazySet(r0.c);
            tre.s0(th);
        }
    }
}
