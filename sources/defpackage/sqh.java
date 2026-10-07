package defpackage;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes2.dex */
public final class sqh extends au3 {
    public final wqh g;

    public sqh(wqh wqhVar, zt3 zt3Var, Throwable th, boolean z) {
        super(wqhVar, zt3Var, th);
        this.g = wqhVar;
        if (z) {
            wqhVar.b();
        }
    }

    @Override // defpackage.au3
    public final Object K() {
        ReentrantReadWriteLock.ReadLock lock = this.g.e.readLock();
        lock.lock();
        try {
            return super.K();
        } finally {
            lock.unlock();
        }
    }

    @Override // defpackage.au3
    public final boolean P() {
        ReentrantReadWriteLock.ReadLock lock = this.g.e.readLock();
        lock.lock();
        try {
            return super.P();
        } finally {
            lock.unlock();
        }
    }

    @Override // defpackage.au3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        wqh wqhVar = this.g;
        if (wqhVar == null) {
            gm0.Y("ThreadSafeCloseableRef", "close(): threadSafeSharedReference is null, GC cleared it before finalize (JLS 12.6)");
            return;
        }
        ReentrantReadWriteLock.WriteLock writeLock = wqhVar.e.writeLock();
        writeLock.lock();
        try {
            super.close();
        } finally {
            writeLock.unlock();
        }
    }

    public final void finalize() {
        wqh wqhVar;
        if (this.a) {
            return;
        }
        zt3 zt3Var = this.c;
        if (zt3Var != null && (wqhVar = this.g) != null) {
            zt3Var.w(wqhVar, this.d);
        }
        close();
    }

    @Override // defpackage.au3
    /* JADX INFO: renamed from: l */
    public final au3 clone() {
        wqh wqhVar = this.g;
        ReentrantReadWriteLock.WriteLock writeLock = wqhVar.e.writeLock();
        writeLock.lock();
        try {
            if (!P()) {
                throw new IllegalStateException("Cannot clone a closed reference");
            }
            sqh sqhVar = new sqh(wqhVar, this.c, this.d != null ? new Throwable("CloseableReference stacktrace") : null, false);
            writeLock.unlock();
            return sqhVar;
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.au3
    public final au3 y() {
        ReentrantReadWriteLock.WriteLock writeLock = this.g.e.writeLock();
        writeLock.lock();
        try {
            return P() ? clone() : null;
        } finally {
            writeLock.unlock();
        }
    }

    public sqh(Object obj, ine ineVar, ku8 ku8Var) {
        this(new wqh(obj, ineVar), ku8Var, null, true);
    }
}
