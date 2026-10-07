package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jjg implements yx6 {
    public final /* synthetic */ wfe a;
    public final /* synthetic */ yx6 b;
    public final /* synthetic */ gu4 c;
    public final /* synthetic */ long d;

    public jjg(wfe wfeVar, yx6 yx6Var, gu4 gu4Var, long j) {
        this.a = wfeVar;
        this.b = yx6Var;
        this.c = gu4Var;
        this.d = j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        ijg ijgVar;
        if (lq4Var instanceof ijg) {
            ijgVar = (ijg) lq4Var;
            int i = ijgVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ijgVar.f = i - Integer.MIN_VALUE;
            } else {
                ijgVar = new ijg(this, lq4Var);
            }
        } else {
            ijgVar = new ijg(this, lq4Var);
        }
        Object obj2 = ijgVar.d;
        int i2 = ijgVar.f;
        wfe wfeVar = this.a;
        if (i2 == 0) {
            ch3.d0(obj2);
            if (!((vo8) wfeVar.a).isActive()) {
                ijgVar.f = 1;
                Object objEmit = this.b.emit(obj, ijgVar);
                hu4 hu4Var = hu4.a;
                if (objEmit == hu4Var) {
                    return hu4Var;
                }
            }
            return sbi.a;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj2);
        wfeVar.a = yab.i0(this.c, null, 0, new hjg(this.d, null), 3);
        return sbi.a;
    }
}
