package defpackage;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a4a implements r4a, qg4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a4a(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

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
    @Override // defpackage.qg4
    public void accept(Object obj) {
        p70 p70Var = (p70) this.c;
        bg6 bg6Var = ((j4d) obj).b;
        u89 u89Var = bg6Var.n;
        bg6Var.I0();
        if (bg6Var.m0) {
            return;
        }
        if (!Objects.equals(bg6Var.c0, p70Var)) {
            bg6Var.c0 = p70Var;
            bg6Var.x0(1, 3, p70Var);
            u89Var.c(20, new tf6(p70Var, 0));
        }
        kg6 kg6Var = bg6Var.m;
        kg6Var.h.d(bg6Var.c0, 31, this.b ? 1 : 0, 0).b();
        u89Var.b();
    }

    @Override // defpackage.r4a
    public Object k(d3a d3aVar, i2a i2aVar, int i) {
        int i2 = this.a;
        boolean z = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                return d3aVar.r(i2aVar, c98.r((ry9) obj), z ? -1 : d3aVar.t.F(), z ? -9223372036854775807L : d3aVar.t.e());
            default:
                return d3aVar.r(i2aVar, (List) obj, z ? -1 : d3aVar.t.F(), z ? -9223372036854775807L : d3aVar.t.e());
        }
    }
}
