package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
final class tbm implements Closeable {
    final /* synthetic */ gkh a;

    public /* synthetic */ tbm(gkh gkhVar, mam mamVar) {
        this.a = gkhVar;
        yab.v(((Thread) gkhVar.d.getAndSet(Thread.currentThread())) == null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.d.set(null);
        this.a.e();
    }
}
