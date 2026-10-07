package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p05 extends mdh implements cf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ rre g;
    public final /* synthetic */ cf7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p05(rre rreVar, cf7 cf7Var, lq4 lq4Var, int i) {
        super(1, lq4Var);
        this.e = i;
        this.g = rreVar;
        this.h = cf7Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        int i = this.e;
        cf7 cf7Var = this.h;
        rre rreVar = this.g;
        switch (i) {
            case 0:
                return new p05(rreVar, cf7Var, lq4Var, 0);
            default:
                return new p05(rreVar, cf7Var, lq4Var, 1);
        }
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj;
        switch (i) {
            case 0:
                break;
        }
        return ((p05) create(lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        cf7 cf7Var = this.h;
        hu4 hu4Var = hu4.a;
        rre rreVar = this.g;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                l83 l83Var = new l83(null, cf7Var, rreVar);
                this.f = 1;
                Object objQ = rreVar.q(false, l83Var, this);
                return objQ == hu4Var ? hu4Var : objQ;
            default:
                int i3 = this.f;
                try {
                    if (i3 == 0) {
                        ch3.d0(obj);
                        rreVar.b();
                        this.f = 1;
                        obj = cf7Var.invoke(this);
                        if (obj == hu4Var) {
                            return hu4Var;
                        }
                    } else {
                        if (i3 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                    }
                    rreVar.p();
                    rreVar.f();
                    return obj;
                } catch (Throwable th) {
                    rreVar.f();
                    throw th;
                }
        }
    }
}
