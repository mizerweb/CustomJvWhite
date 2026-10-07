package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class in3 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn3 b;
    public final /* synthetic */ long c;

    public /* synthetic */ in3(xn3 xn3Var, long j, int i) {
        this.a = i;
        this.b = xn3Var;
        this.c = j;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        long j = this.c;
        xn3 xn3Var = this.b;
        switch (i) {
            case 0:
                return xn3Var.j().K(j);
            default:
                return xn3Var.j().n(j);
        }
    }
}
