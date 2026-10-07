package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gej extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ rej g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gej(rej rejVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = rejVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        rej rejVar = this.g;
        switch (i) {
            case 0:
                return new gej(rejVar, lq4Var, 0);
            case 1:
                return new gej(rejVar, lq4Var, 1);
            case 2:
                return new gej(rejVar, lq4Var, 2);
            default:
                return new gej(rejVar, lq4Var, 3);
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
            case 2:
                break;
        }
        return ((gej) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        hu4 hu4Var = hu4.a;
        rej rejVar = this.g;
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
                xdj xdjVarF = rejVar.f();
                long j = rejVar.a;
                long j2 = rejVar.b;
                this.f = 1;
                Object objI = ch3.I(this, xdjVarF.a, false, true, new mka((String) null, j, j2));
                return objI == hu4Var ? hu4Var : objI;
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
                xdj xdjVarF2 = rejVar.f();
                long j3 = rejVar.a;
                long j4 = rejVar.b;
                this.f = 1;
                Object objA = xdjVarF2.a(j3, j4, this);
                return objA == hu4Var ? hu4Var : objA;
            case 2:
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
                xdj xdjVarF3 = rejVar.f();
                long j5 = rejVar.a;
                long j6 = rejVar.b;
                this.f = 1;
                Object objA2 = xdjVarF3.a(j5, j6, this);
                return objA2 == hu4Var ? hu4Var : objA2;
            default:
                int i5 = this.f;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                xdj xdjVarF4 = rejVar.f();
                long j7 = rejVar.a;
                long j8 = rejVar.b;
                this.f = 1;
                Object objA3 = xdjVarF4.a(j7, j8, this);
                return objA3 == hu4Var ? hu4Var : objA3;
        }
    }
}
