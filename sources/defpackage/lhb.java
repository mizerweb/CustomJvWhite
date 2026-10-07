package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes.dex */
public final class lhb implements fu3, sf7, saa, b8h, iri, ff0, cbb {
    public static lhb b;
    public static final lhb c = new lhb(1);
    public static final lhb d = new lhb(2);
    public static final lhb e = new lhb(3);
    public static final lhb f = new lhb(4);
    public static final lhb g = new lhb(5);
    public static final lhb h = new lhb(6);
    public static final lhb i = new lhb(7);
    public static final lhb j = new lhb(8);
    public static final lhb k = new lhb(9);
    public static final ore l = new ore(2);
    public static final lhb m = new lhb(11);
    public static final lhb n = new lhb(12);
    public static final lhb o = new lhb(13);
    public final /* synthetic */ int a;

    public /* synthetic */ lhb(int i2) {
        this.a = i2;
    }

    public static String c(short s) {
        return "0x".concat(Integer.toHexString(s & 65535));
    }

    public static String g(short s) {
        String str = (String) kfc.e.get(Short.valueOf(s));
        return str == null ? nbh.v(p(s), "(0x", Integer.toHexString(s & 65535), ")") : str;
    }

    public static Path k(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(f2, f3);
        path.lineTo(f4, f5);
        return path;
    }

    public static ArrayList o(String str) {
        return new ArrayList(r5h.m1(str, new String[]{","}, 6));
    }

    public static String p(short s) {
        HashMap map = kfc.d;
        Short shValueOf = Short.valueOf(s);
        Object objC = map.get(shValueOf);
        if (objC == null) {
            kfc.c.getClass();
            objC = c(s);
            map.put(shValueOf, objC);
        }
        return (String) objC;
    }

