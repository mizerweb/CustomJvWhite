package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class gn3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public mjg f;
    public int g;
    public final /* synthetic */ mjg h;
    public final /* synthetic */ pq3 i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gn3(mjg mjgVar, lq4 lq4Var, pq3 pq3Var, long j, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = mjgVar;
        this.i = pq3Var;
        this.j = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new gn3(this.h, lq4Var, this.i, this.j, 0);
            default:
                return new gn3(this.h, lq4Var, this.i, this.j, 1);
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
        return ((gn3) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        mjg mjgVar = this.h;
        hu4 hu4Var = hu4.a;
        pq3 pq3Var = this.i;
        long j = this.j;
        int i2 = 1;
        rt2 rt2Var = null;
        switch (i) {
            case 0:
                int i3 = this.g;
                if (i3 == 0) {
                    ch3.d0(obj);
                    qw2 qw2VarH = pq3Var.h();
                    this.f = mjgVar;
                    this.g = 1;
                    obj = qw2VarH.a(j, this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mjgVar = this.f;
                    ch3.d0(obj);
                }
                rt2 rt2Var2 = (rt2) obj;
                if (rt2Var2 != null) {
                    long jA = rt2Var2.A();
                    if (jA != 0) {
                        ((f9b) ((ConcurrentHashMap) pq3Var.f).computeIfAbsent(new Long(jA), new hn3(new kl3(i2, rt2Var2)))).setValue(rt2Var2);
                    }
                    rt2Var = rt2Var2;
                }
                mjgVar.setValue(rt2Var);
                return sbiVar;
            default:
                int i4 = this.g;
                if (i4 == 0) {
                    ch3.d0(obj);
                    qw2 qw2VarH2 = pq3Var.h();
                    this.f = mjgVar;
                    this.g = 1;
                    obj = qw2VarH2.b(j, this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i4 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mjgVar = this.f;
                    ch3.d0(obj);
                }
                rt2 rt2Var3 = (rt2) obj;
                if (rt2Var3 == null) {
                    ((pvb) ((ny8) pq3Var.b).getValue()).f(j);
                    rt2Var3 = null;
                }
                if (rt2Var3 != null) {
                    ((f9b) ((ConcurrentHashMap) pq3Var.e).computeIfAbsent(new Long(rt2Var3.a), new hn3(new ol0(9, rt2Var3)))).setValue(rt2Var3);
                    rt2Var = rt2Var3;
                }
                mjgVar.setValue(rt2Var);
                return sbiVar;
        }
    }
}
