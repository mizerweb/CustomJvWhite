package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yd8 extends mdh implements qf7 {
    public int e;
    public /* synthetic */ boolean f;
    public final /* synthetic */ ae8 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd8(ae8 ae8Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = ae8Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        yd8 yd8Var = new yd8(this.g, lq4Var);
        yd8Var.f = ((Boolean) obj).booleanValue();
        return yd8Var;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((yd8) create(bool, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0061 A[RETURN] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        boolean z = this.f;
        int i = this.e;
        sbi sbiVar = sbi.a;
        if (i != 0) {
            if (i == 1) {
                ch3.d0(obj);
                return sbiVar;
            }
            if (i == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        ae8 ae8Var = this.g;
        hu4 hu4Var = hu4.a;
        if (!z) {
            if (ae8Var.i.a.getValue() instanceof hf8) {
                this.f = z;
                this.e = 2;
                zv8[] zv8VarArr = ae8.u;
                if (ae8Var.i(this) == hu4Var) {
                    return hu4Var;
                }
            }
            return sbiVar;
        }
        vo8 vo8Var = (vo8) ae8Var.s.m(ae8Var, ae8.u[0]);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        mjg mjgVar = ae8Var.h;
        this.f = z;
        this.e = 1;
        mjgVar.getClass();
        mjgVar.j(null, hf8.a);
        if (sbiVar == hu4Var) {
            return hu4Var;
        }
        return sbiVar;
    }
}
