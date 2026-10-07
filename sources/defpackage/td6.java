package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class td6 extends AtomicInteger implements Runnable, ko5 {
    public final Runnable a;
    public final lo5 b;
    public volatile Thread c;

    public td6(Runnable runnable, lo5 lo5Var) {
        this.a = runnable;
        this.b = lo5Var;
    }

    @Override // defpackage.ko5
    public final void dispose() {
        while (true) {
            int i = get();
            if (i >= 2) {
                return;
            }
            if (i == 0) {
                if (compareAndSet(0, 4)) {
                    lo5 lo5Var = this.b;
                    if (lo5Var != null) {
                        lo5Var.c(this);
                        return;
                    }
                    return;
                }
            } else if (compareAndSet(1, 3)) {
                Thread thread = this.c;
                if (thread != null) {
                    thread.interrupt();
                    this.c = null;
                }
                set(4);
                lo5 lo5Var2 = this.b;
                if (lo5Var2 != null) {
                    lo5Var2.c(this);
                    return;
                }
                return;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0) {
            this.c = Thread.currentThread();
            if (!compareAndSet(0, 1)) {
                this.c = null;
                return;
            }
            try {
                this.a.run();
                this.c = null;
                if (compareAndSet(1, 2)) {
                }
            } finally {
                this.c = null;
                if (compareAndSet(1, 2)) {
                    lo5 lo5Var = this.b;
                    if (lo5Var != null) {
                        lo5Var.c(this);
                    }
                } else {
                    while (get() == 3) {
                        Thread.yield();
                    }
                    Thread.interrupted();
                }
            }
        }
    }
}
