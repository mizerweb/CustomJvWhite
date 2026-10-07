package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class n04 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ List h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n04(int i, lq4 lq4Var, List list) {
        super(2, lq4Var);
        this.e = i;
        this.h = list;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        List list = this.h;
        switch (i) {
            case 0:
                n04 n04Var = new n04(0, lq4Var, list);
                n04Var.g = obj;
                return n04Var;
            case 1:
                n04 n04Var2 = new n04(1, lq4Var, list);
                n04Var2.g = obj;
                return n04Var2;
            case 2:
                n04 n04Var3 = new n04(2, lq4Var, list);
                n04Var3.g = obj;
                return n04Var3;
            default:
                n04 n04Var4 = new n04(3, lq4Var, list);
                n04Var4.g = obj;
                return n04Var4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((n04) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((n04) create((f9g) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((n04) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((n04) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        List list = this.h;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                yx6 yx6Var = (yx6) this.g;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    this.g = null;
                    this.f = 1;
                    return yx6Var.emit(list, this) == hu4Var ? hu4Var : sbiVar;
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
                    f9g f9gVar = (f9g) this.g;
                    this.f = 1;
                    return dql.a(list, f9gVar, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i3 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                yx6 yx6Var2 = (yx6) this.g;
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    this.g = null;
                    this.f = 1;
                    return yx6Var2.emit(list, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i4 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                yx6 yx6Var3 = (yx6) this.g;
                int i5 = this.f;
                if (i5 == 0) {
                    ch3.d0(obj);
                    this.g = null;
                    this.f = 1;
                    return yx6Var3.emit(list, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i5 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
