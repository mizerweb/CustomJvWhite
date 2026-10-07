package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bg5 extends AtomicInteger implements p1e, r7h {
    public final g17 a;
    public Object b;

    public bg5(g17 g17Var) {
        this.a = g17Var;
    }

    public void a(Object obj) {
        g(obj);
    }

    @Override // defpackage.b7g
    public final void clear() {
        lazySet(32);
        this.b = null;
    }

    @Override // defpackage.r7h
    public final void f(long j) {
        Object obj;
        if (u7h.a(j)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (obj = this.b) == null) {
                        return;
                    }
                    this.b = null;
                    g17 g17Var = this.a;
                    g17Var.d(obj);
                    if (get() != 4) {
                        g17Var.b();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    public final void g(Object obj) {
        int i = get();
        do {
            g17 g17Var = this.a;
            if (i == 8) {
                this.b = obj;
                lazySet(16);
                g17Var.d(obj);
                if (get() != 4) {
                    g17Var.b();
                    return;
                }
                return;
            }
            if ((i & (-3)) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                g17Var.d(obj);
                if (get() != 4) {
                    g17Var.b();
                    return;
                }
                return;
            }
            this.b = obj;
            if (compareAndSet(0, 1)) {
                return;
            } else {
                i = get();
            }
        } while (i != 4);
        this.b = null;
    }

    @Override // defpackage.b7g
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // defpackage.b7g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.b7g
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.b;
        this.b = null;
        return obj;
    }
}
