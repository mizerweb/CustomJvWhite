package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nr1 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pr1 b;

    public /* synthetic */ nr1(pr1 pr1Var, int i) {
        this.a = i;
        this.b = pr1Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        pr1 pr1Var = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(pr1Var.i.a.c.e);
            case 1:
                return new a5f(pr1Var.o.j, pr1Var.e);
            case 2:
                return new tb1(pr1Var.x.j, pr1Var.g);
            case 3:
                return pr1Var.m;
            case 4:
                return pr1Var.b.a;
            case 5:
                return new kw1(pr1Var.x.i, pr1Var.g, pr1Var.f);
            default:
                return new j5g(pr1Var.c, pr1Var.d);
        }
    }
}
