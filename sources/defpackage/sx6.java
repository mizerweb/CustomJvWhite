package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sx6 implements aw8 {
    public static final sx6 a = new sx6();
    public static final thd b = new thd("kotlin.Float", qhd.i);

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        u76Var.w(((Number) obj).floatValue());
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        return Float.valueOf(r55Var.p());
    }

    @Override // defpackage.aw8
    public final fif d() {
        return b;
    }
}
