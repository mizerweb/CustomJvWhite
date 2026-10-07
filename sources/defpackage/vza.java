package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vza implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ny8 b;

    public /* synthetic */ vza(ny8 ny8Var, int i) {
        this.a = i;
        this.b = ny8Var;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        ny8 ny8Var = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(((bi4) ny8Var.getValue()).i(((Long) obj).longValue()));
            default:
                ys8 ys8Var = (ys8) obj;
                ys8Var.a = true;
                ys8Var.e = ((qs8) ny8Var.getValue()).b;
                return sbi.a;
        }
    }
}
