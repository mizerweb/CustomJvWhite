package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u07 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ b99 f;
    public final /* synthetic */ srb g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u07(b99 b99Var, srb srbVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = b99Var;
        this.g = srbVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new u07(this.f, this.g, lq4Var, 0);
            default:
                return new u07(this.f, this.g, lq4Var, 1);
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
                ((u07) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((u07) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        srb srbVar = this.g;
        b99 b99Var = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                b99Var.f(srbVar);
                break;
            default:
                ch3.d0(obj);
                b99Var.j(srbVar);
                break;
        }
        return sbiVar;
    }
}
