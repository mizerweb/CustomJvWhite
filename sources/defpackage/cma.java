package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cma extends mdh implements vf7 {
    public int e;
    public /* synthetic */ gla f;
    public /* synthetic */ jla g;
    public /* synthetic */ boolean h;
    public final /* synthetic */ nma i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cma(nma nmaVar, lq4 lq4Var) {
        super(4, lq4Var);
        this.i = nmaVar;
    }

    @Override // defpackage.vf7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        cma cmaVar = new cma(this.i, (lq4) obj4);
        cmaVar.f = (gla) obj;
        cmaVar.g = (jla) obj2;
        cmaVar.h = zBooleanValue;
        return cmaVar.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        gla glaVar = this.f;
        jla jlaVar = this.g;
        boolean z = this.h;
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
        this.f = null;
        this.g = null;
        this.h = z;
        this.e = 1;
        Object objB = nma.B(this.i, glaVar, jlaVar, z, this);
        hu4 hu4Var = hu4.a;
        return objB == hu4Var ? hu4Var : objB;
    }
}
