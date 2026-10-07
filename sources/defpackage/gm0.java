package defpackage;

import android.app.Application;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.TextView;
import androidx.media3.common.PlaybackException;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.components.DependencyCycleException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.a;
import one.me.android.initialization.AccountInitializer;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class gm0 {
    public static ExecutorService a;
    public static final e31 b = new e31();
    public static final ste c = new ste("CRASH_REPORT", 2);
    public static final p3c d = new p3c(12, (Object) null);
    public static final ia5 e = new ia5(1);
    public static volatile a4c f;
    public static String g;
    public static int h;
    public static Boolean i;
    public static boolean j;

    public static int A(int i2) {
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 32) {
            return 5;
        }
        if (i2 == 64) {
            return 6;
        }
        if (i2 == 128) {
            return 7;
        }
        if (i2 == 256) {
            return 8;
        }
        if (i2 == 512) {
            return 9;
        }
        ore.p(zo5.h(i2, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    public static h3d B(h3d h3dVar, h3d h3dVar2) {
        if (h3dVar != null) {
            cx6 cx6Var = h3dVar.a;
            if (h3dVar2 != null) {
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i2 = 0; i2 < cx6Var.a.size(); i2++) {
                    if (h3dVar2.a(cx6Var.b(i2))) {
                        int iB = cx6Var.b(i2);
                        lvb.b0(!false);
                        sparseBooleanArray.append(iB, true);
                    }
                }
                lvb.b0(!false);
                return new h3d(new cx6(sparseBooleanArray));
            }
        }
        return h3d.b;
    }

    public static final boolean C(long j2) {
        return (j2 & 8) != 0;
    }

    public static final void D(je9 je9Var, String str, String str2, Object... objArr) {
        switch (je9Var.ordinal()) {
            case 0:
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                je9 je9Var2 = je9.c;
                a4c a4cVar = f;
                if (a4cVar != null) {
                    if (objArrCopyOf.length != 0) {
                        a4c.f(a4cVar, je9Var2, str, str2, objArrCopyOf, null, 16);
                    } else {
                        a4cVar.c(je9Var2, str, str2, null);
                    }
                    break;
                }
                break;
            case 1:
                m(str, str2, Arrays.copyOf(objArr, objArr.length));
                break;
            case 2:
                y(str, str2, Arrays.copyOf(objArr, objArr.length));
                break;
            case 3:
                W(str, str2, Arrays.copyOf(objArr, objArr.length));
                break;
            case 4:
                s(str, str2, Arrays.copyOf(objArr, objArr.length));
                break;
            case 5:
            case 6:
                Object[] objArrCopyOf2 = Arrays.copyOf(objArr, objArr.length);
                a4c a4cVar2 = f;
                if (a4cVar2 != null) {
                    a4c.f(a4cVar2, je9.h, str, str2, objArrCopyOf2, null, 16);
                }
                break;
            default:
                ore.o();
                break;
        }
    }

    public static c4d E(c4d c4dVar, c4d c4dVar2, a4d a4dVar, h3d h3dVar, boolean z, xnf xnfVar) {
        c4d c4dVarB;
        fzh fzhVar;
        boolean z2;
        if (a4dVar.a && h3dVar.a(17)) {
            ush ushVar = c4dVar.j;
            qyj.l("Invalid PlayerInfo update, old index: " + c4dVar.c.a.b + " (count=" + ushVar.o() + "), new index = " + c4dVar2.c.a.b + ", sent from " + xnfVar.a.getPackageName() + ", interface version=" + xnfVar.a.e(), ushVar.p() || c4dVar2.c.a.b < ushVar.o());
            c4dVarB = c4dVar2.k(ushVar);
        } else {
            c4dVarB = c4dVar2;
        }
        if (a4dVar.b && h3dVar.a(30)) {
            c4dVarB = c4dVarB.b(c4dVar.F);
        }
        if (!z || c4dVar2.n != 0.0f) {
            return c4dVarB;
        }
        float f2 = c4dVar.o;
        PlaybackException playbackException = c4dVarB.a;
        int i2 = c4dVarB.b;
        umf umfVar = c4dVarB.c;
        k3d k3dVar = c4dVarB.d;
        k3d k3dVar2 = c4dVarB.e;
        int i3 = c4dVarB.f;
        s2d s2dVar = c4dVarB.g;
        int i4 = c4dVarB.h;
        boolean z3 = c4dVarB.i;
        ush ushVar2 = c4dVarB.j;
        int i5 = c4dVarB.k;
        k4j k4jVar = c4dVarB.l;
        b0a b0aVar = c4dVarB.m;
        float f3 = c4dVarB.n;
        int i6 = c4dVarB.p;
        p70 p70Var = c4dVarB.q;
        zy4 zy4Var = c4dVarB.r;
        ok5 ok5Var = c4dVarB.s;
        int i7 = c4dVarB.t;
        boolean z4 = c4dVarB.u;
        boolean z5 = c4dVarB.v;
        int i8 = c4dVarB.w;
        boolean z6 = c4dVarB.x;
        boolean z7 = c4dVarB.y;
        int i9 = c4dVarB.z;
        int i10 = c4dVarB.A;
        b0a b0aVar2 = c4dVarB.B;
        long j2 = c4dVarB.C;
        long j3 = c4dVarB.D;
        long j4 = c4dVarB.E;
        fzh fzhVar2 = c4dVarB.F;
        ryh ryhVar = c4dVarB.G;
        if (!ushVar2.p()) {
            fzhVar = fzhVar2;
            if (umfVar.a.b >= ushVar2.o()) {
                z2 = false;
            }
            lvb.b0(z2);
            return new c4d(playbackException, i2, umfVar, k3dVar, k3dVar2, i3, s2dVar, i4, z3, k4jVar, ushVar2, i5, b0aVar, f3, f2, p70Var, i6, zy4Var, ok5Var, i7, z4, z5, i8, i9, i10, z6, z7, b0aVar2, j2, j3, j4, fzhVar, ryhVar);
        }
        fzhVar = fzhVar2;
        z2 = true;
        lvb.b0(z2);
        return new c4d(playbackException, i2, umfVar, k3dVar, k3dVar2, i3, s2dVar, i4, z3, k4jVar, ushVar2, i5, b0aVar, f3, f2, p70Var, i6, zy4Var, ok5Var, i7, z4, z5, i8, i9, i10, z6, z7, b0aVar2, j2, j3, j4, fzhVar, ryhVar);
    }

    /* JADX WARN: Code duplicated, block: B:209:0x0257 A[EXC_TOP_SPLITTER, PHI: r21
  0x0257: PHI (r21v14 int) = (r21v0 int), (r21v1 int), (r21v2 int), (r21v3 int), (r21v12 int), (r21v15 int) binds: [B:157:0x0255, B:136:0x01ff, B:132:0x01ef, B:251:?, B:250:?, B:48:0x00bb] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v25, types: [iv4] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v55, types: [iv4] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [ia4, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public static ia4 F(fka fkaVar) {
        int iU;
        ?? X;
        int i2;
        int i3;
        ?? r19;
        int iU2;
        long jT;
        Iterator it;
        int i4;
        ge3 ge3VarC;
        int i5;
        int i6 = 1;
        ?? r8 = 0;
        try {
            iU = ch3.U(fkaVar);
        } catch (Throwable th) {
            V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it2 = fjf.a.iterator();
            while (it2.hasNext()) {
                AccountInitializer accountInitializer = ((n6) it2.next()).a;
                try {
                    V("Payload", "error while parse payload", th);
                    accountInitializer.d().i().g().a(null, th);
                } catch (Throwable th2) {
                    V("Payload", "failed to collect exception", th2);
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
        Map mapE = s66.a;
        String strX = null;
        l8b l8bVar = null;
        lni lniVarD = null;
        Map mapE2 = null;
        int i7 = 0;
        while (i7 < iU) {
            try {
                X = ch3.X(fkaVar, r8);
            } catch (Throwable th3) {
                V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                Iterator it3 = fjf.a.iterator();
                while (it3.hasNext()) {
                    AccountInitializer accountInitializer2 = ((n6) it3.next()).a;
                    try {
                        V("Payload", "error while parse payload", th3);
                        accountInitializer2.d().i().g().a(r8, th3);
                    } catch (Throwable th4) {
                        V("Payload", "failed to collect exception", th4);
                    }
                }
                int iD2 = qt4.D(pye.a);
                if (iD2 != 0) {
                    if (iD2 == i6) {
                        throw th3;
                    }
                    ore.o();
                    return r8;
                }
                X = r8;
            }
            if (X != 0) {
                switch (X.hashCode()) {
                    case -905826493:
                        i2 = iU;
                        if (!X.equals("server")) {
                            try {
                                fkaVar.x();
                            } catch (Throwable th5) {
                                V("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                                Iterator it4 = fjf.a.iterator();
                                while (it4.hasNext()) {
                                    AccountInitializer accountInitializer3 = ((n6) it4.next()).a;
                                    try {
                                        V("Payload", "error while parse payload", th5);
                                        accountInitializer3.d().i().g().a(null, th5);
                                    } catch (Throwable th6) {
                                        V("Payload", "failed to collect exception", th6);
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
                            i3 = 1;
                            r19 = 0;
                        } else {
                            i3 = 1;
                            r19 = 0;
                            mapE = jol.e(fkaVar);
                        }
                        break;
                    case 3195150:
                        i2 = iU;
                        if (!X.equals("hash")) {
                            fkaVar.x();
                            break;
                        } else {
                            try {
                                strX = ch3.X(fkaVar, null);
                            } catch (Throwable th7) {
                                V("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                                Iterator it5 = fjf.a.iterator();
                                while (it5.hasNext()) {
                                    AccountInitializer accountInitializer4 = ((n6) it5.next()).a;
                                    try {
                                        V("Payload", "error while parse payload", th7);
                                        accountInitializer4.d().i().g().a(null, th7);
                                    } catch (Throwable th8) {
                                        V("Payload", "failed to collect exception", th8);
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
                                strX = null;
                            }
                        }
                        i3 = 1;
                        r19 = 0;
                        break;
                    case 3599307:
                        i2 = iU;
                        if (!X.equals("user")) {
                            fkaVar.x();
                        } else {
                            lniVarD = jol.d(fkaVar);
                        }
                        i3 = 1;
                        r19 = 0;
                        break;
                    case 94623771:
                        if (!X.equals("chats")) {
                            i2 = iU;
                            fkaVar.x();
                            i3 = 1;
                            r19 = 0;
                        } else {
                            try {
                                iU2 = ch3.U(fkaVar);
                            } catch (Throwable th9) {
                                V("ServerPayload/PayloadCatching", "payloadCatching catch error", th9);
                                Iterator it6 = fjf.a.iterator();
                                while (it6.hasNext()) {
                                    AccountInitializer accountInitializer5 = ((n6) it6.next()).a;
                                    try {
                                        V("Payload", "error while parse payload", th9);
                                        accountInitializer5.d().i().g().a(r8, th9);
                                    } catch (Throwable th10) {
                                        V("Payload", "failed to collect exception", th10);
                                    }
                                }
                                int iD5 = qt4.D(pye.a);
                                if (iD5 != 0) {
                                    if (iD5 == i6) {
                                        throw th9;
                                    }
                                    ore.o();
                                    return r8;
                                }
                                iU2 = 0;
                            }
                            l8b l8bVar2 = new l8b(iU2);
                            int i8 = 0;
                            ?? r9 = r8;
                            while (i8 < iU2) {
                                try {
                                    jT = ch3.T(fkaVar, 0L);
                                } catch (Throwable th11) {
                                    V("ServerPayload/PayloadCatching", "payloadCatching catch error", th11);
                                    Iterator it7 = fjf.a.iterator();
                                    while (it7.hasNext()) {
                                        AccountInitializer accountInitializer6 = ((n6) it7.next()).a;
                                        try {
                                            V("Payload", "error while parse payload", th11);
                                            it = it7;
                                            try {
                                                accountInitializer6.d().i().g().a(null, th11);
                                            } catch (Throwable th12) {
                                                th = th12;
                                                V("Payload", "failed to collect exception", th);
                                                it7 = it;
                                            }
                                        } catch (Throwable th13) {
                                            th = th13;
                                            it = it7;
                                        }
                                        it7 = it;
                                    }
                                    int iD6 = qt4.D(pye.a);
                                    if (iD6 != 0) {
                                        if (iD6 == 1) {
                                            throw th11;
                                        }
                                        ore.o();
                                        return null;
                                    }
                                    jT = 0;
                                }
                                try {
                                    ge3VarC = ge3.c(fkaVar);
                                    i4 = iU;
                                } catch (Throwable th14) {
                                    V("ServerPayload/PayloadCatching", "payloadCatching catch error", th14);
                                    Iterator it8 = fjf.a.iterator();
                                    while (it8.hasNext()) {
                                        AccountInitializer accountInitializer7 = ((n6) it8.next()).a;
                                        try {
                                            V("Payload", "error while parse payload", th14);
                                            i5 = iU;
                                            try {
                                                accountInitializer7.d().i().g().a(null, th14);
                                            } catch (Throwable th15) {
                                                th = th15;
                                                V("Payload", "failed to collect exception", th);
                                                iU = i5;
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            i5 = iU;
                                        }
                                        iU = i5;
                                    }
                                    i4 = iU;
                                    int iD7 = qt4.D(pye.a);
                                    if (iD7 != 0) {
                                        if (iD7 == 1) {
                                            throw th14;
                                        }
                                        ore.o();
                                        return null;
                                    }
                                    ge3VarC = null;
                                }
                                if (ge3VarC != null) {
                                    l8bVar2.i(jT, ge3VarC);
                                }
                                i8++;
                                iU = i4;
                                i6 = 1;
                                r9 = 0;
                                break;
                            }
                            i2 = iU;
                            r19 = r9;
                            l8bVar = l8bVar2;
                            i3 = i6;
                        }
                        break;
                    case 1649517590:
                        if (!X.equals("experiments")) {
                            i2 = iU;
                            fkaVar.x();
                            i3 = 1;
                            r19 = 0;
                        } else {
                            mapE2 = jol.e(fkaVar);
                            r19 = r8;
                            i2 = iU;
                            i3 = i6;
                        }
                        break;
                    default:
                        i2 = iU;
                        fkaVar.x();
                        i3 = 1;
                        r19 = 0;
                        break;
                }
            } else {
                r19 = r8;
                i2 = iU;
                i3 = i6;
            }
            i7++;
            i6 = i3;
            r8 = r19;
            iU = i2;
        }
        return new ia4(strX, new v56(mapE), l8bVar, lniVarD, mapE2);
    }

    public static final String I(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i2 = reader.read(cArr);
        while (i2 >= 0) {
            stringWriter.write(cArr, 0, i2);
            i2 = reader.read(cArr);
        }
        return stringWriter.toString();
    }

    public static int J(double d2) {
        if (Double.isNaN(d2)) {
            ore.p("Cannot round NaN value.");
            return 0;
        }
        if (d2 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d2 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d2);
    }

    public static int K(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        ore.p("Cannot round NaN value.");
        return 0;
    }

    public static long L(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        ore.p("Cannot round NaN value.");
        return 0L;
    }

    public static void M(l3d l3dVar, j2a j2aVar) {
        int i2 = j2aVar.b;
        long j2 = j2aVar.c;
        c98 c98Var = j2aVar.a;
        if (i2 == -1) {
            if (l3dVar.c(20)) {
                l3dVar.K(c98Var);
                return;
            } else {
                if (c98Var.isEmpty()) {
                    return;
                }
                l3dVar.G((ry9) c98Var.get(0));
                return;
            }
        }
        if (l3dVar.c(20)) {
            l3dVar.x(j2aVar.b, j2, c98Var);
        } else {
            if (c98Var.isEmpty()) {
                return;
            }
            l3dVar.h((ry9) c98Var.get(0), j2);
        }
    }

    public static String N(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    public static final void O(gdi gdiVar) {
        gdiVar.d(841, new fc1(21));
        gdiVar.d(838, new jld(13));
        gdiVar.d(842, new ci3(19));
        gdiVar.d(843, new ci3(21));
        gdiVar.d(847, new jld(11));
        gdiVar.d(848, new fc1(25));
        gdiVar.d(845, new fc1(22));
        gdiVar.d(849, new vfg(4));
        gdiVar.d(850, new r1i(15));
        gdiVar.d(857, new fc1(11));
        gdiVar.d(855, new fc1(26));
        gdiVar.d(854, new fc1(29));
        gdiVar.d(851, new fc1(18));
        gdiVar.d(860, new r1i(27));
        gdiVar.d(859, new fc1(28));
        gdiVar.d(858, new fc1(13));
        gdiVar.d(861, new fc1(12));
        gdiVar.d(865, new fc1(19));
        gdiVar.d(866, new dp0(3));
        gdiVar.d(867, new g(4));
        gdiVar.d(868, new t62(0));
        gdiVar.d(864, new b7c(21));
        gdiVar.d(862, new fc1(16));
        gdiVar.d(863, new fc1(17));
        gdiVar.b(3, new f(16));
        gdiVar.d(871, new fc1(6));
        gdiVar.d(872, new fc1(7));
        gdiVar.d(64, new fc1(8));
        gdiVar.d(873, new fc1(9));
        gdiVar.d(874, new fc1(10));
        gdiVar.b(4, new f(17));
        gdiVar.b(4, new f(18));
        gdiVar.b(4, new f(19));
        gdiVar.b(4, new f(20));
        gdiVar.d(839, new cp0(11));
        gdiVar.d(840, new cp0(12));
        gdiVar.d(844, new cp0(13));
        gdiVar.d(846, new cp0(14));
        gdiVar.d(852, new cp0(15));
        gdiVar.d(853, new cp0(16));
        gdiVar.d(856, new f(21));
    }

    public static final void P(gdi gdiVar) {
        gdiVar.d(938, new zc9(28));
        gdiVar.d(939, new t62(24));
        gdiVar.d(940, new l65(2));
        gdiVar.d(941, new b7c(2));
        gdiVar.b(3, new nx9(7));
    }

    public static final void Q(gdi gdiVar) {
        gdiVar.d(9, new b7c(6));
        gdiVar.d(11, new b7c(7));
        gdiVar.d(13, new b7c(8));
        gdiVar.d(14, new pwb(4));
        gdiVar.d(15, new b7c(9));
        gdiVar.d(16, new b7c(10));
        gdiVar.d(17, new b7c(11));
        gdiVar.d(18, new b7c(12));
        gdiVar.d(19, new b7c(13));
        gdiVar.d(20, new b7c(14));
        gdiVar.d(21, new rwb(8));
        gdiVar.d(22, new b7c(5));
    }

    public static final void R(gdi gdiVar) {
        gdiVar.d(904, new g7f(20));
        gdiVar.d(902, new g(1));
        gdiVar.d(905, new eaf(1));
        gdiVar.d(906, new eaf(2));
        gdiVar.d(907, new eaf(3));
    }

    public static final void S(gdi gdiVar) {
        gdiVar.d(264, new qqg(4));
        gdiVar.d(265, new qqg(5));
        gdiVar.d(266, new qqg(6));
        gdiVar.d(267, new qqg(7));
        gdiVar.d(268, new qqg(8));
        gdiVar.d(269, new qqg(9));
        gdiVar.d(270, new qqg(10));
        gdiVar.d(271, new qqg(11));
        gdiVar.d(272, new qqg(12));
        gdiVar.d(273, new qqg(1));
        gdiVar.d(274, new eaf(17));
        gdiVar.d(275, new eaf(18));
        gdiVar.d(276, new eaf(19));
        gdiVar.d(277, new eaf(20));
        gdiVar.d(278, new qqg(2));
        gdiVar.d(279, new eaf(21));
        gdiVar.d(280, new eaf(22));
        gdiVar.d(281, new eaf(23));
        gdiVar.d(282, new qqg(3));
        gdiVar.d(283, new bwf(24));
    }

    public static final void T(String str, String str2, Throwable th) {
        a4c a4cVar = f;
        if (a4cVar != null) {
            a4c.f(a4cVar, je9.c, str, str2, null, th, 8);
        }
    }

    public static void U(String str, String str2) {
        Object[] objArr = new Object[0];
        je9 je9Var = je9.c;
        a4c a4cVar = f;
        if (a4cVar == null) {
            return;
        }
        if (objArr.length == 0) {
            a4cVar.c(je9Var, str, str2, null);
        } else {
            a4c.f(a4cVar, je9Var, str, str2, objArr, null, 16);
        }
    }

    public static final void V(String str, String str2, Throwable th) {
        a4c a4cVar = f;
        if (a4cVar != null) {
            a4c.f(a4cVar, je9.f, str, str2, null, th, 8);
        }
    }

    public static final void W(String str, String str2, Object... objArr) {
        X(str, null, str2, Arrays.copyOf(objArr, objArr.length));
    }

    public static final void X(String str, Throwable th, String str2, Object... objArr) {
        je9 je9Var = je9.f;
        a4c a4cVar = f;
        if (a4cVar == null) {
            return;
        }
        if (objArr.length == 0) {
            a4c.f(a4cVar, je9Var, str, str2, null, th, 8);
        } else {
            a4cVar.e(je9Var, str, str2, objArr, th);
        }
    }

    public static /* synthetic */ void Y(String str, String str2) {
        W(str, str2, new Object[0]);
    }

    public static final tj0 a(CharSequence charSequence, Long l) {
        if ((l == null || l.longValue() == 0) && charSequence == null) {
            return tj0.c;
        }
        long jLongValue = l != null ? l.longValue() : 0L;
        if (charSequence == null) {
            charSequence = "";
        }
        return new tj0(charSequence, jLongValue);
    }

    public static void b(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th != th2) {
            Integer num = eo8.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = m2d.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final boolean c() {
        a4c a4cVar = f;
        if (a4cVar != null) {
            return ((Boolean) a4cVar.d.getValue()).booleanValue();
        }
        return false;
    }

    public static boolean d(umf umfVar, umf umfVar2) {
        k3d k3dVar = umfVar.a;
        int i2 = k3dVar.b;
        k3d k3dVar2 = umfVar2.a;
        return i2 == k3dVar2.b && k3dVar.e == k3dVar2.e && k3dVar.h == k3dVar2.h && k3dVar.i == k3dVar2.i;
    }

    public static int e(long j2, long j3) {
        if (j2 == -9223372036854775807L || j3 == -9223372036854775807L) {
            return 0;
        }
        if (j3 == 0) {
            return 100;
        }
        return vqi.j(vqi.c0(j2, j3), 0, 100);
    }

    public static final void g(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            StringBuilder sbS = qt4.s(j2, "size=", " offset=");
            sbS.append(j3);
            throw new ArrayIndexOutOfBoundsException(qt4.k(j4, " byteCount=", sbS));
        }
    }

    public static List h(List list, long j2, boolean z) {
        if (list.size() == 1 && j2 <= ((kw7) ww3.r1(list)).getC()) {
            return list;
        }
        int size = list.size();
        boolean z2 = false;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            kw7 kw7Var = (kw7) list.get(i3);
            if ((kw7Var instanceof jw7) || i3 == xw3.O0(list)) {
                if (z && (j2 == BuildConfig.MAX_TIME_TO_UPLOAD || j2 >= kw7Var.getC())) {
                    return list.subList(i2, i3 + 1);
                }
                if ((z2 && (j2 <= kw7Var.getC() || j2 <= ((kw7) list.get(i3 - 1)).getC())) || j2 == kw7Var.getC()) {
                    return list.subList(i2, i3 + 1);
                }
                if (z2 && i3 == xw3.O0(list) && !(kw7Var instanceof jw7) && (j2 == BuildConfig.MAX_TIME_TO_UPLOAD || j2 >= kw7Var.getC())) {
                    return list.subList(i2, i3 + 1);
                }
                z2 = false;
                i2 = i3;
            } else if (j2 >= kw7Var.getC() || (j2 <= kw7Var.getC() && i3 == 0)) {
                z2 = true;
            }
        }
        return Collections.singletonList(new jw7());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(View view, kbc kbcVar) {
        Object poeVar;
        kx6 kx6Var;
        kx6 kx6Var2;
        b76 b76Var = b76.a;
        if (view instanceof eph) {
            ((eph) view).onThemeChanged(kbcVar);
            return;
        }
        if (!(view instanceof RecyclerView)) {
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                CharSequence text = textView.getText();
                if (text != null) {
                    vd7.h(text, kbcVar);
                }
                f55.f(textView, kbcVar);
                return;
            }
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        int itemDecorationCount = recyclerView.getItemDecorationCount();
        int i2 = 0;
        boolean z = false;
        while (true) {
            Collection linkedHashSet = null;
            if (i2 >= itemDecorationCount) {
                if (z) {
                    n1g.Q(recyclerView, new e6(2, view), null, 5);
                }
                try {
                    Field declaredField = RecyclerView.class.getDeclaredField(DatabaseHelper.COMPRESSED_COLUMN_NAME);
                    declaredField.setAccessible(true);
                    cfe cfeVar = (cfe) declaredField.get(recyclerView);
                    Field declaredField2 = cfe.class.getDeclaredField("a");
                    declaredField2.setAccessible(true);
                    Object obj = declaredField2.get(cfeVar);
                    List list = obj instanceof List ? (List) obj : null;
                    List list2 = r66.a;
                    if (list == null) {
                        list = list2;
                    }
                    Field declaredField3 = cfe.class.getDeclaredField(DatabaseHelper.COMPRESSED_COLUMN_NAME);
                    declaredField3.setAccessible(true);
                    Object obj2 = declaredField3.get(cfeVar);
                    List list3 = obj2 instanceof List ? (List) obj2 : null;
                    if (list3 != null) {
                        list2 = list3;
                    }
                    nee adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        hj8 hj8VarF0 = oc9.f0(0, adapter.l());
                        linkedHashSet = new LinkedHashSet();
                        Iterator it = hj8VarF0.iterator();
                        while (((gj8) it).c) {
                            linkedHashSet.add(Integer.valueOf(adapter.n(((gj8) it).nextInt())));
                        }
                    }
                    if (linkedHashSet == null) {
                        linkedHashSet = c76.a;
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        int iIntValue = ((Number) it2.next()).intValue();
                        lfe recycledView = recyclerView.getRecycledViewPool().getRecycledView(iIntValue);
                        cx3.b1(arrayList, recycledView == null ? b76Var : new rj7(new ap9(26, recycledView), 0, new aa(recyclerView, iIntValue, 0)));
                    }
                    ohf ohfVarK0 = a.K0(new List[]{list, list2});
                    nre nreVar = new nre(2);
                    if (ohfVarK0 instanceof m2i) {
                        m2i m2iVar = (m2i) ohfVarK0;
                        kx6Var = new kx6(m2iVar.a, m2iVar.b, nreVar);
                    } else {
                        kx6Var = new kx6(ohfVarK0, new nre(3), nreVar);
                    }
                    ohf ohfVarK1 = a.K0(new ohf[]{kx6Var, new sw(1, arrayList)});
                    nre nreVar2 = new nre(4);
                    if (ohfVarK1 instanceof m2i) {
                        m2i m2iVar2 = (m2i) ohfVarK1;
                        kx6Var2 = new kx6(m2iVar2.a, m2iVar2.b, nreVar2);
                    } else {
                        kx6Var2 = new kx6(ohfVarK1, new nre(3), nreVar2);
                    }
                    poeVar = new m2i(kx6Var2, new c6(5));
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                Object obj3 = b76Var;
                if (!(poeVar instanceof poe)) {
                    obj3 = poeVar;
                }
                yhf.k0(yhf.t0(new kx6((ohf) obj3, new ol(new c6(4), 24, new z9(0, kbcVar)), cif.a), new z9(1, kbcVar)));
                return;
            }
            int itemDecorationCount2 = recyclerView.getItemDecorationCount();
            if (i2 < 0 || i2 >= itemDecorationCount2) {
                throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount2);
            }
            Object obj4 = (tee) recyclerView.p.get(i2);
            eph ephVar = obj4 instanceof eph ? (eph) obj4 : null;
            if (ephVar != null) {
                ephVar.onThemeChanged(kbcVar);
                z = true;
            }
            i2++;
            z = z;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    public static final i0g j(xx6 xx6Var, int i2) {
        hr2.V.getClass();
        int i3 = gr2.b;
        if (i2 >= i3) {
            i3 = i2;
        }
        int i4 = i3 - i2;
        if (xx6Var instanceof mr2) {
            mr2 mr2Var = (mr2) xx6Var;
            int i5 = mr2Var.c;
            xx6 xx6VarI = mr2Var.i();
            if (xx6VarI != null) {
                int i6 = mr2Var.b;
                if (i6 != -3 && i6 != -2 && i6 != 0) {
                    i4 = i6;
                } else if (i5 == 1) {
                    if (i6 == 0) {
                        i4 = 0;
                    }
                } else if (i2 == 0) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                return new i0g(i4, i5, mr2Var.a, xx6VarI);
            }
        }
        return new i0g(i4, 1, k66.a, xx6Var);
    }

    public static final void k(String str, af7 af7Var) {
        a4c a4cVar = f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, (String) af7Var.invoke(), null);
        }
    }

    public static final void l(String str, String str2, Throwable th) {
        a4c a4cVar = f;
        if (a4cVar != null) {
            a4c.f(a4cVar, je9.d, str, str2, null, th, 8);
        }
    }

    public static final void m(String str, String str2, Object... objArr) {
        je9 je9Var = je9.d;
        a4c a4cVar = f;
        if (a4cVar == null) {
            return;
        }
        if (objArr.length == 0) {
            a4cVar.c(je9Var, str, str2, null);
        } else {
            a4c.f(a4cVar, je9Var, str, str2, objArr, null, 16);
        }
    }

    public static /* synthetic */ void n(String str, String str2) {
        m(str, str2, new Object[0]);
    }

    public static void o(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (c05 c05Var : (Set) it2.next()) {
                        for (ph5 ph5Var : c05Var.a.c) {
                            if (ph5Var.c == 0) {
                                Set<c05> set = (Set) map.get(new d05(ph5Var.a, ph5Var.b == 2));
                                if (set != null) {
                                    for (c05 c05Var2 : set) {
                                        c05Var.b.add(c05Var2);
                                        c05Var2.c.add(c05Var);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<c05> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (c05 c05Var3 : hashSet) {
                    if (c05Var3.c.isEmpty()) {
                        hashSet2.add(c05Var3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    c05 c05Var4 = (c05) hashSet2.iterator().next();
                    hashSet2.remove(c05Var4);
                    i2++;
                    for (c05 c05Var5 : c05Var4.b) {
                        c05Var5.c.remove(c05Var4);
                        if (c05Var5.c.isEmpty()) {
                            hashSet2.add(c05Var5);
                        }
                    }
                }
                if (i2 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (c05 c05Var6 : hashSet) {
                    if (!c05Var6.c.isEmpty() && !c05Var6.b.isEmpty()) {
                        arrayList2.add(c05Var6.a);
                    }
                }
                throw new DependencyCycleException(arrayList2);
            }
            v64 v64Var = (v64) it.next();
            c05 c05Var7 = new c05(v64Var);
            for (x0e x0eVar : v64Var.b) {
                boolean z = v64Var.e == 0;
                d05 d05Var = new d05(x0eVar, !z);
                if (!map.containsKey(d05Var)) {
                    map.put(d05Var, new HashSet());
                }
                Set set2 = (Set) map.get(d05Var);
                if (!set2.isEmpty() && z) {
                    qr7.i(x0eVar, ".", "Multiple components provide ");
                    return;
                }
                set2.add(c05Var7);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a3  */
    public static final int p(iue iueVar, bne bneVar, p76 p76Var, int i2) {
        float f2;
        int i3;
        int i4;
        int i5;
        int i6 = 1;
        if (!p76.I(p76Var)) {
            return 1;
        }
        if (!p76.I(p76Var)) {
            ore.k("Check failed.");
            return 0;
        }
        if (bneVar != null) {
            int i7 = bneVar.a;
            int i8 = bneVar.b;
            if (i8 <= 0 || i7 <= 0) {
                f2 = 1.0f;
            } else {
                p76Var.Y();
                if (p76Var.e != 0) {
                    p76Var.Y();
                    if (p76Var.f == 0) {
                        f2 = 1.0f;
                    } else {
                        if (iueVar.a == -1) {
                            p76Var.Y();
                            i3 = p76Var.c;
                            if (i3 != 0 && i3 != 90 && i3 != 180 && i3 != 270) {
                                ore.k("Check failed.");
                                return 0;
                            }
                        } else {
                            i3 = 0;
                        }
                        boolean z = i3 == 90 || i3 == 270;
                        if (z) {
                            p76Var.Y();
                            i4 = p76Var.f;
                        } else {
                            p76Var.Y();
                            i4 = p76Var.e;
                        }
                        if (z) {
                            p76Var.Y();
                            i5 = p76Var.e;
                        } else {
                            p76Var.Y();
                            i5 = p76Var.f;
                        }
                        float f3 = i7 / i4;
                        float f4 = i8 / i5;
                        f2 = f3 < f4 ? f4 : f3;
                        pj6.h("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i4), Integer.valueOf(i5), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f2));
                    }
                } else {
                    f2 = 1.0f;
                }
            }
        } else {
            f2 = 1.0f;
        }
        p76Var.Y();
        int i9 = 2;
        if (p76Var.b == kb5.a) {
            if (f2 <= 0.6666667f) {
                i6 = 2;
                while (true) {
                    int i10 = i6 * 2;
                    double d2 = 1.0d / ((double) i10);
                    if ((d2 * 0.3333333432674408d) + d2 <= f2) {
                        break;
                    }
                    i6 = i10;
                }
            }
        } else if (f2 <= 0.6666667f) {
            while (true) {
                double d3 = i9;
                if (((1.0d / (Math.pow(d3, 2.0d) - d3)) * 0.3333333432674408d) + (1.0d / d3) <= f2) {
                    break;
                }
                i9++;
            }
            i6 = i9 - 1;
        }
        p76Var.Y();
        int i11 = p76Var.f;
        p76Var.Y();
        int iMax = Math.max(i11, p76Var.e);
        float f5 = bneVar != null ? bneVar.c : i2;
        while (iMax / i6 > f5) {
            p76Var.Y();
            i6 = p76Var.b == kb5.a ? i6 * 2 : i6 + 1;
        }
        return i6;
    }

    public static final void q(String str, String str2) {
        a4c a4cVar = f;
        if (a4cVar != null) {
            je9 je9Var = je9.g;
            if (str2 == null) {
                str2 = "";
            }
            a4c.f(a4cVar, je9Var, str, str2, null, null, 8);
        }
    }

    public static final void r(String str, String str2, Throwable th) {
        a4c a4cVar = f;
        if (a4cVar != null) {
            a4c.f(a4cVar, je9.g, str, str2, null, th, 8);
        }
    }

    public static final void s(String str, String str2, Object... objArr) {
        a4c a4cVar = f;
        if (a4cVar != null) {
            a4c.f(a4cVar, je9.g, str, str2, objArr, null, 16);
        }
    }

    public static synchronized Executor t() {
        try {
            if (a == null) {
                String str = vqi.a;
                a = Executors.newSingleThreadExecutor(new ct5(2, "ExoPlayer:BackgroundExecutor"));
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public static String u() throws Throwable {
        BufferedReader bufferedReader;
        if (g == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                g = Application.getProcessName();
            } else {
                int iMyPid = h;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    h = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        StringBuilder sb = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                        sb.append("/proc/");
                        sb.append(iMyPid);
                        sb.append("/cmdline");
                        String string = sb.toString();
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(string));
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            try {
                                String line = bufferedReader.readLine();
                                yab.s(line);
                                strTrim = line.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                n2m.a(bufferedReader2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th2;
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    n2m.a(bufferedReader);
                }
                g = strTrim;
            }
        }
        return g;
    }

    public static long v(c4d c4dVar, long j2, long j3, long j4) {
        umf umfVar = c4dVar.c;
        umf umfVar2 = c4dVar.c;
        boolean z = umfVar.equals(umf.l) || j3 < umfVar2.c;
        if (c4dVar.x) {
            if (z || j2 == -9223372036854775807L) {
                if (j4 == -9223372036854775807L) {
                    j4 = SystemClock.elapsedRealtime() - umfVar2.c;
                }
                long j5 = umfVar2.a.f + ((long) (j4 * c4dVar.g.a));
                long j6 = umfVar2.d;
                return j6 != -9223372036854775807L ? Math.min(j5, j6) : j5;
            }
        } else if (z || j2 == -9223372036854775807L) {
            return umfVar2.a.f;
        }
        return j2;
    }

    public static boolean w(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    public static final void x(String str, String str2, Throwable th) {
        a4c a4cVar = f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (str2 == null) {
                str2 = "";
            }
            a4c.f(a4cVar, je9Var, str, str2, null, th, 8);
        }
    }

    public static final void y(String str, String str2, Object... objArr) {
        je9 je9Var = je9.e;
        a4c a4cVar = f;
        if (a4cVar == null) {
            return;
        }
        if (objArr.length == 0) {
            a4cVar.c(je9Var, str, str2, null);
        } else {
            a4c.f(a4cVar, je9Var, str, str2, objArr, null, 16);
        }
    }

    public abstract void G(int i2);

    public abstract void H(Typeface typeface);

    public void f(final int i2) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: lne
            @Override // java.lang.Runnable
            public final void run() {
                this.a.G(i2);
            }
        });
    }
}
