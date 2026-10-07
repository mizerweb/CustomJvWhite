package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ptf implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ptf(nki nkiVar) {
        this.a = 28;
        jji jjiVar = jji.UNKNOWN;
        this.b = nkiVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0275  */
    /* JADX WARN: Code duplicated, block: B:95:0x0262  */
    /* JADX WARN: Code duplicated, block: B:98:0x026f  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v9 fi4, still in use, count: 2, list:
          (r6v9 fi4) from 0x025a: IGET (r6v9 fi4) A[WRAPPED] fi4.c ei4
          (r6v9 fi4) from 0x0260: PHI (r6 I:??) = (r6v6 fi4), (r6v9 fi4) binds: [B:93:0x025f, B:320:0x0260] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // defpackage.cf7
    public final java.lang.Object invoke(java.lang.Object r41) {
        /*
            Method dump skipped, instruction units count: 2086
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ptf.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ ptf(xkh xkhVar, ctc ctcVar) {
        this.a = 17;
        this.b = ctcVar;
    }

    public /* synthetic */ ptf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
