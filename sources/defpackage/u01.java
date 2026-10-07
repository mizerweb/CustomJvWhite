package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u01 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ z01 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u01(z01 z01Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = z01Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        z01 z01Var = this.g;
        switch (i) {
            case 0:
                u01 u01Var = new u01(z01Var, lq4Var, 0);
                u01Var.f = obj;
                return u01Var;
            default:
                u01 u01Var2 = new u01(z01Var, lq4Var, 1);
                u01Var2.f = obj;
                return u01Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((u01) create((vg4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((u01) create((ylc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        z01 z01Var = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                vg4 vg4Var = (vg4) obj2;
                ch3.d0(obj);
                zv8[] zv8VarArr = z01.x;
                Long L = z01Var.L(vg4Var);
                if (L != null) {
                    z01Var.w.B(z01Var, z01.x[0], mll.a(z01Var.i, L.longValue(), (xhh) z01Var.p.getValue(), (cic) z01Var.o.getValue(), vg4Var.getClass().getName()));
                }
                break;
            default:
                ylc ylcVar = (ylc) obj2;
                ch3.d0(obj);
                vg4 vg4Var2 = (vg4) ylcVar.a;
                yhc yhcVar = (yhc) ylcVar.b;
                zv8[] zv8VarArr2 = z01.x;
                z01Var.f(z01Var.K(vg4Var2, yhcVar));
                break;
        }
        return sbiVar;
    }
}
