package defpackage;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes4.dex */
public final class wqh extends f0g {
    public final ReentrantReadWriteLock e;

    public wqh(Object obj, ine ineVar) {
        super(obj, ineVar, true);
        this.e = new ReentrantReadWriteLock();
    }

    @Override // defpackage.f0g
    public final void a() {
        ReentrantReadWriteLock.WriteLock writeLock = this.e.writeLock();
        writeLock.lock();
        try {
            super.a();
        } finally {
            writeLock.unlock();
        }
    }

    @Override // defpackage.f0g
    public final void b() {
        ReentrantReadWriteLock.WriteLock writeLock = this.e.writeLock();
        writeLock.lock();
        try {
            super.b();
        } finally {
            writeLock.unlock();
        }
    }

    @Override // defpackage.f0g
    public final Object c() {
        ReentrantReadWriteLock.ReadLock lock = this.e.readLock();
        lock.lock();
        try {
            return super.c();
        } finally {
            lock.unlock();
        }
    }

    @Override // defpackage.f0g
    public final boolean d() {
        ReentrantReadWriteLock.ReadLock lock = this.e.readLock();
        lock.lock();
        try {
            return super.d();
        } finally {
            lock.unlock();
        }
    }
}
