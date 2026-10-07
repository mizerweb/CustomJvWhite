package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nnc extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ pnc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nnc(pnc pncVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = pncVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        pnc pncVar = this.f;
        switch (i) {
            case 0:
                return new nnc(pncVar, lq4Var, 0);
            default:
                return new nnc(pncVar, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((nnc) create(bool, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((nnc) create((dj4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        pnc pncVar = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                zv8[] zv8VarArr = pnc.q;
                pncVar.f();
                break;
            default:
                ch3.d0(obj);
                zv8[] zv8VarArr2 = pnc.q;
                pncVar.f();
                break;
        }
        return sbiVar;
    }
}
