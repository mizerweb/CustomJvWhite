package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class m25 extends mdh implements cf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m25(Object obj, lq4 lq4Var, int i) {
        super(1, lq4Var);
        this.e = i;
        this.g = obj;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        int i = this.e;
        Object obj = this.g;
        switch (i) {
            case 0:
                return new m25((n25) obj, lq4Var, 0);
            case 1:
                return new m25((vb2) obj, lq4Var, 1);
            case 2:
                return new m25((pm2) obj, lq4Var, 2);
            case 3:
                return new m25((ph3) obj, lq4Var, 3);
            case 4:
                return new m25((in4) obj, lq4Var, 4);
            case 5:
                return new m25((bre) obj, lq4Var, 5);
            case 6:
                return new m25((vei) obj, lq4Var, 6);
            case 7:
                return new m25((uli) obj, lq4Var, 7);
            default:
                return new m25((efk) obj, lq4Var, 8);
        }
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj;
        switch (i) {
            case 0:
                return ((m25) create(lq4Var)).invokeSuspend(sbiVar);
            case 1:
                return ((m25) create(lq4Var)).invokeSuspend(sbiVar);
            case 2:
                return ((m25) create(lq4Var)).invokeSuspend(sbiVar);
            case 3:
                return ((m25) create(lq4Var)).invokeSuspend(sbiVar);
            case 4:
                return ((m25) create(lq4Var)).invokeSuspend(sbiVar);
            case 5:
                return ((m25) create(lq4Var)).invokeSuspend(sbiVar);
            case 6:
                return ((m25) create(lq4Var)).invokeSuspend(sbiVar);
            case 7:
                return ((m25) create(lq4Var)).invokeSuspend(sbiVar);
            default:
                return new m25((efk) this.g, lq4Var, 8).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:126:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:129:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:135:0x0203  */
    /* JADX WARN: Code duplicated, block: B:138:0x0207  */
    /* JADX WARN: Code duplicated, block: B:141:0x020c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0229  */
    /* JADX WARN: Code duplicated, block: B:147:0x022d  */
    /* JADX WARN: Code duplicated, block: B:150:0x0232  */
    /* JADX WARN: Code duplicated, block: B:153:0x0245  */
    /* JADX WARN: Code duplicated, block: B:156:0x0258 A[Catch: all -> 0x017c, CancellationException -> 0x026c, TRY_ENTER, TRY_LEAVE, TryCatch #5 {CancellationException -> 0x026c, all -> 0x017c, blocks: (B:106:0x0177, B:156:0x0258), top: B:195:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:171:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:174:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:177:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:180:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:183:0x02e7  */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0268, code lost:
    
        if (r15.d(r14) == r5) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02e8, code lost:
    
        if (r14 == r5) goto L185;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m25.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
