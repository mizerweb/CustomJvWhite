package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hd3 extends mdh implements qf7 {
    public Object e;
    public int f;
    public final /* synthetic */ Long g;
    public final /* synthetic */ vc9 h;
    public final /* synthetic */ float i;
    public final /* synthetic */ xd3 j;
    public final /* synthetic */ Long k;
    public final /* synthetic */ g4b l;
    public final /* synthetic */ q87 m;
    public final /* synthetic */ Long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd3(Long l, vc9 vc9Var, float f, xd3 xd3Var, Long l2, g4b g4bVar, q87 q87Var, Long l3, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = l;
        this.h = vc9Var;
        this.i = f;
        this.j = xd3Var;
        this.k = l2;
        this.l = g4bVar;
        this.m = q87Var;
        this.n = l3;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new hd3(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((hd3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ad  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ea, code lost:
    
        if (r0 == r9) goto L27;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
