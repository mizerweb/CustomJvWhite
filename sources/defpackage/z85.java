package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class z85 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ yx6 g;
    public /* synthetic */ Object[] h;
    public final /* synthetic */ List i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z85(int i, lq4 lq4Var, List list) {
        super(3, lq4Var);
        this.e = i;
        this.i = list;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        List list = this.i;
        yx6 yx6Var = (yx6) obj;
        Object[] objArr = (Object[]) obj2;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                z85 z85Var = new z85(0, lq4Var, list);
                z85Var.g = yx6Var;
                z85Var.h = objArr;
                return z85Var.invokeSuspend(sbiVar);
            default:
                z85 z85Var2 = new z85(1, lq4Var, list);
                z85Var2.g = yx6Var;
                z85Var2.h = objArr;
                return z85Var2.invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v5 java.lang.Object, still in use, count: 2, list:
          (r7v5 java.lang.Object) from 0x00b1: PHI (r7 I:??) = (r7v2 java.lang.Object), (r7v5 java.lang.Object) binds: [B:45:0x00b0, B:61:0x00b1] A[DONT_GENERATE, DONT_INLINE]
          (r7v5 java.lang.Object) from 0x00a1: CHECK_CAST (java.lang.Number) (r7v5 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z85.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
