package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mp1 extends mdh implements tf7 {
    public int e;
    public /* synthetic */ yx6 f;
    public /* synthetic */ Object[] g;
    public final /* synthetic */ gu4 h;
    public final /* synthetic */ List i;
    public final /* synthetic */ op1 j;
    public yx6 k;
    public vg4[] l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp1(lq4 lq4Var, gu4 gu4Var, List list, op1 op1Var) {
        super(3, lq4Var);
        this.h = gu4Var;
        this.i = list;
        this.j = op1Var;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        mp1 mp1Var = new mp1((lq4) obj3, this.h, this.i, this.j);
        mp1Var.f = (yx6) obj;
        mp1Var.g = (Object[]) obj2;
        return mp1Var.invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if (r6.t(r5, r7, r11) == r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if (r12.emit(r0, r11) == r4) goto L30;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.e
            r1 = 2
            r2 = 1
            r3 = 0
            hu4 r4 = defpackage.hu4.a
            if (r0 == 0) goto L20
            if (r0 == r2) goto L18
            if (r0 != r1) goto L12
            defpackage.ch3.d0(r12)
            goto L91
        L12:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r11)
            return r3
        L18:
            vg4[] r0 = r11.l
            yx6 r2 = r11.k
            defpackage.ch3.d0(r12)     // Catch: java.lang.Throwable -> L7f
            goto L7f
        L20:
            defpackage.ch3.d0(r12)
            yx6 r12 = r11.f
            java.lang.Object[] r0 = r11.g
            vg4[] r0 = (defpackage.vg4[]) r0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r0.length
            r7 = 0
            r8 = r7
        L31:
            if (r7 >= r6) goto L50
            r9 = r0[r7]
            int r10 = r8 + 1
            boolean r9 = defpackage.f55.q(r9)
            if (r9 == 0) goto L46
            java.util.List r9 = r11.i
            java.lang.Object r8 = r9.get(r8)
            java.lang.Long r8 = (java.lang.Long) r8
            goto L47
        L46:
            r8 = r3
        L47:
            if (r8 == 0) goto L4c
            r5.add(r8)
        L4c:
            int r7 = r7 + 1
            r8 = r10
            goto L31
        L50:
            m8b r5 = defpackage.rx8.j0(r5)
            boolean r6 = r5.j()
            if (r6 == 0) goto L80
            op1 r6 = r11.j     // Catch: java.lang.Throwable -> L7e
            ny8 r6 = r6.k     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L7e
            a0b r6 = (defpackage.a0b) r6     // Catch: java.lang.Throwable -> L7e
            ghb r7 = defpackage.ew5.b     // Catch: java.lang.Throwable -> L7e
            lw5 r7 = defpackage.lw5.SECONDS     // Catch: java.lang.Throwable -> L7e
            r8 = 5
            long r7 = defpackage.qe7.O(r8, r7)     // Catch: java.lang.Throwable -> L7e
            r11.f = r3     // Catch: java.lang.Throwable -> L7e
            r11.g = r3     // Catch: java.lang.Throwable -> L7e
            r11.k = r12     // Catch: java.lang.Throwable -> L7e
            r11.l = r0     // Catch: java.lang.Throwable -> L7e
            r11.e = r2     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r2 = r6.t(r5, r7, r11)     // Catch: java.lang.Throwable -> L7e
            if (r2 != r4) goto L7e
            goto L90
        L7e:
            r2 = r12
        L7f:
            r12 = r2
        L80:
            r11.f = r3
            r11.g = r3
            r11.k = r3
            r11.l = r3
            r11.e = r1
            java.lang.Object r11 = r12.emit(r0, r11)
            if (r11 != r4) goto L91
        L90:
            return r4
        L91:
            sbi r11 = defpackage.sbi.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mp1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
