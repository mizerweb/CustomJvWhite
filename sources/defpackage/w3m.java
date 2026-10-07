package defpackage;

import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;
import org.apache.commons.logging.LogFactory;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w3m {
    public static final /* synthetic */ int a = 0;

    public static String a(Map map) {
        if (map != null && !map.isEmpty()) {
            String str = null;
            for (Map.Entry entry : map.entrySet()) {
                int iB = b((String) entry.getKey());
                if (iB != 0 && (str == null || iB > b(str))) {
                    str = (String) entry.getKey();
                }
            }
            if (str != null) {
                return (String) map.get(str);
            }
        }
        return null;
    }

    public static int b(String str) {
        if (ch3.r(str) || (!str.startsWith("MP4") && !str.startsWith("mp4"))) {
            return 0;
        }
        try {
            return Integer.parseInt(str.split("_")[1]);
        } catch (Exception e) {
            gm0.V("w3m", "failed to parse mp4 video key: ".concat(str), e);
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:414:0x044e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static ud8 c(fka fkaVar) {
        int iU;
        long j;
        String strX;
        String strX2;
        Byte bO;
        long jT;
        int iR;
        int i = 0;
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
        Integer numValueOf = null;
        ew5 ew5Var = null;
        String strX3 = null;
        Byte bO2 = null;
        String strX4 = null;
        String strX5 = null;
        Byte bO3 = null;
        String str = null;
        Byte b = null;
        Long lValueOf = null;
        String strX6 = null;
        int i2 = 0;
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
                    if (iD2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th3;
                }
                strX = null;
            }
            if (strX != null) {
                try {
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
                                break;
                            } else {
                                try {
                                    strX4 = ch3.X(fkaVar, null);
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
                                    strX4 = null;
                                }
                            }
                            strX2 = str;
                            bO = b;
                            b = bO;
                            str = strX2;
                            break;
                        case -1165461084:
                            if (strX.equals(LogFactory.PRIORITY_KEY)) {
                                try {
                                    bO = ch3.O(fkaVar);
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
                                    bO = null;
                                }
                                strX2 = str;
                                b = bO;
                                str = strX2;
                            }
                            fkaVar.x();
                            strX2 = str;
                            bO = b;
                            b = bO;
                            str = strX2;
                            break;
                        case -934531685:
                            if (!strX.equals("repeat")) {
                                fkaVar.x();
                                break;
                            } else {
                                try {
                                    bO2 = ch3.O(fkaVar);
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
                                    bO2 = null;
                                }
                            }
                            strX2 = str;
                            bO = b;
                            b = bO;
                            str = strX2;
                            break;
                        case 3355:
                            if (strX.equals("id")) {
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
                                bO = b;
                                b = bO;
                                str = strX2;
                            }
                            fkaVar.x();
                            strX2 = str;
                            bO = b;
                            b = bO;
                            str = strX2;
                            break;
                        case 116079:
                            if (!strX.equals(MLFeatureConfigProviderBase.URL_KEY)) {
                                fkaVar.x();
                                break;
                            } else {
                                try {
                                    strX6 = ch3.X(fkaVar, null);
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
                                    strX6 = null;
                                }
                            }
                            strX2 = str;
                            bO = b;
                            b = bO;
                            str = strX2;
                            break;
                        case 3575610:
                            if (!strX.equals("type")) {
                                fkaVar.x();
                                break;
                            } else {
                                try {
                                    bO3 = ch3.O(fkaVar);
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
                                    bO3 = null;
                                }
                            }
                            strX2 = str;
                            bO = b;
                            b = bO;
                            str = strX2;
                            break;
                        case 108403576:
                            if (!strX.equals("rerun")) {
                                fkaVar.x();
                            } else {
                                ghb ghbVar = ew5.b;
                                long jT2 = 0;
                                try {
                                    jT2 = ch3.T(fkaVar, 0L);
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
                                        if (iD10 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th19;
                                    }
                                }
                                ew5Var = new ew5(qe7.P(jT2, lw5.MILLISECONDS));
                            }
                            strX2 = str;
                            bO = b;
                            b = bO;
                            str = strX2;
                            break;
                        case 110371416:
                            if (!strX.equals("title")) {
                                fkaVar.x();
                                break;
                            } else {
                                try {
                                    strX3 = ch3.X(fkaVar, null);
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
                                        if (iD11 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th21;
                                    }
                                    strX3 = null;
                                }
                            }
                            strX2 = str;
                            bO = b;
                            b = bO;
                            str = strX2;
                            break;
                        case 358545279:
                            if (!strX.equals("buttonText")) {
                                fkaVar.x();
                                break;
                            } else {
                                try {
                                    strX5 = ch3.X(fkaVar, null);
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
                                        if (iD12 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th23;
                                    }
                                    strX5 = null;
                                }
                            }
                            strX2 = str;
                            bO = b;
                            b = bO;
                            str = strX2;
                            break;
                        case 1131140152:
                            if (!strX.equals("animojiId")) {
                                fkaVar.x();
                            } else {
                                try {
                                    jT = ch3.T(fkaVar, 0L);
                                } catch (Throwable th25) {
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
                                    jT = 0;
                                }
                                lValueOf = Long.valueOf(jT);
                            }
                            strX2 = str;
                            bO = b;
                            b = bO;
                            str = strX2;
                            break;
                        case 1434631203:
                            if (!strX.equals("settings")) {
                                fkaVar.x();
                            } else {
                                try {
                                    iR = ch3.R(fkaVar, i);
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
                                        if (iD14 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th27;
                                    }
                                    iR = i;
                                }
                                numValueOf = Integer.valueOf(iR);
                            }
                            strX2 = str;
                            bO = b;
                            b = bO;
                            str = strX2;
                            break;
                        default:
                            fkaVar.x();
                            strX2 = str;
                            bO = b;
                            b = bO;
                            str = strX2;
                            break;
                    }
                } catch (Throwable th29) {
                    try {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th29);
                        Iterator it15 = fjf.a.iterator();
                        while (it15.hasNext()) {
                            AccountInitializer accountInitializer15 = ((n6) it15.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th29);
                                accountInitializer15.d().i().g().a(null, th29);
                            } catch (Throwable th30) {
                                gm0.V("Payload", "failed to collect exception", th30);
                            }
                        }
                        int iD15 = qt4.D(pye.a);
                        if (iD15 != 0) {
                            if (iD15 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th29;
                        }
                    } catch (Throwable th31) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th31);
                        Iterator it16 = fjf.a.iterator();
                        while (it16.hasNext()) {
                            AccountInitializer accountInitializer16 = ((n6) it16.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th31);
                                accountInitializer16.d().i().g().a(null, th31);
                            } catch (Throwable th32) {
                                gm0.V("Payload", "failed to collect exception", th32);
                            }
                        }
                        int iD16 = qt4.D(pye.a);
                        if (iD16 != 0) {
                            if (iD16 == 1) {
                                throw th31;
                            }
                            ore.o();
                            return null;
                        }
                    }
                }
            }
            i2++;
            i = 0;
        }
        if (str == null || strX3 == null || b == null) {
            return null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        byte bByteValue = b.byteValue();
        byte bByteValue2 = bO2 != null ? bO2.byteValue() : (byte) 0;
        if (ew5Var != null) {
            j = ew5Var.a;
        } else {
            ghb ghbVar2 = ew5.b;
            j = 0;
        }
        return new ud8(str, strX3, iIntValue, strX4, strX5, bByteValue, bByteValue2, j, lValueOf, strX6, bO3 != null ? bO3.byteValue() : (byte) 0);
    }
}
