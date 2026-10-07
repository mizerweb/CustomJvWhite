package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xef extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ hff g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xef(hff hffVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = hffVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        hff hffVar = this.g;
        switch (i) {
            case 0:
                return new xef(hffVar, lq4Var, 0);
            default:
                return new xef(hffVar, lq4Var, 1);
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
        return ((xef) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        hff hffVar = this.g;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return hff.B(hffVar, this) == hu4Var ? hu4Var : sbiVar;
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
                    jz jzVar = new jz(hffVar.u, 13);
                    this.f = 1;
                    obj = e9i.N(jzVar, this);
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
                rt2 rt2Var = (rt2) obj;
                zv8[] zv8VarArr = hff.C;
                if (!sol.a(rt2Var, (wo6) hffVar.g.getValue())) {
                    return sbiVar;
                }
                a8j.x(hffVar.x, new sef(vol.c(rt2Var)));
                return sbiVar;
        }
    }
}
