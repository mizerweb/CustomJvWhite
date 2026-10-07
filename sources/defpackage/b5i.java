package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b5i extends mdh implements qf7 {
    public orb[] e;
    public nub f;
    public pzh g;
    public int h;
    public int i;
    public int j;
    public int k;
    public final /* synthetic */ orb[] l;
    public final /* synthetic */ nub m;
    public final /* synthetic */ pzh n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5i(orb[] orbVarArr, nub nubVar, pzh pzhVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.l = orbVarArr;
        this.m = nubVar;
        this.n = pzhVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new b5i(this.l, this.m, this.n, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((b5i) create((nzh) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0072 -> B:27:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.k
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L21
            if (r0 == r3) goto Lb
            if (r0 != r2) goto L1b
        Lb:
            int r0 = r11.j
            int r4 = r11.i
            int r5 = r11.h
            pzh r6 = r11.g
            nub r7 = r11.f
            orb[] r8 = r11.e
            defpackage.ch3.d0(r12)
            goto L57
        L1b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r11)
            return r1
        L21:
            defpackage.ch3.d0(r12)
            orb[] r12 = r11.l
            int r0 = r12.length
            r4 = 0
            nub r5 = r11.m
            pzh r6 = r11.n
            r8 = r12
            r12 = r4
            r7 = r5
        L2f:
            if (r4 >= r0) goto L75
            r5 = r8[r4]
            int r9 = r12 + 1
            int r5 = r5.ordinal()
            if (r5 == 0) goto L72
            hu4 r10 = defpackage.hu4.a
            if (r5 == r3) goto L5d
            if (r5 != r2) goto L59
            r11.e = r8
            r11.f = r7
            r11.g = r6
            r11.h = r9
            r11.i = r4
            r11.j = r0
            r11.k = r2
            java.lang.Object r12 = defpackage.nub.d(r7, r6, r12, r11)
            if (r12 != r10) goto L56
            goto L71
        L56:
            r5 = r9
        L57:
            r12 = r5
            goto L73
        L59:
            defpackage.ore.o()
            return r1
        L5d:
            r11.e = r8
            r11.f = r7
            r11.g = r6
            r11.h = r9
            r11.i = r4
            r11.j = r0
            r11.k = r3
            java.lang.Object r12 = defpackage.nub.c(r7, r6, r12, r11)
            if (r12 != r10) goto L56
        L71:
            return r10
        L72:
            r12 = r9
        L73:
            int r4 = r4 + r3
            goto L2f
        L75:
            sbi r11 = defpackage.sbi.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b5i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
