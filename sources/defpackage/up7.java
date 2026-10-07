package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class up7 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ j28 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ up7(j28 j28Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = j28Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new up7(this.g, lq4Var, 0);
            default:
                return new up7(this.g, lq4Var, 1);
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
        return ((up7) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        j28 j28Var = this.g;
        hu4 hu4Var = hu4.a;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    j28Var.w();
                    if (sbiVar == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbiVar;
            default:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    j28Var.w();
                    if (sbiVar == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbiVar;
        }
    }
}
