package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nta extends mdh implements qf7 {
    public /* synthetic */ Object e;
    public final /* synthetic */ hua f;
    public final /* synthetic */ xhh g;
    public final /* synthetic */ ny8 h;
    public final /* synthetic */ ny8 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nta(hua huaVar, xhh xhhVar, ny8 ny8Var, ny8 ny8Var2, lq4 lq4Var) {
        super(2, lq4Var);
        this.f = huaVar;
        this.g = xhhVar;
        this.h = ny8Var;
        this.i = ny8Var2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        nta ntaVar = new nta(this.f, this.g, this.h, this.i, lq4Var);
        ntaVar.e = obj;
        return ntaVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        nta ntaVar = (nta) create((htc) obj, (lq4) obj2);
        sbi sbiVar = sbi.a;
        ntaVar.invokeSuspend(sbiVar);
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        htc htcVar = (htc) this.e;
        ch3.d0(obj);
        hua huaVar = this.f;
        huaVar.o.set(htcVar);
        huaVar.p.B(huaVar, hua.s[0], yab.i0(huaVar.n, ((n0c) this.g).b(), 0, new gz(12, null, this.h, huaVar, this.i, false), 2));
        return sbi.a;
    }
}
