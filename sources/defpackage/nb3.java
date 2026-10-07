package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nb3 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ tp2 f;
    public /* synthetic */ kbc g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nb3(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        int i2 = 3;
        tp2 tp2Var = (tp2) obj;
        kbc kbcVar = (kbc) obj2;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                nb3 nb3Var = new nb3(i2, lq4Var, 0);
                nb3Var.f = tp2Var;
                nb3Var.g = kbcVar;
                nb3Var.invokeSuspend(sbiVar);
                break;
            default:
                nb3 nb3Var2 = new nb3(i2, lq4Var, 1);
                nb3Var2.f = tp2Var;
                nb3Var2.g = kbcVar;
                nb3Var2.invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                tp2 tp2Var = this.f;
                kbc kbcVar = this.g;
                ch3.d0(obj);
                tp2Var.setBackgroundColor(kbcVar.k().b);
                break;
            default:
                tp2 tp2Var2 = this.f;
                kbc kbcVar2 = this.g;
                ch3.d0(obj);
                tp2Var2.setBackgroundColor(kbcVar2.b().f);
                break;
        }
        return sbiVar;
    }
}
