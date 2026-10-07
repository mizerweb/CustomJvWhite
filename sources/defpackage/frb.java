package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class frb extends AtomicInteger implements o1e, Runnable {
    public final rrb a;
    public final Object b;

    public frb(rrb rrbVar, Object obj) {
        this.a = rrbVar;
        this.b = obj;
    }

    @Override // defpackage.b7g
    public final void clear() {
        lazySet(3);
    }

    @Override // defpackage.ko5
    public final void dispose() {
        set(3);
    }

    @Override // defpackage.b7g
    public final boolean isEmpty() {
        return get() != 1;
    }

    @Override // defpackage.p1e
    public final int k() {
        lazySet(1);
        return 1;
    }

    @Override // defpackage.b7g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.b7g
    public final Object poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            Object obj = this.b;
            rrb rrbVar = this.a;
            rrbVar.d(obj);
            if (get() == 2) {
                lazySet(3);
                rrbVar.b();
            }
        }
    }
}
