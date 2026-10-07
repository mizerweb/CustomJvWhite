package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nv7 {
    public final ny8 a;
    public final ny8 b;

    public nv7(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var2;
        this.b = ny8Var;
    }

    public final Object a(long j, boolean z, nq4 nq4Var) {
        Object objB = ((no4) this.b.getValue()).b(j, new fo4(z, 1), nq4Var);
        return objB == hu4.a ? objB : sbi.a;
    }

    public final boolean b(long j) {
        ix2 ix2Var;
        vg4 vg4Var = (vg4) ((no4) this.b.getValue()).j(j).a.getValue();
        return (vg4Var == null || (ix2Var = vg4Var.a.b.z) == null || (ix2Var.b & 1024) == 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        if (a(r14, !r2, r5) == r6) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(long r21, boolean r23, defpackage.nq4 r24) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            r0 = r23
            r4 = r24
            boolean r5 = r4 instanceof defpackage.mv7
            if (r5 == 0) goto L1b
            r5 = r4
            mv7 r5 = (defpackage.mv7) r5
            int r6 = r5.h
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L1b
            int r6 = r6 - r7
            r5.h = r6
            goto L20
        L1b:
            mv7 r5 = new mv7
            r5.<init>(r1, r4)
        L20:
            java.lang.Object r4 = r5.f
            hu4 r6 = defpackage.hu4.a
            int r7 = r5.h
            r8 = 0
            r9 = 2
            r10 = 1
            if (r7 == 0) goto L44
            if (r7 == r10) goto L3a
            if (r7 != r9) goto L34
            defpackage.ch3.d0(r4)
            goto Lbb
        L34:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r0)
            return r8
        L3a:
            boolean r0 = r5.e
            long r2 = r5.d
            defpackage.ch3.d0(r4)
        L41:
            r14 = r2
            r2 = r0
            goto L54
        L44:
            defpackage.ch3.d0(r4)
            r5.d = r2
            r5.e = r0
            r5.h = r10
            java.lang.Object r4 = r1.a(r2, r0, r5)
            if (r4 != r6) goto L41
            goto Lba
        L54:
            ny8 r0 = r1.a     // Catch: java.lang.Throwable -> L80 java.util.concurrent.CancellationException -> L82
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L80 java.util.concurrent.CancellationException -> L82
            pvb r0 = (defpackage.pvb) r0     // Catch: java.lang.Throwable -> L80 java.util.concurrent.CancellationException -> L82
            pm4 r10 = new pm4     // Catch: java.lang.Throwable -> L80 java.util.concurrent.CancellationException -> L82
            zed r3 = r0.u()     // Catch: java.lang.Throwable -> L80 java.util.concurrent.CancellationException -> L82
            xb9 r3 = r3.a     // Catch: java.lang.Throwable -> L80 java.util.concurrent.CancellationException -> L82
            long r12 = r3.g()     // Catch: java.lang.Throwable -> L80 java.util.concurrent.CancellationException -> L82
            if (r2 == 0) goto L6d
            r3 = 6
        L6b:
            r11 = r3
            goto L6f
        L6d:
            r3 = 7
            goto L6b
        L6f:
            r18 = 0
            r19 = 0
            r16 = 0
            r17 = 0
            r10.<init>(r11, r12, r14, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L80 java.util.concurrent.CancellationException -> L82
            defpackage.pvb.t(r0, r10)     // Catch: java.lang.Throwable -> L80 java.util.concurrent.CancellationException -> L82
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L80 java.util.concurrent.CancellationException -> L82
            return r0
        L80:
            r0 = move-exception
            goto L84
        L82:
            r0 = move-exception
            goto Lbe
        L84:
            java.lang.Class<nv7> r3 = defpackage.nv7.class
            java.lang.String r3 = r3.getName()
            a4c r4 = defpackage.gm0.f
            if (r4 != 0) goto L8f
            goto Lac
        L8f:
            je9 r7 = defpackage.je9.f
            boolean r10 = r4.b(r7)
            if (r10 == 0) goto Lac
            java.lang.String r0 = r0.getMessage()
            java.lang.String r10 = "contactUpdateStories(#"
            java.lang.String r11 = ", hidden="
            java.lang.StringBuilder r10 = defpackage.qt4.u(r14, r10, r11, r2)
            java.lang.String r11 = ") failed, revert local flag: "
            java.lang.String r0 = defpackage.zo5.w(r10, r11, r0)
            r4.c(r7, r3, r0, r8)
        Lac:
            r0 = r2 ^ 1
            r5.d = r14
            r5.e = r2
            r5.h = r9
            java.lang.Object r0 = r1.a(r14, r0, r5)
            if (r0 != r6) goto Lbb
        Lba:
            return r6
        Lbb:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        Lbe:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv7.c(long, boolean, nq4):java.lang.Object");
    }
}
