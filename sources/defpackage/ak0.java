package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ak0 implements d35 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ak0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g(t25 t25Var) {
    }

    private final void h(t25 t25Var) {
    }

    @Override // defpackage.d35
    public final void a() {
        switch (this.a) {
            case 1:
                ek2 ek2Var = (ek2) this.b;
                if (ek2Var.t() instanceof hib) {
                    ek2Var.n(null);
                }
                break;
        }
    }

    @Override // defpackage.d35
    public final void b(t25 t25Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((bk0) obj).j(((q0) t25Var).c());
                break;
            case 1:
                break;
            default:
                cpe cpeVar = (cpe) obj;
                if (t25Var == cpeVar.h) {
                    cpeVar.j(((q0) t25Var).c());
                }
                break;
        }
    }

    @Override // defpackage.d35
    public final void c(t25 t25Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                bk0 bk0Var = (bk0) obj;
                q0 q0Var = (q0) t25Var;
                Throwable thB = q0Var.b();
                if (thB == null) {
                    thB = new IllegalStateException("Image request failed");
                }
                bk0Var.i(thB, q0Var.a);
                break;
            case 1:
                ek2 ek2Var = (ek2) obj;
                if (ek2Var.t() instanceof hib) {
                    Throwable thB2 = ((q0) t25Var).b();
                    if (thB2 == null) {
                        thB2 = new IllegalStateException("fail");
                    }
                    ek2Var.resumeWith(new poe(thB2));
                }
                break;
        }
    }

    @Override // defpackage.d35
    public final void d(t25 t25Var) {
        t25 t25Var2;
        switch (this.a) {
            case 0:
                if (!t25Var.f()) {
                    q0 q0Var = (q0) t25Var;
                    if (q0Var.g()) {
                        bk0 bk0Var = (bk0) this.b;
                        Throwable thB = q0Var.b();
                        if (thB == null) {
                            thB = new IllegalStateException("Image request failed");
                        }
                        bk0Var.i(thB, q0Var.a);
                        return;
                    }
                    return;
                }
                bk0 bk0Var2 = (bk0) this.b;
                synchronized (bk0Var2) {
                    bk0Var2.j = true;
                    t25Var2 = bk0Var2.i;
                    bk0Var2.i = null;
                }
                if (t25Var2 != null) {
                    t25Var2.close();
                }
                q0 q0Var2 = (q0) t25Var;
                ((bk0) this.b).k(null, q0Var2.g(), q0Var2.a);
                return;
            case 1:
                ek2 ek2Var = (ek2) this.b;
                if ((ek2Var.t() instanceof ok2) || !((q0) t25Var).g()) {
                    gm0.Y("FetchBitmap", "Early return in onNewResult cuz of continuation.isCancelled || !dataSource.isFinished");
                    return;
                } else {
                    ek2Var.resumeWith(t25Var.e());
                    return;
                }
            default:
                cpe cpeVar = (cpe) this.b;
                if (!t25Var.f()) {
                    ((q0) t25Var).g();
                    return;
                } else {
                    if (t25Var == cpeVar.h) {
                        cpeVar.k(null, false, ((q0) t25Var).a);
                        return;
                    }
                    return;
                }
        }
    }
}
