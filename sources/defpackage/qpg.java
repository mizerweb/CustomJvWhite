package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qpg extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ tpg g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qpg(tpg tpgVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = tpgVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        tpg tpgVar = this.g;
        switch (i) {
            case 0:
                return new qpg(tpgVar, lq4Var, 0);
            default:
                return new qpg(tpgVar, lq4Var, 1);
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
        return ((qpg) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        tpg tpgVar = this.g;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    wae waeVar = (wae) tpgVar.e.getValue();
                    this.f = 1;
                    return waeVar.f(this) == hu4Var ? hu4Var : sbiVar;
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
                    xn3 xn3Var = (xn3) tpgVar.j.getValue();
                    long jK = ((f5d) ((wo6) tpgVar.i.getValue())).k();
                    this.f = 1;
                    obj = xn3Var.r(jK, this);
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
                ic6 ic6Var = tpgVar.t;
                rw8 rw8Var = rw8.b;
                long j = ((rt2) obj).a;
                rw8Var.getClass();
                bc1.q(":chats?id=" + j + "&type=local", ic6Var);
                return sbiVar;
        }
    }
}
