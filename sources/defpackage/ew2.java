package defpackage;

import android.os.Looper;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ew2 implements tg4, rv9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ ew2(int i, ghe gheVar) {
        this.a = i;
        this.b = gheVar;
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
    @Override // defpackage.tg4
    public void accept(Object obj) {
        tw2 tw2Var = (tw2) obj;
        mw mwVar = new mw(0);
        for (Long l : this.b) {
            rw2 rw2Var = new rw2();
            rw2Var.b = l.longValue();
            rw2Var.a = this.a;
            mwVar.put(l, new sw2(rw2Var));
        }
        tw2Var.T.putAll(mwVar);
    }

    @Override // defpackage.rv9
    public void l(jv9 jv9Var) {
        if (jv9Var.isConnected()) {
            ghe gheVar = jv9Var.u;
            ghe gheVar2 = jv9Var.v;
            List list = this.b;
            jv9Var.s = c98.n(list);
            ghe gheVarN0 = jv9.n0(jv9Var.t, list, jv9Var.w, jv9Var.z, jv9Var.I);
            jv9Var.u = gheVarN0;
            jv9Var.v = jv9.m0(gheVarN0, list, jv9Var.I, jv9Var.w, jv9Var.z);
            ghe gheVar3 = jv9Var.u;
            gheVar3.getClass();
            boolean zA = j8f.a(gheVar3, gheVar);
            ghe gheVar4 = jv9Var.v;
            gheVar4.getClass();
            j8f.a(gheVar4, gheVar2);
            iu9 iu9Var = jv9Var.a;
            iu9Var.getClass();
            lvb.b0(Looper.myLooper() == iu9Var.f.getLooper());
            gu9 gu9Var = iu9Var.e;
            gu9Var.getClass();
            h88 h88VarP = gu9.p();
            if (!zA) {
                gu9Var.o();
            }
            h88VarP.b(new uc2(jv9Var, h88VarP, this.a, 8), im5.a);
        }
    }

    public /* synthetic */ ew2(qw2 qw2Var, List list, int i) {
        this.b = list;
        this.a = i;
    }
}
