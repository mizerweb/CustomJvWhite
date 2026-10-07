package defpackage;

import one.me.sdk.statistics.perf.utils.UncaughtPerfRegistrarException;

/* JADX INFO: loaded from: classes.dex */
public final class k94 extends n0 implements yt4 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k94(ut4 ut4Var, int i) {
        super(ut4Var);
        this.b = i;
    }

    @Override // defpackage.yt4
    public final void r0(vt4 vt4Var, Throwable th) {
        switch (this.b) {
            case 0:
                du4 du4Var = (du4) vt4Var.x0(du4.c);
                String str = du4Var != null ? du4Var.b : null;
                if (cqk.d(str, "Root")) {
                    gm0.r("RootCoroutineExceptionHandler", "fail in scope: Root", new jte("fail in scope: Root", th));
                } else if (!cqk.d(str, "User")) {
                    String str2 = "fail in scope: unknown [" + du4Var + "|" + vt4Var + "]";
                    gm0.r("RootCoroutineExceptionHandler", str2, new lci(str2, th));
                } else {
                    gm0.r("UserCoroutineExceptionHandler", "fail in scope: User", new xmi("fail in scope: User", th));
                }
                break;
            default:
                String str3 = krc.b;
                UncaughtPerfRegistrarException uncaughtPerfRegistrarException = new UncaughtPerfRegistrarException(th);
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str3, "Uncaught exception in PerfScope", uncaughtPerfRegistrarException);
                    }
                    break;
                }
                break;
        }
    }
}
