package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hp5 implements aw8 {
    public static final hp5 a = new hp5();
    public static final thd b = new thd("kotlin.Double", qhd.h);

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        u76Var.d(((Number) obj).doubleValue());
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        return Double.valueOf(r55Var.r());
    }

    @Override // defpackage.aw8
    public final fif d() {
        return b;
    }
}
