package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import one.me.android.initialization.AccountInitializer;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wwk {
    public static long a(int i, long j) {
        long j2 = i;
        qyj.h("sampleRate must be greater than 0.", j2 > 0);
        return (1000000000 * j) / j2;
    }

    public static geb b(fka fkaVar) {
        int iU;
        String strX;
        String strX2;
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
            r66 r66Var = r66.a;
            String str = null;
            List listO1 = r66Var;
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
                    if (strX.equals(SdkMetricStatEvent.NAME_KEY)) {
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
                        if (strX2 != null) {
                            str = strX2;
                        }
                    } else if (strX.equals("avatars")) {
                        ArrayList arrayListF0 = ch3.f0(fkaVar, new f4a(26));
                        listO1 = arrayListF0 != null ? ww3.o1(arrayListF0) : null;
                        if (listO1 == null) {
                            listO1 = r66Var;
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
            if (str != null && str.length() != 0 && !listO1.isEmpty()) {
                if (str != null) {
                    return new geb(str, listO1);
                }
                ore.p("Required value was null.");
            }
        }
        return null;
    }

    public static long c(int i, long j) {
        long j2 = i;
        qyj.h("bytesPerFrame must be greater than 0.", j2 > 0);
        return j / j2;
    }
}
