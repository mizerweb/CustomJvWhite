package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class uc8 implements d35 {
    public final int a;
    public final /* synthetic */ vc8 b;

    public uc8(vc8 vc8Var, int i) {
        this.b = vc8Var;
        this.a = i;
    }

    @Override // defpackage.d35
    public final void a() {
    }

    @Override // defpackage.d35
    public final void b(t25 t25Var) {
        if (this.a == 0) {
            this.b.j(((q0) t25Var).c());
        }
    }

    @Override // defpackage.d35
    public final void c(t25 t25Var) {
        vc8.n(this.b, this.a, t25Var);
    }

    @Override // defpackage.d35
    public final void d(t25 t25Var) {
        Throwable th;
        int i;
        if (!t25Var.f()) {
            if (((q0) t25Var).g()) {
                vc8.n(this.b, this.a, t25Var);
                return;
            }
            return;
        }
        vc8 vc8Var = this.b;
        int i2 = this.a;
        q0 q0Var = (q0) t25Var;
        boolean zG = q0Var.g();
        synchronized (vc8Var) {
            try {
                int i3 = vc8Var.i;
                if (q0Var == vc8Var.q(i2) && i2 != vc8Var.i) {
                    if (vc8Var.r() == null || (zG && i2 < vc8Var.i)) {
                        vc8Var.i = i2;
                        i = i2;
                    } else {
                        i = i3;
                    }
                    while (i3 > i) {
                        t25 t25VarP = vc8Var.p(i3);
                        if (t25VarP != null) {
                            t25VarP.close();
                        }
                        i3--;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (q0Var == vc8Var.r()) {
            vc8Var.k(null, i2 == 0 && q0Var.g(), q0Var.a);
        }
        if (vc8Var.k.incrementAndGet() != vc8Var.j || (th = vc8Var.l) == null) {
            return;
        }
        vc8Var.i(th, vc8Var.m);
    }
}
