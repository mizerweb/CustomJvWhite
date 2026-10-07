package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ym0 extends mdh implements cf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ym0(Object obj, lq4 lq4Var, int i) {
        super(1, lq4Var);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return new ym0((in0) obj, lq4Var, 0);
            case 1:
                return new ym0((nl1) obj, lq4Var, 1);
            default:
                return new ym0((ceh) obj, lq4Var, 2);
        }
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj;
        switch (i) {
            case 0:
                ((ym0) create(lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((ym0) create(lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((ym0) create(lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                in0 in0Var = (in0) obj2;
                if (in0Var.e()) {
                    gm0.n("KeepBackground", "logout: disabling background wake");
                    in0Var.j(false);
                }
                break;
            case 1:
                ch3.d0(obj);
                nl1 nl1Var = (nl1) obj2;
                vo8 vo8Var = (vo8) nl1Var.h.getAndSet(null);
                if (vo8Var != null) {
                    vo8Var.b(null);
                }
                nl1Var.g.set(null);
                break;
            default:
                ch3.d0(obj);
                ceh cehVar = (ceh) obj2;
                String str = cehVar.e;
                gm0.n(str, "handle logout");
                gm0.n(str, "clear");
                try {
                    ch3.G(((pmg) cehVar.a.getValue()).a, false, true, new chf(17));
                    gm0.n(str, "clear: repository cleared");
                } catch (Throwable th) {
                    gm0.V(str, "clear: repository clear failed", th);
                }
                break;
        }
        return sbiVar;
    }
}
