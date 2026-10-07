package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jt2 implements aw8 {
    public static final jt2 a = new jt2();
    public static final thd b = new thd("kotlin.Char", qhd.g);

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        u76Var.x(((Character) obj).charValue());
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        return Character.valueOf(r55Var.t());
    }

    @Override // defpackage.aw8
    public final fif d() {
        return b;
    }
}
