package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
final class y0l extends u0l {
    final AtomicReferenceFieldUpdater<d1l, Thread> a;
    final AtomicReferenceFieldUpdater<d1l, d1l> b;
    final AtomicReferenceFieldUpdater<? super f1l<?>, d1l> c;
    final AtomicReferenceFieldUpdater<? super f1l<?>, x0l> d;
    final AtomicReferenceFieldUpdater<? super f1l<?>, Object> e;

    public y0l(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.u0l
    public final x0l a(f1l f1lVar, x0l x0lVar) {
        return this.d.getAndSet(f1lVar, x0lVar);
    }

    @Override // defpackage.u0l
    public final d1l b(f1l f1lVar, d1l d1lVar) {
        return this.c.getAndSet(f1lVar, d1lVar);
    }

    @Override // defpackage.u0l
    public final void c(d1l d1lVar, d1l d1lVar2) {
        this.b.lazySet(d1lVar, d1lVar2);
    }

    @Override // defpackage.u0l
    public final void d(d1l d1lVar, Thread thread) {
        this.a.lazySet(d1lVar, thread);
    }

    @Override // defpackage.u0l
    public final boolean e(f1l f1lVar, x0l x0lVar, x0l x0lVar2) {
        return w1l.a(this.d, f1lVar, x0lVar, x0lVar2);
    }

    @Override // defpackage.u0l
    public final boolean f(f1l f1lVar, Object obj, Object obj2) {
        return w1l.a(this.e, f1lVar, obj, obj2);
    }

    @Override // defpackage.u0l
    public final boolean g(f1l f1lVar, d1l d1lVar, d1l d1lVar2) {
        return w1l.a(this.c, f1lVar, d1lVar, d1lVar2);
    }
}
