package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class uz8 extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public long f;
    public long g;
    public int h;
    public int i;
    public Object j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz8(vz8 vz8Var, long j, lq4 lq4Var) {
        super(2, lq4Var);
        this.l = vz8Var;
        this.g = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                return new uz8((vz8) obj2, this.g, lq4Var);
            default:
                return new uz8((b2a) obj2, lq4Var);
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
        return ((uz8) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0307  */
    /* JADX WARN: Code duplicated, block: B:103:0x0313  */
    /* JADX WARN: Code duplicated, block: B:104:0x0316  */
    /* JADX WARN: Code duplicated, block: B:111:0x038b  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:80:0x0227  */
    /* JADX WARN: Code duplicated, block: B:81:0x0230  */
    /* JADX WARN: Code duplicated, block: B:82:0x0234  */
    /* JADX WARN: Code duplicated, block: B:84:0x023e  */
    /* JADX WARN: Code duplicated, block: B:86:0x024b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0254  */
    /* JADX WARN: Code duplicated, block: B:96:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:99:0x02f6  */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x03ab, code lost:
    
        if (defpackage.b2a.b(r0, r7, r2, r6) == r1) goto L115;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1166
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uz8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz8(b2a b2aVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.l = b2aVar;
    }
}
