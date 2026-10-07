package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class he1 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public long g;
    public int h;
    public Object i;
    public Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ he1(fy fyVar, Object obj, long j, List list, int i, lq4 lq4Var, int i2) {
        super(2, lq4Var);
        this.e = i2;
        this.i = fyVar;
        this.j = obj;
        this.g = j;
        this.k = list;
        this.h = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.k;
        switch (i) {
            case 0:
                he1 he1Var = new he1((pe1) this.j, this.g, this.h, (y63) obj2, lq4Var);
                he1Var.i = obj;
                return he1Var;
            case 1:
                return new he1((fy) this.i, (um6) this.j, this.g, (List) obj2, this.h, lq4Var, 1);
            case 2:
                return new he1((mz7) obj2, lq4Var);
            default:
                return new he1((fy) this.i, (ldh) this.j, this.g, (List) obj2, this.h, lq4Var, 3);
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
        }
        return ((he1) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x024c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0277  */
    /* JADX WARN: Code duplicated, block: B:113:0x0279  */
    /* JADX WARN: Code duplicated, block: B:69:0x0155  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e9 A[PHI: r1 r4 r5 r7
  0x01e9: PHI (r1v9 java.lang.Object) = (r1v8 java.lang.Object), (r1v22 java.lang.Object) binds: [B:82:0x01e6, B:51:0x00c3] A[DONT_GENERATE, DONT_INLINE]
  0x01e9: PHI (r4v38 int) = (r4v30 int), (r4v43 int) binds: [B:82:0x01e6, B:51:0x00c3] A[DONT_GENERATE, DONT_INLINE]
  0x01e9: PHI (r5v19 long) = (r5v14 long), (r5v22 long) binds: [B:82:0x01e6, B:51:0x00c3] A[DONT_GENERATE, DONT_INLINE]
  0x01e9: PHI (r7v17 java.lang.String) = (r7v13 java.lang.String), (r7v21 java.lang.String) binds: [B:82:0x01e6, B:51:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:93:0x0214  */
    /* JADX WARN: Code duplicated, block: B:96:0x0219  */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02c5, code lost:
    
        if (defpackage.um6.b(r8, r1, r16) == r10) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02d2, code lost:
    
        if (defpackage.um6.f(r8, r5, r16) == r10) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02de, code lost:
    
        if (defpackage.um6.d(r8, r5, r1, r16) == r10) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02fa, code lost:
    
        if (defpackage.um6.e(r8, r1, r16) == r10) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0303, code lost:
    
        if (defpackage.um6.c(r8, r5, r16) == r10) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:?, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (defpackage.ldh.a(r12, r1, r16) == r13) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (defpackage.ldh.e(r12, r10, r16) == r13) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (defpackage.ldh.c(r12, r10, r1, r16) == r13) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
    
        if (defpackage.ldh.d(r12, r1, r16) == r13) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (defpackage.ldh.b(r12, r10, r16) == r13) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017a, code lost:
    
        if (r5 == r3) goto L101;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x017a -> B:72:0x017e). Please report as a decompilation issue!!! */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he1(pe1 pe1Var, long j, int i, y63 y63Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 0;
        this.j = pe1Var;
        this.g = j;
        this.h = i;
        this.k = y63Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he1(mz7 mz7Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 2;
        this.k = mz7Var;
    }
}
