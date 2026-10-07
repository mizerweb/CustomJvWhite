package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class w2f implements ko5, Runnable {
    public final Runnable a;
    public final y2f b;
    public volatile boolean c;

    public w2f(Runnable runnable, y2f y2fVar) {
        this.a = runnable;
        this.b = y2fVar;
    }

    @Override // defpackage.ko5
    public final void dispose() {
        this.c = true;
        this.b.dispose();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            return;
        }
        try {
            this.a.run();
        } catch (Throwable th) {
            iwl.a(th);
            this.b.dispose();
            throw gd6.b(th);
        }
    }
}
