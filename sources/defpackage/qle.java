package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qle extends mdh implements cf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ qih f;
    public final /* synthetic */ yhh g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qle(qih qihVar, yhh yhhVar, lq4 lq4Var, int i) {
        super(1, lq4Var);
        this.e = i;
        this.f = qihVar;
        this.g = yhhVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        int i = this.e;
        yhh yhhVar = this.g;
        qih qihVar = this.f;
        switch (i) {
            case 0:
                return new qle(qihVar, yhhVar, lq4Var, 0);
            default:
                return new qle(qihVar, yhhVar, lq4Var, 1);
        }
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj;
        switch (i) {
            case 0:
                ((qle) create(lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((qle) create(lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        yhh yhhVar = this.g;
        qih qihVar = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                qihVar.f(yhhVar);
                break;
            default:
                ch3.d0(obj);
                qihVar.f(yhhVar);
                break;
        }
        return sbiVar;
    }
}
