package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nv4 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nv4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0261  */
    /* JADX WARN: Code duplicated, block: B:121:0x0264  */
    /* JADX WARN: Code duplicated, block: B:123:0x0267  */
    /* JADX WARN: Code duplicated, block: B:124:0x026f  */
    /* JADX WARN: Code duplicated, block: B:126:0x027c  */
    /* JADX WARN: Code duplicated, block: B:127:0x027e  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v9 java.lang.Object, still in use, count: 2, list:
          (r5v9 java.lang.Object) from 0x025d: PHI (r5 I:??) = (r5v2 java.lang.Object), (r5v9 java.lang.Object) binds: [B:117:0x025c, B:211:0x025d] A[DONT_GENERATE, DONT_INLINE]
          (r5v9 java.lang.Object) from 0x0255: CHECK_CAST (k79) (r5v9 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 1154
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv4.invoke(java.lang.Object):java.lang.Object");
    }
}
