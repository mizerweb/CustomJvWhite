package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class su8 implements aw8 {
    public static final su8 a = new su8();
    public static final hif b = yab.m("kotlinx.serialization.json.JsonPrimitive", phd.h, new fif[0]);

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        pu8 pu8Var = (pu8) obj;
        qe7.g(u76Var);
        if (pu8Var instanceof zt8) {
            u76Var.t(au8.a, zt8.INSTANCE);
        } else {
            u76Var.t(wt8.a, (vt8) pu8Var);
        }
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        jt8 jt8VarF = qe7.i(r55Var).f();
        if (jt8VarF instanceof pu8) {
            return (pu8) jt8VarF;
        }
        throw xd2.e("Unexpected JSON element, expected JsonPrimitive, had " + zfe.a(jt8VarF.getClass()), jt8VarF.toString(), -1);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return b;
    }
}
