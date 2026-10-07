package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class toj implements yx6 {
    public final /* synthetic */ yx6 a;
    public final /* synthetic */ long b;

    public toj(yx6 yx6Var, long j) {
        this.a = yx6Var;
        this.b = j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        soj sojVar;
        if (lq4Var instanceof soj) {
            sojVar = (soj) lq4Var;
            int i = sojVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                sojVar.e = i - Integer.MIN_VALUE;
            } else {
                sojVar = new soj(this, lq4Var);
            }
        } else {
            sojVar = new soj(this, lq4Var);
        }
        Object obj2 = sojVar.d;
        int i2 = sojVar.e;
        if (i2 == 0) {
            ch3.d0(obj2);
            if (this.b == ((roj) obj).a()) {
                sojVar.e = 1;
                Object objEmit = this.a.emit(obj, sojVar);
                hu4 hu4Var = hu4.a;
                if (objEmit == hu4Var) {
                    return hu4Var;
                }
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj2);
        }
        return sbi.a;
    }
}
