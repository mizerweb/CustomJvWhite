package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
public final class ws7 implements Runnable, ko5 {
    public final Handler a;
    public final Runnable b;

    public ws7(Handler handler, Runnable runnable) {
        this.a = handler;
        this.b = runnable;
    }

    @Override // defpackage.ko5
    public final void dispose() {
        this.a.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
        } catch (Throwable th) {
            tre.s0(th);
        }
    }
}
