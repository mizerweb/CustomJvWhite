package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dzd implements oj7 {
    public static final dzd a;
    private static final fif descriptor;

    static {
        dzd dzdVar = new dzd();
        a = dzdVar;
        hg8 hg8Var = new hg8("one.me.sdk.push.PushOptions", dzdVar);
        hg8Var.k("options", true);
        descriptor = hg8Var;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        long j = ((fzd) obj).a;
        u76 u76VarG = u76Var.g(descriptor);
        if (u76VarG == null) {
            return;
        }
        u76VarG.p(j);
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        return new aw8[]{ti9.a};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        return new fzd(r55Var.k(descriptor).m());
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
