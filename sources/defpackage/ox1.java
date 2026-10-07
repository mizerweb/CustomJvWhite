package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ox1 extends mdh implements qf7 {
    public int e;
    public /* synthetic */ boolean f;

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        ox1 ox1Var = new ox1(2, lq4Var);
        ox1Var.f = ((Boolean) obj).booleanValue();
        return ox1Var;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((ox1) create(bool, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        boolean z = this.f;
        int i = this.e;
        if (i == 0) {
            ch3.d0(obj);
            if (!z) {
                return null;
            }
            this.f = z;
            this.e = 1;
            Object objT = rx8.t(10000L, this);
            hu4 hu4Var = hu4.a;
            if (objT == hu4Var) {
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
