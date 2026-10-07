package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ad3 extends mdh implements qf7 {
    public int e;
    public final /* synthetic */ rt2 f;
    public final /* synthetic */ xd3 g;
    public final /* synthetic */ Long h;
    public final /* synthetic */ CharSequence i;
    public final /* synthetic */ List j;
    public final /* synthetic */ boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad3(rt2 rt2Var, xd3 xd3Var, Long l, CharSequence charSequence, List list, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.f = rt2Var;
        this.g = xd3Var;
        this.h = l;
        this.i = charSequence;
        this.j = list;
        this.k = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new ad3(this.f, this.g, this.h, this.i, this.j, this.k, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((ad3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r6.a(r7, r8, r14.i, r14) == r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r5.a(r6, r8, r14.i, r14.j, r14.k, r14) == r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        return r4;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.e
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L16
            if (r0 == r2) goto L12
            if (r0 != r1) goto Lb
            goto L12
        Lb:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r14)
            r14 = 0
            return r14
        L12:
            defpackage.ch3.d0(r15)
            goto L54
        L16:
            defpackage.ch3.d0(r15)
            rt2 r15 = r14.f
            boolean r0 = r15 instanceof defpackage.s04
            java.lang.Long r3 = r14.h
            hu4 r4 = defpackage.hu4.a
            xd3 r5 = r14.g
            if (r0 == 0) goto L3b
            oz5 r6 = r5.i
            s04 r15 = (defpackage.s04) r15
            q24 r7 = r15.r
            long r8 = r3.longValue()
            r14.e = r2
            java.lang.CharSequence r10 = r14.i
            r11 = r14
            java.lang.Object r14 = r6.a(r7, r8, r10, r11)
            if (r14 != r4) goto L54
            goto L53
        L3b:
            r11 = r14
            wz5 r5 = r5.h
            long r6 = r3.longValue()
            long r8 = r15.a
            r11.e = r1
            java.lang.CharSequence r10 = r11.i
            r13 = r11
            java.util.List r11 = r13.j
            boolean r12 = r13.k
            java.lang.Object r14 = r5.a(r6, r8, r10, r11, r12, r13)
            if (r14 != r4) goto L54
        L53:
            return r4
        L54:
            sbi r14 = defpackage.sbi.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ad3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
