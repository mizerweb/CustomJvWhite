package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n10 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ y10 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n10(y10 y10Var, long j, boolean z, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = y10Var;
        this.h = j;
        this.i = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new n10(this.g, this.h, this.i, lq4Var, 0);
            default:
                return new n10(this.g, this.h, this.i, lq4Var, 1);
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
        return ((n10) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
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
                y10 y10Var = this.g;
                xhe xheVar = y10Var.e;
                this.f = 1;
                Object objR = y10Var.r(xheVar, this.h, this.i, this);
                return objR == hu4Var ? hu4Var : objR;
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
                y10 y10Var2 = this.g;
                xhe xheVar2 = y10Var2.e;
                this.f = 1;
                Object objT = y10Var2.t(xheVar2, this.h, this.i, this);
                return objT == hu4Var ? hu4Var : objT;
        }
    }
}
