package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ve8 extends mdh implements qf7 {
    public int e;
    public final /* synthetic */ ye8 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ gjg h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve8(ye8 ye8Var, long j, gjg gjgVar, boolean z, boolean z2, String str, lq4 lq4Var) {
        super(2, lq4Var);
        this.f = ye8Var;
        this.g = j;
        this.h = gjgVar;
        this.i = z;
        this.j = z2;
        this.k = str;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new ve8(this.f, this.g, this.h, this.i, this.j, this.k, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((ve8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (r0.collect(r8, r7) == r4) goto L15;
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
            ye8 r1 = r7.f
            r2 = 2
            r3 = 1
            hu4 r4 = defpackage.hu4.a
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L19
            if (r0 != r2) goto L12
            defpackage.ch3.d0(r8)
            goto L55
        L12:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r7)
            r7 = 0
            return r7
        L19:
            defpackage.ch3.d0(r8)
            goto L31
        L1d:
            defpackage.ch3.d0(r8)
            xm r8 = r1.c
            long r5 = r7.g
            m8b r0 = defpackage.ui9.a(r5)
            r7.e = r3
            java.lang.Object r8 = r8.e(r0, r7)
            if (r8 != r4) goto L31
            goto L54
        L31:
            jz r8 = new jz
            r0 = 13
            gjg r3 = r7.h
            r8.<init>(r3, r0)
            jz r0 = new jz
            r3 = 11
            r0.<init>(r8, r3)
            ue8 r8 = new ue8
            boolean r3 = r7.j
            java.lang.String r5 = r7.k
            boolean r6 = r7.i
            r8.<init>(r1, r6, r3, r5)
            r7.e = r2
            java.lang.Object r7 = r0.collect(r8, r7)
            if (r7 != r4) goto L55
        L54:
            return r4
        L55:
            sbi r7 = defpackage.sbi.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
