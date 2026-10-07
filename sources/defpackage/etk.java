package defpackage;

import android.net.Uri;
import java.util.Iterator;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class etk {
    public static final String a(op opVar) {
        if (opVar instanceof st0) {
            return "batch.executeV2";
        }
        Uri uri = opVar.getUri();
        if (cqk.d(uri.getScheme(), "ok") && cqk.d(uri.getAuthority(), "api")) {
            return fq.c(uri);
        }
        String path = uri.getPath();
        return path == null ? "" : path;
    }

    public static fja b(fka fkaVar) {
        int iU;
        long j;
        String strW;
        String strW2;
        try {
            iU = ch3.U(fkaVar);
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
            iU = 0;
        }
        dja djaVar = null;
        long jLongValue = 0;
        for (int i = 0; i < iU; i++) {
            try {
                strW = ch3.W(fkaVar);
                j = 0;
            } catch (Throwable th3) {
                j = 0;
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
                strW = null;
            }
            if (cqk.d(strW, "userId")) {
                Long lValueOf = Long.valueOf(j);
                try {
                    lValueOf = Long.valueOf(ch3.T(fkaVar, j));
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
                jLongValue = lValueOf.longValue();
            } else if (cqk.d(strW, "reaction")) {
                try {
                    strW2 = ch3.W(fkaVar);
                    if (strW2 == null) {
                        strW2 = "";
                    }
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
                djaVar = new dja(ija.EMOJI, strW2);
            } else {
                try {
                    fkaVar.x();
                } catch (Throwable th9) {
                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th9);
                    Iterator it5 = fjf.a.iterator();
                    while (it5.hasNext()) {
                        AccountInitializer accountInitializer5 = ((n6) it5.next()).a;
                        try {
                            gm0.V("Payload", "error while parse payload", th9);
                            accountInitializer5.d().i().g().a(null, th9);
                        } catch (Throwable th10) {
                            gm0.V("Payload", "failed to collect exception", th10);
                        }
                    }
                    int iD5 = qt4.D(pye.a);
                    if (iD5 != 0) {
                        if (iD5 == 1) {
                            throw th9;
                        }
                        ore.o();
                        return null;
                    }
                }
            }
        }
        if (djaVar != null) {
            return new fja(jLongValue, djaVar);
        }
        ore.p("reaction is null");
        return null;
    }
}
