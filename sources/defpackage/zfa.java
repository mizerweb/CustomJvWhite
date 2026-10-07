package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes.dex */
public final class zfa {
    /* JADX WARN: Code duplicated, block: B:130:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:275:0x0369 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v158 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v24, types: [iv4] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [aga, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v10 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r26v9 */
    public static aga a(fka fkaVar) {
        int iU;
        ?? W;
        ?? r26;
        Short shValueOf;
        Short shValueOf2;
        Object poeVar;
        String strX;
        Object obj;
        LinkedHashMap linkedHashMap;
        int i = 1;
        ?? r10 = 0;
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
        ega egaVar = ega.a;
        int i2 = 0;
        short sShortValue = 0;
        short sShortValue2 = 0;
        String strW = null;
        LinkedHashMap linkedHashMap2 = null;
        ega egaVar2 = egaVar;
        long jLongValue = 0;
        while (i2 < iU) {
            try {
                W = ch3.W(fkaVar);
            } catch (Throwable th3) {
                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                Iterator it2 = fjf.a.iterator();
                while (it2.hasNext()) {
                    AccountInitializer accountInitializer2 = ((n6) it2.next()).a;
                    try {
                        gm0.V("Payload", "error while parse payload", th3);
                        accountInitializer2.d().i().g().a(r10, th3);
                    } catch (Throwable th4) {
                        gm0.V("Payload", "failed to collect exception", th4);
                    }
                }
                int iD2 = qt4.D(pye.a);
                if (iD2 != 0) {
                    if (iD2 == i) {
                        throw th3;
                    }
                    ore.o();
                    return r10;
                }
                W = r10;
            }
            if (W != 0) {
                switch (W.hashCode()) {
                    case -2102099874:
                        if (W.equals("entityId")) {
                            Long lValueOf = 0L;
                            try {
                                lValueOf = Long.valueOf(ch3.T(fkaVar, 0L));
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
                            i = 1;
                            r26 = 0;
                            jLongValue = lValueOf.longValue();
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
                            i = 1;
                            r26 = 0;
                        }
                        break;
                    case -1483200242:
                        if (!W.equals("entityName")) {
                            fkaVar.x();
                            break;
                        } else {
                            try {
                                strW = ch3.W(fkaVar);
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
                                strW = null;
                            }
                        }
                        i = 1;
                        r26 = 0;
                        break;
                    case -1106363674:
                        if (!W.equals("length")) {
                            fkaVar.x();
                        } else {
                            try {
                                shValueOf = Short.valueOf(ch3.V(fkaVar));
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
                                shValueOf = (short) 0;
                            }
                            sShortValue2 = shValueOf.shortValue();
                        }
                        i = 1;
                        r26 = 0;
                        break;
                    case 3151786:
                        if (!W.equals("from")) {
                            fkaVar.x();
                        } else {
                            try {
                                shValueOf2 = Short.valueOf(ch3.V(fkaVar));
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
                                shValueOf2 = (short) 0;
                            }
                            sShortValue = shValueOf2.shortValue();
                        }
                        i = 1;
                        r26 = 0;
                        break;
                    case 3575610:
                        if (!W.equals("type")) {
                            fkaVar.x();
                        } else {
                            try {
                                strX = ch3.X(fkaVar, r10);
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
                                    if (iD8 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th15;
                                }
                                strX = null;
                            }
                            if (strX == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            try {
                                try {
                                    poeVar = ega.valueOf(strX);
                                } catch (Throwable th17) {
                                    poeVar = new poe(th17);
                                    if (poeVar instanceof poe) {
                                        poeVar = egaVar;
                                    }
                                    egaVar2 = (ega) poeVar;
                                    i = 1;
                                    r26 = 0;
                                    i2++;
                                    r10 = r26;
                                }
                                if (poeVar instanceof poe) {
                                    poeVar = egaVar;
                                }
                                egaVar2 = (ega) poeVar;
                            } catch (Throwable th18) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th18);
                                Iterator it9 = fjf.a.iterator();
                                while (it9.hasNext()) {
                                    AccountInitializer accountInitializer9 = ((n6) it9.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th18);
                                        accountInitializer9.d().i().g().a(null, th18);
                                    } catch (Throwable th19) {
                                        gm0.V("Payload", "failed to collect exception", th19);
                                    }
                                }
                                int iD9 = qt4.D(pye.a);
                                if (iD9 != 0) {
                                    if (iD9 == 1) {
                                        throw th18;
                                    }
                                    ore.o();
                                    return null;
                                }
                                egaVar2 = egaVar;
                            }
                        }
                        i = 1;
                        r26 = 0;
                        break;
                    case 405645655:
                        if (W.equals("attributes")) {
                            try {
                                if (fkaVar.y().a() == 8) {
                                    linkedHashMap = new LinkedHashMap();
                                    int iP0 = fkaVar.P0();
                                    for (int i3 = 0; i3 < iP0; i3++) {
                                        try {
                                            String strS0 = fkaVar.S0();
                                            q1 q1VarT0 = fkaVar.T0();
                                            Object objC = q1VarT0.a() == 5 ? q1VarT0.o().C() : q1VarT0.a() == 3 ? Long.valueOf(q1VarT0.c().m()) : null;
                                            if (strS0 != null && objC != null) {
                                                linkedHashMap.put(strS0, objC);
                                            }
                                        } catch (Throwable th20) {
                                            th = th20;
                                            Throwable th21 = th;
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th21);
                                            Iterator it10 = fjf.a.iterator();
                                            while (it10.hasNext()) {
                                                AccountInitializer accountInitializer10 = ((n6) it10.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th21);
                                                    accountInitializer10.d().i().g().a(null, th21);
                                                } catch (Throwable th22) {
                                                    gm0.V("Payload", "failed to collect exception", th22);
                                                }
                                            }
                                            int iD10 = qt4.D(pye.a);
                                            if (iD10 != 0) {
                                                if (iD10 == 1) {
                                                    throw th21;
                                                }
                                                ore.o();
                                                return null;
                                            }
                                            obj = null;
                                            linkedHashMap2 = null;
                                            r26 = obj;
                                            i = 1;
                                            i2++;
                                            r10 = r26;
                                        }
                                    }
                                } else {
                                    fkaVar.x();
                                    linkedHashMap = null;
                                }
                                linkedHashMap2 = linkedHashMap;
                                obj = null;
                            } catch (Throwable th23) {
                                th = th23;
                            }
                            r26 = obj;
                            i = 1;
                            break;
                        }
                    default:
                        fkaVar.x();
                        i = 1;
                        r26 = 0;
                        break;
                }
            } else {
                r26 = r10;
            }
            i2++;
            r10 = r26;
        }
        return new aga(jLongValue, strW, egaVar2, sShortValue, sShortValue2, linkedHashMap2);
    }
}
