package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vo9 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xo9 b;

    public /* synthetic */ vo9(xo9 xo9Var, int i) {
        this.a = i;
        this.b = xo9Var;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        xo9 xo9Var = this.b;
        Long l = (Long) obj;
        switch (i) {
            case 0:
                return xo9.a(xo9Var, l.longValue());
            default:
                return xo9.w(xo9Var, l.longValue());
        }
    }
}
