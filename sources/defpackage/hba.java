package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hba extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public int f;
    public long g;
    public /* synthetic */ int h;
    public Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hba(dme dmeVar, aq aqVar, long j, int i, lq4 lq4Var) {
        super(2, lq4Var);
        this.i = dmeVar;
        this.j = aqVar;
        this.g = j;
        this.h = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                hba hbaVar = new hba((lba) obj2, lq4Var);
                hbaVar.h = ((fba) obj).c();
                return hbaVar;
            default:
                return new hba((dme) this.i, (aq) obj2, this.g, this.h, lq4Var);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((hba) create(fba.a(((fba) obj).c()), (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((hba) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x016e A[PHI: r1 r5
  0x016e: PHI (r1v9 long) = (r1v6 long), (r1v6 long), (r1v11 long) binds: [B:43:0x0127, B:51:0x016b, B:28:0x00b5] A[DONT_GENERATE, DONT_INLINE]
  0x016e: PHI (r5v7 pba) = (r5v4 pba), (r5v4 pba), (r5v12 pba) binds: [B:43:0x0127, B:51:0x016b, B:28:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0180, code lost:
    
        if (r15.emit(r5, r14) == r4) goto L55;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hba.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hba(lba lbaVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = lbaVar;
    }
}
