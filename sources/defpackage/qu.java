package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class qu implements ee6 {
    public static final /* synthetic */ int f = 0;
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;

    public qu(ny8 ny8Var) {
        this.a = ny8Var;
        final int i = 0;
        this.b = new ifh(new af7(this) { // from class: zd7
            public final /* synthetic */ qu b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                qu quVar = this.b;
                switch (i2) {
                    case 0:
                        return ((a2c) ((ny8) quVar.a).getValue()).c();
                    case 1:
                        return ((a2c) ((ny8) quVar.a).getValue()).a();
                    case 2:
                        return ((a2c) ((ny8) quVar.a).getValue()).a();
                    default:
                        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                        return a2c.g((a2c) ((ny8) quVar.a).getValue(), "frsc-sch", iAvailableProcessors, iAvailableProcessors, 32);
                }
            }
        });
        final int i2 = 1;
        this.c = new ifh(new af7(this) { // from class: zd7
            public final /* synthetic */ qu b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                qu quVar = this.b;
                switch (i3) {
                    case 0:
                        return ((a2c) ((ny8) quVar.a).getValue()).c();
                    case 1:
                        return ((a2c) ((ny8) quVar.a).getValue()).a();
                    case 2:
                        return ((a2c) ((ny8) quVar.a).getValue()).a();
                    default:
                        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                        return a2c.g((a2c) ((ny8) quVar.a).getValue(), "frsc-sch", iAvailableProcessors, iAvailableProcessors, 32);
                }
            }
        });
        final int i3 = 2;
        this.d = new ifh(new af7(this) { // from class: zd7
            public final /* synthetic */ qu b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                qu quVar = this.b;
                switch (i4) {
                    case 0:
                        return ((a2c) ((ny8) quVar.a).getValue()).c();
                    case 1:
                        return ((a2c) ((ny8) quVar.a).getValue()).a();
                    case 2:
                        return ((a2c) ((ny8) quVar.a).getValue()).a();
                    default:
                        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                        return a2c.g((a2c) ((ny8) quVar.a).getValue(), "frsc-sch", iAvailableProcessors, iAvailableProcessors, 32);
                }
            }
        });
        final int i4 = 3;
        this.e = new ifh(new af7(this) { // from class: zd7
            public final /* synthetic */ qu b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                qu quVar = this.b;
                switch (i5) {
                    case 0:
                        return ((a2c) ((ny8) quVar.a).getValue()).c();
                    case 1:
                        return ((a2c) ((ny8) quVar.a).getValue()).a();
                    case 2:
                        return ((a2c) ((ny8) quVar.a).getValue()).a();
                    default:
                        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                        return a2c.g((a2c) ((ny8) quVar.a).getValue(), "frsc-sch", iAvailableProcessors, iAvailableProcessors, 32);
                }
            }
        });
    }

    @Override // defpackage.ee6
    public ExecutorService b() {
        return ((a2c) ((ny8) this.a).getValue()).d();
    }

    @Override // defpackage.ee6
    public ExecutorService c() {
        return (ExecutorService) ((ifh) this.b).getValue();
    }

    @Override // defpackage.ee6
    public ScheduledExecutorService f() {
        return (ScheduledExecutorService) ((ifh) this.e).getValue();
    }

    @Override // defpackage.ee6
    public ExecutorService j() {
        return (ExecutorService) ((ifh) this.c).getValue();
    }

    @Override // defpackage.ee6
    public ExecutorService l() {
        return (ExecutorService) ((ifh) this.d).getValue();
    }

    @Override // defpackage.ee6
    public ExecutorService p() {
        return (ExecutorService) ((ifh) this.b).getValue();
    }

    @Override // defpackage.ee6
    public ExecutorService q() {
        return (ExecutorService) ((ifh) this.b).getValue();
    }

    public qu(gue gueVar, ny8 ny8Var, ny8 ny8Var2, xt4 xt4Var, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.d = xt4Var;
        this.c = ny8Var3;
        this.e = qu.class.getName();
        gueVar.c(new pu(1, this));
    }

    public qu(rb8 rb8Var, yt4 yt4Var, pgg pggVar, xhh xhhVar, d2 d2Var) {
        this.a = rb8Var;
        this.b = yt4Var;
        this.c = pggVar;
        this.d = d2Var;
        gm0.n("qu", "init");
        lk9 lk9VarC = ((n0c) xhhVar).c();
        lk9VarC.getClass();
        yab.i0(rb8Var, lvb.x0(lk9VarC, yt4Var), 0, new wyj(this, null, 9), 2);
    }

    public qu(mac macVar, nac nacVar, oac oacVar, pac pacVar, qac qacVar) {
        this.a = macVar;
        this.b = oacVar;
        this.c = nacVar;
        this.d = pacVar;
        this.e = qacVar;
    }
}
