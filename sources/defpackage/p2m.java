package defpackage;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import one.me.android.initialization.AccountInitializer;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p2m {
    /* JADX WARN: Code duplicated, block: B:157:0x0170 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static d a(fka fkaVar) {
        int iU;
        String strX;
        int i;
        int i2 = 1;
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
        if (iU != 0) {
            String strX2 = null;
            int i3 = 0;
            int iR = 0;
            int iR2 = 0;
            while (i3 < iU) {
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
                        if (iD2 == i2) {
                            throw th3;
                        }
                        ore.o();
                        return null;
                    }
                    strX = null;
                }
                if (strX == null) {
                    i = i2;
                } else {
                    int iHashCode = strX.hashCode();
                    if (iHashCode != -1221029593) {
                        if (iHashCode != 116079) {
                            if (iHashCode == 113126854 && strX.equals("width")) {
                                try {
                                    iR = ch3.R(fkaVar, 0);
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
                                    iR = 0;
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
                        } else if (strX.equals(MLFeatureConfigProviderBase.URL_KEY)) {
                            try {
                                strX2 = ch3.X(fkaVar, null);
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
                                strX2 = null;
                            }
                        } else {
                            fkaVar.x();
                        }
                    } else if (strX.equals("height")) {
                        try {
                            iR2 = ch3.R(fkaVar, 0);
                        } catch (Throwable th11) {
                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th11);
                            Iterator it6 = fjf.a.iterator();
                            while (it6.hasNext()) {
                                AccountInitializer accountInitializer6 = ((n6) it6.next()).a;
                                try {
                                    gm0.V("Payload", "error while parse payload", th11);
                                    accountInitializer6.d().i().g().a(null, th11);
                                } catch (Throwable th12) {
                                    gm0.V("Payload", "failed to collect exception", th12);
                                }
                            }
                            int iD6 = qt4.D(pye.a);
                            if (iD6 != 0) {
                                if (iD6 == 1) {
                                    throw th11;
                                }
                                ore.o();
                                return null;
                            }
                            iR2 = 0;
                        }
                    } else {
                        fkaVar.x();
                    }
                    i = 1;
                }
                i3++;
                i2 = i;
            }
            if (strX2 != null && strX2.length() != 0) {
                if (strX2 != null) {
                    return new d(strX2, iR, iR2);
                }
                ore.p("Required value was null.");
            }
        }
        return null;
    }

    public static final String b(String str) {
        return Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 0);
    }
}
