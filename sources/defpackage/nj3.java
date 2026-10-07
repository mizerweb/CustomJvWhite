package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nj3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ fk3 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nj3(fk3 fk3Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = fk3Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        fk3 fk3Var = this.g;
        switch (i) {
            case 0:
                return new nj3(fk3Var, lq4Var, 0);
            case 1:
                return new nj3(fk3Var, lq4Var, 1);
            default:
                return new nj3(fk3Var, lq4Var, 2);
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
        return ((nj3) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        fk3 fk3Var = this.g;
        hu4 hu4Var = hu4.a;
        sbi sbiVar = sbi.a;
        int i2 = 1;
        lq4 lq4Var = null;
        switch (i) {
            case 0:
                mjg mjgVar = fk3Var.E;
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    iae iaeVar = fk3Var.c;
                    this.f = 1;
                    Object objK0 = yab.K0(((n0c) ((xhh) iaeVar.c.getValue())).b(), new fz5(iaeVar, lq4Var, i2), this);
                    if (objK0 != hu4Var) {
                        objK0 = sbiVar;
                    }
                    if (objK0 == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                jj3 jj3Var = (jj3) mjgVar.getValue();
                l48 l48Var = jj3Var.c;
                jj3 jj3VarA = jj3.a(jj3Var, null, new l48(l48Var.a, r66.a, l48Var.c), null, false, false, false, 123);
                mjgVar.getClass();
                mjgVar.j(null, jj3VarA);
                return sbiVar;
            case 1:
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    zv8[] zv8VarArr = fk3.y1;
                    xn3 xn3VarE = fk3Var.E();
                    this.f = 1;
                    Object objD = xn3VarE.j().d(this);
                    if (objD != hu4Var) {
                        objD = sbiVar;
                    }
                    if (objD == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i4 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbiVar;
            default:
                int i5 = this.f;
                if (i5 == 0) {
                    ch3.d0(obj);
                    mjg mjgVar2 = fk3Var.H;
                    Boolean bool = Boolean.TRUE;
                    this.f = 1;
                    mjgVar2.getClass();
                    mjgVar2.j(null, bool);
                    if (sbiVar == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i5 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbiVar;
        }
    }
}
