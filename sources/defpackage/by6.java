package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class by6 implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ njd b;

    public /* synthetic */ by6(njd njdVar, int i) {
        this.a = i;
        this.b = njdVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        wy6 wy6Var;
        int i = this.a;
        sbi sbiVar = sbi.a;
        njd njdVar = this.b;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                Object objA = njdVar.f.a(lq4Var, obj);
                return objA == hu4Var ? objA : sbiVar;
            case 1:
                Object objA2 = njdVar.f.a(lq4Var, obj);
                return objA2 == hu4Var ? objA2 : sbiVar;
            default:
                if (lq4Var instanceof wy6) {
                    wy6Var = (wy6) lq4Var;
                    int i2 = wy6Var.f;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        wy6Var.f = i2 - Integer.MIN_VALUE;
                    } else {
                        wy6Var = new wy6(this, lq4Var);
                    }
                } else {
                    wy6Var = new wy6(this, lq4Var);
                }
                Object obj2 = wy6Var.d;
                int i3 = wy6Var.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj2);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj2);
                if (obj == null) {
                    obj = vd7.e;
                }
                wy6Var.f = 1;
                return njdVar.f.a(wy6Var, obj) == hu4Var ? hu4Var : sbiVar;
        }
    }
}
