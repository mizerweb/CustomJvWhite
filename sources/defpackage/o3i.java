package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o3i extends mdh implements qf7 {
    public x3i e;
    public ny8 f;
    public hr2 g;
    public h41 h;
    public s3i i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ x3i q;
    public final /* synthetic */ ny8 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3i(x3i x3iVar, ny8 ny8Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.q = x3iVar;
        this.r = ny8Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        o3i o3iVar = new o3i(this.q, this.r, lq4Var);
        o3iVar.p = obj;
        return o3iVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((o3i) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x013b  */
    /* JADX WARN: Code duplicated, block: B:38:0x014d A[Catch: all -> 0x0560, TRY_LEAVE, TryCatch #0 {all -> 0x0560, blocks: (B:32:0x011c, B:36:0x0145, B:38:0x014d, B:40:0x0158, B:50:0x018f, B:69:0x0206, B:87:0x0262, B:43:0x0161), top: B:228:0x011c }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0161 A[Catch: all -> 0x0560, TRY_LEAVE, TryCatch #0 {all -> 0x0560, blocks: (B:32:0x011c, B:36:0x0145, B:38:0x014d, B:40:0x0158, B:50:0x018f, B:69:0x0206, B:87:0x0262, B:43:0x0161), top: B:228:0x011c }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01bd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [hr2] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11, types: [hr2] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16, types: [hr2] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2, types: [hr2] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32, types: [hr2] */
    /* JADX WARN: Type inference failed for: r14v33, types: [hr2] */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, p41] */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v42 */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v45 */
    /* JADX WARN: Type inference failed for: r14v46 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v6, types: [hr2] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:176:0x04d9 -> B:177:0x04e2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 1444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o3i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
