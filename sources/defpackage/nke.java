package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nke extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ z18 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nke(z18 z18Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = z18Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        z18 z18Var = this.g;
        switch (i) {
            case 0:
                return new nke(z18Var, lq4Var, 0);
            case 1:
                return new nke(z18Var, lq4Var, 1);
            default:
                return new nke(z18Var, lq4Var, 2);
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
            case 1:
                break;
        }
        return ((nke) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        kx2 kx2Var;
        int i = this.e;
        z18 z18Var = this.g;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        lq4 lq4Var = null;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    jz jzVar = new jz((gjg) z18Var.c, 13);
                    this.f = 1;
                    obj = e9i.N(jzVar, this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                nx2 nx2Var = ((rt2) obj).b;
                if (nx2Var == null || nx2Var.b != lx2.b || (kx2Var = nx2Var.c) != kx2.a || kx2Var == kx2.h || (nx2Var.q0 & 1) == 0) {
                    return sbiVar;
                }
                mjg mjgVar = (mjg) z18Var.f;
                ((qke) mjgVar.getValue()).getClass();
                qke qkeVar = new qke(true);
                mjgVar.getClass();
                mjgVar.j(null, qkeVar);
                yab.i0((gu4) z18Var.a, null, 0, new nke(z18Var, lq4Var, 2), 3);
                return sbiVar;
            case 1:
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                z18 z18Var2 = this.g;
                rt2 rt2Var = (rt2) ((gjg) z18Var2.c).getValue();
                if (rt2Var == null) {
                    return sbiVar;
                }
                long jA = rt2Var.A();
                zhb zhbVar = zhb.b;
                oke okeVar = new oke(z18Var2, jA, null, 0);
                this.f = 1;
                return yab.K0(zhbVar, okeVar, this) == hu4Var ? hu4Var : sbiVar;
            default:
                int i4 = this.f;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                to5 to5VarP = sb8.p((gjg) z18Var.c, new skd(19), sb8.c);
                dtd dtdVar = new dtd(z18Var, lq4Var, 10);
                this.f = 1;
                return e9i.z(to5VarP, dtdVar, this) == hu4Var ? hu4Var : sbiVar;
        }
    }
}
