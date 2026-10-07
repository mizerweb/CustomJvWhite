package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class sfb extends ls0 {
    @Override // defpackage.hme
    public final void g(v78 v78Var, String str, Throwable th, boolean z) {
        String message;
        if ((th instanceof IOException) && (message = th.getMessage()) != null && r5h.L0(message, "code=403", false)) {
            String queryParameter = v78Var.b.getQueryParameter("apikey");
            Integer numValueOf = queryParameter != null ? Integer.valueOf(queryParameter.hashCode()) : null;
            String str2 = ufb.v;
            g1k g1kVar = new g1k(numValueOf, th.getCause());
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, qv1.j("failed to load preview; api key hash = ", numValueOf), g1kVar);
            }
        }
    }
}
