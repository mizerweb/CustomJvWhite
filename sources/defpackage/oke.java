package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oke extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ z18 g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oke(z18 z18Var, long j, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = z18Var;
        this.h = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new oke(this.g, this.h, lq4Var, 0);
            default:
                return new oke(this.g, this.h, lq4Var, 1);
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
        return ((oke) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (r14.emit(r0, r13) == r3) goto L20;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.e
            r1 = 0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            hu4 r3 = defpackage.hu4.a
            r4 = 1
            sbi r5 = defpackage.sbi.a
            switch(r0) {
                case 0: goto L5b;
                default: goto Ld;
            }
        Ld:
            int r0 = r13.f
            long r8 = r13.h
            z18 r7 = r13.g
            r12 = 2
            if (r0 == 0) goto L27
            if (r0 == r4) goto L23
            if (r0 != r12) goto L1f
            defpackage.ch3.d0(r14)
        L1d:
            r1 = r5
            goto L5a
        L1f:
            defpackage.ore.k(r2)
            goto L5a
        L23:
            defpackage.ch3.d0(r14)
            goto L48
        L27:
            defpackage.ch3.d0(r14)
            r13.f = r4
            java.lang.Object r14 = r7.b
            xhh r14 = (defpackage.xhh) r14
            n0c r14 = (defpackage.n0c) r14
            xt4 r14 = r14.b()
            tl1 r6 = new tl1
            r10 = 0
            r11 = 6
            r6.<init>(r7, r8, r10, r11)
            java.lang.Object r14 = defpackage.yab.K0(r14, r6, r13)
            if (r14 != r3) goto L44
            goto L45
        L44:
            r14 = r5
        L45:
            if (r14 != r3) goto L48
            goto L59
        L48:
            java.lang.Object r14 = r7.h
            pzf r14 = (defpackage.pzf) r14
            pke r0 = new pke
            r0.<init>(r8)
            r13.f = r12
            java.lang.Object r13 = r14.emit(r0, r13)
            if (r13 != r3) goto L1d
        L59:
            r1 = r3
        L5a:
            return r1
        L5b:
            int r0 = r13.f
            if (r0 == 0) goto L69
            if (r0 != r4) goto L65
            defpackage.ch3.d0(r14)
            goto L84
        L65:
            defpackage.ore.k(r2)
            goto L85
        L69:
            defpackage.ch3.d0(r14)
            z18 r14 = r13.g
            java.lang.Object r14 = r14.d
            ny8 r14 = (defpackage.ny8) r14
            java.lang.Object r14 = r14.getValue()
            j93 r14 = (defpackage.j93) r14
            r13.f = r4
            long r0 = r13.h
            java.lang.Object r13 = r14.a(r0, r4, r13)
            if (r13 != r3) goto L84
            r1 = r3
            goto L85
        L84:
            r1 = r5
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oke.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
