package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class rfe {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public volatile Thread b;

    public final void a(af7 af7Var) {
        Thread threadCurrentThread = Thread.currentThread();
        while (true) {
            boolean zCompareAndSet = this.a.compareAndSet(false, true);
            Thread thread = this.b;
            if (zCompareAndSet) {
                if (thread != null) {
                    ore.k("Unexpected owner in ReentrantSpinLock");
                    return;
                }
                this.b = threadCurrentThread;
                try {
                    af7Var.invoke();
                    this.b = null;
                    if (this.a.compareAndSet(true, false)) {
                        return;
                    }
                    ore.k("Unexpected ctl state in ReentrantSpinLock");
                    return;
                } catch (Throwable unused) {
                    this.b = null;
                    if (this.a.compareAndSet(true, false)) {
                        return;
                    }
                    ore.k("Unexpected ctl state in ReentrantSpinLock");
                    return;
                }
            }
            if (cqk.d(threadCurrentThread, thread)) {
                if (!this.a.get()) {
                    ore.k("Unexpected ctl state in ReentrantSpinLock (nested)");
                    return;
                } else {
                    try {
                        af7Var.invoke();
                        return;
                    } catch (Throwable unused2) {
                        return;
                    }
                }
            }
            Thread.yield();
        }
    }
}
