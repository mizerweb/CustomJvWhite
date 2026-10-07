package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mra extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public Object f;
    public long g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ long k;
    public final /* synthetic */ Serializable l;
    public Object m;
    public Object n;
    public Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mra(t50 t50Var, jsa jsaVar, j44 j44Var, long j, gjg gjgVar, String str, lq4 lq4Var) {
        super(2, lq4Var);
        this.m = t50Var;
        this.j = jsaVar;
        this.n = j44Var;
        this.k = j;
        this.o = gjgVar;
        this.l = str;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Serializable serializable = this.l;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                mra mraVar = new mra((jsa) obj2, this.g, (String) serializable, this.k, lq4Var);
                mraVar.i = obj;
                return mraVar;
            case 1:
                mra mraVar2 = new mra((t50) this.m, (jsa) obj2, (j44) this.n, this.k, (gjg) this.o, (String) serializable, lq4Var);
                mraVar2.i = obj;
                return mraVar2;
            default:
                return new mra((tyi) this.i, (List) obj2, (ArrayList) serializable, this.k, lq4Var);
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
        return ((mra) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:129:0x0339  */
    /* JADX WARN: Code duplicated, block: B:151:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:157:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:159:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:162:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:169:0x0411  */
    /* JADX WARN: Code duplicated, block: B:176:0x043c  */
    /* JADX WARN: Code duplicated, block: B:181:0x0468  */
    /* JADX WARN: Code duplicated, block: B:198:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:205:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:207:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:216:0x0526  */
    /* JADX WARN: Code duplicated, block: B:218:0x0532  */
    /* JADX WARN: Code duplicated, block: B:221:0x0554  */
    /* JADX WARN: Code duplicated, block: B:236:0x05af  */
    /* JADX WARN: Code duplicated, block: B:243:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:245:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:254:0x0603  */
    /* JADX WARN: Code duplicated, block: B:256:0x060f  */
    /* JADX WARN: Code duplicated, block: B:271:0x067d  */
    /* JADX WARN: Code duplicated, block: B:274:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:277:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:279:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:280:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:282:0x0700  */
    /* JADX WARN: Code duplicated, block: B:283:0x0723  */
    /* JADX WARN: Code duplicated, block: B:285:0x0727  */
    /* JADX WARN: Code duplicated, block: B:286:0x0740  */
    /* JADX WARN: Code duplicated, block: B:350:0x095f  */
    /* JADX WARN: Code duplicated, block: B:352:0x0963  */
    /* JADX WARN: Code duplicated, block: B:353:0x0967  */
    /* JADX WARN: Code duplicated, block: B:355:0x097a  */
    /* JADX WARN: Code duplicated, block: B:357:0x0983  */
    /* JADX WARN: Code duplicated, block: B:358:0x0989  */
    /* JADX WARN: Code duplicated, block: B:361:0x09ae  */
    /* JADX WARN: Code duplicated, block: B:364:0x09b6  */
    /* JADX WARN: Code duplicated, block: B:366:0x09c5  */
    /* JADX WARN: Code duplicated, block: B:368:0x09d1  */
    /* JADX WARN: Code duplicated, block: B:371:0x09f8  */
    /* JADX WARN: Code duplicated, block: B:374:0x09ff  */
    /* JADX WARN: Code duplicated, block: B:378:0x0a49  */
    /* JADX WARN: Code duplicated, block: B:380:0x0a4c  */
    /* JADX WARN: Code duplicated, block: B:385:0x0a68 A[PHI: r0 r1 r4
  0x0a68: PHI (r0v46 rt2) = (r0v40 rt2), (r0v57 rt2) binds: [B:383:0x0a64, B:340:0x08f3] A[DONT_GENERATE, DONT_INLINE]
  0x0a68: PHI (r1v21 java.lang.Object) = (r1v17 java.lang.Object), (r1v26 java.lang.Object) binds: [B:383:0x0a64, B:340:0x08f3] A[DONT_GENERATE, DONT_INLINE]
  0x0a68: PHI (r4v8 java.lang.String) = (r4v5 java.lang.String), (r4v12 java.lang.String) binds: [B:383:0x0a64, B:340:0x08f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:387:0x0a6c  */
    /* JADX WARN: Code duplicated, block: B:394:0x0a9d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:395:0x0a9f  */
    /* JADX WARN: Code duplicated, block: B:403:0x0ada A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:404:0x0adc  */
    /* JADX WARN: Code duplicated, block: B:407:0x0b02  */
    /* JADX WARN: Code duplicated, block: B:422:0x05c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:425:0x04e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x03e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0113 A[LOOP:0: B:49:0x010d->B:51:0x0113, LOOP_END] */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0432, code lost:
    
        if (r0.a(r6, r5, r1) == r10) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0464, code lost:
    
        if (r0.a(r2, r11, r1, r6, r5) == r10) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0522, code lost:
    
        if (r0.a(r3, r5, r6) == r10) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0550, code lost:
    
        if (r0.a(r1, r3, r7, r6, r5) == r10) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x05ff, code lost:
    
        if (r0.a(r1, r5, r3) == r10) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x07bb, code lost:
    
        if (r0 == r14) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0835, code lost:
    
        if (r0.b(r1, r6, r8, r7, r3, r5) == r14) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0a38, code lost:
    
        if (r6 == r14) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0afe, code lost:
    
        if (r0.collect(r1, r5) == r14) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0233, code lost:
    
        if (r0 == r10) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mra.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mra(jsa jsaVar, long j, String str, long j2, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = jsaVar;
        this.g = j;
        this.l = str;
        this.k = j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mra(tyi tyiVar, List list, ArrayList arrayList, long j, lq4 lq4Var) {
        super(2, lq4Var);
        this.i = tyiVar;
        this.j = list;
        this.l = arrayList;
        this.k = j;
    }
}
