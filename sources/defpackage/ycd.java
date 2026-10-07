package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ycd extends mdh implements qf7 {
    public vfe e;
    public ufe f;
    public ufe g;
    public Object h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ zcd k;
    public final /* synthetic */ long l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycd(zcd zcdVar, long j, int i, lq4 lq4Var) {
        super(2, lq4Var);
        this.k = zcdVar;
        this.l = j;
        this.m = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        ycd ycdVar = new ycd(this.k, this.l, this.m, lq4Var);
        ycdVar.j = obj;
        return ycdVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((ycd) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007b  */
    /* JADX WARN: Code duplicated, block: B:19:0x007f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0083  */
    /* JADX WARN: Code duplicated, block: B:25:0x008f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0094  */
    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b9, code lost:
    
        if (defpackage.rx8.u(r11, r19) == r10) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f7, code lost:
    
        if (defpackage.cqk.x(r11) == false) goto L49;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0079 -> B:33:0x00bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b9 -> B:33:0x00bc). Please report as a decompilation issue!!! */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ycd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
