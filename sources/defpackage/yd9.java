package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class yd9 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ ae9 g;
    public final /* synthetic */ List h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yd9(ae9 ae9Var, List list, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = ae9Var;
        this.h = list;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        List list = this.h;
        ae9 ae9Var = this.g;
        switch (i) {
            case 0:
                return new yd9(ae9Var, list, lq4Var, 0);
            default:
                return new yd9(ae9Var, list, lq4Var, 1);
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
        return ((yd9) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        int i2 = 0;
        List list = this.h;
        ae9 ae9Var = this.g;
        hu4 hu4Var = hu4.a;
        lq4 lq4Var = null;
        switch (i) {
            case 0:
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                mkg mkgVar = (mkg) ae9Var.f.getValue();
                List<kp> list2 = list;
                ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
                for (kp kpVar : list2) {
                    long j = kpVar.a;
                    long j2 = kpVar.b;
                    long j3 = kpVar.c;
                    String str = kpVar.d;
                    String str2 = kpVar.e;
                    Map map = kpVar.f;
                    if (map == null) {
                        map = s66.a;
                    }
                    arrayList.add(new sig(0L, j, new ce9(j2, j3, j, str, str2, map)));
                }
                this.f = 1;
                kkg kkgVar = (kkg) ((vse) mkgVar).a.getValue();
                Object objI = ch3.I(this, kkgVar.a, false, true, new ol(kkgVar, 18, arrayList));
                if (objI != hu4Var) {
                    objI = sbiVar;
                }
                if (objI != hu4Var) {
                    objI = sbiVar;
                }
                return objI == hu4Var ? hu4Var : sbiVar;
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
                zhb zhbVar = zhb.b;
                yd9 yd9Var = new yd9(ae9Var, list, lq4Var, i2);
                this.f = 1;
                return yab.K0(zhbVar, yd9Var, this) == hu4Var ? hu4Var : sbiVar;
        }
    }
}
