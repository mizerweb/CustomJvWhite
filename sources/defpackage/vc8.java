package defpackage;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class vc8 extends q0 {
    public ArrayList h;
    public int i;
    public int j;
    public AtomicInteger k;
    public Throwable l;
    public Map m;
    public final /* synthetic */ wc8 n;

    public vc8(wc8 wc8Var) {
        this.n = wc8Var;
        if (wc8Var.b) {
            return;
        }
        o();
    }

    public static void n(vc8 vc8Var, int i, t25 t25Var) {
        t25 t25VarP;
        Throwable th;
        synchronized (vc8Var) {
            if (t25Var == vc8Var.r()) {
                t25VarP = null;
            } else {
                t25VarP = t25Var == vc8Var.q(i) ? vc8Var.p(i) : t25Var;
            }
        }
        if (t25VarP != null) {
            t25VarP.close();
        }
        if (i == 0) {
            q0 q0Var = (q0) t25Var;
            vc8Var.l = q0Var.b();
            vc8Var.m = q0Var.a;
        }
        if (vc8Var.k.incrementAndGet() != vc8Var.j || (th = vc8Var.l) == null) {
            return;
        }
        vc8Var.i(th, vc8Var.m);
    }

    @Override // defpackage.q0, defpackage.t25
    public final boolean close() {
        if (this.n.b) {
            o();
        }
        synchronized (this) {
            try {
                if (!super.close()) {
                    return false;
                }
                ArrayList arrayList = this.h;
                this.h = null;
                if (arrayList == null) {
                    return true;
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    t25 t25Var = (t25) arrayList.get(i);
                    if (t25Var != null) {
                        t25Var.close();
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.q0, defpackage.t25
    public final synchronized Object e() {
        t25 t25VarR;
        try {
            if (this.n.b) {
                o();
            }
            t25VarR = r();
        } catch (Throwable th) {
            throw th;
        }
        return t25VarR != null ? t25VarR.e() : null;
    }

    @Override // defpackage.q0, defpackage.t25
    public final synchronized boolean f() {
        t25 t25VarR;
        try {
            if (this.n.b) {
                o();
            }
            t25VarR = r();
        } catch (Throwable th) {
            throw th;
        }
        return t25VarR != null && t25VarR.f();
    }

    public final void o() {
        if (this.k != null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.k == null) {
                    this.k = new AtomicInteger(0);
                    int size = this.n.a.size();
                    this.j = size;
                    this.i = size;
                    this.h = new ArrayList(size);
                    for (int i = 0; i < size; i++) {
                        t25 t25Var = (t25) ((oah) this.n.a.get(i)).get();
                        this.h.add(t25Var);
                        q0 q0Var = (q0) t25Var;
                        q0Var.l(new uc8(this, i), x72.a);
                        if (q0Var.f()) {
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized t25 p(int i) {
        t25 t25Var;
        ArrayList arrayList = this.h;
        t25Var = null;
        if (arrayList != null && i < arrayList.size()) {
            t25Var = (t25) this.h.set(i, null);
        }
        return t25Var;
    }

    public final synchronized t25 q(int i) {
        ArrayList arrayList;
        arrayList = this.h;
        return (arrayList == null || i >= arrayList.size()) ? null : (t25) this.h.get(i);
    }

    public final synchronized t25 r() {
        return q(this.i);
    }
}
