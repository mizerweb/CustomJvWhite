package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k7 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ yx6 g;
    public /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k7(lq4 lq4Var, Object obj, Object obj2, int i) {
        super(3, lq4Var);
        this.e = i;
        this.i = obj;
        this.j = obj2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        Object obj4 = this.j;
        Object obj5 = this.i;
        yx6 yx6Var = (yx6) obj;
        switch (i) {
            case 0:
                k7 k7Var = new k7((lq4) obj3, (List) obj5, (ny8) obj4, 0);
                k7Var.g = yx6Var;
                k7Var.h = (Object[]) obj2;
                return k7Var.invokeSuspend(sbiVar);
            case 1:
                k7 k7Var2 = new k7((lq4) obj3, (List) obj5, (b95) obj4, 1);
                k7Var2.g = yx6Var;
                k7Var2.h = (Object[]) obj2;
                return k7Var2.invokeSuspend(sbiVar);
            case 2:
                k7 k7Var3 = new k7((gq0) obj5, (xn3) obj4, (lq4) obj3, 2);
                k7Var3.g = yx6Var;
                k7Var3.h = (ulc) obj2;
                return k7Var3.invokeSuspend(sbiVar);
            case 3:
                k7 k7Var4 = new k7((b3h) obj5, (zzg) obj4, (lq4) obj3, 3);
                k7Var4.g = yx6Var;
                k7Var4.h = (Throwable) obj2;
                return k7Var4.invokeSuspend(sbiVar);
            default:
                k7 k7Var5 = new k7((lq4) obj3, (cii) obj5, (cvi) obj4, 4);
                k7Var5.g = yx6Var;
                k7Var5.h = obj2;
                return k7Var5.invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x018c  */
    /* JADX WARN: Code duplicated, block: B:79:0x019e  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v16 java.lang.Object, still in use, count: 2, list:
          (r2v16 java.lang.Object) from 0x0188: PHI (r2 I:??) = (r2v11 java.lang.Object), (r2v16 java.lang.Object) binds: [B:73:0x0187, B:133:0x0188] A[DONT_GENERATE, DONT_INLINE]
          (r2v16 java.lang.Object) from 0x0174: CHECK_CAST (x02) (r2v16 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k7(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.i = obj;
        this.j = obj2;
    }
}
