package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h31 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h31(long j, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                h31 h31Var = new h31(this.h, lq4Var, 0);
                h31Var.g = obj;
                return h31Var;
            default:
                h31 h31Var2 = new h31(this.h, lq4Var, 1);
                h31Var2.g = obj;
                return h31Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        yx6 yx6Var = (yx6) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((h31) create(yx6Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x0081  */
    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0059 -> B:16:0x003c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0096 -> B:34:0x0077). Please report as a decompilation issue!!! */
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
            int r0 = r11.e
            long r1 = r11.h
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            hu4 r5 = defpackage.hu4.a
            r6 = 1
            r7 = 2
            sbi r8 = defpackage.sbi.a
            switch(r0) {
                case 0: goto L5f;
                default: goto L10;
            }
        L10:
            java.lang.Object r0 = r11.g
            yx6 r0 = (defpackage.yx6) r0
            int r9 = r11.f
            r10 = 3
            if (r9 == 0) goto L2c
            if (r9 == r6) goto L28
            if (r9 == r7) goto L24
            if (r9 != r10) goto L20
            goto L28
        L20:
            defpackage.ore.k(r4)
            goto L5e
        L24:
            defpackage.ch3.d0(r12)
            goto L51
        L28:
            defpackage.ch3.d0(r12)
            goto L3c
        L2c:
            defpackage.ch3.d0(r12)
            r11.g = r0
            r11.f = r6
            r3 = 0
            java.lang.Object r12 = defpackage.rx8.t(r3, r11)
            if (r12 != r5) goto L3c
            goto L5b
        L3c:
            vt4 r12 = r11.getContext()
            boolean r12 = defpackage.vd7.E(r12)
            if (r12 == 0) goto L5d
            r11.g = r0
            r11.f = r7
            java.lang.Object r12 = r0.emit(r8, r11)
            if (r12 != r5) goto L51
            goto L5b
        L51:
            r11.g = r0
            r11.f = r10
            java.lang.Object r12 = defpackage.rx8.t(r1, r11)
            if (r12 != r5) goto L3c
        L5b:
            r3 = r5
            goto L5e
        L5d:
            r3 = r8
        L5e:
            return r3
        L5f:
            java.lang.Object r0 = r11.g
            yx6 r0 = (defpackage.yx6) r0
            int r9 = r11.f
            if (r9 == 0) goto L74
            if (r9 == r6) goto L70
            if (r9 != r7) goto L6c
            goto L74
        L6c:
            defpackage.ore.k(r4)
            goto L9b
        L70:
            defpackage.ch3.d0(r12)
            goto L8c
        L74:
            defpackage.ch3.d0(r12)
        L77:
            vt4 r12 = r11.getContext()
            boolean r12 = defpackage.vd7.E(r12)
            if (r12 == 0) goto L9a
            r11.g = r0
            r11.f = r6
            java.lang.Object r12 = defpackage.rx8.u(r1, r11)
            if (r12 != r5) goto L8c
            goto L98
        L8c:
            r11.g = r0
            r11.f = r7
            l17 r12 = defpackage.l17.a
            java.lang.Object r12 = r0.emit(r12, r11)
            if (r12 != r5) goto L77
        L98:
            r3 = r5
            goto L9b
        L9a:
            r3 = r8
        L9b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h31.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
