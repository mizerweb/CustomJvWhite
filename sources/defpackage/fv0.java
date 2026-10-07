package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fv0 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ mv0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fv0(mv0 mv0Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = mv0Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        mv0 mv0Var = this.g;
        switch (i) {
            case 0:
                return new fv0(mv0Var, lq4Var, 0);
            default:
                return new fv0(mv0Var, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((fv0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((fv0) create(bool, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x010a, code lost:
    
        if (defpackage.mv0.b(r9, r8) == r0) goto L38;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fv0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
