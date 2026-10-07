package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xgk extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ fjh g;
    public final /* synthetic */ phk h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xgk(fjh fjhVar, lq4 lq4Var, phk phkVar, String str, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = fjhVar;
        this.h = phkVar;
        this.i = str;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new xgk(this.g, lq4Var, this.h, this.i, 0);
            default:
                return new xgk(this.g, lq4Var, this.h, this.i, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((xgk) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object objA;
        int i = this.e;
        sbi sbiVar = sbi.a;
        String str = this.i;
        phk phkVar = this.h;
        hu4 hu4Var = hu4.a;
        fjh fjhVar = this.g;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    rai raiVar = phkVar.b;
                    this.f = 1;
                    objB = raiVar.b(str, this);
                    if (objB == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                    objB = ((roe) obj).a;
                }
                if (!(objB instanceof poe)) {
                    fjhVar.b(objB);
                }
                Throwable thA = roe.a(objB);
                if (thA == null) {
                    return sbiVar;
                }
                fjhVar.a(thA);
                return sbiVar;
            default:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    n6k n6kVar = phkVar.c;
                    this.f = 1;
                    objA = n6kVar.a(str, this);
                    if (objA == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                    objA = ((roe) obj).a;
                }
                if (!(objA instanceof poe)) {
                    fjhVar.b(objA);
                }
                Throwable thA2 = roe.a(objA);
                if (thA2 == null) {
                    return sbiVar;
                }
                fjhVar.a(thA2);
                return sbiVar;
        }
    }
}
