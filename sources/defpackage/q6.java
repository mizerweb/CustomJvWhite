package defpackage;

import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes.dex */
public final class q6 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ AccountInitializer g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q6(AccountInitializer accountInitializer, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = accountInitializer;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        AccountInitializer accountInitializer = this.g;
        switch (i) {
            case 0:
                return new q6(accountInitializer, lq4Var, 0);
            default:
                return new q6(accountInitializer, lq4Var, 1);
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
        return ((q6) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00cc  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object objC;
        switch (this.e) {
            case 0:
                hu4 hu4Var = hu4.a;
                int i = this.f;
                if (i == 0) {
                    ch3.d0(obj);
                    okh okhVar = (okh) qt4.i(this.g, 458);
                    this.f = 1;
                    if (okhVar.b(this) == hu4Var) {
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
            default:
                sbi sbiVar = sbi.a;
                hu4 hu4Var2 = hu4.a;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    gl8 gl8Var = (gl8) c0a.j(this.g, 1124);
                    this.f = 1;
                    int iH = ((s7f) gl8Var.a()).h();
                    s7f s7fVar = (s7f) gl8Var.a();
                    gvb gvbVar = s7fVar.P;
                    zv8[] zv8VarArr = s7f.j0;
                    int iIntValue = ((Number) gvbVar.m(s7fVar, zv8VarArr[38])).intValue();
                    boolean z = iH > 0 && iIntValue > 0;
                    s7f s7fVar2 = (s7f) gl8Var.a();
                    if (((Boolean) s7fVar2.Q.m(s7fVar2, zv8VarArr[39])).booleanValue() && (((Boolean) ((g5d) ((gjf) gl8Var.b.getValue())).a.e4.a(e5d.S6[266]).i()).booleanValue() || z)) {
                        ((s7f) gl8Var.a()).E(false);
                        if (!z ? (objC = gl8Var.c(this)) != hu4Var2 : (objC = gl8Var.b(iH, iIntValue, this)) != hu4Var2) {
                        }
                        if (objC == hu4Var2) {
                            return hu4Var2;
                        }
                    } else {
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.e;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, "InvalidateDbTask", qt4.l("Not need invalidate db. config info, ver:", iH, iIntValue, ", mask:"), null);
                            }
                        }
                    }
                    objC = sbiVar;
                    if (objC == hu4Var2) {
                        return hu4Var2;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbiVar;
        }
    }
}
