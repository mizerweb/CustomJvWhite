package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class iej extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public sej f;
    public int g;
    public final /* synthetic */ rej h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iej(rej rejVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = rejVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        rej rejVar = this.h;
        switch (i) {
            case 0:
                return new iej(rejVar, lq4Var, 0);
            default:
                return new iej(rejVar, lq4Var, 1);
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
        return ((iej) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objA2;
        int i = this.e;
        Object obj2 = sbi.a;
        hu4 hu4Var = hu4.a;
        rej rejVar = this.h;
        switch (i) {
            case 0:
                int i2 = this.g;
                if (i2 == 0) {
                    ch3.d0(obj);
                    xdj xdjVarF = rejVar.f();
                    long j = rejVar.a;
                    long j2 = rejVar.b;
                    this.g = 1;
                    objA = xdjVarF.a(j, j2, this);
                    if (objA != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sej sejVar = this.f;
                    ch3.d0(obj);
                    return sejVar;
                }
                ch3.d0(obj);
                objA = obj;
                sej sejVar2 = (sej) objA;
                sej sejVarA = sejVar2 != null ? sej.a(sejVar2, true, false, 15) : new sej(rejVar.a, rejVar.b, false);
                xdj xdjVarF2 = rejVar.f();
                this.f = sejVarA;
                this.g = 2;
                Object objI = ch3.I(this, xdjVarF2.a, false, true, new wdj(xdjVarF2, sejVarA, 0));
                if (objI == hu4Var) {
                    obj2 = objI;
                }
                if (obj2 != hu4Var) {
                    return sejVarA;
                }
                return hu4Var;
            default:
                int i3 = this.g;
                if (i3 == 0) {
                    ch3.d0(obj);
                    xdj xdjVarF3 = rejVar.f();
                    long j3 = rejVar.a;
                    long j4 = rejVar.b;
                    this.g = 1;
                    objA2 = xdjVarF3.a(j3, j4, this);
                    if (objA2 != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sej sejVar3 = this.f;
                    ch3.d0(obj);
                    return sejVar3;
                }
                ch3.d0(obj);
                objA2 = obj;
                sej sejVar4 = (sej) objA2;
                sej sejVarA2 = sejVar4 != null ? sej.a(sejVar4, true, true, 15) : new sej(rejVar.a, rejVar.b, true);
                xdj xdjVarF4 = rejVar.f();
                this.f = sejVarA2;
                this.g = 2;
                Object objI2 = ch3.I(this, xdjVarF4.a, false, true, new wdj(xdjVarF4, sejVarA2, 0));
                if (objI2 == hu4Var) {
                    obj2 = objI2;
                }
                if (obj2 != hu4Var) {
                    return sejVarA2;
                }
                return hu4Var;
        }
    }
}
