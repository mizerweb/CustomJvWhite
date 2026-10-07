package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wfk extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ efk g;
    public final /* synthetic */ fjh h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wfk(efk efkVar, fjh fjhVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = efkVar;
        this.h = fjhVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        fjh fjhVar = this.h;
        efk efkVar = this.g;
        switch (i) {
            case 0:
                return new wfk(efkVar, fjhVar, lq4Var, 0);
            default:
                return new wfk(efkVar, fjhVar, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        fjh fjhVar = this.h;
        efk efkVar = this.g;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                return new wfk(efkVar, fjhVar, lq4Var, 0).invokeSuspend(sbiVar);
            default:
                return new wfk(efkVar, fjhVar, lq4Var, 1).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r7 == r4) goto L25;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.e
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r2 = 1
            r3 = 0
            switch(r0) {
                case 0: goto L67;
                default: goto L9;
            }
        L9:
            sbi r0 = defpackage.sbi.a
            hu4 r4 = defpackage.hu4.a
            int r5 = r7.f
            r6 = 2
            if (r5 == 0) goto L23
            if (r5 == r2) goto L1f
            if (r5 != r6) goto L1b
            defpackage.ch3.d0(r8)
        L19:
            r3 = r0
            goto L66
        L1b:
            defpackage.ore.k(r1)
            goto L66
        L1f:
            defpackage.ch3.d0(r8)
            goto L39
        L23:
            defpackage.ch3.d0(r8)
            efk r8 = r7.g
            ifh r8 = r8.m
            java.lang.Object r8 = r8.getValue()
            y3k r8 = (defpackage.y3k) r8
            r7.f = r2
            java.lang.Object r8 = r8.a(r7)
            if (r8 != r4) goto L39
            goto L5f
        L39:
            java.lang.String r8 = (java.lang.String) r8
            boolean r1 = defpackage.r5h.X0(r8)
            fjh r2 = r7.h
            if (r1 != 0) goto L47
            r2.b(r8)
            goto L19
        L47:
            r7.f = r6
            efk r8 = defpackage.efk.s
            if (r8 == 0) goto L61
            ifh r8 = r8.m
            java.lang.Object r8 = r8.getValue()
            y3k r8 = (defpackage.y3k) r8
            java.lang.Object r7 = r8.g(r2, r7)
            if (r7 != r4) goto L5c
            goto L5d
        L5c:
            r7 = r0
        L5d:
            if (r7 != r4) goto L19
        L5f:
            r3 = r4
            goto L66
        L61:
            java.lang.String r7 = "Client SDK is not initialized, did you call init method in your Application class?"
            defpackage.ore.k(r7)
        L66:
            return r3
        L67:
            hu4 r0 = defpackage.hu4.a
            int r4 = r7.f
            if (r4 == 0) goto L77
            if (r4 != r2) goto L73
            defpackage.ch3.d0(r8)
            goto L90
        L73:
            defpackage.ore.k(r1)
            goto L92
        L77:
            defpackage.ch3.d0(r8)
            efk r8 = r7.g
            ifh r8 = r8.m
            java.lang.Object r8 = r8.getValue()
            y3k r8 = (defpackage.y3k) r8
            fjh r1 = r7.h
            r7.f = r2
            java.lang.Object r7 = r8.b(r1, r7)
            if (r7 != r0) goto L90
            r3 = r0
            goto L92
        L90:
            sbi r3 = defpackage.sbi.a
        L92:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wfk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
