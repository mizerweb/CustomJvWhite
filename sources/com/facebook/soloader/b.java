package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import defpackage.hee;
import defpackage.o7j;
import defpackage.ore;
import defpackage.qr7;
import defpackage.rcg;
import defpackage.v36;
import defpackage.zo5;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends rcg implements hee {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashSet c;

    public b(Context context) {
        HashSet hashSet = new HashSet();
        String strH = h(context.getApplicationInfo().sourceDir);
        if (strH != null) {
            hashSet.add(strH);
        }
        if (context.getApplicationInfo().splitSourceDirs != null) {
            for (String str : context.getApplicationInfo().splitSourceDirs) {
                String strH2 = h(str);
                if (strH2 != null) {
                    hashSet.add(strH2);
                }
            }
        }
        this.c = hashSet;
    }

    public static String h(String str) {
        String[] supportedAbis = SysUtil$MarshmallowSysdeps.getSupportedAbis();
        if (str == null || str.isEmpty()) {
            Log.w("SoLoader", "Cannot compute fallback path, apk path is ".concat(str == null ? "null" : "empty"));
            return null;
        }
        if (supportedAbis == null || supportedAbis.length == 0) {
            Log.w("SoLoader", "Cannot compute fallback path, supportedAbis is ".concat(supportedAbis == null ? "null" : "empty"));
            return null;
        }
        StringBuilder sbZ = zo5.z(str, "!/lib/");
        sbZ.append(supportedAbis[0]);
        return sbZ.toString();
    }

    @Override // defpackage.hee
    public final rcg a(Context context) {
        b bVar = new b(context);
        try {
            bVar.i();
            return bVar;
        } catch (IOException e) {
            qr7.o(e);
            return null;
        }
    }

    @Override // defpackage.rcg
    public final String b() {
        throw null;
    }

    @Override // defpackage.rcg
    public final int c(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        if (SoLoader.b == null) {
            ore.k("SoLoader.init() not yet called");
            return 0;
        }
        int i2 = i;
        for (String str2 : this.c) {
            Set set = (Set) this.a.get(str2);
            if (TextUtils.isEmpty(str2) || set == null || !set.contains(str)) {
                o7j.j("SoLoader", str + " not found on " + str2);
            } else {
                Set setG = g(str2, str);
                if (setG == null) {
                    ZipFile zipFile = new ZipFile(str2.substring(0, str2.indexOf(33)));
                    try {
                        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                        while (enumerationEntries.hasMoreElements()) {
                            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                            if (zipEntryNextElement != null) {
                                if (zipEntryNextElement.getName().endsWith("/" + str)) {
                                    v36 v36Var = new v36(zipFile, zipEntryNextElement);
                                    try {
                                        for (String str3 : d.a(str, v36Var)) {
                                            if (!str3.startsWith("/")) {
                                                e(str2, str, str3);
                                            }
                                        }
                                        v36Var.close();
                                    } catch (Throwable th) {
                                        try {
                                            v36Var.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        zipFile.close();
                        setG = g(str2, str);
                    } catch (Throwable th3) {
                        try {
                            zipFile.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                }
                if (setG != null) {
                    Iterator it = setG.iterator();
                    while (it.hasNext()) {
                        SoLoader.m((String) it.next(), null, i2 | 1, threadPolicy);
                    }
                }
                try {
                    i2 |= 4;
                    SoLoader.b.C(i2, str2 + File.separator + str);
                    o7j.b("SoLoader", str + " found on " + str2);
                    return 1;
                } catch (UnsatisfiedLinkError e) {
                    Log.w("SoLoader", str + " not found on " + str2 + " flag: " + i2, e);
                }
            }
        }
        return 0;
    }

    @Override // defpackage.rcg
    public final void d(int i) throws IOException {
        i();
    }

    public final void e(String str, String str2, String str3) {
        synchronized (this.b) {
            try {
                String str4 = str + str2;
                if (!this.b.containsKey(str4)) {
                    this.b.put(str4, new HashSet());
                }
                ((Set) this.b.get(str4)).add(str3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(String str, String str2) {
        synchronized (this.a) {
            try {
                if (!this.a.containsKey(str)) {
                    this.a.put(str, new HashSet());
                }
                ((Set) this.a.get(str)).add(str2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Set g(String str, String str2) {
        Set set;
        synchronized (this.b) {
            set = (Set) this.b.get(str + str2);
        }
        return set;
    }

    public final void i() throws IOException {
        int iIndexOf;
        int i;
        String strSubstring = null;
        for (String str : this.c) {
            if (!TextUtils.isEmpty(str) && (iIndexOf = str.indexOf(33)) >= 0 && (i = iIndexOf + 2) < str.length()) {
                strSubstring = str.substring(i);
            }
            if (!TextUtils.isEmpty(strSubstring)) {
                ZipFile zipFile = new ZipFile(str.substring(0, str.indexOf(33)));
                try {
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                    while (enumerationEntries.hasMoreElements()) {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        if (zipEntryNextElement != null && zipEntryNextElement.getMethod() == 0 && zipEntryNextElement.getName().startsWith(strSubstring) && zipEntryNextElement.getName().endsWith(".so")) {
                            f(str, zipEntryNextElement.getName().substring(strSubstring.length() + 1));
                        }
                    }
                    zipFile.close();
                } catch (Throwable th) {
                    try {
                        zipFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.rcg
    public final String toString() {
        return "DirectApkSoSource[root = " + this.c.toString() + ']';
    }
}
