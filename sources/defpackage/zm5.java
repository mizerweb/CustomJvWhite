package defpackage;

import com.facebook.imagepipeline.producers.DiskCacheDecision$DiskCacheDecisionNoDiskCacheChosenException;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zm5 extends sg5 {
    public final es0 c;
    public final oah d;
    public final j85 e;

    public zm5(lq0 lq0Var, es0 es0Var, oah oahVar, j85 j85Var) {
        super(lq0Var);
        this.c = es0Var;
        this.d = oahVar;
        this.e = j85Var;
    }

    @Override // defpackage.lq0
    public final void h(int i, Object obj) {
        p76 p76Var = (p76) obj;
        lq0 lq0Var = this.b;
        es0 es0Var = this.c;
        pjd pjdVar = es0Var.c;
        pjdVar.a(es0Var, "DiskCacheWriteProducer");
        if (!lq0.b(i) && p76Var != null && (i & 10) == 0) {
            p76Var.Y();
            if (p76Var.b != i68.c) {
                v78 v78Var = es0Var.a;
                j85 j85Var = this.e;
                j85Var.getClass();
                l6g l6gVarO = j85Var.o(v78Var.b);
                cn5 cn5Var = (cn5) this.d.get();
                w41 w41VarM = qyj.m(v78Var, cn5Var.c(), cn5Var.b(), cn5Var.a());
                if (w41VarM == null) {
                    pjdVar.b(es0Var, "DiskCacheWriteProducer", new DiskCacheDecision$DiskCacheDecisionNoDiskCacheChosenException("Got no disk cache for CacheChoice: " + Integer.valueOf(v78Var.a.ordinal()).toString()), null);
                    lq0Var.g(i, p76Var);
                    return;
                }
                Executor executor = w41VarM.e;
                pgg pggVar = w41VarM.g;
                qe7.v();
                if (p76.P(p76Var)) {
                    synchronized (pggVar) {
                        oc9.i(Boolean.valueOf(p76.P(p76Var)));
                        p76.g((p76) ((HashMap) pggVar.a).put(l6gVarO, p76.b(p76Var)));
                        pggVar.t();
                    }
                    p76 p76VarB = p76.b(p76Var);
                    try {
                        executor.execute(new s41(w41VarM, l6gVarO, p76VarB, 0));
                    } catch (Exception e) {
                        pj6.k(e, "Failed to schedule disk-cache write for %s", l6gVarO.a);
                        pggVar.w(l6gVarO, p76Var);
                        p76.g(p76VarB);
                    }
                } else {
                    ore.k("Check failed.");
                }
                pjdVar.d(es0Var, "DiskCacheWriteProducer", null);
                lq0Var.g(i, p76Var);
                return;
            }
        }
        pjdVar.d(es0Var, "DiskCacheWriteProducer", null);
        lq0Var.g(i, p76Var);
    }
}
