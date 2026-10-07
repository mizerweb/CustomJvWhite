package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ap2 implements pwi {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn7 b;

    public /* synthetic */ ap2(cn7 cn7Var, int i) {
        this.a = i;
        this.b = cn7Var;
    }

    @Override // defpackage.pwi
    public final void run() {
        int i = this.a;
        cn7 cn7Var = this.b;
        switch (i) {
            case 0:
                cn7Var.flush();
                break;
            default:
                cn7Var.a();
                break;
        }
    }
}
