package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i07 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i07(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                i07 i07Var = new i07(2, lq4Var, 0);
                i07Var.f = ((Number) obj).intValue();
                return i07Var;
            case 1:
                return new i07(2, lq4Var, 1);
            default:
                i07 i07Var2 = new i07(2, lq4Var, 2);
                i07Var2.f = ((Number) obj).intValue();
                return i07Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((i07) create(Integer.valueOf(((Number) obj).intValue()), (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((i07) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                ((i07) create(Integer.valueOf(((Number) obj).intValue()), (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object objA;
        switch (this.e) {
            case 0:
                ch3.d0(obj);
                return Boolean.valueOf(this.f > 0);
            case 1:
                hu4 hu4Var = hu4.a;
                int i = this.f;
                if (i == 0) {
                    ch3.d0(obj);
                    r7 r7Var = r7.a;
                    ha9 ha9Var = ha9.b;
                    this.f = 1;
                    objA = r7Var.a(ha9Var, this);
                    if (objA == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                    objA = ((y6) obj).a;
                }
                return new qzb((r3f) objA);
            default:
                int i2 = this.f;
                ch3.d0(obj);
                n6e.a = i2;
                return sbi.a;
        }
    }
}
