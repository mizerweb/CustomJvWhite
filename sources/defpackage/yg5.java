package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yg5 implements ch5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bh5 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ yg5(bh5 bh5Var, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = bh5Var;
        this.c = runnable;
        this.d = j;
        this.e = j2;
        this.f = timeUnit;
    }

    @Override // defpackage.ch5
    public final ScheduledFuture b(rj5 rj5Var) {
        int i = this.a;
        Runnable runnable = this.c;
        bh5 bh5Var = this.b;
        switch (i) {
            case 0:
                return bh5Var.b.scheduleAtFixedRate(new zg5(bh5Var, runnable, rj5Var, 0), this.d, this.e, this.f);
            default:
                return bh5Var.b.scheduleWithFixedDelay(new zg5(bh5Var, runnable, rj5Var, 2), this.d, this.e, this.f);
        }
    }
}
