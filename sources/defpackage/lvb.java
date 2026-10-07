package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.a;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.serialization.SerializationException;
import one.me.sdk.richvector.VectorPath;
import ru.ok.android.onelog.OneLogImpl;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class lvb implements r55, v74 {
    public static volatile so b;
    public static final String[] c = {"EXYNOS 850", "EXYNOS 7872", "EXYNOS 7880", "EXYNOS 7870", "MSM8953", "MSM8937", "MSM8940", "MSM8992", "MSM8952", "MSM8917", "SDM439"};
    public static final Object d = new Object();
    public static final String[] e = {"/proc/self", "/data/data/ru.oneme.app"};
    public final /* synthetic */ int a;

    public /* synthetic */ lvb(int i) {
        this.a = i;
    }

    public static final void A0(hsi hsiVar, String str, int i) {
        VectorPath vectorPathFindPath = hsiVar.findPath(str);
        if (vectorPathFindPath != null) {
            vectorPathFindPath.setFillColor(i);
            hsiVar.invalidatePath();
        }
    }

    public static final void B0(hsi hsiVar, String str, int i) {
        VectorPath vectorPathFindPath = hsiVar.findPath(str);
        if (vectorPathFindPath != null) {
            vectorPathFindPath.setStrokeColor(i);
            hsiVar.invalidatePath();
        }
    }

    public static final Object D0(ysh yshVar, qf7 qf7Var) {
        vd7.D(yshVar, new qo5(rx8.D(yshVar.f.getContext()).t0(yshVar.g, yshVar, yshVar.e)));
        return f55.x(yshVar, false, yshVar, qf7Var);
    }

    public static final w0k E0(qs8 qs8Var, fif fifVar) {
        lvb lvbVarD = fifVar.d();
        if (lvbVarD instanceof tad) {
            return w0k.POLY_OBJ;
        }
        if (cqk.d(lvbVarD, c6h.g)) {
            return w0k.LIST;
        }
        if (!cqk.d(lvbVarD, c6h.h)) {
            return w0k.OBJ;
        }
        fif fifVarL = L(qs8Var.b, fifVar.h(0));
        lvb lvbVarD2 = fifVarL.d();
        if ((lvbVarD2 instanceof rhd) || cqk.d(lvbVarD2, lif.f)) {
            return w0k.MAP;
        }
        throw xd2.c(fifVarL);
    }

    public static String F(String str, Throwable th) {
        String strP0 = p0(th);
        if (TextUtils.isEmpty(strP0)) {
            return str;
        }
        StringBuilder sbZ = zo5.z(str, "\n  ");
        sbZ.append(strP0.replace("\n", "\n  "));
        sbZ.append('\n');
        return sbZ.toString();
    }

    public static final void F0(gdi gdiVar) {
        gdiVar.d(231, new vfg(15));
        gdiVar.d(232, new vfg(17));
        gdiVar.d(233, new vfg(18));
        gdiVar.d(234, new vfg(19));
        gdiVar.d(235, new vfg(20));
        gdiVar.d(236, new vfg(21));
        gdiVar.d(237, new vfg(22));
        gdiVar.d(238, new vfg(23));
        gdiVar.d(239, new vfg(24));
        gdiVar.d(240, new vfg(5));
        gdiVar.d(241, new vfg(6));
        gdiVar.d(242, new vfg(7));
        gdiVar.d(243, new vfg(8));
        gdiVar.d(244, new vfg(9));
        gdiVar.d(245, new vfg(10));
        gdiVar.d(246, new vfg(11));
        gdiVar.d(247, new vfg(12));
        gdiVar.d(248, new vfg(13));
        gdiVar.d(249, new vfg(14));
        gdiVar.b(5, new bwf(7));
        gdiVar.d(250, new vfg(16));
        gdiVar.d(251, new eaf(14));
        gdiVar.b(6, new bwf(8));
    }

    public static final void G(ViewGroup viewGroup) {
        H(viewGroup, new oi8(0, 0, 0, new j11(3, 1, false), 7), null);
    }

    public static void G0(String str, String str2) {
        synchronized (d) {
            Log.w(str, F(str2, null));
        }
    }

    public static final void H(View view, oi8 oi8Var, cf7 cf7Var) {
        j11 j11Var = oi8Var.d;
        int i = j11Var != null ? j11Var.b : 0;
        int i2 = i == 0 ? -1 : qi8.$EnumSwitchMapping$0[qt4.D(i)];
        if (i2 == -1 || i2 == 1) {
            new vjg(view, oi8Var, cf7Var);
            return;
        }
        if (i2 == 2) {
            new kj(view, oi8Var, cf7Var);
        } else if (i2 == 3) {
            new lj(view, oi8Var, cf7Var);
        } else {
            ore.o();
        }
    }

    public static void H0(String str, String str2, Throwable th) {
        synchronized (d) {
            Log.w(str, F(str2, th));
        }
    }

    public static void I(View view) {
        H(view, new oi8(0, 3, 0, null, 13), null);
    }

    public static final int I0(int i, float f) {
        return Color.argb(gm0.K(f * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static final pw J(Object... objArr) {
        pw pwVar = new pw(objArr.length);
        for (Object obj : objArr) {
            pwVar.add(obj);
        }
        return pwVar;
    }

    public static final Object J0(long j, qf7 qf7Var, nq4 nq4Var) {
        if (j > 0) {
            return D0(new ysh(j, nq4Var), qf7Var);
        }
        throw new TimeoutCancellationException("Timed out immediately", null);
    }

    public static String K(int i, int i2, String str) {
        if (i < 0) {
            return qe7.z("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return qe7.z("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        ore.p(zo5.h(i2, "negative size: "));
        return null;
    }

    public static final Object K0(long j, qf7 qf7Var, nq4 nq4Var) {
        return J0(rx8.e0(j), qf7Var, nq4Var);
    }

    public static final fif L(khb khbVar, fif fifVar) {
        if (!cqk.d(fifVar.d(), kif.f)) {
            return fifVar.isInline() ? L(khbVar, fifVar.h(0)) : fifVar;
        }
        jpl.c(khbVar, fifVar);
        return fifVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object L0(long j, qf7 qf7Var, lq4 lq4Var) {
        zsh zshVar;
        wfe wfeVar;
        if (lq4Var instanceof zsh) {
            zshVar = (zsh) lq4Var;
            int i = zshVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                zshVar.f = i - Integer.MIN_VALUE;
            } else {
                zshVar = new zsh(lq4Var);
            }
        } else {
            zshVar = new zsh(lq4Var);
        }
        Object obj = zshVar.e;
        int i2 = zshVar.f;
        if (i2 == 0) {
            ch3.d0(obj);
            if (j > 0) {
                wfe wfeVar2 = new wfe();
                try {
                    zshVar.d = wfeVar2;
                    zshVar.f = 1;
                    ysh yshVar = new ysh(j, zshVar);
                    wfeVar2.a = yshVar;
                    Object objD0 = D0(yshVar, qf7Var);
                    hu4 hu4Var = hu4.a;
                    return objD0 == hu4Var ? hu4Var : objD0;
                } catch (TimeoutCancellationException e2) {
                    e = e2;
                    wfeVar = wfeVar2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        wfeVar = zshVar.d;
        try {
            ch3.d0(obj);
            return obj;
        } catch (TimeoutCancellationException e3) {
            e = e3;
        }
        if (e.a != wfeVar.a) {
            throw e;
        }
        return null;
    }

    public static void M(long j, long j2, String str, boolean z) {
        if (z) {
            return;
        }
        ore.p(qe7.z(str, Long.valueOf(j), Long.valueOf(j2)));
    }

    public static final Object M0(long j, qf7 qf7Var, nq4 nq4Var) {
        return L0(rx8.e0(j), qf7Var, nq4Var);
    }

    public static void N(long j, String str, boolean z) {
        if (z) {
            return;
        }
        ore.p(qe7.z(str, Long.valueOf(j)));
    }

    public static void O(Object obj, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void P(String str, int i, int i2, boolean z) {
        if (z) {
            return;
        }
        ore.p(qe7.z(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void Q(String str, int i, boolean z) {
        if (z) {
            return;
        }
        ore.p(qe7.z(str, Integer.valueOf(i)));
    }

    public static void R(boolean z) {
        if (z) {
            return;
        }
        ore.a();
    }

    public static void S(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        ore.p(qe7.z(str, obj));
    }

    public static void T(boolean z, String str, Object obj, Object obj2) {
        if (z) {
            return;
        }
        ore.p(qe7.z(str, obj, obj2));
    }

    public static void U(int i, int i2) {
        String strZ;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strZ = qe7.z("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    ore.p(zo5.h(i2, "negative size: "));
                    return;
                }
                strZ = qe7.z("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strZ);
        }
    }

    public static void V(v0a v0aVar) {
        v0aVar.getClass();
    }

    public static void W(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ore.n(str);
    }

    public static void X(int i, int i2) {
        if (i < 0 || i > i2) {
            c.r(K(i, i2, "index"));
        }
    }

    public static void Y(int i, int i2, int i3) {
        String strK;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strK = K(i, i3, "start index");
            } else {
                strK = (i2 < 0 || i2 > i3) ? K(i2, i3, "end index") : qe7.z("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strK);
        }
    }

    public static void Z(Object obj, boolean z) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void a0(String str, int i, boolean z) {
        if (z) {
            return;
        }
        ore.k(qe7.z(str, Integer.valueOf(i)));
    }

    public static void b0(boolean z) {
        if (z) {
            return;
        }
        c.t();
    }

    public static void c0(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        ore.k(qe7.z(str, obj));
    }

    public static final CharSequence d0(CharSequence charSequence) {
        return charSequence.subSequence(0, charSequence.length());
    }

    public static Handler e0(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return go.c(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e4) {
            e = e4;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            qr7.o(cause);
            return null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    public static final igh f0(Context context) {
        String strG;
        long j;
        String str;
        m3a m3aVar = swh.c;
        String str2 = (String) (m3aVar != null ? m3aVar : null).c;
        long j2 = (m3aVar != null ? m3aVar : null).b;
        String str3 = (m3aVar != null ? m3aVar : null).a;
        String str4 = (String) (m3aVar != null ? m3aVar : null).e;
        if (m3aVar == null) {
            m3aVar = null;
        }
        String str5 = (String) m3aVar.d;
        String str6 = aof.a;
        String str7 = Build.MODEL;
        String strI = yab.I(context);
        String str8 = Build.MANUFACTURER;
        int i = Build.VERSION.SDK_INT;
        String strValueOf = String.valueOf(i);
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i2 = runningAppProcessInfo.importance;
        boolean z = !(i2 == 100 || i2 == 200);
        try {
            strG = yab.G(context);
        } catch (Exception unused) {
            strG = "UNKNOWN";
        }
        boolean zF0 = yab.f0(context);
        ul9 ul9Var = new ul9();
        context.getApplicationContext();
        ul9Var.put("board", Build.BOARD);
        ul9Var.put("brand", Build.BRAND);
        ul9Var.put("cpuABI", TextUtils.join(", ", Build.SUPPORTED_ABIS));
        ul9Var.put("device", Build.DEVICE);
        ul9Var.put(AnalyticsBaseParamsConstantsKt.MANUFACTURER, str8);
        ul9Var.put("model", str7);
        ul9Var.put("cpuCount", String.valueOf(Runtime.getRuntime().availableProcessors()));
        ul9Var.put("osVersionSdkInt", String.valueOf(i));
        ul9Var.put("osVersionRelease", Build.VERSION.RELEASE);
        String strP = ch3.p();
        String packageName = context.getPackageName();
        if (strP.equals(packageName)) {
            j = j2;
            str = str3;
            strP = null;
        } else {
            j = j2;
            str = str3;
            int iU0 = r5h.U0(strP, ':', 0, 6);
            if (iU0 == packageName.length() && z5h.K0(strP, packageName, false)) {
                strP = strP.substring(iU0);
            }
        }
        if (strP != null) {
        }
        Object systemService = context.getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        if (networkOperatorName != null) {
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName2 = context.getPackageName();
        String installingPackageName = i >= 30 ? packageManager.getInstallSourceInfo(packageName2).getInstallingPackageName() : packageManager.getInstallerPackageName(packageName2);
        if (installingPackageName != null) {
            ul9Var.put("installer", installingPackageName);
        }
        ul9 ul9VarB = ul9Var.b();
        Set setM = p90.m();
        ArrayList arrayList = new ArrayList(yw3.W0(setM, 10));
        for (pxh pxhVar : (gof) setM) {
            String strC = pxhVar.c();
            String strB = pxhVar.b();
            String strA = pxhVar.a();
            String str9 = "release";
            ul9 ul9Var2 = ul9VarB;
            if ("release" instanceof poe) {
                str9 = null;
            }
            arrayList.add(new c08(strC, strB, strA, str9));
            ul9VarB = ul9Var2;
        }
        return new igh(str2, j, str, str4, str5, str6, str7, strI, str8, strValueOf, z, strG, zF0, ul9VarB, ww3.X1(arrayList));
    }

    public static void g0(String str, String str2) {
        synchronized (d) {
            Log.d(str, F(str2, null));
        }
    }

    public static void h0(String str, String str2, Exception exc) {
        synchronized (d) {
            Log.d(str, F(str2, exc));
        }
    }

    public static final void j0(ViewGroup viewGroup, tf7 tf7Var) {
        hu huVar = new hu(tf7Var, 24, new Rect(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), viewGroup.getPaddingBottom()));
        WeakHashMap weakHashMap = i7j.a;
        y6j.l(viewGroup, huVar);
        if (viewGroup.isAttachedToWindow()) {
            w6j.c(viewGroup);
        } else {
            viewGroup.addOnAttachStateChangeListener(new ga0(viewGroup, 7, viewGroup));
        }
    }

    public static void k0(String str, String str2) {
        synchronized (d) {
            Log.e(str, F(str2, null));
        }
    }

    public static void l0(String str, String str2, Throwable th) {
        synchronized (d) {
            Log.e(str, F(str2, th));
        }
    }

    public static void m0(y8j y8jVar) {
        RecyclerView recyclerView = (RecyclerView) yhf.p0(yhf.m0(new sw(4, y8jVar), ba.h));
        if (recyclerView != null) {
            recyclerView.setId(R.id.oneme_viewpager2_recyclerview);
        }
    }

    public static final w09 n0(i19 i19Var) {
        AtomicReference atomicReference = i19Var.a;
        while (true) {
            w09 w09Var = (w09) atomicReference.get();
            if (w09Var != null) {
                return w09Var;
            }
            nah nahVarA = wk8.a();
            ao5 ao5Var = ao5.a;
            w09 w09Var2 = new w09(i19Var, x0(nahVarA, rk9.a.S0()));
            do {
                if (atomicReference.compareAndSet(null, w09Var2)) {
                    ao5 ao5Var2 = ao5.a;
                    yab.i0(w09Var2, rk9.a.S0(), 0, new y73(w09Var2, (lq4) null, 12), 2);
                    return w09Var2;
                }
            } while (atomicReference.get() == null);
        }
    }

    public static final aw8 o0(aw8 aw8Var) {
        return aw8Var.d().b() ? aw8Var : new ipb(aw8Var);
    }

    public static String p0(Throwable th) {
        boolean z;
        if (th == null) {
            return null;
        }
        synchronized (d) {
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    z = false;
                    break;
                }
                try {
                    if (cause instanceof UnknownHostException) {
                        z = true;
                        break;
                    }
                    cause = cause.getCause();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z) {
                return "UnknownHostException (no network)";
            }
            return Log.getStackTraceString(th).trim().replace("\t", "    ");
        }
    }

    public static void r0(String str, String str2) {
        synchronized (d) {
            Log.i(str, F(str2, null));
        }
    }

    public static final int s0(pw pwVar, Object obj, int i) {
        int i2 = pwVar.c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iH = rx8.h(i2, i, pwVar.a);
            if (iH < 0 || cqk.d(obj, pwVar.b[iH])) {
                return iH;
            }
            int i3 = iH + 1;
            while (i3 < i2 && pwVar.a[i3] == i) {
                if (cqk.d(obj, pwVar.b[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iH - 1; i4 >= 0 && pwVar.a[i4] == i; i4--) {
                if (cqk.d(obj, pwVar.b[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            c.c();
            return 0;
        }
    }

    public static synchronized void t0(so soVar) {
        if (b != null) {
            throw new IllegalStateException(lvb.class.getName().concat(" is already initialized"));
        }
        b = soVar;
        OneLogImpl oneLogImpl = OneLogImpl.getInstance();
        oneLogImpl.attachApiClient(b);
        oneLogImpl.setUploadJobId(15261);
    }

    public static final boolean u0(byte b2) {
        int i = b2 & 255;
        return i <= 127 || i >= 224;
    }

    public static final nhb v0(final khb khbVar, final String str, Executor executor, final af7 af7Var) {
        sbi sbiVar = sbi.a;
        final g8b g8bVar = new g8b(ogc.K0);
        final r72 r72Var = new r72();
        r72Var.c = new gne();
        u72 u72Var = new u72(r72Var);
        r72Var.b = u72Var;
        r72Var.a = qt4.class;
        try {
            executor.execute(new Runnable() { // from class: pgc
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    String str2 = str;
                    af7 af7Var2 = af7Var;
                    g8b g8bVar2 = g8bVar;
                    r72 r72Var2 = r72Var;
                    khbVar.getClass();
                    boolean zY = cqk.y();
                    if (zY) {
                        try {
                            cqk.f(str2);
                        } catch (Throwable th) {
                            if (zY) {
                                Trace.endSection();
                            }
                            throw th;
                        }
                    }
                    try {
                        af7Var2.invoke();
                        ngc ngcVar = ogc.J0;
                        g8bVar2.i(ngcVar);
                        r72Var2.b(ngcVar);
                    } catch (Throwable th2) {
                        g8bVar2.i(new mgc(th2));
                        r72Var2.d(th2);
                    }
                    if (zY) {
                        Trace.endSection();
                    }
                }
            });
            r72Var.a = sbiVar;
        } catch (Exception e2) {
            u72Var.c(e2);
        }
        return new nhb(21);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:83:0x0128  */
    /* JADX WARN: Code duplicated, block: B:87:0x012e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0136  */
    public static pk5 w0(Context context) {
        int memoryClass;
        int i;
        int i2;
        int i3;
        int iCeil;
        long j;
        a4c a4cVar;
        je9 je9Var;
        RandomAccessFile randomAccessFile;
        String line;
        if (pk5.b == null) {
            pk5 pk5Var = pk5.HIGH;
            pk5 pk5Var2 = pk5.LOW;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 < 29) {
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.e;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, "DevicePerformanceClass", zo5.h(i4, "class LOW, reason: old android = "), null);
                    }
                }
            } else {
                int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                try {
                    if (activityManager.isLowRamDevice()) {
                        gm0.x("DevicePerformanceClass", "class LOW, reason: isLowRamDevice", null);
                    } else {
                        memoryClass = activityManager.getMemoryClass();
                        if (Build.VERSION.SDK_INT < 31 || Build.SOC_MODEL == null) {
                            i2 = 0;
                            i3 = 0;
                            for (i = 0; i < iAvailableProcessors; i++) {
                                try {
                                    randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_max_freq", "r");
                                    try {
                                        line = randomAccessFile.readLine();
                                        if (line != null && line.length() != 0) {
                                            i3 += Integer.parseInt(line) / 1000;
                                            i2++;
                                        }
                                        randomAccessFile.close();
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            rx8.n(randomAccessFile, th);
                                            throw th2;
                                        }
                                    }
                                } catch (FileNotFoundException | IOException unused) {
                                }
                            }
                            if (i2 == 0) {
                                iCeil = -1;
                            } else {
                                iCeil = (int) Math.ceil(((double) i3) / ((double) i2));
                            }
                            if (i3 != 0 && iCeil == 0 && z5h.K0(Build.MODEL, "sdk_gphone", false)) {
                                gm0.x("DevicePerformanceClass", "class HIGH, reason: emulator", null);
                            } else {
                                try {
                                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                                    activityManager.getMemoryInfo(memoryInfo);
                                    j = memoryInfo.totalMem;
                                } catch (Throwable unused2) {
                                    j = -1;
                                }
                                if (iAvailableProcessors > 2 || memoryClass <= 100 || ((iAvailableProcessors <= 4 && iCeil != -1 && iCeil <= 1250) || (j != -1 && j < 2147483648L))) {
                                    pk5Var = pk5Var2;
                                } else if (iAvailableProcessors < 8 || memoryClass <= 160 || ((iCeil != -1 && iCeil <= 2055) || (iCeil == -1 && iAvailableProcessors == 8 && i4 <= 29))) {
                                    pk5Var = pk5.AVERAGE;
                                }
                                a4cVar = gm0.f;
                                if (a4cVar != null) {
                                    je9Var = je9.d;
                                    if (a4cVar.b(je9Var)) {
                                        String str = Build.MANUFACTURER;
                                        StringBuilder sb = new StringBuilder("class ");
                                        sb.append(pk5Var);
                                        sb.append(": cpu_count = ");
                                        sb.append(iAvailableProcessors);
                                        sb.append(", freq = ");
                                        qt4.x(iCeil, memoryClass, ", memoryClass = ", ", android version ", sb);
                                        sb.append(i4);
                                        sb.append(", manufacture ");
                                        sb.append(str);
                                        a4cVar.c(je9Var, "DevicePerformanceClass", sb.toString(), null);
                                    }
                                }
                            }
                        } else {
                            if (a.N0(c, Build.SOC_MODEL.toUpperCase(Locale.getDefault()))) {
                                gm0.x("DevicePerformanceClass", "class LOW, reason: LOW_SOC", null);
                                pk5Var = pk5Var2;
                            } else {
                                i2 = 0;
                                i3 = 0;
                                while (i < iAvailableProcessors) {
                                    randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_max_freq", "r");
                                    line = randomAccessFile.readLine();
                                    if (line != null) {
                                        i3 += Integer.parseInt(line) / 1000;
                                        i2++;
                                    }
                                    randomAccessFile.close();
                                }
                                if (i2 == 0) {
                                    iCeil = -1;
                                } else {
                                    iCeil = (int) Math.ceil(((double) i3) / ((double) i2));
                                }
                                if (i3 != 0) {
                                    ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                                    activityManager.getMemoryInfo(memoryInfo2);
                                    j = memoryInfo2.totalMem;
                                    if (iAvailableProcessors > 2) {
                                        pk5Var = pk5Var2;
                                    } else {
                                        pk5Var = pk5Var2;
                                    }
                                    a4cVar = gm0.f;
                                    if (a4cVar != null) {
                                        je9Var = je9.d;
                                        if (a4cVar.b(je9Var)) {
                                            String str2 = Build.MANUFACTURER;
                                            StringBuilder sb2 = new StringBuilder("class ");
                                            sb2.append(pk5Var);
                                            sb2.append(": cpu_count = ");
                                            sb2.append(iAvailableProcessors);
                                            sb2.append(", freq = ");
                                            qt4.x(iCeil, memoryClass, ", memoryClass = ", ", android version ", sb2);
                                            sb2.append(i4);
                                            sb2.append(", manufacture ");
                                            sb2.append(str2);
                                            a4cVar.c(je9Var, "DevicePerformanceClass", sb2.toString(), null);
                                        }
                                    }
                                } else {
                                    ActivityManager.MemoryInfo memoryInfo3 = new ActivityManager.MemoryInfo();
                                    activityManager.getMemoryInfo(memoryInfo3);
                                    j = memoryInfo3.totalMem;
                                    if (iAvailableProcessors > 2) {
                                        pk5Var = pk5Var2;
                                    } else {
                                        pk5Var = pk5Var2;
                                    }
                                    a4cVar = gm0.f;
                                    if (a4cVar != null) {
                                        je9Var = je9.d;
                                        if (a4cVar.b(je9Var)) {
                                            String str3 = Build.MANUFACTURER;
                                            StringBuilder sb3 = new StringBuilder("class ");
                                            sb3.append(pk5Var);
                                            sb3.append(": cpu_count = ");
                                            sb3.append(iAvailableProcessors);
                                            sb3.append(", freq = ");
                                            qt4.x(iCeil, memoryClass, ", memoryClass = ", ", android version ", sb3);
                                            sb3.append(i4);
                                            sb3.append(", manufacture ");
                                            sb3.append(str3);
                                            a4cVar.c(je9Var, "DevicePerformanceClass", sb3.toString(), null);
                                        }
                                    }
                                }
                            }
                        }
                        pk5Var2 = pk5Var;
                    }
                } catch (Throwable unused3) {
                    memoryClass = 0;
                }
            }
            pk5.b = pk5Var2;
        }
        pk5 pk5Var3 = pk5.b;
        if (pk5Var3 != null) {
            return pk5Var3;
        }
        ore.p("Required value was null.");
        return null;
    }

    public static vt4 x0(vt4 vt4Var, vt4 vt4Var2) {
        return vt4Var2 == k66.a ? vt4Var : (vt4) vt4Var2.E(vt4Var, new dz(4));
    }

    public static final void y0(f40 f40Var, z00 z00Var) throws IOException {
        Object objValueOf;
        File file = f40Var.c;
        vw2 vw2Var = new vw2();
        vw2Var.d = file.getName();
        vw2Var.e = file.getPath();
        long length = file.length();
        vw2Var.a = length;
        vw2Var.b = length;
        FileInputStream fileInputStreamC = f40Var.c();
        if (fileInputStreamC != null) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStreamC, 8192);
            try {
                DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
                try {
                    fbc fbcVar = new fbc(9);
                    String utf = null;
                    d9i d9iVar = null;
                    while (dataInputStream.available() > 0) {
                        vw2Var.b = dataInputStream.available();
                        String str = utf;
                        utf = dataInputStream.readUTF();
                        d9i d9iVar2 = (d9i) wm9.N0(d9i.b, Integer.valueOf(dataInputStream.readUnsignedByte()));
                        try {
                            switch (d9iVar2.ordinal()) {
                                case 0:
                                    objValueOf = Integer.valueOf(dataInputStream.readInt());
                                    vw2Var.c++;
                                    z00Var.invoke(utf, objValueOf);
                                    d9iVar = d9iVar2;
                                    break;
                                case 1:
                                    objValueOf = Float.valueOf(dataInputStream.readFloat());
                                    vw2Var.c++;
                                    z00Var.invoke(utf, objValueOf);
                                    d9iVar = d9iVar2;
                                    break;
                                case 2:
                                    objValueOf = Long.valueOf(dataInputStream.readLong());
                                    vw2Var.c++;
                                    z00Var.invoke(utf, objValueOf);
                                    d9iVar = d9iVar2;
                                    break;
                                case 3:
                                    objValueOf = dataInputStream.readUTF();
                                    vw2Var.c++;
                                    z00Var.invoke(utf, objValueOf);
                                    d9iVar = d9iVar2;
                                    break;
                                case 4:
                                    objValueOf = b3m.b(dataInputStream.readUTF());
                                    vw2Var.c++;
                                    z00Var.invoke(utf, objValueOf);
                                    d9iVar = d9iVar2;
                                    break;
                                case 5:
                                    objValueOf = Boolean.valueOf(dataInputStream.readBoolean());
                                    vw2Var.c++;
                                    z00Var.invoke(utf, objValueOf);
                                    d9iVar = d9iVar2;
                                    break;
                                case 6:
                                    objValueOf = f55.w(dataInputStream, fbcVar);
                                    vw2Var.c++;
                                    z00Var.invoke(utf, objValueOf);
                                    d9iVar = d9iVar2;
                                    break;
                                case 7:
                                    objValueOf = b3m.b(f55.w(dataInputStream, fbcVar));
                                    vw2Var.c++;
                                    z00Var.invoke(utf, objValueOf);
                                    d9iVar = d9iVar2;
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                        } catch (Throwable th) {
                            throw new es6(utf, d9iVar2, "prev=" + ((Object) str) + ":" + d9iVar, vw2Var, th);
                        }
                    }
                    dataInputStream.close();
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        rx8.n(dataInputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    rx8.n(bufferedInputStream, th4);
                    throw th5;
                }
            }
        }
    }

    public static final Object z0(qf7 qf7Var) {
        Thread.interrupted();
        return yab.A0(k66.a, new y73(qf7Var, (lq4) null, 16));
    }

    @Override // defpackage.r55
    public boolean A() {
        return true;
    }

    @Override // defpackage.v74
    public boolean C(fif fifVar, int i) {
        return s();
    }

    public abstract void C0(Object obj, float f);

    @Override // defpackage.r55
    public abstract byte D();

    @Override // defpackage.v74
    public double E(fif fifVar, int i) {
        return r();
    }

    @Override // defpackage.r55
    public v74 a(fif fifVar) {
        return this;
    }

    @Override // defpackage.v74
    public r55 c(nhd nhdVar, int i) {
        return k(nhdVar.h(i));
    }

    @Override // defpackage.r55
    public Object d(aw8 aw8Var) {
        return xql.a(this, aw8Var);
    }

    @Override // defpackage.v74
    public char e(nhd nhdVar, int i) {
        return t();
    }

    @Override // defpackage.v74
    public byte g(nhd nhdVar, int i) {
        return D();
    }

    @Override // defpackage.v74
    public String h(fif fifVar, int i) {
        return y();
    }

    public int hashCode() {
        switch (this.a) {
            case 22:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // defpackage.r55
    public abstract int i();

    public void i0() {
        throw new SerializationException(zfe.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // defpackage.v74
    public void j(fif fifVar) {
    }

    @Override // defpackage.r55
    public r55 k(fif fifVar) {
        return this;
    }

    @Override // defpackage.v74
    public int l(fif fifVar, int i) {
        return i();
    }

    @Override // defpackage.r55
    public abstract long m();

    @Override // defpackage.v74
    public Object n(fif fifVar, int i, aw8 aw8Var, Object obj) {
        if (aw8Var.d().b() || A()) {
            return d(aw8Var);
        }
        return null;
    }

    @Override // defpackage.r55
    public abstract short o();

    @Override // defpackage.r55
    public float p() {
        i0();
        throw null;
    }

    @Override // defpackage.v74
    public long q(fif fifVar, int i) {
        return m();
    }

    public abstract float q0(Object obj);

    @Override // defpackage.r55
    public double r() {
        i0();
        throw null;
    }

    @Override // defpackage.r55
    public boolean s() {
        i0();
        throw null;
    }

    @Override // defpackage.r55
    public char t() {
        i0();
        throw null;
    }

    public String toString() {
        switch (this.a) {
            case 22:
                return zfe.a(getClass()).h();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.v74
    public float u(fif fifVar, int i) {
        return p();
    }

    @Override // defpackage.v74
    public short w(nhd nhdVar, int i) {
        return o();
    }

    @Override // defpackage.v74
    public Object x(fif fifVar, int i, aw8 aw8Var, Object obj) {
        return d(aw8Var);
    }

    @Override // defpackage.r55
    public String y() {
        i0();
        throw null;
    }

    @Override // defpackage.r55
    public int z(fif fifVar) {
        i0();
        throw null;
    }
}
