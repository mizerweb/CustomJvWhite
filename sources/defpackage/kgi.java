package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kgi extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ zgi f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kgi(zgi zgiVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = zgiVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        zgi zgiVar = this.f;
        switch (i) {
            case 0:
                return new kgi(zgiVar, lq4Var, 0);
            default:
                return new kgi(zgiVar, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        Integer num = (Integer) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((kgi) create(num, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((kgi) create(num, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        zgi zgiVar = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                gm0.n(zgiVar.c, "Connection restored");
                break;
            default:
                ch3.d0(obj);
                gm0.n(zgiVar.c, "Connection restored");
                break;
        }
        return sbiVar;
    }
}
