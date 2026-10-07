package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class dh5 extends y3 implements ScheduledFuture {
    public final ScheduledFuture h;

    public dh5(ch5 ch5Var) {
        this.h = ch5Var.b(new rj5(13, this));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.h.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.h.getDelay(timeUnit);
    }

    @Override // defpackage.y3
    public final void h() {
        ScheduledFuture scheduledFuture = this.h;
        Object obj = this.a;
        scheduledFuture.cancel((obj instanceof s3) && ((s3) obj).a);
    }
}
