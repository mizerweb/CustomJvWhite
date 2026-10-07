package defpackage;

import android.util.Size;

/* JADX INFO: loaded from: classes2.dex */
public final class s48 {
    public static final y48 a;

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
    static {
        Object size = new Size(640, 480);
        Object dneVar = new dne(ww6.c, new ene(mag.c), null);
        r48 r48Var = new r48(0);
        bh0 bh0Var = v68.A0;
        w8b w8bVar = r48Var.b;
        w8bVar.m(bh0Var, size);
        w8bVar.m(cmi.Z0, 1);
        w8bVar.m(v68.v0, 0);
        w8bVar.m(v68.D0, dneVar);
        fx5 fx5Var = fx5.d;
        if (!fx5Var.equals(fx5Var)) {
            c.i("ImageAnalysis currently only supports SDR");
        } else {
            w8bVar.m(n68.u0, fx5Var);
            a = new y48(dhc.a(w8bVar));
        }
    }
}
