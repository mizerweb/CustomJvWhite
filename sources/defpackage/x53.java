package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class x53 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public int g;
    public long h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x53(int i, a8j a8jVar, long j, lq4 lq4Var, int i2) {
        super(2, lq4Var);
        this.e = i2;
        this.g = i;
        this.i = a8jVar;
        this.h = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                return new x53(this.g, (l63) obj2, lq4Var);
            case 1:
                return new x53(this.g, (rl3) obj2, this.h, lq4Var, 1);
            case 2:
                return new x53(this.g, (yk4) obj2, this.h, lq4Var, 2);
            case 3:
                return new x53((fva) obj2, this.h, this.g, lq4Var, 3);
            case 4:
                return new x53(this.h, (yob) obj2, lq4Var);
            default:
                return new x53((end) obj2, this.h, this.g, lq4Var, 5);
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
        }
        return ((x53) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x02ac, code lost:
    
        if (r1 == r3) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x041e, code lost:
    
        if (defpackage.yk4.B(r12, r1, false, r32) == r3) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x042d, code lost:
    
        if (defpackage.yk4.B(r12, r1, true, r32) == r3) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0445, code lost:
    
        if (r1 == r3) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04a0, code lost:
    
        if (defpackage.yab.K0(r4, r18, r32) == r3) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x04da, code lost:
    
        if (defpackage.yab.K0(r4, r18, r32) == r3) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x04e6, code lost:
    
        if (defpackage.yk4.C(r12, r1, true, r32) == r3) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017a, code lost:
    
        if (r0 == r2) goto L73;
     */
    /* JADX WARN: Unexpected iteration count in SwitchBreakVisitor. Please report as an issue */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 2856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x53.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x53(int i, l63 l63Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 0;
        this.i = l63Var;
        this.g = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x53(long j, yob yobVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 4;
        this.h = j;
        this.i = yobVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x53(Object obj, long j, int i, lq4 lq4Var, int i2) {
        super(2, lq4Var);
        this.e = i2;
        this.i = obj;
        this.h = j;
        this.g = i;
    }
}
