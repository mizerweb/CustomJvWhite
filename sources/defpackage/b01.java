package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b01 implements aw8 {
    public static final b01 a = new b01();
    public static final thd b = new thd("kotlin.Boolean", phd.f);

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        u76Var.v(((Boolean) obj).booleanValue());
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        return Boolean.valueOf(r55Var.s());
    }

    @Override // defpackage.aw8
    public final fif d() {
        return b;
    }
}
