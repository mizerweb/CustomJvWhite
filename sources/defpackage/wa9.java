package defpackage;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class wa9 implements dk5 {
    public final sr3 a;
    public final String b;
    public final Object c;
    public final int d;
    public final cf7 e;
    public final long f = ej5.b.incrementAndGet();
    public final mjg g;
    public final r8e h;
    public final String i;
    public final ny8 j;

    public wa9(Object obj, sr3 sr3Var, int i, cf7 cf7Var, String str, String str2, ny8 ny8Var) {
        this.a = sr3Var;
        this.b = str;
        this.c = obj;
        this.d = i;
        this.e = cf7Var;
        mjg mjgVarA = p90.a(r66.a);
        this.g = mjgVarA;
        this.h = new r8e(mjgVarA);
        this.i = str2;
        this.j = ny8Var;
        mjgVarA.j(null, d(d0g.d(sr3Var, ((s7f) ny8Var.getValue()).d, obj, str2)));
    }

    @Override // defpackage.dk5
    public final gjg a() {
        return this.h;
    }

    @Override // defpackage.dk5
    public final void b(e55 e55Var) {
        sr3 sr3VarA = zfe.a(Boolean.TYPE);
        sr3 sr3Var = this.a;
        if (sr3Var.equals(sr3VarA) && ej5.a(e55Var.a, this.f)) {
            Boolean boolValueOf = Boolean.valueOf(!((Boolean) d0g.d(sr3Var, ((s7f) this.j.getValue()).d, this.c, this.i)).booleanValue());
            e(boolValueOf);
            List listD = d(boolValueOf);
            mjg mjgVar = this.g;
            mjgVar.getClass();
            mjgVar.j(null, listD);
            this.e.invoke(boolValueOf);
        }
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
    @Override // defpackage.dk5
    public final void c(e55 e55Var, String str) {
        Object objValueOf;
        sr3 sr3VarA = zfe.a(Boolean.TYPE);
        sr3 sr3Var = this.a;
        if (sr3Var.equals(sr3VarA) || !ej5.a(e55Var.a, this.f)) {
            return;
        }
        if (sr3Var.equals(zfe.a(Integer.TYPE))) {
            objValueOf = Integer.valueOf(Integer.parseInt(str.toString()));
        } else if (sr3Var.equals(zfe.a(Long.TYPE))) {
            objValueOf = Long.valueOf(Long.parseLong(str.toString()));
        } else if (!sr3Var.equals(zfe.a(String.class))) {
            objValueOf = str;
            throw new UnsupportedOperationException("Type " + sr3Var + " is not supported!");
        }
        objValueOf = str;
        e(objValueOf);
        List listD = d(objValueOf);
        mjg mjgVar = this.g;
        mjgVar.getClass();
        mjgVar.j(null, listD);
        this.e.invoke(objValueOf);
    }

    public final List d(Object obj) {
        xnh xnhVar;
        String str = this.b;
        int length = str.length();
        String str2 = this.i;
        xnh xnhVar2 = length == 0 ? new xnh(str2) : new xnh(str);
        Class cls = Boolean.TYPE;
        sr3 sr3VarA = zfe.a(cls);
        sr3 sr3Var = this.a;
        rql d55Var = sr3Var.equals(sr3VarA) ? new d55(((Boolean) obj).booleanValue()) : c55.a;
        if (str.length() == 0) {
            xnhVar = new xnh(c0a.n(obj, "value="));
        } else if (sr3Var.equals(zfe.a(cls))) {
            xnhVar = new xnh(str2);
        } else {
            xnhVar = new xnh("key=" + str2 + "\nvalue=" + obj);
        }
        return Collections.singletonList(new e55(this.f, xnhVar2, this.d, xnhVar, d55Var));
    }

    public final void e(Object obj) {
        SharedPreferences.Editor editorEdit = ((s7f) this.j.getValue()).d.edit();
        d0g.f(editorEdit, this.i, obj, this.a, d0g.a, new ifh(new a5d(15)));
        ((zr6) editorEdit).apply();
    }
}
