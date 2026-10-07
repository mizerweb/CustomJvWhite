package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class or8 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ sr8 h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ or8(sr8 sr8Var, long j, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = sr8Var;
        this.i = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                or8 or8Var = new or8(this.h, this.i, lq4Var, 0);
                or8Var.g = obj;
                return or8Var;
            default:
                or8 or8Var2 = new or8(this.h, this.i, lq4Var, 1);
                or8Var2.g = obj;
                return or8Var2;
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
        return ((or8) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009b, code lost:
    
        if (r0 == r9) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0146, code lost:
    
        if (r0 == r9) goto L51;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.or8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
