package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ia6 extends koe implements qf7 {
    public ja6 c;
    public long[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public long i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ja6 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia6(ja6 ja6Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.l = ja6Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        ia6 ia6Var = new ia6(this.l, lq4Var);
        ia6Var.k = obj;
        return ia6Var;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((ia6) create((thf) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0099  */
    /* JADX WARN: Code duplicated, block: B:23:0x009f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004b -> B:22:0x009d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004d -> B:14:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0068 -> B:19:0x0094). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.j
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2a
            if (r1 != r4) goto L23
            int r1 = r0.h
            int r5 = r0.g
            long r6 = r0.i
            int r8 = r0.f
            int r9 = r0.e
            long[] r10 = r0.d
            ja6 r11 = r0.c
            java.lang.Object r12 = r0.k
            thf r12 = (defpackage.thf) r12
            defpackage.ch3.d0(r20)
            goto L94
        L23:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r0)
            r0 = 0
            return r0
        L2a:
            defpackage.ch3.d0(r20)
            java.lang.Object r1 = r0.k
            thf r1 = (defpackage.thf) r1
            ja6 r5 = r0.l
            b9b r6 = r5.a
            long[] r6 = r6.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La2
            r8 = r2
        L3d:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L9d
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = r11
            r11 = r5
            r5 = r12
            r12 = r1
            r1 = r2
            r17 = r9
            r10 = r6
            r9 = r7
            r6 = r17
        L5f:
            if (r1 >= r5) goto L97
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r6
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L94
            int r2 = r8 << 3
            int r2 = r2 + r1
            am9 r3 = new am9
            b9b r13 = r11.a
            java.lang.Object[] r14 = r13.b
            r14 = r14[r2]
            java.lang.Object[] r13 = r13.c
            r2 = r13[r2]
            r3.<init>(r14, r2)
            r0.k = r12
            r0.c = r11
            r0.d = r10
            r0.e = r9
            r0.f = r8
            r0.i = r6
            r0.g = r5
            r0.h = r1
            r0.j = r4
            r12.b(r3, r0)
            hu4 r0 = defpackage.hu4.a
            return r0
        L94:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L5f
        L97:
            if (r5 != r3) goto La2
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r12
        L9d:
            if (r8 == r7) goto La2
            int r8 = r8 + 1
            goto L3d
        La2:
            sbi r0 = defpackage.sbi.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ia6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
