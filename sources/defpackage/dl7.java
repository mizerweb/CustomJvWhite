package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dl7 extends mdh implements qf7 {
    public Long e;
    public Object f;
    public yf5 g;
    public gu4 h;
    public boolean i;
    public boolean j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ q87 m;
    public final /* synthetic */ fl7 n;
    public final /* synthetic */ g4b o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl7(q87 q87Var, fl7 fl7Var, g4b g4bVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.m = q87Var;
        this.n = fl7Var;
        this.o = g4bVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        dl7 dl7Var = new dl7(this.m, this.n, this.o, lq4Var);
        dl7Var.l = obj;
        return dl7Var;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((dl7) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f0 A[LOOP:1: B:36:0x00ea->B:38:0x00f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x01a5 A[LOOP:0: B:53:0x019f->B:55:0x01a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011e, code lost:
    
        if (r0 == r14) goto L33;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
