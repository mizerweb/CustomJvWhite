package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gjc extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public Object f;
    public long g;
    public long h;
    public int i;
    public int j;
    public int k;
    public final /* synthetic */ long l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjc(hjc hjcVar, long j, r7a r7aVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.o = hjcVar;
        this.l = j;
        this.r = r7aVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.r;
        switch (i) {
            case 0:
                gjc gjcVar = new gjc((hjc) this.o, this.l, (r7a) obj2, lq4Var);
                gjcVar.f = obj;
                return gjcVar;
            default:
                return new gjc((u1h) this.q, this.l, (azg) obj2, lq4Var);
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
        return ((gjc) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:101:0x03d6 A[Catch: all -> 0x035e, CancellationException -> 0x0423, TryCatch #10 {CancellationException -> 0x0423, blocks: (B:9:0x005b, B:98:0x03cf, B:104:0x0402, B:101:0x03d6, B:103:0x03de, B:15:0x008d, B:93:0x03a6, B:20:0x00c4, B:76:0x034c, B:78:0x0354, B:89:0x0378, B:83:0x0363, B:84:0x0367, B:86:0x036d, B:25:0x0103, B:73:0x0327, B:29:0x0139, B:69:0x02f3, B:33:0x017a, B:63:0x02bd, B:65:0x02c7, B:58:0x0279), top: B:199:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:103:0x03de A[Catch: all -> 0x035e, CancellationException -> 0x0423, TryCatch #10 {CancellationException -> 0x0423, blocks: (B:9:0x005b, B:98:0x03cf, B:104:0x0402, B:101:0x03d6, B:103:0x03de, B:15:0x008d, B:93:0x03a6, B:20:0x00c4, B:76:0x034c, B:78:0x0354, B:89:0x0378, B:83:0x0363, B:84:0x0367, B:86:0x036d, B:25:0x0103, B:73:0x0327, B:29:0x0139, B:69:0x02f3, B:33:0x017a, B:63:0x02bd, B:65:0x02c7, B:58:0x0279), top: B:199:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:122:0x042d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0435  */
    /* JADX WARN: Code duplicated, block: B:128:0x046d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0476  */
    /* JADX WARN: Code duplicated, block: B:132:0x047a  */
    /* JADX WARN: Code duplicated, block: B:134:0x047d  */
    /* JADX WARN: Code duplicated, block: B:145:0x049e  */
    /* JADX WARN: Code duplicated, block: B:147:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:151:0x04af  */
    /* JADX WARN: Code duplicated, block: B:155:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:156:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:208:0x0378 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x03cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x01b1 A[PHI: r1 r2 r16
  0x01b1: PHI (r1v33 java.util.List) = (r1v31 java.util.List), (r1v53 java.util.List) binds: [B:45:0x022c, B:38:0x01a4] A[DONT_GENERATE, DONT_INLINE]
  0x01b1: PHI (r2v11 java.lang.Object) = (r2v10 java.lang.Object), (r2v15 java.lang.Object) binds: [B:45:0x022c, B:38:0x01a4] A[DONT_GENERATE, DONT_INLINE]
  0x01b1: PHI (r16v4 je9) = (r8v5 je9), (r16v5 je9) binds: [B:45:0x022c, B:38:0x01a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x0239 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:50:0x023b  */
    /* JADX WARN: Code duplicated, block: B:68:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:72:0x031e  */
    /* JADX WARN: Code duplicated, block: B:75:0x034a  */
    /* JADX WARN: Code duplicated, block: B:76:0x034c A[Catch: all -> 0x035e, CancellationException -> 0x0423, PHI: r0 r1 r2 r3 r4 r6 r7 r9 r10 r14 r16 r17 r19 r26
  0x034c: PHI (r0v55 int) = (r0v50 int), (r0v61 int) binds: [B:74:0x0348, B:21:0x00c7] A[DONT_GENERATE, DONT_INLINE]
  0x034c: PHI (r1v69 int) = (r1v95 int), (r1v96 int) binds: [B:74:0x0348, B:21:0x00c7] A[DONT_GENERATE, DONT_INLINE]
  0x034c: PHI (r2v26 u1h) = (r2v47 u1h), (r2v48 u1h) binds: [B:74:0x0348, B:21:0x00c7] A[DONT_GENERATE, DONT_INLINE]
  0x034c: PHI (r3v22 w0h) = (r3v20 w0h), (r3v28 w0h) binds: [B:74:0x0348, B:21:0x00c7] A[DONT_GENERATE, DONT_INLINE]
  0x034c: PHI (r4v45 java.util.List) = (r4v41 java.util.List), (r4v48 java.util.List) binds: [B:74:0x0348, B:21:0x00c7] A[DONT_GENERATE, DONT_INLINE]
  0x034c: PHI (r6v27 u1h) = (r6v39 u1h), (r6v40 u1h) binds: [B:74:0x0348, B:21:0x00c7] A[DONT_GENERATE, DONT_INLINE]
  0x034c: PHI (r7v22 long) = (r7v21 long), (r7v23 long) binds: [B:74:0x0348, B:21:0x00c7] A[DONT_GENERATE, DONT_INLINE]
  0x034c: PHI (r9v9 java.lang.Object) = (r9v8 java.lang.Object), (r9v16 java.lang.Object) binds: [B:74:0x0348, B:21:0x00c7] A[DONT_GENERATE, DONT_INLINE]
  0x034c: PHI (r10v9 azg) = (r10v7 azg), (r10v10 azg) binds: [B:74:0x0348, B:21:0x00c7] A[DONT_GENERATE, DONT_INLINE]
  0x034c: PHI (r14v20 long) = (r14v18 long), (r14v21 long) binds: [B:74:0x0348, B:21:0x00c7] A[DONT_GENERATE, DONT_INLINE]
  0x034c: PHI (r16v13 je9) = (r16v11 je9), (r16v14 je9) binds: [B:74:0x0348, B:21:0x00c7] A[DONT_GENERATE, DONT_INLINE]
  0x034c: PHI (r17v11 je9) = (r17v8 je9), (r17v13 je9) binds: [B:74:0x0348, B:21:0x00c7] A[DONT_GENERATE, DONT_INLINE]
  0x034c: PHI (r19v15 w0h) = (r19v13 w0h), (r19v16 w0h) binds: [B:74:0x0348, B:21:0x00c7] A[DONT_GENERATE, DONT_INLINE]
  0x034c: PHI (r26v15 w0h) = (r26v13 w0h), (r26v16 w0h) binds: [B:74:0x0348, B:21:0x00c7] A[DONT_GENERATE, DONT_INLINE], TryCatch #10 {CancellationException -> 0x0423, blocks: (B:9:0x005b, B:98:0x03cf, B:104:0x0402, B:101:0x03d6, B:103:0x03de, B:15:0x008d, B:93:0x03a6, B:20:0x00c4, B:76:0x034c, B:78:0x0354, B:89:0x0378, B:83:0x0363, B:84:0x0367, B:86:0x036d, B:25:0x0103, B:73:0x0327, B:29:0x0139, B:69:0x02f3, B:33:0x017a, B:63:0x02bd, B:65:0x02c7, B:58:0x0279), top: B:199:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0354 A[Catch: all -> 0x035e, CancellationException -> 0x0423, TryCatch #10 {CancellationException -> 0x0423, blocks: (B:9:0x005b, B:98:0x03cf, B:104:0x0402, B:101:0x03d6, B:103:0x03de, B:15:0x008d, B:93:0x03a6, B:20:0x00c4, B:76:0x034c, B:78:0x0354, B:89:0x0378, B:83:0x0363, B:84:0x0367, B:86:0x036d, B:25:0x0103, B:73:0x0327, B:29:0x0139, B:69:0x02f3, B:33:0x017a, B:63:0x02bd, B:65:0x02c7, B:58:0x0279), top: B:199:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0363 A[Catch: all -> 0x035e, CancellationException -> 0x0423, TryCatch #10 {CancellationException -> 0x0423, blocks: (B:9:0x005b, B:98:0x03cf, B:104:0x0402, B:101:0x03d6, B:103:0x03de, B:15:0x008d, B:93:0x03a6, B:20:0x00c4, B:76:0x034c, B:78:0x0354, B:89:0x0378, B:83:0x0363, B:84:0x0367, B:86:0x036d, B:25:0x0103, B:73:0x0327, B:29:0x0139, B:69:0x02f3, B:33:0x017a, B:63:0x02bd, B:65:0x02c7, B:58:0x0279), top: B:199:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:86:0x036d A[Catch: all -> 0x035e, CancellationException -> 0x0423, TryCatch #10 {CancellationException -> 0x0423, blocks: (B:9:0x005b, B:98:0x03cf, B:104:0x0402, B:101:0x03d6, B:103:0x03de, B:15:0x008d, B:93:0x03a6, B:20:0x00c4, B:76:0x034c, B:78:0x0354, B:89:0x0378, B:83:0x0363, B:84:0x0367, B:86:0x036d, B:25:0x0103, B:73:0x0327, B:29:0x0139, B:69:0x02f3, B:33:0x017a, B:63:0x02bd, B:65:0x02c7, B:58:0x0279), top: B:199:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0377 A[LOOP:0: B:84:0x0367->B:88:0x0377, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:92:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:96:0x03cc  */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0508, code lost:
    
        if (r1.i(r1, r11, r4, r25) == r12) goto L161;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:103:0x03de, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 18, insn: 0x00df: MOVE (r4 I:??[OBJECT, ARRAY]) = (r18 I:??[OBJECT, ARRAY]), block:B:23:0x00d9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v73 */
    /* JADX WARN: Type inference failed for: r1v86 */
    /* JADX WARN: Type inference failed for: r1v88 */
    /* JADX WARN: Type inference failed for: r1v89 */
    /* JADX WARN: Type inference failed for: r1v90 */
    /* JADX WARN: Type inference failed for: r1v91 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, u1h] */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 1476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gjc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjc(u1h u1hVar, long j, azg azgVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.q = u1hVar;
        this.l = j;
        this.r = azgVar;
    }
}
