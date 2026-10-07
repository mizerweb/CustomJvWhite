package defpackage;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes2.dex */
public final class jpb implements aw8 {
    public static final jpb a = new jpb();
    public static final thd b = yab.c("NumberAsString", phd.h);

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        u76Var.C((String) obj);
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        jt8 jt8VarF = ((gt8) r55Var).f();
        if (jt8VarF instanceof pu8) {
            return ((pu8) jt8VarF).a();
        }
        throw new SerializationException("Expected a JSON primitive");
    }

    @Override // defpackage.aw8
    public final fif d() {
        return b;
    }
}
