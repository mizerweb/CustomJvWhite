package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class yqh extends gp8 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(yqh.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;
    public final Thread h = Thread.currentThread();
    public no5 i;

    public static void r(int i) {
        throw new IllegalStateException(nbh.q(i, "Illegal state "));
    }

    @Override // defpackage.gp8
    public final boolean o() {
        return true;
    }

    @Override // defpackage.gp8
    public final void p(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = j;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                r(i);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.h.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void q() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        r(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                no5 no5Var = this.i;
                if (no5Var != null) {
                    no5Var.dispose();
                    return;
                }
                return;
            }
        }
    }
}
