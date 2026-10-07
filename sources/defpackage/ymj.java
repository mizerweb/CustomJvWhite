package defpackage;

import one.me.webapp.rootscreen.WebAppRootScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class ymj extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ WebAppRootScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ymj(lq4 lq4Var, WebAppRootScreen webAppRootScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = webAppRootScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        WebAppRootScreen webAppRootScreen = this.g;
        switch (i) {
            case 0:
                ymj ymjVar = new ymj(lq4Var, webAppRootScreen, 0);
                ymjVar.f = obj;
                return ymjVar;
            case 1:
                ymj ymjVar2 = new ymj(lq4Var, webAppRootScreen, 1);
                ymjVar2.f = obj;
                return ymjVar2;
            case 2:
                ymj ymjVar3 = new ymj(lq4Var, webAppRootScreen, 2);
                ymjVar3.f = obj;
                return ymjVar3;
            case 3:
                ymj ymjVar4 = new ymj(lq4Var, webAppRootScreen, 3);
                ymjVar4.f = obj;
                return ymjVar4;
            case 4:
                ymj ymjVar5 = new ymj(lq4Var, webAppRootScreen, 4);
                ymjVar5.f = obj;
                return ymjVar5;
            case 5:
                ymj ymjVar6 = new ymj(lq4Var, webAppRootScreen, 5);
                ymjVar6.f = obj;
                return ymjVar6;
            default:
                ymj ymjVar7 = new ymj(lq4Var, webAppRootScreen, 6);
                ymjVar7.f = obj;
                return ymjVar7;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((ymj) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((ymj) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((ymj) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((ymj) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((ymj) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 5:
                ((ymj) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((ymj) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x032c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0335 A[LOOP:4: B:148:0x032a->B:152:0x0335, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:157:0x034b  */
    /* JADX WARN: Code duplicated, block: B:159:0x034f  */
    /* JADX WARN: Code duplicated, block: B:178:0x0384  */
    /* JADX WARN: Code duplicated, block: B:181:0x0396  */
    /* JADX WARN: Code duplicated, block: B:390:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:409:0x0338 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x033a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x015b  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v63 java.lang.Object, still in use, count: 2, list:
          (r3v63 java.lang.Object) from 0x0131: PHI (r3 I:??) = (r3v57 java.lang.Object), (r3v63 java.lang.Object) binds: [B:64:0x0130, B:399:0x0131] A[DONT_GENERATE, DONT_INLINE]
          (r3v63 java.lang.Object) from 0x0123: CHECK_CAST (android.content.Intent) (r3v63 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 2818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ymj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
