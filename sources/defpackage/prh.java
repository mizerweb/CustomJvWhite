package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class prh extends sg5 {
    public final es0 c;
    public final int d;
    public final bne e;
    public final /* synthetic */ gb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prh(gb gbVar, lq0 lq0Var, es0 es0Var, int i) {
        super(lq0Var);
        this.f = gbVar;
        this.c = es0Var;
        this.d = i;
        this.e = es0Var.a.h;
    }

    @Override // defpackage.sg5, defpackage.lq0
    public final void f(Throwable th) {
        int i = this.d + 1;
        es0 es0Var = this.c;
        gb gbVar = this.f;
        lq0 lq0Var = this.b;
        if (gbVar.c(i, lq0Var, es0Var)) {
            return;
        }
        lq0Var.e(th);
    }

    @Override // defpackage.lq0
    public final void h(int i, Object obj) {
        p76 p76Var = (p76) obj;
        lq0 lq0Var = this.b;
        if (p76Var != null && (lq0.b(i) || oc9.R(p76Var, this.e))) {
            lq0Var.g(i, p76Var);
            return;
        }
        if (lq0.a(i)) {
            p76.g(p76Var);
            if (this.f.c(this.d + 1, lq0Var, this.c)) {
                return;
            }
            lq0Var.g(1, null);
        }
    }
}
