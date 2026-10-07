package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vqb extends y2 {
    public final /* synthetic */ int b;
    public final int c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vqb(fqb fqbVar, Object obj, int i, int i2) {
        super(fqbVar);
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // defpackage.fqb
    public final void g(rrb rrbVar) {
        int i = this.b;
        int i2 = this.c;
        Object obj = this.d;
        fqb fqbVar = this.a;
        switch (i) {
            case 0:
                ko5 ko5Var = l66.a;
                g85 g85Var = (g85) obj;
                if (!(fqbVar instanceof qah)) {
                    fqbVar.f(new uqb(rrbVar, g85Var, i2));
                } else {
                    try {
                        Object obj2 = ((qah) fqbVar).get();
                        if (obj2 == null) {
                            rrbVar.c(ko5Var);
                            rrbVar.b();
                        } else {
                            try {
                                fqb fqbVar2 = (fqb) g85Var.mo41apply(obj2);
                                if (!(fqbVar2 instanceof qah)) {
                                    fqbVar2.f(rrbVar);
                                } else {
                                    try {
                                        Object obj3 = ((qah) fqbVar2).get();
                                        if (obj3 != null) {
                                            frb frbVar = new frb(rrbVar, obj3);
                                            rrbVar.c(frbVar);
                                            frbVar.run();
                                        } else {
                                            rrbVar.c(ko5Var);
                                            rrbVar.b();
                                        }
                                    } catch (Throwable th) {
                                        iwl.a(th);
                                        rrbVar.c(ko5Var);
                                        rrbVar.onError(th);
                                        return;
                                    }
                                }
                            } catch (Throwable th2) {
                                iwl.a(th2);
                                rrbVar.c(ko5Var);
                                rrbVar.onError(th2);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        iwl.a(th3);
                        rrbVar.c(ko5Var);
                        rrbVar.onError(th3);
                        return;
                    }
                }
                break;
            default:
                z2f z2fVar = (z2f) obj;
                if (!(z2fVar instanceof lzh)) {
                    fqbVar.f(new crb(rrbVar, z2fVar.a(), i2));
                } else {
                    fqbVar.f(rrbVar);
                }
                break;
        }
    }
}
