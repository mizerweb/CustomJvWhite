package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w21 extends sg5 {
    public final es0 c;
    public final /* synthetic */ lqh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w21(lqh lqhVar, lq0 lq0Var, es0 es0Var) {
        super(lq0Var);
        this.d = lqhVar;
        this.c = es0Var;
    }

    @Override // defpackage.sg5, defpackage.lq0
    public final void f(Throwable th) {
        ((hrh) this.d.c).b(this.b, this.c);
    }

    @Override // defpackage.lq0
    public final void h(int i, Object obj) {
        p76 p76Var = (p76) obj;
        es0 es0Var = this.c;
        v78 v78Var = es0Var.a;
        boolean zA = lq0.a(i);
        boolean zR = oc9.R(p76Var, v78Var.h);
        lq0 lq0Var = this.b;
        if (p76Var != null && (zR || v78Var.e)) {
            if (zA && zR) {
                lq0Var.g(i, p76Var);
            } else {
                lq0Var.g(i & (-2), p76Var);
            }
        }
        if (!zA || zR || v78Var.c()) {
            return;
        }
        p76.g(p76Var);
        ((hrh) this.d.c).b(lq0Var, es0Var);
    }
}
