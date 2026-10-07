package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class chk implements Runnable {
    public final Runnable a;
    public volatile boolean b = false;
    public int c = 0;

    public chk(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
        this.b = true;
    }
}
