package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wt8 implements aw8 {
    public static final wt8 a = new wt8();
    public static final thd b = yab.c("kotlinx.serialization.json.JsonLiteral", phd.h);

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        vt8 vt8Var = (vt8) obj;
        String str = vt8Var.c;
        qe7.g(u76Var);
        if (vt8Var.a) {
            u76Var.C(str);
            return;
        }
        fif fifVar = vt8Var.b;
        if (fifVar != null) {
            u76Var.g(fifVar).C(str);
            return;
        }
        Long lC0 = y5h.C0(str);
        if (lC0 != null) {
            u76Var.p(lC0.longValue());
            return;
        }
        cai caiVarB = h0m.b(str);
        if (caiVarB != null) {
            u76Var.g(gai.b).p(caiVarB.a);
            return;
        }
        Double dValueOf = null;
        try {
            if (x5h.z0(str)) {
                dValueOf = Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        if (dValueOf != null) {
            u76Var.d(dValueOf.doubleValue());
            return;
        }
        Boolean boolX1 = r5h.x1(str);
        if (boolX1 != null) {
            u76Var.v(boolX1.booleanValue());
        } else {
            u76Var.C(str);
        }
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        jt8 jt8VarF = qe7.i(r55Var).f();
        if (jt8VarF instanceof vt8) {
            return (vt8) jt8VarF;
        }
        throw xd2.e("Unexpected JSON element, expected JsonLiteral, had " + zfe.a(jt8VarF.getClass()), jt8VarF.toString(), -1);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return b;
    }
}
