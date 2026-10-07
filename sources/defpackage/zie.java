package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zie extends sg5 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zie(lq0 lq0Var, int i) {
        super(lq0Var);
        this.c = i;
    }

    @Override // defpackage.lq0
    public final void h(int i, Object obj) {
        int i2 = this.c;
        au3 au3VarA = null;
        lq0 lq0Var = this.b;
        switch (i2) {
            case 0:
                p76 p76Var = (p76) obj;
                try {
                    if (p76.P(p76Var) && p76Var != null) {
                        au3VarA = au3.A(p76Var.a);
                    }
                    lq0Var.g(i, au3VarA);
                    return;
                } finally {
                    au3.E(au3VarA);
                }
            default:
                if (lq0.a(i)) {
                    lq0Var.g(i, null);
                    return;
                }
                return;
        }
    }
}
