package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x82 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ny8 b;
    public final /* synthetic */ ny8 c;

    public /* synthetic */ x82(ny8 ny8Var, ny8 ny8Var2, int i) {
        this.a = i;
        this.b = ny8Var;
        this.c = ny8Var2;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int iMax;
        int i = this.a;
        ny8 ny8Var = this.c;
        ny8 ny8Var2 = this.b;
        switch (i) {
            case 0:
                return lvb.x0(wk8.a(), ((n0c) ((xhh) ny8Var2.getValue())).b()).u0((vt4) ny8Var.getValue());
            case 1:
                return cqk.D((gu4) ny8Var2.getValue(), ((n0c) ((xhh) ny8Var.getValue())).a().R0(1, "non-contacts"));
            case 2:
                int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                a2c a2cVar = (a2c) ny8Var2.getValue();
                int iOrdinal = ((pk5) ny8Var.getValue()).ordinal();
                if (iOrdinal == 0) {
                    iMax = Math.max(4, iAvailableProcessors - 1);
                } else if (iOrdinal == 1) {
                    iMax = Math.max(8, iAvailableProcessors);
                } else {
                    if (iOrdinal != 2) {
                        ore.o();
                        return null;
                    }
                    iMax = Math.max(12, iAvailableProcessors);
                }
                return a2c.g(a2cVar, "sync-chat-history", 0, iMax, 32);
            default:
                xt4 xt4VarR0 = ((n0c) ((xhh) ny8Var2.getValue())).b().R0(1, "shortcuts");
                vt4 vt4Var = (vt4) ny8Var.getValue();
                xt4VarR0.getClass();
                return cqk.a(lvb.x0(xt4VarR0, vt4Var));
        }
    }
}
