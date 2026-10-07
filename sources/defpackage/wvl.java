package defpackage;

import java.util.Iterator;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wvl {
    public static x74 a(tre treVar, fif fifVar) {
        return treVar.a(fifVar);
    }

    public static void b(u76 u76Var, aw8 aw8Var, Object obj) {
        if (aw8Var.d().b()) {
            u76Var.t(aw8Var, obj);
        } else if (obj == null) {
            u76Var.s();
        } else {
            u76Var.t(aw8Var, obj);
        }
    }

    public static void c(tre treVar, aw8 aw8Var, Object obj) {
        aw8Var.a(treVar, obj);
    }

    /* JADX WARN: Code duplicated, block: B:198:0x022a A[EXC_TOP_SPLITTER, PHI: r17
  0x022a: PHI (r17v12 int) = (r17v1 int), (r17v2 int), (r17v3 int), (r17v4 int), (r17v13 int) binds: [B:138:0x0228, B:118:0x01d4, B:98:0x017f, B:78:0x012b, B:48:0x00bd] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v27, types: [iv4] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v94, types: [iv4] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v2, types: [yhh] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.String] */
    public static final yhh d(fka fkaVar) {
        String strX;
        String strX2;
        String str;
        String str2;
        int iU;
        ?? r16;
        ?? X;
        ?? r17;
        int i;
        int i2;
        boolean z;
        String str3 = null;
        ?? r7 = 0;
        if (fkaVar.l()) {
            int i3 = 0;
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
            String strX3 = null;
            strX = null;
            String strX4 = null;
            String strX5 = null;
            strX2 = null;
            while (i3 < iU) {
                try {
                    r17 = r7;
                    X = ch3.X(fkaVar, r7);
                } catch (Throwable th3) {
                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                    Iterator it2 = fjf.a.iterator();
                    while (it2.hasNext()) {
                        AccountInitializer accountInitializer2 = ((n6) it2.next()).a;
                        try {
                            gm0.V("Payload", "error while parse payload", th3);
                            accountInitializer2.d().i().g().a(r7, th3);
                        } catch (Throwable th4) {
                            gm0.V("Payload", "failed to collect exception", th4);
                        }
                    }
                    int iD2 = qt4.D(pye.a);
                    r16 = r7;
                    if (iD2 != 0) {
                        if (iD2 == 1) {
                            throw th3;
                        }
                        ore.o();
                        return r16;
                    }
                    X = r16;
                }
                if (X != 0) {
                    r17 = r16;
                    switch (X.hashCode()) {
                        case -1724546052:
                            i = i3;
                            if (X.equals("description")) {
                                try {
                                    strX4 = ch3.X(fkaVar, strX4);
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
                            z = true;
                            r17 = 0;
                            break;
                        case 96784904:
                            i = i3;
                            if (!X.equals("error")) {
                                fkaVar.x();
                            } else {
                                try {
                                    strX3 = ch3.X(fkaVar, strX3);
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
                            z = true;
                            r17 = 0;
                            break;
                        case 110371416:
                            i = i3;
                            if (!X.equals("title")) {
                                fkaVar.x();
                            } else {
                                try {
                                    strX5 = ch3.X(fkaVar, strX5);
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
                                }
                            }
                            z = true;
                            r17 = 0;
                            break;
                        case 954925063:
                            i = i3;
                            if (!X.equals("message")) {
                                fkaVar.x();
                            } else {
                                try {
                                    strX = ch3.X(fkaVar, strX);
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
                            z = true;
                            r17 = 0;
                            break;
                        case 1122960396:
                            if (X.equals("localizedMessage")) {
                                try {
                                    strX2 = ch3.X(fkaVar, strX2);
                                    i = i3;
                                } catch (Throwable th15) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th15);
                                    Iterator it8 = fjf.a.iterator();
                                    ?? r18 = r17;
                                    while (it8.hasNext()) {
                                        AccountInitializer accountInitializer8 = ((n6) it8.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th15);
                                            i2 = i3;
                                            try {
                                                accountInitializer8.d().i().g().a(r18, th15);
                                            } catch (Throwable th16) {
                                                th = th16;
                                                gm0.V("Payload", "failed to collect exception", th);
                                                i3 = i2;
                                                r18 = 0;
                                            }
                                        } catch (Throwable th17) {
                                            th = th17;
                                            i2 = i3;
                                        }
                                        i3 = i2;
                                        r18 = 0;
                                    }
                                    i = i3;
                                    int iD8 = qt4.D(pye.a);
                                    if (iD8 != 0) {
                                        if (iD8 == 1) {
                                            throw th15;
                                        }
                                        ore.o();
                                        return null;
                                    }
                                }
                            }
                            z = true;
                            r17 = 0;
                        default:
                            i = i3;
                            fkaVar.x();
                            z = true;
                            r17 = 0;
                            break;
                    }
                } else {
                    r17 = r16;
                    i = i3;
                    z = true;
                }
                r7 = r17;
                i3 = i + 1;
            }
            str3 = strX3;
            str2 = strX4;
            str = strX5;
        } else {
            strX = null;
            strX2 = null;
            str = null;
            str2 = null;
        }
        return (str2 == null && str == null) ? new yhh(str3, strX, strX2) : new eih(str3, strX, strX2, str, str2);
    }
}
