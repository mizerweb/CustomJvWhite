package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class cvf extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public gvf f;
    public int g;
    public final /* synthetic */ gvf h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cvf(gvf gvfVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = gvfVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        gvf gvfVar = this.h;
        switch (i) {
            case 0:
                return new cvf(gvfVar, lq4Var, 0);
            default:
                return new cvf(gvfVar, lq4Var, 1);
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
        return ((cvf) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        Object obj2 = sbi.a;
        gvf gvfVar = this.h;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.g;
                try {
                    if (i2 == 0) {
                        ch3.d0(obj);
                        qfi qfiVar = (qfi) gvfVar.i.getValue();
                        this.f = gvfVar;
                        this.g = 1;
                        if (qfiVar.a(false, false, this) == hu4Var) {
                            obj2 = hu4Var;
                        }
                    } else {
                        if (i2 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        gvfVar = this.f;
                        ch3.d0(obj);
                    }
                    return obj2;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    gm0.V(gvfVar.x, "disableSafeMode fail", th);
                    gvf.C(gvfVar, th);
                    return obj2;
                }
            default:
                int i3 = this.g;
                try {
                    if (i3 == 0) {
                        ch3.d0(obj);
                        qfi qfiVar2 = (qfi) gvfVar.i.getValue();
                        this.f = gvfVar;
                        this.g = 1;
                        if (qfiVar2.a(false, false, this) == hu4Var) {
                            obj2 = hu4Var;
                        }
                    } else {
                        if (i3 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        gvfVar = this.f;
                        ch3.d0(obj);
                    }
                    return obj2;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    gm0.V(gvfVar.x, "fail to disable SAFE_MODE", th2);
                    gvf.C(gvfVar, th2);
                    return obj2;
                }
        }
    }
}
