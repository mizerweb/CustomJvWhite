package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c03 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public long g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c03(long j, f37 f37Var, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 7;
        this.g = j;
        this.i = f37Var;
        this.h = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                return new c03((h03) obj2, this.g, this.h, lq4Var, 0);
            case 1:
                return new c03((ga3) obj2, this.g, this.h, lq4Var, 1);
            case 2:
                return new c03((fk3) obj2, this.g, this.h, lq4Var, 2);
            case 3:
                return new c03((rl3) obj2, this.g, this.h, lq4Var, 3);
            case 4:
                return new c03((ij4) obj2, this.g, this.h, lq4Var, 4);
            case 5:
                return new c03((nj4) obj2, this.g, this.h, lq4Var, 5);
            case 6:
                return new c03((yk4) obj2, this.g, this.h, lq4Var, 6);
            case 7:
                return new c03(this.g, (f37) obj2, this.h, lq4Var);
            case 8:
                return new c03((fva) obj2, this.g, this.h, lq4Var, 8);
            case 9:
                return new c03(this.h, (osc) obj2, lq4Var);
            default:
                return new c03((dvd) obj2, this.g, this.h, lq4Var, 10);
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
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
        return ((c03) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
    
        if (r15.a(r14, r0) == r2) goto L30;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 930
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c03.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c03(Object obj, long j, boolean z, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = obj;
        this.g = j;
        this.h = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c03(boolean z, osc oscVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 9;
        this.h = z;
        this.i = oscVar;
    }
}
