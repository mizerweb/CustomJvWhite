package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qt6 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public long g;
    public Object h;
    public Object i;
    public Object j;
    public final /* synthetic */ Object k;
    public Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qt6(Object obj, long j, Object obj2, Object obj3, g4b g4bVar, Object obj4, Object obj5, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.j = obj;
        this.g = j;
        this.k = obj2;
        this.l = obj3;
        this.m = g4bVar;
        this.n = obj4;
        this.o = obj5;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.o;
        Object obj3 = this.n;
        Object obj4 = this.m;
        Object obj5 = this.k;
        switch (i) {
            case 0:
                return new qt6((b41) this.i, (wfi) obj5, (zt6) obj4, (fd4) obj3, (njd) obj2, lq4Var);
            case 1:
                return new qt6((iva) this.j, this.g, (CharSequence) obj5, (Long) this.l, (g4b) obj4, (ng5) obj3, (q87) obj2, lq4Var, 1);
            default:
                return new qt6((i1j) this.j, this.g, (Long) obj5, (lzi) this.l, (g4b) obj4, (q87) obj3, (Long) obj2, lq4Var, 2);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((qt6) create((fd4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((qt6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((qt6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x009f  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0161, code lost:
    
        if (r2 == r13) goto L39;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qt6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt6(b41 b41Var, wfi wfiVar, zt6 zt6Var, fd4 fd4Var, njd njdVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 0;
        this.i = b41Var;
        this.k = wfiVar;
        this.m = zt6Var;
        this.n = fd4Var;
        this.o = njdVar;
    }
}
