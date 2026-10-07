package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public final class e64 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ f64 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e64(f64 f64Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = f64Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        f64 f64Var = this.g;
        switch (i) {
            case 0:
                return new e64(f64Var, lq4Var, 0);
            default:
                return new e64(f64Var, lq4Var, 1);
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
        return ((e64) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                f64 f64Var = this.g;
                String str = f64Var.g;
                Long l = f64Var.e;
                Long l2 = f64Var.d;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    rt2 rt2Var = (rt2) f64Var.D().k(l2.longValue()).a.getValue();
                    r66 r66Var = r66.a;
                    if (rt2Var == null) {
                        String str2 = "parent chat not found: " + l2;
                        gm0.V(str, str2, new b14(str2));
                        return r66Var;
                    }
                    if (l != null) {
                        rt2Var = (rt2) ((r8e) f64Var.D().c.i(new q24(rt2Var.A(), l.longValue()))).a.getValue();
                    }
                    if (rt2Var == null) {
                        String str3 = "complain chat not found: " + l2 + " " + l;
                        gm0.V(str, str3, new b14(str3));
                        return r66Var;
                    }
                    j44 j44Var = (j44) f64Var.k.getValue();
                    List listM1 = a.m1(f64Var.c);
                    this.f = 1;
                    obj = j44Var.k(rt2Var, listM1, this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return (List) obj;
            default:
                int i3 = this.f;
                f64 f64Var2 = this.g;
                if (i3 == 0) {
                    ch3.d0(obj);
                    Long l3 = f64Var2.d;
                    long[] jArr = f64Var2.c;
                    this.f = 1;
                    obj = yab.K0(((n0c) ((xhh) f64Var2.i.getValue())).b(), new f00(f64Var2, l3, jArr, (lq4) null, 27), this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                Iterable<h54> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(yw3.W0(iterable, 10));
                for (h54 h54Var : iterable) {
                    arrayList.add(new kc4(h54Var.a, new xnh(h54Var.b), 3, 56));
                }
                if (arrayList.isEmpty()) {
                    gm0.n(f64Var2.g, "We don't have server side reasons. Complain with default");
                    f64Var2.E(7);
                }
                mjg mjgVar = f64Var2.n;
                mjgVar.getClass();
                mjgVar.j(null, arrayList);
                return sbi.a;
        }
    }
}
