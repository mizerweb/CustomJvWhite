package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class i86 implements t76, gqb {
    public final LinkedHashMap a = new LinkedHashMap();
    public w31 b = w31.b;
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ m86 d;

    public i86(m86 m86Var) {
        this.d = m86Var;
    }

    public final void a(boolean z) {
        w31 w31Var = w31.b;
        w31 w31Var2 = z ? w31.a : w31Var;
        if (this.b == w31Var2) {
            return;
        }
        this.b = w31Var2;
        if (w31Var2 == w31Var) {
            ArrayList arrayList = this.c;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((e89) it.next()).cancel(true);
            }
            arrayList.clear();
        }
        for (Map.Entry entry : this.a.entrySet()) {
            try {
                ((Executor) entry.getValue()).execute(new gf5(entry, 17, w31Var2));
            } catch (RejectedExecutionException e) {
                tvj.d(this.d.a, "Unable to post to the supplied executor.", e);
            }
        }
    }

    @Override // defpackage.gqb
    public final e89 f() {
        r72 r72Var = new r72();
        r72Var.c = new gne();
        u72 u72Var = new u72(r72Var);
        r72Var.b = u72Var;
        r72Var.a = qt4.class;
        try {
            this.d.h.execute(new g86(this, r72Var, 0));
            r72Var.a = "fetchData";
        } catch (Exception e) {
            u72Var.c(e);
        }
        return u72Var;
    }

    @Override // defpackage.gqb
    public final void j(eqb eqbVar) {
        this.d.h.execute(new gf5(this, 19, eqbVar));
    }

    @Override // defpackage.gqb
    public final void n(Executor executor, eqb eqbVar) {
        this.d.h.execute(new d86(this, eqbVar, executor, 1));
    }
}
