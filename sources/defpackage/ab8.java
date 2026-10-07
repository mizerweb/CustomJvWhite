package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ab8 extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public /* synthetic */ Object f;
    public final /* synthetic */ rb8 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab8(int i, lq4 lq4Var, rb8 rb8Var) {
        super(2, lq4Var);
        this.g = rb8Var;
        this.h = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        rb8 rb8Var = this.g;
        switch (i) {
            case 0:
                ab8 ab8Var = new ab8(rb8Var, lq4Var);
                ab8Var.f = obj;
                return ab8Var;
            default:
                ab8 ab8Var2 = new ab8(this.h, lq4Var, rb8Var);
                ab8Var2.f = obj;
                return ab8Var2;
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
                return ((ab8) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
            default:
                ((ab8) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00af, code lost:
    
        if (r13 == r8) goto L22;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.e
            r1 = 2
            rb8 r2 = r12.g
            r3 = 0
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L3a;
                default: goto Lb;
            }
        Lb:
            java.lang.Object r0 = r12.f
            gu4 r0 = (defpackage.gu4) r0
            defpackage.ch3.d0(r13)
            gb8 r13 = new gb8
            r13.<init>(r4, r5, r2)
            r6 = 3
            sgg r13 = defpackage.yab.i0(r0, r5, r3, r13, r6)
            int r12 = r12.h
            hb8 r7 = new hb8
            r7.<init>(r12, r3)
            r13.Y(r7)
            gb8 r13 = new gb8
            r13.<init>(r1, r5, r2)
            sgg r13 = defpackage.yab.i0(r0, r5, r3, r13, r6)
            hb8 r0 = new hb8
            r0.<init>(r12, r4)
            r13.Y(r0)
            sbi r12 = defpackage.sbi.a
            return r12
        L3a:
            xhh r0 = r2.d
            java.lang.Object r6 = r12.f
            gu4 r6 = (defpackage.gu4) r6
            int r7 = r12.h
            hu4 r8 = defpackage.hu4.a
            if (r7 == 0) goto L58
            if (r7 == r4) goto L54
            if (r7 != r1) goto L4e
            defpackage.ch3.d0(r13)
            goto Lb3
        L4e:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r12)
            goto Lbf
        L54:
            defpackage.ch3.d0(r13)
            goto L74
        L58:
            defpackage.ch3.d0(r13)
            r12.f = r6
            r12.h = r4
            r13 = r0
            n0c r13 = (defpackage.n0c) r13
            xt4 r13 = r13.b()
            vk4 r4 = new vk4
            r7 = 21
            r4.<init>(r2, r5, r7)
            java.lang.Object r13 = defpackage.yab.K0(r13, r4, r12)
            if (r13 != r8) goto L74
            goto Lb1
        L74:
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r4 = new java.util.ArrayList
            r7 = 10
            int r7 = defpackage.yw3.W0(r13, r7)
            r4.<init>(r7)
            java.util.Iterator r13 = r13.iterator()
        L85:
            boolean r7 = r13.hasNext()
            if (r7 == 0) goto La7
            java.lang.Object r7 = r13.next()
            nh7 r7 = (defpackage.nh7) r7
            r9 = r0
            n0c r9 = (defpackage.n0c) r9
            xt4 r9 = r9.b()
            qc5 r10 = new qc5
            r11 = 27
            r10.<init>(r2, r7, r5, r11)
            yf5 r7 = defpackage.yab.h(r6, r9, r3, r10, r1)
            r4.add(r7)
            goto L85
        La7:
            r12.f = r5
            r12.h = r1
            java.lang.Object r13 = defpackage.ch3.c(r4, r12)
            if (r13 != r8) goto Lb3
        Lb1:
            r5 = r8
            goto Lbf
        Lb3:
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            mu1 r12 = new mu1
            r0 = 4
            r12.<init>(r0, r2)
            java.util.List r5 = defpackage.ww3.M1(r13, r12)
        Lbf:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab8(rb8 rb8Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = rb8Var;
    }
}
