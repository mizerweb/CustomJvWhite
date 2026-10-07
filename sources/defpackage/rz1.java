package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rz1 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ yx6 g;
    public /* synthetic */ Object h;
    public final /* synthetic */ ny8 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rz1(int i, lq4 lq4Var, ny8 ny8Var) {
        super(3, lq4Var);
        this.e = i;
        this.i = ny8Var;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        ny8 ny8Var = this.i;
        yx6 yx6Var = (yx6) obj;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                rz1 rz1Var = new rz1(0, lq4Var, ny8Var);
                rz1Var.g = yx6Var;
                rz1Var.h = obj2;
                return rz1Var.invokeSuspend(sbiVar);
            default:
                rz1 rz1Var2 = new rz1(1, lq4Var, ny8Var);
                rz1Var2.g = yx6Var;
                rz1Var2.h = obj2;
                return rz1Var2.invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        ny8 ny8Var = this.i;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    yx6 yx6Var = this.g;
                    be1 be1Var = (be1) this.h;
                    xn3 xn3Var = (xn3) ny8Var.getValue();
                    Long l = be1Var.a;
                    if (l != null) {
                        r8e r8eVarK = xn3Var.k(l.longValue());
                        this.g = null;
                        this.h = null;
                        this.f = 1;
                        return e9i.L(yx6Var, r8eVarK, this) == hu4Var ? hu4Var : sbiVar;
                    }
                    ore.p("Required value was null.");
                } else {
                    if (i2 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
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
                yx6 yx6Var2 = this.g;
                Long l2 = (Long) this.h;
                xx6 r8eVar = l2 != null ? new r8e((f9b) ((n0h) ny8Var.getValue()).d.computeIfAbsent(l2, new am(22, new chf(25)))) : new tz(7, f0h.a);
                this.g = null;
                this.h = null;
                this.f = 1;
                return e9i.L(yx6Var2, r8eVar, this) == hu4Var ? hu4Var : sbiVar;
        }
    }
}
