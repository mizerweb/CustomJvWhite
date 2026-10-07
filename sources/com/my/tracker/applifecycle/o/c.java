package com.my.tracker.applifecycle.o;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.my.tracker.applifecycle.o.c;
import com.my.tracker.core.EngineCore;
import com.my.tracker.core.Tracer;
import com.my.tracker.core.utils.Consumer;
import com.my.tracker.core.utils.ContextUtils;
import com.my.tracker.core.utils.TimeUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static void a(EngineCore engineCore, d dVar) {
        String str;
        String str2;
        d dVar2;
        String str3;
        String str4;
        EngineCore engineCore2;
        int i;
        final int i2;
        Application application = engineCore.getApplication();
        PackageInfo currentAppPackageInfo = ContextUtils.getCurrentAppPackageInfo(application);
        if (currentAppPackageInfo != null) {
            String string = Build.VERSION.SDK_INT >= 28 ? Long.toString(currentAppPackageInfo.getLongVersionCode()) : Integer.toString(currentAppPackageInfo.versionCode);
            String str5 = currentAppPackageInfo.versionName;
            if (str5 != null) {
                str = string;
                str2 = str5;
            } else {
                str2 = "";
                str = string;
            }
        } else {
            str = "";
            str2 = str;
        }
        String string2 = engineCore.getPrefs().getString("appVersion");
        final long jCurrentTimeSec = TimeUtils.currentTimeSec();
        String id = engineCore.getTrackerConfig().getId();
        if (!id.equals(engineCore.getPrefs().getString("appId"))) {
            Tracer.d("InstallHandler: tracking install");
            long jConvertToSec = currentAppPackageInfo != null ? TimeUtils.convertToSec(currentAppPackageInfo.firstInstallTime) : 0L;
            e eVarA = e.a(engineCore);
            e.a aVarA = eVarA.a();
            String installer = ContextUtils.getInstaller(application);
            dVar.a(engineCore, jCurrentTimeSec, jConvertToSec, installer, aVarA);
            if (aVarA == null) {
                eVarA.a(dVar, installer);
            }
            engineCore.getPrefs().setString("appId", id);
            dVar2 = dVar;
            str3 = str;
            str4 = str2;
            i = 1;
            engineCore2 = engineCore;
        } else if (str.equals(string2)) {
            dVar2 = dVar;
            str3 = str;
            str4 = str2;
            engineCore2 = engineCore;
            i = 0;
        } else {
            if (string2.isEmpty()) {
                Tracer.d("InstallHandler: tracking update");
            } else {
                Tracer.d("InstallHandler: tracking update from" + string2 + " to " + str);
            }
            String string3 = engineCore.getPrefs().getString("appVersionName");
            String installer2 = ContextUtils.getInstaller(application);
            dVar2 = dVar;
            str3 = str;
            str4 = str2;
            engineCore2 = engineCore;
            dVar2.a(engineCore2, jCurrentTimeSec, string3, string2, str4, str3, installer2);
            i = 2;
        }
        long j = engineCore2.getPrefs().getLong("installTimestamp");
        String apkPreinstallParams = engineCore2.getTrackerConfig().getApkPreinstallParams();
        if (!TextUtils.isEmpty(apkPreinstallParams)) {
            if (jCurrentTimeSec - j < 604800 || j == 0) {
                Tracer.d("InstallHandler: tracking apkPreinstallParams");
                dVar2.a(engineCore2, jCurrentTimeSec, apkPreinstallParams);
            } else {
                Tracer.d("InstallHandler: can't track apkPreinstallParams, tracking period has ended");
            }
        }
        if (i == 0) {
            Tracer.d("InstallHandler: no install/update");
            i2 = i;
        } else {
            final String str6 = str4;
            final String str7 = str3;
            i2 = i;
            engineCore2.getPrefs().setBlock(new Consumer() { // from class: z8k
                @Override // com.my.tracker.core.utils.Consumer
                public final void accept(Object obj) {
                    c.a(i2, jCurrentTimeSec, str7, str6, (SharedPreferences.Editor) obj);
                }
            });
        }
        if (i2 != 1) {
            jCurrentTimeSec = j;
        }
        engineCore2.setApplicationLastUpdateTimestampSec(jCurrentTimeSec);
    }

    public static /* synthetic */ void a(int i, long j, String str, String str2, SharedPreferences.Editor editor) {
        if (i == 1) {
            editor.putLong("installTimestamp", j);
        }
        editor.putString("appVersion", str);
        editor.putString("appVersionName", str2);
        editor.putLong("lastUpdateTimestamp", j);
    }
}
