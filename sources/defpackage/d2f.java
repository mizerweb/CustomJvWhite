package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class d2f extends AtomicReferenceArray implements Runnable, Callable, ko5 {
    public static final Object b = new Object();
    public static final Object c = new Object();
    public static final Object d = new Object();
    public static final Object e = new Object();
    public final Runnable a;

    public d2f(Runnable runnable, lo5 lo5Var) {
        super(3);
        this.a = runnable;
        lazySet(0, lo5Var);
    }

    public final void a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == e) {
                return;
            }
            if (obj == c) {
                future.cancel(false);
                return;
            } else if (obj == d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // defpackage.ko5
    public final void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = e;
            if (obj6 == obj || obj6 == (obj4 = c) || obj6 == (obj5 = d)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 == null) {
                    break;
                }
                ((Future) obj6).cancel(z);
                break;
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = b) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((lo5) obj2).c(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2 = d;
        Object obj3 = c;
        Object obj4 = b;
        Object obj5 = e;
        lazySet(2, Thread.currentThread());
        try {
            this.a.run();
        } catch (Throwable th) {
            try {
                tre.s0(th);
            } finally {
                lazySet(2, null);
                Object obj6 = get(0);
                if (obj6 != obj4 && compareAndSet(0, obj6, obj5) && obj6 != null) {
                    ((lo5) obj6).c(this);
                }
                do {
                    obj = get(1);
                    if (obj == obj3 || obj == obj2) {
                        break;
                    }
                } while (!compareAndSet(1, obj, obj5));
            }
        }
        lazySet(2, null);
        Object obj7 = get(0);
        if (obj7 != obj4 && compareAndSet(0, obj7, obj5) && obj7 != null) {
            ((lo5) obj7).c(this);
        }
        while (r2 != obj3 && r2 != obj2 && !compareAndSet(1, get(i), obj5)) {
        }
    }
}
