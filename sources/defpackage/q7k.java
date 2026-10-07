package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q7k extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ xde g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q7k(xde xdeVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = xdeVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        xde xdeVar = this.g;
        switch (i) {
            case 0:
                return new q7k(xdeVar, lq4Var, 0);
            default:
                return new q7k(xdeVar, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        xde xdeVar = this.g;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                return new q7k(xdeVar, lq4Var, 0).invokeSuspend(sbiVar);
            default:
                return new q7k(xdeVar, lq4Var, 1).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object objF;
        int i = this.e;
        xde xdeVar = this.g;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    g7k g7kVar = (g7k) xdeVar.c;
                    this.f = 1;
                    if (g7kVar.e(this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbi.a;
            default:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    g7k g7kVar2 = (g7k) xdeVar.c;
                    this.f = 1;
                    objF = g7kVar2.f(this);
                    if (objF == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                    objF = ((m4k) obj).a;
                }
                return new m4k((String) objF);
        }
    }
}
