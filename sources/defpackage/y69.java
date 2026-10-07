package defpackage;

import java.util.List;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public abstract class y69 extends nee {
    public final d20 d;

    public y69(e9i e9iVar) {
        x69 x69Var = new x69(this);
        t3a t3aVar = new t3a(this);
        synchronized (f55.a) {
            try {
                if (f55.b == null) {
                    f55.b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d20 d20Var = new d20(t3aVar, new ki3(null, f55.b, e9iVar));
        this.d = d20Var;
        d20Var.d.add(x69Var);
    }

    public final Object F(int i) {
        return this.d.f.get(i);
    }

    public void G(List list, List list2) {
    }

    public final void H(List list) {
        this.d.b(list, null);
    }

    public void I(List list, Runnable runnable) {
        this.d.b(list, runnable);
    }

    @Override // defpackage.nee
    public int l() {
        return this.d.f.size();
    }

    public y69(ki3 ki3Var) {
        x69 x69Var = new x69(this);
        d20 d20Var = new d20(new t3a(this), ki3Var);
        this.d = d20Var;
        d20Var.d.add(x69Var);
    }
}
