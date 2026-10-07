package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cpe extends q0 {
    public t25 h;

    public static void n(t25 t25Var) {
        if (t25Var != null) {
            t25Var.close();
        }
    }

    @Override // defpackage.q0, defpackage.t25
    public final boolean close() {
        synchronized (this) {
            try {
                if (!super.close()) {
                    return false;
                }
                t25 t25Var = this.h;
                this.h = null;
                n(t25Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.q0, defpackage.t25
    public final synchronized Object e() {
        t25 t25Var;
        t25Var = this.h;
        return t25Var != null ? t25Var.e() : null;
    }

    @Override // defpackage.q0, defpackage.t25
    public final synchronized boolean f() {
        t25 t25Var;
        t25Var = this.h;
        return t25Var != null && t25Var.f();
    }

    public final void o(oah oahVar) {
        if (d()) {
            return;
        }
        t25 t25Var = oahVar != null ? (t25) oahVar.get() : null;
        synchronized (this) {
            try {
                if (d()) {
                    n(t25Var);
                    return;
                }
                t25 t25Var2 = this.h;
                this.h = t25Var;
                if (t25Var != null) {
                    ((q0) t25Var).l(new ak0(2, this), x72.a);
                }
                n(t25Var2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
