package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yb3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ xd3 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yb3(xd3 xd3Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = xd3Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        xd3 xd3Var = this.g;
        switch (i) {
            case 0:
                yb3 yb3Var = new yb3(xd3Var, lq4Var, 0);
                yb3Var.f = obj;
                return yb3Var;
            default:
                yb3 yb3Var2 = new yb3(xd3Var, lq4Var, 1);
                yb3Var2.f = obj;
                return yb3Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((yb3) create((ky2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((yb3) create((fbj) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        xd3 xd3Var = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                if (cqk.d((ky2) obj2, ky2.a)) {
                    a8j.x(xd3Var.L1, ac3.d);
                    return sbiVar;
                }
                ore.o();
                return null;
            default:
                ch3.d0(obj);
                int iOrdinal = ((fbj) obj2).ordinal();
                if (iOrdinal == 0) {
                    return sbiVar;
                }
                if (iOrdinal == 1) {
                    a8j.x(xd3Var.L1, new nc3(false, true));
                    return sbiVar;
                }
                ore.o();
                return null;
        }
    }
}
