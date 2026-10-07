package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.net.TrafficStats;
import android.view.View;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.concurrent.SingleCoreFeature$ToggleService;
import one.me.android.initialization.AccountInitializer;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tracer.nativebridge.NativeBridge;

/* JADX INFO: loaded from: classes.dex */
public final class a8g implements m74, fu3, NativeBridge, pe7, saa, aw4, k0g {
    public static boolean c;
    public static volatile fbc g;
    public static Context i;
    public final /* synthetic */ int a;
    public static final a8g b = new a8g(0);
    public static final a8g d = new a8g(1);
    public static final a8g e = new a8g(2);
    public static final a8g f = new a8g(3);
    public static final a8g h = new a8g(5);
    public static final a8g j = new a8g(6);
    public static final a8g k = new a8g(7);
    public static final a8g l = new a8g(8);
    public static final a8g m = new a8g(9);
    public static final a8g n = new a8g(11);
    public static final a8g o = new a8g(12);
    public static final a8g p = new a8g(13);

    public /* synthetic */ a8g(int i2) {
        this.a = i2;
    }

    public static final void b(HttpURLConnection httpURLConnection, int i2) {
        int i3 = glh.c;
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        if (i2 != -1) {
            TrafficStats.setThreadStatsTag(i2);
        }
        try {
            try {
                try {
                    try {
                        httpURLConnection.connect();
                        if (i2 != -1) {
                            TrafficStats.setThreadStatsTag(threadStatsTag);
                        }
                    } catch (NullPointerException e2) {
                        throw e2;
                    }
                } catch (IllegalArgumentException e3) {
                    throw e3;
                }
            } catch (SecurityException e4) {
                Throwable cause = e4.getCause();
                if (cause == null) {
                    throw e4;
                }
                String name = cause.getClass().getName();
                if (!name.equals("libcore.io.GaiException") && !name.equals("android.system.GaiException")) {
                    throw e4;
                }
                throw new UnknownHostException();
            }
        } catch (Throwable th) {
            if (i2 != -1) {
                TrafficStats.setThreadStatsTag(threadStatsTag);
            }
            throw th;
        }
    }

    public static int m(HttpURLConnection httpURLConnection) throws IOException {
        try {
            return httpURLConnection.getResponseCode();
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new IOException(e2);
        } catch (NullPointerException e3) {
            String message = e3.getMessage();
            if (message == null || !z5h.K0(message, "Attempt to read from field 'int com.android.okhttp.okio.Segment.limit'", false)) {
                throw e3;
            }
            throw new IOException(e3);
        }
    }

    public static boolean n(ste steVar) {
        String str = steVar.b;
        fbc fbcVar = g;
        if (fbcVar == null) {
            ore.k("Tracer settings are not initialized.");
            return false;
        }
        if (gol.a(fbcVar, "system.shutdown.until.ts")) {
            return true;
        }
        StringBuilder sb = new StringBuilder("system.");
        sb.append(str);
        sb.append(".shutdown.until.ts");
        return gol.a(fbcVar, sb.toString());
    }

