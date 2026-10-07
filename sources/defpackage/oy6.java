package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class oy6 extends mdh implements qf7 {
    public long e;
    public int f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ vfe i;
    public final /* synthetic */ vt4 j;
    public final /* synthetic */ njd k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy6(long j, long j2, vfe vfeVar, vt4 vt4Var, njd njdVar, Object obj, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = j;
        this.h = j2;
        this.i = vfeVar;
        this.j = vt4Var;
        this.k = njdVar;
        this.l = obj;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new oy6(this.g, this.h, this.i, this.j, this.k, this.l, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((oy6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (defpackage.yab.K0(r12.j, r13, r12) == r5) goto L17;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.f
            r1 = 0
            lw5 r2 = defpackage.lw5.NANOSECONDS
            r3 = 2
            r4 = 1
            hu4 r5 = defpackage.hu4.a
            if (r0 == 0) goto L1f
            if (r0 == r4) goto L19
            if (r0 != r3) goto L13
            defpackage.ch3.d0(r13)
            goto L70
        L13:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r12)
            return r1
        L19:
            long r6 = r12.e
            defpackage.ch3.d0(r13)
            goto L3e
        L1f:
            defpackage.ch3.d0(r13)
            ghb r13 = defpackage.ew5.b
            long r6 = java.lang.System.nanoTime()
            long r6 = defpackage.qe7.P(r6, r2)
            long r6 = defpackage.ew5.g(r6)
            long r8 = r12.g
            long r8 = r8 - r6
            r12.e = r6
            r12.f = r4
            java.lang.Object r13 = defpackage.rx8.t(r8, r12)
            if (r13 != r5) goto L3e
            goto L6f
        L3e:
            vfe r13 = r12.i
            long r8 = r13.a
            long r10 = r12.h
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 != 0) goto L70
            ghb r0 = defpackage.ew5.b
            long r8 = java.lang.System.nanoTime()
            long r8 = defpackage.qe7.P(r8, r2)
            long r8 = defpackage.ew5.g(r8)
            r13.a = r8
            qc5 r13 = new qc5
            java.lang.Object r0 = r12.l
            r2 = 15
            njd r4 = r12.k
            r13.<init>(r4, r0, r1, r2)
            r12.e = r6
            r12.f = r3
            vt4 r0 = r12.j
            java.lang.Object r12 = defpackage.yab.K0(r0, r13, r12)
            if (r12 != r5) goto L70
        L6f:
            return r5
        L70:
            sbi r12 = defpackage.sbi.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oy6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
