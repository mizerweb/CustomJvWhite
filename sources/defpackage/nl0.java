package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class nl0 extends rq0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ek2 b;

    public /* synthetic */ nl0(ek2 ek2Var, int i) {
        this.a = i;
        this.b = ek2Var;
    }

    @Override // defpackage.rq0, defpackage.d35
    public void a() {
        int i = this.a;
        ek2 ek2Var = this.b;
        switch (i) {
            case 1:
                if (ek2Var.t() instanceof hib) {
                    ek2Var.n(new CancellationException("Cancelled with fresco pipeline"));
                }
                break;
            case 2:
                if (ek2Var.t() instanceof hib) {
                    ek2Var.n(new Throwable("Cancelled with fresco pipeline"));
                }
                break;
        }
    }

    @Override // defpackage.rq0
    public final void e(t25 t25Var) {
        int i = this.a;
        ek2 ek2Var = this.b;
        switch (i) {
            case 0:
                ek2Var.resumeWith(Boolean.FALSE);
                t25Var.close();
                break;
            case 1:
                if (ek2Var.t() instanceof hib) {
                    ek2Var.resumeWith(new poe(new IllegalStateException("Fetch failed", ((q0) t25Var).b())));
                }
                break;
            default:
                ek2Var.resumeWith(null);
                break;
        }
    }

    @Override // defpackage.rq0
    public final void f(q0 q0Var) {
        int i = this.a;
        ek2 ek2Var = this.b;
        switch (i) {
            case 0:
                ek2Var.resumeWith(Boolean.valueOf(cqk.d(q0Var.e(), Boolean.TRUE)));
                q0Var.close();
                break;
            case 1:
                if (ek2Var.t() instanceof hib) {
                    ek2Var.resumeWith(sbi.a);
                }
                break;
            default:
                if (!q0Var.g()) {
                    ek2Var.resumeWith(null);
                } else {
                    au3 au3VarA = au3.A((au3) q0Var.e());
                    if (au3VarA != null) {
                        ek2Var.resumeWith(au3VarA.K());
                    } else {
                        ek2Var.resumeWith(null);
                    }
                }
                break;
        }
    }
}
