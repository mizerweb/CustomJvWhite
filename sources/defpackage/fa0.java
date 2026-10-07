package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fa0 extends mdh implements vf7 {
    public /* synthetic */ la0 e;
    public /* synthetic */ float f;
    public /* synthetic */ h50 g;

    @Override // defpackage.vf7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        float fFloatValue = ((Number) obj2).floatValue();
        fa0 fa0Var = new fa0(4, (lq4) obj4);
        fa0Var.e = (la0) obj;
        fa0Var.f = fFloatValue;
        fa0Var.g = (h50) obj3;
        return fa0Var.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        la0 la0Var = this.e;
        float f = this.f;
        h50 h50Var = this.g;
        ch3.d0(obj);
        if (la0Var != null) {
            return new la0(la0Var.a, la0Var.b, f, la0Var.d, h50Var);
        }
        return null;
    }
}
