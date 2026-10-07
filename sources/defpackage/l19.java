package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class l19 extends xt4 implements jg5 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(l19.class, "runningWorkers$volatile");
    public final /* synthetic */ jg5 c;
    public final xt4 d;
    public final int e;
    public final String f;
    public final md9 g;
    public final Object h;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public l19(xt4 xt4Var, int i2, String str) {
        jg5 jg5Var = xt4Var instanceof jg5 ? (jg5) xt4Var : null;
        this.c = jg5Var == null ? pa5.a : jg5Var;
        this.d = xt4Var;
        this.e = i2;
        this.f = str;
        this.g = new md9();
        this.h = new Object();
    }

    @Override // defpackage.xt4
    public final void D0(vt4 vt4Var, Runnable runnable) {
        Runnable runnableS0;
        this.g.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
        if (atomicIntegerFieldUpdater.get(this) >= this.e || !T0() || (runnableS0 = S0()) == null) {
            return;
        }
        try {
            e9i.z0(this.d, this, new p0((Object) this, 4, (Object) runnableS0));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.xt4
    public final void I0(vt4 vt4Var, Runnable runnable) {
        Runnable runnableS0;
        this.g.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
        if (atomicIntegerFieldUpdater.get(this) >= this.e || !T0() || (runnableS0 = S0()) == null) {
            return;
        }
        try {
            this.d.I0(this, new p0((Object) this, 4, (Object) runnableS0));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.jg5
    public final void P(long j, ek2 ek2Var) {
        this.c.P(j, ek2Var);
    }

    @Override // defpackage.xt4
    public final xt4 R0(int i2, String str) {
        n1g.m(i2);
        if (i2 >= this.e) {
            return str != null ? new qab(this, str) : this;
        }
        return super.R0(i2, str);
    }

    public final Runnable S0() {
        while (true) {
            Runnable runnable = (Runnable) this.g.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.h) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.g.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean T0() {
        synchronized (this.h) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
            if (atomicIntegerFieldUpdater.get(this) >= this.e) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // defpackage.jg5
    public final no5 t0(long j, Runnable runnable, vt4 vt4Var) {
        return this.c.t0(j, runnable, vt4Var);
    }

    @Override // defpackage.xt4
    public final String toString() {
        String str = this.f;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append(".limitedParallelism(");
        return qt4.p(sb, this.e, ')');
    }
}
