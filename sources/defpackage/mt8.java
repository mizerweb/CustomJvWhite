package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mt8 implements aw8 {
    public static final mt8 a = new mt8();
    public static final hif b = yab.l("kotlinx.serialization.json.JsonElement", sad.f, new fif[0], new x27(16));

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        jt8 jt8Var = (jt8) obj;
        qe7.g(u76Var);
        if (jt8Var instanceof pu8) {
            u76Var.t(su8.a, jt8Var);
            return;
        }
        if (jt8Var instanceof cu8) {
            u76Var.t(fu8.a, jt8Var);
        } else if (jt8Var instanceof ss8) {
            u76Var.t(vs8.a, jt8Var);
        } else {
            ore.o();
        }
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        return qe7.i(r55Var).f();
    }

    @Override // defpackage.aw8
    public final fif d() {
        return b;
    }
}
