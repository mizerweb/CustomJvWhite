package defpackage;

import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
public final class oxe extends Thread {
    public final /* synthetic */ int a = 0;

    public /* synthetic */ oxe(Runnable runnable, String str) {
        super(runnable, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        switch (this.a) {
            case 1:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
            default:
                super.run();
                return;
        }
    }

    public /* synthetic */ oxe(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
