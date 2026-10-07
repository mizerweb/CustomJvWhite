package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m05 extends mdh implements qf7 {
    public int e;
    public final /* synthetic */ vt4 f;
    public final /* synthetic */ rre g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ cf7 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m05(vt4 vt4Var, rre rreVar, boolean z, boolean z2, cf7 cf7Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.f = vt4Var;
        this.g = rreVar;
        this.h = z;
        this.i = z2;
        this.j = cf7Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new m05(this.f, this.g, this.h, this.i, this.j, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((m05) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
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
        l05 l05Var = new l05(this.g, this.h, this.i, this.j, (lq4) null);
        this.e = 1;
        Object objK0 = yab.K0(this.f, l05Var, this);
        hu4 hu4Var = hu4.a;
        return objK0 == hu4Var ? hu4Var : objK0;
    }
}
