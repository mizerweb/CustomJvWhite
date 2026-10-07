package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cy6 extends mdh implements qf7 {
    public wo8 e;
    public hr2 f;
    public int g;
    public int h;
    public long i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ xx6 l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy6(long j, lq4 lq4Var, xx6 xx6Var) {
        super(2, lq4Var);
        this.l = xx6Var;
        this.m = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        cy6 cy6Var = new cy6(this.m, lq4Var, this.l);
        cy6Var.k = obj;
        return cy6Var;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((cy6) create((njd) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0089  */
    /* JADX WARN: Code duplicated, block: B:15:0x0094  */
    /* JADX WARN: Code duplicated, block: B:17:0x0097  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [hr2] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0089 -> B:13:0x008c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.k
            r4 = r0
            njd r4 = (defpackage.njd) r4
            int r0 = r13.j
            r7 = 1
            r5 = 0
            if (r0 == 0) goto L24
            if (r0 != r7) goto L1d
            int r0 = r13.h
            long r1 = r13.i
            int r3 = r13.g
            hr2 r6 = r13.f
            wo8 r8 = r13.e
            defpackage.ch3.d0(r14)
            r9 = r1
            r2 = r6
            goto L8c
        L1d:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r13)
            r13 = 0
            return r13
        L24:
            defpackage.ch3.d0(r14)
            wo8 r14 = defpackage.vd7.a()
            gz r0 = new gz
            xx6 r1 = r13.l
            r2 = 8
            r0.<init>(r1, r14, r5, r2)
            r1 = 4
            r2 = 2147483647(0x7fffffff, float:NaN)
            p41 r1 = defpackage.yab.b(r2, r7, r5, r1)
            k66 r3 = defpackage.k66.a
            vt4 r3 = defpackage.n1g.M(r4, r3)
            njd r6 = new njd
            r6.<init>(r3, r1)
            r6.m0(r7, r6, r0)
            r0 = 0
            long r8 = r13.m
            r3 = r2
            r2 = r6
        L4f:
            sdf r10 = new sdf
            vt4 r1 = r13.getContext()
            r10.<init>(r1)
            ki3 r11 = r14.v0()
            ay6 r1 = new ay6
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            r10.h(r11, r1)
            ay6 r1 = new ay6
            r6 = 1
            r1.<init>(r2, r3, r4, r5, r6)
            long r11 = defpackage.rx8.e0(r8)
            defpackage.vd7.H(r10, r11, r1)
            r13.k = r4
            r13.e = r14
            r13.f = r2
            r13.g = r3
            r13.i = r8
            r13.h = r0
            r13.j = r7
            java.lang.Object r1 = r10.e(r13)
            hu4 r6 = defpackage.hu4.a
            if (r1 != r6) goto L89
            return r6
        L89:
            r9 = r8
            r8 = r14
            r14 = r1
        L8c:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L97
            sbi r13 = defpackage.sbi.a
            return r13
        L97:
            r14 = r8
            r8 = r9
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cy6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
