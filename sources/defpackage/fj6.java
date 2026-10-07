package defpackage;

import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fj6 implements pwi {
    public final /* synthetic */ int a;
    public final /* synthetic */ hj6 b;

    public /* synthetic */ fj6(hj6 hj6Var, int i) {
        this.a = i;
        this.b = hj6Var;
    }

    @Override // defpackage.pwi
    public final void run() {
        int i = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        int i2 = 8;
        hj6 hj6Var = this.b;
        switch (i) {
            case 0:
                hj6Var.v = false;
                break;
            case 1:
                if (hj6Var.s) {
                    hj6Var.v = true;
                }
                if (hj6Var.k.isEmpty() && hj6Var.q == null) {
                    md5 md5Var = hj6Var.f;
                    md5Var.getClass();
                    md5Var.a();
                    g55.a();
                    ScheduledFuture scheduledFuture = hj6Var.t;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    hj6Var.t = null;
                } else {
                    hj6Var.p = true;
                    ScheduledFuture scheduledFuture2 = hj6Var.t;
                    if (scheduledFuture2 != null) {
                        scheduledFuture2.cancel(false);
                    }
                    hj6Var.t = null;
                    hj6Var.t = hj6Var.l.schedule(new k36(i2, hj6Var), hj6.z, timeUnit);
                }
                break;
            case 2:
                try {
                    hj6Var.F();
                } catch (RuntimeException e) {
                    hj6Var.w = e;
                    lvb.l0("ExtTexMgr", "Failed to remove texture frames", e);
                    CountDownLatch countDownLatch = hj6Var.u;
                    if (countDownLatch != null) {
                        countDownLatch.countDown();
                        return;
                    }
                    return;
                }
                break;
            case 3:
                g55.a();
                if (hj6Var.s) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = hj6Var.k;
                    oc7 oc7Var = hj6Var.r;
                    oc7Var.getClass();
                    concurrentLinkedQueue.add(oc7Var);
                }
                if (!hj6Var.v) {
                    if (hj6Var.p) {
                        ScheduledFuture scheduledFuture3 = hj6Var.t;
                        if (scheduledFuture3 != null) {
                            scheduledFuture3.cancel(false);
                        }
                        hj6Var.t = null;
                        hj6Var.t = hj6Var.l.schedule(new k36(i2, hj6Var), hj6.z, timeUnit);
                    }
                    hj6Var.o++;
                    hj6Var.E();
                    break;
                } else {
                    hj6Var.i.updateTexImage();
                    hj6Var.k.poll();
                    if (hj6Var.u != null && hj6Var.k.isEmpty()) {
                        hj6Var.u.countDown();
                        break;
                    }
                }
                break;
            case 4:
                hj6Var.q = null;
                if (hj6Var.p && hj6Var.k.isEmpty()) {
                    hj6Var.p = false;
                    md5 md5Var2 = hj6Var.f;
                    md5Var2.getClass();
                    md5Var2.a();
                    g55.a();
                    ScheduledFuture scheduledFuture4 = hj6Var.t;
                    if (scheduledFuture4 != null) {
                        scheduledFuture4.cancel(false);
                    }
                    hj6Var.t = null;
                } else {
                    hj6Var.E();
                }
                break;
            default:
                if (hj6Var.o != hj6Var.k.size()) {
                    int size = hj6Var.k.size();
                    long j = hj6.z;
                    int i3 = hj6Var.o;
                    Locale locale = Locale.US;
                    StringBuilder sbX = zo5.x(size, j, "Forcing EOS after missing ", " frames for ");
                    sbX.append(" ms, with available frame count: ");
                    sbX.append(i3);
                    lvb.G0("ExtTexMgr", sbX.toString());
                    hj6Var.p = false;
                    hj6Var.q = null;
                    hj6Var.v = true;
                    hj6Var.F();
                    hj6Var.k.clear();
                    hj6Var.t();
                    break;
                }
                break;
        }
    }
}
