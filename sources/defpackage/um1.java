package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class um1 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ ym1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ um1(ym1 ym1Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = ym1Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ym1 ym1Var = this.g;
        switch (i) {
            case 0:
                return new um1(ym1Var, lq4Var, 0);
            case 1:
                return new um1(ym1Var, lq4Var, 1);
            default:
                return new um1(ym1Var, lq4Var, 2);
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
        return ((um1) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        ym1 ym1Var = this.g;
        hu4 hu4Var = hu4.a;
        lq4 lq4Var = null;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    if (rx8.t(5000L, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                ym1Var.o(false);
                return sbiVar;
            case 1:
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    if (rx8.t(300L, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i4 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                ia8 ia8Var = (ia8) ym1Var.j.getValue();
                if (ia8Var == null) {
                    return sbiVar;
                }
                ia8Var.f(Collections.singleton(new ha8(fa8.PARTICIPATED_IN_CALL, 1)), y3f.CALL);
                return sbiVar;
            default:
                int i5 = this.f;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                zhb zhbVar = zhb.b;
                um1 um1Var = new um1(ym1Var, lq4Var, i2);
                this.f = 1;
                return yab.K0(zhbVar, um1Var, this) == hu4Var ? hu4Var : sbiVar;
        }
    }
}
