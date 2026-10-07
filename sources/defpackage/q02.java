package defpackage;

import one.me.calls.impl.service.CallServiceImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class q02 extends mdh implements cf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q02(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, lq4 lq4Var, int i) {
        super(1, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
        this.k = obj5;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        int i = this.e;
        Object obj = this.k;
        Object obj2 = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                return new q02((CallServiceImpl) obj5, (y02) obj4, (String) obj3, (dz4) obj2, (be1) obj, lq4Var, 0);
            case 1:
                return new q02((CallServiceImpl) obj5, (y02) obj4, (String) obj3, (dz4) obj2, (be1) obj, lq4Var, 1);
            default:
                return new q02((fd4) obj5, (zt6) obj4, (b41) obj3, (wfi) obj2, (njd) obj, lq4Var, 2);
        }
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((q02) create(lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        Object obj2 = this.k;
        Object obj3 = this.j;
        Object obj4 = this.i;
        hu4 hu4Var = hu4.a;
        Object obj5 = this.h;
        Object obj6 = this.g;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return CallServiceImpl.b((CallServiceImpl) obj6, (y02) obj5, (String) obj4, (dz4) obj3, (be1) obj2, false, false, false, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i2 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return CallServiceImpl.b((CallServiceImpl) obj6, (y02) obj5, (String) obj4, (dz4) obj3, (be1) obj2, false, false, false, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i3 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
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
                ppe ppeVarB = zt6.b((zt6) obj5);
                qt6 qt6Var = new qt6((b41) obj4, (wfi) obj3, (zt6) obj5, (fd4) obj6, (njd) obj2, null);
                this.f = 1;
                return pol.b((fd4) obj6, ppeVarB, qt6Var, this) == hu4Var ? hu4Var : sbiVar;
        }
    }
}
