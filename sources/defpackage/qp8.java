package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qp8 extends koe implements qf7 {
    public rhb c;
    public wp3 d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ up8 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp8(lq4 lq4Var, up8 up8Var) {
        super(2, lq4Var);
        this.g = up8Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        qp8 qp8Var = new qp8(lq4Var, this.g);
        qp8Var.f = obj;
        return qp8Var;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((qp8) create((thf) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005c -> B:25:0x006e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.e
            r1 = 2
            r2 = 1
            hu4 r3 = defpackage.hu4.a
            if (r0 == 0) goto L23
            if (r0 == r2) goto L1f
            if (r0 != r1) goto L18
            wp3 r0 = r5.d
            rhb r2 = r5.c
            java.lang.Object r4 = r5.f
            thf r4 = (defpackage.thf) r4
            defpackage.ch3.d0(r6)
            goto L6e
        L18:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r5)
            r5 = 0
            return r5
        L1f:
            defpackage.ch3.d0(r6)
            goto L73
        L23:
            defpackage.ch3.d0(r6)
            java.lang.Object r6 = r5.f
            thf r6 = (defpackage.thf) r6
            up8 r0 = r5.g
            java.lang.Object r0 = r0.J()
            boolean r4 = r0 instanceof defpackage.wp3
            if (r4 == 0) goto L3e
            wp3 r0 = (defpackage.wp3) r0
            up8 r0 = r0.h
            r5.e = r2
            r6.b(r0, r5)
            return r3
        L3e:
            boolean r2 = r0 instanceof defpackage.qc8
            if (r2 == 0) goto L73
            qc8 r0 = (defpackage.qc8) r0
            rhb r0 = r0.b()
            if (r0 == 0) goto L73
            java.lang.Object r2 = r0.i()
            ld9 r2 = (defpackage.ld9) r2
            r4 = r2
            r2 = r0
            r0 = r4
            r4 = r6
        L54:
            boolean r6 = defpackage.cqk.d(r0, r2)
            if (r6 != 0) goto L73
            boolean r6 = r0 instanceof defpackage.wp3
            if (r6 == 0) goto L6e
            wp3 r0 = (defpackage.wp3) r0
            up8 r6 = r0.h
            r5.f = r4
            r5.c = r2
            r5.d = r0
            r5.e = r1
            r4.b(r6, r5)
            return r3
        L6e:
            ld9 r0 = r0.j()
            goto L54
        L73:
            sbi r5 = defpackage.sbi.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qp8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
