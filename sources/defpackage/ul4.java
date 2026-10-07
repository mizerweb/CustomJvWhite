package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ul4 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ vl4 g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ul4(vl4 vl4Var, boolean z, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = vl4Var;
        this.h = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        boolean z = this.h;
        vl4 vl4Var = this.g;
        switch (i) {
            case 0:
                return new ul4(vl4Var, z, lq4Var, 0);
            default:
                return new ul4(vl4Var, z, lq4Var, 1);
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
        return ((ul4) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        boolean z = this.h;
        hu4 hu4Var = hu4.a;
        vl4 vl4Var = this.g;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return ((nj4) vl4Var.C.getValue()).c(vl4Var.a, z ^ true, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i2 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
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
                nj4 nj4Var = (nj4) vl4Var.C.getValue();
                long j = vl4Var.a;
                this.f = 1;
                return nj4Var.c(j, z, this) == hu4Var ? hu4Var : sbiVar;
        }
    }
}
