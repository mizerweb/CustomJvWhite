package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wt3 extends f95 {
    public gj d;
    public boolean e;

    @Override // defpackage.xt3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                gj gjVar = this.d;
                if (gjVar == null) {
                    return;
                }
                this.d = null;
                synchronized (gjVar) {
                    au3.E(gjVar.b);
                    gjVar.b = null;
                    au3.I(gjVar.c);
                    gjVar.c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.xt3, defpackage.l68
    public final synchronized int getHeight() {
        gj gjVar;
        gjVar = this.d;
        return gjVar == null ? 0 : gjVar.a.getHeight();
    }

    @Override // defpackage.xt3
    public final synchronized int getSizeInBytes() {
        gj gjVar;
        gjVar = this.d;
        return gjVar == null ? 0 : gjVar.a.getSizeInBytes();
    }

    @Override // defpackage.xt3, defpackage.l68
    public final synchronized int getWidth() {
        gj gjVar;
        gjVar = this.d;
        return gjVar == null ? 0 : gjVar.a.getWidth();
    }

    @Override // defpackage.xt3
    public final synchronized boolean isClosed() {
        return this.d == null;
    }

    @Override // defpackage.hq0, defpackage.xt3
    public final boolean isStateful() {
        return this.e;
    }

    public final synchronized cj l() {
        gj gjVar;
        gjVar = this.d;
        return gjVar == null ? null : gjVar.a;
    }

    public final synchronized gj y() {
        return this.d;
    }
}
