package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class v20 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public w20 f;
    public int g;
    public final /* synthetic */ w20 h;
    public final /* synthetic */ rt2 i;
    public final /* synthetic */ List j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v20(w20 w20Var, rt2 rt2Var, List list, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = w20Var;
        this.i = rt2Var;
        this.j = list;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new v20(this.h, this.i, this.j, lq4Var, 0);
            default:
                return new v20(this.h, this.i, this.j, lq4Var, 1);
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
        return ((v20) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        Object obj2 = sbi.a;
        List list = this.j;
        rt2 rt2Var = this.i;
        w20 w20Var = this.h;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.g;
                try {
                    if (i2 == 0) {
                        ch3.d0(obj);
                        pja pjaVar = (pja) w20Var.j.getValue();
                        this.f = w20Var;
                        this.g = 1;
                        if (pjaVar.w(rt2Var, list, this) == hu4Var) {
                            obj2 = hu4Var;
                        }
                    } else {
                        if (i2 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w20Var = this.f;
                        ch3.d0(obj);
                    }
                    return obj2;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    gm0.V(w20Var.e, "fail to fetch reactions", th);
                    return obj2;
                }
            default:
                int i3 = this.g;
                try {
                    if (i3 == 0) {
                        ch3.d0(obj);
                        ffa ffaVar = (ffa) w20Var.k.getValue();
                        this.f = w20Var;
                        this.g = 1;
                        if (ffaVar.w(rt2Var, list, this) == hu4Var) {
                            obj2 = hu4Var;
                        }
                    } else {
                        if (i3 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w20Var = this.f;
                        ch3.d0(obj);
                    }
                    return obj2;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    gm0.V(w20Var.e, "fail to fetch comments counters", th2);
                    return obj2;
                }
        }
    }
}
