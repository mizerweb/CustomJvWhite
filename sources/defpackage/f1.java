package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class f1 extends grk {
    @Override // defpackage.grk
    public final boolean b(o1 o1Var, c1 c1Var, c1 c1Var2) {
        synchronized (o1Var) {
            try {
                if (o1Var.b != c1Var) {
                    return false;
                }
                o1Var.b = c1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.grk
    public final boolean c(o1 o1Var, Object obj, Object obj2) {
        synchronized (o1Var) {
            try {
                if (o1Var.a != obj) {
                    return false;
                }
                o1Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.grk
    public final boolean d(o1 o1Var, n1 n1Var, n1 n1Var2) {
        synchronized (o1Var) {
            try {
                if (o1Var.c != n1Var) {
                    return false;
                }
                o1Var.c = n1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.grk
    public final c1 e(o1 o1Var) {
        c1 c1Var;
        c1 c1Var2 = c1.d;
        synchronized (o1Var) {
            try {
                c1Var = o1Var.b;
                if (c1Var != c1Var2) {
                    o1Var.b = c1Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1Var;
    }

    @Override // defpackage.grk
    public final n1 f(o1 o1Var) {
        n1 n1Var;
        n1 n1Var2 = n1.c;
        synchronized (o1Var) {
            try {
                n1Var = o1Var.c;
                if (n1Var != n1Var2) {
                    o1Var.c = n1Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return n1Var;
    }

    @Override // defpackage.grk
    public final void g(n1 n1Var, n1 n1Var2) {
        n1Var.b = n1Var2;
    }

    @Override // defpackage.grk
    public final void h(n1 n1Var, Thread thread) {
        n1Var.a = thread;
    }
}
