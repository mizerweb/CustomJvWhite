package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eq2 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ gq2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eq2(gq2 gq2Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = gq2Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        gq2 gq2Var = this.g;
        switch (i) {
            case 0:
                eq2 eq2Var = new eq2(gq2Var, lq4Var, 0);
                eq2Var.f = obj;
                return eq2Var;
            case 1:
                eq2 eq2Var2 = new eq2(gq2Var, lq4Var, 1);
                eq2Var2.f = obj;
                return eq2Var2;
            default:
                eq2 eq2Var3 = new eq2(gq2Var, lq4Var, 2);
                eq2Var3.f = obj;
                return eq2Var3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((eq2) create((vp2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((eq2) create((rbb) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((eq2) create((cmd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gq2 gq2Var = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                vp2 vp2Var = (vp2) obj2;
                ch3.d0(obj);
                gq2Var.f.setValue(vp2Var.a);
                gq2Var.d.setValue(vp2Var.b);
                break;
            case 1:
                ch3.d0(obj);
                a8j.x(gq2Var.h, (rbb) obj2);
                break;
            default:
                ch3.d0(obj);
                a8j.x(gq2Var.i, (cmd) obj2);
                break;
        }
        return sbiVar;
    }
}
