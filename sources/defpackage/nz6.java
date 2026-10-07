package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nz6 implements yx6 {
    public final /* synthetic */ ufe a;
    public final /* synthetic */ int b;
    public final /* synthetic */ yx6 c;

    public nz6(ufe ufeVar, int i, yx6 yx6Var) {
        this.a = ufeVar;
        this.b = i;
        this.c = yx6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        mz6 mz6Var;
        if (lq4Var instanceof mz6) {
            mz6Var = (mz6) lq4Var;
            int i = mz6Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                mz6Var.f = i - Integer.MIN_VALUE;
            } else {
                mz6Var = new mz6(this, lq4Var);
            }
        } else {
            mz6Var = new mz6(this, lq4Var);
        }
        Object obj2 = mz6Var.d;
        int i2 = mz6Var.f;
        sbi sbiVar = sbi.a;
        if (i2 != 0) {
            if (i2 == 1) {
                ch3.d0(obj2);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj2);
        ufe ufeVar = this.a;
        int i3 = ufeVar.a;
        if (i3 < this.b) {
            ufeVar.a = i3 + 1;
            return sbiVar;
        }
        mz6Var.f = 1;
        Object objEmit = this.c.emit(obj, mz6Var);
        hu4 hu4Var = hu4.a;
        return objEmit == hu4Var ? hu4Var : sbiVar;
    }
}
