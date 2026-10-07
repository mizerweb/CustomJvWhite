package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j05 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ cf7 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j05(lq4 lq4Var, cf7 cf7Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = cf7Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        cf7 cf7Var = this.g;
        switch (i) {
            case 0:
                j05 j05Var = new j05(lq4Var, cf7Var, 0);
                j05Var.f = obj;
                return j05Var;
            default:
                j05 j05Var2 = new j05(lq4Var, cf7Var, 1);
                j05Var2.f = obj;
                return j05Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        nzh nzhVar = (nzh) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((j05) create(nzhVar, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        cf7 cf7Var = this.g;
        switch (i) {
            case 0:
                ch3.d0(obj);
                break;
            default:
                ch3.d0(obj);
                break;
        }
        return cf7Var.invoke(((f5e) ((nzh) this.f)).c());
    }
}
