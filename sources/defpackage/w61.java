package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class w61 implements aw8 {
    public static final w61 a = new w61();
    public static final thd b = new thd("kotlin.Byte", qhd.f);

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        u76Var.f(((Number) obj).byteValue());
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        return Byte.valueOf(r55Var.D());
    }

    @Override // defpackage.aw8
    public final fif d() {
        return b;
    }
}
