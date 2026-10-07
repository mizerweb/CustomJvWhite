package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class hwf extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ kwf g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hwf(kwf kwfVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = kwfVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        kwf kwfVar = this.g;
        switch (i) {
            case 0:
                return new hwf(kwfVar, lq4Var, 0);
            case 1:
                return new hwf(kwfVar, lq4Var, 1);
            default:
                return new hwf(kwfVar, lq4Var, 2);
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
        return ((hwf) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        kwf kwfVar = this.g;
        hu4 hu4Var = hu4.a;
        Object obj2 = null;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return kwf.C(kwfVar, this) == hu4Var ? hu4Var : sbiVar;
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
                    hq6 hq6Var = (hq6) kwfVar.e.getValue();
                    hq6Var.j.getClass();
                    hq6Var.b(new ft0(obj2)).B(Collections.singleton(b81.a));
                    a81 a81Var = (a81) kwfVar.h.getValue();
                    Long l = a81Var != null ? new Long(a81Var.a) : null;
                    if (l != null) {
                        kwf.B(kwfVar, l.longValue());
                        this.f = 1;
                        if (kwfVar.D(null, this) != hu4Var) {
                        }
                    }
                    return hu4Var;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                this.f = 2;
                if (kwf.C(kwfVar, this) != hu4Var) {
                    return sbiVar;
                }
                return hu4Var;
            default:
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return kwf.C(kwfVar, this) == hu4Var ? hu4Var : sbiVar;
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
