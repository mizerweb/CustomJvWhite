package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kte extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ wfe g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kte(wfe wfeVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = wfeVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        wfe wfeVar = this.g;
        switch (i) {
            case 0:
                return new kte(wfeVar, lq4Var, 0);
            default:
                return new kte(wfeVar, lq4Var, 1);
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
        return ((kte) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object objA;
        int i = this.e;
        wfe wfeVar = this.g;
        hu4 hu4Var = hu4.a;
        lq4 lq4Var = null;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    r7 r7Var = r7.a;
                    ha9 ha9Var = (ha9) wfeVar.a;
                    this.f = 1;
                    objA = r7Var.a(ha9Var, this);
                    if (objA == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                    objA = ((y6) obj).a;
                }
                return new y6((r3f) objA);
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
                ghb ghbVar = ew5.b;
                long jO = qe7.O(10, lw5.SECONDS);
                kte kteVar = new kte(wfeVar, lq4Var, 0);
                this.f = 1;
                Object objM0 = lvb.M0(jO, kteVar, this);
                return objM0 == hu4Var ? hu4Var : objM0;
        }
    }
}
