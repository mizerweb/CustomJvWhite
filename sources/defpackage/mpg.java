package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mpg extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ spg g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mpg(spg spgVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = spgVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        spg spgVar = this.g;
        switch (i) {
            case 0:
                return new mpg(spgVar, lq4Var, 0);
            default:
                return new mpg(spgVar, lq4Var, 1);
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
        return ((mpg) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        if (r13.n(r2, r12) == r4) goto L36;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
