package defpackage;

import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes2.dex */
final class p4l extends m2l implements RunnableFuture {
    private volatile y3l h;

    public p4l(bcm bcmVar) {
        this.h = new l4l(this, bcmVar);
    }

    @Override // defpackage.f1l
    public final String i() {
        y3l y3lVar = this.h;
        return y3lVar != null ? c0a.o("task=[", y3lVar.toString(), "]") : super.i();
    }

    @Override // defpackage.f1l
    public final void n() {
        y3l y3lVar;
        if (q() && (y3lVar = this.h) != null) {
            y3lVar.e();
        }
        this.h = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        y3l y3lVar = this.h;
        if (y3lVar != null) {
            y3lVar.run();
        }
        this.h = null;
    }
}
