package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ca4 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ da4 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ca4(da4 da4Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = da4Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        da4 da4Var = this.g;
        switch (i) {
            case 0:
                return new ca4(da4Var, lq4Var, 0);
            case 1:
                return new ca4(da4Var, lq4Var, 1);
            default:
                return new ca4(da4Var, lq4Var, 2);
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
        return ((ca4) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        da4 da4Var = this.g;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    pzf pzfVar = da4Var.a;
                    this.f = 1;
                    return pzfVar.emit(x94.a, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i2 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    pzf pzfVar2 = da4Var.a;
                    this.f = 1;
                    return pzfVar2.emit(y94.a, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i3 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    pzf pzfVar3 = da4Var.a;
                    this.f = 1;
                    return pzfVar3.emit(z94.a, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i4 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
