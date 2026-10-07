package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class th9 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ ai9 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ th9(ai9 ai9Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = ai9Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ai9 ai9Var = this.g;
        switch (i) {
            case 0:
                return new th9(ai9Var, lq4Var, 0);
            case 1:
                return new th9(ai9Var, lq4Var, 1);
            default:
                return new th9(ai9Var, lq4Var, 2);
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
        return ((th9) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        k66 k66Var = k66.a;
        sbi sbiVar = sbi.a;
        ai9 ai9Var = this.g;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                l7 l7Var = new l7(new ArrayList(), new xc3((xx6) ai9Var.e.getValue(), 8), new ph9(3, null, 0), 5);
                rh9 rh9Var = new rh9(ai9Var, 0);
                this.f = 1;
                Object objCollect = l7Var.collect(new eh8(rh9Var, 3), this);
                if (objCollect != hu4Var) {
                    objCollect = sbiVar;
                }
                return objCollect == hu4Var ? hu4Var : sbiVar;
            case 1:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    oh9 oh9Var = new oh9(ai9Var, 1);
                    this.f = 1;
                    return qyj.V(k66Var, oh9Var, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i3 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    oh9 oh9Var2 = new oh9(ai9Var, 2);
                    this.f = 1;
                    return qyj.V(k66Var, oh9Var2, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i4 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
