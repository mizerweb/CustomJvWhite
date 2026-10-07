package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sei extends mdh implements tf7 {
    public int e;
    public /* synthetic */ long f;
    public /* synthetic */ cf7 g;
    public final /* synthetic */ vei h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sei(vei veiVar, lq4 lq4Var) {
        super(3, lq4Var);
        this.h = veiVar;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        long jLongValue = ((Number) obj).longValue();
        sei seiVar = new sei(this.h, (lq4) obj3);
        seiVar.f = jLongValue;
        seiVar.g = (cf7) obj2;
        return seiVar.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        long j = this.f;
        cf7 cf7Var = this.g;
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
        no4 no4Var = (no4) this.h.b.getValue();
        this.g = null;
        this.f = j;
        this.e = 1;
        Object objB = no4Var.b(j, cf7Var, this);
        hu4 hu4Var = hu4.a;
        return objB == hu4Var ? hu4Var : objB;
    }
}
