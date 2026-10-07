package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xfj extends lel {
    public final /* synthetic */ yfj a;

    public xfj(yfj yfjVar) {
        this.a = yfjVar;
    }

    @Override // defpackage.lel
    public final void a() {
        ((af7) this.a.c).invoke();
    }

    @Override // defpackage.lel
    public final void b() {
        gm0.n((String) this.a.d, "onAuthenticationFailed");
    }

    @Override // defpackage.lel
    public final void c(bx0 bx0Var) {
        yfj yfjVar = this.a;
        gm0.n((String) yfjVar.d, "onAuthenticationSuccess");
        ((cf7) yfjVar.b).invoke(bx0Var.a);
    }
}
