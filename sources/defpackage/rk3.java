package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class rk3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ rl3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rk3(int i, rl3 rl3Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = i;
        this.f = rl3Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        rl3 rl3Var = this.f;
        switch (i) {
            case 0:
                return new rk3(0, rl3Var, lq4Var);
            default:
                return new rk3(1, rl3Var, lq4Var);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((rk3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((rk3) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        rl3 rl3Var = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                mjg mjgVar = rl3Var.G1;
                r17 r17VarK = rl3Var.K();
                Set set = r17VarK != null ? r17VarK.d : null;
                qt4.C(!(set == null || set.isEmpty()), mjgVar, null);
                break;
            default:
                ch3.d0(obj);
                rl3Var.c.a();
                break;
        }
        return sbiVar;
    }
}
