package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class j8i extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ k8i h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8i(Object obj, lq4 lq4Var, k8i k8iVar) {
        super(2, lq4Var);
        this.e = 1;
        this.g = obj;
        this.h = k8iVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        k8i k8iVar = this.h;
        switch (i) {
            case 0:
                j8i j8iVar = new j8i(k8iVar, lq4Var, 0);
                j8iVar.g = obj;
                return j8iVar;
            case 1:
                return new j8i(this.g, lq4Var, k8iVar);
            default:
                j8i j8iVar2 = new j8i(k8iVar, lq4Var, 2);
                j8iVar2.g = obj;
                return j8iVar2;
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
        return ((j8i) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r15 == r3) goto L29;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j8i.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j8i(k8i k8iVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = k8iVar;
    }
}
