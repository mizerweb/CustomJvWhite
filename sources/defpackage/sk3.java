package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sk3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ rl3 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sk3(int i, rl3 rl3Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = i;
        this.g = rl3Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        rl3 rl3Var = this.g;
        switch (i) {
            case 0:
                return new sk3(0, rl3Var, lq4Var);
            default:
                return new sk3(1, rl3Var, lq4Var);
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
        return ((sk3) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        rl3 rl3Var = this.g;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                zv8[] zv8VarArr = rl3.Z1;
                xn3 xn3VarI = rl3Var.I();
                this.f = 1;
                Object objD = xn3VarI.j().d(this);
                if (objD != hu4Var) {
                    objD = sbiVar;
                }
                return objD == hu4Var ? hu4Var : sbiVar;
            default:
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                jz jzVar = new jz(new cu2(new jz(rl3Var.I1, 13), 4), 11);
                d90 d90Var = new d90(2, rl3Var);
                this.f = 1;
                return jzVar.collect(d90Var, this) == hu4Var ? hu4Var : sbiVar;
        }
    }
}
