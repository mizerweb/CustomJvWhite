package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class of3 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ jac f;
    public /* synthetic */ kbc g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ of3(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        int i2 = 3;
        jac jacVar = (jac) obj;
        kbc kbcVar = (kbc) obj2;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                of3 of3Var = new of3(i2, lq4Var, 0);
                of3Var.f = jacVar;
                of3Var.g = kbcVar;
                of3Var.invokeSuspend(sbiVar);
                break;
            case 1:
                of3 of3Var2 = new of3(i2, lq4Var, 1);
                of3Var2.f = jacVar;
                of3Var2.g = kbcVar;
                of3Var2.invokeSuspend(sbiVar);
                break;
            default:
                of3 of3Var3 = new of3(i2, lq4Var, 2);
                of3Var3.f = jacVar;
                of3Var3.g = kbcVar;
                of3Var3.invokeSuspend(sbiVar);
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
                jac jacVar = this.f;
                kbc kbcVar = this.g;
                ch3.d0(obj);
                jacVar.onThemeChanged(kbcVar);
                break;
            case 1:
                jac jacVar2 = this.f;
                kbc kbcVar2 = this.g;
                ch3.d0(obj);
                jacVar2.onThemeChanged(kbcVar2);
                break;
            default:
                jac jacVar3 = this.f;
                kbc kbcVar3 = this.g;
                ch3.d0(obj);
                jacVar3.onThemeChanged(kbcVar3);
                break;
        }
        return sbiVar;
    }
}
