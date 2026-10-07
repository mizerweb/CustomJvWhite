package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sr9 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public p41 f;
    public long g;
    public int h;
    public final /* synthetic */ as9 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sr9(as9 as9Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = as9Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        as9 as9Var = this.i;
        switch (i) {
            case 0:
                return new sr9(as9Var, lq4Var, 0);
            default:
                return new sr9(as9Var, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((sr9) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        p41 p41Var;
        p41 p41Var2;
        int i = this.e;
        sbi sbiVar = sbi.a;
        long j = 1;
        as9 as9Var = this.i;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.h;
                if (i2 == 0) {
                    ch3.d0(obj);
                    p41Var = as9Var.r;
                    this.f = p41Var;
                    this.g = 1L;
                    this.h = 1;
                    obj = as9.B(as9Var, this);
                    if (obj != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = this.g;
                p41Var = this.f;
                ch3.d0(obj);
                br9 br9Var = new br9(j, vol.c((rt2) obj));
                this.f = null;
                this.h = 2;
                if (p41Var.a(this, br9Var) != hu4Var) {
                    return sbiVar;
                }
                return hu4Var;
            default:
                int i3 = this.h;
                if (i3 == 0) {
                    ch3.d0(obj);
                    p41Var2 = as9Var.r;
                    this.f = p41Var2;
                    this.g = 1L;
                    this.h = 1;
                    obj = as9.B(as9Var, this);
                    if (obj != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = this.g;
                p41Var2 = this.f;
                ch3.d0(obj);
                br9 br9Var2 = new br9(j, vol.c((rt2) obj));
                this.f = null;
                this.h = 2;
                if (p41Var2.a(this, br9Var2) != hu4Var) {
                    return sbiVar;
                }
                return hu4Var;
        }
    }
}
