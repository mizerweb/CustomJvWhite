package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes2.dex */
public final class sv0 extends j7h {
    public static final rv0[] g = new rv0[0];
    public static final rv0[] h = new rv0[0];
    public final AtomicReference a;
    public final AtomicReference b;
    public final Lock c;
    public final Lock d;
    public final AtomicReference e;
    public long f;

    public sv0() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.c = reentrantReadWriteLock.readLock();
        this.d = reentrantReadWriteLock.writeLock();
        this.b = new AtomicReference(g);
        this.a = new AtomicReference(null);
        this.e = new AtomicReference();
    }

    @Override // defpackage.rrb
    public final void b() {
        AtomicReference atomicReference;
        fd6 fd6Var = gd6.a;
        do {
            atomicReference = this.e;
            if (atomicReference.compareAndSet(null, fd6Var)) {
                Lock lock = this.d;
                lock.lock();
                this.f++;
                AtomicReference atomicReference2 = this.a;
                pmb pmbVar = pmb.a;
                atomicReference2.lazySet(pmbVar);
                lock.unlock();
                for (rv0 rv0Var : (rv0[]) this.b.getAndSet(h)) {
                    rv0Var.a(this.f, pmbVar);
                }
                return;
            }
        } while (atomicReference.get() == null);
    }

    @Override // defpackage.rrb
    public final void c(ko5 ko5Var) {
        if (this.e.get() != null) {
            ko5Var.dispose();
        }
    }

    @Override // defpackage.rrb
    public final void d(Object obj) {
        if (obj == null) {
            throw gd6.a("onNext called with a null value.");
        }
        fd6 fd6Var = gd6.a;
        if (this.e.get() != null) {
            return;
        }
        Lock lock = this.d;
        lock.lock();
        this.f++;
        this.a.lazySet(obj);
        lock.unlock();
        for (rv0 rv0Var : (rv0[]) this.b.get()) {
            rv0Var.a(this.f, obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fqb
    public final void g(rrb rrbVar) {
        ed7 ed7Var;
        rv0 rv0Var = new rv0(rrbVar, this);
        rrbVar.c(rv0Var);
        AtomicReference atomicReference = this.b;
        while (true) {
            rv0[] rv0VarArr = (rv0[]) atomicReference.get();
            if (rv0VarArr == h) {
                Throwable th = (Throwable) this.e.get();
                if (th == gd6.a) {
                    rrbVar.b();
                    return;
                } else {
                    rrbVar.onError(th);
                    return;
                }
            }
            int length = rv0VarArr.length;
            rv0[] rv0VarArr2 = new rv0[length + 1];
            System.arraycopy(rv0VarArr, 0, rv0VarArr2, 0, length);
            rv0VarArr2[length] = rv0Var;
            do {
                if (atomicReference.compareAndSet(rv0VarArr, rv0VarArr2)) {
                    if (rv0Var.g) {
                        h(rv0Var);
                        return;
                    }
                    if (rv0Var.g) {
                        return;
                    }
                    synchronized (rv0Var) {
                        try {
                            if (rv0Var.g) {
                                return;
                            }
                            if (rv0Var.c) {
                                return;
                            }
                            sv0 sv0Var = rv0Var.b;
                            Lock lock = sv0Var.c;
                            lock.lock();
                            rv0Var.h = sv0Var.f;
                            Object obj = sv0Var.a.get();
                            lock.unlock();
                            rv0Var.d = obj != null;
                            rv0Var.c = true;
                            if (obj == null || rv0Var.test(obj)) {
                                return;
                            }
                            while (!rv0Var.g) {
                                synchronized (rv0Var) {
                                    try {
                                        ed7Var = rv0Var.e;
                                        if (ed7Var == null) {
                                            rv0Var.d = false;
                                            return;
                                        }
                                        rv0Var.e = null;
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                ed7Var.F(rv0Var);
                            }
                            return;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            } while (atomicReference.get() == rv0VarArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(rv0 rv0Var) {
        rv0[] rv0VarArr;
        while (true) {
            AtomicReference atomicReference = this.b;
            rv0[] rv0VarArr2 = (rv0[]) atomicReference.get();
            int length = rv0VarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (rv0VarArr2[i] == rv0Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                rv0VarArr = g;
            } else {
                rv0[] rv0VarArr3 = new rv0[length - 1];
                System.arraycopy(rv0VarArr2, 0, rv0VarArr3, 0, i);
                System.arraycopy(rv0VarArr2, i + 1, rv0VarArr3, i, (length - i) - 1);
                rv0VarArr = rv0VarArr3;
            }
            while (!atomicReference.compareAndSet(rv0VarArr2, rv0VarArr)) {
                if (atomicReference.get() != rv0VarArr2) {
                }
            }
            return;
        }
    }

    @Override // defpackage.rrb
    public final void onError(Throwable th) {
        AtomicReference atomicReference;
        if (th == null) {
            throw gd6.a("onError called with a null Throwable.");
        }
        fd6 fd6Var = gd6.a;
        do {
            atomicReference = this.e;
            if (atomicReference.compareAndSet(null, th)) {
                omb ombVar = new omb(th);
                Lock lock = this.d;
                lock.lock();
                this.f++;
                this.a.lazySet(ombVar);
                lock.unlock();
                for (rv0 rv0Var : (rv0[]) this.b.getAndSet(h)) {
                    rv0Var.a(this.f, ombVar);
                }
                return;
            }
        } while (atomicReference.get() == null);
        tre.s0(th);
    }
}
