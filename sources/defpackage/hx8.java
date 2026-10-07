package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hx8 extends koe implements qf7 {
    public final /* synthetic */ int c;
    public Object[] d;
    public long[] e;
    public int f;
    public int g;
    public int h;
    public int i;
    public long j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hx8(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.c = i;
        this.m = obj;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.c;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                hx8 hx8Var = new hx8((ix8) obj2, lq4Var, 0);
                hx8Var.l = obj;
                return hx8Var;
            default:
                hx8 hx8Var2 = new hx8((lri) obj2, lq4Var, 1);
                hx8Var2.l = obj;
                return hx8Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        sbi sbiVar = sbi.a;
        thf thfVar = (thf) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((hx8) create(thfVar, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:43:0x0138 A[DONT_INVERT, PHI: r1 r3 r4 r5 r6
  0x0138: PHI (r1v6 thf) = (r1v4 thf), (r1v8 thf) binds: [B:34:0x00f8, B:42:0x0134] A[DONT_GENERATE, DONT_INLINE]
  0x0138: PHI (r3v4 long[]) = (r3v2 long[]), (r3v6 long[]) binds: [B:34:0x00f8, B:42:0x0134] A[DONT_GENERATE, DONT_INLINE]
  0x0138: PHI (r4v3 java.lang.Object[]) = (r4v1 java.lang.Object[]), (r4v5 java.lang.Object[]) binds: [B:34:0x00f8, B:42:0x0134] A[DONT_GENERATE, DONT_INLINE]
  0x0138: PHI (r5v3 int) = (r5v2 int), (r5v4 int) binds: [B:34:0x00f8, B:42:0x0134] A[DONT_GENERATE, DONT_INLINE]
  0x0138: PHI (r6v2 int) = (r6v1 int), (r6v4 int) binds: [B:34:0x00f8, B:42:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x013a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0066 -> B:22:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0068 -> B:15:0x007d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0083 -> B:19:0x00a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00f8 -> B:43:0x0138). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00fa -> B:36:0x010b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0111 -> B:40:0x012f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hx8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
