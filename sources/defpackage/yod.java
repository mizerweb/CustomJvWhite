package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yod extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ apd g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yod(apd apdVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = apdVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        apd apdVar = this.g;
        switch (i) {
            case 0:
                return new yod(apdVar, lq4Var, 0);
            default:
                return new yod(apdVar, lq4Var, 1);
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
        return ((yod) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        apd apdVar = this.g;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    zz5 zz5Var = apdVar.c;
                    this.f = 1;
                    return zz5Var.j() == hu4Var ? hu4Var : sbiVar;
                }
                if (i2 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    zz5 zz5Var2 = apdVar.c;
                    this.f = 1;
                    obj = zz5Var2.m(this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return sbiVar;
                }
                a8j.x(apdVar.n, rt3.b);
                return sbiVar;
        }
    }
}
