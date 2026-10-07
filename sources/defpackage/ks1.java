package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class ks1 implements qp {
    @Override // defpackage.qp
    public final void debugApiRequest(to toVar, op opVar, uo uoVar) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "ApiProviderTag", zo5.l(opVar.getUri(), "debugApiRequest: "), null);
        }
    }

    @Override // defpackage.qp
    public final vu8 debugApiResponseFail(to toVar, op opVar, vu8 vu8Var) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "ApiProviderTag", zo5.l(opVar.getUri(), "debugApiResponseFail: "), null);
            }
        }
        return vu8Var;
    }

    @Override // defpackage.qp
    public final vu8 debugApiResponseOk(to toVar, op opVar, vu8 vu8Var) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "ApiProviderTag", zo5.l(opVar.getUri(), "debugApiResponseOk: "), null);
            }
        }
        return vu8Var;
    }

    @Override // defpackage.qp
    public final void debugIoException(to toVar, op opVar, IOException iOException) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "ApiProviderTag", "debugIoException: " + opVar.getUri() + " " + iOException.getMessage(), iOException);
        }
    }
}
