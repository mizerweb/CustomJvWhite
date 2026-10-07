package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e24 extends mdh implements cf7 {
    public int e;
    public final /* synthetic */ g24 f;
    public final /* synthetic */ q24 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ dz3 i;
    public final /* synthetic */ xfa j;
    public final /* synthetic */ Long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e24(g24 g24Var, q24 q24Var, long j, dz3 dz3Var, xfa xfaVar, Long l, lq4 lq4Var) {
        super(1, lq4Var);
        this.f = g24Var;
        this.g = q24Var;
        this.h = j;
        this.i = dz3Var;
        this.j = xfaVar;
        this.k = l;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        return new e24(this.f, this.g, this.h, this.i, this.j, this.k, lq4Var);
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        return ((e24) create((lq4) obj)).invokeSuspend(sbi.a);
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
        Object objF = g24.f(this.f, this.g, this.h, this.i, this.j, this.k, this);
        hu4 hu4Var = hu4.a;
        return objF == hu4Var ? hu4Var : objF;
    }
}
