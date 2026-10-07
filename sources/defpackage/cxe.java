package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cxe extends mdh implements qf7 {
    public int e;
    public long f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ p41 i;
    public final /* synthetic */ dxe j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxe(p41 p41Var, dxe dxeVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.i = p41Var;
        this.j = dxeVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        cxe cxeVar = new cxe(this.i, this.j, lq4Var);
        cxeVar.h = obj;
        return cxeVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((cxe) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    /* JADX WARN: Code duplicated, block: B:24:0x0052 A[PHI: r0 r6
  0x0052: PHI (r0v14 java.lang.Object) = (r0v27 java.lang.Object), (r0v34 java.lang.Object) binds: [B:22:0x004f, B:17:0x0032] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r6v10 int) = (r6v11 int), (r6v0 int) binds: [B:22:0x004f, B:17:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0084 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x0085 A[Catch: all -> 0x0023, Exception -> 0x0026, CancellationException -> 0x0029, TryCatch #1 {CancellationException -> 0x0029, blocks: (B:7:0x001e, B:31:0x007c, B:37:0x009f, B:34:0x0085, B:36:0x008b), top: B:75:0x001e, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f5  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
    
        if (defpackage.dxe.a(r0, r16) == r4) goto L39;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ad -> B:40:0x00b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00ec -> B:46:0x00d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00f3 -> B:46:0x00d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0120 -> B:46:0x00d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0127 -> B:46:0x00d4). Please report as a decompilation issue!!! */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxe.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
