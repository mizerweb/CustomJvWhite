package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v11 extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public long f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v11(int i, long j, w11 w11Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = w11Var;
        this.f = j;
        this.h = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                long j = this.f;
                v11 v11Var = new v11(this.h, j, (w11) obj2, lq4Var);
                v11Var.i = obj;
                return v11Var;
            case 1:
                v11 v11Var2 = new v11((b47) obj2, lq4Var);
                v11Var2.i = obj;
                return v11Var2;
            default:
                v11 v11Var3 = new v11((s9d) obj2, this.h, lq4Var);
                v11Var3.i = obj;
                return v11Var3;
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
        }
        return ((v11) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0192, code lost:
    
        if (defpackage.rx8.u(r11, r23) == r8) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01c6, code lost:
    
        if (r0.a(true, r23) == r8) goto L76;
     */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0137: MOVE (r21 I:??[long, double]) = (r11 I:??[long, double]), block:B:43:0x0137 */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws ru.ok.tamtam.errors.TamErrorException {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v11.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v11(b47 b47Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = b47Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v11(s9d s9dVar, int i, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = s9dVar;
        this.h = i;
    }
}
