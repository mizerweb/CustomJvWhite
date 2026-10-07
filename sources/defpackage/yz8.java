package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class yz8 implements wzj {
    public static final /* synthetic */ int e = 0;
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public volatile p3c d = null;

    public yz8(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    @Override // defpackage.wzj
    public final void a(p3c p3cVar) {
        this.d = p3cVar;
    }

    @Override // defpackage.wzj
    public final void b() {
        p3c p3cVar = this.d;
        if (p3cVar != null) {
            p3cVar.r();
        }
    }

    @Override // defpackage.wzj
    public final void c(mjf mjfVar) {
        gm0.m("yz8", "execute task = %s", mjfVar);
        ny8 ny8Var = this.a;
        ny8 ny8Var2 = this.c;
        xz8 xz8Var = new xz8(mjfVar, ny8Var, ny8Var2, 0);
        if (mjfVar.z()) {
            ExecutorService executorServiceO = mjfVar.o((njf) ny8Var2.getValue());
            if (executorServiceO instanceof ThreadPoolExecutor) {
                gm0.y("yz8", "execute task %s with own executor; queue.size=%d", mjfVar, Integer.valueOf(((ThreadPoolExecutor) executorServiceO).getQueue().size()));
            } else {
                gm0.y("yz8", "execute task %s with own executor", mjfVar);
            }
            if (executorServiceO != null) {
                String name = mjfVar.getClass().getName();
                if (executorServiceO.isShutdown() || executorServiceO.isTerminated()) {
                    boolean zIsShutdown = executorServiceO.isShutdown();
                    boolean zIsTerminated = executorServiceO.isTerminated();
                    StringBuilder sbA = zo5.A("WARNING! ", name, " has broken state. isShutdown: ", ", isTerminated: ", zIsShutdown);
                    sbA.append(zIsTerminated);
                    String string = sbA.toString();
                    gm0.V("yz8", string, new wz8(string));
                }
                executorServiceO.execute(xz8Var);
                return;
            }
            String strConcat = "Got null executor for task ".concat(mjfVar.getClass().getName());
            gm0.X("yz8", new wz8(strConcat), strConcat, new Object[0]);
        }
        gm0.n("WorkerService", "normal executor will run " + mjfVar);
        ((a2c) this.b.getValue()).c().execute(xz8Var);
    }

    @Override // defpackage.wzj
    public final void d(mjf mjfVar) {
        e(mjfVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e(mjf mjfVar) {
        okh okhVar = (okh) this.a.getValue();
        btc btcVar = (btc) mjfVar;
        String str = okhVar.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "save task = " + btcVar, null);
            }
        }
        xkh xkhVarB = okhVar.c().b();
        ((Number) ch3.G(xkhVarB.a, false, true, new bad(xkhVarB, 20, new ujh(btcVar.getId(), btcVar.getType(), rkh.WAITING, 0, 0L, 0, btcVar.g(), System.currentTimeMillis())))).longValue();
        b();
        return btcVar.getId();
    }
}
