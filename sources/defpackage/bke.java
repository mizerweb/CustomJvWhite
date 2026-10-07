package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bke implements z09 {
    public final /* synthetic */ m09 a;
    public final /* synthetic */ wfe b;
    public final /* synthetic */ gu4 c;
    public final /* synthetic */ m09 d;
    public final /* synthetic */ ek2 e;
    public final /* synthetic */ l9b f;
    public final /* synthetic */ qf7 g;

    public bke(m09 m09Var, wfe wfeVar, gu4 gu4Var, m09 m09Var2, ek2 ek2Var, l9b l9bVar, qf7 qf7Var) {
        this.a = m09Var;
        this.b = wfeVar;
        this.c = gu4Var;
        this.d = m09Var2;
        this.e = ek2Var;
        this.f = l9bVar;
        this.g = qf7Var;
    }

    @Override // defpackage.z09
    public final void l(g19 g19Var, m09 m09Var) {
        m09 m09Var2 = this.a;
        wfe wfeVar = this.b;
        lq4 lq4Var = null;
        if (m09Var == m09Var2) {
            wfeVar.a = yab.i0(this.c, null, 0, new l83(this.f, this.g, lq4Var, 10), 3);
            return;
        }
        if (m09Var == this.d) {
            vo8 vo8Var = (vo8) wfeVar.a;
            if (vo8Var != null) {
                vo8Var.b(null);
            }
            wfeVar.a = null;
        }
        if (m09Var == m09.ON_DESTROY) {
            this.e.resumeWith(sbi.a);
        }
    }
}
