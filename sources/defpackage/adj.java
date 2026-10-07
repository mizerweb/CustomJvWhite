package defpackage;

import java.lang.ref.WeakReference;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class adj extends hl8 {
    public final jl8 b;
    public final WeakReference c;

    public adj(jl8 jl8Var, cte cteVar) {
        super(cteVar.a);
        this.b = jl8Var;
        this.c = new WeakReference(cteVar);
    }

    @Override // defpackage.hl8
    public final void b(Set set) {
        hl8 hl8Var = (hl8) this.c.get();
        if (hl8Var == null) {
            this.b.b(this);
        } else {
            hl8Var.b(set);
        }
    }
}
