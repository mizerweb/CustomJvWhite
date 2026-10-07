package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class csa extends mdh implements qf7 {
    public int e;
    public final /* synthetic */ jsa f;
    public final /* synthetic */ long g;
    public final /* synthetic */ int h;
    public final /* synthetic */ long i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csa(jsa jsaVar, long j, int i, long j2, int i2, lq4 lq4Var) {
        super(2, lq4Var);
        this.f = jsaVar;
        this.g = j;
        this.h = i;
        this.i = j2;
        this.j = i2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new csa(this.f, this.g, this.h, this.i, this.j, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((csa) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        if (i != 0) {
            if (i == 1) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        jsa jsaVar = this.f;
        xn3 xn3Var = jsaVar.l;
        long j = jsaVar.c.a;
        this.e = 1;
        Object objC = xn3Var.j().c(j, false, new wn3(this.g, this.h, this.i, this.j, null), this);
        hu4 hu4Var = hu4.a;
        if (objC != hu4Var) {
            objC = sbiVar;
        }
        return objC == hu4Var ? hu4Var : sbiVar;
    }
}
