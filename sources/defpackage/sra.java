package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sra extends mdh implements vf7 {
    public int e;
    public /* synthetic */ rt2 f;
    public /* synthetic */ opa g;
    public final /* synthetic */ jsa h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sra(lq4 lq4Var, jsa jsaVar) {
        super(4, lq4Var);
        this.h = jsaVar;
    }

    @Override // defpackage.vf7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        sra sraVar = new sra((lq4) obj4, this.h);
        sraVar.f = (rt2) obj;
        sraVar.g = (opa) obj2;
        return sraVar.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        rt2 rt2Var = this.f;
        opa opaVar = this.g;
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
        jsa jsaVar = this.h;
        dc9 dc9Var = jsaVar.h2;
        t73 t73Var = jsaVar.d;
        this.f = null;
        this.g = null;
        this.e = 1;
        Object objF = dc9Var.F(rt2Var, t73Var, opaVar, this);
        hu4 hu4Var = hu4.a;
        return objF == hu4Var ? hu4Var : objF;
    }
}
