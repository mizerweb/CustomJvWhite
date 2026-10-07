package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bpg implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bpg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02db  */
    /* JADX WARN: Code duplicated, block: B:105:0x02dd  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v7 java.lang.Object, still in use, count: 2, list:
          (r9v7 java.lang.Object) from 0x02d6: PHI (r9 I:??) = (r9v3 java.lang.Object), (r9v7 java.lang.Object) binds: [B:101:0x02d5, B:130:0x02d6] A[DONT_GENERATE, DONT_INLINE]
          (r9v7 java.lang.Object) from 0x02c8: CHECK_CAST (dzg) (r9v7 java.lang.Object)
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
    @Override // defpackage.af7
    public final java.lang.Object invoke() throws one.me.sdk.transfer.upload.exceptions.UploadUnhandledException.ChannelOpenException {
        /*
            Method dump skipped, instruction units count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpg.invoke():java.lang.Object");
    }
}
