package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class jz0 extends m0 {
    public final Thread f;
    public final nc6 g;

    public jz0(vt4 vt4Var, Thread thread, nc6 nc6Var) {
        super(vt4Var, true);
        this.f = thread;
        this.g = nc6Var;
    }

    @Override // defpackage.up8
    public final void n(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f;
        if (cqk.d(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
