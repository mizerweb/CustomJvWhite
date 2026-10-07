package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zqe extends mdh implements cf7 {
    public int e;
    public final /* synthetic */ bre f;
    public final /* synthetic */ rqe g;
    public final /* synthetic */ m8b h;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zqe(bre breVar, rqe rqeVar, m8b m8bVar, boolean z, lq4 lq4Var) {
        super(1, lq4Var);
        this.f = breVar;
        this.g = rqeVar;
        this.h = m8bVar;
        this.i = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        return new zqe(this.f, this.g, this.h, this.i, lq4Var);
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        return ((zqe) create((lq4) obj)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            ch3.d0(obj);
            this.e = 1;
            Object objE = bre.e(this.f, this.g, this.h, this.i, this);
            hu4 hu4Var = hu4.a;
            if (objE == hu4Var) {
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
