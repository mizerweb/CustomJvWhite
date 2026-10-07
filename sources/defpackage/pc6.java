package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pc6 extends qc6 {
    public final Runnable c;

    public pc6(Runnable runnable, long j) {
        super(j);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    @Override // defpackage.qc6
    public final String toString() {
        return super.toString() + this.c;
    }
}
