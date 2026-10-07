package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentLinkedDeque;

/* JADX INFO: loaded from: classes.dex */
public final class jed extends afe {
    public static final /* synthetic */ zv8[] g;
    public final xed a;
    public final ied b;
    public final i8b c;
    public final String d;
    public final qj0 e;
    public final hed f;

    static {
        z8b z8bVar = new z8b(jed.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;");
        zfe.a.getClass();
        g = new zv8[]{z8bVar};
    }

    public jed(xed xedVar, ied iedVar) {
        this.a = xedVar;
        this.b = iedVar;
        this.c = new i8b();
        this.d = qt4.j(hashCode(), jed.class.getName(), "@");
        this.e = new qj0(6, this);
        this.f = new hed(1, this);
    }

    @Override // defpackage.afe
    public final void a(RecyclerView recyclerView, int i) {
        e(recyclerView);
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
    @Override // defpackage.afe
    public final void b(RecyclerView recyclerView, int i, int i2) {
        e(recyclerView);
        i8b i8bVar = this.c;
        i8bVar.b = 0;
        try {
            RecyclerView recyclerViewC = c();
            lq4 lq4Var = null;
            if (recyclerViewC != null) {
                int i3 = 0;
                while (i3 < recyclerViewC.getChildCount()) {
                    int i4 = i3 + 1;
                    View childAt = recyclerViewC.getChildAt(i3);
                    if (childAt == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    try {
                        lfe lfeVarS = recyclerViewC.S(childAt);
                        if (this.b.a(lfeVarS)) {
                            med medVar = lfeVarS instanceof med ? (med) lfeVarS : null;
                            if (medVar != null && medVar.f()) {
                                long jC = medVar.c();
                                if (jC != 0) {
                                    i8bVar.a(jC);
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    i3 = i4;
                }
            }
            if (i8bVar.b != 0) {
                Object objPollLast = ((ConcurrentLinkedDeque) ked.a.b).pollLast();
                if (objPollLast == null) {
                    objPollLast = new LinkedHashSet();
                }
                LinkedHashSet linkedHashSet = (LinkedHashSet) objPollLast;
                linkedHashSet.clear();
                long[] jArr = i8bVar.a;
                for (int i5 = i8bVar.b - 1; -1 < i5; i5--) {
                    linkedHashSet.add(Long.valueOf(jArr[i5]));
                }
                xed xedVar = this.a;
                xedVar.getClass();
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                yab.i0(xedVar.b, xedVar.c, 0, new ai8(linkedHashSet, xedVar, lq4Var, 19), 2);
            }
        } catch (Throwable th) {
            gm0.V(this.d, "tryToPrefetch failure!", th);
        }
    }

    public final RecyclerView c() {
        zv8 zv8Var = g[0];
        return (RecyclerView) this.e.b;
    }

    public final void d() {
        RecyclerView recyclerViewC = c();
        hed hedVar = this.f;
        if (recyclerViewC != null) {
            recyclerViewC.removeCallbacks(hedVar);
        }
        RecyclerView recyclerViewC2 = c();
        if (recyclerViewC2 != null) {
            recyclerViewC2.post(hedVar);
        }
    }

    public final void e(RecyclerView recyclerView) {
        this.e.B(this, g[0], recyclerView);
    }

    public /* synthetic */ jed(xed xedVar) {
        this(xedVar, new qr7(20));
    }
}
