package defpackage;

import android.view.View;
import one.me.polls.screens.create.PollCreateScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class s7d extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public /* synthetic */ Object f;
    public final /* synthetic */ PollCreateScreen g;
    public final /* synthetic */ View h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7d(lq4 lq4Var, View view, PollCreateScreen pollCreateScreen) {
        super(2, lq4Var);
        this.h = view;
        this.g = pollCreateScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        View view = this.h;
        PollCreateScreen pollCreateScreen = this.g;
        switch (i) {
            case 0:
                s7d s7dVar = new s7d(lq4Var, view, pollCreateScreen);
                s7dVar.f = obj;
                return s7dVar;
            default:
                s7d s7dVar2 = new s7d(lq4Var, pollCreateScreen, view);
                s7dVar2.f = obj;
                return s7dVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((s7d) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((s7d) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0163  */
    /* JADX WARN: Code duplicated, block: B:56:0x0166  */
    /* JADX WARN: Code duplicated, block: B:59:0x016b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0170  */
    /* JADX WARN: Code duplicated, block: B:64:0x0181  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a6  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v12 java.lang.Object, still in use, count: 2, list:
          (r6v12 java.lang.Object) from 0x015f: PHI (r6 I:??) = (r6v2 java.lang.Object), (r6v12 java.lang.Object) binds: [B:52:0x015e, B:70:0x015f] A[DONT_GENERATE, DONT_INLINE]
          (r6v12 java.lang.Object) from 0x0155: CHECK_CAST (lve) (r6v12 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s7d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7d(lq4 lq4Var, PollCreateScreen pollCreateScreen, View view) {
        super(2, lq4Var);
        this.g = pollCreateScreen;
        this.h = view;
    }
}
