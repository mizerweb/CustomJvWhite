package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hjg extends mdh implements qf7 {
    public int e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hjg(long j, lq4 lq4Var) {
        super(2, lq4Var);
        this.f = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new hjg(this.f, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((hjg) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            ch3.d0(obj);
            this.e = 1;
            Object objU = rx8.u(this.f, this);
            hu4 hu4Var = hu4.a;
            if (objU == hu4Var) {
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
