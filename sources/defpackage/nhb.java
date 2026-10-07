package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.a;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.arch.Widget;
import one.me.webapp.util.WebAppNfcService;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes.dex */
public final class nhb implements dbd, fu3, sf7, ut4, m74, m57, c4b, ogc, em9, zab {
    public static nhb b;
    public static final nhb c = new nhb(1);
    public static final nhb d = new nhb(2);
    public static final nhb e = new nhb(3);
    public static final /* synthetic */ nhb f = new nhb(4);
    public static final nhb g = new nhb(5);
    public static final /* synthetic */ nhb h = new nhb(6);
    public static final nhb i = new nhb(7);
    public static final nhb j = new nhb(8);
    public static final nhb k = new nhb(9);
    public static final nhb l = new nhb(11);
    public static final nhb m = new nhb(13);
    public final /* synthetic */ int a;

    public nhb() {
        this.a = 14;
        new LinkedHashSet(20);
    }

    public static int d(View view) {
        float f2;
        float f3;
        if (ixj.g(view.getRootWindowInsets(), view).a.f(2).d > 0) {
            f2 = yl5.d().getDisplayMetrics().density;
            f3 = 68.0f;
        } else {
            f2 = yl5.d().getDisplayMetrics().density;
            f3 = 76.0f;
        }
        return gm0.K(f3 * f2);
    }

