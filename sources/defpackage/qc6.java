package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qc6 implements Runnable, Comparable, no5 {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public qc6(long j) {
        this.a = j;
    }

    public final int b(long j, rc6 rc6Var, sc6 sc6Var) {
        synchronized (this) {
            if (this._heap == qyj.a) {
                return 2;
            }
            synchronized (rc6Var) {
                try {
                    qc6[] qc6VarArr = rc6Var.a;
                    qc6 qc6Var = qc6VarArr != null ? qc6VarArr[0] : null;
                    if (sc6.i.get(sc6Var) == 1) {
                        return 1;
                    }
                    if (qc6Var == null) {
                        rc6Var.c = j;
                    } else {
                        long j2 = qc6Var.a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - rc6Var.c > 0) {
                            rc6Var.c = j;
                        }
                    }
                    long j3 = this.a;
                    long j4 = rc6Var.c;
                    if (j3 - j4 < 0) {
                        this.a = j4;
                    }
                    rc6Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.a - ((qc6) obj).a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(rc6 rc6Var) {
        if (this._heap != qyj.a) {
            this._heap = rc6Var;
        } else {
            ore.p("Failed requirement.");
        }
    }

    @Override // defpackage.no5
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                c5b c5bVar = qyj.a;
                if (obj == c5bVar) {
                    return;
                }
                rc6 rc6Var = obj instanceof rc6 ? (rc6) obj : null;
                if (rc6Var != null) {
                    synchronized (rc6Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof uqh ? (uqh) obj2 : null) != null) {
                            rc6Var.b(this.b);
                        }
                    }
                }
                this._heap = c5bVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return zo5.u(new StringBuilder("Delayed[nanos="), this.a, ']');
    }
}
