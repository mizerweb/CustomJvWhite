package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class d1 extends grk {
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;
    public final AtomicReferenceFieldUpdater f;

    public d1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.b = atomicReferenceFieldUpdater;
        this.c = atomicReferenceFieldUpdater2;
        this.d = atomicReferenceFieldUpdater3;
        this.e = atomicReferenceFieldUpdater4;
        this.f = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.grk
    public final boolean b(o1 o1Var, c1 c1Var, c1 c1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(o1Var, c1Var, c1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(o1Var) == c1Var);
        return false;
    }

    @Override // defpackage.grk
    public final boolean c(o1 o1Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f;
            if (atomicReferenceFieldUpdater.compareAndSet(o1Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(o1Var) == obj);
        return false;
    }

    @Override // defpackage.grk
    public final boolean d(o1 o1Var, n1 n1Var, n1 n1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.d;
            if (atomicReferenceFieldUpdater.compareAndSet(o1Var, n1Var, n1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(o1Var) == n1Var);
        return false;
    }

    @Override // defpackage.grk
    public final c1 e(o1 o1Var) {
        return (c1) this.e.getAndSet(o1Var, c1.d);
    }

    @Override // defpackage.grk
    public final n1 f(o1 o1Var) {
        return (n1) this.d.getAndSet(o1Var, n1.c);
    }

    @Override // defpackage.grk
    public final void g(n1 n1Var, n1 n1Var2) {
        this.c.lazySet(n1Var, n1Var2);
    }

    @Override // defpackage.grk
    public final void h(n1 n1Var, Thread thread) {
        this.b.lazySet(n1Var, thread);
    }
}
