package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ml0 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ml0(int i, lq4 lq4Var, String str) {
        super(2, lq4Var);
        this.e = i;
        this.g = str;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                ml0 ml0Var = new ml0(0, lq4Var, this.g);
                ml0Var.f = obj;
                return ml0Var;
            default:
                ml0 ml0Var2 = new ml0(1, lq4Var, this.g);
                ml0Var2.f = obj;
                return ml0Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((ml0) create((String) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                ((ml0) create((tw2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        String str = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                return Boolean.valueOf(cqk.d((String) obj2, str));
            default:
                ch3.d0(obj);
                ((tw2) obj2).g = str;
                return sbi.a;
        }
    }
}
