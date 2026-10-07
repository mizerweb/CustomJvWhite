package defpackage;

import com.vk.push.core.filedatastore.flow.FlowableFileDataStoreImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class q40 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ boolean g;
    public Object h;
    public Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q40(t40 t40Var, fda fdaVar, Long l, int i, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 0;
        this.h = t40Var;
        this.i = fdaVar;
        this.j = l;
        this.f = i;
        this.g = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                return new q40((t40) this.h, (fda) this.i, (Long) obj2, this.f, this.g, lq4Var);
            case 1:
                q40 q40Var = new q40((pzf) this.i, (FlowableFileDataStoreImpl) obj2, lq4Var);
                q40Var.g = ((Boolean) obj).booleanValue();
                return q40Var;
            case 2:
                return new q40((js8) this.h, (String) this.i, this.g, (String) obj2, lq4Var, 2);
            case 3:
                q40 q40Var2 = new q40((jsa) this.i, (String) obj2, this.g, lq4Var);
                q40Var2.h = obj;
                return q40Var2;
            case 4:
                return new q40(4, lq4Var, (wfe) this.h, (vfe) this.i, (dvd) obj2, this.g);
            case 5:
                return new q40(5, lq4Var, (m5f) this.h, (n5f) this.i, (j6f) obj2, this.g);
            case 6:
                return new q40(lq4Var, (rej) obj2, this.g);
            case 7:
                q40 q40Var3 = new q40((qlj) this.h, (vkj) this.i, (klj) obj2, lq4Var, 7);
                q40Var3.g = ((Boolean) obj).booleanValue();
                return q40Var3;
            case 8:
                return new q40((ioj) this.h, (String) this.i, this.g, (String) obj2, lq4Var, 8);
            default:
                q40 q40Var4 = new q40((mpj) this.h, (yrj) this.i, (trj) obj2, lq4Var, 9);
                q40Var4.g = ((Boolean) obj).booleanValue();
                return q40Var4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((q40) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((q40) create(bool, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((q40) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((q40) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((q40) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((q40) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((q40) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((q40) create(bool2, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((q40) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((q40) create(bool3, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:160:0x034c  */
    /* JADX WARN: Code duplicated, block: B:162:0x0350  */
    /* JADX WARN: Code duplicated, block: B:165:0x0376  */
    /* JADX WARN: Code duplicated, block: B:245:0x051d  */
    /* JADX WARN: Code duplicated, block: B:333:0x0683  */
    /* JADX WARN: Code duplicated, block: B:343:0x06ba A[PHI: r2
  0x06ba: PHI (r2v17 java.lang.String) = (r2v15 java.lang.String), (r2v20 java.lang.String) binds: [B:392:0x07a2, B:342:0x06b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:346:0x06c7 A[PHI: r1
  0x06c7: PHI (r1v32 java.lang.String) = (r1v30 java.lang.String), (r1v45 java.lang.String) binds: [B:395:0x07ae, B:345:0x06c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:383:0x076e  */
    /* JADX WARN: Code duplicated, block: B:384:0x0772  */
    /* JADX WARN: Code duplicated, block: B:386:0x0778  */
    /* JADX WARN: Code duplicated, block: B:387:0x0788  */
    /* JADX WARN: Code duplicated, block: B:389:0x078e  */
    /* JADX WARN: Code duplicated, block: B:391:0x0798  */
    /* JADX WARN: Code duplicated, block: B:394:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:397:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:398:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:399:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:401:0x07ca  */
    /* JADX WARN: Code duplicated, block: B:402:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:404:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:406:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:407:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:410:0x0802  */
    /* JADX WARN: Code duplicated, block: B:411:0x0808  */
    /* JADX WARN: Code duplicated, block: B:412:0x0812  */
    /* JADX WARN: Code duplicated, block: B:414:0x0818  */
    /* JADX WARN: Code duplicated, block: B:416:0x081e  */
    /* JADX WARN: Code duplicated, block: B:422:0x0837  */
    /* JADX WARN: Code duplicated, block: B:424:0x083d  */
    /* JADX WARN: Code duplicated, block: B:427:0x0846  */
    /* JADX WARN: Code duplicated, block: B:429:0x0857  */
    /* JADX WARN: Code duplicated, block: B:430:0x0874  */
    /* JADX WARN: Code duplicated, block: B:432:0x0885  */
    /* JADX WARN: Code duplicated, block: B:433:0x08a2  */
    /* JADX WARN: Code duplicated, block: B:72:0x019d  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a3  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v6 java.lang.Object, still in use, count: 2, list:
          (r8v6 java.lang.Object) from 0x04fc: PHI (r8 I:??) = (r8v3 java.lang.Object), (r8v6 java.lang.Object) binds: [B:237:0x04fb, B:446:0x04fc] A[DONT_GENERATE, DONT_INLINE]
          (r8v6 java.lang.Object) from 0x04ee: CHECK_CAST (os8) (r8v6 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 2320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q40.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q40(int i, lq4 lq4Var, Object obj, Object obj2, Object obj3, boolean z) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
        this.g = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q40(lq4 lq4Var, rej rejVar, boolean z) {
        super(2, lq4Var);
        this.e = 6;
        this.g = z;
        this.j = rejVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q40(jsa jsaVar, String str, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 3;
        this.i = jsaVar;
        this.j = str;
        this.g = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q40(pzf pzfVar, FlowableFileDataStoreImpl flowableFileDataStoreImpl, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 1;
        this.i = pzfVar;
        this.j = flowableFileDataStoreImpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q40(Object obj, Object obj2, Enum r3, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
        this.j = r3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q40(Object obj, String str, boolean z, String str2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.i = str;
        this.g = z;
        this.j = str2;
    }
}
