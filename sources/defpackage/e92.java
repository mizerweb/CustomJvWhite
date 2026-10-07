package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e92 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i92 b;

    public /* synthetic */ e92(i92 i92Var, int i) {
        this.a = i;
        this.b = i92Var;
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
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        i92 i92Var = this.b;
        switch (i) {
            case 0:
                i92Var.c = new h92();
                new File(((ju6) i92Var.p).b(), "call_history_state").delete();
                break;
            case 1:
                i92Var.getClass();
                try {
                    i92Var.q.f(i92Var);
                } catch (Exception unused) {
                    return;
                }
                break;
            case 2:
                if (!i92Var.a) {
                    i92Var.e();
                    if (i92Var.c.a.a == 0 && i92Var.c.a.b == 0 && i92Var.c.e) {
                        i92Var.g(new e92(i92Var, 3));
                    } else {
                        ArrayList arrayListH = i92Var.m.h(i92Var.c.a.a, i92Var.c.a.b);
                        gm0.n("i92", "loadInitial: loaded from db: " + arrayListH.size() + " messages");
                        i92Var.a(i92Var.d.size(), arrayListH);
                        i92Var.a = true;
                        i92Var.b = arrayListH.isEmpty();
                        i92Var.f();
                        if (i92Var.c.d) {
                            i92Var.g(new nb0(i92Var, true, 4));
                        }
                    }
                    break;
                }
                break;
            case 3:
                i92Var.e();
                if (i92Var.g == 0) {
                    boolean z = i92Var.c.b != 0;
                    gm0.n("i92", "sync: from: " + i92Var.c.b + " forward: " + z);
                    pvb pvbVar = i92Var.l;
                    i92Var.g = pvb.s(pvbVar, new eui(pvbVar.u().a.g(), i92Var.c.b, z));
                }
                break;
            default:
                Iterator it = i92Var.f.iterator();
                while (it.hasNext()) {
                    kl1 kl1Var = (kl1) ((g92) it.next());
                    gm0.n("CallHistoryPageViewModel", "loaded history for type=" + kl1Var.c);
                    kl1Var.H();
                }
                break;
        }
    }
}
