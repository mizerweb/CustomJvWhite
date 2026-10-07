package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.StrictMode;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import defpackage.ih;
import defpackage.kfh;
import defpackage.mf;
import defpackage.mm5;
import defpackage.ncg;
import defpackage.nhb;
import defpackage.np0;
import defpackage.o7j;
import defpackage.og6;
import defpackage.pcg;
import defpackage.pv;
import defpackage.px8;
import defpackage.qcg;
import defpackage.rcg;
import defpackage.wci;
import defpackage.wn0;
import defpackage.xde;
import defpackage.yab;
import defpackage.yfh;
import defpackage.zo5;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes2.dex */
public class SoLoader {
    public static xde b;
    public static int l;
    public static final ReentrantReadWriteLock c = new ReentrantReadWriteLock();
    public static Context d = null;
    public static volatile rcg[] e = null;
    public static final AtomicInteger f = new AtomicInteger(0);
    public static ih g = null;
    public static final HashSet h = new HashSet();
    public static final HashMap i = new HashMap();
    public static final Set j = Collections.newSetFromMap(new ConcurrentHashMap());
    public static boolean k = true;
    public static int m = 0;
    public static final boolean a = true;

    public static void a(Context context, ArrayList arrayList) {
        if ((l & 8) != 0) {
            File fileF = wci.f(context, "lib-main");
            try {
                if (fileF.exists()) {
                    kfh.b(fileF);
                    return;
                }
                return;
            } catch (Throwable th) {
                Log.w("SoLoader", "Failed to delete " + fileF.getCanonicalPath(), th);
                return;
            }
        }
        File file = new File(context.getApplicationInfo().sourceDir);
        ArrayList arrayList2 = new ArrayList();
        wn0 wn0Var = new wn0(context, file, "lib-main");
        arrayList2.add(wn0Var);
        o7j.b("SoLoader", "adding backup source from : ".concat(wn0Var.toString()));
        if (context.getApplicationInfo().splitSourceDirs != null) {
            o7j.b("SoLoader", "adding backup sources from split apks");
            String[] strArr = context.getApplicationInfo().splitSourceDirs;
            int length = strArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                File file2 = new File(strArr[i2]);
                StringBuilder sb = new StringBuilder("lib-");
                int i4 = i3 + 1;
                sb.append(i3);
                wn0 wn0Var2 = new wn0(context, file2, sb.toString());
                o7j.b("SoLoader", "adding backup source: ".concat(wn0Var2.toString()));
                a aVar = new a(wn0Var2, wn0Var2, false);
                try {
                    boolean z = aVar.A().length != 0;
                    aVar.close();
                    if (z) {
                        arrayList2.add(wn0Var2);
                    }
                    i2++;
                    i3 = i4;
                } catch (Throwable th2) {
                    try {
                        aVar.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        arrayList.addAll(0, arrayList2);
    }

    public static void b(ArrayList arrayList) {
        String strP = SysUtil$MarshmallowSysdeps.is64Bit() ? "/system/lib64:/vendor/lib64" : "/system/lib:/vendor/lib";
        String str = System.getenv("LD_LIBRARY_PATH");
        if (str != null && !str.equals("")) {
            strP = zo5.p(str, ":", strP);
        }
        for (String str2 : new HashSet(Arrays.asList(strP.split(":")))) {
            o7j.b("SoLoader", "adding system library source: " + str2);
            arrayList.add(new mm5(new File(str2), 2));
        }
    }

    public static void c(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        boolean z;
        ReentrantReadWriteLock reentrantReadWriteLock = c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (e == null) {
                Log.e("SoLoader", "Could not load: " + str + " because SoLoader is not initialized");
                throw new UnsatisfiedLinkError("SoLoader not initialized, couldn't find DSO to load: " + str);
            }
            reentrantReadWriteLock.readLock().unlock();
            if (threadPolicy == null) {
                threadPolicy = StrictMode.allowThreadDiskReads();
                z = true;
            } else {
                z = false;
            }
            if (a) {
                Api18TraceUtils.a("SoLoader.loadLibrary[", str, "]");
            }
            try {
                reentrantReadWriteLock.readLock().lock();
                try {
                    try {
                        for (rcg rcgVar : e) {
                            if (rcgVar.c(str, i2, threadPolicy) != 0) {
                                c.readLock().unlock();
                                if (a) {
                                    Trace.endSection();
                                }
                                if (z) {
                                    StrictMode.setThreadPolicy(threadPolicy);
                                    return;
                                }
                                return;
                            }
                        }
                        throw pcg.a(str, d, e);
                    } catch (IOException e2) {
                        qcg qcgVar = new qcg(str, e2.toString());
                        qcgVar.initCause(e2);
                        throw qcgVar;
                    }
                } catch (Throwable th) {
                    c.readLock().unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                if (a) {
                    Trace.endSection();
                }
                if (z) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            c.readLock().unlock();
            throw th3;
        }
    }

    public static int d(Context context) {
        int i2 = m;
        if (i2 != 0) {
            return i2;
        }
        int i3 = 1;
        if (context == null) {
            o7j.b("SoLoader", "context is null, fallback to THIRD_PARTY_APP appType");
            return 1;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i4 = applicationInfo.flags;
        if ((i4 & 1) != 0) {
            i3 = (i4 & np0.m) != 0 ? 3 : 2;
        }
        o7j.b("SoLoader", "ApplicationInfo.flags is: " + applicationInfo.flags + " appType is: " + i3);
        return i3;
    }

    public static synchronized mf e() {
        ih ihVar;
        ihVar = g;
        return ihVar == null ? null : ihVar.w();
    }

    public static void f(Context context, int i2) {
        if (k()) {
            Log.w("SoLoader", "SoLoader already initialized");
            return;
        }
        Log.w("SoLoader", "Initializing SoLoader: " + i2);
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            boolean zH = h(context);
            k = zH;
            if (zH) {
                int iD = d(context);
                m = iD;
                if ((i2 & np0.m) == 0) {
                    if (iD == 2 || (context != null && (context.getApplicationInfo().flags & 268435456) == 0)) {
                        i2 |= 8;
                    }
                }
                i(context);
                j(context, i2);
                o7j.j("SoLoader", "Init SoLoader delegate");
                yab.d0(new px8());
            } else {
                g();
                o7j.j("SoLoader", "Init System Loader delegate");
                yab.d0(new nhb(24));
            }
            Log.w("SoLoader", "SoLoader initialized: " + i2);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
        }
    }

    public static void g() {
        if (e != null) {
            return;
        }
        c.writeLock().lock();
        try {
            if (e == null) {
                e = new rcg[0];
            }
        } finally {
            c.writeLock().unlock();
        }
    }

    public static boolean h(Context context) {
        String packageName;
        Bundle bundle = null;
        try {
            packageName = context.getPackageName();
            try {
                bundle = context.getPackageManager().getApplicationInfo(packageName, np0.m).metaData;
            } catch (Exception e2) {
                e = e2;
                Log.w("SoLoader", "Unexpected issue with package manager (" + packageName + ")", e);
            }
        } catch (Exception e3) {
            e = e3;
            packageName = null;
        }
        return bundle == null || bundle.getBoolean("com.facebook.soloader.enabled", true);
    }

    public static synchronized void i(Context context) {
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    Log.w("SoLoader", "context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: " + context.getApplicationInfo().nativeLibraryDir);
                } else {
                    context = applicationContext;
                }
                d = context;
                g = new ih(context, 14);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (b != null) {
            return;
        }
        b = new xde(7);
    }

    public static void init(Context context, int i2) throws IOException {
        f(context, i2);
    }

    public static void j(Context context, int i2) {
        int i3;
        int i4;
        ReentrantReadWriteLock.WriteLock writeLock;
        if (e != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (e != null) {
                writeLock = reentrantReadWriteLock.writeLock();
            } else {
                l = i2;
                ArrayList arrayList = new ArrayList();
                if ((i2 & np0.o) != 0) {
                    yfh yfhVar = new yfh();
                    o7j.b("SoLoader", "adding systemLoadWrapper source: " + yfhVar);
                    arrayList.add(0, yfhVar);
                } else {
                    b(arrayList);
                    if (context != null) {
                        if ((i2 & 1) != 0) {
                            int i5 = m;
                            if (i5 != 1) {
                                if (i5 != 2 && i5 != 3) {
                                    throw new RuntimeException("Unsupported app type, we should not reach here");
                                }
                                i4 = 1;
                            } else {
                                i4 = 0;
                            }
                            pv pvVar = new pv(d, i4);
                            o7j.b("SoLoader", "Adding application source: ".concat(pvVar.toString()));
                            arrayList.add(0, pvVar);
                            o7j.b("SoLoader", "Adding exo package source: lib-main");
                            arrayList.add(0, new og6(context, "lib-main"));
                        } else {
                            if (m == 2 || (context.getApplicationInfo().flags & 268435456) == 0) {
                                b bVar = new b(context);
                                o7j.b("SoLoader", "validating/adding directApk source: ".concat(bVar.toString()));
                                if (!bVar.c.isEmpty()) {
                                    arrayList.add(0, bVar);
                                }
                            }
                            int i6 = m;
                            if (i6 != 1) {
                                if (i6 != 2 && i6 != 3) {
                                    throw new RuntimeException("Unsupported app type, we should not reach here");
                                }
                                i3 = 1;
                            } else {
                                i3 = 0;
                            }
                            pv pvVar2 = new pv(d, i3);
                            o7j.b("SoLoader", "Adding application source: ".concat(pvVar2.toString()));
                            arrayList.add(0, pvVar2);
                            a(context, arrayList);
                        }
                    }
                }
                rcg[] rcgVarArr = (rcg[]) arrayList.toArray(new rcg[arrayList.size()]);
                reentrantReadWriteLock.writeLock().lock();
                try {
                    int i7 = l;
                    int i8 = (i7 & 2) == 0 ? 0 : 1;
                    if ((i7 & np0.n) != 0) {
                        i8 |= 4;
                    }
                    reentrantReadWriteLock.writeLock().unlock();
                    int length = rcgVarArr.length;
                    while (true) {
                        int i9 = length - 1;
                        if (length <= 0) {
                            break;
                        }
                        o7j.b("SoLoader", "Preparing SO source: " + rcgVarArr[i9]);
                        boolean z = a;
                        if (z) {
                            Api18TraceUtils.a("SoLoader", "_", rcgVarArr[i9].getClass().getSimpleName());
                        }
                        rcgVarArr[i9].d(i8);
                        if (z) {
                            Trace.endSection();
                        }
                        length = i9;
                    }
                    e = rcgVarArr;
                    f.getAndIncrement();
                    o7j.b("SoLoader", "init finish: " + e.length + " SO sources prepared");
                    writeLock = c.writeLock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            writeLock.unlock();
        } catch (Throwable th2) {
            c.writeLock().unlock();
            throw th2;
        }
    }

    public static boolean k() {
        if (e != null) {
            return true;
        }
        c.readLock().lock();
        try {
            return e != null;
        } finally {
            c.readLock().unlock();
        }
    }

    public static boolean l(int i2, String str) {
        Boolean boolValueOf;
        if (e == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = c;
            reentrantReadWriteLock.readLock().lock();
            try {
                if (e == null) {
                    if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                        synchronized (SoLoader.class) {
                            try {
                                boolean zContains = h.contains(str);
                                boolean z = !zContains;
                                if (!zContains) {
                                    System.loadLibrary(str);
                                }
                                boolValueOf = Boolean.valueOf(z);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        reentrantReadWriteLock.readLock().unlock();
                    } else if (!k()) {
                        throw new IllegalStateException("SoLoader.init() not yet called");
                    }
                }
                reentrantReadWriteLock.readLock().unlock();
                boolValueOf = null;
            } catch (Throwable th2) {
                c.readLock().unlock();
                throw th2;
            }
        } else {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        if (!k) {
            return yab.m0(str);
        }
        if (m != 2) {
        }
        String strMapLibraryName = System.mapLibraryName(str);
        mf mfVarE = null;
        while (true) {
            try {
                return m(strMapLibraryName, str, i2, null);
            } catch (UnsatisfiedLinkError e2) {
                Log.w("SoLoader", "Starting recovery for " + strMapLibraryName, e2);
                c.writeLock().lock();
                if (mfVarE == null) {
                    try {
                        try {
                            mfVarE = e();
                        } catch (NoBaseApkException e3) {
                            Log.e("SoLoader", "Base APK not found during recovery", e3);
                            throw e3;
                        } catch (Exception e4) {
                            Log.e("SoLoader", "Got an exception during recovery, will throw the initial error instead", e4);
                            throw e2;
                        }
                    } catch (Throwable th3) {
                        c.writeLock().unlock();
                        throw th3;
                    }
                }
                if (mfVarE == null || !mfVarE.u(e2, e)) {
                    c.writeLock().unlock();
                    Log.w("SoLoader", "Failed to recover");
                    throw e2;
                }
                f.getAndIncrement();
                Log.w("SoLoader", "Attempting to load library again");
                c.writeLock().unlock();
            }
        }
    }

    public static boolean m(String str, String str2, int i2, StrictMode.ThreadPolicy threadPolicy) {
        Object obj;
        if (!TextUtils.isEmpty(str2) && j.contains(str2)) {
            return false;
        }
        synchronized (SoLoader.class) {
            try {
                HashSet hashSet = h;
                if (hashSet.contains(str)) {
                    return false;
                }
                HashMap map = i;
                if (map.containsKey(str)) {
                    obj = map.get(str);
                } else {
                    Object obj2 = new Object();
                    map.put(str, obj2);
                    obj = obj2;
                }
                ReentrantReadWriteLock reentrantReadWriteLock = c;
                reentrantReadWriteLock.readLock().lock();
                try {
                    synchronized (obj) {
                        synchronized (SoLoader.class) {
                            if (hashSet.contains(str)) {
                                reentrantReadWriteLock.readLock().unlock();
                                return false;
                            }
                            try {
                                o7j.b("SoLoader", "About to load: " + str);
                                c(str, i2, threadPolicy);
                                o7j.b("SoLoader", "Loaded: " + str);
                                synchronized (SoLoader.class) {
                                    hashSet.add(str);
                                }
                                if ((i2 & 16) == 0 && !TextUtils.isEmpty(str2)) {
                                    j.contains(str2);
                                }
                                reentrantReadWriteLock.readLock().unlock();
                                return true;
                            } catch (UnsatisfiedLinkError e2) {
                                String message = e2.getMessage();
                                if (message == null || !message.contains("unexpected e_machine:")) {
                                    throw e2;
                                }
                                ncg ncgVar = new ncg("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil$MarshmallowSysdeps.getSupportedAbis()) + " error: " + message.substring(message.lastIndexOf("unexpected e_machine:")));
                                ncgVar.initCause(e2);
                                throw ncgVar;
                            }
                        }
                    }
                } catch (Throwable th) {
                    c.readLock().unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
