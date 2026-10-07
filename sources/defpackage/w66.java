package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class w66 extends RecyclerView {
    public static final /* synthetic */ zv8[] m2;
    public final qj0 j2;
    public v66 k2;
    public final LinkedHashSet l2;

    static {
        z8b z8bVar = new z8b(w66.class, "mEmptyView", "getMEmptyView()Landroid/view/View;");
        zfe.a.getClass();
        m2 = new zv8[]{z8bVar};
    }

    public w66(Context context) {
        super(context, null, 0);
        this.j2 = new qj0(1, this);
        this.l2 = new LinkedHashSet();
    }

    public static void I0(nee neeVar, pee peeVar) {
        if (peeVar == null) {
            return;
        }
        try {
            neeVar.C(peeVar);
        } catch (Exception e) {
            gm0.V(neeVar.getClass().getName(), "fail to unregister data observer", e);
        }
    }

    public static void J0(nee neeVar, pee peeVar) {
        if (peeVar == null) {
            return;
        }
        try {
            neeVar.E(peeVar);
        } catch (Exception e) {
            gm0.V(neeVar.getClass().getName(), "fail to unregister data observer", e);
        }
    }

    private final View getMEmptyView() {
        zv8 zv8Var = m2[0];
        return (View) this.j2.b;
    }

    private final void setMEmptyView(View view) {
        this.j2.B(this, m2[0], view);
    }

    public final void F0() {
        if (getMEmptyView() == null || getAdapter() == null) {
            return;
        }
        nee adapter = getAdapter();
        boolean z = adapter != null && adapter.l() == 0;
        View mEmptyView = getMEmptyView();
        if (mEmptyView != null) {
            mEmptyView.setVisibility(z ? 0 : 8);
        }
        setVisibility(z ? 8 : 0);
    }

    public abstract void G0(nee neeVar);

    public void H0() {
    }

    public final void K0(nee neeVar, boolean z) {
        nee adapter = getAdapter();
        if (adapter != null) {
            J0(adapter, this.k2);
        }
        k96 k96Var = (k96) this;
        nee adapter2 = k96Var.getAdapter();
        j96 j96Var = k96Var.u2;
        if (adapter2 != null) {
            J0(adapter2, j96Var);
        }
        setLayoutFrozen(false);
        x0(neeVar, true, z);
        j0(true);
        requestLayout();
        if (neeVar != null) {
            I0(neeVar, this.k2);
        }
        if (neeVar != null) {
            I0(neeVar, j96Var);
        }
    }

    public nee L0(nee neeVar) {
        return neeVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void setAdapter(nee neeVar) {
        v66 v66Var;
        nee adapter = getAdapter();
        if (adapter != null && (v66Var = this.k2) != null) {
            J0(adapter, v66Var);
            this.k2 = null;
        }
        nee neeVarL0 = L0(neeVar);
        H0();
        super.setAdapter(neeVarL0);
        if (neeVarL0 != null && getMEmptyView() != null) {
            v66 v66Var2 = new v66(0, this);
            this.k2 = v66Var2;
            I0(neeVarL0, v66Var2);
        }
        G0(neeVarL0);
        F0();
    }

    public final void setEmptyView(View view) {
        if (cqk.d(view, getMEmptyView())) {
            return;
        }
        View mEmptyView = getMEmptyView();
        if (mEmptyView != null) {
            mEmptyView.setVisibility(8);
        }
        setMEmptyView(view);
        F0();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        Iterator it = this.l2.iterator();
        if (it.hasNext()) {
            qt4.A(it.next());
            throw null;
        }
    }
}
