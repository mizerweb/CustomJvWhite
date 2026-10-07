package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cff implements yx6 {
    public final /* synthetic */ yx6 a;
    public final /* synthetic */ hff b;
    public final /* synthetic */ boolean c;

    public cff(yx6 yx6Var, hff hffVar, boolean z) {
        this.a = yx6Var;
        this.b = hffVar;
        this.c = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        bff bffVar;
        if (lq4Var instanceof bff) {
            bffVar = (bff) lq4Var;
            int i = bffVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bffVar.e = i - Integer.MIN_VALUE;
            } else {
                bffVar = new bff(this, lq4Var);
            }
        } else {
            bffVar = new bff(this, lq4Var);
        }
        Object obj2 = bffVar.d;
        int i2 = bffVar.e;
        if (i2 == 0) {
            ch3.d0(obj2);
            Boolean boolValueOf = Boolean.valueOf(((Boolean) obj).booleanValue() || this.b.d.E() || this.c);
            bffVar.e = 1;
            Object objEmit = this.a.emit(boolValueOf, bffVar);
            hu4 hu4Var = hu4.a;
            if (objEmit == hu4Var) {
                return hu4Var;
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
