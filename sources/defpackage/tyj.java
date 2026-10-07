package defpackage;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class tyj extends n1g {
    @Override // defpackage.n1g
    public final void J(String str, String str2) {
        gm0.x(str, str2, null);
    }

    @Override // defpackage.n1g
    public final void K(String str, String str2, CancellationException cancellationException) {
        gm0.x(str, str2, cancellationException);
    }

    @Override // defpackage.n1g
    public final void h0(String str) {
        gm0.U(str, "Rescheduling alarm that keeps track of force-stops.");
    }

    @Override // defpackage.n1g
    public final void j0(String str, String str2) {
        gm0.Y(str, str2);
    }

    @Override // defpackage.n1g
    public final void k0(String str, String str2, RuntimeException runtimeException) {
        gm0.V(str, str2, runtimeException);
    }

    @Override // defpackage.n1g
    public final void p(String str, String str2) {
        gm0.n(str, str2);
    }

    @Override // defpackage.n1g
    public final void q(String str, String str2, Throwable th) {
        gm0.l(str, str2, th);
    }

    @Override // defpackage.n1g
    public final void s(String str, String str2) {
        gm0.Y(str, str2);
    }

    @Override // defpackage.n1g
    public final void t(String str, String str2, Throwable th) {
        if (th instanceof ClassNotFoundException) {
            String string = th.toString();
            xyj.l.getClass();
            for (String str3 : xyj.o) {
                if (r5h.L0(string, str3, true)) {
                    gm0.V(str, str2, th);
                    return;
                }
            }
            gm0.V(str, str2, new syj(th));
            return;
        }
        if (!(th instanceof TimeoutCancellationException) && !(th.getCause() instanceof TimeoutCancellationException)) {
            gm0.V(str, str2, new syj(th));
            return;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "workManager timeout, msg:".concat(str2), null);
        }
    }
}
