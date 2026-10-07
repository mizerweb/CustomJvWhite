package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uc0 extends mdh implements qf7 {
    public final /* synthetic */ vc0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ float g;
    public final /* synthetic */ float h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc0(vc0 vc0Var, int i, float f, float f2, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = vc0Var;
        this.f = i;
        this.g = f;
        this.h = f2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new uc0(this.e, this.f, this.g, this.h, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        uc0 uc0Var = (uc0) create((gu4) obj, (lq4) obj2);
        sbi sbiVar = sbi.a;
        uc0Var.invokeSuspend(sbiVar);
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        ch3.d0(obj);
        this.e.n = new Integer(this.f);
        this.e.l = new Float(this.g);
        this.e.m = new Float(this.h);
        vc0 vc0Var = this.e;
        zv zvVar = vc0Var.j;
        zv zvVar2 = new zv(this.f);
        if (zvVar != null) {
            zvVar2.addAll(zvVar);
        }
        vc0Var.j = zvVar2;
        this.e.a();
        return sbi.a;
    }
}
