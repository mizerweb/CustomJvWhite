package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class tx3 extends uk8 {
    public final im5 c = im5.a;
    public final /* synthetic */ ux3 d;
    public final g35 e;
    public final /* synthetic */ ux3 f;

    public tx3(ux3 ux3Var, g35 g35Var) {
        this.f = ux3Var;
        this.d = ux3Var;
        this.e = g35Var;
    }

    @Override // defpackage.uk8
    public final void a(Throwable th) {
        ux3 ux3Var = this.d;
        ux3Var.m = null;
        if (th instanceof ExecutionException) {
            ux3Var.n(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            ux3Var.cancel(false);
        } else {
            ux3Var.n(th);
        }
    }

    @Override // defpackage.uk8
    public final void b(Object obj) {
        this.d.m = null;
        this.f.m(obj);
    }

    @Override // defpackage.uk8
    public final boolean d() {
        return this.d.isDone();
    }

    @Override // defpackage.uk8
    public final Object e() {
        this.e.call();
        return null;
    }

    @Override // defpackage.uk8
    public final String f() {
        return this.e.toString();
    }
}
