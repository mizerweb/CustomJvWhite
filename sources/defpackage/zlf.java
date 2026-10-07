package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zlf extends mdh implements qf7 {
    public njf e;
    public long[] f;
    public Object[] g;
    public long[] h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public long o;
    public int p;
    public final /* synthetic */ l8b q;
    public final /* synthetic */ njf r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zlf(l8b l8bVar, njf njfVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.q = l8bVar;
        this.r = njfVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new zlf(this.q, this.r, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((zlf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007d  */
    /* JADX WARN: Code duplicated, block: B:37:0x015f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0168  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x007d -> B:16:0x0098). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x015f -> B:38:0x0166). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zlf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
