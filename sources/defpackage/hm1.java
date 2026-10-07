package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hm1 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ km1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hm1(km1 km1Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = km1Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        km1 km1Var = this.h;
        switch (i) {
            case 0:
                hm1 hm1Var = new hm1(km1Var, lq4Var, 0);
                hm1Var.g = obj;
                return hm1Var;
            default:
                hm1 hm1Var2 = new hm1(km1Var, lq4Var, 1);
                hm1Var2.g = obj;
                return hm1Var2;
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
        return ((hm1) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        int i = this.e;
        hu4 hu4Var = hu4.a;
        km1 km1Var = this.h;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                x02 x02Var = km1Var.m;
                mjg mjgVar = km1Var.n;
                gu4 gu4Var = (gu4) this.g;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    this.g = gu4Var;
                    this.f = 1;
                    if (km1.B(km1Var, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                if (km1Var.e.i(km1Var.d) == null) {
                    do {
                        value2 = mjgVar.getValue();
                    } while (!mjgVar.h(value2, new fm1(false, false)));
                } else {
                    pi6 pi6Var = ((dz4) x02Var.z().getValue()).q;
                    if ((pi6Var instanceof ii6) || (pi6Var instanceof hi6) || (pi6Var instanceof ki6)) {
                        do {
                            value = mjgVar.getValue();
                        } while (!mjgVar.h(value, new fm1(false, false)));
                    } else {
                        e9i.j0(new r07(x02Var.b(), km1Var.q, new d3(km1Var, null, 3), 0), gu4Var);
                    }
                }
                return sbiVar;
            default:
                gu4 gu4Var2 = (gu4) this.g;
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    gjg gjgVarZ = km1Var.m.z();
                    he heVar = new he(gu4Var2, 6, km1Var);
                    this.g = null;
                    this.f = 1;
                    Object objCollect = gjgVarZ.collect(new o5(heVar, 19), this);
                    if (objCollect != hu4Var) {
                        objCollect = sbiVar;
                    }
                    if (objCollect == hu4Var) {
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
