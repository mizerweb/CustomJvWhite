package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class t87 extends mdh implements qf7 {
    public n87 e;
    public Set f;
    public int g;
    public int h;
    public final /* synthetic */ u87 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ CharSequence k;
    public final /* synthetic */ m8b l;
    public final /* synthetic */ g4b m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t87(u87 u87Var, boolean z, CharSequence charSequence, m8b m8bVar, g4b g4bVar, boolean z2, Long l, lq4 lq4Var) {
        super(2, lq4Var);
        this.i = u87Var;
        this.j = z;
        this.k = charSequence;
        this.l = m8bVar;
        this.m = g4bVar;
        this.n = z2;
        this.o = l;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new t87(this.i, this.j, this.k, this.l, this.m, this.n, this.o, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((t87) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0076  */
    /* JADX WARN: Code duplicated, block: B:35:0x010c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0126 A[PHI: r0 r15
  0x0126: PHI (r0v17 java.lang.Object) = (r0v9 java.lang.Object), (r0v21 java.lang.Object) binds: [B:36:0x0122, B:9:0x0043] A[DONT_GENERATE, DONT_INLINE]
  0x0126: PHI (r15v4 int) = (r15v0 int), (r15v5 int) binds: [B:36:0x0122, B:9:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0137  */
    /* JADX WARN: Code duplicated, block: B:44:0x0169  */
    /* JADX WARN: Code duplicated, block: B:50:0x0191  */
    /* JADX WARN: Code duplicated, block: B:55:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:59:0x0226 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0228  */
    /* JADX WARN: Code duplicated, block: B:61:0x0247  */
    /* JADX WARN: Code duplicated, block: B:64:0x024d  */
    /* JADX WARN: Code duplicated, block: B:67:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0108, code lost:
    
        if (r0 == r14) goto L15;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t87.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
