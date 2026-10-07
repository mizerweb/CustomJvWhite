package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vm extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ xm g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vm(xm xmVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = xmVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        xm xmVar = this.g;
        switch (i) {
            case 0:
                return new vm(xmVar, lq4Var, 0);
            default:
                return new vm(xmVar, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((vm) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r0 == r4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d6, code lost:
    
        if (r0 == r4) goto L54;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vm.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
