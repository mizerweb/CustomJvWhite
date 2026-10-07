package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uqc implements oj7 {
    public static final uqc a;
    private static final fif descriptor;

    static {
        uqc uqcVar = new uqc();
        a = uqcVar;
        hg8 hg8Var = new hg8("ru.ok.tamtam.models.pms.PerfEventsServerConfig.Mode", uqcVar);
        hg8Var.k("code", false);
        descriptor = hg8Var;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        int i = ((wqc) obj).a;
        u76 u76VarG = u76Var.g(descriptor);
        if (u76VarG == null) {
            return;
        }
        u76VarG.A(i);
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        return new aw8[]{ij8.a};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        return new wqc(r55Var.k(descriptor).i());
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
