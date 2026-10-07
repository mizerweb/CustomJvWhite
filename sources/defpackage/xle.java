package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xle extends mdh implements qf7 {
    public boolean e;
    public int f;
    public final /* synthetic */ dme g;
    public final /* synthetic */ aq h;
    public final /* synthetic */ qih i;
    public final /* synthetic */ kih j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xle(aq aqVar, lq4 lq4Var, dme dmeVar, kih kihVar, qih qihVar) {
        super(2, lq4Var);
        this.g = dmeVar;
        this.h = aqVar;
        this.i = qihVar;
        this.j = kihVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        qih qihVar = this.i;
        return new xle(this.h, lq4Var, this.g, this.j, qihVar);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((xle) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r3 == r12) goto L15;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.f
            sbi r2 = defpackage.sbi.a
            qih r6 = r0.i
            aq r5 = r0.h
            r9 = 3
            r10 = 2
            r11 = 1
            dme r15 = r0.g
            hu4 r12 = defpackage.hu4.a
            if (r1 == 0) goto L32
            if (r1 == r11) goto L2c
            if (r1 == r10) goto L24
            if (r1 != r9) goto L1d
            defpackage.ch3.d0(r19)
            return r2
        L1d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r0)
            r0 = 0
            return r0
        L24:
            boolean r1 = r0.e
            defpackage.ch3.d0(r19)
            r3 = r19
            goto L65
        L2c:
            defpackage.ch3.d0(r19)
            r1 = r19
            goto L4a
        L32:
            defpackage.ch3.d0(r19)
            zhb r1 = defpackage.zhb.b
            gz r3 = new gz
            r8 = 15
            r7 = 0
            r4 = r15
            r3.<init>(r4, r5, r6, r7, r8)
            r0.f = r11
            java.lang.Object r1 = defpackage.yab.K0(r1, r3, r0)
            if (r1 != r12) goto L4a
        L48:
            r4 = r12
            goto L96
        L4a:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L5a
            java.lang.String r0 = r15.s
            java.lang.String r1 = "onSuccess: ignored!"
            defpackage.gm0.Y(r0, r1)
            return r2
        L5a:
            r0.e = r1
            r0.f = r10
            java.lang.Object r3 = r5.u(r0)
            if (r3 != r12) goto L65
            goto L48
        L65:
            hih r3 = (defpackage.hih) r3
            if (r3 == 0) goto L77
            java.util.concurrent.ConcurrentHashMap r4 = r15.q
            short r3 = r3.k()
            java.lang.Short r5 = new java.lang.Short
            r5.<init>(r3)
            r4.remove(r5)
        L77:
            pih r3 = r6.c()
            r4 = r12
            wle r12 = new wle
            aq r13 = r0.h
            r14 = 0
            kih r5 = r0.j
            qih r6 = r0.i
            r16 = r5
            r17 = r6
            r12.<init>(r13, r14, r15, r16, r17)
            r0.e = r1
            r0.f = r9
            java.lang.Object r0 = r3.a(r12, r0)
            if (r0 != r4) goto L97
        L96:
            return r4
        L97:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xle.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
