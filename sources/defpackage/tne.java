package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class tne extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ vne g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tne(vne vneVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = vneVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        vne vneVar = this.g;
        switch (i) {
            case 0:
                return new tne(vneVar, lq4Var, 0);
            default:
                return new tne(vneVar, lq4Var, 1);
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
        return ((tne) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        vne vneVar = this.g;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return vne.a(vneVar, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i2 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                AtomicBoolean atomicBoolean = vneVar.j;
                int i3 = this.f;
                try {
                    if (i3 == 0) {
                        ch3.d0(obj);
                        xt4 xt4VarA = ((n0c) ((xhh) vneVar.h.getValue())).a();
                        zhb zhbVar = zhb.b;
                        xt4VarA.getClass();
                        vt4 vt4VarX0 = lvb.x0(xt4VarA, zhbVar);
                        tne tneVar = new tne(vneVar, null, 0);
                        this.f = 1;
                        if (yab.K0(vt4VarX0, tneVar, this) == hu4Var) {
                            return hu4Var;
                        }
                    } else {
                        if (i3 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                    }
                    atomicBoolean.set(false);
                    return sbiVar;
                } catch (Throwable th) {
                    atomicBoolean.set(false);
                    throw th;
                }
        }
    }
}
