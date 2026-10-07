package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class t13 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ u13 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t13(u13 u13Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = u13Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        u13 u13Var = this.g;
        switch (i) {
            case 0:
                return new t13(u13Var, lq4Var, 0);
            default:
                return new t13(u13Var, lq4Var, 1);
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
        return ((t13) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        hu4 hu4Var = hu4.a;
        u13 u13Var = this.g;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                xn3 xn3Var = (xn3) u13Var.g.getValue();
                long j = u13Var.b;
                this.f = 1;
                Object objV = xn3Var.v(j, this);
                return objV == hu4Var ? hu4Var : objV;
            default:
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                xn3 xn3Var2 = (xn3) u13Var.g.getValue();
                long j2 = u13Var.b;
                Set set = u13Var.e;
                this.f = 1;
                Object objQ = xn3Var2.q(j2, set, this);
                return objQ == hu4Var ? hu4Var : objQ;
        }
    }
}
