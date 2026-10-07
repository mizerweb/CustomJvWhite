package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class i96 extends afe {
    public final f96 a;
    public int b = 1;
    public h96 c;
    public final /* synthetic */ k96 d;

    public i96(k96 k96Var, f96 f96Var) {
        this.d = k96Var;
        this.a = f96Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [h96, java.lang.Runnable] */
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
    @Override // defpackage.afe
    public final void b(RecyclerView recyclerView, final int i, final int i2) {
        h96 h96Var = this.c;
        k96 k96Var = this.d;
        if (h96Var != null) {
            k96Var.removeCallbacks(h96Var);
        }
        ?? r2 = new Runnable() { // from class: h96
            @Override // java.lang.Runnable
            public final void run() {
                i96 i96Var = this.a;
                f96 f96Var = i96Var.a;
                k96 k96Var2 = i96Var.d;
                if (i == 0) {
                    int i3 = i2;
                }
                int iZ0 = k96Var2.getLinearLayoutManager().Z0();
                nee adapter = k96Var2.getAdapter();
                if ((adapter != null ? adapter.l() : 0) - iZ0 <= i96Var.b && ((k96Var2.getIgnoreRefreshingFlagsForScrollEvent() || !k96Var2.q2) && f96Var.A())) {
                    k96Var2.setRefreshingNext(true);
                    f96Var.o();
                }
                int iX0 = k96Var2.getLinearLayoutManager().X0();
                if (iX0 < 0 || iX0 > i96Var.b) {
                    return;
                }
                if ((k96Var2.getIgnoreRefreshingFlagsForScrollEvent() || !k96Var2.r2) && f96Var.f()) {
                    k96Var2.setRefreshingPrev(true);
                    f96Var.v();
                }
            }
        };
        this.c = r2;
        k96Var.post(r2);
    }
}
