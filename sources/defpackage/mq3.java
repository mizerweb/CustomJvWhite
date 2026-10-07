package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mq3 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Throwable f;
    public final /* synthetic */ pq3 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mq3(pq3 pq3Var, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.g = pq3Var;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) throws Throwable {
        int i = this.e;
        sbi sbiVar = sbi.a;
        pq3 pq3Var = this.g;
        Throwable th = (Throwable) obj2;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                mq3 mq3Var = new mq3(pq3Var, lq4Var, 0);
                mq3Var.f = th;
                mq3Var.invokeSuspend(sbiVar);
                throw null;
            default:
                mq3 mq3Var2 = new mq3(pq3Var, lq4Var, 1);
                mq3Var2.f = th;
                mq3Var2.invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.e;
        pq3 pq3Var = this.g;
        Throwable th = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                gm0.r((String) pq3Var.i, "big_flow: fail", th);
                throw th;
            default:
                ch3.d0(obj);
                String str = (String) pq3Var.i;
                if (th != null) {
                    gm0.V(str, "big_flow: completion", th);
                } else {
                    gm0.n(str, "big_flow: completion");
                }
                return sbi.a;
        }
    }
}
