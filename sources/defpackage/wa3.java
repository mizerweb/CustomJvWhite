package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wa3 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ tp2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wa3(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        int i2 = 3;
        tp2 tp2Var = (tp2) obj;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                wa3 wa3Var = new wa3(i2, lq4Var, 0);
                wa3Var.f = tp2Var;
                wa3Var.invokeSuspend(sbiVar);
                break;
            default:
                wa3 wa3Var2 = new wa3(i2, lq4Var, 1);
                wa3Var2.f = tp2Var;
                wa3Var2.invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        a8g a8gVar = pq3.j;
        tp2 tp2Var = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                tp2Var.setBackgroundColor(a8gVar.h(tp2Var).k().b);
                break;
            default:
                ch3.d0(obj);
                tp2Var.setBackgroundColor(a8gVar.h(tp2Var).b().b);
                break;
        }
        return sbiVar;
    }
}
