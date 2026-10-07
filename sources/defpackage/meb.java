package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class meb extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ rq f;
    public /* synthetic */ kbc g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ meb(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        int i2 = 3;
        rq rqVar = (rq) obj;
        kbc kbcVar = (kbc) obj2;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                meb mebVar = new meb(i2, lq4Var, 0);
                mebVar.f = rqVar;
                mebVar.g = kbcVar;
                mebVar.invokeSuspend(sbiVar);
                break;
            case 1:
                meb mebVar2 = new meb(i2, lq4Var, 1);
                mebVar2.f = rqVar;
                mebVar2.g = kbcVar;
                mebVar2.invokeSuspend(sbiVar);
                break;
            default:
                meb mebVar3 = new meb(i2, lq4Var, 2);
                mebVar3.f = rqVar;
                mebVar3.g = kbcVar;
                mebVar3.invokeSuspend(sbiVar);
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
                rq rqVar = this.f;
                kbc kbcVar = this.g;
                ch3.d0(obj);
                rqVar.setBackgroundColor(kbcVar.b().c);
                break;
            case 1:
                rq rqVar2 = this.f;
                kbc kbcVar2 = this.g;
                ch3.d0(obj);
                rqVar2.setBackgroundColor(kbcVar2.b().b);
                break;
            default:
                rq rqVar3 = this.f;
                kbc kbcVar3 = this.g;
                ch3.d0(obj);
                rqVar3.setBackgroundColor(kbcVar3.b().b);
                break;
        }
        return sbiVar;
    }
}
