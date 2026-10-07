package defpackage;

import java.util.Iterator;
import one.me.android.initialization.AccountInitializer;
import org.msgpack.core.MessageInsufficientBufferException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cxk {
    public static wib a(String str) {
        Object obj = null;
        if (str == null) {
            return null;
        }
        y1 y1Var = new y1(0, wib.c);
        while (y1Var.hasNext()) {
            Object next = y1Var.next();
            if (((wib) next).a.equals(str)) {
                obj = next;
                break;
            }
        }
        return (wib) obj;
    }

    public static hd0 b(fka fkaVar) {
        String strX;
        int iP0 = fkaVar.P0();
        String strX2 = null;
        Long lValueOf = null;
        for (int i = 0; i < iP0; i++) {
            try {
                strX = ch3.X(fkaVar, null);
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
                strX = null;
            }
            if (cqk.d(strX, ApiProtocol.KEY_TOKEN)) {
                try {
                    strX2 = ch3.X(fkaVar, null);
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
                    strX2 = null;
                }
            } else if (!cqk.d(strX, "tokenTtl")) {
                try {
                    fkaVar.x();
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
            } else {
                if (!fkaVar.l()) {
                    throw new MessageInsufficientBufferException();
                }
                if (fkaVar.h.getByte(fkaVar.i) == -64) {
                    fkaVar.readByte();
                    lValueOf = null;
                } else {
                    long jT = 0;
                    try {
                        jT = ch3.T(fkaVar, 0L);
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
                    lValueOf = Long.valueOf(jT);
                }
            }
        }
        if (strX2 == null) {
            strX2 = "";
        }
        return new hd0(strX2, lValueOf);
    }
}
