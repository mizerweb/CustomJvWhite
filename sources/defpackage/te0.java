package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class te0 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ ve0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ te0(ve0 ve0Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = ve0Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new te0(this.g, lq4Var, 0);
            default:
                return new te0(this.g, lq4Var, 1);
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
        return ((te0) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        ve0 ve0Var = this.g;
        lw5 lw5Var = lw5.MILLISECONDS;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    ghb ghbVar = ew5.b;
                    long jP = qe7.P(300L, lw5Var);
                    this.f = 1;
                    if (rx8.u(jP, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                ve0Var.e.invoke(spi.a);
                return sbiVar;
            default:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    ghb ghbVar2 = ew5.b;
                    long jP2 = qe7.P(2000L, lw5Var);
                    this.f = 1;
                    if (rx8.u(jP2, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                ve0Var.e.invoke(rpi.a);
                return sbiVar;
        }
    }
}
