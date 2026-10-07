package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bm6 extends mdh implements cf7 {
    public int e;
    public final /* synthetic */ dm6 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm6(dm6 dm6Var, long j, long j2, lq4 lq4Var) {
        super(1, lq4Var);
        this.f = dm6Var;
        this.g = j;
        this.h = j2;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        return new bm6(this.f, this.g, this.h, lq4Var);
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        return ((bm6) create((lq4) obj)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            ch3.d0(obj);
            this.e = 1;
            Object objI = dm6.i(this.f, this.g, this.h, this);
            hu4 hu4Var = hu4.a;
            if (objI == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }
}
