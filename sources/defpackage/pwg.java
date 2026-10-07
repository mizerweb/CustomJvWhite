package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pwg extends mdh implements cf7 {
    public int e;
    public final /* synthetic */ qwg f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwg(qwg qwgVar, long j, lq4 lq4Var) {
        super(1, lq4Var);
        this.f = qwgVar;
        this.g = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        return new pwg(this.f, this.g, lq4Var);
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        return ((pwg) create((lq4) obj)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                ch3.d0(obj);
                return obj;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        this.e = 1;
        Object objF = qwg.f(this.f, this.g, this);
        hu4 hu4Var = hu4.a;
        return objF == hu4Var ? hu4Var : objF;
    }
}
