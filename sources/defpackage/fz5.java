package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fz5 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public Object j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fz5(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.m = obj;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                fz5 fz5Var = new fz5((iz5) obj2, lq4Var, 0);
                fz5Var.k = obj;
                return fz5Var;
            default:
                return new fz5((iae) obj2, lq4Var, 1);
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
        return ((fz5) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0085 A[Catch: all -> 0x00be, CancellationException -> 0x0125, TRY_LEAVE, TryCatch #3 {all -> 0x00be, blocks: (B:24:0x007f, B:26:0x0085), top: B:175:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b5 -> B:32:0x00b7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
