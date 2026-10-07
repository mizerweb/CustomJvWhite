package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sp2 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ cf7 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sp2(lq4 lq4Var, cf7 cf7Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = cf7Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                sp2 sp2Var = new sp2(lq4Var, this.g, 0);
                sp2Var.f = obj;
                return sp2Var;
            default:
                sp2 sp2Var2 = new sp2(lq4Var, this.g, 1);
                sp2Var2.f = obj;
                return sp2Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((sp2) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((sp2) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        cf7 cf7Var = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                cf7Var.invoke((rbb) obj2);
                break;
            default:
                ch3.d0(obj);
                cf7Var.invoke((rbb) obj2);
                break;
        }
        return sbiVar;
    }
}
