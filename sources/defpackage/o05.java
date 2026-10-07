package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o05 extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ cf7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o05(lq4 lq4Var, cf7 cf7Var) {
        super(2, lq4Var);
        this.h = cf7Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                o05 o05Var = new o05(lq4Var, this.h);
                o05Var.g = obj;
                return o05Var;
            default:
                o05 o05Var2 = new o05(this.h, lq4Var);
                o05Var2.g = obj;
                return o05Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((o05) create((nzh) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((o05) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        cf7 cf7Var = this.h;
        hu4 hu4Var = hu4.a;
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
                this.f = 1;
                Object objInvoke = cf7Var.invoke(this);
                return objInvoke == hu4Var ? hu4Var : objInvoke;
            default:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    if (((gu4) this.g).k().x0(mzh.b) != null) {
                        this.f = 1;
                        Object objInvoke2 = cf7Var.invoke(this);
                        return objInvoke2 == hu4Var ? hu4Var : objInvoke2;
                    }
                    ore.k("Expected a TransactionElement in the CoroutineContext but none was found.");
                } else {
                    if (i3 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o05(cf7 cf7Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = cf7Var;
    }
}
