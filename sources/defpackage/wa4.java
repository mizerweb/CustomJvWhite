package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wa4 extends mdh implements qf7 {
    public final /* synthetic */ xa4 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa4(xa4 xa4Var, boolean z, long j, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = xa4Var;
        this.f = z;
        this.g = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new wa4(this.e, this.f, this.g, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        wa4 wa4Var = (wa4) create((gu4) obj, (lq4) obj2);
        sbi sbiVar = sbi.a;
        wa4Var.invokeSuspend(sbiVar);
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        ch3.d0(obj);
        xa4 xa4Var = this.e;
        xb9 xb9Var = (xb9) ((et3) xa4Var.d.getValue());
        xb9Var.s0.B(xb9Var, xb9.g1[8], Boolean.valueOf(this.f));
        ic6 ic6Var = xa4Var.g;
        cs1.b.getClass();
        bc1.q(":profile/add-members?chat_id=" + this.g + "&is_chat=true", ic6Var);
        return sbi.a;
    }
}
