package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class am7 {
    public final ny8 a;

    public am7(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final Object a(mdh mdhVar) {
        ek2 ek2Var = new ek2(1, p90.B(mdhVar));
        ek2Var.u();
        zb5 zb5Var = (zb5) this.a.getValue();
        kzi kziVar = new kzi();
        kziVar.b = ek2Var;
        kziVar.a = new AtomicBoolean(false);
        if (((wsc) zb5Var.b.getValue()).c(wsc.l)) {
            no7 no7Var = (no7) zb5Var.a.getValue();
            i1m i1mVar = new i1m(kziVar);
            dmk dmkVar = no7Var.a;
            dmkVar.getClass();
            dc5 dc5Var = new dc5();
            dc5Var.a = true;
            dc5Var.c = nv8.b;
            dc5Var.b = 2414;
            kam kamVarB = dmkVar.b(0, dc5Var.a());
            kamVarB.b(new mo7(i1mVar));
            kamVarB.k(new mo7(i1mVar));
        } else {
            gm0.n(zb5Var.d, "start: no permissions");
            kziVar.w();
        }
        return ek2Var.s();
    }
}
