package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class etd extends mdh implements qf7 {
    public Object e;
    public long f;
    public int g;
    public int h;
    public int i;
    public final /* synthetic */ jtd j;
    public final /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etd(jtd jtdVar, long j, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = jtdVar;
        this.k = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new etd(this.j, this.k, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((etd) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (r13.a(r9, r12) == r8) goto L32;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.i
            jtd r1 = r12.j
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            sbi r6 = defpackage.sbi.a
            r7 = 0
            hu4 r8 = defpackage.hu4.a
            if (r0 == 0) goto L38
            if (r0 == r4) goto L2a
            if (r0 == r3) goto L20
            if (r0 != r2) goto L1a
            defpackage.ch3.d0(r13)
            goto L92
        L1a:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r12)
            return r7
        L20:
            java.lang.Object r0 = r12.e
            lq4 r0 = (defpackage.lq4) r0
            defpackage.ch3.d0(r13)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L93
            goto L72
        L28:
            r13 = move-exception
            goto L74
        L2a:
            int r0 = r12.h
            int r4 = r12.g
            long r9 = r12.f
            java.lang.Object r11 = r12.e
            jtd r11 = (defpackage.jtd) r11
            defpackage.ch3.d0(r13)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L93
            goto L57
        L38:
            defpackage.ch3.d0(r13)
            long r9 = r12.k
            mjg r13 = r1.n     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L93
            ma3 r0 = defpackage.ma3.a     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L93
            r12.e = r1     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L93
            r12.f = r9     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L93
            r12.g = r5     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L93
            r12.h = r5     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L93
            r12.i = r4     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L93
            r13.getClass()     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L93
            r13.j(r7, r0)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L93
            if (r6 != r8) goto L54
            goto L91
        L54:
            r11 = r1
            r0 = r5
            r4 = r0
        L57:
            ny8 r13 = r11.d     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L93
            java.lang.Object r13 = r13.getValue()     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L93
            yy2 r13 = (defpackage.yy2) r13     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L93
            m8b r9 = defpackage.ui9.a(r9)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L93
            r12.e = r7     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L93
            r12.g = r4     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L93
            r12.h = r0     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L93
            r12.i = r3     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L93
            java.lang.Object r13 = r13.a(r9, r12)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L93
            if (r13 != r8) goto L72
            goto L91
        L72:
            r0 = r6
            goto L79
        L74:
            poe r0 = new poe
            r0.<init>(r13)
        L79:
            java.lang.Throwable r13 = defpackage.roe.a(r0)
            if (r13 == 0) goto L92
            mjg r13 = r1.n
            r12.e = r0
            r12.g = r5
            r12.i = r2
            r13.getClass()
            na3 r12 = defpackage.na3.a
            r13.j(r7, r12)
            if (r6 != r8) goto L92
        L91:
            return r8
        L92:
            return r6
        L93:
            r12 = move-exception
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.etd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