    private final kih q(fka fkaVar) {
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
        Long lValueOf = null;
        String strX2 = null;
        for (int i2 = 0; i2 < iU; i2++) {
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
                    if (strX.equals("botId")) {
                        long jT = -1;
                        try {
                            jT = ch3.T(fkaVar, -1L);
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
                        lValueOf = Long.valueOf(jT);
                    } else if (strX.equals("startParam")) {
                        try {
                            strX2 = ch3.X(fkaVar, null);
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
                            strX2 = null;
                        }
                    } else {
                        try {
                            fkaVar.x();
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
                        }
                    }
                } catch (Throwable th11) {
                    try {
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
            }
        }
        return new ti6(strX2, lValueOf);
    }

    private final kih r(fka fkaVar) {
        int iU;
        String strX;
        int iJ;
        u8b u8bVar = cqb.b;
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
        for (int i2 = 0; i2 < iU; i2++) {
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
                    if (strX.equals("polls")) {
                        u8b u8bVar2 = cqb.b;
                        try {
                            if (fkaVar.y().a() == 7) {
                                try {
                                    iJ = ch3.J(fkaVar);
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
                                    iJ = 0;
                                }
                                u8b u8bVar3 = new u8b(iJ);
                                for (int i3 = 0; i3 < iJ; i3++) {
                                    u8bVar3.b(hjl.a(fkaVar));
                                }
                                u8bVar2 = u8bVar3;
                            } else {
                                fkaVar.x();
                            }
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
                        }
                        u8bVar = u8bVar2;
                    } else {
                        try {
                            fkaVar.x();
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
                        }
                    }
                } catch (Throwable th11) {
                    try {
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
            }
        }
        return new v3b(u8bVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:161:0x0251 A[Catch: all -> 0x00b0, TRY_LEAVE, TryCatch #7 {all -> 0x00b0, blocks: (B:158:0x0242, B:159:0x024b, B:161:0x0251, B:165:0x026d, B:166:0x0271, B:170:0x027c, B:171:0x0281, B:172:0x0282, B:31:0x0071, B:32:0x007a, B:34:0x0080, B:38:0x009c, B:39:0x00a0, B:42:0x00aa, B:43:0x00af, B:46:0x00b4, B:162:0x0259, B:27:0x006a, B:35:0x0088), top: B:213:0x0242, inners: #5, #6, #12 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x027c A[Catch: all -> 0x00b0, TryCatch #7 {all -> 0x00b0, blocks: (B:158:0x0242, B:159:0x024b, B:161:0x0251, B:165:0x026d, B:166:0x0271, B:170:0x027c, B:171:0x0281, B:172:0x0282, B:31:0x0071, B:32:0x007a, B:34:0x0080, B:38:0x009c, B:39:0x00a0, B:42:0x00aa, B:43:0x00af, B:46:0x00b4, B:162:0x0259, B:27:0x006a, B:35:0x0088), top: B:213:0x0242, inners: #5, #6, #12 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x0282 A[Catch: all -> 0x00b0, TRY_LEAVE, TryCatch #7 {all -> 0x00b0, blocks: (B:158:0x0242, B:159:0x024b, B:161:0x0251, B:165:0x026d, B:166:0x0271, B:170:0x027c, B:171:0x0281, B:172:0x0282, B:31:0x0071, B:32:0x007a, B:34:0x0080, B:38:0x009c, B:39:0x00a0, B:42:0x00aa, B:43:0x00af, B:46:0x00b4, B:162:0x0259, B:27:0x006a, B:35:0x0088), top: B:213:0x0242, inners: #5, #6, #12 }] */
    /* JADX WARN: Code duplicated, block: B:216:0x01ac A[EXC_TOP_SPLITTER, PHI: r12
  0x01ac: PHI (r12v13 int) = (r12v7 int), (r12v8 int), (r12v14 int) binds: [B:116:0x01aa, B:92:0x0151, B:51:0x00bf] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00bf  */
    private final kih s(fka fkaVar) {
        int iU;
        List listA;
        wib wibVarA;
        long[] jArrC;
        long jT;
        long jT2;
        r66 r66Var;
        String strX;
        int i2;
        Throwable th;
        Iterator it;
        int iD;
        String strX2;
        if (!fkaVar.l()) {
            return null;
        }
        int i3 = 0;
        int i4 = 1;
        try {
            iU = ch3.U(fkaVar);
            while (true) {
                r66Var = r66.a;
                if (i3 < iU) {
                    try {
                        strX = ch3.X(fkaVar, null);
                    } catch (Throwable th2) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                        Iterator it2 = fjf.a.iterator();
                        while (it2.hasNext()) {
                            AccountInitializer accountInitializer = ((n6) it2.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th2);
                                accountInitializer.d().i().g().a(null, th2);
                            } catch (Throwable th3) {
                                gm0.V("Payload", "failed to collect exception", th3);
                            }
                        }
                        int iD2 = qt4.D(pye.a);
                        if (iD2 != 0) {
                            if (iD2 != i4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th2;
                        }
                        strX = null;
                    }
                    if (strX != null) {
                        try {
                            switch (strX.hashCode()) {
                                case -1422950858:
                                    i2 = iU;
                                    if (strX.equals("action")) {
                                        try {
                                            strX2 = ch3.X(fkaVar, null);
                                        } catch (Throwable th4) {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                                            Iterator it3 = fjf.a.iterator();
                                            while (it3.hasNext()) {
                                                AccountInitializer accountInitializer2 = ((n6) it3.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th4);
                                                    accountInitializer2.d().i().g().a(null, th4);
                                                } catch (Throwable th5) {
                                                    gm0.V("Payload", "failed to collect exception", th5);
                                                }
                                            }
                                            int iD3 = qt4.D(pye.a);
                                            if (iD3 != 0) {
                                                if (iD3 != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th4;
                                            }
                                            strX2 = null;
                                        }
                                        wibVarA = cxk.a(strX2);
                                    } else {
                                        try {
                                            fkaVar.x();
                                        } catch (Throwable th6) {
                                            try {
                                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                                                Iterator it4 = fjf.a.iterator();
                                                while (it4.hasNext()) {
                                                    AccountInitializer accountInitializer3 = ((n6) it4.next()).a;
                                                    try {
                                                        gm0.V("Payload", "error while parse payload", th6);
                                                        accountInitializer3.d().i().g().a(null, th6);
                                                    } catch (Throwable th7) {
                                                        gm0.V("Payload", "failed to collect exception", th7);
                                                    }
                                                }
                                                int iD4 = qt4.D(pye.a);
                                                if (iD4 != 0) {
                                                    if (iD4 != 1) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    throw th6;
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                                th = th;
                                                try {
                                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                                    it = fjf.a.iterator();
                                                    while (it.hasNext()) {
                                                        AccountInitializer accountInitializer4 = ((n6) it.next()).a;
                                                        try {
                                                            gm0.V("Payload", "error while parse payload", th);
                                                            accountInitializer4.d().i().g().a(null, th);
                                                        } catch (Throwable th9) {
                                                            gm0.V("Payload", "failed to collect exception", th9);
                                                        }
                                                    }
                                                    iD = qt4.D(pye.a);
                                                    if (iD != 0) {
                                                        if (iD != 1) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        throw th;
                                                    }
                                                    i3++;
                                                    iU = i2;
                                                    i4 = 1;
                                                } catch (Throwable th10) {
                                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th10);
                                                    Iterator it5 = fjf.a.iterator();
                                                    while (it5.hasNext()) {
                                                        AccountInitializer accountInitializer5 = ((n6) it5.next()).a;
                                                        try {
                                                            gm0.V("Payload", "error while parse payload", th10);
                                                            accountInitializer5.d().i().g().a(null, th10);
                                                        } catch (Throwable th11) {
                                                            gm0.V("Payload", "failed to collect exception", th11);
                                                        }
                                                    }
                                                    int iD5 = qt4.D(pye.a);
                                                    if (iD5 != 0) {
                                                        if (iD5 == 1) {
                                                            throw th10;
                                                        }
                                                        ore.o();
                                                        return null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case -1417629679:
                                    i2 = iU;
                                    if (!strX.equals("callHistorySync")) {
                                        fkaVar.x();
                                    } else {
                                        try {
                                            jT = ch3.T(fkaVar, 0L);
                                        } catch (Throwable th12) {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th12);
                                            Iterator it6 = fjf.a.iterator();
                                            while (it6.hasNext()) {
                                                AccountInitializer accountInitializer6 = ((n6) it6.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th12);
                                                    accountInitializer6.d().i().g().a(null, th12);
                                                } catch (Throwable th13) {
                                                    gm0.V("Payload", "failed to collect exception", th13);
                                                }
                                            }
                                            int iD6 = qt4.D(pye.a);
                                            if (iD6 != 0) {
                                                if (iD6 != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th12;
                                            }
                                            jT = 0;
                                        }
                                    }
                                    break;
                                case -1076512418:
                                    if (!strX.equals("prevCallHistorySync")) {
                                        i2 = iU;
                                        fkaVar.x();
                                    } else {
                                        i2 = iU;
                                        try {
                                            jT2 = ch3.T(fkaVar, 0L);
                                        } catch (Throwable th14) {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th14);
                                            Iterator it7 = fjf.a.iterator();
                                            while (it7.hasNext()) {
                                                AccountInitializer accountInitializer7 = ((n6) it7.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th14);
                                                    accountInitializer7.d().i().g().a(null, th14);
                                                } catch (Throwable th15) {
                                                    gm0.V("Payload", "failed to collect exception", th15);
                                                }
                                            }
                                            int iD7 = qt4.D(pye.a);
                                            if (iD7 != 0) {
                                                if (iD7 != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th14;
                                            }
                                            jT2 = 0;
                                        }
                                    }
                                    break;
                                case -1006239478:
                                    if (!strX.equals("callHistoryItems")) {
                                        i2 = iU;
                                        fkaVar.x();
                                    } else {
                                        listA = fjf.a(fkaVar, r66Var, new fz7());
                                        i2 = iU;
                                    }
                                    break;
                                case 1951007108:
                                    try {
                                        if (!strX.equals("historyIds")) {
                                            i2 = iU;
                                            fkaVar.x();
                                        } else {
                                            jArrC = fjf.c(fkaVar);
                                            i2 = iU;
                                        }
                                    } catch (Throwable th16) {
                                        th = th16;
                                        i2 = iU;
                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                        it = fjf.a.iterator();
                                        while (it.hasNext()) {
                                            AccountInitializer accountInitializer8 = ((n6) it.next()).a;
                                            gm0.V("Payload", "error while parse payload", th);
                                            accountInitializer8.d().i().g().a(null, th);
                                        }
                                        iD = qt4.D(pye.a);
                                        if (iD != 0) {
                                            if (iD != 1) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            throw th;
                                        }
                                    }
                                    break;
                                default:
                                    i2 = iU;
                                    fkaVar.x();
                                    break;
                            }
                        } catch (Throwable th17) {
                            th = th17;
                            i2 = iU;
                        }
                    } else {
                        i2 = iU;
                    }
                    i3++;
                    iU = i2;
                    i4 = 1;
                }
            }
        } catch (Throwable th18) {
            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th18);
            Iterator it8 = fjf.a.iterator();
            while (it8.hasNext()) {
                AccountInitializer accountInitializer9 = ((n6) it8.next()).a;
                try {
                    gm0.V("Payload", "error while parse payload", th18);
                    accountInitializer9.d().i().g().a(null, th18);
                } catch (Throwable th19) {
                    gm0.V("Payload", "failed to collect exception", th19);
                }
            }
            int iD8 = qt4.D(pye.a);
            if (iD8 != 0) {
                if (iD8 == 1) {
                    throw th18;
                }
                ore.o();
                return null;
            }
            iU = 0;
        }
        listA = null;
        wibVarA = null;
        jArrC = null;
        jT = 0;
        jT2 = 0;
        if (wibVarA == null) {
            return null;
        }
        List list = listA;
        if (list == null) {
            list = r66Var;
        }
        if (jArrC == null) {
            jArrC = yl2.a;
        }
        return new xib(jT, jT2, wibVarA, list, jArrC);
    }

    private final kih t(fka fkaVar) {
        int iU;
        String strX;
        int iJ;
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
        u8b u8bVar = null;
        for (int i2 = 0; i2 < iU; i2++) {
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
                    if (strX.equals("media")) {
                        u8b u8bVar2 = cqb.b;
                        try {
                            if (fkaVar.y().a() == 7) {
                                try {
                                    iJ = ch3.J(fkaVar);
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
                                    iJ = 0;
                                }
                                u8b u8bVar3 = new u8b(iJ);
                                for (int i3 = 0; i3 < iJ; i3++) {
                                    u8bVar3.b(l40.b(fkaVar));
                                }
                                u8bVar2 = u8bVar3;
                            } else {
                                fkaVar.x();
                            }
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
                        }
                        u8bVar = u8bVar2;
                    } else {
                        try {
                            fkaVar.x();
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
                        }
                    }
                } catch (Throwable th11) {
                    try {
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
            }
        }
        if (u8bVar != null) {
            return new yvc(u8bVar);
        }
        return null;
    }

    private final kih u(fka fkaVar) {
        int iU;
        String strX;
        int iJ;
        if (!fkaVar.l()) {
            return null;
        }
        u8b u8bVar = cqb.b;
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
        for (int i2 = 0; i2 < iU; i2++) {
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
                    if (strX.equals("storiesPreviews")) {
                        u8b u8bVar2 = cqb.b;
                        try {
                            if (fkaVar.y().a() == 7) {
                                try {
                                    iJ = ch3.J(fkaVar);
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
                                    iJ = 0;
                                }
                                u8b u8bVar3 = new u8b(iJ);
                                for (int i3 = 0; i3 < iJ; i3++) {
                                    ysg ysgVarG = xsg.g(fkaVar);
                                    if (ysgVarG != null) {
                                        u8bVar3.b(ysgVarG);
                                    }
                                }
                                u8bVar2 = u8bVar3;
                            } else {
                                fkaVar.x();
                            }
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
                        }
                        u8bVar = u8bVar2;
                    } else {
                        try {
                            fkaVar.x();
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
                        }
                    }
                } catch (Throwable th11) {
                    try {
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
            }
        }
        return new csg(u8bVar);
    }

    @Override // defpackage.b8h
    public boolean a(b87 b87Var) {
        String str = b87Var.n;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        return (vd6) m94.o.getValue();
    }

    @Override // defpackage.ff0
    public void b(id7 id7Var) {
        id7Var.I("DELETE FROM phones");
    }

    @Override // defpackage.iri
    public int d(Object obj) {
        return ((cba) obj).I();
    }

    @Override // defpackage.cbb
    public void e(String str, Throwable th) {
        gm0.V("Webm", str, th);
    }

    @Override // defpackage.cbb
    public void h(Throwable th) {
        gm0.V("Webm", "fail!", th);
    }

    @Override // defpackage.fu3
    public kih i(fka fkaVar) {
        int iU;
        String strX;
        Integer numValueOf;
        String strX2;
        int iU2;
        String strX3;
        int iU3;
        String strX4;
        int i2 = 0;
        switch (this.a) {
            case 1:
                if (!fkaVar.l()) {
                    return null;
                }
                mw mwVar = new mw(0);
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
                int i3 = 0;
                ujd ujdVarP = null;
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
                            if (iD2 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th3;
                        }
                        strX = null;
                    }
                    if (strX != null) {
                        try {
                            if (strX.equals("tokenAttrs")) {
                                try {
                                    numValueOf = Integer.valueOf(ch3.U(fkaVar));
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
                                    numValueOf = null;
                                }
                                if (numValueOf != null) {
                                    int iIntValue = numValueOf.intValue();
                                    for (int i4 = i2; i4 < iIntValue; i4++) {
                                        try {
                                            strX2 = ch3.X(fkaVar, null);
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
                                            strX2 = null;
                                        }
                                        if (strX2 != null) {
                                            mwVar.put(strX2, cxk.b(fkaVar).a());
                                        }
                                    }
                                } else {
                                    continue;
                                }
                                break;
                            } else if (strX.equals("profile")) {
                                ujdVarP = f55.p(fkaVar);
                            } else {
                                try {
                                    fkaVar.x();
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
                                }
                            }
                        } catch (Throwable th11) {
                            try {
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
                                i3++;
                                i2 = 0;
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
                    }
                    i3++;
                    i2 = 0;
                    break;
                }
                return new sd0(mwVar, ujdVarP);
            case 2:
                if (!fkaVar.l()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                try {
                    iU2 = ch3.U(fkaVar);
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
                    iU2 = 0;
                }
                for (int i5 = 0; i5 < iU2; i5++) {
                    try {
                        strX3 = ch3.X(fkaVar, null);
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
                        strX3 = null;
                    }
                    if (strX3 != null) {
                        try {
                            if (strX3.equals("chatReactionsSettings")) {
                                int iJ = ch3.J(fkaVar);
                                for (int i6 = 0; i6 < iJ; i6++) {
                                    arrayList.add(np4.v(fkaVar));
                                }
                            } else {
                                try {
                                    fkaVar.x();
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
                            }
                        } catch (Throwable th21) {
                            try {
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
                            }
                        }
                    }
                    break;
                }
                return new xy2(arrayList);
            case 3:
            case 4:
            case 6:
            case 10:
            default:
                if (!fkaVar.l()) {
                    return null;
                }
                try {
                    iU3 = ch3.U(fkaVar);
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
                        if (iD13 == 1) {
                            throw th25;
                        }
                        ore.o();
                        return null;
                    }
                    iU3 = 0;
                }
                if (iU3 == 0) {
                    return null;
                }
                String strX5 = null;
                String strX6 = null;
                while (i2 < iU3) {
                    try {
                        strX4 = ch3.X(fkaVar, null);
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
                        strX4 = null;
                    }
                    if (strX4 != null) {
                        if (strX4.equals(MLFeatureConfigProviderBase.URL_KEY)) {
                            try {
                                strX5 = ch3.X(fkaVar, null);
                            } catch (Throwable th29) {
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
                                    if (iD15 == 1) {
                                        throw th29;
                                    }
                                    ore.o();
                                    return null;
                                }
                                strX5 = null;
                            }
                        } else if (strX4.equals("query_id")) {
                            try {
                                strX6 = ch3.X(fkaVar, null);
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
                                strX6 = null;
                            }
                        } else {
                            try {
                                fkaVar.x();
                            } catch (Throwable th33) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th33);
                                Iterator it17 = fjf.a.iterator();
                                while (it17.hasNext()) {
                                    AccountInitializer accountInitializer17 = ((n6) it17.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th33);
                                        accountInitializer17.d().i().g().a(null, th33);
                                    } catch (Throwable th34) {
                                        gm0.V("Payload", "failed to collect exception", th34);
                                    }
                                }
                                int iD17 = qt4.D(pye.a);
                                if (iD17 != 0) {
                                    if (iD17 == 1) {
                                        throw th33;
                                    }
                                    ore.o();
                                    return null;
                                }
                            }
                        }
                    }
                    i2++;
                    break;
                }
                return new zjj(strX5, strX6);
            case 5:
                return q(fkaVar);
            case 7:
                return r(fkaVar);
            case 8:
                return s(fkaVar);
            case 9:
                return t(fkaVar);
            case 11:
                return u(fkaVar);
        }
    }

    @Override // defpackage.saa
    public double j(qba qbaVar) {
        int iOrdinal = qbaVar.ordinal();
        if (iOrdinal == 0) {
            return qba.OnCloseToDalvikHeapLimit.a();
        }
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 5) {
            return 1.0d;
        }
        pj6.m("BitmapMemoryCacheTrimStrategy", "unknown trim type: %s", qbaVar);
        return 0.0d;
    }

    @Override // defpackage.cbb
    public void l(String str) {
        gm0.n("Webm", str);
    }

    @Override // defpackage.b8h
    public d8h m(b87 b87Var) {
        String str = b87Var.n;
        List list = b87Var.q;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new tw5(list);
                case "application/pgs":
                    return new ljf(26);
                case "application/x-mp4-vtt":
                    return new x2b();
                case "text/vtt":
                    return new ewe(12);
                case "application/x-quicktime-tx3g":
                    return new c9i(list);
                case "text/x-ssa":
                    return new rfg(list);
                case "application/vobsub":
                    return new xde(list);
                case "application/x-subrip":
                    return new k7h();
                case "application/ttml+xml":
                    return new q5i();
            }
        }
        ore.p(qv1.k("Unsupported MIME type: ", str));
        return null;
    }

    @Override // defpackage.b8h
    public int n(b87 b87Var) {
        String str = b87Var.n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        ore.p(qv1.k("Unsupported MIME type: ", str));
        return 0;
    }
}
