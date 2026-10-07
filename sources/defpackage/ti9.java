package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ti9 implements aw8 {
    public static final ti9 a = new ti9();
    public static final thd b = new thd("kotlin.Long", qhd.j);

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        u76Var.p(((Number) obj).longValue());
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        return Long.valueOf(r55Var.m());
    }

    @Override // defpackage.aw8
    public final fif d() {
        return b;
    }
}
