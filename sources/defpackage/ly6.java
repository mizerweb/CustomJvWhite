package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ly6 extends mdh implements qf7 {
    public int e;
    public final /* synthetic */ vfe f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ vt4 j;
    public final /* synthetic */ njd k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly6(vfe vfeVar, long j, long j2, long j3, vt4 vt4Var, njd njdVar, Object obj, lq4 lq4Var) {
        super(2, lq4Var);
        this.f = vfeVar;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = vt4Var;
        this.k = njdVar;
        this.l = obj;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new ly6(this.f, this.g, this.h, this.i, this.j, this.k, this.l, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((ly6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if (defpackage.yab.K0(r10.j, r11, r10) == r5) goto L17;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.e
            r1 = 0
            vfe r2 = r10.f
            r3 = 2
            r4 = 1
            hu4 r5 = defpackage.hu4.a
            if (r0 == 0) goto L1d
            if (r0 == r4) goto L19
            if (r0 != r3) goto L13
            defpackage.ch3.d0(r11)
            goto L5f
        L13:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r10)
            return r1
        L19:
            defpackage.ch3.d0(r11)
            goto L2e
        L1d:
            defpackage.ch3.d0(r11)
            long r6 = r2.a
            long r8 = r10.g
            long r6 = r6 - r8
            r10.e = r4
            java.lang.Object r11 = defpackage.rx8.t(r6, r10)
            if (r11 != r5) goto L2e
            goto L5e
        L2e:
            long r6 = r10.h
            long r8 = r2.a
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 != 0) goto L5f
            ghb r11 = defpackage.ew5.b
            long r6 = java.lang.System.nanoTime()
            lw5 r11 = defpackage.lw5.NANOSECONDS
            long r6 = defpackage.qe7.P(r6, r11)
            long r6 = defpackage.ew5.g(r6)
            long r8 = r10.i
            long r6 = r6 + r8
            r2.a = r6
            qob r11 = new qob
            njd r0 = r10.k
            java.lang.Object r2 = r10.l
            r11.<init>(r0, r2, r1)
            r10.e = r3
            vt4 r0 = r10.j
            java.lang.Object r10 = defpackage.yab.K0(r0, r11, r10)
            if (r10 != r5) goto L5f
        L5e:
            return r5
        L5f:
            sbi r10 = defpackage.sbi.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ly6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
