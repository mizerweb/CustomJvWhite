package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v34 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ y34 f;
    public final /* synthetic */ r34 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v34(y34 y34Var, r34 r34Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = y34Var;
        this.g = r34Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new v34(this.f, this.g, lq4Var, 0);
            default:
                return new v34(this.f, this.g, lq4Var, 1);
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
                break;
        }
        return ((v34) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        r34 r34Var = this.g;
        y34 y34Var = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                zv8[] zv8VarArr = y34.m;
                return ((xn3) y34Var.f.getValue()).k(((p34) r34Var).a).a.getValue();
            default:
                ch3.d0(obj);
                zv8[] zv8VarArr2 = y34.m;
                return ((xn3) y34Var.f.getValue()).k(((q34) r34Var).a).a.getValue();
        }
    }
}
