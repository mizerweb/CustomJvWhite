package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class u57 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ wf4 f;
    public /* synthetic */ kbc g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u57(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        int i2 = 3;
        wf4 wf4Var = (wf4) obj;
        kbc kbcVar = (kbc) obj2;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                u57 u57Var = new u57(i2, lq4Var, 0);
                u57Var.f = wf4Var;
                u57Var.g = kbcVar;
                u57Var.invokeSuspend(sbiVar);
                break;
            default:
                u57 u57Var2 = new u57(i2, lq4Var, 1);
                u57Var2.f = wf4Var;
                u57Var2.g = kbcVar;
                u57Var2.invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                wf4 wf4Var = this.f;
                kbc kbcVar = this.g;
                ch3.d0(obj);
                wf4Var.setBackgroundColor(kbcVar.b().c);
                break;
            default:
                wf4 wf4Var2 = this.f;
                kbc kbcVar2 = this.g;
                ch3.d0(obj);
                wf4Var2.setBackgroundColor(kbcVar2.b().c);
                break;
        }
        return sbiVar;
    }
}
