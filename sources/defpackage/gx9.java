package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class gx9 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ lx9 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gx9(lx9 lx9Var, int i, lq4 lq4Var, int i2) {
        super(2, lq4Var);
        this.e = i2;
        this.g = lx9Var;
        this.f = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        lx9 lx9Var = this.g;
        switch (i) {
            case 0:
                return new gx9(lx9Var, this.f, lq4Var, 0);
            case 1:
                return new gx9(lx9Var, lq4Var, 1);
            case 2:
                return new gx9(lx9Var, this.f, lq4Var, 2);
            case 3:
                return new gx9(lx9Var, lq4Var, 3);
            default:
                return new gx9(lx9Var, lq4Var, 4);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((gx9) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                return ((gx9) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
            case 2:
                ((gx9) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                return ((gx9) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
            default:
                return ((gx9) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v10 java.lang.Object, still in use, count: 2, list:
          (r5v10 java.lang.Object) from 0x03f3: PHI (r5 I:??) = (r5v7 java.lang.Object), (r5v10 java.lang.Object) binds: [B:183:0x03f2, B:238:0x03f3] A[DONT_GENERATE, DONT_INLINE]
          (r5v10 java.lang.Object) from 0x03e7: CHECK_CAST (j1e) (r5v10 java.lang.Object)
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
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 1170
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gx9(lx9 lx9Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = lx9Var;
    }
}
