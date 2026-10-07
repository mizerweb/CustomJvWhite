package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kjb extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Long g;
    public final /* synthetic */ Long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kjb(Long l, Long l2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = l;
        this.h = l2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                kjb kjbVar = new kjb(this.g, this.h, lq4Var, 0);
                kjbVar.f = obj;
                return kjbVar;
            default:
                kjb kjbVar2 = new kjb(this.g, this.h, lq4Var, 1);
                kjbVar2.f = obj;
                return kjbVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        tw2 tw2Var = (tw2) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((kjb) create(tw2Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((kjb) create(tw2Var, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        Long l = this.h;
        Long l2 = this.g;
        tw2 tw2Var = (tw2) this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                if (l2 != null) {
                    tw2Var.y = l2.longValue();
                }
                if (l != null) {
                    tw2Var.j = l.longValue();
                }
                break;
            default:
                ch3.d0(obj);
                if (l2 != null) {
                    tw2Var.y = l2.longValue();
                }
                if (l != null) {
                    tw2Var.j = l.longValue();
                }
                break;
        }
        return sbiVar;
    }
}
