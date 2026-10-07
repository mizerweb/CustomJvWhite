package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class en0 extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public int f;
    public final /* synthetic */ in0 g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en0(in0 in0Var, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = in0Var;
        this.h = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        boolean z = this.h;
        in0 in0Var = this.g;
        switch (i) {
            case 0:
                return new en0(z, in0Var, lq4Var);
            default:
                return new en0(in0Var, z, lq4Var);
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
        return ((en0) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e3, code lost:
    
        if (defpackage.in0.b(r0, r13) == r5) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ec, code lost:
    
        if (defpackage.in0.a(r0, r13) == r5) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016b, code lost:
    
        if (defpackage.in0.b(r1, r13) == r0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0174, code lost:
    
        if (defpackage.in0.a(r1, r13) == r0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:?, code lost:
    
        return r0;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en0(boolean z, in0 in0Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = z;
        this.g = in0Var;
    }
}