    public static synchronized nhb e() {
        try {
            if (b == null) {
                b = new nhb(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    public static File j(Context context, ste steVar) {
        File fileL = l(context);
        sb8.U(fileL);
        return lu6.q0(fileL, steVar.b + "_" + System.currentTimeMillis() + ".bin");
    }

    public static File l(Context context) {
        String str;
        String strP = ch3.p();
        if (strP.equals(context.getPackageName())) {
            str = "tracer";
        } else {
            str = "tracer-" + ((Object) Uri.encode(z5h.I0(strP, ':', '-', false)));
        }
        return new File(context.getCacheDir(), str);
    }

    private final kih m(fka fkaVar) {
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
        st2 st2VarB = null;
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
                    if (strX.equals("chat")) {
                        st2VarB = st2.b(fkaVar);
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
        if (st2VarB != null) {
            return new sz2(st2VarB);
        }
        return null;
    }

    private final kih n(fka fkaVar) {
        int iU;
        String strX;
        String strX2;
        boolean zL;
        if (!fkaVar.l()) {
            return new sq6("", null);
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
        String str = "";
        Boolean boolValueOf = null;
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
                    if (strX.equals(MLFeatureConfigProviderBase.URL_KEY)) {
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
                        str = strX2 == null ? "" : strX2;
                    } else if (strX.equals("unsafe")) {
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
                                if (iD4 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th7;
                            }
                            zL = false;
                        }
                        boolValueOf = Boolean.valueOf(zL);
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
        return new sq6(str, boolValueOf);
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
    private final kih o(fka fkaVar) throws Throwable {
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
                                        return new ujb(jLongValue, r3, list, obj);
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
                                return new ujb(jLongValue2, r4, list, obj);
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
                                                                                return new ujb(jLongValue3, r5, list, obj);
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
                                            listA = fjf.a(fkaVar2, r66Var, dz7.k);
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
        return new ujb(jLongValue4, r6, list, obj);
    }

    @Override // defpackage.m57
    public Widget a(String str, t3f t3fVar, ha9 ha9Var, a aVar, cf7 cf7Var) {
        ChatsListWidget chatsListWidget = new ChatsListWidget(str, t3fVar, ha9Var);
        chatsListWidget.t = aVar;
        if (chatsListWidget.isAttached()) {
            chatsListWidget.s1().setItemViewCacheSize(Integer.MIN_VALUE);
            chatsListWidget.s1().setRecycledViewPool(aVar);
        }
        chatsListWidget.v = cf7Var;
        return chatsListWidget;
    }

    @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        return (vd6) m94.m.getValue();
    }

    @Override // defpackage.zab
    public boolean b(String str) {
        System.loadLibrary(str);
        return true;
    }

    @Override // defpackage.m74
    public ComponentName c() {
        return new ComponentName("ru.oneme.app", WebAppNfcService.class.getName());
    }

    @Override // defpackage.c4b
    public Object h(fka fkaVar) {
        return ch3.W(fkaVar);
    }

    /* JADX WARN: Code duplicated, block: B:442:0x0673 A[Catch: all -> 0x04f1, TRY_LEAVE, TryCatch #13 {all -> 0x04f1, blocks: (B:439:0x0664, B:440:0x066d, B:442:0x0673, B:446:0x068f, B:447:0x0693, B:451:0x069e, B:452:0x06a3, B:453:0x06a4, B:317:0x04b1, B:318:0x04ba, B:320:0x04c0, B:324:0x04dc, B:325:0x04e0, B:329:0x04eb, B:330:0x04f0, B:333:0x04f5, B:313:0x04aa, B:443:0x067b, B:321:0x04c8), top: B:498:0x0664, inners: #11, #32, #40 }] */
    /* JADX WARN: Code duplicated, block: B:451:0x069e A[Catch: all -> 0x04f1, TryCatch #13 {all -> 0x04f1, blocks: (B:439:0x0664, B:440:0x066d, B:442:0x0673, B:446:0x068f, B:447:0x0693, B:451:0x069e, B:452:0x06a3, B:453:0x06a4, B:317:0x04b1, B:318:0x04ba, B:320:0x04c0, B:324:0x04dc, B:325:0x04e0, B:329:0x04eb, B:330:0x04f0, B:333:0x04f5, B:313:0x04aa, B:443:0x067b, B:321:0x04c8), top: B:498:0x0664, inners: #11, #32, #40 }] */
    /* JADX WARN: Code duplicated, block: B:453:0x06a4 A[Catch: all -> 0x04f1, TRY_LEAVE, TryCatch #13 {all -> 0x04f1, blocks: (B:439:0x0664, B:440:0x066d, B:442:0x0673, B:446:0x068f, B:447:0x0693, B:451:0x069e, B:452:0x06a3, B:453:0x06a4, B:317:0x04b1, B:318:0x04ba, B:320:0x04c0, B:324:0x04dc, B:325:0x04e0, B:329:0x04eb, B:330:0x04f0, B:333:0x04f5, B:313:0x04aa, B:443:0x067b, B:321:0x04c8), top: B:498:0x0664, inners: #11, #32, #40 }] */
    /* JADX WARN: Code duplicated, block: B:642:0x069b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:0x06a6 A[SYNTHETIC] */
    @Override // defpackage.fu3
    public kih i(fka fkaVar) {
        int iU;
        String strX;
        Throwable th;
        Iterator it;
        int iD;
        int iU2;
        String strX2;
        int iU3;
        long jT;
        int iU4;
        String strX3;
        int iJ;
        int i2 = 1;
        switch (this.a) {
            case 1:
                if (!fkaVar.l()) {
                    return null;
                }
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
                String strX4 = null;
                int iR = 0;
                int iR2 = 0;
                for (int i3 = 0; i3 < iU; i3++) {
                    try {
                        strX = ch3.X(fkaVar, null);
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
                        strX = null;
                    }
                    if (strX != null) {
                        try {
                            int iHashCode = strX.hashCode();
                            try {
                                if (iHashCode != -1135546573) {
                                    if (iHashCode != -1067396154) {
                                        if (iHashCode == -478078743) {
                                            try {
                                                if (strX.equals("blockingDuration")) {
                                                    try {
                                                        iR2 = ch3.R(fkaVar, 0);
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
                                                            if (iD4 != 1) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            throw th6;
                                                        }
                                                        iR2 = 0;
                                                    }
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
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
                                    } else if (strX.equals("trackId")) {
                                        try {
                                            strX4 = ch3.X(fkaVar, null);
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
                                            strX4 = null;
                                        }
                                    }
                                } else if (strX.equals("codeLength")) {
                                    try {
                                        iR = ch3.R(fkaVar, 0);
                                    } catch (Throwable th14) {
                                        try {
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
                                            iR = 0;
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
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
                                    }
                                }
                                fkaVar.x();
                            } catch (Throwable th17) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th17);
                                Iterator it8 = fjf.a.iterator();
                                while (it8.hasNext()) {
                                    AccountInitializer accountInitializer9 = ((n6) it8.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th17);
                                        accountInitializer9.d().i().g().a(null, th17);
                                    } catch (Throwable th18) {
                                        gm0.V("Payload", "failed to collect exception", th18);
                                    }
                                }
                                int iD8 = qt4.D(pye.a);
                                if (iD8 != 0) {
                                    if (iD8 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th17;
                                }
                            }
                        } catch (Throwable th19) {
                            th = th19;
                        }
                        break;
                    }
                    break;
                }
                if (strX4 == null) {
                    return null;
                }
                return new oe0(strX4, iR, iR2);
            case 2:
                return m(fkaVar);
            case 3:
            case 4:
            case 6:
            default:
                if (!fkaVar.l()) {
                    return null;
                }
                u8b u8bVar = cqb.b;
                try {
                    iU4 = ch3.U(fkaVar);
                } catch (Throwable th20) {
                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th20);
                    Iterator it9 = fjf.a.iterator();
                    while (it9.hasNext()) {
                        AccountInitializer accountInitializer10 = ((n6) it9.next()).a;
                        try {
                            gm0.V("Payload", "error while parse payload", th20);
                            accountInitializer10.d().i().g().a(null, th20);
                        } catch (Throwable th21) {
                            gm0.V("Payload", "failed to collect exception", th21);
                        }
                    }
                    int iD9 = qt4.D(pye.a);
                    if (iD9 != 0) {
                        if (iD9 == 1) {
                            throw th20;
                        }
                        ore.o();
                        return null;
                    }
                    iU4 = 0;
                }
                String strX5 = null;
                int i4 = 0;
                while (i4 < iU4) {
                    try {
                        strX3 = ch3.X(fkaVar, null);
                    } catch (Throwable th22) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th22);
                        Iterator it10 = fjf.a.iterator();
                        while (it10.hasNext()) {
                            AccountInitializer accountInitializer11 = ((n6) it10.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th22);
                                accountInitializer11.d().i().g().a(null, th22);
                            } catch (Throwable th23) {
                                gm0.V("Payload", "failed to collect exception", th23);
                            }
                        }
                        int iD10 = qt4.D(pye.a);
                        if (iD10 != 0) {
                            if (iD10 != i2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th22;
                        }
                        strX3 = null;
                    }
                    if (strX3 != null) {
                        try {
                            if (strX3.equals("cursor")) {
                                try {
                                    strX5 = ch3.X(fkaVar, null);
                                } catch (Throwable th24) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th24);
                                    Iterator it11 = fjf.a.iterator();
                                    while (it11.hasNext()) {
                                        AccountInitializer accountInitializer12 = ((n6) it11.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th24);
                                            accountInitializer12.d().i().g().a(null, th24);
                                        } catch (Throwable th25) {
                                            gm0.V("Payload", "failed to collect exception", th25);
                                        }
                                    }
                                    int iD11 = qt4.D(pye.a);
                                    if (iD11 != 0) {
                                        if (iD11 != i2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th24;
                                    }
                                    strX5 = null;
                                }
                            } else if (strX3.equals("storiesPreviews")) {
                                u8b u8bVar2 = cqb.b;
                                try {
                                    if (fkaVar.y().a() == 7) {
                                        try {
                                            iJ = ch3.J(fkaVar);
                                        } catch (Throwable th26) {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th26);
                                            Iterator it12 = fjf.a.iterator();
                                            while (it12.hasNext()) {
                                                AccountInitializer accountInitializer13 = ((n6) it12.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th26);
                                                    accountInitializer13.d().i().g().a(null, th26);
                                                } catch (Throwable th27) {
                                                    gm0.V("Payload", "failed to collect exception", th27);
                                                }
                                            }
                                            int iD12 = qt4.D(pye.a);
                                            if (iD12 != 0) {
                                                if (iD12 != i2) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th26;
                                            }
                                            iJ = 0;
                                        }
                                        u8b u8bVar3 = new u8b(iJ);
                                        for (int i5 = 0; i5 < iJ; i5++) {
                                            ysg ysgVarG = xsg.g(fkaVar);
                                            if (ysgVarG != null) {
                                                u8bVar3.b(ysgVarG);
                                            }
                                        }
                                        u8bVar2 = u8bVar3;
                                    } else {
                                        fkaVar.x();
                                    }
                                } catch (Throwable th28) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th28);
                                    Iterator it13 = fjf.a.iterator();
                                    while (it13.hasNext()) {
                                        AccountInitializer accountInitializer14 = ((n6) it13.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th28);
                                            accountInitializer14.d().i().g().a(null, th28);
                                        } catch (Throwable th29) {
                                            gm0.V("Payload", "failed to collect exception", th29);
                                        }
                                    }
                                    int iD13 = qt4.D(pye.a);
                                    if (iD13 != 0) {
                                        if (iD13 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th28;
                                    }
                                }
                                u8bVar = u8bVar2;
                                break;
                            } else {
                                try {
                                    fkaVar.x();
                                } catch (Throwable th30) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th30);
                                    Iterator it14 = fjf.a.iterator();
                                    while (it14.hasNext()) {
                                        AccountInitializer accountInitializer15 = ((n6) it14.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th30);
                                            accountInitializer15.d().i().g().a(null, th30);
                                        } catch (Throwable th31) {
                                            gm0.V("Payload", "failed to collect exception", th31);
                                        }
                                    }
                                    int iD14 = qt4.D(pye.a);
                                    if (iD14 != 0) {
                                        if (iD14 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th30;
                                    }
                                }
                            }
                        } catch (Throwable th32) {
                            try {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th32);
                                Iterator it15 = fjf.a.iterator();
                                while (it15.hasNext()) {
                                    AccountInitializer accountInitializer16 = ((n6) it15.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th32);
                                        accountInitializer16.d().i().g().a(null, th32);
                                    } catch (Throwable th33) {
                                        gm0.V("Payload", "failed to collect exception", th33);
                                    }
                                }
                                int iD15 = qt4.D(pye.a);
                                if (iD15 != 0) {
                                    if (iD15 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th32;
                                }
                            } catch (Throwable th34) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th34);
                                Iterator it16 = fjf.a.iterator();
                                while (it16.hasNext()) {
                                    AccountInitializer accountInitializer17 = ((n6) it16.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th34);
                                        accountInitializer17.d().i().g().a(null, th34);
                                    } catch (Throwable th35) {
                                        gm0.V("Payload", "failed to collect exception", th35);
                                    }
                                }
                                int iD16 = qt4.D(pye.a);
                                if (iD16 != 0) {
                                    if (iD16 == 1) {
                                        throw th34;
                                    }
                                    ore.o();
                                    return null;
                                }
                            }
                        }
                    }
                    i4++;
                    i2 = 1;
                    break;
                }
                return new dsg(u8bVar, strX5);
            case 5:
                return n(fkaVar);
            case 7:
                if (!fkaVar.l()) {
                    return null;
                }
                try {
                    iU2 = ch3.U(fkaVar);
                } catch (Throwable th36) {
                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th36);
                    Iterator it17 = fjf.a.iterator();
                    while (it17.hasNext()) {
                        AccountInitializer accountInitializer18 = ((n6) it17.next()).a;
                        try {
                            gm0.V("Payload", "error while parse payload", th36);
                            accountInitializer18.d().i().g().a(null, th36);
                        } catch (Throwable th37) {
                            gm0.V("Payload", "failed to collect exception", th37);
                        }
                    }
                    int iD17 = qt4.D(pye.a);
                    if (iD17 != 0) {
                        if (iD17 == 1) {
                            throw th36;
                        }
                        ore.o();
                        return null;
                    }
                    iU2 = 0;
                }
                if (iU2 == 0) {
                    return null;
                }
                l8b l8bVar = new l8b();
                for (int i6 = 0; i6 < iU2; i6++) {
                    try {
                        strX2 = ch3.X(fkaVar, null);
                    } catch (Throwable th38) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th38);
                        Iterator it18 = fjf.a.iterator();
                        while (it18.hasNext()) {
                            AccountInitializer accountInitializer19 = ((n6) it18.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th38);
                                accountInitializer19.d().i().g().a(null, th38);
                            } catch (Throwable th39) {
                                gm0.V("Payload", "failed to collect exception", th39);
                            }
                        }
                        int iD18 = qt4.D(pye.a);
                        if (iD18 != 0) {
                            if (iD18 == 1) {
                                throw th38;
                            }
                            ore.o();
                            return null;
                        }
                        strX2 = null;
                    }
                    if (strX2 != null) {
                        if (strX2.equals("messagesReactions")) {
                            try {
                                iU3 = ch3.U(fkaVar);
                            } catch (Throwable th40) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th40);
                                Iterator it19 = fjf.a.iterator();
                                while (it19.hasNext()) {
                                    AccountInitializer accountInitializer20 = ((n6) it19.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th40);
                                        accountInitializer20.d().i().g().a(null, th40);
                                    } catch (Throwable th41) {
                                        gm0.V("Payload", "failed to collect exception", th41);
                                    }
                                }
                                int iD19 = qt4.D(pye.a);
                                if (iD19 != 0) {
                                    if (iD19 == 1) {
                                        throw th40;
                                    }
                                    ore.o();
                                    return null;
                                }
                                iU3 = 0;
                            }
                            for (int i7 = 0; i7 < iU3; i7++) {
                                try {
                                    jT = ch3.T(fkaVar, 0L);
                                } catch (Throwable th42) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th42);
                                    Iterator it20 = fjf.a.iterator();
                                    while (it20.hasNext()) {
                                        AccountInitializer accountInitializer21 = ((n6) it20.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th42);
                                            accountInitializer21.d().i().g().a(null, th42);
                                        } catch (Throwable th43) {
                                            gm0.V("Payload", "failed to collect exception", th43);
                                        }
                                    }
                                    int iD20 = qt4.D(pye.a);
                                    if (iD20 != 0) {
                                        if (iD20 == 1) {
                                            throw th42;
                                        }
                                        ore.o();
                                        return null;
                                    }
                                    jT = 0;
                                }
                                hja hjaVarB = ftk.b(fkaVar);
                                if (hjaVarB != null) {
                                    l8bVar.l(jT, hjaVarB);
                                }
                                break;
                            }
                        } else {
                            try {
                                fkaVar.x();
                            } catch (Throwable th44) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th44);
                                Iterator it21 = fjf.a.iterator();
                                while (it21.hasNext()) {
                                    AccountInitializer accountInitializer22 = ((n6) it21.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th44);
                                        accountInitializer22.d().i().g().a(null, th44);
                                    } catch (Throwable th45) {
                                        gm0.V("Payload", "failed to collect exception", th45);
                                    }
                                }
                                int iD21 = qt4.D(pye.a);
                                if (iD21 != 0) {
                                    if (iD21 == 1) {
                                        throw th44;
                                    }
                                    ore.o();
                                    return null;
                                }
                            }
                        }
                    }
                    break;
                }
                return new w3b(l8bVar);
            case 8:
                return o(fkaVar);
        }
    }

    @Override // defpackage.em9
    public Map k(Map map) {
        return map == null ? new LinkedHashMap() : map;
    }

    public /* synthetic */ nhb(int i2) {
        this.a = i2;
    }
}
