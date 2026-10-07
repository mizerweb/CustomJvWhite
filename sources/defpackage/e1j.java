package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e1j extends mdh implements qf7 {
    public int e;
    public final /* synthetic */ g1j f;
    public final /* synthetic */ float g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1j(g1j g1jVar, float f, lq4 lq4Var) {
        super(2, lq4Var);
        this.f = g1jVar;
        this.g = f;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new e1j(this.f, this.g, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((e1j) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r9 == r5) goto L15;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            int r0 = r8.e
            r1 = 0
            r2 = 2
            r3 = 1
            g1j r4 = r8.f
            hu4 r5 = defpackage.hu4.a
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L19
            if (r0 != r2) goto L13
            defpackage.ch3.d0(r9)
            goto L4d
        L13:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r8)
            return r1
        L19:
            defpackage.ch3.d0(r9)
            goto L2f
        L1d:
            defpackage.ch3.d0(r9)
            zv8[] r9 = defpackage.g1j.P
            xzi r9 = r4.w()
            r8.e = r3
            java.lang.Object r9 = r9.d(r8)
            if (r9 != r5) goto L2f
            goto L4c
        L2f:
            java.lang.Number r9 = (java.lang.Number) r9
            long r6 = r9.longValue()
            float r9 = (float) r6
            float r0 = r8.g
            float r9 = r9 * r0
            double r6 = (double) r9
            long r6 = defpackage.gm0.L(r6)
            zv8[] r9 = defpackage.g1j.P
            xzi r9 = r4.w()
            r8.e = r2
            java.lang.Object r9 = r9.c(r6, r8)
            if (r9 != r5) goto L4d
        L4c:
            return r5
        L4d:
            byte[] r9 = (byte[]) r9
            if (r9 == 0) goto L7f
            ny8 r8 = r4.l
            java.lang.Object r8 = r8.getValue()
            vyi r8 = (defpackage.vyi) r8
            int r0 = defpackage.g1j.Q
            android.graphics.Bitmap r8 = r8.a(r0, r9)
            if (r8 == 0) goto L7f
            android.net.Uri r8 = defpackage.g1j.n(r4, r8)
            java.lang.String r8 = r8.toString()
            if (r8 == 0) goto L7f
            mjg r9 = r4.s
        L6d:
            java.lang.Object r0 = r9.getValue()
            r2 = r0
            w0j r2 = (defpackage.w0j) r2
            r3 = 5
            w0j r2 = defpackage.w0j.a(r2, r1, r8, r1, r3)
            boolean r0 = r9.h(r0, r2)
            if (r0 == 0) goto L6d
        L7f:
            sbi r8 = defpackage.sbi.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e1j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
