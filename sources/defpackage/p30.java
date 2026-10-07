package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class p30 extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                ReentrantLock reentrantLock = s30.h;
                reentrantLock.lock();
                try {
                    s30 s30VarK = e9i.k();
                    if (s30VarK == s30.l) {
                        s30.l = null;
                        reentrantLock.unlock();
                        return;
                    } else {
                        reentrantLock.unlock();
                        if (s30VarK != null) {
                            s30VarK.k();
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
        }
    }
}
