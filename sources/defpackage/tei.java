package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tei extends mdh implements tf7 {
    public /* synthetic */ long e;
    public /* synthetic */ cf7 f;
    public final /* synthetic */ vei g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tei(vei veiVar, lq4 lq4Var) {
        super(3, lq4Var);
        this.g = veiVar;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        long jLongValue = ((Number) obj).longValue();
        tei teiVar = new tei(this.g, (lq4) obj3);
        teiVar.e = jLongValue;
        teiVar.f = (cf7) obj2;
        return teiVar.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        long j = this.e;
        cf7 cf7Var = this.f;
        ch3.d0(obj);
        return ((no4) this.g.b.getValue()).a.b(j, new eo4(0, cf7Var));
    }
}
