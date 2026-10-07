package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class v3 extends qyj {
    public final AtomicReferenceFieldUpdater e;
    public final AtomicReferenceFieldUpdater f;
    public final AtomicReferenceFieldUpdater g;
    public final AtomicReferenceFieldUpdater h;
    public final AtomicReferenceFieldUpdater i;

    public v3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.e = atomicReferenceFieldUpdater;
        this.f = atomicReferenceFieldUpdater2;
        this.g = atomicReferenceFieldUpdater3;
        this.h = atomicReferenceFieldUpdater4;
        this.i = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.qyj
    public final void P(x3 x3Var, x3 x3Var2) {
        this.f.lazySet(x3Var, x3Var2);
    }

    @Override // defpackage.qyj
    public final void Q(x3 x3Var, Thread thread) {
        this.e.lazySet(x3Var, thread);
    }

    @Override // defpackage.qyj
    public final boolean e(y3 y3Var, u3 u3Var, u3 u3Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.h;
            if (atomicReferenceFieldUpdater.compareAndSet(y3Var, u3Var, u3Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(y3Var) == u3Var);
        return false;
    }

    @Override // defpackage.qyj
    public final boolean f(y3 y3Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.i;
            if (atomicReferenceFieldUpdater.compareAndSet(y3Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(y3Var) == obj);
        return false;
    }

    @Override // defpackage.qyj
    public final boolean g(y3 y3Var, x3 x3Var, x3 x3Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.g;
            if (atomicReferenceFieldUpdater.compareAndSet(y3Var, x3Var, x3Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(y3Var) == x3Var);
        return false;
    }
}
