package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sr2 extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ ur2 h;
    public final /* synthetic */ yx6 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr2(ur2 ur2Var, yx6 yx6Var, Object obj, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = ur2Var;
        this.i = yx6Var;
        this.g = obj;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        yx6 yx6Var = this.i;
        ur2 ur2Var = this.h;
        switch (i) {
            case 0:
                return new sr2(ur2Var, yx6Var, this.g, lq4Var);
            default:
                sr2 sr2Var = new sr2(ur2Var, yx6Var, lq4Var);
                sr2Var.g = obj;
                return sr2Var;
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
        return ((sr2) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        yx6 yx6Var = this.i;
        ur2 ur2Var = this.h;
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
                tf7 tf7Var = ur2Var.e;
                Object obj2 = this.g;
                this.f = 1;
                return tf7Var.i(yx6Var, obj2, this) == hu4Var ? hu4Var : sbiVar;
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
                gu4 gu4Var = (gu4) this.g;
                wfe wfeVar = new wfe();
                xx6 xx6Var = ur2Var.d;
                k30 k30Var = new k30(wfeVar, gu4Var, ur2Var, yx6Var);
                this.f = 1;
                return xx6Var.collect(k30Var, this) == hu4Var ? hu4Var : sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr2(ur2 ur2Var, yx6 yx6Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = ur2Var;
        this.i = yx6Var;
    }
}
