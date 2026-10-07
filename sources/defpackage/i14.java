package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i14 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g24 b;
    public final /* synthetic */ uy3 c;

    public /* synthetic */ i14(g24 g24Var, uy3 uy3Var, int i) {
        this.a = i;
        this.b = g24Var;
        this.c = uy3Var;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        long jE;
        int i = this.a;
        uy3 uy3Var = this.c;
        g24 g24Var = this.b;
        qxe qxeVar = (qxe) obj;
        switch (i) {
            case 0:
                jE = g24Var.b.e(qxeVar, uy3Var);
                break;
            default:
                jE = g24Var.b.e(qxeVar, uy3Var);
                break;
        }
        return Long.valueOf(jE);
    }
}
