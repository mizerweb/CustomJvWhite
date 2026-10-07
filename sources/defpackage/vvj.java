package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vvj {
    public final uvj a;
    public final ewe b;
    public final l40 c;
    public final d d;

    public vvj(uvj uvjVar, ewe eweVar, l40 l40Var, d dVar) {
        this.a = uvjVar;
        this.b = eweVar;
        this.c = l40Var;
        this.d = dVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:167:0x0284  */
    /* JADX WARN: Code duplicated, block: B:170:0x0289  */
    /* JADX WARN: Code duplicated, block: B:177:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:197:0x01c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v13 java.lang.Object, still in use, count: 2, list:
          (r3v13 java.lang.Object) from 0x0280: PHI (r3 I:??) = (r3v2 java.lang.Object), (r3v13 java.lang.Object) binds: [B:164:0x027f, B:249:0x0280] A[DONT_GENERATE, DONT_INLINE]
          (r3v13 java.lang.Object) from 0x0278: CHECK_CAST (uvj) (r3v13 java.lang.Object)
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
    public static final defpackage.vvj e(defpackage.fka r18) {
        /*
            Method dump skipped, instruction units count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvj.e(fka):vvj");
    }

    public final d a() {
        return this.d;
    }

    public final l40 b() {
        return this.c;
    }

    public final ewe c() {
        return this.b;
    }

    public final uvj d() {
        return this.a;
    }
}
