package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bv2 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public int g;
    public int h;
    public Object i;
    public Object j;
    public /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv2(lv2 lv2Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 1;
        this.i = lv2Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new bv2((lv2) this.k, lq4Var, 0);
            case 1:
                bv2 bv2Var = new bv2((lv2) this.i, lq4Var);
                bv2Var.k = obj;
                return bv2Var;
            default:
                return new bv2((ukf) this.k, lq4Var, 2);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((bv2) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((bv2) create((String) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((bv2) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:189:0x0392 A[Catch: all -> 0x03b7, CancellationException -> 0x041e, TryCatch #4 {all -> 0x03b7, blocks: (B:187:0x038c, B:189:0x0392, B:197:0x03bb, B:192:0x0399, B:194:0x039f, B:200:0x03ce, B:202:0x03d6, B:205:0x03ed, B:207:0x03f5, B:208:0x03f9, B:210:0x03fd, B:213:0x0414, B:214:0x0419), top: B:236:0x038c }] */
    /* JADX WARN: Code duplicated, block: B:199:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:200:0x03ce A[Catch: all -> 0x03b7, CancellationException -> 0x041e, TryCatch #4 {all -> 0x03b7, blocks: (B:187:0x038c, B:189:0x0392, B:197:0x03bb, B:192:0x0399, B:194:0x039f, B:200:0x03ce, B:202:0x03d6, B:205:0x03ed, B:207:0x03f5, B:208:0x03f9, B:210:0x03fd, B:213:0x0414, B:214:0x0419), top: B:236:0x038c }] */
    /* JADX WARN: Code duplicated, block: B:202:0x03d6 A[Catch: all -> 0x03b7, CancellationException -> 0x041e, TryCatch #4 {all -> 0x03b7, blocks: (B:187:0x038c, B:189:0x0392, B:197:0x03bb, B:192:0x0399, B:194:0x039f, B:200:0x03ce, B:202:0x03d6, B:205:0x03ed, B:207:0x03f5, B:208:0x03f9, B:210:0x03fd, B:213:0x0414, B:214:0x0419), top: B:236:0x038c }] */
    /* JADX WARN: Code duplicated, block: B:204:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:205:0x03ed A[Catch: all -> 0x03b7, CancellationException -> 0x041e, TryCatch #4 {all -> 0x03b7, blocks: (B:187:0x038c, B:189:0x0392, B:197:0x03bb, B:192:0x0399, B:194:0x039f, B:200:0x03ce, B:202:0x03d6, B:205:0x03ed, B:207:0x03f5, B:208:0x03f9, B:210:0x03fd, B:213:0x0414, B:214:0x0419), top: B:236:0x038c }] */
    /* JADX WARN: Code duplicated, block: B:207:0x03f5 A[Catch: all -> 0x03b7, CancellationException -> 0x041e, TryCatch #4 {all -> 0x03b7, blocks: (B:187:0x038c, B:189:0x0392, B:197:0x03bb, B:192:0x0399, B:194:0x039f, B:200:0x03ce, B:202:0x03d6, B:205:0x03ed, B:207:0x03f5, B:208:0x03f9, B:210:0x03fd, B:213:0x0414, B:214:0x0419), top: B:236:0x038c }] */
    /* JADX WARN: Code duplicated, block: B:208:0x03f9 A[Catch: all -> 0x03b7, CancellationException -> 0x041e, TryCatch #4 {all -> 0x03b7, blocks: (B:187:0x038c, B:189:0x0392, B:197:0x03bb, B:192:0x0399, B:194:0x039f, B:200:0x03ce, B:202:0x03d6, B:205:0x03ed, B:207:0x03f5, B:208:0x03f9, B:210:0x03fd, B:213:0x0414, B:214:0x0419), top: B:236:0x038c }] */
    /* JADX WARN: Code duplicated, block: B:210:0x03fd A[Catch: all -> 0x03b7, CancellationException -> 0x041e, TryCatch #4 {all -> 0x03b7, blocks: (B:187:0x038c, B:189:0x0392, B:197:0x03bb, B:192:0x0399, B:194:0x039f, B:200:0x03ce, B:202:0x03d6, B:205:0x03ed, B:207:0x03f5, B:208:0x03f9, B:210:0x03fd, B:213:0x0414, B:214:0x0419), top: B:236:0x038c }] */
    /* JADX WARN: Code duplicated, block: B:212:0x0413  */
    /* JADX WARN: Code duplicated, block: B:213:0x0414 A[Catch: all -> 0x03b7, CancellationException -> 0x041e, TryCatch #4 {all -> 0x03b7, blocks: (B:187:0x038c, B:189:0x0392, B:197:0x03bb, B:192:0x0399, B:194:0x039f, B:200:0x03ce, B:202:0x03d6, B:205:0x03ed, B:207:0x03f5, B:208:0x03f9, B:210:0x03fd, B:213:0x0414, B:214:0x0419), top: B:236:0x038c }] */
    /* JADX WARN: Code duplicated, block: B:222:0x0427  */
    /* JADX WARN: Code duplicated, block: B:47:0x00be  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00df  */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0446, code lost:
    
        if (defpackage.lv2.q(r8, r19) == r4) goto L227;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49, types: [zkf] */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 1110
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bv2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bv2(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.k = obj;
    }
}
