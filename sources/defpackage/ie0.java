package defpackage;

import java.util.Iterator;
import one.me.android.initialization.AccountInitializer;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes2.dex */
public final class ie0 extends kih {
    public final String c;
    public final int d;
    public final long e;
    public final long f;
    public final int g;

    public ie0(String str, int i, long j, long j2, int i2) {
        this.c = str;
        this.d = i;
        this.e = j;
        this.f = j2;
        this.g = i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:139:0x021b  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final ie0 d(fka fkaVar) {
        int iU;
        String strW;
        String strX;
        if (!fkaVar.l()) {
            return null;
        }
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
        String str = null;
        int iR = 0;
        int iR2 = 0;
        long jT = 0;
        long jT2 = 0;
        for (int i = 0; i < iU; i++) {
            try {
                strW = ch3.W(fkaVar);
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
                strW = null;
            }
            if (strW != null) {
                switch (strW.hashCode()) {
                    case -1135546573:
                        if (!strW.equals("codeLength")) {
                            fkaVar.x();
                        } else {
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
                        }
                        break;
                    case -1007074317:
                        if (!strW.equals("altActionDuration")) {
                            fkaVar.x();
                        } else {
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
                                jT = 0;
                            }
                        }
                        break;
                    case 6808551:
                        if (!strW.equals("requestCountLeft")) {
                            fkaVar.x();
                        } else {
                            try {
                                iR2 = ch3.R(fkaVar, 0);
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
                                iR2 = 0;
                            }
                        }
                        break;
                    case 110541305:
                        if (strW.equals(ApiProtocol.KEY_TOKEN)) {
                            try {
                                strX = ch3.X(fkaVar, null);
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
                                strX = null;
                            }
                            if (strX != null) {
                                str = strX;
                            }
                        } else {
                            fkaVar.x();
                        }
                        break;
                    case 575768841:
                        if (!strW.equals("requestMaxDuration")) {
                            fkaVar.x();
                        } else {
                            try {
                                jT2 = ch3.T(fkaVar, 0L);
                            } catch (Throwable th13) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th13);
                                Iterator it7 = fjf.a.iterator();
                                while (it7.hasNext()) {
                                    AccountInitializer accountInitializer7 = ((n6) it7.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th13);
                                        accountInitializer7.d().i().g().a(null, th13);
                                    } catch (Throwable th14) {
                                        gm0.V("Payload", "failed to collect exception", th14);
                                    }
                                }
                                int iD7 = qt4.D(pye.a);
                                if (iD7 != 0) {
                                    if (iD7 == 1) {
                                        throw th13;
                                    }
                                    ore.o();
                                    return null;
                                }
                                jT2 = 0;
                            }
                        }
                        break;
                    default:
                        fkaVar.x();
                        break;
                }
            }
        }
        if (str != null) {
            return new ie0(str, iR, jT, jT2, iR2);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie0)) {
            return false;
        }
        ie0 ie0Var = (ie0) obj;
        return this.c.equals(ie0Var.c) && this.d == ie0Var.d && this.e == ie0Var.e && this.f == ie0Var.f && this.g == ie0Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + qt4.g(qt4.g(zo5.c(this.d, this.c.hashCode() * 31, 31), 31, this.e), 31, this.f);
    }

    @Override // defpackage.sq0
    public final String toString() {
        StringBuilder sbB = nbh.B(this.e, "Response(verifyToken='", ch3.y(this.c), "', altActionDuration=");
        sbB.append(", codeLength=");
        sbB.append(this.d);
        sbB.append(", requestMaxDuration=");
        c0a.w(sbB, this.f, ", requestCountLeft=", this.g);
        sbB.append(")");
        return sbB.toString();
    }
}
