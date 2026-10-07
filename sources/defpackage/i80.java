package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i80 extends mdh implements qf7 {
    public final /* synthetic */ int e = 2;
    public int f;
    public final /* synthetic */ long g;
    public Object h;
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i80(n23 n23Var, long j, String str, dq5 dq5Var, long j2, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = n23Var;
        this.g = j;
        this.h = str;
        this.k = dq5Var;
        this.i = j2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.k;
        switch (i) {
            case 0:
                return new i80(this.j, lq4Var, (m80) obj2, this.g);
            case 1:
                long j = this.i;
                return new i80((n23) this.j, this.g, (String) this.h, (dq5) obj2, j, lq4Var);
            case 2:
                u8h u8hVar = (u8h) this.h;
                i80 i80Var = new i80(this.g, this.i, (fz6) obj2, u8hVar, lq4Var);
                i80Var.j = obj;
                return i80Var;
            case 3:
                i80 i80Var2 = new i80((gu4) obj2, this.g, (hk7) this.h, this.i, lq4Var);
                i80Var2.j = obj;
                return i80Var2;
            default:
                f8b f8bVar = (f8b) this.h;
                return new i80((y9d) this.j, this.g, this.i, (sfa) obj2, f8bVar, lq4Var);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((i80) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((i80) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((i80) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((i80) create((vg4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((i80) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:94:0x0215  */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x024a, code lost:
    
        if (r0 == r15) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0256, code lost:
    
        if (defpackage.n23.B(r14, r11, r4, r2, r3) == r15) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b2, code lost:
    
        if (defpackage.n23.C(r14, r9, r12, r2, r3) == r15) goto L116;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i80.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i80(long j, long j2, fz6 fz6Var, u8h u8hVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = j;
        this.i = j2;
        this.k = fz6Var;
        this.h = u8hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i80(gu4 gu4Var, long j, hk7 hk7Var, long j2, lq4 lq4Var) {
        super(2, lq4Var);
        this.k = gu4Var;
        this.g = j;
        this.h = hk7Var;
        this.i = j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i80(y9d y9dVar, long j, long j2, sfa sfaVar, f8b f8bVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = y9dVar;
        this.g = j;
        this.i = j2;
        this.k = sfaVar;
        this.h = f8bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i80(Object obj, lq4 lq4Var, m80 m80Var, long j) {
        super(2, lq4Var);
        this.j = obj;
        this.k = m80Var;
        this.g = j;
    }
}
