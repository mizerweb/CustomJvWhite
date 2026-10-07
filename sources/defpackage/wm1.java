package defpackage;

import java.io.Serializable;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class wm1 extends mdh implements wf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ be1 f;
    public /* synthetic */ boolean g;
    public /* synthetic */ dz4 h;
    public /* synthetic */ x02 i;
    public /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm1(x02 x02Var, lq4 lq4Var, int i) {
        super(5, lq4Var);
        this.e = i;
        switch (i) {
            case 1:
                this.i = x02Var;
                super(5, lq4Var);
                break;
            default:
                this.j = x02Var;
                break;
        }
    }

    @Override // defpackage.wf7
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        be1 be1Var = (be1) obj;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                wm1 wm1Var = new wm1((x02) this.j, (lq4) serializable, 0);
                wm1Var.f = be1Var;
                wm1Var.h = (dz4) obj2;
                wm1Var.g = zBooleanValue;
                wm1Var.i = (x02) obj4;
                return wm1Var.invokeSuspend(sbiVar);
            default:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                wm1 wm1Var2 = new wm1(this.i, (lq4) serializable, 1);
                wm1Var2.f = be1Var;
                wm1Var2.g = zBooleanValue2;
                wm1Var2.h = (dz4) obj3;
                wm1Var2.j = (Set) obj4;
                return wm1Var2.invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                be1 be1Var = this.f;
                dz4 dz4Var = this.h;
                boolean z = this.g;
                x02 x02Var = this.i;
                ch3.d0(obj);
                return new nm1((x02) this.j, be1Var, dz4Var.q instanceof oi6, z, !cqk.d(x02Var.s(), ((x02) this.j).s()) && x02Var.m());
            default:
                be1 be1Var2 = this.f;
                boolean z2 = this.g;
                dz4 dz4Var2 = this.h;
                Set set = (Set) this.j;
                ch3.d0(obj);
                return new dmc(be1Var2, dz4Var2, z2, set.contains(new z02(this.i.s())));
        }
    }
}
