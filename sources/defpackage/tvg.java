package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tvg extends mdh implements qf7 {
    public vvg e;
    public cf7 f;
    public vvg g;
    public cf7 h;
    public long i;
    public int j;
    public int k;
    public int l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ vvg n;
    public final /* synthetic */ long o;
    public final /* synthetic */ cf7 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tvg(boolean z, vvg vvgVar, long j, cf7 cf7Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.m = z;
        this.n = vvgVar;
        this.o = j;
        this.p = cf7Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new tvg(this.m, this.n, this.o, this.p, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((tvg) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0134  */
    /* JADX WARN: Code duplicated, block: B:64:0x013c  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0122, code lost:
    
        if (defpackage.yab.K0(r14, r15, r17) == r6) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0178, code lost:
    
        if (defpackage.yab.K0(r0, r2, r17) == r6) goto L67;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x013c, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x005d: MOVE (r8 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:20:0x005d */
    /* JADX WARN: Type inference failed for: r2v11, types: [long] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tvg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
