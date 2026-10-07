package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class mn8 {
    public pee a;
    public nee b;

    public final void a(RecyclerView recyclerView) {
        b(recyclerView);
        nee adapter = recyclerView.getAdapter();
        if (adapter == null) {
            ore.p("require not null adapter");
            return;
        }
        this.b = adapter;
        pee peeVarC = c(recyclerView, adapter);
        this.a = peeVarC;
        adapter.C(peeVarC);
    }

    public final void b(RecyclerView recyclerView) {
        nee neeVar = this.b;
        if (neeVar == null && this.a == null) {
            gm0.Y(getClass().getName(), "Early return in detachFrom cuz of isDetached");
            return;
        }
        if (neeVar != null && recyclerView.getAdapter() != this.b) {
            qv1.u("adapter was changed", getClass().getName(), "adapter was changed! cached adapter = " + this.b + ", recyclerView.adapter = " + recyclerView.getAdapter());
        }
        nee neeVar2 = this.b;
        pee peeVar = this.a;
        if (neeVar2 != null && peeVar != null) {
            neeVar2.E(peeVar);
        }
        this.b = null;
        this.a = null;
    }

    public abstract pee c(RecyclerView recyclerView, nee neeVar);
}
