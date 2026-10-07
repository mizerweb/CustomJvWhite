package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class rm extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public ArrayList f;
    public int g;
    public final /* synthetic */ xm h;
    public final /* synthetic */ m8b i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm(xm xmVar, m8b m8bVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = xmVar;
        this.i = m8bVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        m8b m8bVar = this.i;
        xm xmVar = this.h;
        switch (i) {
            case 0:
                return new rm(m8bVar, xmVar, lq4Var);
            default:
                return new rm(xmVar, m8bVar, lq4Var);
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
        return ((rm) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d7 A[LOOP:0: B:41:0x00d1->B:43:0x00d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x015c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0165  */
    /* JADX WARN: Code duplicated, block: B:74:0x016d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0171  */
    /* JADX WARN: Code duplicated, block: B:78:0x0188 A[LOOP:2: B:76:0x0182->B:78:0x0188, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:85:0x01cd A[PHI: r2 r4
  0x01cd: PHI (r2v7 int) = (r2v5 int), (r2v15 int) binds: [B:83:0x01ca, B:53:0x0100] A[DONT_GENERATE, DONT_INLINE]
  0x01cd: PHI (r4v12 java.util.ArrayList) = (r4v10 java.util.ArrayList), (r4v17 java.util.ArrayList) binds: [B:83:0x01ca, B:53:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01fe, code lost:
    
        if (r3.e(r2, r22) == r10) goto L87;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm(m8b m8bVar, xm xmVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.i = m8bVar;
        this.h = xmVar;
    }
}
