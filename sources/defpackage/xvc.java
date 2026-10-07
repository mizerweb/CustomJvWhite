package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.MainActivity;
import one.me.android.concurrent.UseSystemThreadPoolQueueFeature$ToggleService;
import one.me.android.initialization.AccountInitializer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes.dex */
public final class xvc implements fu3, m74, cbh, cbb, aw4 {
    public static final xvc b = new xvc(0);
    public static final xvc c = new xvc(1);
    public static final xvc d = new xvc(2);
    public static final xvc e = new xvc(3);
    public static final xvc f = new xvc(4);
    public static final xvc g = new xvc(5);
    public static final xvc h = new xvc(6);
    public static final xvc i = new xvc(7);
    public static final xvc j = new xvc(8);
    public static final xvc k = new xvc(9);
    public static final xvc l = new xvc(10);
    public static final xvc m = new xvc(11);
    public static final xvc n = new xvc(12);
    public static final xvc o = new xvc(13);
    public static volatile boolean p;
    public final /* synthetic */ int a;

    public xvc(Context context) {
        this.a = 26;
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((twd) obj) != twd.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((twd) it.next()).a);
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    public static JSONObject d(igh ighVar, List list, Date date, String str, qwh qwhVar, long j2, long j3) throws JSONException {
        String strU1;
        String string;
        JSONObject jSONObject = new JSONObject();
        vpl.a(jSONObject, ighVar.n);
        if (j2 >= 0) {
            vpl.b(jSONObject, "diskFree", String.valueOf(j2));
        }
        if (j3 >= 0) {
            vpl.b(jSONObject, "freeRAM", String.valueOf(j3));
        }
        if (str == null || (string = r5h.y1(str).toString()) == null) {
            strU1 = null;
        } else {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                strU1 = r5h.u1(32, string);
            } else {
                strU1 = null;
            }
        }
        vpl.b(jSONObject, "issueKey", strU1);
        vpl.b(jSONObject, "date", iql.a(date));
        JSONObject jSONObjectF0 = yab.F0(ighVar);
        vpl.b(jSONObjectF0, "properties", jSONObject);
        vpl.b(jSONObjectF0, "sampleUuid", null);
        List list2 = list;
        if (!list2.isEmpty()) {
            vpl.b(jSONObjectF0, "tags", new JSONArray((Collection) list2));
        }
        if (qwhVar != null) {
            vpl.b(jSONObjectF0, "traceId", qwhVar.c());
            vpl.b(jSONObjectF0, "spanId", qwhVar.a());
            vpl.b(jSONObjectF0, "traceFlags", qwhVar.b());
        }
        return jSONObjectF0;
    }

    public static /* synthetic */ JSONObject j(igh ighVar, List list, Date date, qwh qwhVar, long j2, long j3, int i2) {
        if ((i2 & 32) != 0) {
            qwhVar = null;
        }
        return d(ighVar, list, date, null, qwhVar, (i2 & 64) != 0 ? -1L : j2, (i2 & np0.m) != 0 ? -1L : j3);
    }

    public static byte[] k(List list) {
        l31 l31Var = new l31();
        for (String str : a(list)) {
            l31Var.t0(str.length());
            l31Var.z0(0, str.length(), str);
        }
        return l31Var.I(l31Var.b);
    }

    public static nh5 m(xvc xvcVar) {
        Object next;
        Resources system = Resources.getSystem();
        xvcVar.getClass();
        int i2 = system.getDisplayMetrics().densityDpi;
        Iterator it = nh5.d.iterator();
        while (it.hasNext()) {
            next = it.next();
            hj8 hj8Var = ((nh5) next).a;
            if (i2 >= hj8Var.a && i2 < hj8Var.b) {
                return (nh5) next;
            }
        }
        next = null;
        return (nh5) next;
    }

    public static boolean n() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    private final kih o(fka fkaVar) {
        int iU;
        String strX;
        if (!fkaVar.l()) {
            return new hf1();
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
                    if (strX.equals(ApiProtocol.PARAM_JOIN_LINK)) {
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
                                if (iD3 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th5;
                            }
                            strX2 = null;
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
        if (strX2 == null) {
            strX2 = "";
        }
        return new hf1(strX2);
    }

    private final kih p(fka fkaVar) {
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
        r66 r66Var = r66.a;
        List listA = r66Var;
        long jT = -1;
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
                    if (strX.equals("members")) {
                        listA = fjf.a(fkaVar, r66Var, i9.v);
                    } else if (strX.equals("marker")) {
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
                            jT = -1;
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
        return new q63(jT, listA);
    }

    private final kih q(fka fkaVar) {
        int iU;
        String strX;
        if (fkaVar.l()) {
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
            lni lniVarD = null;
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
                        if (strX.equals("hash")) {
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
                                    if (iD3 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th5;
                                }
                                strX2 = null;
                            }
                        } else if (strX.equals("user")) {
                            lniVarD = jol.d(fkaVar);
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
            if (strX2 != null) {
                return new w94(strX2, lniVarD);
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:262:0x036d A[Catch: all -> 0x039f, TRY_LEAVE, TryCatch #36 {all -> 0x039f, blocks: (B:259:0x035e, B:260:0x0367, B:262:0x036d, B:266:0x038a, B:267:0x038e, B:271:0x0399, B:272:0x039e, B:275:0x03a2, B:263:0x0375), top: B:397:0x035e, inners: #21 }] */
    /* JADX WARN: Code duplicated, block: B:271:0x0399 A[Catch: all -> 0x039f, TryCatch #36 {all -> 0x039f, blocks: (B:259:0x035e, B:260:0x0367, B:262:0x036d, B:266:0x038a, B:267:0x038e, B:271:0x0399, B:272:0x039e, B:275:0x03a2, B:263:0x0375), top: B:397:0x035e, inners: #21 }] */
    /* JADX WARN: Code duplicated, block: B:275:0x03a2 A[Catch: all -> 0x039f, TRY_LEAVE, TryCatch #36 {all -> 0x039f, blocks: (B:259:0x035e, B:260:0x0367, B:262:0x036d, B:266:0x038a, B:267:0x038e, B:271:0x0399, B:272:0x039e, B:275:0x03a2, B:263:0x0375), top: B:397:0x035e, inners: #21 }] */
    /* JADX WARN: Code duplicated, block: B:276:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:282:0x03b9 A[Catch: all -> 0x03eb, TRY_LEAVE, TryCatch #5 {all -> 0x03eb, blocks: (B:279:0x03aa, B:280:0x03b3, B:282:0x03b9, B:286:0x03d6, B:287:0x03da, B:291:0x03e5, B:292:0x03ea, B:295:0x03ee, B:283:0x03c1), top: B:340:0x03aa, inners: #31 }] */
    /* JADX WARN: Code duplicated, block: B:291:0x03e5 A[Catch: all -> 0x03eb, TryCatch #5 {all -> 0x03eb, blocks: (B:279:0x03aa, B:280:0x03b3, B:282:0x03b9, B:286:0x03d6, B:287:0x03da, B:291:0x03e5, B:292:0x03ea, B:295:0x03ee, B:283:0x03c1), top: B:340:0x03aa, inners: #31 }] */
    /* JADX WARN: Code duplicated, block: B:295:0x03ee A[Catch: all -> 0x03eb, TRY_LEAVE, TryCatch #5 {all -> 0x03eb, blocks: (B:279:0x03aa, B:280:0x03b3, B:282:0x03b9, B:286:0x03d6, B:287:0x03da, B:291:0x03e5, B:292:0x03ea, B:295:0x03ee, B:283:0x03c1), top: B:340:0x03aa, inners: #31 }] */
    /* JADX WARN: Code duplicated, block: B:304:0x040c  */
    /* JADX WARN: Code duplicated, block: B:311:0x0435  */
    /* JADX WARN: Code duplicated, block: B:313:0x0438  */
    /* JADX WARN: Code duplicated, block: B:315:0x043e  */
    /* JADX WARN: Code duplicated, block: B:316:0x043f  */
    /* JADX WARN: Code duplicated, block: B:319:0x0448  */
    /* JADX WARN: Code duplicated, block: B:321:0x0450  */
    /* JADX WARN: Code duplicated, block: B:324:0x0455  */
    /* JADX WARN: Code duplicated, block: B:325:0x0458  */
    /* JADX WARN: Code duplicated, block: B:327:0x045b  */
    /* JADX WARN: Code duplicated, block: B:329:0x0463  */
    /* JADX WARN: Code duplicated, block: B:333:0x021f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:407:0x0396 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x03e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x03ef A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r3v1, types: [u8b] */
    /* JADX WARN: Type inference failed for: r5v1, types: [c9b] */
    /* JADX WARN: Type inference failed for: r7v39, types: [u8b] */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r8v2, types: [kih] */
    private final kih r(fka fkaVar) throws Throwable {
        int iU;
        Long lValueOf;
        List listA;
        ?? r14;
        Object obj;
        int i2;
        r66 r66Var;
        String str;
        ?? r15;
        List list;
        Throwable th;
        String strX;
        Iterator it;
        int iD;
        Object obj2;
        Throwable th2;
        Iterator it2;
        int iD2;
        Iterator it3;
        Throwable th3;
        Iterator it4;
        int iD3;
        int iJ;
        Object obj3;
        String strX2;
        long jT;
        Iterator it5;
        Iterator it6;
        int iJ2;
        u8b u8bVar;
        ?? u8bVar2;
        fka fkaVar2 = fkaVar;
        String str2 = null;
        try {
            iU = ch3.U(fkaVar2);
            while (true) {
                r66Var = r66.a;
                if (i2 < iU) {
                    try {
                        strX = ch3.X(fkaVar2, str2);
                    } catch (Throwable th4) {
                        try {
                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                            try {
                                Iterator it7 = fjf.a.iterator();
                                while (it7.hasNext()) {
                                    AccountInitializer accountInitializer = ((n6) it7.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th4);
                                        accountInitializer.d().i().g().a(str2, th4);
                                    } catch (Throwable th5) {
                                        gm0.V("Payload", "failed to collect exception", th5);
                                    }
                                }
                                int iD4 = qt4.D(pye.a);
                                if (iD4 != 0) {
                                    try {
                                        if (iD4 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th4;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        r66Var = r66Var;
                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                        it = fjf.a.iterator();
                                        while (it.hasNext()) {
                                            AccountInitializer accountInitializer2 = ((n6) it.next()).a;
                                            try {
                                                gm0.V("Payload", "error while parse payload", th);
                                                accountInitializer2.d().i().g().a(null, th);
                                            } catch (Throwable th7) {
                                                gm0.V("Payload", "failed to collect exception", th7);
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
                                        str = null;
                                        if (lValueOf != null) {
                                            return str;
                                        }
                                        long jLongValue = lValueOf.longValue();
                                        if (r14 == 0) {
                                            r15 = r14;
                                            r15 = cqb.b;
                                        }
                                        r15 = r14;
                                        ?? r3 = r15;
                                        if (listA == null) {
                                            list = r66Var;
                                        } else {
                                            list = listA;
                                        }
                                        if (obj == null) {
                                            obj = r1f.a;
                                        }
                                        return new e57(jLongValue, r3, list, obj);
                                    }
                                }
                                strX = null;
                            } catch (Throwable th8) {
                                th = th8;
                                r66Var = r66Var;
                                th = th;
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                it = fjf.a.iterator();
                                while (it.hasNext()) {
                                    AccountInitializer accountInitializer3 = ((n6) it.next()).a;
                                    gm0.V("Payload", "error while parse payload", th);
                                    accountInitializer3.d().i().g().a(null, th);
                                }
                                iD = qt4.D(pye.a);
                                if (iD != 0) {
                                    if (iD == 1) {
                                        throw th;
                                    }
                                    ore.o();
                                    return null;
                                }
                                str = null;
                                if (lValueOf != null) {
                                    return str;
                                }
                                long jLongValue2 = lValueOf.longValue();
                                if (r14 == 0) {
                                    r15 = r14;
                                    r15 = cqb.b;
                                }
                                r15 = r14;
                                ?? r4 = r15;
                                if (listA == null) {
                                    list = r66Var;
                                } else {
                                    list = listA;
                                }
                                if (obj == null) {
                                    obj = r1f.a;
                                }
                                return new e57(jLongValue2, r4, list, obj);
                            }
                        } catch (Throwable th9) {
                            th = th9;
                        }
                    }
                    if (strX != null) {
                        try {
                            switch (strX.hashCode()) {
                                case -1700234396:
                                    if (strX.equals("allFilterExcludeFolders")) {
                                        Object obj4 = r1f.a;
                                        try {
                                            if (fkaVar2.y().a() == 7) {
                                                try {
                                                    obj2 = obj4;
                                                    iJ = ch3.J(fkaVar2);
                                                } catch (Throwable th10) {
                                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th10);
                                                    try {
                                                        Iterator it8 = fjf.a.iterator();
                                                        while (it8.hasNext()) {
                                                            AccountInitializer accountInitializer4 = ((n6) it8.next()).a;
                                                            try {
                                                                gm0.V("Payload", "error while parse payload", th10);
                                                                obj2 = obj4;
                                                                try {
                                                                    accountInitializer4.d().i().g().a(null, th10);
                                                                } catch (Throwable th11) {
                                                                    th = th11;
                                                                    try {
                                                                        gm0.V("Payload", "failed to collect exception", th);
                                                                        obj4 = obj2;
                                                                    } catch (Throwable th12) {
                                                                        th = th12;
                                                                        th3 = th;
                                                                        try {
                                                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                                                                            it4 = fjf.a.iterator();
                                                                            while (it4.hasNext()) {
                                                                                AccountInitializer accountInitializer5 = ((n6) it4.next()).a;
                                                                                try {
                                                                                    gm0.V("Payload", "error while parse payload", th3);
                                                                                    accountInitializer5.d().i().g().a(null, th3);
                                                                                } catch (Throwable th13) {
                                                                                    gm0.V("Payload", "failed to collect exception", th13);
                                                                                }
                                                                            }
                                                                            iD3 = qt4.D(pye.a);
                                                                            if (iD3 != 0) {
                                                                                if (iD3 != 1) {
                                                                                    throw new NoWhenBranchMatchedException();
                                                                                }
                                                                                throw th3;
                                                                            }
                                                                            obj = obj2;
                                                                            i2++;
                                                                            fkaVar2 = fkaVar;
                                                                            str2 = null;
                                                                            r14 = r14;
                                                                        } catch (Throwable th14) {
                                                                            th = th14;
                                                                            th2 = th;
                                                                            try {
                                                                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                                                                                it2 = fjf.a.iterator();
                                                                                while (it2.hasNext()) {
                                                                                    AccountInitializer accountInitializer6 = ((n6) it2.next()).a;
                                                                                    try {
                                                                                        gm0.V("Payload", "error while parse payload", th2);
                                                                                        accountInitializer6.d().i().g().a(null, th2);
                                                                                    } catch (Throwable th15) {
                                                                                        gm0.V("Payload", "failed to collect exception", th15);
                                                                                    }
                                                                                }
                                                                                iD2 = qt4.D(pye.a);
                                                                                if (iD2 != 0) {
                                                                                    if (iD2 != 1) {
                                                                                        throw new NoWhenBranchMatchedException();
                                                                                    }
                                                                                    throw th2;
                                                                                }
                                                                                i2++;
                                                                                fkaVar2 = fkaVar;
                                                                                str2 = null;
                                                                                r14 = r14;
                                                                            } catch (Throwable th16) {
                                                                                th = th16;
                                                                                th = th;
                                                                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                                                                it = fjf.a.iterator();
                                                                                while (it.hasNext()) {
                                                                                    AccountInitializer accountInitializer7 = ((n6) it.next()).a;
                                                                                    gm0.V("Payload", "error while parse payload", th);
                                                                                    accountInitializer7.d().i().g().a(null, th);
                                                                                }
                                                                                iD = qt4.D(pye.a);
                                                                                if (iD != 0) {
                                                                                    if (iD == 1) {
                                                                                        throw th;
                                                                                    }
                                                                                    ore.o();
                                                                                    return null;
                                                                                }
                                                                                str = null;
                                                                                if (lValueOf != null) {
                                                                                    return str;
                                                                                }
                                                                                long jLongValue3 = lValueOf.longValue();
                                                                                if (r14 == 0) {
                                                                                    r15 = r14;
                                                                                    r15 = cqb.b;
                                                                                }
                                                                                r15 = r14;
                                                                                ?? r5 = r15;
                                                                                if (listA == null) {
                                                                                    list = r66Var;
                                                                                } else {
                                                                                    list = listA;
                                                                                }
                                                                                if (obj == null) {
                                                                                    obj = r1f.a;
                                                                                }
                                                                                return new e57(jLongValue3, r5, list, obj);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } catch (Throwable th17) {
                                                                th = th17;
                                                                obj2 = obj4;
                                                            }
                                                            obj4 = obj2;
                                                            break;
                                                        }
                                                        obj2 = obj4;
                                                        int iD5 = qt4.D(pye.a);
                                                        if (iD5 != 0) {
                                                            try {
                                                                if (iD5 != 1) {
                                                                    throw new NoWhenBranchMatchedException();
                                                                }
                                                                throw th10;
                                                            } catch (Throwable th18) {
                                                                th3 = th18;
                                                                r66Var = r66Var;
                                                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                                                                it4 = fjf.a.iterator();
                                                                while (it4.hasNext()) {
                                                                    AccountInitializer accountInitializer8 = ((n6) it4.next()).a;
                                                                    gm0.V("Payload", "error while parse payload", th3);
                                                                    accountInitializer8.d().i().g().a(null, th3);
                                                                }
                                                                iD3 = qt4.D(pye.a);
                                                                if (iD3 != 0) {
                                                                    if (iD3 != 1) {
                                                                        throw new NoWhenBranchMatchedException();
                                                                    }
                                                                    throw th3;
                                                                }
                                                                obj = obj2;
                                                                i2++;
                                                                fkaVar2 = fkaVar;
                                                                str2 = null;
                                                                r14 = r14;
                                                            }
                                                        } else {
                                                            iJ = 0;
                                                        }
                                                    } catch (Throwable th19) {
                                                        th = th19;
                                                        obj2 = obj4;
                                                    }
                                                }
                                                try {
                                                    c9b c9bVar = new c9b(iJ);
                                                    int i3 = 0;
                                                    while (i3 < iJ) {
                                                        int i4 = iJ;
                                                        try {
                                                            strX2 = ch3.X(fkaVar2, null);
                                                        } catch (Throwable th20) {
                                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th20);
                                                            Iterator it9 = fjf.a.iterator();
                                                            while (it9.hasNext()) {
                                                                AccountInitializer accountInitializer9 = ((n6) it9.next()).a;
                                                                try {
                                                                    gm0.V("Payload", "error while parse payload", th20);
                                                                    accountInitializer9.d().i().g().a(null, th20);
                                                                } catch (Throwable th21) {
                                                                    gm0.V("Payload", "failed to collect exception", th21);
                                                                }
                                                            }
                                                            int iD6 = qt4.D(pye.a);
                                                            if (iD6 != 0) {
                                                                if (iD6 != 1) {
                                                                    throw new NoWhenBranchMatchedException();
                                                                }
                                                                throw th20;
                                                            }
                                                            strX2 = null;
                                                        }
                                                        if (strX2 != null) {
                                                            try {
                                                                c9bVar.a(strX2);
                                                            } catch (Throwable th22) {
                                                                th = th22;
                                                                th3 = th;
                                                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                                                                it4 = fjf.a.iterator();
                                                                while (it4.hasNext()) {
                                                                    AccountInitializer accountInitializer10 = ((n6) it4.next()).a;
                                                                    gm0.V("Payload", "error while parse payload", th3);
                                                                    accountInitializer10.d().i().g().a(null, th3);
                                                                }
                                                                iD3 = qt4.D(pye.a);
                                                                if (iD3 != 0) {
                                                                    if (iD3 != 1) {
                                                                        throw new NoWhenBranchMatchedException();
                                                                    }
                                                                    throw th3;
                                                                }
                                                                obj = obj2;
                                                                i2++;
                                                                fkaVar2 = fkaVar;
                                                                str2 = null;
                                                                r14 = r14;
                                                            }
                                                            break;
                                                        }
                                                        i3++;
                                                        fkaVar2 = fkaVar;
                                                        iJ = i4;
                                                        break;
                                                    }
                                                    obj3 = c9bVar;
                                                } catch (Throwable th23) {
                                                    th = th23;
                                                    th3 = th;
                                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                                                    it4 = fjf.a.iterator();
                                                    while (it4.hasNext()) {
                                                        AccountInitializer accountInitializer11 = ((n6) it4.next()).a;
                                                        gm0.V("Payload", "error while parse payload", th3);
                                                        accountInitializer11.d().i().g().a(null, th3);
                                                    }
                                                    iD3 = qt4.D(pye.a);
                                                    if (iD3 != 0) {
                                                        if (iD3 != 1) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        throw th3;
                                                    }
                                                    obj = obj2;
                                                    i2++;
                                                    fkaVar2 = fkaVar;
                                                    str2 = null;
                                                    r14 = r14;
                                                }
                                            } else {
                                                obj2 = obj4;
                                                fkaVar.x();
                                                obj3 = obj2;
                                            }
                                            obj = obj3;
                                        } catch (Throwable th24) {
                                            th = th24;
                                            obj2 = obj4;
                                        }
                                        break;
                                    } else {
                                        try {
                                            fkaVar2.x();
                                        } catch (Throwable th25) {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th25);
                                            Iterator it10 = fjf.a.iterator();
                                            while (it10.hasNext()) {
                                                AccountInitializer accountInitializer12 = ((n6) it10.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th25);
                                                    it3 = it10;
                                                    try {
                                                        accountInitializer12.d().i().g().a(null, th25);
                                                    } catch (Throwable th26) {
                                                        th = th26;
                                                        gm0.V("Payload", "failed to collect exception", th);
                                                        it10 = it3;
                                                    }
                                                } catch (Throwable th27) {
                                                    th = th27;
                                                    it3 = it10;
                                                }
                                                it10 = it3;
                                            }
                                            int iD7 = qt4.D(pye.a);
                                            if (iD7 != 0) {
                                                if (iD7 != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th25;
                                            }
                                        }
                                    }
                                    break;
                                case -828062679:
                                    if (!strX.equals("folderSync")) {
                                        fkaVar2.x();
                                    } else {
                                        try {
                                            jT = ch3.T(fkaVar2, 0L);
                                        } catch (Throwable th28) {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th28);
                                            Iterator it11 = fjf.a.iterator();
                                            while (it11.hasNext()) {
                                                AccountInitializer accountInitializer13 = ((n6) it11.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th28);
                                                    it5 = it11;
                                                    try {
                                                        accountInitializer13.d().i().g().a(null, th28);
                                                    } catch (Throwable th29) {
                                                        th = th29;
                                                        gm0.V("Payload", "failed to collect exception", th);
                                                        it11 = it5;
                                                    }
                                                } catch (Throwable th30) {
                                                    th = th30;
                                                    it5 = it11;
                                                }
                                                it11 = it5;
                                            }
                                            int iD8 = qt4.D(pye.a);
                                            if (iD8 != 0) {
                                                if (iD8 != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th28;
                                            }
                                            jT = 0;
                                        }
                                        lValueOf = Long.valueOf(jT);
                                    }
                                    break;
                                case -683249211:
                                    if (!strX.equals("folders")) {
                                        fkaVar2.x();
                                    } else {
                                        u8b u8bVar3 = cqb.b;
                                        try {
                                            if (fkaVar2.y().a() == 7) {
                                                try {
                                                    iJ2 = ch3.J(fkaVar2);
                                                    obj2 = u8bVar3;
                                                } catch (Throwable th31) {
                                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th31);
                                                    Iterator it12 = fjf.a.iterator();
                                                    while (it12.hasNext()) {
                                                        AccountInitializer accountInitializer14 = ((n6) it12.next()).a;
                                                        try {
                                                            gm0.V("Payload", "error while parse payload", th31);
                                                            u8bVar = u8bVar3;
                                                            try {
                                                                accountInitializer14.d().i().g().a(null, th31);
                                                            } catch (Throwable th32) {
                                                                th = th32;
                                                                gm0.V("Payload", "failed to collect exception", th);
                                                                u8bVar3 = u8bVar;
                                                            }
                                                        } catch (Throwable th33) {
                                                            th = th33;
                                                            u8bVar = u8bVar3;
                                                        }
                                                        u8bVar3 = u8bVar;
                                                    }
                                                    obj2 = u8bVar3;
                                                    int iD9 = qt4.D(pye.a);
                                                    if (iD9 != 0) {
                                                        if (iD9 != 1) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        throw th31;
                                                    }
                                                    iJ2 = 0;
                                                }
                                                try {
                                                    u8bVar2 = new u8b(iJ2);
                                                    int i5 = 0;
                                                    while (i5 < iJ2) {
                                                        int i6 = iJ2;
                                                        vy2 vy2VarI = qyj.I(fkaVar2);
                                                        if (vy2VarI != null) {
                                                            u8bVar2.b(vy2VarI);
                                                        }
                                                        i5++;
                                                        iJ2 = i6;
                                                    }
                                                } catch (Throwable th34) {
                                                    th = th34;
                                                    Throwable th35 = th;
                                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th35);
                                                    Iterator it13 = fjf.a.iterator();
                                                    while (it13.hasNext()) {
                                                        AccountInitializer accountInitializer15 = ((n6) it13.next()).a;
                                                        try {
                                                            gm0.V("Payload", "error while parse payload", th35);
                                                            it6 = it13;
                                                            try {
                                                                accountInitializer15.d().i().g().a(null, th35);
                                                            } catch (Throwable th36) {
                                                                th = th36;
                                                                gm0.V("Payload", "failed to collect exception", th);
                                                                it13 = it6;
                                                            }
                                                        } catch (Throwable th37) {
                                                            th = th37;
                                                            it6 = it13;
                                                        }
                                                        it13 = it6;
                                                    }
                                                    int iD10 = qt4.D(pye.a);
                                                    if (iD10 != 0) {
                                                        if (iD10 != 1) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        throw th35;
                                                    }
                                                    r14 = obj2;
                                                }
                                            } else {
                                                obj2 = u8bVar3;
                                                fkaVar2.x();
                                                u8bVar2 = obj2;
                                            }
                                            r14 = u8bVar2;
                                        } catch (Throwable th38) {
                                            th = th38;
                                            obj2 = u8bVar3;
                                        }
                                    }
                                    break;
                                case -321816439:
                                    try {
                                        if (!strX.equals("foldersOrder")) {
                                            fkaVar2.x();
                                        } else {
                                            listA = fjf.a(fkaVar2, r66Var, ba.e);
                                        }
                                    } catch (Throwable th39) {
                                        th2 = th39;
                                        r66Var = r66Var;
                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                                        it2 = fjf.a.iterator();
                                        while (it2.hasNext()) {
                                            AccountInitializer accountInitializer16 = ((n6) it2.next()).a;
                                            gm0.V("Payload", "error while parse payload", th2);
                                            accountInitializer16.d().i().g().a(null, th2);
                                        }
                                        iD2 = qt4.D(pye.a);
                                        if (iD2 != 0) {
                                            if (iD2 != 1) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            throw th2;
                                        }
                                    }
                                    break;
                                default:
                                    fkaVar2.x();
                                    break;
                            }
                        } catch (Throwable th40) {
                            th = th40;
                            r66Var = r66Var;
                        }
                    }
                    i2++;
                    fkaVar2 = fkaVar;
                    str2 = null;
                    r14 = r14;
                } else {
                    str = str2;
                    r66Var = r66Var;
                }
            }
        } catch (Throwable th41) {
            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th41);
            Iterator it14 = fjf.a.iterator();
            while (it14.hasNext()) {
                AccountInitializer accountInitializer17 = ((n6) it14.next()).a;
                try {
                    gm0.V("Payload", "error while parse payload", th41);
                    accountInitializer17.d().i().g().a(null, th41);
                } catch (Throwable th42) {
                    gm0.V("Payload", "failed to collect exception", th42);
                }
            }
            int iD11 = qt4.D(pye.a);
            if (iD11 != 0) {
                if (iD11 == 1) {
                    throw th41;
                }
                ore.o();
                return null;
            }
            iU = 0;
        }
        lValueOf = null;
        listA = null;
        r14 = 0;
        obj = null;
        i2 = 0;
        if (lValueOf != null) {
            return str;
        }
        long jLongValue4 = lValueOf.longValue();
        if (r14 == 0) {
            r15 = r14;
            r15 = cqb.b;
        }
        r15 = r14;
        ?? r6 = r15;
        if (listA == null) {
            list = r66Var;
        } else {
            list = listA;
        }
        if (obj == null) {
            obj = r1f.a;
        }
        return new e57(jLongValue4, r6, list, obj);
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final kih s(fka fkaVar) {
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
        ia4 ia4VarF = null;
        ujd ujdVarP = null;
        List listC = null;
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
                    int iHashCode = strX.hashCode();
                    if (iHashCode != -1354792126) {
                        if (iHashCode != -567451565) {
                            if (iHashCode == -309425751 && strX.equals("profile")) {
                                ujdVarP = f55.p(fkaVar);
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
                        } else if (strX.equals("contacts")) {
                            r66 r66Var = r66.a;
                            try {
                                listC = b50.c(fkaVar);
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
                                listC = r66Var;
                            }
                        } else {
                            fkaVar.x();
                        }
                    } else if (strX.equals("config")) {
                        ia4VarF = gm0.F(fkaVar);
                    } else {
                        fkaVar.x();
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
        return new df9(ujdVarP, listC, ia4VarF);
    }

    private final kih t(fka fkaVar) throws IOException {
        int iU;
        String strX;
        ArrayList arrayList;
        boolean zL = fkaVar.l();
        r66 r66Var = r66.a;
        if (!zL) {
            return new egd(r66Var);
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
            return new egd(r66Var);
        }
        ArrayList arrayList2 = new ArrayList();
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
                    if (iD2 == 1) {
                        throw th3;
                    }
                    ore.o();
                    return null;
                }
                strX = null;
            }
            if (strX != null) {
                if (strX.equals("presetAvatars")) {
                    if (fkaVar.y().a() == 7) {
                        arrayList = new ArrayList();
                        int iT0 = fkaVar.t0();
                        for (int i3 = 0; i3 < iT0; i3++) {
                            arrayList.add(wwk.b(fkaVar));
                        }
                    } else {
                        fkaVar.x();
                        arrayList = null;
                    }
                    List listO1 = arrayList != null ? ww3.o1(arrayList) : null;
                    if (listO1 == null) {
                        listO1 = r66Var;
                    }
                    arrayList2.addAll(listO1);
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
                            if (iD3 == 1) {
                                throw th5;
                            }
                            ore.o();
                            return null;
                        }
                    }
                }
            }
        }
        return new egd(arrayList2);
    }

    private final kih u(fka fkaVar) throws IOException {
        int iU;
        String strX;
        boolean zL = fkaVar.l();
        jih jihVar = kih.b;
        if (!zL) {
            return jihVar;
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
        ysg ysgVarG = null;
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
                    if (strX.equals("storiesPreview")) {
                        try {
                            ysgVarG = xsg.g(fkaVar);
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
                            ysgVarG = null;
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
        return ysgVarG != null ? new yqg(ysgVarG) : jihVar;
    }

    public static void v(ar arVar, Uri uri, Uri uri2, h9c h9cVar, os1 os1Var, int i2) {
        int i3 = MainActivity.o1;
        if ((i2 & 2) != 0) {
            uri = null;
        }
        if ((i2 & 4) != 0) {
            uri2 = null;
        }
        if ((i2 & 8) != 0) {
            h9cVar = null;
        }
        cf7 x27Var = os1Var;
        if ((i2 & 16) != 0) {
            x27Var = new x27(19);
        }
        Intent intent = new Intent(arVar, (Class<?>) MainActivity.class);
        intent.putExtra("deep_link", uri != null ? uri : null);
        intent.putExtra("deferred_uri", uri2);
        intent.putExtra("snackbar", h9cVar);
        x27Var.invoke(intent);
        arVar.startActivity(intent);
    }

    public static rkh w(int i2) {
        Object next;
        Iterator it = rkh.f.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((rkh) next).a != i2);
        rkh rkhVar = (rkh) next;
        if (rkhVar != null) {
            return rkhVar;
        }
        ore.p(c0a.k(i2, "No such value ", " for TaskStatus"));
        return null;
    }

    public static ctc x(int i2) {
        Object next;
        Iterator it = ctc.w1.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ctc) next).a != i2);
        ctc ctcVar = (ctc) next;
        if (ctcVar != null) {
            return ctcVar;
        }
        ore.p(c0a.k(i2, "No such value ", " for PersistableTaskType"));
        return null;
    }

    @Override // defpackage.cbh
    public dbh b(bbh bbhVar) {
        return new md7((Context) bbhVar.c, (String) bbhVar.d, (n31) bbhVar.e, bbhVar.a, bbhVar.b);
    }

    @Override // defpackage.m74
    public ComponentName c() {
        return new ComponentName("ru.oneme.app", UseSystemThreadPoolQueueFeature$ToggleService.class.getName());
    }

    @Override // defpackage.cbb
    public void e(String str, Throwable th) {
        Log.e("NativeMedia", str, th);
    }

    @Override // defpackage.cbb
    public void h(Throwable th) {
        Log.e("NativeMedia", th != null ? th.getMessage() : null, th);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:526:0x0469 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
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
        int iJ;
        int i2 = 1;
        switch (this.a) {
            case 0:
                try {
                    iU2 = ch3.U(fkaVar);
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
                    iU2 = 0;
                }
                String strS0 = null;
                for (int i3 = 0; i3 < iU2; i3++) {
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
                            if (iD2 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th3;
                        }
                        strX2 = null;
                    }
                    if (strX2 != null) {
                        try {
                            if (strX2.equals(MLFeatureConfigProviderBase.URL_KEY)) {
                                strS0 = fkaVar.S0();
                            }
                        } catch (Throwable th5) {
                            try {
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
                    break;
                }
                if (strS0 != null) {
                    return new wvc(strS0);
                }
                String name = xvc.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar == null) {
                    return null;
                }
                je9 je9Var = je9.f;
                if (!a4cVar.b(je9Var)) {
                    return null;
                }
                a4cVar.c(je9Var, name, "We don't get the url for the uploaded photo", null);
                return null;
            case 1:
                if (!fkaVar.l()) {
                    return null;
                }
                try {
                    iU3 = ch3.U(fkaVar);
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
                    iU3 = 0;
                }
                cd0 cd0VarC = null;
                for (int i4 = 0; i4 < iU3; i4++) {
                    try {
                        strX3 = ch3.X(fkaVar, null);
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
                        strX3 = null;
                    }
                    if (strX3 != null) {
                        try {
                            if (strX3.equals("password")) {
                                cd0VarC = zwk.c(fkaVar);
                            } else {
                                try {
                                    fkaVar.x();
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
                                }
                            }
                        } catch (Throwable th15) {
                            try {
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
                            }
                        }
                    }
                    break;
                }
                if (cd0VarC == null) {
                    return null;
                }
                return new dd0(cd0VarC);
            case 2:
                return o(fkaVar);
            case 3:
                return p(fkaVar);
            case 4:
                return q(fkaVar);
            case 5:
            case 8:
            default:
                if (!fkaVar.l()) {
                    return null;
                }
                u8b u8bVar = cqb.b;
                try {
                    iU4 = ch3.U(fkaVar);
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
                    iU4 = 0;
                }
                ysg ysgVarG = null;
                int i5 = 0;
                while (i5 < iU4) {
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
                            if (iD11 != i2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th21;
                        }
                        strX4 = null;
                    }
                    if (strX4 != null) {
                        try {
                            if (strX4.equals("stories")) {
                                u8b u8bVar2 = cqb.b;
                                try {
                                    if (fkaVar.y().a() == 7) {
                                        try {
                                            iJ = ch3.J(fkaVar);
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
                                                if (iD12 != i2) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th23;
                                            }
                                            iJ = 0;
                                        }
                                        u8b u8bVar3 = new u8b(iJ);
                                        for (int i6 = 0; i6 < iJ; i6++) {
                                            gyg gygVarD = fyg.d(fkaVar);
                                            if (gygVarD != null) {
                                                u8bVar3.b(gygVarD);
                                            }
                                        }
                                        u8bVar2 = u8bVar3;
                                    } else {
                                        fkaVar.x();
                                    }
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
                                    u8bVar = u8bVar2;
                                    i5++;
                                    i2 = 1;
                                }
                                u8bVar = u8bVar2;
                                break;
                            } else if (strX4.equals("storiesPreview")) {
                                try {
                                    ysgVarG = xsg.g(fkaVar);
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
                                    ysgVarG = null;
                                }
                            } else {
                                try {
                                    fkaVar.x();
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
                                }
                            }
                        } catch (Throwable th31) {
                            try {
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
                                i5++;
                                i2 = 1;
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
                    i5++;
                    i2 = 1;
                    break;
                }
                return new otg(u8bVar, ysgVarG);
            case 6:
                return r(fkaVar);
            case 7:
                return s(fkaVar);
            case 9:
                try {
                    iU = ch3.U(fkaVar);
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
                    iU = 0;
                }
                if (iU == 0) {
                    return null;
                }
                long[] jArrC = null;
                st2 st2VarB = null;
                long jT = 0;
                boolean zL = false;
                for (int i7 = 0; i7 < iU; i7++) {
                    try {
                        strX = ch3.X(fkaVar, null);
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
                        strX = null;
                    }
                    if (strX != null) {
                        switch (strX.hashCode()) {
                            case -1690743503:
                                if (strX.equals("messageIds")) {
                                    jArrC = fjf.c(fkaVar);
                                } else {
                                    try {
                                        fkaVar.x();
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
                                    }
                                }
                                break;
                            case -982451749:
                                if (!strX.equals("postId")) {
                                    fkaVar.x();
                                } else {
                                    try {
                                        jT = ch3.T(fkaVar, 0L);
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
                                        jT = 0;
                                    }
                                }
                                break;
                            case 115180:
                                if (!strX.equals("ttl")) {
                                    fkaVar.x();
                                } else {
                                    try {
                                        zL = ch3.L(fkaVar);
                                    } catch (Throwable th43) {
                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th43);
                                        Iterator it22 = fjf.a.iterator();
                                        while (it22.hasNext()) {
                                            AccountInitializer accountInitializer22 = ((n6) it22.next()).a;
                                            try {
                                                gm0.V("Payload", "error while parse payload", th43);
                                                accountInitializer22.d().i().g().a(null, th43);
                                            } catch (Throwable th44) {
                                                gm0.V("Payload", "failed to collect exception", th44);
                                            }
                                        }
                                        int iD22 = qt4.D(pye.a);
                                        if (iD22 != 0) {
                                            if (iD22 == 1) {
                                                throw th43;
                                            }
                                            ore.o();
                                            return null;
                                        }
                                        zL = false;
                                    }
                                }
                                break;
                            case 3052376:
                                if (!strX.equals("chat")) {
                                    fkaVar.x();
                                } else {
                                    try {
                                        st2VarB = st2.b(fkaVar);
                                    } catch (Throwable th45) {
                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th45);
                                        Iterator it23 = fjf.a.iterator();
                                        while (it23.hasNext()) {
                                            AccountInitializer accountInitializer23 = ((n6) it23.next()).a;
                                            try {
                                                gm0.V("Payload", "error while parse payload", th45);
                                                accountInitializer23.d().i().g().a(null, th45);
                                            } catch (Throwable th46) {
                                                gm0.V("Payload", "failed to collect exception", th46);
                                            }
                                        }
                                        int iD23 = qt4.D(pye.a);
                                        if (iD23 != 0) {
                                            if (iD23 == 1) {
                                                throw th45;
                                            }
                                            ore.o();
                                            return null;
                                        }
                                        st2VarB = null;
                                    }
                                }
                                break;
                            default:
                                fkaVar.x();
                                break;
                        }
                    }
                    break;
                }
                if (st2VarB == null) {
                    return null;
                }
                if (jArrC == null) {
                    jArrC = yl2.a;
                }
                return new hkb(st2VarB, jT, jArrC, zL);
            case 10:
                return t(fkaVar);
            case 11:
                return u(fkaVar);
        }
    }

    @Override // defpackage.cbb
    public void l(String str) {
        Log.d("NativeMedia", str);
    }

    public /* synthetic */ xvc(int i2) {
        this.a = i2;
    }
}
