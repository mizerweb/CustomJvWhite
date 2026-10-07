package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public abstract class upl {
    public static final Object a(onf onfVar, int i, nq4 nq4Var) {
        sbi sbiVar = sbi.a;
        ek2 ek2Var = new ek2(1, p90.B(nq4Var));
        ek2Var.u();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (((rnf) onfVar).q == i && atomicBoolean.compareAndSet(false, true)) {
            ek2Var.resumeWith(sbiVar);
        } else {
            pnf pnfVar = new pnf(i, atomicBoolean, onfVar, ek2Var);
            ek2Var.w(new w62(onfVar, 11, pnfVar));
            ((rnf) onfVar).c(pnfVar);
        }
        Object objS = ek2Var.s();
        return objS == hu4.a ? objS : sbiVar;
    }

    public static final Object b(ljh ljhVar, nq4 nq4Var) {
        ek2 ek2Var = new ek2(1, p90.B(nq4Var));
        ek2Var.u();
        ek2Var.w(new ol0(12, ljhVar));
        ljhVar.b(new ju(ek2Var), null);
        ljhVar.b(null, new b1k(11, ek2Var));
        return ek2Var.s();
    }
}
