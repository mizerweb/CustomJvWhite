package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: loaded from: classes2.dex */
public final class tk8 extends AbstractOwnableSynchronizer implements Runnable {
    public final uk8 a;

    public tk8(uk8 uk8Var) {
        this.a = uk8Var;
    }

    public static void a(tk8 tk8Var, Thread thread) {
        tk8Var.setExclusiveOwnerThread(thread);
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.a.toString();
    }
}
