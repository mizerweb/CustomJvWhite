package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cm6 extends mdh implements cf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ long g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cm6(Object obj, long j, int i, lq4 lq4Var, int i2) {
        super(1, lq4Var);
        this.e = i2;
        this.i = obj;
        this.g = j;
        this.h = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        int i = this.e;
        Object obj = this.i;
        switch (i) {
            case 0:
                return new cm6((dm6) obj, this.g, this.h, lq4Var, 0);
            default:
                return new cm6((an6) obj, this.g, this.h, lq4Var, 1);
        }
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj;
        switch (i) {
            case 0:
                break;
        }
        return ((cm6) create(lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        int i2 = this.h;
        long j = this.g;
        Object obj2 = this.i;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return dm6.h((dm6) obj2, j, i2, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i3 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return an6.g((an6) obj2, j, i2, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i4 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
