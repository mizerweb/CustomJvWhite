package defpackage;

import android.os.Build;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class v1c {
    public final rbc a;
    public final t3a b;

    public v1c(rbc rbcVar, t3a t3aVar) {
        this.a = rbcVar;
        this.b = t3aVar;
    }

    public final wu6 a(od6 od6Var) {
        Object obj = this.b.a;
        BlockingQueue h69Var = (Boolean.valueOf(xvc.p).booleanValue() || Build.VERSION.SDK_INT < 35) ? new h69() : new g69();
        int i = od6Var.b;
        int i2 = od6Var.c;
        long j = od6Var.d;
        ThreadFactory threadFactoryA = this.a.a(od6Var.a, Integer.valueOf(od6Var.g), od6Var.h, od6Var.i);
        boolean z = od6Var.e;
        wu6 wu6Var = new wu6(i, i2, j, TimeUnit.MILLISECONDS, h69Var, threadFactoryA);
        if (z && j > 0) {
            wu6Var.allowCoreThreadTimeOut(true);
        }
        wu6Var.setRejectedExecutionHandler(new u1c());
        if (od6Var.f) {
            wu6Var.prestartAllCoreThreads();
        }
        return wu6Var;
    }
}
