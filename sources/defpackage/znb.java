package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class znb extends mdh implements qf7 {
    public boolean e;
    public int f;
    public final /* synthetic */ aob g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public znb(aob aobVar, long j, long j2, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = aobVar;
        this.h = j;
        this.i = j2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new znb(this.g, this.h, this.i, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((znb) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:33:0x0094 A[PHI: r0 r1
  0x0094: PHI (r0v17 boolean) = (r0v13 boolean), (r0v24 boolean) binds: [B:31:0x0091, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0094: PHI (r1v7 java.lang.Object) = (r1v6 java.lang.Object), (r1v17 java.lang.Object) binds: [B:31:0x0091, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r0 == r12) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if (r0 == r12) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
    
        if (r1.j(r13.h, r13.i, r13) == r12) goto L41;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.znb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
