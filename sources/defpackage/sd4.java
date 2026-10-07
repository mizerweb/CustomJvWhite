package defpackage;

import android.os.OutcomeReceiver;
import android.telecom.CallEndpointException;

/* JADX INFO: loaded from: classes2.dex */
public final class sd4 implements OutcomeReceiver {
    public final void onError(Throwable th) {
        CallEndpointException callEndpointExceptionK = rh.k(th);
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallAudioController", qv1.k("Endpoint change failed: ", callEndpointExceptionK.getMessage()), null);
        }
    }

    public final void onResult(Object obj) {
        gm0.n("CallAudioController", "Endpoint change succeeded");
    }
}
