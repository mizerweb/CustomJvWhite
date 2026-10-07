package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t10 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ y10 g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t10(y10 y10Var, long j, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = y10Var;
        this.h = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new t10(this.g, this.h, lq4Var, 0);
            default:
                return new t10(this.g, this.h, lq4Var, 1);
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
        return ((t10) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        y10 y10Var;
        Object objT;
        y10 y10Var2;
        Object objR;
        int i = this.e;
        sbi sbiVar = sbi.a;
        long j = this.h;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                y10 y10Var3 = this.g;
                if (i2 == 0) {
                    ch3.d0(obj);
                    xhe xheVar = y10Var3.e;
                    this.f = 1;
                    y10Var = y10Var3;
                    objT = y10Var.t(xheVar, this.h, false, this);
                    if (objT == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                    objT = obj;
                    y10Var = y10Var3;
                }
                int iIntValue = ((Number) objT).intValue();
                if (iIntValue < 0) {
                    return sbiVar;
                }
                y10Var.A(y10Var.s, new d10(j, true, iIntValue > 0));
                return sbiVar;
            default:
                int i3 = this.f;
                y10 y10Var4 = this.g;
                if (i3 == 0) {
                    ch3.d0(obj);
                    xhe xheVar2 = y10Var4.e;
                    this.f = 1;
                    y10Var2 = y10Var4;
                    objR = y10Var2.r(xheVar2, this.h, false, this);
                    if (objR == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                    objR = obj;
                    y10Var2 = y10Var4;
                }
                int iIntValue2 = ((Number) objR).intValue();
                if (iIntValue2 < 0) {
                    return sbiVar;
                }
                y10Var2.A(y10Var2.s, new e10(j, true, iIntValue2 > 0));
                return sbiVar;
        }
    }
}
