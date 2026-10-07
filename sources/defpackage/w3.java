package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class w3 extends qyj {
    @Override // defpackage.qyj
    public final void P(x3 x3Var, x3 x3Var2) {
        x3Var.b = x3Var2;
    }

    @Override // defpackage.qyj
    public final void Q(x3 x3Var, Thread thread) {
        x3Var.a = thread;
    }

    @Override // defpackage.qyj
    public final boolean e(y3 y3Var, u3 u3Var, u3 u3Var2) {
        synchronized (y3Var) {
            try {
                if (y3Var.b != u3Var) {
                    return false;
                }
                y3Var.b = u3Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qyj
    public final boolean f(y3 y3Var, Object obj, Object obj2) {
        synchronized (y3Var) {
            try {
                if (y3Var.a != obj) {
                    return false;
                }
                y3Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qyj
    public final boolean g(y3 y3Var, x3 x3Var, x3 x3Var2) {
        synchronized (y3Var) {
            try {
                if (y3Var.c != x3Var) {
                    return false;
                }
                y3Var.c = x3Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
