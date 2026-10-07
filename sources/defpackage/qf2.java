package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class qf2 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ rf2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qf2(rf2 rf2Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = rf2Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        rf2 rf2Var = this.g;
        switch (i) {
            case 0:
                return new qf2(rf2Var, lq4Var, 0);
            default:
                return new qf2(rf2Var, lq4Var, 1);
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
        return ((qf2) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                hu4 hu4Var = hu4.a;
                int i = this.f;
                if (i == 0) {
                    ch3.d0(obj);
                    lh2 lh2Var = this.g.e;
                    xg0 xg0Var = new xg0(8);
                    synchronized (lh2Var.a) {
                        try {
                            if (!lh2Var.g) {
                                if (tvj.f(3, "CXCP")) {
                                    Log.d("CXCP", "Camera is removed, forcing state to CLOSED.");
                                }
                                lh2Var.g = true;
                                of2 of2Var = of2.c;
                                lh2Var.e = of2Var;
                                lh2Var.f = xg0Var;
                                lh2Var.c(of2Var, xg0Var);
                                lh2Var.d = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    kmi kmiVar = this.g.a;
                    this.f = 1;
                    if (kmiVar.e(this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbi.a;
            default:
                rf2 rf2Var = this.g;
                hu4 hu4Var2 = hu4.a;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    kmi kmiVar2 = rf2Var.a;
                    this.f = 1;
                    if (kmiVar2.e(this) == hu4Var2) {
                        return hu4Var2;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                cqk.g(rf2Var.d.a);
                return sbi.a;
        }
    }
}
