package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fw5 implements aw8 {
    public static final fw5 a = new fw5();
    public static final thd b = yab.c("DurationAsMs", qhd.j);

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        u76Var.p(ew5.g(((ew5) obj).a));
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        ghb ghbVar = ew5.b;
        return new ew5(qe7.P(r55Var.m(), lw5.MILLISECONDS));
    }

    @Override // defpackage.aw8
    public final fif d() {
        return b;
    }
}
