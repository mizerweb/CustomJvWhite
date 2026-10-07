package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p43 extends mdh implements qf7 {
    public fda e;
    public long f;
    public long g;
    public int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ x43 k;
    public final /* synthetic */ x7a l;
    public final /* synthetic */ boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p43(x43 x43Var, x7a x7aVar, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.k = x43Var;
        this.l = x7aVar;
        this.m = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        p43 p43Var = new p43(this.k, this.l, this.m, lq4Var);
        p43Var.j = obj;
        return p43Var;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((p43) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:69:0x0154  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b1 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        if (r0 == r11) goto L80;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p43.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
