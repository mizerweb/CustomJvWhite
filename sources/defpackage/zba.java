package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes3.dex */
public final class zba implements Serializable {
    public final String a;

    public zba(String str) {
        this.a = str;
    }

    public static final zba b(fka fkaVar) {
        int iU;
        String strX;
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
        if (iU == 0) {
            return null;
        }
        String strX2 = "";
        for (int i = 0; i < iU; i++) {
            try {
                strX = ch3.X(fkaVar, null);
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
                strX = null;
            }
            if (strX != null) {
                if (strX.equals("text")) {
                    try {
                        strX2 = ch3.X(fkaVar, null);
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
                        strX2 = null;
                    }
                    if (strX2 == null) {
                        return null;
                    }
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
        }
        if (strX2.length() == 0) {
            return null;
        }
        return new zba(strX2);
    }

    public final String a() {
        return this.a;
    }
}
