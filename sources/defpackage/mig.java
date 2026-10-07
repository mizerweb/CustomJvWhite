package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mig extends mdh implements tf7 {
    public int e;
    public /* synthetic */ yx6 f;
    public /* synthetic */ int g;
    public final /* synthetic */ nig h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mig(nig nigVar, lq4 lq4Var) {
        super(3, lq4Var);
        this.h = nigVar;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        mig migVar = new mig(this.h, (lq4) obj3);
        migVar.f = (yx6) obj;
        migVar.g = iIntValue;
        return migVar.invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0069 A[PHI: r2
  0x0069: PHI (r2v3 yx6) = (r2v2 yx6), (r2v7 yx6) binds: [B:27:0x0066, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (r2.emit(defpackage.h0g.a, r12) == r11) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        if (r2.emit(defpackage.h0g.c, r12) == r11) goto L36;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            nig r0 = r12.h
            long r0 = r0.a
            int r2 = r12.e
            r3 = 0
            r4 = 0
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            hu4 r11 = defpackage.hu4.a
            if (r2 == 0) goto L39
            if (r2 == r10) goto L35
            if (r2 == r9) goto L2f
            if (r2 == r8) goto L29
            if (r2 == r7) goto L23
            if (r2 != r6) goto L1d
            goto L35
        L1d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r12)
            return r3
        L23:
            yx6 r0 = r12.f
            defpackage.ch3.d0(r13)
            goto L75
        L29:
            yx6 r2 = r12.f
            defpackage.ch3.d0(r13)
            goto L69
        L2f:
            yx6 r2 = r12.f
            defpackage.ch3.d0(r13)
            goto L58
        L35:
            defpackage.ch3.d0(r13)
            goto L83
        L39:
            defpackage.ch3.d0(r13)
            yx6 r2 = r12.f
            int r13 = r12.g
            if (r13 <= 0) goto L4d
            r12.e = r10
            h0g r13 = defpackage.h0g.a
            java.lang.Object r12 = r2.emit(r13, r12)
            if (r12 != r11) goto L83
            goto L82
        L4d:
            r12.f = r2
            r12.e = r9
            java.lang.Object r13 = defpackage.rx8.t(r4, r12)
            if (r13 != r11) goto L58
            goto L82
        L58:
            int r13 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r13 <= 0) goto L76
            r12.f = r2
            r12.e = r8
            h0g r13 = defpackage.h0g.b
            java.lang.Object r13 = r2.emit(r13, r12)
            if (r13 != r11) goto L69
            goto L82
        L69:
            r12.f = r2
            r12.e = r7
            java.lang.Object r13 = defpackage.rx8.t(r0, r12)
            if (r13 != r11) goto L74
            goto L82
        L74:
            r0 = r2
        L75:
            r2 = r0
        L76:
            r12.f = r3
            r12.e = r6
            h0g r13 = defpackage.h0g.c
            java.lang.Object r12 = r2.emit(r13, r12)
            if (r12 != r11) goto L83
        L82:
            return r11
        L83:
            sbi r12 = defpackage.sbi.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mig.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
