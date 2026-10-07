package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ij8 implements aw8 {
    public static final ij8 a = new ij8();
    public static final thd b = new thd("kotlin.Int", phd.g);

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        u76Var.A(((Number) obj).intValue());
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        return Integer.valueOf(r55Var.i());
    }

    @Override // defpackage.aw8
    public final fif d() {
        return b;
    }
}
