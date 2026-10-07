package defpackage;

import java.util.Iterator;
import one.me.android.initialization.AccountInitializer;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes.dex */
public final class bkb implements fu3 {
    public static final bkb a;
    public static final /* synthetic */ zv8[] b;

    static {
        y8b y8bVar = new y8b("message", bkb.class);
        zfe.a.getClass();
        b = new zv8[]{y8bVar};
        a = new bkb();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:297:0x038c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.fu3
    public final kih i(fka fkaVar) {
        int iU;
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
        st2 st2VarB = null;
        gda gdaVarQ0 = null;
        String strX2 = null;
        long jT = -1;
        int i = 0;
        long jT2 = 0;
        long jT3 = 0;
        boolean zL = false;
        long jT4 = 0;
        boolean zL2 = false;
        int iR = -1;
        while (true) {
            Object[] objArr = b;
            if (i >= iU) {
                Object obj = objArr[0];
                if (gdaVarQ0 != null) {
                    return new akb(jT2, st2VarB, jT3, gdaVarQ0, zL, jT4, zL2, strX2, iR, jT);
                }
                qr7.q(((l72) obj).getName(), " should be initialized before get.", "Property ");
                return null;
            }
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
                switch (strX.hashCode()) {
                    case -1901805651:
                        if (!strX.equals("invisible")) {
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
                            try {
                                zL = ch3.L(fkaVar);
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
                                zL = false;
                            }
                        }
                        break;
                    case -1361631597:
                        if (!strX.equals(ApiProtocol.PARAM_CHAT_ID)) {
                            fkaVar.x();
                        } else {
                            try {
                                jT2 = ch3.T(fkaVar, 0L);
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
                                jT2 = 0;
                            }
                        }
                        break;
                    case -982451749:
                        if (!strX.equals("postId")) {
                            fkaVar.x();
                        } else {
                            try {
                                jT3 = ch3.T(fkaVar, 0L);
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
                                jT3 = 0;
                            }
                        }
                        break;
                    case -840272977:
                        if (!strX.equals("unread")) {
                            fkaVar.x();
                        } else {
                            try {
                                iR = ch3.R(fkaVar, iR);
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
                            }
                        }
                        break;
                    case 115180:
                        if (!strX.equals("ttl")) {
                            fkaVar.x();
                        } else {
                            try {
                                zL2 = ch3.L(fkaVar);
                            } catch (Throwable th15) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th15);
                                Iterator it8 = fjf.a.iterator();
                                while (it8.hasNext()) {
                                    AccountInitializer accountInitializer8 = ((n6) it8.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th15);
                                        accountInitializer8.d().i().g().a(null, th15);
                                    } catch (Throwable th16) {
                                        gm0.V("Payload", "failed to collect exception", th16);
                                    }
                                }
                                int iD8 = qt4.D(pye.a);
                                if (iD8 != 0) {
                                    if (iD8 == 1) {
                                        throw th15;
                                    }
                                    ore.o();
                                    return null;
                                }
                                zL2 = false;
                            }
                        }
                        break;
                    case 116079:
                        if (!strX.equals(MLFeatureConfigProviderBase.URL_KEY)) {
                            fkaVar.x();
                        } else {
                            try {
                                strX2 = ch3.X(fkaVar, null);
                            } catch (Throwable th17) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th17);
                                Iterator it9 = fjf.a.iterator();
                                while (it9.hasNext()) {
                                    AccountInitializer accountInitializer9 = ((n6) it9.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th17);
                                        accountInitializer9.d().i().g().a(null, th17);
                                    } catch (Throwable th18) {
                                        gm0.V("Payload", "failed to collect exception", th18);
                                    }
                                }
                                int iD9 = qt4.D(pye.a);
                                if (iD9 != 0) {
                                    if (iD9 == 1) {
                                        throw th17;
                                    }
                                    ore.o();
                                    return null;
                                }
                                strX2 = null;
                            }
                        }
                        break;
                    case 3052376:
                        if (!strX.equals("chat")) {
                            fkaVar.x();
                        } else {
                            try {
                                st2VarB = st2.b(fkaVar);
                            } catch (Throwable th19) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th19);
                                Iterator it10 = fjf.a.iterator();
                                while (it10.hasNext()) {
                                    AccountInitializer accountInitializer10 = ((n6) it10.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th19);
                                        accountInitializer10.d().i().g().a(null, th19);
                                    } catch (Throwable th20) {
                                        gm0.V("Payload", "failed to collect exception", th20);
                                    }
                                }
                                int iD10 = qt4.D(pye.a);
                                if (iD10 != 0) {
                                    if (iD10 == 1) {
                                        throw th19;
                                    }
                                    ore.o();
                                    return null;
                                }
                                st2VarB = null;
                            }
                        }
                        break;
                    case 3344077:
                        if (!strX.equals("mark")) {
                            fkaVar.x();
                        } else {
                            try {
                                jT = ch3.T(fkaVar, jT);
                            } catch (Throwable th21) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th21);
                                Iterator it11 = fjf.a.iterator();
                                while (it11.hasNext()) {
                                    AccountInitializer accountInitializer11 = ((n6) it11.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th21);
                                        accountInitializer11.d().i().g().a(null, th21);
                                    } catch (Throwable th22) {
                                        gm0.V("Payload", "failed to collect exception", th22);
                                    }
                                }
                                int iD11 = qt4.D(pye.a);
                                if (iD11 != 0) {
                                    if (iD11 == 1) {
                                        throw th21;
                                    }
                                    ore.o();
                                    return null;
                                }
                            }
                        }
                        break;
                    case 954925063:
                        if (!strX.equals("message")) {
                            fkaVar.x();
                        } else {
                            gdaVarQ0 = yab.q0(fkaVar);
                            Object obj2 = objArr[0];
                        }
                        break;
                    case 1075866255:
                        if (!strX.equals("prevMessageId")) {
                            fkaVar.x();
                        } else {
                            try {
                                jT4 = ch3.T(fkaVar, 0L);
                            } catch (Throwable th23) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th23);
                                Iterator it12 = fjf.a.iterator();
                                while (it12.hasNext()) {
                                    AccountInitializer accountInitializer12 = ((n6) it12.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th23);
                                        accountInitializer12.d().i().g().a(null, th23);
                                    } catch (Throwable th24) {
                                        gm0.V("Payload", "failed to collect exception", th24);
                                    }
                                }
                                int iD12 = qt4.D(pye.a);
                                if (iD12 != 0) {
                                    if (iD12 == 1) {
                                        throw th23;
                                    }
                                    ore.o();
                                    return null;
                                }
                                jT4 = 0;
                            }
                        }
                        break;
                    default:
                        fkaVar.x();
                        break;
                }
            }
            i++;
        }
    }
}
