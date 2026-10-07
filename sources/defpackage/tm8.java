package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class tm8 extends gp8 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(tm8.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;
    public final fz7 h;

    public tm8(fz7 fz7Var) {
        this.h = fz7Var;
    }

    @Override // defpackage.gp8
    public final boolean o() {
        return true;
    }

    @Override // defpackage.gp8
    public final void p(Throwable th) {
        if (i.compareAndSet(this, 0, 1)) {
            this.h.invoke(th);
        }
    }
}
