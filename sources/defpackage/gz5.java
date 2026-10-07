package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gz5 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ iz5 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gz5(iz5 iz5Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = iz5Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        iz5 iz5Var = this.g;
        switch (i) {
            case 0:
                return new gz5(iz5Var, lq4Var, 0);
            case 1:
                return new gz5(iz5Var, lq4Var, 1);
            case 2:
                return new gz5(iz5Var, lq4Var, 2);
            default:
                return new gz5(iz5Var, lq4Var, 3);
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
        return ((gz5) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        iz5 iz5Var = this.g;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    pzf pzfVar = iz5Var.x;
                    this.f = 1;
                    return pzfVar.emit(sy5.a, this) == hu4Var ? hu4Var : sbiVar;
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
                    this.f = 1;
                    return iz5.E(iz5Var, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i3 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    zv8[] zv8VarArr = iz5.B;
                    xn3 xn3VarH = iz5Var.H();
                    long j = iz5Var.c.a;
                    this.f = 1;
                    obj = xn3VarH.v(j, this);
                    if (obj != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                rt2 rt2Var = (rt2) obj;
                if (!sol.a(rt2Var, (wo6) iz5Var.i.getValue())) {
                    return sbiVar;
                }
                pzf pzfVar2 = iz5Var.x;
                uy5 uy5Var = new uy5(sol.c(rt2Var));
                this.f = 2;
                if (pzfVar2.emit(uy5Var, this) != hu4Var) {
                    return sbiVar;
                }
                return hu4Var;
            default:
                int i5 = this.f;
                if (i5 == 0) {
                    ch3.d0(obj);
                    zv8[] zv8VarArr2 = iz5.B;
                    xn3 xn3VarH2 = iz5Var.H();
                    long j2 = iz5Var.c.a;
                    this.f = 1;
                    obj = xn3VarH2.v(j2, this);
                    if (obj != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                pzf pzfVar3 = iz5Var.x;
                ty5 ty5Var = new ty5(vol.c((rt2) obj));
                this.f = 2;
                if (pzfVar3.emit(ty5Var, this) != hu4Var) {
                    return sbiVar;
                }
                return hu4Var;
        }
    }
}
