package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class psc extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ rsc g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ psc(rsc rscVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = rscVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        rsc rscVar = this.g;
        switch (i) {
            case 0:
                psc pscVar = new psc(rscVar, lq4Var, 0);
                pscVar.f = obj;
                return pscVar;
            case 1:
                psc pscVar2 = new psc(rscVar, lq4Var, 1);
                pscVar2.f = obj;
                return pscVar2;
            case 2:
                psc pscVar3 = new psc(rscVar, lq4Var, 2);
                pscVar3.f = obj;
                return pscVar3;
            case 3:
                psc pscVar4 = new psc(rscVar, lq4Var, 3);
                pscVar4.f = obj;
                return pscVar4;
            case 4:
                psc pscVar5 = new psc(rscVar, lq4Var, 4);
                pscVar5.f = obj;
                return pscVar5;
            default:
                psc pscVar6 = new psc(rscVar, lq4Var, 5);
                pscVar6.f = obj;
                return pscVar6;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        ssc sscVar = (ssc) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((psc) create(sscVar, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((psc) create(sscVar, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((psc) create(sscVar, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((psc) create(sscVar, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((psc) create(sscVar, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((psc) create(sscVar, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        ssc sscVar = ssc.a;
        rsc rscVar = this.g;
        ssc sscVar2 = (ssc) this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                rsc.a(rscVar, "contacts", sscVar2 == sscVar ? "allowed" : "denied");
                break;
            case 1:
                ch3.d0(obj);
                rsc.a(rscVar, "fsi", sscVar2 == sscVar ? "allowed" : "denied");
                break;
            case 2:
                ch3.d0(obj);
                rsc.a(rscVar, "gallery", sscVar2 == sscVar ? "allowed" : "denied");
                break;
            case 3:
                ch3.d0(obj);
                rsc.a(rscVar, "camera", sscVar2 == sscVar ? "allowed" : "denied");
                break;
            case 4:
                ch3.d0(obj);
                rsc.a(rscVar, "microphone", sscVar2 == sscVar ? "allowed" : "denied");
                break;
            default:
                ch3.d0(obj);
                rsc.a(rscVar, "geo", sscVar2 == sscVar ? "allowed" : "denied");
                break;
        }
        return sbiVar;
    }
}
