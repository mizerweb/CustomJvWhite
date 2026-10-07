package defpackage;

import java.util.Iterator;
import one.me.android.initialization.AccountInitializer;
import ru.ok.android.api.core.ApiInvocationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class btk {
    public static final boolean a(ApiInvocationException apiInvocationException) {
        String errorMessage;
        return apiInvocationException.getErrorCode() == 102 || apiInvocationException.getErrorCode() == 103 || (apiInvocationException.getErrorCode() == 100 && (((errorMessage = apiInvocationException.getErrorMessage()) != null && r5h.L0(errorMessage, "session_key", false)) || cqk.d(apiInvocationException.getErrorField(), "session_key")));
    }

    public static eja b(fka fkaVar) {
        String strW;
        String strW2;
        int iU = ch3.U(fkaVar);
        dja djaVar = null;
        int iIntValue = 0;
        for (int i = 0; i < iU; i++) {
            try {
                strW = ch3.W(fkaVar);
            } catch (Throwable th) {
                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                Iterator it = fjf.a.iterator();
                while (it.hasNext()) {
                    AccountInitializer accountInitializer = ((n6) it.next()).a;
                    try {
                        gm0.V("Payload", "error while parse payload", th);
                        accountInitializer.d().i().g().a(null, th);
                    } catch (Throwable th2) {
                        gm0.V("Payload", "failed to collect exception", th2);
                    }
                }
                int iD = qt4.D(pye.a);
                if (iD != 0) {
                    if (iD == 1) {
                        throw th;
                    }
                    ore.o();
                    return null;
                }
                strW = null;
            }
            if (cqk.d(strW, "reaction")) {
                try {
                    strW2 = ch3.W(fkaVar);
                    if (strW2 == null) {
                        strW2 = "";
                    }
                } catch (Throwable th3) {
                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                    Iterator it2 = fjf.a.iterator();
                    while (it2.hasNext()) {
                        AccountInitializer accountInitializer2 = ((n6) it2.next()).a;
                        try {
                            gm0.V("Payload", "error while parse payload", th3);
                            accountInitializer2.d().i().g().a(null, th3);
                        } catch (Throwable th4) {
                            gm0.V("Payload", "failed to collect exception", th4);
                        }
                    }
                    int iD2 = qt4.D(pye.a);
                    if (iD2 != 0) {
                        if (iD2 == 1) {
                            throw th3;
                        }
                        ore.o();
                        return null;
                    }
                }
                djaVar = new dja(ija.EMOJI, strW2);
            } else if (cqk.d(strW, "count")) {
                Integer numValueOf = 0;
                try {
                    numValueOf = Integer.valueOf(ch3.R(fkaVar, 0));
                } catch (Throwable th5) {
                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                    Iterator it3 = fjf.a.iterator();
                    while (it3.hasNext()) {
                        AccountInitializer accountInitializer3 = ((n6) it3.next()).a;
                        try {
                            gm0.V("Payload", "error while parse payload", th5);
                            accountInitializer3.d().i().g().a(null, th5);
                        } catch (Throwable th6) {
                            gm0.V("Payload", "failed to collect exception", th6);
                        }
                    }
                    int iD3 = qt4.D(pye.a);
                    if (iD3 != 0) {
                        if (iD3 == 1) {
                            throw th5;
                        }
                        ore.o();
                        return null;
                    }
                }
                iIntValue = numValueOf.intValue();
            } else {
                try {
                    fkaVar.x();
                } catch (Throwable th7) {
                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                    Iterator it4 = fjf.a.iterator();
                    while (it4.hasNext()) {
                        AccountInitializer accountInitializer4 = ((n6) it4.next()).a;
                        try {
                            gm0.V("Payload", "error while parse payload", th7);
                            accountInitializer4.d().i().g().a(null, th7);
                        } catch (Throwable th8) {
                            gm0.V("Payload", "failed to collect exception", th8);
                        }
                    }
                    int iD4 = qt4.D(pye.a);
                    if (iD4 != 0) {
                        if (iD4 == 1) {
                            throw th7;
                        }
                        ore.o();
                        return null;
                    }
                }
            }
        }
        if (djaVar != null) {
            return new eja(djaVar, iIntValue);
        }
        ore.p("reaction is null");
        return null;
    }
}
