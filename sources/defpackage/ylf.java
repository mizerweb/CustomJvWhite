package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ylf extends mdh implements qf7 {
    public Long e;
    public ulf f;
    public long g;
    public int h;
    public int i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ long m;
    public final /* synthetic */ amf n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylf(long j, amf amfVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.m = j;
        this.n = amfVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        ylf ylfVar = new ylf(this.m, this.n, lq4Var);
        ylfVar.l = obj;
        return ylfVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((ylf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:113:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:115:0x0204  */
    /* JADX WARN: Code duplicated, block: B:116:0x021e A[DONT_INVERT, PHI: r11
  0x021e: PHI (r11v16 int) = (r11v15 int), (r11v18 int), (r11v18 int) binds: [B:110:0x01f6, B:112:0x01fa, B:114:0x0202] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x0220  */
    /* JADX WARN: Code duplicated, block: B:118:0x0230  */
    /* JADX WARN: Code duplicated, block: B:131:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:55:0x0109  */
    /* JADX WARN: Code duplicated, block: B:58:0x0111  */
    /* JADX WARN: Code duplicated, block: B:66:0x012f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0142  */
    /* JADX WARN: Code duplicated, block: B:75:0x0147  */
    /* JADX WARN: Code duplicated, block: B:77:0x014f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0178  */
    /* JADX WARN: Code duplicated, block: B:90:0x019b  */
    /* JADX WARN: Path cross not found for [B:34:0x00b3, B:37:0x00cb], limit reached: 119 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x01dd -> B:109:0x01de). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x019b -> B:123:0x019e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ylf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
