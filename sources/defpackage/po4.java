package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class po4 extends mdh implements qf7 {
    public xf5 e;
    public Object f;
    public List g;
    public List h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ String k;
    public final /* synthetic */ qo4 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po4(String str, qo4 qo4Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.k = str;
        this.l = qo4Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        po4 po4Var = new po4(this.k, this.l, lq4Var);
        po4Var.j = obj;
        return po4Var;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((po4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c2 A[PHI: r2 r4 r14
  0x00c2: PHI (r2v6 java.lang.Object) = (r2v5 java.lang.Object), (r2v16 java.lang.Object) binds: [B:27:0x00bf, B:14:0x004f] A[DONT_GENERATE, DONT_INLINE]
  0x00c2: PHI (r4v4 java.util.List) = (r4v3 java.util.List), (r4v11 java.util.List) binds: [B:27:0x00bf, B:14:0x004f] A[DONT_GENERATE, DONT_INLINE]
  0x00c2: PHI (r14v3 xf5) = (r14v2 xf5), (r14v6 xf5) binds: [B:27:0x00bf, B:14:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00da, code lost:
    
        if (r0 == r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0100, code lost:
    
        if (r0 == r11) goto L38;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.po4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
