package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x10 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public long f;
    public int g;
    public /* synthetic */ Object h;
    public Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x10(long j, xx6 xx6Var, njd njdVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 2;
        this.f = j;
        this.i = xx6Var;
        this.j = njdVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                x10 x10Var = new x10((y10) obj2, lq4Var, 0);
                x10Var.h = obj;
                return x10Var;
            case 1:
                x10 x10Var2 = new x10((jn0) obj2, lq4Var, 1);
                x10Var2.h = obj;
                return x10Var2;
            case 2:
                x10 x10Var3 = new x10(this.f, (xx6) this.i, (njd) obj2, lq4Var);
                x10Var3.h = obj;
                return x10Var3;
            default:
                x10 x10Var4 = new x10((dz6) this.i, (wfe) obj2, this.f, lq4Var);
                x10Var4.h = obj;
                return x10Var4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((x10) create((f10) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((x10) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((x10) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((x10) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x010e A[PHI: r0 r3 r4 r6
  0x010e: PHI (r0v29 sbi) = (r0v16 sbi), (r0v16 sbi), (r0v16 sbi), (r0v28 sbi), (r0v34 sbi) binds: [B:40:0x00f0, B:43:0x00f7, B:44:0x00f9, B:65:0x0193, B:82:0x020a] A[DONT_GENERATE, DONT_INLINE]
  0x010e: PHI (r3v21 vm0) = (r3v17 vm0), (r3v17 vm0), (r3v17 vm0), (r3v20 vm0), (r3v22 vm0) binds: [B:40:0x00f0, B:43:0x00f7, B:44:0x00f9, B:65:0x0193, B:82:0x020a] A[DONT_GENERATE, DONT_INLINE]
  0x010e: PHI (r4v11 int) = (r4v0 int), (r4v0 int), (r4v0 int), (r4v10 int), (r4v13 int) binds: [B:40:0x00f0, B:43:0x00f7, B:44:0x00f9, B:65:0x0193, B:82:0x020a] A[DONT_GENERATE, DONT_INLINE]
  0x010e: PHI (r6v14 java.lang.Throwable) = 
  (r6v0 java.lang.Throwable)
  (r6v0 java.lang.Throwable)
  (r6v0 java.lang.Throwable)
  (r6v13 java.lang.Throwable)
  (r6v16 java.lang.Throwable)
 binds: [B:40:0x00f0, B:43:0x00f7, B:44:0x00f9, B:65:0x0193, B:82:0x020a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0118  */
    /* JADX WARN: Code duplicated, block: B:66:0x0195  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b0 A[PHI: r0 r1 r3 r12
  0x01b0: PHI (r0v17 sbi) = (r0v28 sbi), (r0v16 sbi) binds: [B:67:0x01ad, B:31:0x00b5] A[DONT_GENERATE, DONT_INLINE]
  0x01b0: PHI (r1v27 java.lang.Object) = (r1v37 java.lang.Object), (r1v54 java.lang.Object) binds: [B:67:0x01ad, B:31:0x00b5] A[DONT_GENERATE, DONT_INLINE]
  0x01b0: PHI (r3v19 vm0) = (r3v20 vm0), (r3v26 vm0) binds: [B:67:0x01ad, B:31:0x00b5] A[DONT_GENERATE, DONT_INLINE]
  0x01b0: PHI (r12v2 long) = (r12v3 long), (r12v9 long) binds: [B:67:0x01ad, B:31:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x021b  */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02a2, code lost:
    
        if (defpackage.y10.o(r0, r1, false, false, r23, 14) == r9) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02e6, code lost:
    
        if (r0.w(r1, r4, r3, r23) == r9) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02e9, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0317, code lost:
    
        if (defpackage.y10.b(r0, r1, r4, r3, r23) == r9) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0206, code lost:
    
        if (r8.emit(r0, r23) == r9) goto L81;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0193 -> B:45:0x010e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01e6 -> B:82:0x020a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x01f0 -> B:82:0x020a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0206 -> B:82:0x020a). Please report as a decompilation issue!!! */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 852
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x10.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x10(dz6 dz6Var, wfe wfeVar, long j, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 3;
        this.i = dz6Var;
        this.j = wfeVar;
        this.f = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x10(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.j = obj;
    }
}
