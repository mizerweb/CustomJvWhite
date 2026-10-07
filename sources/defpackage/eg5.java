package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eg5 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ fg5 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eg5(fg5 fg5Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = fg5Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        fg5 fg5Var = this.g;
        switch (i) {
            case 0:
                return new eg5(fg5Var, lq4Var, 0);
            case 1:
                return new eg5(fg5Var, lq4Var, 1);
            default:
                return new eg5(fg5Var, lq4Var, 2);
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
            case 1:
                break;
        }
        return ((eg5) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.e;
        fg5 fg5Var = this.g;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                uli uliVarM = fg5.m(fg5Var);
                this.f = 1;
                Object objB = uliVarM.b(this);
                return objB == hu4Var ? hu4Var : objB;
            case 1:
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                xf5 xf5VarE = fg5.m(fg5Var).e();
                this.f = 1;
                Object objP = ((i64) xf5VarE).p(this);
                return objP == hu4Var ? hu4Var : objP;
            default:
                int i4 = this.f;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                xf5 xf5VarF = fg5.m(fg5Var).f();
                this.f = 1;
                Object objP2 = ((i64) xf5VarF).p(this);
                return objP2 == hu4Var ? hu4Var : objP2;
        }
    }
}
