package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class k1g implements aw8 {
    public static final k1g a = new k1g();
    public static final thd b = new thd("kotlin.Short", qhd.k);

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        u76Var.u(((Number) obj).shortValue());
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        return Short.valueOf(r55Var.o());
    }

    @Override // defpackage.aw8
    public final fif d() {
        return b;
    }
}
