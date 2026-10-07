package defpackage;

import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x5 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x5(a4c a4cVar, AccountInitializer accountInitializer) {
        this.a = 1;
        this.c = a4cVar;
        this.b = accountInitializer;
    }

    /* JADX WARN: Code duplicated, block: B:153:0x057b  */
    /* JADX WARN: Code duplicated, block: B:157:0x0599  */
    /* JADX WARN: Code duplicated, block: B:159:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:161:0x05aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:163:0x05af  */
    /* JADX WARN: Code duplicated, block: B:164:0x05b2  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v6 java.lang.Object, still in use, count: 2, list:
          (r10v6 java.lang.Object) from 0x0577: PHI (r10 I:??) = (r10v1 java.lang.Object), (r10v6 java.lang.Object) binds: [B:150:0x0576, B:192:0x0577] A[DONT_GENERATE, DONT_INLINE]
          (r10v6 java.lang.Object) from 0x056f: CHECK_CAST (je9) (r10v6 java.lang.Object)
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
    public final java.lang.Object invoke() {
        /*
            Method dump skipped, instruction units count: 1694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x5.invoke():java.lang.Object");
    }

    public /* synthetic */ x5(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
