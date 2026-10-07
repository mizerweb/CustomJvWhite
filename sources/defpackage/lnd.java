package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lnd implements h65 {
    public final /* synthetic */ int a;
    public final Object b;
    public final f83 c;

    public lnd(t3h t3hVar) {
        this.a = 2;
        this.b = t3hVar;
        this.c = mug.c;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006f  */
    /* JADX WARN: Code duplicated, block: B:21:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0082  */
    /* JADX WARN: Code duplicated, block: B:24:0x008c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0090  */
    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00db  */
    /* JADX WARN: Code duplicated, block: B:41:0x00de  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:53:0x0118  */
    /* JADX WARN: Code duplicated, block: B:54:0x0127  */
    /* JADX WARN: Code duplicated, block: B:62:0x0147  */
    /* JADX WARN: Code duplicated, block: B:65:0x0164  */
    /* JADX WARN: Code duplicated, block: B:66:0x016a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0180  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v9 java.lang.Object, still in use, count: 2, list:
          (r15v9 java.lang.Object) from 0x006b: PHI (r15 I:??) = (r15v4 java.lang.Object), (r15v9 java.lang.Object) binds: [B:15:0x006a, B:146:0x006b] A[DONT_GENERATE, DONT_INLINE]
          (r15v9 java.lang.Object) from 0x005f: CHECK_CAST (avg) (r15v9 java.lang.Object)
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
    @Override // defpackage.h65
    public final defpackage.u65 a(java.lang.String r28, defpackage.m65 r29, android.os.Bundle r30) {
        /*
            Method dump skipped, instruction units count: 968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lnd.a(java.lang.String, m65, android.os.Bundle):u65");
    }

    @Override // defpackage.h65
    public final f83 b() {
        switch (this.a) {
            case 0:
                return (ond) this.c;
            case 1:
                return (uuc) this.c;
            default:
                return (mug) this.c;
        }
    }

    public lnd(ny8 ny8Var) {
        this.a = 0;
        this.b = ny8Var;
        this.c = ond.c;
    }

    public lnd(i5d i5dVar) {
        this.a = 1;
        this.b = i5dVar;
        this.c = uuc.c;
    }
}
