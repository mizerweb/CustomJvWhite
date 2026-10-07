package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ur9 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ as9 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ur9(as9 as9Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = as9Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        as9 as9Var = this.g;
        switch (i) {
            case 0:
                return new ur9(as9Var, lq4Var, 0);
            case 1:
                return new ur9(as9Var, lq4Var, 1);
            default:
                return new ur9(as9Var, lq4Var, 2);
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
        return ((ur9) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        as9 as9Var = this.g;
        hu4 hu4Var = hu4.a;
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
                lz6 lz6VarK = e9i.K(as9Var.p, 1);
                d90 d90Var = new d90(11, as9Var);
                this.f = 1;
                return lz6VarK.collect(d90Var, this) == hu4Var ? hu4Var : sbiVar;
            case 1:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    obj = as9.B(as9Var, this);
                    if (obj != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                rt2 rt2Var = (rt2) obj;
                if (!sol.a(rt2Var, (wo6) as9Var.m.getValue())) {
                    return sbiVar;
                }
                p41 p41Var = as9Var.s;
                sff sffVar = new sff(sol.c(rt2Var));
                this.f = 2;
                if (p41Var.a(this, sffVar) != hu4Var) {
                    return sbiVar;
                }
                return hu4Var;
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
                jz jzVar = new jz(as9Var.c, 13);
                this.f = 1;
                Object objN = e9i.N(jzVar, this);
                return objN == hu4Var ? hu4Var : objN;
        }
    }
}
