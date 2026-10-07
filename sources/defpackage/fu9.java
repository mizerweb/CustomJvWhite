package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fu9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qu9 b;
    public final /* synthetic */ iu9 c;

    public /* synthetic */ fu9(qu9 qu9Var, iu9 iu9Var, int i) {
        this.a = i;
        this.b = qu9Var;
        this.c = iu9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qu9 qu9Var = this.b;
                iu9 iu9Var = this.c;
                qu9Var.i = iu9Var;
                if (qu9Var.j) {
                    qu9Var.m(iu9Var);
                }
                qu9Var.b(new fu9(qu9Var, iu9Var, 1), new cc5(1, qu9Var));
                break;
            default:
                qu9 qu9Var2 = this.b;
                iu9 iu9Var2 = this.c;
                if (qu9Var2.a instanceof a1) {
                    iu9Var2.Q();
                }
                break;
        }
    }
}
