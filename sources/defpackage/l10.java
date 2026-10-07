package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l10 extends mdh implements qf7 {
    public /* synthetic */ Object e;
    public final /* synthetic */ y10 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ i64 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ i64 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l10(y10 y10Var, long j, boolean z, i64 i64Var, boolean z2, i64 i64Var2, lq4 lq4Var) {
        super(2, lq4Var);
        this.f = y10Var;
        this.g = j;
        this.h = z;
        this.i = i64Var;
        this.j = z2;
        this.k = i64Var2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        l10 l10Var = new l10(this.f, this.g, this.h, this.i, this.j, this.k, lq4Var);
        l10Var.e = obj;
        return l10Var;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((l10) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        gu4 gu4Var = (gu4) this.e;
        ch3.d0(obj);
        y10 y10Var = this.f;
        vt4 vt4Var = y10Var.k;
        xhh xhhVar = y10Var.a;
        yab.i0(gu4Var, vt4Var.u0(((n0c) xhhVar).b()), 0, new k10(y10Var, this.g, this.h, this.i, null, 0), 2);
        return yab.i0(gu4Var, vt4Var.u0(((n0c) xhhVar).b()), 0, new k10(y10Var, this.g, this.j, this.k, null, 1), 2);
    }
}
