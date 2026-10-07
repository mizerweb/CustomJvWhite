package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class q3 extends q0 {
    public final oof h;
    public final jk8 i;

    public q3(mjd mjdVar, oof oofVar, jk8 jk8Var) {
        HashMap map = oofVar.f;
        this.h = oofVar;
        this.i = jk8Var;
        qe7.v();
        this.a = map;
        qe7.v();
        jk8Var.h(oofVar);
        qe7.v();
        mjdVar.b(new p3(0, this), oofVar);
    }

    @Override // defpackage.q0, defpackage.t25
    public final boolean close() {
        if (!super.close()) {
            return false;
        }
        if (g()) {
            return true;
        }
        jk8 jk8Var = this.i;
        oof oofVar = this.h;
        jk8Var.f(oofVar);
        oofVar.e();
        return true;
    }

    public void n(Object obj, int i, es0 es0Var) {
        boolean zA = lq0.a(i);
        if (k(obj, zA, es0Var.f) && zA) {
            this.i.i(this.h);
        }
    }
}
