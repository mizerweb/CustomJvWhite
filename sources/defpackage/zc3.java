package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zc3 extends mdh implements qf7 {
    public final /* synthetic */ xd3 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc3(xd3 xd3Var, long j, long j2, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = xd3Var;
        this.f = j;
        this.g = j2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new zc3(this.e, this.f, this.g, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        zc3 zc3Var = (zc3) create((gu4) obj, (lq4) obj2);
        sbi sbiVar = sbi.a;
        zc3Var.invokeSuspend(sbiVar);
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        ch3.d0(obj);
        zv8[] zv8VarArr = xd3.X1;
        ((xn3) this.e.I.getValue()).j().W(this.f, this.g);
        return sbi.a;
    }
}
