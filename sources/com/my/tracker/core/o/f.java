package com.my.tracker.core.o;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.core.EnginePrefs;
import com.my.tracker.core.Tracer;
import com.my.tracker.core.utils.TimeUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    private static final e b = new e(Collections.EMPTY_LIST);
    private final EnginePrefs a;

    public f(EnginePrefs enginePrefs) {
        this.a = enginePrefs;
    }

    private static List b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PackageInfo packageInfo = (PackageInfo) it.next();
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if ((applicationInfo.flags & 1) == 0) {
                arrayList.add(new e.a(applicationInfo.packageName, TimeUtils.convertToSec(packageInfo.firstInstallTime)));
            }
        }
        return arrayList;
    }

    public e a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider) {
        List<PackageInfo> installedPackages;
        if (installedPackagesProvider == null) {
            return b;
        }
        try {
            installedPackages = installedPackagesProvider.getInstalledPackages();
        } catch (Throwable unused) {
            Tracer.e("MyTracker error: exception at InstalledPackagesProvider::getInstalledPackages()");
            installedPackages = null;
        }
        if (installedPackages == null || installedPackages.isEmpty()) {
            return b;
        }
        List listB = b(installedPackages);
        if (listB.isEmpty()) {
            return b;
        }
        String strA = a(listB);
        String string = this.a.getString("appsHash");
        String strA2 = n.a(strA);
        if (string.equals(strA2)) {
            Tracer.d("AppsDataProvider: Apps hash did not changed");
            return b;
        }
        Tracer.d("AppsDataProvider: Apps hash changed");
        EnginePrefs enginePrefs = this.a;
        if (strA2 == null) {
            strA2 = "";
        }
        enginePrefs.setString("appsHash", strA2);
        return new e(listB);
    }

    private static String a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((e.a) it.next()).a);
        }
        return TextUtils.join(",", arrayList);
    }
}
