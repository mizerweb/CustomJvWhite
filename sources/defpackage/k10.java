package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k10 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public long h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k10(y10 y10Var, long j, boolean z, i64 i64Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = y10Var;
        this.h = j;
        this.i = z;
        this.j = i64Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                return new k10((y10) this.g, this.h, this.i, (i64) obj2, lq4Var, 0);
            case 1:
                return new k10((y10) this.g, this.h, this.i, (i64) obj2, lq4Var, 1);
            default:
                k10 k10Var = new k10((hgh) obj2, this.i, lq4Var);
                k10Var.g = obj;
                return k10Var;
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
            case 1:
                break;
        }
        return ((k10) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b2, code lost:
    
        if (r13 == r6) goto L43;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k10.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k10(hgh hghVar, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 2;
        this.j = hghVar;
        this.i = z;
    }
}
