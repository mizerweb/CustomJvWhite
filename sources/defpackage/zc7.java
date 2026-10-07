package defpackage;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public final class zc7 extends sr implements ljc {
    public final int c;
    public final int d;
    public final g40 e;
    public final /* synthetic */ bd7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc7(bd7 bd7Var, int i, int i2, g40 g40Var) {
        super(4);
        this.f = bd7Var;
        this.c = i;
        this.d = i2;
        this.e = g40Var;
    }

    @Override // defpackage.ljc
    public final void d(Object obj) {
        int i;
        Object obj2;
        ad7 ad7Var;
        AutoCloseable autoCloseableR0;
        boolean zIsTerminated;
        pjc pjcVar = (pjc) (rjc.a(obj) ? obj : null);
        if (pjcVar != null) {
            if (pjcVar instanceof uzf) {
                autoCloseableR0 = ((uzf) pjcVar).R0();
            } else {
                uzf uzfVar = (uzf) pjcVar.W(zfe.a(uzf.class));
                autoCloseableR0 = uzfVar != null ? uzfVar.R0() : new uzf(pjcVar, new xtj(pjcVar));
            }
            if (!((i64) this.b).Q(new rjc(autoCloseableR0))) {
                if (autoCloseableR0 instanceof AutoCloseable) {
                    autoCloseableR0.close();
                } else {
                    if (!(autoCloseableR0 instanceof ExecutorService)) {
                        ore.a();
                        return;
                    }
                    ExecutorService executorService = (ExecutorService) autoCloseableR0;
                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z = false;
                        while (!zIsTerminated) {
                            try {
                                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z) {
                                    executorService.shutdownNow();
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        } else {
            i64 i64Var = (i64) this.b;
            if (rjc.a(obj)) {
                i = 1;
            } else {
                i = obj == null ? 2 : ((tjc) obj).a;
            }
            i64Var.Q(new rjc(new tjc(i)));
        }
        g40 g40Var = this.e;
        g40Var.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g40.b;
        if (atomicIntegerFieldUpdater.decrementAndGet(g40Var) == 0) {
            Iterator it = this.f.h.iterator();
            if (it.hasNext()) {
                throw qt4.h(it);
            }
            bd7 bd7Var = this.f;
            ad7 ad7Var2 = ad7.d;
            g40 g40Var2 = bd7Var.g;
            g40Var2.getClass();
            if (atomicIntegerFieldUpdater.decrementAndGet(g40Var2) != 0) {
                return;
            }
            i40 i40Var = bd7Var.f;
            do {
                obj2 = i40Var.a;
                ad7 ad7Var3 = (ad7) obj2;
                int iOrdinal = ad7Var3.ordinal();
                if (iOrdinal == 0) {
                    ad7Var = ad7.c;
                } else {
                    if (iOrdinal != 1) {
                        throw new IllegalStateException("Unexpected frame state for " + bd7Var + "! State is " + ad7Var3 + ' ');
                    }
                    ad7Var = ad7Var2;
                }
            } while (!i40Var.a(obj2, ad7Var));
            Iterator it2 = bd7Var.h.iterator();
            if (it2.hasNext()) {
                throw qt4.h(it2);
            }
            if (ad7Var == ad7Var2) {
                Iterator it3 = bd7Var.h.iterator();
                if (it3.hasNext()) {
                    throw qt4.h(it3);
                }
            }
        }
    }
}
