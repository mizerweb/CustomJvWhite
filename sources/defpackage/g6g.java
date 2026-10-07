package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class g6g extends y69 {
    public final nr7 e;

    public g6g(Executor executor) {
        nr7 nr7Var = new nr7();
        super(new ki3(nr7Var, executor, new m67(1)));
        this.e = nr7Var;
        super.D(true);
    }

    @Override // defpackage.nee
    public final void A(lfe lfeVar) {
        ((s7g) lfeVar).F();
    }

    public final k79 J(int i) {
        if (i < 0 || i >= this.d.f.size()) {
            return null;
        }
        return (k79) F(i);
    }

    @Override // defpackage.nee
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void u(s7g s7gVar, int i) {
        s7gVar.B((k79) F(i));
    }

    @Override // defpackage.nee
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void z(s7g s7gVar) {
        s7gVar.E();
    }

    @Override // defpackage.nee
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void B(s7g s7gVar) {
        s7gVar.G();
    }

    @Override // defpackage.nee
    public long m(int i) {
        return ((k79) F(i)).getItemId();
    }

    @Override // defpackage.nee
    public int n(int i) {
        return ((k79) F(i)).getF();
    }

    @Override // defpackage.nee
    public final void t(RecyclerView recyclerView) {
        this.e.c.set(new WeakReference(recyclerView));
    }

    @Override // defpackage.nee
    public final void x(RecyclerView recyclerView) {
        this.e.c.set(null);
    }
}
