package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class gcf extends p94 implements hib {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(gcf.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long e;

    public gcf(long j, gcf gcfVar, int i) {
        super(gcfVar);
        this.e = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // defpackage.p94
    public final boolean g() {
        return f.get(this) == l() && d() != null;
    }

    public final boolean k() {
        return f.addAndGet(this, -65536) == l() && d() != null;
    }

    public abstract int l();

    public abstract void m(int i, vt4 vt4Var);

    public final void n() {
        if (f.incrementAndGet(this) == l()) {
            i();
        }
    }

    public final boolean o() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == l() && d() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
