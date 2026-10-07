package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qoi extends mdh implements tf7 {
    public /* synthetic */ int e;
    public /* synthetic */ int f;
    public final /* synthetic */ gpi g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qoi(gpi gpiVar, lq4 lq4Var) {
        super(3, lq4Var);
        this.g = gpiVar;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        qoi qoiVar = new qoi(this.g, (lq4) obj3);
        qoiVar.e = iIntValue;
        qoiVar.f = iIntValue2;
        return qoiVar.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int iIntValue = this.e;
        int i = this.f;
        ch3.d0(obj);
        if (this.g.d != null) {
            iIntValue = 1;
        } else {
            Integer num = new Integer(i);
            if (num.intValue() <= 0) {
                num = null;
            }
            if (num != null) {
                iIntValue = num.intValue();
            }
        }
        return new Integer(iIntValue);
    }
}
