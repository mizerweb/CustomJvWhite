package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class xxe extends t51 {
    public final String i = "SafeBus";

    @Override // defpackage.t51
    public final void c(Object obj) throws InterruptedException {
        try {
            super.c(obj);
        } catch (InterruptedException e) {
            throw e;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            String str = this.i;
            u51 u51Var = new u51(th);
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, c0a.n(obj, "fail to post "), u51Var);
            }
        }
    }

    @Override // defpackage.t51
    public final void d(Object obj) {
        try {
            super.d(obj);
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.t51
    public final void f(Object obj) {
        try {
            super.f(obj);
        } catch (Throwable unused) {
        }
    }
}
