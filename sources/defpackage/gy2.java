package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gy2 extends mdh implements qf7 {
    public hy2 e;
    public Object f;
    public hy2 g;
    public int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ hy2 k;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy2(hy2 hy2Var, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.k = hy2Var;
        this.l = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        gy2 gy2Var = new gy2(this.k, this.l, lq4Var);
        gy2Var.j = obj;
        return gy2Var;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((gy2) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00be  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00de  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ab, code lost:
    
        if (defpackage.hy2.p(r7, r14) == r1) goto L44;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gy2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
