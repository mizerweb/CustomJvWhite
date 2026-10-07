package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fb extends sg5 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fb(lq0 lq0Var, int i) {
        super(lq0Var);
        this.c = i;
    }

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
    @Override // defpackage.lq0
    public final void h(int i, Object obj) throws Throwable {
        int i2 = this.c;
        lq0 lq0Var = this.b;
        switch (i2) {
            case 0:
                p76 p76Var = (p76) obj;
                if (p76Var != null) {
                    if (!p76.I(p76Var)) {
                        p76Var.W();
                    }
                    lq0Var.g(i, p76Var);
                } else {
                    lq0Var.g(i, null);
                }
                break;
            default:
                au3 au3Var = (au3) obj;
                if (!lq0.b(i)) {
                    lq0Var.g(i, au3Var);
                    break;
                }
                break;
        }
    }
}
