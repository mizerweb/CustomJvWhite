package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zgd implements eqb {
    public final nf2 a;
    public final g8b b;
    public fhd c;
    public final hhd d;
    public lg7 e;
    public boolean f = false;

    public zgd(nf2 nf2Var, g8b g8bVar, hhd hhdVar) {
        this.a = nf2Var;
        this.b = g8bVar;
        this.d = hhdVar;
        synchronized (this) {
            this.c = (fhd) g8bVar.d();
        }
    }

    @Override // defpackage.eqb
    public final void a(Object obj) {
        of2 of2Var = (of2) obj;
        of2 of2Var2 = of2.e;
        fhd fhdVar = fhd.a;
        if (of2Var == of2Var2 || of2Var == of2.c || of2Var == of2.b || of2Var == of2.a) {
            b(fhdVar);
            if (this.f) {
                this.f = false;
                lg7 lg7Var = this.e;
                if (lg7Var != null) {
                    lg7Var.cancel(false);
                    this.e = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((of2Var == of2.f || of2Var == of2.g || of2Var == of2.d) && !this.f) {
            nf2 nf2Var = this.a;
            b(fhdVar);
            ArrayList arrayList = new ArrayList();
            r72 r72Var = new r72();
            r72Var.c = new gne();
            u72 u72Var = new u72(r72Var);
            r72Var.b = u72Var;
            r72Var.a = qt4.class;
            try {
                ygd ygdVar = new ygd(r72Var, nf2Var);
                arrayList.add(ygdVar);
                nf2Var.o(zjl.a(), ygdVar);
                r72Var.a = "waitForCaptureResult";
            } catch (Exception e) {
                u72Var.c(e);
            }
            bp2 bp2VarJ = o9b.j(lg7.c(u72Var), new xgd(this), zjl.a());
            xgd xgdVar = new xgd(this);
            bp2 bp2VarJ2 = o9b.j(bp2VarJ, new due(xgdVar), zjl.a());
            this.e = bp2VarJ2;
            o9b.a(bp2VarJ2, new xtj(this, arrayList, nf2Var), zjl.a());
            this.f = true;
        }
    }

    public final void b(fhd fhdVar) {
        synchronized (this) {
            try {
                if (this.c.equals(fhdVar)) {
                    return;
                }
                this.c = fhdVar;
                tvj.a("StreamStateObserver", "Update Preview stream state to " + fhdVar);
                this.b.i(fhdVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.eqb
    public final void onError(Throwable th) {
        lg7 lg7Var = this.e;
        if (lg7Var != null) {
            lg7Var.cancel(false);
            this.e = null;
        }
        b(fhd.a);
    }
}
