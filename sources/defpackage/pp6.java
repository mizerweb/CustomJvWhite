package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pp6 extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public long f;
    public int g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp6(rp6 rp6Var, long j, long j2, long j3, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = rp6Var;
        this.f = j;
        this.h = j2;
        this.i = j3;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                return new pp6((rp6) obj2, this.f, this.h, this.i, lq4Var);
            default:
                return new pp6((cm7) obj2, this.h, this.i, lq4Var);
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
        return ((pp6) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b8 A[PHI: r0 r2
  0x00b8: PHI (r0v21 long) = (r0v20 long), (r0v31 long) binds: [B:31:0x00b5, B:12:0x002c] A[DONT_GENERATE, DONT_INLINE]
  0x00b8: PHI (r2v7 java.lang.Object) = (r2v6 java.lang.Object), (r2v12 java.lang.Object) binds: [B:31:0x00b5, B:12:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e2  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f4, code lost:
    
        if (r0 == r9) goto L43;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pp6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp6(cm7 cm7Var, long j, long j2, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = cm7Var;
        this.h = j;
        this.i = j2;
    }
}
