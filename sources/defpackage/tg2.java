package defpackage;

import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tg2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yg2 b;

    public /* synthetic */ tg2(yg2 yg2Var, tw5 tw5Var) {
        this.a = 1;
        this.b = yg2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        yg2 yg2Var = this.b;
        switch (i) {
            case 0:
                Iterator it = yg2Var.k.iterator();
                while (it.hasNext()) {
                    yg2Var.a(((ff2) it.next()).a());
                }
                return;
            case 1:
                ww3.X1(yg2Var.k).isEmpty();
                return;
            default:
                synchronized (yg2Var.d) {
                    try {
                        ScheduledFuture scheduledFuture = yg2Var.e;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        tvj.a("CameraPresencePrvdr", "Starting new refresh-with-retries sequence.");
                        yg2Var.d(3, yg2Var.k);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public /* synthetic */ tg2(yg2 yg2Var, int i) {
        this.a = i;
        this.b = yg2Var;
    }
}
