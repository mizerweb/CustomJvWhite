package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zd9 extends mdh implements qf7 {
    public List e;
    public wfe f;
    public int g;
    public int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ae9 k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd9(ae9 ae9Var, boolean z, String str, lq4 lq4Var) {
        super(2, lq4Var);
        this.k = ae9Var;
        this.l = z;
        this.m = str;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        zd9 zd9Var = new zd9(this.k, this.l, this.m, lq4Var);
        zd9Var.j = obj;
        return zd9Var;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((zd9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f8 A[Catch: all -> 0x015b, CancellationException -> 0x0168, Exception -> 0x0206, TamErrorException -> 0x020b, LOOP:0: B:98:0x01f2->B:100:0x01f8, LOOP_END, TryCatch #24 {CancellationException -> 0x0168, all -> 0x015b, blocks: (B:120:0x0291, B:121:0x029d, B:83:0x0197, B:85:0x019b, B:87:0x01a3, B:137:0x02f5, B:143:0x0319, B:91:0x01b1, B:94:0x01d6, B:95:0x01d8, B:97:0x01de, B:98:0x01f2, B:100:0x01f8, B:105:0x0210, B:109:0x023b, B:110:0x0257, B:112:0x025d, B:117:0x0277, B:60:0x0135, B:124:0x02a8, B:126:0x02ae), top: B:190:0x0291 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0239  */
    /* JADX WARN: Code duplicated, block: B:112:0x025d A[Catch: all -> 0x015b, CancellationException -> 0x0168, Exception -> 0x026f, TamErrorException -> 0x0273, LOOP:1: B:110:0x0257->B:112:0x025d, LOOP_END, TryCatch #31 {TamErrorException -> 0x0273, Exception -> 0x026f, blocks: (B:120:0x0291, B:109:0x023b, B:110:0x0257, B:112:0x025d, B:117:0x0277), top: B:190:0x0291 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x028f  */
    /* JADX WARN: Code duplicated, block: B:123:0x02a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x02a8 A[Catch: all -> 0x015b, CancellationException -> 0x0168, Exception -> 0x02d0, TamErrorException -> 0x02d6, TryCatch #28 {TamErrorException -> 0x02d6, Exception -> 0x02d0, blocks: (B:121:0x029d, B:124:0x02a8, B:126:0x02ae), top: B:196:0x029d }] */
    /* JADX WARN: Code duplicated, block: B:190:0x0291 A[EXC_TOP_SPLITTER, PHI: r4 r5 r10 r13 r20 r21
  0x0291: PHI (r4v12 int) = (r4v8 int), (r4v15 int) binds: [B:21:0x004f, B:118:0x028d] A[DONT_GENERATE, DONT_INLINE]
  0x0291: PHI (r5v9 java.util.List) = (r5v42 java.util.List), (r5v43 java.util.List) binds: [B:21:0x004f, B:118:0x028d] A[DONT_GENERATE, DONT_INLINE]
  0x0291: PHI (r10v5 wfe) = (r10v38 wfe), (r10v39 wfe) binds: [B:21:0x004f, B:118:0x028d] A[DONT_GENERATE, DONT_INLINE]
  0x0291: PHI (r13v7 int) = (r13v6 int), (r13v9 int) binds: [B:21:0x004f, B:118:0x028d] A[DONT_GENERATE, DONT_INLINE]
  0x0291: PHI (r20v6 java.lang.String) = (r20v5 java.lang.String), (r20v7 java.lang.String) binds: [B:21:0x004f, B:118:0x028d] A[DONT_GENERATE, DONT_INLINE]
  0x0291: PHI (r21v3 java.lang.String) = (r21v2 java.lang.String), (r21v4 java.lang.String) binds: [B:21:0x004f, B:118:0x028d] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0114 A[Catch: all -> 0x0177, CancellationException -> 0x017f, Exception -> 0x0187, TamErrorException -> 0x018f, TryCatch #26 {CancellationException -> 0x017f, all -> 0x0177, blocks: (B:47:0x00fe, B:50:0x0114, B:52:0x011a, B:58:0x012e), top: B:199:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0128  */
    /* JADX WARN: Code duplicated, block: B:57:0x012c  */
    /* JADX WARN: Code duplicated, block: B:85:0x019b A[Catch: all -> 0x015b, Exception -> 0x0160, CancellationException -> 0x0168, TamErrorException -> 0x016d, TryCatch #29 {TamErrorException -> 0x016d, Exception -> 0x0160, blocks: (B:83:0x0197, B:85:0x019b, B:87:0x01a3, B:91:0x01b1, B:94:0x01d6, B:60:0x0135), top: B:194:0x0197 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01a3 A[Catch: all -> 0x015b, Exception -> 0x0160, CancellationException -> 0x0168, TamErrorException -> 0x016d, TryCatch #29 {TamErrorException -> 0x016d, Exception -> 0x0160, blocks: (B:83:0x0197, B:85:0x019b, B:87:0x01a3, B:91:0x01b1, B:94:0x01d6, B:60:0x0135), top: B:194:0x0197 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ad A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d6 A[Catch: all -> 0x015b, Exception -> 0x0160, CancellationException -> 0x0168, TamErrorException -> 0x016d, PHI: r4 r5 r6 r10 r20 r21
  0x01d6: PHI (r4v16 int) = (r4v6 int), (r4v30 int) binds: [B:37:0x009f, B:92:0x01d2] A[DONT_GENERATE, DONT_INLINE]
  0x01d6: PHI (r5v12 int) = (r5v4 int), (r5v23 int) binds: [B:37:0x009f, B:92:0x01d2] A[DONT_GENERATE, DONT_INLINE]
  0x01d6: PHI (r6v16 java.lang.Object) = (r6v3 java.lang.Object), (r6v41 java.lang.Object) binds: [B:37:0x009f, B:92:0x01d2] A[DONT_GENERATE, DONT_INLINE]
  0x01d6: PHI (r10v7 wfe) = (r10v34 wfe), (r10v35 wfe) binds: [B:37:0x009f, B:92:0x01d2] A[DONT_GENERATE, DONT_INLINE]
  0x01d6: PHI (r20v8 java.lang.String) = (r20v1 java.lang.String), (r20v21 java.lang.String) binds: [B:37:0x009f, B:92:0x01d2] A[DONT_GENERATE, DONT_INLINE]
  0x01d6: PHI (r21v5 java.lang.String) = (r21v0 java.lang.String), (r6v30 java.lang.String) binds: [B:37:0x009f, B:92:0x01d2] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #29 {TamErrorException -> 0x016d, Exception -> 0x0160, blocks: (B:83:0x0197, B:85:0x019b, B:87:0x01a3, B:91:0x01b1, B:94:0x01d6, B:60:0x0135), top: B:194:0x0197 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01de A[Catch: all -> 0x015b, CancellationException -> 0x0168, Exception -> 0x0206, TamErrorException -> 0x020b, TryCatch #24 {CancellationException -> 0x0168, all -> 0x015b, blocks: (B:120:0x0291, B:121:0x029d, B:83:0x0197, B:85:0x019b, B:87:0x01a3, B:137:0x02f5, B:143:0x0319, B:91:0x01b1, B:94:0x01d6, B:95:0x01d8, B:97:0x01de, B:98:0x01f2, B:100:0x01f8, B:105:0x0210, B:109:0x023b, B:110:0x0257, B:112:0x025d, B:117:0x0277, B:60:0x0135, B:124:0x02a8, B:126:0x02ae), top: B:190:0x0291 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:49:0x010c, B:50:0x0114], limit reached: 200 */
    /* JADX WARN: Path cross not found for [B:50:0x0114, B:49:0x010c], limit reached: 200 */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v11, types: [wfe] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v9, types: [wfe] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:132:0x02de -> B:198:0x00f8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zd9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
