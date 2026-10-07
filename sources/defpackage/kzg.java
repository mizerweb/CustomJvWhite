package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kzg extends mdh implements tf7 {
    public int e;
    public /* synthetic */ Throwable f;
    public final /* synthetic */ nzg g;
    public final /* synthetic */ yx6 h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzg(nzg nzgVar, yx6 yx6Var, long j, lq4 lq4Var) {
        super(3, lq4Var);
        this.g = nzgVar;
        this.h = yx6Var;
        this.i = j;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        yx6 yx6Var = this.h;
        long j = this.i;
        kzg kzgVar = new kzg(this.g, yx6Var, j, (lq4) obj3);
        kzgVar.f = (Throwable) obj2;
        return kzgVar.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.f;
        hu4 hu4Var = hu4.a;
        int i = this.e;
        if (i == 0) {
            ch3.d0(obj);
            String str = this.g.e;
            long j = this.i;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, nbh.s(j, "Draft #", ": renderer flow threw"), th);
                }
            }
            yx6 yx6Var = this.h;
            gzg gzgVar = new gzg(th);
            this.f = null;
            this.e = 1;
            if (yx6Var.emit(gzgVar, this) == hu4Var) {
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