    private final kih o(fka fkaVar) {
        int iU;
        String strX;
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
                    if (strX.equals("folderSync")) {
                        lValueOf = Long.valueOf(fkaVar.I0());
                    } else {
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
                    }
                } catch (Throwable th7) {
                    try {
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
            }
        }
        if (lValueOf != null) {
            return new i67(lValueOf.longValue());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:212:0x0329  */
    /* JADX WARN: Code duplicated, block: B:221:0x0355  */
    /* JADX WARN: Code duplicated, block: B:223:0x035a  */
    /* JADX WARN: Code duplicated, block: B:224:0x035b  */
    /* JADX WARN: Code duplicated, block: B:51:0x00df A[PHI: r34
  0x00df: PHI (r34v33 int) = 
  (r34v2 int)
  (r34v3 int)
  (r34v4 int)
  (r34v5 int)
  (r34v6 int)
  (r34v7 int)
  (r34v8 int)
  (r34v9 int)
  (r34v10 int)
  (r34v11 int)
  (r34v34 int)
 binds: [B:437:0x06d7, B:433:0x06c5, B:412:0x066a, B:343:0x0561, B:322:0x0505, B:300:0x04a8, B:278:0x044b, B:272:0x042f, B:251:0x03d7, B:228:0x037b, B:50:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:600:0x0352 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v195, types: [iv4] */
    /* JADX WARN: Type inference failed for: r0v214, types: [iv4] */
    /* JADX WARN: Type inference failed for: r0v25, types: [iv4] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v308 */
    /* JADX WARN: Type inference failed for: r33v1 */
    /* JADX WARN: Type inference failed for: r33v12 */
    /* JADX WARN: Type inference failed for: r33v13 */
    /* JADX WARN: Type inference failed for: r33v15 */
    /* JADX WARN: Type inference failed for: r33v16 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.String, kih] */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v28 */
    private final kih p(fka fkaVar) throws Throwable {
        int iU;
        ?? X;
        int i2;
        int i3;
        ?? r33;
        int iU2;
        long jT;
        int i4;
        RandomAccess randomAccessA;
        int i5;
        int iU3;
        ?? r9;
        Throwable th;
        String strX;
        Iterator it;
        int iD;
        long jNanoTime = System.nanoTime();
        ?? r7 = 0;
        if (!fkaVar.l()) {
            return null;
        }
        int i6 = 1;
        try {
            iU = ch3.U(fkaVar);
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
                if (iD2 == 1) {
                    throw th2;
                }
                ore.o();
                return null;
            }
            iU = 0;
        }
        if (iU == 0) {
            return null;
        }
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        r66 r66Var = r66.a;
        ia4 ia4VarF = null;
        ff9 ff9Var = null;
        ujd ujdVarP = null;
        String strX2 = null;
        List listB = r66Var;
        List listC = listB;
        int i7 = 0;
        long jT2 = 0;
        int iR = 0;
        long jT3 = 0;
        boolean zBooleanValue = false;
        while (i7 < iU) {
            try {
                X = ch3.X(fkaVar, r7);
            } catch (Throwable th4) {
                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                Iterator it3 = fjf.a.iterator();
                while (it3.hasNext()) {
                    AccountInitializer accountInitializer2 = ((n6) it3.next()).a;
                    try {
                        gm0.V("Payload", "error while parse payload", th4);
                        accountInitializer2.d().i().g().a(r7, th4);
                    } catch (Throwable th5) {
                        gm0.V("Payload", "failed to collect exception", th5);
                    }
                }
                int iD3 = qt4.D(pye.a);
                if (iD3 != 0) {
                    if (iD3 == i6) {
                        throw th4;
                    }
                    ore.o();
                    return r7;
                }
                X = r7;
            }
            if (X != 0) {
                switch (X.hashCode()) {
                    case -1900708191:
                        i2 = i7;
                        if (X.equals("videoChatHistory")) {
                            Boolean boolValueOf = Boolean.FALSE;
                            try {
                                boolValueOf = Boolean.valueOf(ch3.L(fkaVar));
                            } catch (Throwable th6) {
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
                                    if (iD4 == 1) {
                                        throw th6;
                                    }
                                    ore.o();
                                    return null;
                                }
                            }
                            i3 = 1;
                            r33 = 0;
                            zBooleanValue = boolValueOf.booleanValue();
                        } else {
                            try {
                                fkaVar.x();
                            } catch (Throwable th8) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th8);
                                Iterator it5 = fjf.a.iterator();
                                while (it5.hasNext()) {
                                    AccountInitializer accountInitializer4 = ((n6) it5.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th8);
                                        accountInitializer4.d().i().g().a(null, th8);
                                    } catch (Throwable th9) {
                                        gm0.V("Payload", "failed to collect exception", th9);
                                    }
                                }
                                int iD5 = qt4.D(pye.a);
                                if (iD5 != 0) {
                                    if (iD5 == 1) {
                                        throw th8;
                                    }
                                    ore.o();
                                    return null;
                                }
                            }
                            i3 = 1;
                            r33 = 0;
                        }
                        break;
                    case -1849019982:
                        i2 = i7;
                        if (!X.equals("chatMarker")) {
                            fkaVar.x();
                            break;
                        } else {
                            try {
                                jT3 = ch3.T(fkaVar, 0L);
                            } catch (Throwable th10) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th10);
                                Iterator it6 = fjf.a.iterator();
                                while (it6.hasNext()) {
                                    AccountInitializer accountInitializer5 = ((n6) it6.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th10);
                                        accountInitializer5.d().i().g().a(null, th10);
                                    } catch (Throwable th11) {
                                        gm0.V("Payload", "failed to collect exception", th11);
                                    }
                                }
                                int iD6 = qt4.D(pye.a);
                                if (iD6 != 0) {
                                    if (iD6 == 1) {
                                        throw th10;
                                    }
                                    ore.o();
                                    return null;
                                }
                                jT3 = 0;
                            }
                        }
                        i3 = 1;
                        r33 = 0;
                        break;
                    case -1354792126:
                        i2 = i7;
                        if (!X.equals("config")) {
                            fkaVar.x();
                        } else {
                            ia4VarF = gm0.F(fkaVar);
                        }
                        i3 = 1;
                        r33 = 0;
                        break;
                    case -567451565:
                        i2 = i7;
                        if (!X.equals("contacts")) {
                            fkaVar.x();
                            break;
                        } else {
                            try {
                                listC = b50.c(fkaVar);
                            } catch (Throwable th12) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th12);
                                Iterator it7 = fjf.a.iterator();
                                while (it7.hasNext()) {
                                    AccountInitializer accountInitializer6 = ((n6) it7.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th12);
                                        accountInitializer6.d().i().g().a(null, th12);
                                    } catch (Throwable th13) {
                                        gm0.V("Payload", "failed to collect exception", th13);
                                    }
                                }
                                int iD7 = qt4.D(pye.a);
                                if (iD7 != 0) {
                                    if (iD7 == 1) {
                                        throw th12;
                                    }
                                    ore.o();
                                    return null;
                                }
                                listC = r66Var;
                            }
                        }
                        i3 = 1;
                        r33 = 0;
                        break;
                    case -462094004:
                        i2 = i7;
                        if (!X.equals("messages")) {
                            fkaVar.x();
                        } else {
                            try {
                                iU2 = ch3.U(fkaVar);
                            } catch (Throwable th14) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th14);
                                Iterator it8 = fjf.a.iterator();
                                while (it8.hasNext()) {
                                    AccountInitializer accountInitializer7 = ((n6) it8.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th14);
                                        accountInitializer7.d().i().g().a(null, th14);
                                    } catch (Throwable th15) {
                                        gm0.V("Payload", "failed to collect exception", th15);
                                    }
                                }
                                int iD8 = qt4.D(pye.a);
                                if (iD8 != 0) {
                                    if (iD8 == 1) {
                                        throw th14;
                                    }
                                    ore.o();
                                    return null;
                                }
                                iU2 = 0;
                            }
                            int i8 = 0;
                            while (i8 < iU2) {
                                try {
                                    jT = ch3.T(fkaVar, 0L);
                                } catch (Throwable th16) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th16);
                                    Iterator it9 = fjf.a.iterator();
                                    while (it9.hasNext()) {
                                        AccountInitializer accountInitializer8 = ((n6) it9.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th16);
                                            accountInitializer8.d().i().g().a(null, th16);
                                        } catch (Throwable th17) {
                                            gm0.V("Payload", "failed to collect exception", th17);
                                        }
                                    }
                                    int iD9 = qt4.D(pye.a);
                                    if (iD9 != 0) {
                                        if (iD9 == 1) {
                                            throw th16;
                                        }
                                        ore.o();
                                        return null;
                                    }
                                    jT = 0;
                                }
                                Long lValueOf = Long.valueOf(jT);
                                try {
                                    randomAccessA = hm4.a(fkaVar);
                                    i4 = iU2;
                                } catch (Throwable th18) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th18);
                                    Iterator it10 = fjf.a.iterator();
                                    while (it10.hasNext()) {
                                        AccountInitializer accountInitializer9 = ((n6) it10.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th18);
                                            i5 = iU2;
                                            try {
                                                accountInitializer9.d().i().g().a(null, th18);
                                            } catch (Throwable th19) {
                                                th = th19;
                                                gm0.V("Payload", "failed to collect exception", th);
                                                iU2 = i5;
                                            }
                                        } catch (Throwable th20) {
                                            th = th20;
                                            i5 = iU2;
                                        }
                                        iU2 = i5;
                                    }
                                    i4 = iU2;
                                    int iD10 = qt4.D(pye.a);
                                    if (iD10 != 0) {
                                        if (iD10 == 1) {
                                            throw th18;
                                        }
                                        ore.o();
                                        return null;
                                    }
                                    randomAccessA = r66Var;
                                }
                                map.put(lValueOf, randomAccessA);
                                i8++;
                                iU2 = i4;
                            }
                        }
                        i3 = 1;
                        r33 = 0;
                        break;
                    case -309425751:
                        i2 = i7;
                        if (!X.equals("profile")) {
                            fkaVar.x();
                            break;
                        } else {
                            try {
                                ujdVarP = f55.p(fkaVar);
                            } catch (Throwable th21) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th21);
                                Iterator it11 = fjf.a.iterator();
                                while (it11.hasNext()) {
                                    AccountInitializer accountInitializer10 = ((n6) it11.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th21);
                                        accountInitializer10.d().i().g().a(null, th21);
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
                                ujdVarP = null;
                            }
                        }
                        i3 = 1;
                        r33 = 0;
                        break;
                    case -234430262:
                        i2 = i7;
                        if (!X.equals("updates")) {
                            fkaVar.x();
                            break;
                        } else {
                            try {
                                iR = ch3.R(fkaVar, 0);
                            } catch (Throwable th23) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th23);
                                Iterator it12 = fjf.a.iterator();
                                while (it12.hasNext()) {
                                    AccountInitializer accountInitializer11 = ((n6) it12.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th23);
                                        accountInitializer11.d().i().g().a(null, th23);
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
                                iR = 0;
                            }
                        }
                        i3 = 1;
                        r33 = 0;
                        break;
                    case 3560141:
                        i2 = i7;
                        if (!X.equals("time")) {
                            fkaVar.x();
                            break;
                        } else {
                            try {
                                jT2 = ch3.T(fkaVar, 0L);
                            } catch (Throwable th25) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th25);
                                Iterator it13 = fjf.a.iterator();
                                while (it13.hasNext()) {
                                    AccountInitializer accountInitializer12 = ((n6) it13.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th25);
                                        accountInitializer12.d().i().g().a(null, th25);
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
                                jT2 = 0;
                            }
                        }
                        i3 = 1;
                        r33 = 0;
                        break;
                    case 94425557:
                        i2 = i7;
                        if (!X.equals("calls")) {
                            fkaVar.x();
                        } else {
                            int iJ = ch3.J(fkaVar);
                            for (int i9 = 0; i9 < iJ; i9++) {
                                arrayList.add(sti.a(fkaVar));
                            }
                        }
                        i3 = 1;
                        r33 = 0;
                        break;
                    case 94623771:
                        i2 = i7;
                        if (!X.equals("chats")) {
                            fkaVar.x();
                            break;
                        } else {
                            try {
                                listB = b50.b(fkaVar);
                            } catch (Throwable th27) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th27);
                                Iterator it14 = fjf.a.iterator();
                                while (it14.hasNext()) {
                                    AccountInitializer accountInitializer13 = ((n6) it14.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th27);
                                        accountInitializer13.d().i().g().a(null, th27);
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
                                listB = r66Var;
                            }
                        }
                        i3 = 1;
                        r33 = 0;
                        break;
                    case 110541305:
                        ?? r10 = r7;
                        i2 = i7;
                        if (!X.equals(ApiProtocol.KEY_TOKEN)) {
                            fkaVar.x();
                            break;
                        } else {
                            try {
                                strX2 = ch3.X(fkaVar, r10);
                            } catch (Throwable th29) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th29);
                                Iterator it15 = fjf.a.iterator();
                                while (it15.hasNext()) {
                                    AccountInitializer accountInitializer14 = ((n6) it15.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th29);
                                        accountInitializer14.d().i().g().a(null, th29);
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
                                strX2 = null;
                            }
                        }
                        i3 = 1;
                        r33 = 0;
                        break;
                    case 327436830:
                        if (X.equals("login2Flags")) {
                            try {
                                iU3 = ch3.U(fkaVar);
                            } catch (Throwable th31) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th31);
                                Iterator it16 = fjf.a.iterator();
                                while (it16.hasNext()) {
                                    AccountInitializer accountInitializer15 = ((n6) it16.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th31);
                                        accountInitializer15.d().i().g().a(r7, th31);
                                    } catch (Throwable th32) {
                                        gm0.V("Payload", "failed to collect exception", th32);
                                    }
                                }
                                int iD16 = qt4.D(pye.a);
                                if (iD16 != 0) {
                                    if (iD16 == i6) {
                                        throw th31;
                                    }
                                    ore.o();
                                    return r7;
                                }
                                iU3 = 0;
                            }
                            int i10 = 0;
                            boolean zL = false;
                            boolean zL2 = false;
                            boolean zL3 = false;
                            ?? r8 = r7;
                            while (i10 < iU3) {
                                try {
                                    strX = ch3.X(fkaVar, r8);
                                } catch (Throwable th33) {
                                    try {
                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th33);
                                        try {
                                            Iterator it17 = fjf.a.iterator();
                                            while (it17.hasNext()) {
                                                AccountInitializer accountInitializer16 = ((n6) it17.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th33);
                                                    accountInitializer16.d().i().g().a(r8, th33);
                                                } catch (Throwable th34) {
                                                    gm0.V("Payload", "failed to collect exception", th34);
                                                }
                                            }
                                            int iD17 = qt4.D(pye.a);
                                            if (iD17 != 0) {
                                                try {
                                                    if (iD17 != 1) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    throw th33;
                                                } catch (Throwable th35) {
                                                    th = th35;
                                                    i2 = i7;
                                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                                    it = fjf.a.iterator();
                                                    while (it.hasNext()) {
                                                        AccountInitializer accountInitializer17 = ((n6) it.next()).a;
                                                        try {
                                                            gm0.V("Payload", "error while parse payload", th);
                                                            accountInitializer17.d().i().g().a(null, th);
                                                        } catch (Throwable th36) {
                                                            gm0.V("Payload", "failed to collect exception", th36);
                                                        }
                                                    }
                                                    iD = qt4.D(pye.a);
                                                    if (iD != 0) {
                                                        if (iD == 1) {
                                                            throw th;
                                                        }
                                                        ore.o();
                                                        return null;
                                                    }
                                                    r9 = 0;
                                                    ff9Var = new ff9(zL, zL2, zL3);
                                                    r33 = r9;
                                                    i3 = 1;
                                                    i6 = i3;
                                                    r7 = r33;
                                                    i7 = i2 + 1;
                                                }
                                            } else {
                                                strX = null;
                                            }
                                        } catch (Throwable th37) {
                                            th = th37;
                                            i2 = i7;
                                            th = th;
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                            it = fjf.a.iterator();
                                            while (it.hasNext()) {
                                                AccountInitializer accountInitializer18 = ((n6) it.next()).a;
                                                gm0.V("Payload", "error while parse payload", th);
                                                accountInitializer18.d().i().g().a(null, th);
                                            }
                                            iD = qt4.D(pye.a);
                                            if (iD != 0) {
                                                if (iD == 1) {
                                                    throw th;
                                                }
                                                ore.o();
                                                return null;
                                            }
                                            r9 = 0;
                                            ff9Var = new ff9(zL, zL2, zL3);
                                            r33 = r9;
                                            i3 = 1;
                                            i6 = i3;
                                            r7 = r33;
                                            i7 = i2 + 1;
                                        }
                                    } catch (Throwable th38) {
                                        th = th38;
                                    }
                                }
                                if (strX != null) {
                                    try {
                                        int iHashCode = strX.hashCode();
                                        if (iHashCode == -2127769185) {
                                            i2 = i7;
                                            if (strX.equals("configEnabled")) {
                                                try {
                                                    zL = ch3.L(fkaVar);
                                                } catch (Throwable th39) {
                                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th39);
                                                    Iterator it18 = fjf.a.iterator();
                                                    while (it18.hasNext()) {
                                                        AccountInitializer accountInitializer19 = ((n6) it18.next()).a;
                                                        try {
                                                            gm0.V("Payload", "error while parse payload", th39);
                                                            accountInitializer19.d().i().g().a(null, th39);
                                                        } catch (Throwable th40) {
                                                            gm0.V("Payload", "failed to collect exception", th40);
                                                        }
                                                    }
                                                    int iD18 = qt4.D(pye.a);
                                                    if (iD18 != 0) {
                                                        if (iD18 != 1) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        throw th39;
                                                    }
                                                    zL = false;
                                                }
                                            } else {
                                                continue;
                                            }
                                        } else if (iHashCode != -2061100287) {
                                            if (iHashCode == 1856248152 && strX.equals("profileEnabled")) {
                                                try {
                                                    zL3 = ch3.L(fkaVar);
                                                } catch (Throwable th41) {
                                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th41);
                                                    Iterator it19 = fjf.a.iterator();
                                                    while (it19.hasNext()) {
                                                        AccountInitializer accountInitializer20 = ((n6) it19.next()).a;
                                                        try {
                                                            gm0.V("Payload", "error while parse payload", th41);
                                                            i2 = i7;
                                                            try {
                                                                accountInitializer20.d().i().g().a(null, th41);
                                                            } catch (Throwable th42) {
                                                                th = th42;
                                                                try {
                                                                    gm0.V("Payload", "failed to collect exception", th);
                                                                    i7 = i2;
                                                                } catch (Throwable th43) {
                                                                    th = th43;
                                                                    Throwable th44 = th;
                                                                    try {
                                                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th44);
                                                                        Iterator it20 = fjf.a.iterator();
                                                                        while (it20.hasNext()) {
                                                                            AccountInitializer accountInitializer21 = ((n6) it20.next()).a;
                                                                            try {
                                                                                gm0.V("Payload", "error while parse payload", th44);
                                                                                accountInitializer21.d().i().g().a(null, th44);
                                                                            } catch (Throwable th45) {
                                                                                gm0.V("Payload", "failed to collect exception", th45);
                                                                            }
                                                                        }
                                                                        int iD19 = qt4.D(pye.a);
                                                                        if (iD19 != 0) {
                                                                            if (iD19 != 1) {
                                                                                throw new NoWhenBranchMatchedException();
                                                                            }
                                                                            throw th44;
                                                                        }
                                                                    } catch (Throwable th46) {
                                                                        th = th46;
                                                                        th = th;
                                                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                                                        it = fjf.a.iterator();
                                                                        while (it.hasNext()) {
                                                                            AccountInitializer accountInitializer110 = ((n6) it.next()).a;
                                                                            gm0.V("Payload", "error while parse payload", th);
                                                                            accountInitializer110.d().i().g().a(null, th);
                                                                        }
                                                                        iD = qt4.D(pye.a);
                                                                        if (iD != 0) {
                                                                            if (iD == 1) {
                                                                                throw th;
                                                                            }
                                                                            ore.o();
                                                                            return null;
                                                                        }
                                                                        r9 = 0;
                                                                        ff9Var = new ff9(zL, zL2, zL3);
                                                                        r33 = r9;
                                                                        i3 = 1;
                                                                        i6 = i3;
                                                                        r7 = r33;
                                                                        i7 = i2 + 1;
                                                                    }
                                                                }
                                                            }
                                                        } catch (Throwable th47) {
                                                            th = th47;
                                                            i2 = i7;
                                                        }
                                                        i7 = i2;
                                                        break;
                                                    }
                                                    i2 = i7;
                                                    int iD20 = qt4.D(pye.a);
                                                    if (iD20 != 0) {
                                                        if (iD20 != 1) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        throw th41;
                                                    }
                                                    zL3 = false;
                                                }
                                            }
                                            i2 = i7;
                                        } else {
                                            i2 = i7;
                                            if (strX.equals("contactEnabled")) {
                                                try {
                                                    zL2 = ch3.L(fkaVar);
                                                } catch (Throwable th48) {
                                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th48);
                                                    Iterator it21 = fjf.a.iterator();
                                                    while (it21.hasNext()) {
                                                        AccountInitializer accountInitializer22 = ((n6) it21.next()).a;
                                                        try {
                                                            gm0.V("Payload", "error while parse payload", th48);
                                                            accountInitializer22.d().i().g().a(null, th48);
                                                        } catch (Throwable th49) {
                                                            gm0.V("Payload", "failed to collect exception", th49);
                                                        }
                                                    }
                                                    int iD21 = qt4.D(pye.a);
                                                    if (iD21 != 0) {
                                                        if (iD21 != 1) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        throw th48;
                                                    }
                                                    zL2 = false;
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    } catch (Throwable th50) {
                                        th = th50;
                                        i2 = i7;
                                    }
                                } else {
                                    i2 = i7;
                                }
                                i10++;
                                i7 = i2;
                                r8 = 0;
                                break;
                            }
                            r9 = r8;
                            i2 = i7;
                            ff9Var = new ff9(zL, zL2, zL3);
                            r33 = r9;
                            i3 = 1;
                        }
                    default:
                        i2 = i7;
                        fkaVar.x();
                        i3 = 1;
                        r33 = 0;
                        break;
                }
            } else {
                r33 = r7;
                i2 = i7;
                i3 = i6;
            }
            i6 = i3;
            r7 = r33;
            i7 = i2 + 1;
        }
        return new nf9(ujdVarP, listB, listC, strX2, jT2, ia4VarF, map, jT3, arrayList, zBooleanValue, jNanoTime, iR, ff9Var);
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
        gyg gygVarD = null;
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
                    if (strX.equals("story")) {
                        try {
                            gygVarD = fyg.d(fkaVar);
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
                            gygVarD = null;
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
                                if (iD4 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th7;
                            }
                        }
                    }
                } catch (Throwable th9) {
                    try {
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
            }
        }
        if (gygVarD != null) {
            return new frg(gygVarD);
        }
        return null;
    }

    @Override // defpackage.k0g
    public xx6 a(gjg gjgVar) {
        return new tz(7, h0g.a);
    }

    @Override // defpackage.m74
    public ComponentName c() {
        return new ComponentName("ru.oneme.app", SingleCoreFeature$ToggleService.class.getName());
    }

    public void d(String str, Throwable th) {
        gm0.V("QrCodeGenerator", str, new vzd(str, th));
    }

    public pq3 e(Context context) {
        if (pq3.k == null) {
            synchronized (this) {
                if (pq3.k == null) {
                    pq3.k = new pq3(context);
                }
            }
        }
        return pq3.k;
    }

    public kbc h(View view) {
        return e(view.getContext()).m();
    }

    @Override // defpackage.fu3
    public kih i(fka fkaVar) {
        int iU;
        String strX;
        int iU2;
        String strX2;
        int iU3;
        String strX3;
        int iU4;
        String strX4;
        int i2 = 0;
        switch (this.a) {
            case 1:
                if (!fkaVar.l()) {
                    return null;
                }
                try {
                    iU3 = ch3.U(fkaVar);
                    break;
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
                    iU3 = 0;
                }
                String strX5 = null;
                String strX6 = null;
                while (i2 < iU3) {
                    try {
                        strX3 = ch3.X(fkaVar, null);
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
                        strX3 = null;
                    }
                    if (strX3 != null) {
                        try {
                            if (strX3.equals("trackId")) {
                                try {
                                    strX5 = ch3.X(fkaVar, null);
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
                                    strX5 = null;
                                }
                            } else if (strX3.equals("email")) {
                                try {
                                    strX6 = ch3.X(fkaVar, null);
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
                                    strX6 = null;
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
                                i2++;
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
                    i2++;
                    break;
                }
                if (strX5 == null || strX6 == null) {
                    return null;
                }
                return new fd0(strX5, strX6);
            case 2:
                return qj1.c;
            case 3:
                if (!fkaVar.l()) {
                    return null;
                }
                try {
                    iU4 = ch3.U(fkaVar);
                    break;
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
                    iU4 = 0;
                }
                st2 st2VarB = null;
                while (i2 < iU4) {
                    try {
                        strX4 = ch3.X(fkaVar, null);
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
                        strX4 = null;
                    }
                    if (strX4 != null) {
                        try {
                            if (strX4.equals("chat")) {
                                st2VarB = st2.b(fkaVar);
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
                                i2++;
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
                    i2++;
                    break;
                }
                return new h93(st2VarB);
            case 4:
            case 5:
            case 8:
            case 10:
            default:
                try {
                    iU = ch3.U(fkaVar);
                    break;
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
                    iU = 0;
                }
                String strX7 = null;
                while (i2 < iU) {
                    try {
                        strX = ch3.X(fkaVar, null);
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
                        strX = null;
                    }
                    if (strX != null) {
                        try {
                            if (strX.equals("error")) {
                                try {
                                    strX7 = ch3.X(fkaVar, null);
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
                                        if (iD15 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th29;
                                    }
                                    strX7 = null;
                                }
                            } else {
                                try {
                                    fkaVar.x();
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
                                        if (iD16 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th31;
                                    }
                                }
                            }
                        } catch (Throwable th33) {
                            try {
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
                                    if (iD17 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th33;
                                }
                                i2++;
                            } catch (Throwable th35) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th35);
                                Iterator it18 = fjf.a.iterator();
                                while (it18.hasNext()) {
                                    AccountInitializer accountInitializer18 = ((n6) it18.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th35);
                                        accountInitializer18.d().i().g().a(null, th35);
                                    } catch (Throwable th36) {
                                        gm0.V("Payload", "failed to collect exception", th36);
                                    }
                                }
                                int iD18 = qt4.D(pye.a);
                                if (iD18 != 0) {
                                    if (iD18 == 1) {
                                        throw th35;
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
                return new dui(strX7);
            case 6:
                return o(fkaVar);
            case 7:
                return p(fkaVar);
            case 9:
                try {
                    iU2 = ch3.U(fkaVar);
                    break;
                } catch (Throwable th37) {
                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th37);
                    Iterator it19 = fjf.a.iterator();
                    while (it19.hasNext()) {
                        AccountInitializer accountInitializer19 = ((n6) it19.next()).a;
                        try {
                            gm0.V("Payload", "error while parse payload", th37);
                            accountInitializer19.d().i().g().a(null, th37);
                        } catch (Throwable th38) {
                            gm0.V("Payload", "failed to collect exception", th38);
                        }
                    }
                    int iD19 = qt4.D(pye.a);
                    if (iD19 != 0) {
                        if (iD19 == 1) {
                            throw th37;
                        }
                        ore.o();
                        return null;
                    }
                    iU2 = 0;
                }
                if (iU2 == 0) {
                    return null;
                }
                while (i2 < iU2) {
                    try {
                        strX2 = ch3.X(fkaVar, null);
                    } catch (Throwable th39) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th39);
                        Iterator it20 = fjf.a.iterator();
                        while (it20.hasNext()) {
                            AccountInitializer accountInitializer20 = ((n6) it20.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th39);
                                accountInitializer20.d().i().g().a(null, th39);
                            } catch (Throwable th40) {
                                gm0.V("Payload", "failed to collect exception", th40);
                            }
                        }
                        int iD20 = qt4.D(pye.a);
                        if (iD20 != 0) {
                            if (iD20 == 1) {
                                throw th39;
                            }
                            ore.o();
                            return null;
                        }
                        strX2 = null;
                    }
                    if (strX2 != null) {
                        if (strX2.equals("profile")) {
                            ujd ujdVarP = f55.p(fkaVar);
                            if (ujdVarP != null) {
                                return new pkb(ujdVarP);
                            }
                            return null;
                        }
                        try {
                            fkaVar.x();
                        } catch (Throwable th41) {
                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th41);
                            Iterator it21 = fjf.a.iterator();
                            while (it21.hasNext()) {
                                AccountInitializer accountInitializer21 = ((n6) it21.next()).a;
                                try {
                                    gm0.V("Payload", "error while parse payload", th41);
                                    accountInitializer21.d().i().g().a(null, th41);
                                } catch (Throwable th42) {
                                    gm0.V("Payload", "failed to collect exception", th42);
                                }
                            }
                            int iD21 = qt4.D(pye.a);
                            if (iD21 != 0) {
                                if (iD21 == 1) {
                                    throw th41;
                                }
                                ore.o();
                                return null;
                            }
                        }
                    }
                    i2++;
                    break;
                }
                return null;
            case 11:
                return q(fkaVar);
        }
    }

    @Override // defpackage.saa
    public double j(qba qbaVar) {
        int iOrdinal = qbaVar.ordinal();
        if (iOrdinal == 0) {
            return 0.0d;
        }
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 5) {
            return 1.0d;
        }
        pj6.m("NativeMemoryCacheTrimStrategy", "unknown trim type: %s", qbaVar);
        return 0.0d;
    }

    public nbc k(Context context) {
        return e(context).j();
    }

    public nbc l(View view) {
        return e(view.getContext()).j();
    }

    @Override // ru.ok.tracer.nativebridge.NativeBridge
    public void log(String str) {
        if (str != null) {
            xwh.b(str);
        }
    }

    @Override // ru.ok.tracer.nativebridge.NativeBridge
    public void setKey(String str, String str2) {
        if (str != null) {
            swh swhVar = swh.a;
            Map mapSingletonMap = Collections.singletonMap(str, str2);
            if (swh.b) {
                return;
            }
            try {
                khh khhVar = swh.f;
                if (khhVar == null) {
                    khhVar = null;
                }
                khhVar.b(mapSingletonMap);
            } catch (Exception unused) {
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 24:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }
}
