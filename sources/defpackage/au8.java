package defpackage;

import kotlinx.serialization.json.internal.JsonDecodingException;

/* JADX INFO: loaded from: classes2.dex */
public final class au8 implements aw8 {
    public static final au8 a = new au8();
    public static final hif b = yab.m("kotlinx.serialization.json.JsonNull", lif.f, new fif[0]);

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        qe7.g(u76Var);
        u76Var.s();
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        qe7.i(r55Var);
        if (r55Var.A()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        return zt8.INSTANCE;
    }

    @Override // defpackage.aw8
    public final fif d() {
        return b;
    }
}
