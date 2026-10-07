package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fqc extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public j9b f;
    public hqc g;
    public Long h;
    public int i;
    public int j;
    public final /* synthetic */ hqc k;
    public final /* synthetic */ Long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fqc(hqc hqcVar, Long l, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.k = hqcVar;
        this.l = l;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Long l = this.l;
        hqc hqcVar = this.k;
        switch (i) {
            case 0:
                return new fqc(hqcVar, l, lq4Var, 0);
            default:
                return new fqc(hqcVar, l, lq4Var, 1);
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
        return ((fqc) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00ee  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (r4.a(r3, r16) == r6) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ef, code lost:
    
        if (r0 == r6) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int, j9b] */
    /* JADX WARN: Type inference failed for: r1v12, types: [j9b] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [j9b] */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
