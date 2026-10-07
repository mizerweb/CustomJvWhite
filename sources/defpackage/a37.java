package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a37 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ f37 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a37(Object obj, lq4 lq4Var, f37 f37Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = f37Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        f37 f37Var = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                return new a37(obj2, lq4Var, f37Var, 0);
            default:
                return new a37(obj2, lq4Var, f37Var, 1);
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
        return ((a37) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        f37 f37Var = this.h;
        Object obj2 = this.g;
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
                long jLongValue = ((Number) obj2).longValue();
                zv8[] zv8VarArr = f37.D;
                xn3 xn3Var = (xn3) f37Var.l.getValue();
                this.f = 1;
                Object objI = xn3Var.i(jLongValue, this);
                return objI == hu4Var ? hu4Var : objI;
            default:
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                    } else {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                ch3.d0(obj);
                zv8[] zv8VarArr2 = f37.D;
                xn3 xn3Var2 = (xn3) f37Var.l.getValue();
                long jLongValue2 = ((Long) obj2).longValue();
                this.f = 1;
                obj = xn3Var2.i(jLongValue2, this);
                if (obj == hu4Var) {
                    return hu4Var;
                }
                rt2 rt2Var = (rt2) obj;
                if (rt2Var != null) {
                    return new Long(rt2Var.a);
                }
                return null;
        }
    }
}
