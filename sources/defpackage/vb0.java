package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class vb0 implements eqb {
    public final /* synthetic */ i86 a;
    public final /* synthetic */ wb0 b;

    public vb0(wb0 wb0Var, i86 i86Var) {
        this.b = wb0Var;
        this.a = i86Var;
    }

    @Override // defpackage.eqb
    public final void a(Object obj) {
        w31 w31Var = (w31) obj;
        Objects.requireNonNull(w31Var);
        wb0 wb0Var = this.b;
        if (wb0Var.l == this.a) {
            tvj.a("AudioSource", "Receive BufferProvider state change: " + wb0Var.h + " to " + w31Var);
            if (wb0Var.h != w31Var) {
                wb0Var.h = w31Var;
                wb0Var.f();
            }
        }
    }

    @Override // defpackage.eqb
    public final void onError(Throwable th) {
        wb0 wb0Var = this.b;
        if (wb0Var.l == this.a) {
            Executor executor = wb0Var.j;
            kzi kziVar = wb0Var.k;
            if (executor == null || kziVar == null) {
                return;
            }
            executor.execute(new qe(kziVar, 12, th));
        }
    }
}
