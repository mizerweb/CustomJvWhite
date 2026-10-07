package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ay2 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ hy2 g;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ay2(hy2 hy2Var, boolean z, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = hy2Var;
        this.h = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        hy2 hy2Var = this.g;
        switch (i) {
            case 0:
                return new ay2(hy2Var, this.h, lq4Var, 0);
            case 1:
                return new ay2(hy2Var, this.h, lq4Var, 1);
            case 2:
                return new ay2(hy2Var, this.h, lq4Var, 2);
            default:
                return new ay2(hy2Var, lq4Var);
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
            case 1:
                break;
            case 2:
                break;
        }
        return ((ay2) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        if (r1.emit(r2, r17) == r6) goto L27;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay2(hy2 hy2Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 3;
        this.g = hy2Var;
    }
}
