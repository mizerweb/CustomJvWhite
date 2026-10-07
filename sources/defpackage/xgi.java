package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xgi implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;
    public final /* synthetic */ zgi c;

    public /* synthetic */ xgi(yx6 yx6Var, zgi zgiVar, int i) {
        this.a = i;
        this.b = yx6Var;
        this.c = zgiVar;
    }

    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0118  */
    /* JADX WARN: Code duplicated, block: B:64:0x0183 A[Catch: IOException -> 0x0191, TryCatch #2 {IOException -> 0x0191, blocks: (B:62:0x016f, B:64:0x0183, B:67:0x0193), top: B:94:0x016f }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0193 A[Catch: IOException -> 0x0191, TRY_LEAVE, TryCatch #2 {IOException -> 0x0191, blocks: (B:62:0x016f, B:64:0x0183, B:67:0x0193), top: B:94:0x016f }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0209  */
    /* JADX WARN: Code duplicated, block: B:91:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x016f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r16v6 java.lang.Object, still in use, count: 2, list:
          (r16v6 java.lang.Object) from 0x0114: PHI (r16 I:??) = (r16v1 java.lang.Object), (r16v6 java.lang.Object) binds: [B:51:0x0112, B:96:0x0114] A[DONT_GENERATE, DONT_INLINE]
          (r16v6 java.lang.Object) from 0x0105: CHECK_CAST (sya) (r16v6 java.lang.Object)
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
    @Override // defpackage.yx6
    public final java.lang.Object emit(java.lang.Object r18, defpackage.lq4 r19) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xgi.emit(java.lang.Object, lq4):java.lang.Object");
    }
}
