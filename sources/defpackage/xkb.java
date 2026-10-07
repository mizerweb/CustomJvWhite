package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xkb extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public long f;
    public long g;
    public int h;
    public Object i;
    public Object j;
    public Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xkb(ykb ykbVar, long j, long j2, tkb tkbVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.l = ykbVar;
        this.f = j;
        this.g = j2;
        this.m = tkbVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.m;
        Object obj3 = this.l;
        switch (i) {
            case 0:
                return new xkb((ykb) obj3, this.f, this.g, (tkb) obj2, lq4Var);
            default:
                xkb xkbVar = new xkb((e8f) obj3, (String) obj2, lq4Var);
                xkbVar.k = obj;
                return xkbVar;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((xkb) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((xkb) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0214  */
    /* JADX WARN: Code duplicated, block: B:112:0x0217  */
    /* JADX WARN: Code duplicated, block: B:118:0x0245  */
    /* JADX WARN: Code duplicated, block: B:120:0x0257  */
    /* JADX WARN: Code duplicated, block: B:123:0x0265 A[LOOP:2: B:119:0x0255->B:123:0x0265, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:128:0x0294 A[PHI: r0 r1 r2
  0x0294: PHI (r0v37 x60) = (r0v25 x60), (r0v59 x60) binds: [B:126:0x0290, B:60:0x0127] A[DONT_GENERATE, DONT_INLINE]
  0x0294: PHI (r1v10 sfa) = (r1v5 sfa), (r1v16 sfa) binds: [B:126:0x0290, B:60:0x0127] A[DONT_GENERATE, DONT_INLINE]
  0x0294: PHI (r2v6 java.lang.Long) = (r2v3 java.lang.Long), (r2v14 java.lang.Long) binds: [B:126:0x0290, B:60:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:130:0x029c  */
    /* JADX WARN: Code duplicated, block: B:133:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:136:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:138:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:141:0x0304  */
    /* JADX WARN: Code duplicated, block: B:144:0x0309  */
    /* JADX WARN: Code duplicated, block: B:147:0x0311  */
    /* JADX WARN: Code duplicated, block: B:157:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0268 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0263 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0093  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:47:0x0101  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00dd -> B:41:0x00e3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xkb(e8f e8fVar, String str, lq4 lq4Var) {
        super(2, lq4Var);
        this.l = e8fVar;
        this.m = str;
    }
}
