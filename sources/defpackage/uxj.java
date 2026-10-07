package defpackage;

import androidx.lifecycle.LifecycleDestroyedException;

/* JADX INFO: loaded from: classes4.dex */
public final class uxj implements z09 {
    public final /* synthetic */ n09 a;
    public final /* synthetic */ i19 b;
    public final /* synthetic */ ek2 c;
    public final /* synthetic */ af7 d;

    public uxj(n09 n09Var, i19 i19Var, ek2 ek2Var, af7 af7Var) {
        this.a = n09Var;
        this.b = i19Var;
        this.c = ek2Var;
        this.d = af7Var;
    }

    @Override // defpackage.z09
    public final void l(g19 g19Var, m09 m09Var) {
        m09 m09Var2;
        Object poeVar;
        m09.Companion.getClass();
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 2) {
            m09Var2 = m09.ON_CREATE;
        } else if (iOrdinal != 3) {
            m09Var2 = iOrdinal != 4 ? null : m09.ON_RESUME;
        } else {
            m09Var2 = m09.ON_START;
        }
        ek2 ek2Var = this.c;
        i19 i19Var = this.b;
        if (m09Var != m09Var2) {
            if (m09Var == m09.ON_DESTROY) {
                i19Var.f(this);
                ek2Var.resumeWith(new poe(new LifecycleDestroyedException(null)));
                return;
            }
            return;
        }
        i19Var.f(this);
        try {
            poeVar = this.d.invoke();
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        ek2Var.resumeWith(poeVar);
    }
}
