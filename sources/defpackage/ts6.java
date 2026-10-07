package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ts6 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ us6 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ts6(us6 us6Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = us6Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        us6 us6Var = this.g;
        switch (i) {
            case 0:
                return new ts6(us6Var, lq4Var, 0);
            default:
                return new ts6(us6Var, lq4Var, 1);
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
        return ((ts6) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        ss6 ss6Var = ss6.a;
        us6 us6Var = this.g;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    pzf pzfVar = us6Var.b;
                    this.f = 1;
                    return pzfVar.emit(ss6Var, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i2 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    pzf pzfVar2 = us6Var.b;
                    this.f = 1;
                    return pzfVar2.emit(ss6Var, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i3 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
