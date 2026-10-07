package defpackage;

import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
public final class nle extends Thread {
    public final int a;

    public nle(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
