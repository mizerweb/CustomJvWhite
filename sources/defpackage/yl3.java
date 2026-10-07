package defpackage;

import one.me.chats.list.ChatsListWidget;

/* JADX INFO: loaded from: classes.dex */
public final class yl3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ChatsListWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yl3(lq4 lq4Var, ChatsListWidget chatsListWidget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = chatsListWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ChatsListWidget chatsListWidget = this.g;
        switch (i) {
            case 0:
                yl3 yl3Var = new yl3(lq4Var, chatsListWidget, 0);
                yl3Var.f = obj;
                return yl3Var;
            case 1:
                yl3 yl3Var2 = new yl3(lq4Var, chatsListWidget, 1);
                yl3Var2.f = obj;
                return yl3Var2;
            case 2:
                yl3 yl3Var3 = new yl3(lq4Var, chatsListWidget, 2);
                yl3Var3.f = obj;
                return yl3Var3;
            case 3:
                yl3 yl3Var4 = new yl3(lq4Var, chatsListWidget, 3);
                yl3Var4.f = obj;
                return yl3Var4;
            case 4:
                yl3 yl3Var5 = new yl3(lq4Var, chatsListWidget, 4);
                yl3Var5.f = obj;
                return yl3Var5;
            default:
                yl3 yl3Var6 = new yl3(lq4Var, chatsListWidget, 5);
                yl3Var6.f = obj;
                return yl3Var6;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((yl3) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((yl3) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((yl3) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((yl3) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((yl3) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((yl3) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02df  */
    /* JADX WARN: Code duplicated, block: B:103:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:175:0x02e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x02a0 A[SYNTHETIC] */
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v11 java.lang.Object, still in use, count: 2, list:
          (r5v11 java.lang.Object) from 0x02db: PHI (r5 I:??) = (r5v8 java.lang.Object), (r5v11 java.lang.Object) binds: [B:99:0x02da, B:180:0x02db] A[DONT_GENERATE, DONT_INLINE]
          (r5v11 java.lang.Object) from 0x02d1: CHECK_CAST (w73) (r5v11 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 1188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
