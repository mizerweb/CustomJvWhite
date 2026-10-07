package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l05 extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public int f;
    public final /* synthetic */ rre g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ cf7 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l05(lq4 lq4Var, rre rreVar, boolean z, boolean z2, cf7 cf7Var) {
        super(2, lq4Var);
        this.g = rreVar;
        this.h = z;
        this.i = z2;
        this.j = cf7Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new l05(this.g, this.h, this.i, this.j, lq4Var);
            default:
                return new l05(lq4Var, this.g, this.h, this.i, this.j);
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
        return ((l05) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
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
                rre rreVar = this.g;
                boolean z = !(rreVar.j() && rreVar.k()) && this.h;
                boolean z2 = this.i;
                rre rreVar2 = this.g;
                k05 k05Var = new k05(z, z2, rreVar2, null, this.j, 0);
                this.f = 1;
                Object objQ = rreVar2.q(z2, k05Var, this);
                return objQ == hu4Var ? hu4Var : objQ;
            default:
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
                cf7 cf7Var = this.j;
                boolean z3 = this.i;
                boolean z4 = this.h;
                rre rreVar3 = this.g;
                k05 k05Var2 = new k05(z3, z4, rreVar3, null, cf7Var, 1);
                this.f = 1;
                Object objQ2 = rreVar3.q(z4, k05Var2, this);
                return objQ2 == hu4Var ? hu4Var : objQ2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l05(rre rreVar, boolean z, boolean z2, cf7 cf7Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = rreVar;
        this.h = z;
        this.i = z2;
        this.j = cf7Var;
    }
}
