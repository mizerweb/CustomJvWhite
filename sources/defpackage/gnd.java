package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gnd extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ rcc f;
    public /* synthetic */ kbc g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gnd(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        int i2 = 3;
        rcc rccVar = (rcc) obj;
        kbc kbcVar = (kbc) obj2;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                gnd gndVar = new gnd(i2, lq4Var, 0);
                gndVar.f = rccVar;
                gndVar.g = kbcVar;
                gndVar.invokeSuspend(sbiVar);
                break;
            case 1:
                gnd gndVar2 = new gnd(i2, lq4Var, 1);
                gndVar2.f = rccVar;
                gndVar2.g = kbcVar;
                gndVar2.invokeSuspend(sbiVar);
                break;
            default:
                gnd gndVar3 = new gnd(i2, lq4Var, 2);
                gndVar3.f = rccVar;
                gndVar3.g = kbcVar;
                gndVar3.invokeSuspend(sbiVar);
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
                rcc rccVar = this.f;
                kbc kbcVar = this.g;
                ch3.d0(obj);
                rccVar.setBackgroundColor(kbcVar.b().b);
                break;
            case 1:
                rcc rccVar2 = this.f;
                kbc kbcVar2 = this.g;
                ch3.d0(obj);
                rccVar2.setBackgroundColor(kbcVar2.b().c);
                break;
            default:
                rcc rccVar3 = this.f;
                kbc kbcVar3 = this.g;
                ch3.d0(obj);
                rccVar3.setBackgroundColor(kbcVar3.k().b);
                break;
        }
        return sbiVar;
    }
}
