package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class roi extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ gpi g;
    public final /* synthetic */ zyg h;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ roi(gpi gpiVar, zyg zygVar, boolean z, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = gpiVar;
        this.h = zygVar;
        this.i = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new roi(this.g, this.h, this.i, lq4Var, 0);
            default:
                return new roi(this.g, this.h, this.i, lq4Var, 1);
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
        return ((roi) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        boolean z = this.i;
        zyg zygVar = this.h;
        gpi gpiVar = this.g;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                long j = zygVar.a;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    if (((nj4) gpiVar.t.getValue()).c(j, !z, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                if (z) {
                    return sbiVar;
                }
                a8j.x(gpiVar.r1, new upi(j));
                return sbiVar;
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
                nj4 nj4Var = (nj4) gpiVar.t.getValue();
                long j2 = zygVar.a;
                this.f = 1;
                return nj4Var.c(j2, z, this) == hu4Var ? hu4Var : sbiVar;
        }
    }
}
