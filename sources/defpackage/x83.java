package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class x83 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ k96 f;
    public final /* synthetic */ zpg g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x83(zpg zpgVar, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.g = zpgVar;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        zpg zpgVar = this.g;
        k96 k96Var = (k96) obj;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                x83 x83Var = new x83(zpgVar, lq4Var, 0);
                x83Var.f = k96Var;
                x83Var.invokeSuspend(sbiVar);
                break;
            default:
                x83 x83Var2 = new x83(zpgVar, lq4Var, 1);
                x83Var2.f = k96Var;
                x83Var2.invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        zpg zpgVar = this.g;
        k96 k96Var = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                zpgVar.j();
                k96Var.X();
                break;
            default:
                ch3.d0(obj);
                zpgVar.j();
                k96Var.X();
                break;
        }
        return sbiVar;
    }
}
