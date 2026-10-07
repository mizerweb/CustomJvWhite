package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e19 implements z09 {
    public final /* synthetic */ rq a;
    public final /* synthetic */ f19 b;
    public final /* synthetic */ i19 c;

    public e19(rq rqVar, f19 f19Var, i19 i19Var) {
        this.a = rqVar;
        this.b = f19Var;
        this.c = i19Var;
    }

    @Override // defpackage.z09
    public final void l(g19 g19Var, m09 m09Var) {
        if (m09Var.a().compareTo(n09.a) <= 0) {
            gm0.x("LifecycleOnOffsetChangedListener", "handle ON_DESTROY state", null);
            this.a.f(this.b);
            this.c.f(this);
        }
    }
}
