package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kjg extends mdh implements qf7 {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ dz6 g;
    public final /* synthetic */ wfe h;
    public final /* synthetic */ yx6 i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjg(dz6 dz6Var, wfe wfeVar, yx6 yx6Var, long j, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = dz6Var;
        this.h = wfeVar;
        this.i = yx6Var;
        this.j = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        kjg kjgVar = new kjg(this.g, this.h, this.i, this.j, lq4Var);
        kjgVar.f = obj;
        return kjgVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((kjg) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        gu4 gu4Var = (gu4) this.f;
        int i = this.e;
        if (i == 0) {
            ch3.d0(obj);
            jjg jjgVar = new jjg(this.h, this.i, gu4Var, this.j);
            this.f = null;
            this.e = 1;
            Object objCollect = this.g.collect(jjgVar, this);
            hu4 hu4Var = hu4.a;
            if (objCollect == hu4Var) {
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
