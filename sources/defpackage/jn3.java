package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jn3 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn3 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ jn3(xn3 xn3Var, long j, boolean z, int i) {
        this.a = i;
        this.b = xn3Var;
        this.c = j;
        this.d = z;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        xn3 xn3Var = this.b;
        switch (i) {
            case 0:
                qw2 qw2VarJ = xn3Var.j();
                qw2VarJ.getClass();
                StringBuilder sb = new StringBuilder("addToFavorites: ");
                long j = this.c;
                sb.append(j);
                gm0.n("qw2", sb.toString());
                qw2VarJ.b0(j, System.currentTimeMillis(), this.d);
                break;
            default:
                qw2 qw2VarJ2 = xn3Var.j();
                qw2VarJ2.getClass();
                StringBuilder sb2 = new StringBuilder("removeFromFavorites: ");
                long j2 = this.c;
                sb2.append(j2);
                gm0.n("qw2", sb2.toString());
                qw2VarJ2.b0(j2, 0L, this.d);
                break;
        }
        return sbiVar;
    }
}
