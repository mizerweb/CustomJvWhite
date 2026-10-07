package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n44 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ izb f;
    public /* synthetic */ kbc g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n44(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        int i2 = 3;
        izb izbVar = (izb) obj;
        kbc kbcVar = (kbc) obj2;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                n44 n44Var = new n44(i2, lq4Var, 0);
                n44Var.f = izbVar;
                n44Var.g = kbcVar;
                n44Var.invokeSuspend(sbiVar);
                break;
            default:
                n44 n44Var2 = new n44(i2, lq4Var, 1);
                n44Var2.f = izbVar;
                n44Var2.g = kbcVar;
                n44Var2.invokeSuspend(sbiVar);
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
                izb izbVar = this.f;
                kbc kbcVar = this.g;
                ch3.d0(obj);
                izbVar.setBackground(col.e(kbcVar, null, kbcVar.b().c, 4));
                break;
            default:
                izb izbVar2 = this.f;
                kbc kbcVar2 = this.g;
                ch3.d0(obj);
                izbVar2.setBackground(col.e(kbcVar2, null, kbcVar2.b().c, 4));
                break;
        }
        return sbiVar;
    }
}
