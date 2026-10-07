package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class moi extends mdh implements vf7 {
    public int e;
    public int f;
    public int g;
    public /* synthetic */ Throwable h;
    public /* synthetic */ long i;
    public final /* synthetic */ gpi j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public moi(gpi gpiVar, lq4 lq4Var) {
        super(4, lq4Var);
        this.j = gpiVar;
    }

    @Override // defpackage.vf7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        moi moiVar = new moi(this.j, (lq4) obj4);
        moiVar.h = (Throwable) obj2;
        moiVar.i = jLongValue;
        return moiVar.invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
    
        if (defpackage.rx8.u(r7, r13) == r3) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Throwable r0 = r13.h
            long r1 = r13.i
            hu4 r3 = defpackage.hu4.a
            int r4 = r13.g
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L25
            if (r4 == r7) goto L1c
            if (r4 != r6) goto L16
            defpackage.ch3.d0(r14)
            goto Lb9
        L16:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r13)
            return r5
        L1c:
            int r0 = r13.f
            int r4 = r13.e
            defpackage.ch3.d0(r14)
            goto L99
        L25:
            defpackage.ch3.d0(r14)
            boolean r4 = r0 instanceof java.util.concurrent.CancellationException
            if (r4 != 0) goto L38
            boolean r14 = ru.ok.tamtam.errors.TamErrorException.a(r0)
            if (r14 != 0) goto L36
            boolean r14 = r0 instanceof ru.ok.tamtam.api.MaxRetryCountExceededException
            if (r14 == 0) goto L38
        L36:
            r14 = r7
            goto L39
        L38:
            r14 = 0
        L39:
            if (r4 != 0) goto L48
            if (r14 != 0) goto L48
            gpi r8 = r13.j
            t3h r9 = r8.l
            azg r8 = r8.c
            m3h r10 = defpackage.m3h.STORIES_LOAD_ERROR
            r9.A(r8, r10, r0)
        L48:
            if (r14 != 0) goto L4d
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            return r13
        L4d:
            gpi r8 = r13.j
            java.lang.String r8 = r8.p
            a4c r9 = defpackage.gm0.f
            if (r9 != 0) goto L56
            goto L77
        L56:
            je9 r10 = defpackage.je9.f
            boolean r11 = r9.b(r10)
            if (r11 == 0) goto L77
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "collectStoriesContent: retry #"
            r11.<init>(r12)
            r11.append(r1)
            java.lang.String r12 = ", cause="
            r11.append(r12)
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            r9.c(r10, r8, r0, r5)
        L77:
            gpi r0 = r13.j
            ny8 r0 = r0.w
            java.lang.Object r0 = r0.getValue()
            onf r0 = (defpackage.onf) r0
            rnf r0 = (defpackage.rnf) r0
            r8e r0 = r0.s
            loi r8 = defpackage.loi.h
            r13.h = r5
            r13.i = r1
            r13.e = r4
            r13.f = r14
            r13.g = r7
            java.lang.Object r0 = defpackage.e9i.O(r0, r8, r13)
            if (r0 != r3) goto L98
            goto Lb8
        L98:
            r0 = r14
        L99:
            int r7 = (int) r1
            px8 r14 = defpackage.gpi.B1
            r14.getClass()
            long r9 = defpackage.gpi.D1
            r11 = 0
            r8 = 4
            long r7 = defpackage.sn0.b(r7, r8, r9, r11)
            r13.h = r5
            r13.i = r1
            r13.e = r4
            r13.f = r0
            r13.g = r6
            java.lang.Object r13 = defpackage.rx8.u(r7, r13)
            if (r13 != r3) goto Lb9
        Lb8:
            return r3
        Lb9:
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.moi.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
