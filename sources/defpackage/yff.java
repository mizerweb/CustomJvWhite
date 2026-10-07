package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yff extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ xde g;
    public final /* synthetic */ xyc h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yff(xde xdeVar, xyc xycVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = xdeVar;
        this.h = xycVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        xyc xycVar = this.h;
        xde xdeVar = this.g;
        switch (i) {
            case 0:
                return new yff(xdeVar, xycVar, lq4Var, 0);
            default:
                return new yff(xdeVar, xycVar, lq4Var, 1);
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
        return ((yff) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        xyc xycVar = this.h;
        xde xdeVar = this.g;
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
                xn3 xn3Var = (xn3) ((ny8) xdeVar.b).getValue();
                long j = xycVar.a;
                this.f = 1;
                Object objR = xn3Var.r(j, this);
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
                xn3 xn3Var2 = (xn3) ((ny8) xdeVar.b).getValue();
                long j2 = xycVar.a;
                this.f = 1;
                Object objR2 = xn3Var2.r(j2 ^ ((l7f) xn3Var2.d.getValue()).a(), this);
                return objR2 == hu4Var ? hu4Var : objR2;
        }
    }
}
