package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kv1 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ wf4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kv1(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        int i2 = 3;
        wf4 wf4Var = (wf4) obj;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                kv1 kv1Var = new kv1(i2, lq4Var, 0);
                kv1Var.f = wf4Var;
                kv1Var.invokeSuspend(sbiVar);
                break;
            default:
                kv1 kv1Var2 = new kv1(i2, lq4Var, 1);
                kv1Var2.f = wf4Var;
                kv1Var2.invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        a8g a8gVar = pq3.j;
        wf4 wf4Var = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                wf4Var.setBackgroundColor(a8gVar.h(wf4Var).b().d);
                break;
            default:
                ch3.d0(obj);
                wf4Var.setBackgroundColor(a8gVar.h(wf4Var).b().b);
                break;
        }
        return sbiVar;
    }
}
