package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xvi {
    public final z55 a;

    public xvi(z55 z55Var) {
        myh myhVar = myh.c;
        this.a = z55Var;
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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvi) || !this.a.equals(((xvi) obj).a)) {
            return false;
        }
        myh myhVar = myh.c;
        if (!myhVar.equals(myhVar)) {
            return false;
        }
        pa paVar = pa.d;
        return paVar.equals(paVar);
    }

    public final int hashCode() {
        return pa.d.hashCode() + ((myh.c.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VideoDiskCacheTrackSelectionConfig(decodersConfig=" + this.a + ", trackSelectionConfig=" + myh.c + ", adaptiveTrackSelectionConfig=" + pa.d + ")";
    }
}
