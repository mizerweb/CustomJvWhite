package defpackage;

import android.content.Context;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xhc {
    public static final k29 a = new k29(-1);
    public static final k29 b = new k29(-16776961);
    public static final k29 c = new k29(-16776961);

    public static double a(xu0 xu0Var, long j, int i, double d) {
        double dG = ew5.g(j);
        if (dG <= 0.0d) {
            return 0.0d;
        }
        long jG = ew5.g(j);
        long jQ = xu0Var.q();
        if (jQ < 0) {
            jQ = 0;
        }
        double d2 = jQ;
        long wifiTxBytes = xu0Var.getWifiTxBytes();
        if (wifiTxBytes < 0) {
            wifiTxBytes = 0;
        }
        double d3 = wifiTxBytes;
        long wifiRxBytes = xu0Var.getWifiRxBytes();
        if (wifiRxBytes < 0) {
            wifiRxBytes = 0;
        }
        double d4 = wifiRxBytes;
        long jU = xu0Var.u();
        if (jU < 0) {
            jU = 0;
        }
        double d5 = jU;
        long jT = xu0Var.t();
        return ((((d2 * 1000.0d) / d) / (((double) i) * dG)) * 1.0d) + ((oc9.x(xu0Var.z(), 0L, jG) / dG) * 0.03d) + (((d4 / 4096.0d) / dG) * 0.25d) + (((d3 / 4096.0d) / dG) * 0.35d) + ((oc9.x(xu0Var.s(), 0L, jG) / dG) * 0.08d) + ((((jT >= 0 ? jT : 0L) / 1024.0d) / dG) * 0.85d) + (((d5 / 512.0d) / dG) * 1.2d);
    }

    public static v64 b(String str, String str2) {
        wh0 wh0Var = new wh0(str, str2);
        u64 u64VarB = v64.b(wh0.class);
        u64VarB.e = 1;
        u64VarB.f = new s63(6, wh0Var);
        return u64VarB.b();
    }

    /* JADX WARN: Code duplicated, block: B:337:0x03a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static yhc c(fka fkaVar) {
        int iU;
        String strX;
        int iJ;
        int i = 1;
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
        String strX2 = null;
        String strX3 = null;
        Long lValueOf = null;
        Long lValueOf2 = null;
        String strX4 = null;
        u8b u8bVar = null;
        int i2 = 0;
        long jT = -1;
        long jT2 = -1;
        while (i2 < iU) {
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
                    if (iD2 != i) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th3;
                }
                strX = null;
            }
            if (strX != null) {
                try {
                    long jT3 = 0;
                    switch (strX.hashCode()) {
                        case -1724546052:
                            if (!strX.equals("description")) {
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
                                        if (iD3 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th5;
                                    }
                                }
                            } else {
                                try {
                                    strX3 = ch3.X(fkaVar, null);
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
                                        if (iD4 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th7;
                                    }
                                    strX3 = null;
                                }
                            }
                            break;
                        case -295931082:
                            if (!strX.equals("updateTime")) {
                                fkaVar.x();
                            } else {
                                try {
                                    jT2 = ch3.T(fkaVar, -1L);
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
                                        if (iD5 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th9;
                                    }
                                    jT2 = -1;
                                }
                            }
                            break;
                        case 3355:
                            if (!strX.equals("id")) {
                                fkaVar.x();
                            } else {
                                try {
                                    jT = ch3.T(fkaVar, -1L);
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
                                        if (iD6 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th11;
                                    }
                                    jT = -1;
                                }
                            }
                            break;
                        case 3373707:
                            if (!strX.equals(SdkMetricStatEvent.NAME_KEY)) {
                                fkaVar.x();
                            } else {
                                try {
                                    strX2 = ch3.X(fkaVar, null);
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
                                        if (iD7 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th13;
                                    }
                                    strX2 = null;
                                }
                            }
                            break;
                        case 102977465:
                            if (strX.equals("links")) {
                                u8b u8bVar2 = cqb.b;
                                try {
                                    if (fkaVar.y().a() == 7) {
                                        try {
                                            iJ = ch3.J(fkaVar);
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
                                                if (iD8 != i) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th15;
                                            }
                                            iJ = 0;
                                        }
                                        u8b u8bVar3 = new u8b(iJ);
                                        for (int i3 = 0; i3 < iJ; i3++) {
                                            rhc.Companion.getClass();
                                            rhc rhcVarA = qhc.a(fkaVar);
                                            if (rhcVarA != null) {
                                                u8bVar3.b(rhcVarA);
                                            }
                                        }
                                        u8bVar2 = u8bVar3;
                                    } else {
                                        fkaVar.x();
                                    }
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
                                        if (iD9 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th17;
                                    }
                                }
                                u8bVar = u8bVar2;
                            } else {
                                fkaVar.x();
                            }
                            break;
                        case 1175162725:
                            if (strX.equals("parentId")) {
                                try {
                                    jT3 = ch3.T(fkaVar, 0L);
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
                                        if (iD10 != i) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th19;
                                    }
                                }
                                lValueOf = Long.valueOf(jT3);
                            } else {
                                fkaVar.x();
                            }
                            break;
                        case 1638765110:
                            if (!strX.equals("iconUrl")) {
                                fkaVar.x();
                            } else {
                                try {
                                    strX4 = ch3.X(fkaVar, null);
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
                                        if (iD11 != i) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th21;
                                    }
                                    strX4 = null;
                                }
                            }
                            break;
                        case 1719297603:
                            if (strX.equals("folderTemplateId")) {
                                try {
                                    jT3 = ch3.T(fkaVar, 0L);
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
                                        if (iD12 != i) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th23;
                                    }
                                }
                                lValueOf2 = Long.valueOf(jT3);
                            } else {
                                fkaVar.x();
                            }
                            break;
                        default:
                            fkaVar.x();
                            break;
                    }
                } catch (Throwable th25) {
                    try {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th25);
                        Iterator it13 = fjf.a.iterator();
                        while (it13.hasNext()) {
                            AccountInitializer accountInitializer13 = ((n6) it13.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th25);
                                accountInitializer13.d().i().g().a(null, th25);
                            } catch (Throwable th26) {
                                gm0.V("Payload", "failed to collect exception", th26);
                            }
                        }
                        int iD13 = qt4.D(pye.a);
                        if (iD13 != 0) {
                            if (iD13 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th25;
                        }
                    } catch (Throwable th27) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th27);
                        Iterator it14 = fjf.a.iterator();
                        while (it14.hasNext()) {
                            AccountInitializer accountInitializer14 = ((n6) it14.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th27);
                                accountInitializer14.d().i().g().a(null, th27);
                            } catch (Throwable th28) {
                                gm0.V("Payload", "failed to collect exception", th28);
                            }
                        }
                        int iD14 = qt4.D(pye.a);
                        if (iD14 != 0) {
                            if (iD14 == 1) {
                                throw th27;
                            }
                            ore.o();
                            return null;
                        }
                    }
                }
            }
            i2++;
            i = 1;
        }
        if (jT != -1 && strX2 != null && strX2.length() != 0 && jT2 != -1) {
            if (strX2 == null) {
                strX2 = "";
            }
            return new yhc(jT, strX2, jT2, strX3, lValueOf, lValueOf2, strX4, u8bVar);
        }
        String name = xhc.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "id || name || updateTime is null", null);
            }
        }
        return null;
    }

    public static v64 d(String str, eu6 eu6Var) {
        u64 u64VarB = v64.b(wh0.class);
        u64VarB.e = 1;
        u64VarB.a(ph5.a(Context.class));
        u64VarB.f = new hu(str, 26, eu6Var);
        return u64VarB.b();
    }
}
