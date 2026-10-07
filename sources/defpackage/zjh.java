package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zjh extends mjh {
    public final Runnable c;

    public zjh(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(f55.n(runnable));
        sb.append(", ");
        sb.append(this.a);
        sb.append(", ");
        return x05.i(sb, this.b ? "Blocking" : "Non-blocking", ']');
    }
}
