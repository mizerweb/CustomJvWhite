package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rr6 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ tr6 g;
    public final /* synthetic */ List h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rr6(tr6 tr6Var, List list, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = tr6Var;
        this.h = list;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        List list = this.h;
        tr6 tr6Var = this.g;
        switch (i) {
            case 0:
                return new rr6(tr6Var, list, lq4Var, 0);
            default:
                return new rr6(tr6Var, list, lq4Var, 1);
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
        return ((rr6) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        List list = this.h;
        hu4 hu4Var = hu4.a;
        tr6 tr6Var = this.g;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    if (tr6.a(tr6Var, list, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbiVar;
            default:
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                    } else {
                        if (i3 != 2) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                    }
                    return sbiVar;
                }
                ch3.d0(obj);
                ct9 ct9Var = (ct9) tr6Var.b.getValue();
                this.f = 1;
                obj = ct9Var.a(list, this);
                if (obj == hu4Var) {
                    return hu4Var;
                }
                List list2 = (List) obj;
                if (list2.isEmpty()) {
                    gm0.x(tr6Var.a, "Don't need clear file system because items is empty", null);
                } else {
                    xt4 xt4VarB = ((n0c) ((xhh) tr6Var.e.getValue())).b();
                    rr6 rr6Var = new rr6(tr6Var, list2, null, 0);
                    this.f = 2;
                    if (yab.K0(xt4VarB, rr6Var, this) == hu4Var) {
                        return hu4Var;
                    }
                }
                return sbiVar;
        }
    }
}
