package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hv0 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ mv0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hv0(mv0 mv0Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = mv0Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        mv0 mv0Var = this.h;
        switch (i) {
            case 0:
                hv0 hv0Var = new hv0(mv0Var, lq4Var, 0);
                hv0Var.g = obj;
                return hv0Var;
            default:
                hv0 hv0Var2 = new hv0(mv0Var, lq4Var, 1);
                hv0Var2.g = obj;
                return hv0Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((hv0) create((ov0) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((hv0) create((ylc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (r0.emit(r10, r9) == r4) goto L22;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
