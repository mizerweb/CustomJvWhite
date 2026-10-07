package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class v2f implements ko5, Runnable {
    public final Runnable a;
    public final y2f b;
    public Thread c;

    public v2f(Runnable runnable, y2f y2fVar) {
        this.a = runnable;
        this.b = y2fVar;
    }

    @Override // defpackage.ko5
    public final void dispose() {
        if (this.c == Thread.currentThread()) {
            y2f y2fVar = this.b;
            if (y2fVar instanceof egb) {
                egb egbVar = (egb) y2fVar;
                if (egbVar.b) {
                    return;
                }
                egbVar.b = true;
                egbVar.a.shutdown();
                return;
            }
        }
        this.b.dispose();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c = Thread.currentThread();
        try {
            this.a.run();
        } finally {
            dispose();
            this.c = null;
        }
    }
}
