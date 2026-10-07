package defpackage;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class si2 implements bmi {
    public final w8b a;

    public si2(w8b w8bVar) {
        this.a = w8bVar;
        bh0 bh0Var = wih.T0;
        Class cls = (Class) w8bVar.b(bh0Var, null);
        if (cls != null && !cls.equals(q4h.class)) {
            c.v("Invalid target class configuration for ", this, ": ", cls);
            throw null;
        }
        w8bVar.m(cmi.g1, emi.e);
        w8bVar.m(bh0Var, q4h.class);
        bh0 bh0Var2 = wih.S0;
        if (w8bVar.b(bh0Var2, null) == null) {
            w8bVar.m(bh0Var2, q4h.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    @Override // defpackage.ph6
    public w8b g() {
        return this.a;
    }

    @Override // defpackage.bmi
    public cmi q() {
        return new r4h(dhc.a(this.a));
    }

    public si2() {
        w8b w8bVarE = w8b.e();
        this.a = w8bVarE;
        bh0 bh0Var = wih.T0;
        Class cls = (Class) w8bVarE.b(bh0Var, null);
        if (cls != null && !cls.equals(ri2.class)) {
            c.v("Invalid target class configuration for ", this, ": ", cls);
            throw null;
        }
        w8bVarE.m(bh0Var, ri2.class);
        bh0 bh0Var2 = wih.S0;
        if (w8bVarE.b(bh0Var2, null) == null) {
            w8bVarE.m(bh0Var2, ri2.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }
}
