package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i53 extends mdh implements qf7 {
    public final /* synthetic */ int e = 3;
    public int f;
    public long g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i53(fg5 fg5Var, lq4 lq4Var, List list, List list2, List list3, jd9 jd9Var, oe oeVar, long j) {
        super(2, lq4Var);
        this.h = fg5Var;
        this.i = list;
        this.j = list2;
        this.k = list3;
        this.l = jd9Var;
        this.m = oeVar;
        this.g = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.m;
        Object obj3 = this.l;
        switch (i) {
            case 0:
                return new i53((l63) obj3, (ny8) obj2, lq4Var);
            case 1:
                return new i53((fg5) this.h, lq4Var, (List) this.i, (List) this.j, (List) this.k, (jd9) obj3, (oe) obj2, this.g);
            case 2:
                return new i53((jsa) this.i, this.g, (c61) this.j, (kg8) this.k, (g61) obj3, (g4b) obj2, lq4Var);
            default:
                i53 i53Var = new i53((b3h) obj3, this.g, (azg) obj2, lq4Var);
                i53Var.k = obj;
                return i53Var;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((i53) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((i53) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((i53) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((i53) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0294  */
    /* JADX WARN: Code duplicated, block: B:107:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:113:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:18:0x0095  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:267:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:273:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x0286 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x029e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:? A[LOOP:2: B:98:0x028e->B:284:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x00d7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:51:0x012f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0153  */
    /* JADX WARN: Code duplicated, block: B:59:0x017e  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c0 A[LOOP:5: B:64:0x01b8->B:66:0x01c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x0215  */
    /* JADX WARN: Code duplicated, block: B:74:0x0224  */
    /* JADX WARN: Code duplicated, block: B:76:0x022e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0238 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x0246  */
    /* JADX WARN: Code duplicated, block: B:94:0x027e  */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02fb, code lost:
    
        if (r13.emit(r1, r37) == r14) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x04d2, code lost:
    
        if (defpackage.iva.b(r0, r2, r4, r4, null, null, null, r37, 112) == r13) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x060d, code lost:
    
        if (r1.a(r1, r0, r4, r6, r37) == r13) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0810, code lost:
    
        if (defpackage.l63.E(r3, r2, r37) == r1) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010d, code lost:
    
        if (r13.emit(r9, r37) == r14) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0111, code lost:
    
        r23 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014f, code lost:
    
        if (r13.emit(r0, r37) == r14) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x026b, code lost:
    
        if (r13.emit(r9, r37) == r14) goto L116;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2120
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i53.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i53(l63 l63Var, ny8 ny8Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.l = l63Var;
        this.m = ny8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i53(jsa jsaVar, long j, c61 c61Var, kg8 kg8Var, g61 g61Var, g4b g4bVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.i = jsaVar;
        this.g = j;
        this.j = c61Var;
        this.k = kg8Var;
        this.l = g61Var;
        this.m = g4bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i53(b3h b3hVar, long j, azg azgVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.l = b3hVar;
        this.g = j;
        this.m = azgVar;
    }
}
