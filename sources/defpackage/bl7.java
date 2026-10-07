package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bl7 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ gu4 g;
    public final /* synthetic */ fl7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bl7(Object obj, lq4 lq4Var, gu4 gu4Var, fl7 fl7Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = obj;
        this.g = gu4Var;
        this.h = fl7Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new bl7(this.f, lq4Var, this.g, this.h, 0);
            default:
                return new bl7(this.f, lq4Var, this.g, this.h, 1);
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
        return ((bl7) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object poeVar;
        Object poeVar2;
        int i = this.e;
        gu4 gu4Var = this.g;
        fl7 fl7Var = this.h;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                try {
                    poeVar = ((gb9) fl7Var.c.getValue()).a(((Number) obj2).longValue(), false);
                    break;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                Throwable thA = roe.a(poeVar);
                if (thA != null) {
                    try {
                        gm0.V(gu4Var.getClass().getName(), "failed to get forwardMessage ", thA);
                        if (!(thA instanceof IllegalStateException)) {
                            throw thA;
                        }
                        poeVar = null;
                    } catch (Throwable th2) {
                        poeVar = new poe(th2);
                    }
                }
                if (poeVar instanceof poe) {
                    return null;
                }
                return poeVar;
            default:
                ch3.d0(obj);
                try {
                    poeVar2 = ((gb9) fl7Var.c.getValue()).a(((Number) obj2).longValue(), false);
                    break;
                } catch (Throwable th3) {
                    poeVar2 = new poe(th3);
                }
                Throwable thA2 = roe.a(poeVar2);
                if (thA2 != null) {
                    try {
                        gm0.V(gu4Var.getClass().getName(), "failed to get forwardMessage ", thA2);
                        if (!(thA2 instanceof IllegalStateException)) {
                            throw thA2;
                        }
                        poeVar2 = null;
                    } catch (Throwable th4) {
                        poeVar2 = new poe(th4);
                    }
                }
                if (poeVar2 instanceof poe) {
                    return null;
                }
                return poeVar2;
        }
    }
}
