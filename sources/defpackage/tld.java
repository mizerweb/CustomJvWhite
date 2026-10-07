package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tld extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ et4 f;
    public /* synthetic */ kbc g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tld(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        int i2 = 3;
        et4 et4Var = (et4) obj;
        kbc kbcVar = (kbc) obj2;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                tld tldVar = new tld(i2, lq4Var, 0);
                tldVar.f = et4Var;
                tldVar.g = kbcVar;
                tldVar.invokeSuspend(sbiVar);
                break;
            default:
                tld tldVar2 = new tld(i2, lq4Var, 1);
                tldVar2.f = et4Var;
                tldVar2.g = kbcVar;
                tldVar2.invokeSuspend(sbiVar);
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
                et4 et4Var = this.f;
                kbc kbcVar = this.g;
                ch3.d0(obj);
                et4Var.setBackgroundColor(kbcVar.b().b);
                break;
            default:
                et4 et4Var2 = this.f;
                kbc kbcVar2 = this.g;
                ch3.d0(obj);
                et4Var2.setBackgroundColor(kbcVar2.b().b);
                break;
        }
        return sbiVar;
    }
}
