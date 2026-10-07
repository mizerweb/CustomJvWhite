package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nua implements tg4, b6a, i8c {
    public final /* synthetic */ int a;
    public final /* synthetic */ cf7 b;

    public /* synthetic */ nua(cf7 cf7Var, sua suaVar) {
        this.a = 1;
        this.b = cf7Var;
    }

    @Override // defpackage.b6a, defpackage.hvd
    public void a(float f) {
        this.b.invoke(Float.valueOf(f));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae A[LOOP:2: B:38:0x009b->B:43:0x00ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b2 A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v14 java.lang.Object, still in use, count: 2, list:
          (r1v14 java.lang.Object) from 0x0048: PHI (r1 I:??) = (r1v1 java.lang.Object), (r1v14 java.lang.Object) binds: [B:15:0x0047, B:50:0x0048] A[DONT_GENERATE, DONT_INLINE]
          (r1v14 java.lang.Object) from 0x0040: CHECK_CAST (e70) (r1v14 java.lang.Object)
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
    @Override // defpackage.tg4
    public void accept(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nua.accept(java.lang.Object):void");
    }

    @Override // defpackage.i8c
    public void w(j8c j8cVar) {
        this.b.invoke(j8cVar);
    }

    public /* synthetic */ nua(int i, cf7 cf7Var) {
        this.a = i;
        this.b = cf7Var;
    }
}
