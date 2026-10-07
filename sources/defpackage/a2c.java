package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class a2c {
    public static final /* synthetic */ zv8[] t = {new dwd(a2c.class, "ioExecutor", "getIoExecutor()Ljava/util/concurrent/ExecutorService;", 0), zo5.f(zfe.a, a2c.class, "computationExecutor", "getComputationExecutor()Ljava/util/concurrent/ExecutorService;", 0), new dwd(a2c.class, "singleExecutor", "getSingleExecutor()Ljava/util/concurrent/ExecutorService;", 0), new dwd(a2c.class, "singleLowPriorityExecutor", "getSingleLowPriorityExecutor()Ljava/util/concurrent/ExecutorService;", 0), new dwd(a2c.class, "network", "getNetwork()Ljava/util/concurrent/ExecutorService;", 0)};
    public final z1c a;
    public volatile xh b;
    public final Thread.UncaughtExceptionHandler c;
    public final f5h d;
    public final t3a e;
    public final c f;
    public final ConcurrentHashMap g;
    public final ifh h;
    public final ifh i;
    public final ifh j;
    public final od6 k;
    public final od6 l;
    public final od6 m;
    public final od6 n;
    public final od6 o;
    public final ifh p;
    public final ifh q;
    public final ifh r;
    public final ifh s;

    static {
        ghb ghbVar = ew5.b;
        lw5 lw5Var = lw5.SECONDS;
        long jO = qe7.O(Integer.MAX_VALUE, lw5Var);
        long jO2 = qe7.O(Integer.MAX_VALUE, lw5Var);
        ik4 ik4Var = new ik4(23);
        ik4 ik4Var2 = new ik4(23);
        yd6.n0.getClass();
        new z1c(false, jO, jO2, ik4Var, ik4Var2, cy5.e, 6);
    }

    public a2c(z1c z1cVar, j94 j94Var, t3a t3aVar, c cVar, final od6 od6Var, od6 od6Var2, final od6 od6Var3) {
        xh xhVar = xh.a;
        f5h f5hVar = f5h.a;
        final od6 od6Var4 = new od6("single", 1, 1, 0L, false, true, 0, false, true, 72);
        od6 od6Var5 = new od6("single-low", 1, 1, 0L, false, true, 1, false, true, 8);
        this.a = z1cVar;
        this.b = xhVar;
        this.c = j94Var;
        this.d = f5hVar;
        this.e = t3aVar;
        this.f = cVar;
        this.g = new ConcurrentHashMap();
        final int i = 1;
        this.h = new ifh(new y1c(this, 1));
        final int i2 = 2;
        this.i = new ifh(new y1c(this, 2));
        final int i3 = 3;
        this.j = new ifh(new y1c(this, 3));
        this.k = od6Var;
        this.l = od6Var3;
        this.m = od6Var4;
        this.n = od6Var5;
        this.o = od6Var2;
        this.p = new ifh(new af7(this) { // from class: w1c
            public final /* synthetic */ a2c b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                od6 od6Var6 = od6Var;
                a2c a2cVar = this.b;
                switch (i4) {
                    case 0:
                        return a2cVar.h(a2cVar.a(), od6Var6.a);
                    case 1:
                        return a2cVar.h(a2cVar.d(), od6Var6.a);
                    case 2:
                        v1c v1cVarB = a2cVar.b();
                        od6 od6VarA = od6.a(od6Var6, "OneMeScheduler", 510);
                        v1cVarB.getClass();
                        return a2cVar.j((ScheduledExecutorService) ScheduledExecutorService.class.cast(new vu6(od6VarA.b, v1cVarB.a.a(od6VarA.a, Integer.valueOf(od6VarA.g), od6VarA.h, od6VarA.i))), "OneMeScheduler");
                    default:
                        return a2cVar.h(a2cVar.c(), od6Var6.a);
                }
            }
        });
        final int i4 = 0;
        this.q = new ifh(new af7(this) { // from class: w1c
            public final /* synthetic */ a2c b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                od6 od6Var6 = od6Var3;
                a2c a2cVar = this.b;
                switch (i5) {
                    case 0:
                        return a2cVar.h(a2cVar.a(), od6Var6.a);
                    case 1:
                        return a2cVar.h(a2cVar.d(), od6Var6.a);
                    case 2:
                        v1c v1cVarB = a2cVar.b();
                        od6 od6VarA = od6.a(od6Var6, "OneMeScheduler", 510);
                        v1cVarB.getClass();
                        return a2cVar.j((ScheduledExecutorService) ScheduledExecutorService.class.cast(new vu6(od6VarA.b, v1cVarB.a.a(od6VarA.a, Integer.valueOf(od6VarA.g), od6VarA.h, od6VarA.i))), "OneMeScheduler");
                    default:
                        return a2cVar.h(a2cVar.c(), od6Var6.a);
                }
            }
        });
        this.r = new ifh(new af7(this) { // from class: w1c
            public final /* synthetic */ a2c b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i;
                od6 od6Var6 = od6Var4;
                a2c a2cVar = this.b;
                switch (i5) {
                    case 0:
                        return a2cVar.h(a2cVar.a(), od6Var6.a);
                    case 1:
                        return a2cVar.h(a2cVar.d(), od6Var6.a);
                    case 2:
                        v1c v1cVarB = a2cVar.b();
                        od6 od6VarA = od6.a(od6Var6, "OneMeScheduler", 510);
                        v1cVarB.getClass();
                        return a2cVar.j((ScheduledExecutorService) ScheduledExecutorService.class.cast(new vu6(od6VarA.b, v1cVarB.a.a(od6VarA.a, Integer.valueOf(od6VarA.g), od6VarA.h, od6VarA.i))), "OneMeScheduler");
                    default:
                        return a2cVar.h(a2cVar.c(), od6Var6.a);
                }
            }
        });
        this.s = new ifh(new af7(this) { // from class: w1c
            public final /* synthetic */ a2c b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i2;
                od6 od6Var6 = od6Var4;
                a2c a2cVar = this.b;
                switch (i5) {
                    case 0:
                        return a2cVar.h(a2cVar.a(), od6Var6.a);
                    case 1:
                        return a2cVar.h(a2cVar.d(), od6Var6.a);
                    case 2:
                        v1c v1cVarB = a2cVar.b();
                        od6 od6VarA = od6.a(od6Var6, "OneMeScheduler", 510);
                        v1cVarB.getClass();
                        return a2cVar.j((ScheduledExecutorService) ScheduledExecutorService.class.cast(new vu6(od6VarA.b, v1cVarB.a.a(od6VarA.a, Integer.valueOf(od6VarA.g), od6VarA.h, od6VarA.i))), "OneMeScheduler");
                    default:
                        return a2cVar.h(a2cVar.c(), od6Var6.a);
                }
            }
        });
    }

    public static ExecutorService f(a2c a2cVar, String str, int i, int i2, boolean z, boolean z2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        return a2cVar.i(a2cVar.b().a(new od6(str, i, i2, (i4 & 64) != 0 ? 60000L : 5000L, true, false, (i4 & 32) != 0 ? 5 : i3, z, z2, 32)), str);
    }

    public static ScheduledExecutorService g(a2c a2cVar, String str, int i, int i2, int i3) {
        int i4 = (i3 & 4) != 0 ? i : i2;
        a2cVar.getClass();
        return a2cVar.h(f(a2cVar, str, i, i4, false, true, 5, 64), str);
    }

    public final ExecutorService a() {
        zv8 zv8Var = t[1];
        return e(this.l);
    }

    public final v1c b() {
        return (v1c) this.i.getValue();
    }

    public final ExecutorService c() {
        zv8 zv8Var = t[0];
        return e(this.k);
    }

    public final ExecutorService d() {
        zv8 zv8Var = t[2];
        return e(this.m);
    }

    public final ExecutorService e(od6 od6Var) {
        return (ExecutorService) this.g.computeIfAbsent(od6Var, new mm(10, new ol(this, 10, od6Var)));
    }

    public final ScheduledExecutorService h(ExecutorService executorService, String str) {
        boolean z = executorService instanceof ce6;
        c cVar = this.f;
        ifh ifhVar = this.s;
        return z ? new ah5(executorService, ifhVar, cVar) : j(new ah5(executorService, ifhVar, cVar), str);
    }

    public final ExecutorService i(wu6 wu6Var, String str) {
        z1c z1cVar = this.a;
        if (!z1cVar.a) {
            return wu6Var;
        }
        a85 a85Var = new a85();
        a85Var.c = this;
        a85Var.a = z1cVar.e;
        a85Var.b = z1cVar.d;
        return new ce6(wu6Var, a85Var, z1cVar.f, z1cVar.g, z1cVar.j, z1cVar.b, z1cVar.c, (lcj) this.j.getValue(), new rh5(str, 1));
    }

    public final ScheduledExecutorService j(ScheduledExecutorService scheduledExecutorService, String str) {
        z1c z1cVar = this.a;
        if (z1cVar.a && !(scheduledExecutorService instanceof v1f)) {
            return new v1f(scheduledExecutorService, new u75(this), z1cVar.f, z1cVar.g, z1cVar.j, z1cVar.b, z1cVar.c, (lcj) this.j.getValue(), new qo1(str, 11));
        }
        return scheduledExecutorService;
    }
}
