package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class ja4 {
    public final Executor a;
    public final xt4 b;
    public final Executor c;
    public final lhb d;
    public final oc9 e;
    public final cy5 f;
    public final t3a g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;
    public final khb m;

    public ja4(ga4 ga4Var) {
        ExecutorService executorServiceNewFixedThreadPool = (ExecutorService) ga4Var.b;
        if (executorServiceNewFixedThreadPool == null) {
            executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ra4(false));
        }
        this.a = executorServiceNewFixedThreadPool;
        this.b = ((ExecutorService) ga4Var.b) != null ? ch3.m(executorServiceNewFixedThreadPool) : ao5.b;
        ExecutorService executorServiceNewFixedThreadPool2 = (ExecutorService) ga4Var.c;
        if (executorServiceNewFixedThreadPool2 == null) {
            executorServiceNewFixedThreadPool2 = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ra4(true));
        }
        this.c = executorServiceNewFixedThreadPool2;
        this.d = new lhb(24);
        oc9 oc9Var = (lte) ga4Var.d;
        this.e = oc9Var == null ? sf5.A : oc9Var;
        this.f = cy5.h;
        this.g = new t3a(6);
        this.h = 4;
        this.i = Integer.MAX_VALUE;
        this.k = ga4Var.a;
        this.j = 8;
        this.l = true;
        this.m = new khb(15);
    }
}
