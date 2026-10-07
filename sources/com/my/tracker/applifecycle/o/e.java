package com.my.tracker.applifecycle.o;

import android.app.Application;
import android.content.res.Resources;
import android.text.TextUtils;
import com.my.tracker.core.EngineCore;
import com.my.tracker.core.Tracer;
import com.my.tracker.core.utils.SystemUtils;
import java.io.BufferedReader;
import java.io.FileReader;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class e {
    private final EngineCore a;

    public static final class a {
        public final int a;
        public final String b;
        public final String c;

        public a(int i, String str, String str2) {
            this.a = i;
            this.b = str;
            this.c = str2;
        }
    }

    private e(EngineCore engineCore) {
        this.a = engineCore;
    }

    private a b() {
        String str = "ro.mtpi." + this.a.getTrackerConfig().getId();
        String valueFromSystemProperties = SystemUtils.getValueFromSystemProperties(str);
        if (TextUtils.isEmpty(valueFromSystemProperties)) {
            Tracer.d("PreInstallHandler: empty data for source: 3");
            return null;
        }
        Tracer.d("PreInstallHandler: raw data in SystemProperties has been found: " + valueFromSystemProperties);
        return a(3, valueFromSystemProperties, str);
    }

    public String a(String str) {
        BufferedReader bufferedReader;
        try {
            try {
                Tracer.d("PreInstallHandler: searching string in file " + str);
                String str2 = this.a.getApplication().getPackageName() + "=";
                int length = str2.length();
                bufferedReader = new BufferedReader(new FileReader(str));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            bufferedReader.close();
                            break;
                        }
                        Tracer.d("PreInstallHandler: processing string " + line);
                        if (line.startsWith(str2) && line.length() > length) {
                            String strSubstring = line.substring(length);
                            if (!TextUtils.isEmpty(strSubstring)) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable unused) {
                                }
                                return strSubstring;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            Tracer.e("PreInstallHandler error: exception while retrieving data in file" + str, th);
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return null;
                        } catch (Throwable th2) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable unused2) {
                                }
                            }
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    private static String a(Resources resources, String str, String str2) {
        int identifier = resources.getIdentifier(str + "_mytracker", "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    private static a a(int i, String str, String str2) {
        try {
            Tracer.d("PreInstallHandler: converting raw data to json");
            return new a(i, new JSONObject(str).toString(), str2);
        } catch (Throwable th) {
            Tracer.d("PreInstallHandler error: exception when converting raw data to json", th);
            try {
                Tracer.d("PreInstallHandler: converting raw data to json with pid");
                return new a(i, new JSONObject().put("pid", str).toString(), str2);
            } catch (Throwable th2) {
                Tracer.e("PreInstallHandler error: exception when converting raw data to json with pid", th2);
                Tracer.d("PreInstallHandler: nothing has been found for source: " + i);
                return null;
            }
        }
    }

    public void a(d dVar, String str) {
        long jCurrentTimeSec = this.a.getTimeCore().currentTimeSec();
        String vendorAppPackage = this.a.getTrackerConfig().getVendorAppPackage();
        if (TextUtils.isEmpty(vendorAppPackage) || this.a.getPrefs().getBoolean("preinstallRead")) {
            return;
        }
        Tracer.d("PreInstallHandler: checking preinstall");
        Application application = this.a.getApplication();
        try {
            String strA = a(application.getPackageManager().getResourcesForApplication(vendorAppPackage), application.getPackageName(), vendorAppPackage);
            this.a.getPrefs().setBoolean("preinstallRead", true);
            if (TextUtils.isEmpty(strA)) {
                Tracer.d("PreInstallHandler: referrer is empty");
                return;
            }
            Tracer.d("PreInstallHandler: referrer " + strA);
            dVar.a(this.a, jCurrentTimeSec, strA, str);
            this.a.getPrefs().setBoolean("referrerSent", true);
        } catch (Throwable unused) {
            Tracer.d("PreInstallHandler: unable to locate vendor app " + vendorAppPackage);
        }
    }

    public a a() {
        if (!this.a.getTrackerConfig().isTrackingPreinstallEnabled()) {
            Tracer.d("PreInstallHandler: tracking preinstall is disabled");
            return null;
        }
        a aVarB = b();
        if (aVarB != null) {
            return aVarB;
        }
        a aVarA = a(1);
        if (aVarA != null) {
            return aVarA;
        }
        if (this.a.getTrackerConfig().isTrackingPreinstallThirdPartyEnabled()) {
            return a(2);
        }
        return null;
    }

    private a a(int i) {
        String str;
        if (i == 1) {
            str = "ro.mytracker.preinstall.path";
        } else if (i == 2) {
            str = "ro.appsflyer.preinstall.path";
        } else {
            Tracer.d("PreInstallHandler: wrong property property key");
            return null;
        }
        String valueFromSystemProperties = SystemUtils.getValueFromSystemProperties(str);
        if (TextUtils.isEmpty(valueFromSystemProperties)) {
            Tracer.d("PreInstallHandler: empty path for source: " + i);
            return null;
        }
        String strA = a(valueFromSystemProperties);
        if (TextUtils.isEmpty(strA)) {
            Tracer.d("PreInstallHandler: empty data for source: " + i);
            return null;
        }
        Tracer.d("PreInstallHandler: raw data for source has been found: " + strA);
        return a(i, strA, valueFromSystemProperties);
    }

    public static e a(EngineCore engineCore) {
        return new e(engineCore);
    }
}
