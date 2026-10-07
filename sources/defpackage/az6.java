package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class az6 extends mdh implements tf7 {
    public long e;
    public int f;
    public /* synthetic */ Object g;
    public /* synthetic */ Object h;
    public final /* synthetic */ long i;
    public final /* synthetic */ xx6 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az6(long j, lq4 lq4Var, xx6 xx6Var) {
        super(3, lq4Var);
        this.i = j;
        this.j = xx6Var;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        az6 az6Var = new az6(this.i, (lq4) obj3, this.j);
        az6Var.g = (gu4) obj;
        az6Var.h = (yx6) obj2;
        return az6Var.invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0091  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0086 -> B:20:0x0089). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.f
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L1e
            if (r0 != r2) goto L18
            long r4 = r14.e
            java.lang.Object r0 = r14.h
            hr2 r0 = (defpackage.hr2) r0
            java.lang.Object r6 = r14.g
            yx6 r6 = (defpackage.yx6) r6
            defpackage.ch3.d0(r15)
            goto L89
        L18:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r14)
            return r3
        L1e:
            defpackage.ch3.d0(r15)
            java.lang.Object r15 = r14.g
            gu4 r15 = (defpackage.gu4) r15
            java.lang.Object r0 = r14.h
            yx6 r0 = (defpackage.yx6) r0
            r4 = 0
            long r6 = r14.i
            int r4 = defpackage.ew5.d(r6, r4)
            if (r4 <= 0) goto L94
            xx6 r4 = r14.j
            r5 = 2
            xx6 r13 = defpackage.e9i.m(r4, r1, r5)
            boolean r4 = r13 instanceof defpackage.mr2
            if (r4 == 0) goto L42
            r4 = r13
            mr2 r4 = (defpackage.mr2) r4
            goto L43
        L42:
            r4 = r3
        L43:
            if (r4 != 0) goto L50
            rr2 r8 = new rr2
            r11 = 14
            r10 = 0
            r9 = 0
            r12 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r4 = r8
        L50:
            hr2 r15 = r4.j(r15)
            r4 = r6
            r6 = r0
            r0 = r15
        L57:
            sdf r15 = new sdf
            vt4 r7 = r14.getContext()
            r15.<init>(r7)
            gvb r7 = r0.f()
            yy6 r8 = new yy6
            r8.<init>(r6, r3, r1)
            r15.i(r7, r8)
            zy6 r7 = new zy6
            r7.<init>(r4, r3)
            long r8 = defpackage.rx8.e0(r4)
            defpackage.vd7.H(r15, r8, r7)
            r14.g = r6
            r14.h = r0
            r14.e = r4
            r14.f = r2
            java.lang.Object r15 = r15.e(r14)
            hu4 r7 = defpackage.hu4.a
            if (r15 != r7) goto L89
            return r7
        L89:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 != 0) goto L57
            sbi r14 = defpackage.sbi.a
            return r14
        L94:
            kotlinx.coroutines.TimeoutCancellationException r14 = new kotlinx.coroutines.TimeoutCancellationException
            java.lang.String r15 = "Timed out immediately"
            r14.<init>(r15, r3)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.az6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
