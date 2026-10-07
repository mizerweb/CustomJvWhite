package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class md3 extends mdh implements qf7 {
    public xd3 e;
    public ic6 f;
    public int g;
    public final /* synthetic */ xd3 h;
    public final /* synthetic */ Long i;
    public final /* synthetic */ lzi j;
    public final /* synthetic */ Long k;
    public final /* synthetic */ q87 l;
    public final /* synthetic */ g4b m;
    public final /* synthetic */ Long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md3(xd3 xd3Var, Long l, lzi lziVar, Long l2, q87 q87Var, g4b g4bVar, Long l3, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = xd3Var;
        this.i = l;
        this.j = lziVar;
        this.k = l2;
        this.l = q87Var;
        this.m = g4bVar;
        this.n = l3;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new md3(this.h, this.i, this.j, this.k, this.l, this.m, this.n, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((md3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0087, code lost:
    
        if (r0 == r8) goto L18;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r5 = r20
            int r0 = r5.g
            sbi r6 = defpackage.sbi.a
            java.lang.Long r1 = r5.i
            r2 = 2
            r3 = 1
            xd3 r7 = r5.h
            hu4 r8 = defpackage.hu4.a
            if (r0 == 0) goto L2a
            if (r0 == r3) goto L26
            if (r0 != r2) goto L1f
            ic6 r0 = r5.f
            xd3 r7 = r5.e
            defpackage.ch3.d0(r21)
            r9 = r0
            r0 = r21
            goto L8a
        L1f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r0)
            r0 = 0
            return r0
        L26:
            defpackage.ch3.d0(r21)
            goto L6c
        L2a:
            defpackage.ch3.d0(r21)
            ny8 r0 = r7.G
            java.lang.Object r0 = r0.getValue()
            r10 = r0
            i1j r10 = (defpackage.i1j) r10
            long r11 = r1.longValue()
            r5.g = r3
            ny8 r0 = r10.a
            java.lang.Object r0 = r0.getValue()
            xhh r0 = (defpackage.xhh) r0
            n0c r0 = (defpackage.n0c) r0
            xt4 r0 = r0.b()
            qt6 r9 = new qt6
            r18 = 0
            r19 = 2
            java.lang.Long r13 = r5.k
            lzi r14 = r5.j
            g4b r15 = r5.m
            q87 r3 = r5.l
            java.lang.Long r4 = r5.n
            r16 = r3
            r17 = r4
            r9.<init>(r10, r11, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r0 = defpackage.yab.K0(r0, r9, r5)
            if (r0 != r8) goto L68
            goto L69
        L68:
            r0 = r6
        L69:
            if (r0 != r8) goto L6c
            goto L89
        L6c:
            ic6 r9 = r7.L1
            long r0 = r1.longValue()
            ny8 r3 = r7.z
            java.lang.Object r3 = r3.getValue()
            i51 r3 = (defpackage.i51) r3
            r5.e = r7
            r5.f = r9
            r5.g = r2
            r2 = 1
            q87 r4 = r5.l
            java.lang.Object r0 = defpackage.ldf.d(r0, r2, r3, r4, r5)
            if (r0 != r8) goto L8a
        L89:
            return r8
        L8a:
            zv8[] r1 = defpackage.xd3.X1
            r7.getClass()
            defpackage.a8j.x(r9, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.md3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
