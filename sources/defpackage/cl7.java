package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cl7 extends mdh implements qf7 {
    public int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ i64 g;
    public final /* synthetic */ xf5 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ fl7 j;
    public final /* synthetic */ g4b k;
    public final /* synthetic */ q87 l;
    public fda m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl7(Object obj, lq4 lq4Var, i64 i64Var, xf5 xf5Var, boolean z, fl7 fl7Var, g4b g4bVar, q87 q87Var) {
        super(2, lq4Var);
        this.f = obj;
        this.g = i64Var;
        this.h = xf5Var;
        this.i = z;
        this.j = fl7Var;
        this.k = g4bVar;
        this.l = q87Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new cl7(this.f, lq4Var, this.g, this.h, this.i, this.j, this.k, this.l);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((cl7) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (r12.o == 2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        if (r12 == r8) goto L25;
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
            r1 = 0
            g4b r2 = r11.k
            q87 r3 = r11.l
            xf5 r4 = r11.h
            r5 = 1
            r6 = 2
            r7 = 0
            hu4 r8 = defpackage.hu4.a
            if (r0 == 0) goto L26
            if (r0 == r5) goto L1e
            if (r0 != r6) goto L18
            defpackage.ch3.d0(r12)
            goto L76
        L18:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r11)
            return r7
        L1e:
            int r0 = r11.n
            fda r5 = r11.m
            defpackage.ch3.d0(r12)
            goto L4b
        L26:
            defpackage.ch3.d0(r12)
            java.lang.Object r12 = r11.f
            fda r12 = (defpackage.fda) r12
            sfa r0 = r12.a
            long r9 = r0.h
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r9)
            i64 r9 = r11.g
            r9.Q(r0)
            r11.m = r12
            r11.n = r1
            r11.e = r5
            java.lang.Object r0 = r4.z0(r11)
            if (r0 != r8) goto L48
            goto L75
        L48:
            r5 = r12
            r12 = r0
            r0 = r1
        L4b:
            rt2 r12 = (defpackage.rt2) r12
            boolean r12 = r12.y0()
            boolean r9 = r11.i
            if (r9 != 0) goto L91
            if (r12 == 0) goto L67
            vg4 r12 = r5.b
            boolean r12 = r12.f
            if (r12 == 0) goto L67
            sfa r12 = r5.a
            sfa r9 = r12.q
            if (r9 == 0) goto L91
            int r12 = r12.o
            if (r12 != r6) goto L91
        L67:
            r11.m = r7
            r11.n = r0
            r11.e = r6
            fl7 r12 = r11.j
            java.lang.Object r12 = defpackage.fl7.a(r12, r4, r5, r11)
            if (r12 != r8) goto L76
        L75:
            return r8
        L76:
            eia r12 = (defpackage.eia) r12
            mlf r4 = new mlf
            r66 r9 = defpackage.r66.a
            r5 = 0
            r7 = 0
            r8 = 0
            r4.<init>(r5, r7, r8, r9)
            ng5 r11 = r3.f
            r4.f = r11
            r4.b = r12
            r4.g = r2
            slf r11 = new slf
            r11.<init>(r4)
            return r11
        L91:
            sfa r11 = r5.a
            yjf r12 = new yjf
            r12.<init>(r11, r1)
            r12.g = r2
            ng5 r11 = r3.f
            r12.f = r11
            zjf r11 = new zjf
            r11.<init>(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cl7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
