package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wle extends mdh implements cf7 {
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public dme i;
    public qih j;
    public int k;
    public int l;
    public int m;
    public final /* synthetic */ dme n;
    public final /* synthetic */ qih o;
    public final /* synthetic */ kih p;
    public final /* synthetic */ aq q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wle(aq aqVar, lq4 lq4Var, dme dmeVar, kih kihVar, qih qihVar) {
        super(1, lq4Var);
        this.n = dmeVar;
        this.o = qihVar;
        this.p = kihVar;
        this.q = aqVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        return new wle(this.q, lq4Var, this.n, this.p, this.o);
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        return ((wle) create((lq4) obj)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:44:0x010b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0112  */
    /* JADX WARN: Code duplicated, block: B:49:0x011a  */
    /* JADX WARN: Code duplicated, block: B:52:0x013c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0155  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d2, code lost:
    
        if (defpackage.dme.e(r14, r11, r13) == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0152, code lost:
    
        if (r3.i(r4, r13) == r0) goto L54;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x00dc, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x011a, please report this as an issue */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wle.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
