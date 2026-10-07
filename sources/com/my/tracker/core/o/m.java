package com.my.tracker.core.o;

import android.app.Application;
import android.app.UiModeManager;
import android.content.pm.PackageInfo;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import com.my.tracker.core.Tracer;
import com.my.tracker.core.utils.ContextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    private final Application a;
    private l b;

    public static final class a {
        static final int a = a() ? 1 : 0;

        private static boolean a() throws Throwable {
            Process processExec;
            String str = Build.TAGS;
            if (str != null && str.contains("test-keys")) {
                return true;
            }
            String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
            for (int i = 0; i < 10; i++) {
                if (new File(strArr[i]).exists()) {
                    return true;
                }
            }
            String[] strArr2 = {"/system/xbin/which su", "/system/bin/which su", "which su"};
            Runtime runtime = Runtime.getRuntime();
            int i2 = 0;
            while (true) {
                BufferedReader bufferedReader = null;
                try {
                    if (i2 >= 3) {
                        try {
                            Locale locale = Locale.US;
                            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/mounts")));
                            try {
                                String[] strArr3 = {"/sbin/.magisk/", "/sbin/.core/mirror", "/sbin/.core/img", "/sbin/.core/db-0/magisk.db"};
                                while (true) {
                                    String line = bufferedReader2.readLine();
                                    if (line == null) {
                                        bufferedReader2.close();
                                        break;
                                    }
                                    for (int i3 = 0; i3 < 4; i3++) {
                                        if (line.contains(strArr3[i3])) {
                                            try {
                                                bufferedReader2.close();
                                            } catch (Throwable unused) {
                                            }
                                            return true;
                                        }
                                    }
                                }
                            } catch (Exception unused2) {
                                bufferedReader = bufferedReader2;
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                return false;
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable unused3) {
                                    }
                                }
                                throw th;
                            }
                        } catch (Exception unused4) {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        break;
                    }
                    try {
                        processExec = runtime.exec(strArr2[i2]);
                        try {
                            BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                            try {
                                StringBuilder sb = new StringBuilder();
                                while (true) {
                                    String line2 = bufferedReader3.readLine();
                                    if (line2 == null) {
                                        break;
                                    }
                                    sb.append(line2);
                                }
                                processExec.destroy();
                                if (!TextUtils.isEmpty(sb.toString())) {
                                    try {
                                        bufferedReader3.close();
                                    } catch (Throwable unused5) {
                                    }
                                    try {
                                        processExec.destroy();
                                    } catch (Throwable unused6) {
                                    }
                                    return true;
                                }
                                try {
                                    bufferedReader3.close();
                                } catch (Throwable unused7) {
                                }
                                try {
                                    processExec.destroy();
                                } catch (Throwable unused8) {
                                }
                                i2++;
                            } catch (Throwable unused9) {
                                bufferedReader = bufferedReader3;
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable unused10) {
                                    }
                                }
                                if (processExec != null) {
                                }
                                i2++;
                            }
                        } catch (Throwable unused11) {
                        }
                    } catch (Throwable unused12) {
                        processExec = null;
                    }
                } catch (Throwable unused13) {
                }
            }
            return false;
        }
    }

    public m(Application application) {
        this.a = application;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [int] */
    /* JADX WARN: Type inference failed for: r27v2 */
    public l a() {
        String packageName;
        String language;
        String str;
        String string;
        String str2;
        int i;
        int i2;
        float f;
        float f2;
        int i3;
        float f3;
        float f4;
        float f5;
        String str3;
        int i4;
        long totalSpace;
        long j;
        ?? HasSystemFeature;
        int currentModeType;
        String language2 = "";
        l lVar = this.b;
        if (lVar != null) {
            return lVar;
        }
        Tracer.d("DeviceParamsDataProvider: collect application info...");
        String str4 = Build.DEVICE;
        String str5 = Build.MANUFACTURER;
        String str6 = Build.MODEL;
        String str7 = Build.VERSION.RELEASE;
        try {
            packageName = this.a.getPackageName();
        } catch (Throwable th) {
            Tracer.d("DeviceParamsDataProvider: collecting packageName exception: ", th);
            packageName = "";
        }
        try {
            language = this.a.getResources().getConfiguration().locale.getLanguage();
        } catch (Throwable th2) {
            Tracer.d("DeviceParamsDataProvider: collecting app lang exception: ", th2);
            language = "";
        }
        try {
            PackageInfo currentAppPackageInfo = ContextUtils.getCurrentAppPackageInfo(this.a);
            if (currentAppPackageInfo != null) {
                str = currentAppPackageInfo.versionName;
                try {
                    string = Long.toString(Build.VERSION.SDK_INT < 28 ? currentAppPackageInfo.versionCode : currentAppPackageInfo.getLongVersionCode());
                } catch (Throwable th3) {
                    th = th3;
                    Tracer.d("DeviceParamsDataProvider: collecting app package info exception: ", th);
                    string = "";
                }
                str2 = str;
            } else {
                string = "";
                str2 = string;
            }
        } catch (Throwable th4) {
            th = th4;
            str = "";
        }
        Point pointA = a(this.a);
        if (pointA != null) {
            int i5 = pointA.x;
            i2 = pointA.y;
            i = i5;
        } else {
            i = -1;
            i2 = -1;
        }
        float f6 = Float.NaN;
        try {
            DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
            if (displayMetrics != null) {
                i3 = displayMetrics.densityDpi;
                try {
                    f = displayMetrics.density;
                    try {
                        f2 = displayMetrics.xdpi;
                        try {
                            f6 = displayMetrics.ydpi;
                        } catch (Throwable th5) {
                            th = th5;
                            Tracer.d("DeviceParamsDataProvider: collecting display metrics exception: ", th);
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        f2 = Float.NaN;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    f = Float.NaN;
                    f2 = Float.NaN;
                }
                f3 = f6;
                f5 = f;
                f4 = f2;
            } else {
                f5 = Float.NaN;
                f4 = Float.NaN;
                f3 = Float.NaN;
                i3 = -1;
            }
        } catch (Throwable th8) {
            th = th8;
            f = Float.NaN;
            f2 = Float.NaN;
            i3 = -1;
        }
        try {
            TimeZone timeZone = TimeZone.getDefault();
            str3 = timeZone.getDisplayName(false, 0) + " " + timeZone.getID();
        } catch (Throwable th9) {
            Tracer.d("DeviceParamsDataProvider: collecting timezone exception: ", th9);
            str3 = "";
        }
        try {
            i4 = a.a;
        } catch (Throwable th10) {
            Tracer.d("DeviceParamsDataProvider: collecting isRooted exception: ", th10);
            i4 = -1;
        }
        long freeSpace = -1;
        try {
            File filesDir = this.a.getFilesDir();
            if (filesDir != null) {
                totalSpace = filesDir.getTotalSpace();
                try {
                    freeSpace = filesDir.getFreeSpace();
                } catch (Throwable th11) {
                    th = th11;
                    Tracer.d("DeviceParamsDataProvider: collecting disk info exception: ", th);
                }
                j = freeSpace;
            } else {
                totalSpace = -1;
                j = -1;
            }
        } catch (Throwable th12) {
            th = th12;
            totalSpace = -1;
        }
        try {
            language2 = Locale.getDefault().getLanguage();
        } catch (Throwable th13) {
            Tracer.d("DeviceParamsDataProvider: collecting lang exception: ", th13);
        }
        String str8 = language2;
        try {
            HasSystemFeature = this.a.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
        } catch (Throwable th14) {
            Tracer.d("DeviceParamsDataProvider: collecting touchscreen info exception: ", th14);
            HasSystemFeature = -1;
        }
        try {
            currentModeType = ((UiModeManager) this.a.getSystemService("uimode")).getCurrentModeType();
        } catch (Throwable th15) {
            Tracer.d("DeviceParamsDataProvider: collecting ui mode info exception: ", th15);
            currentModeType = -1;
        }
        l lVar2 = new l(3, u0.a(this.a), str4, str7, packageName, string, str2, str5, str6, str8, language, str3, i, i2, i3, f5, f4, f3, i4, totalSpace, j, HasSystemFeature, currentModeType);
        Tracer.d("DeviceParamsDataProvider: collected");
        this.b = lVar2;
        return lVar2;
    }

    private static Point a(Application application) {
        Display display;
        try {
            DisplayManager displayManager = (DisplayManager) application.getSystemService("display");
            if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
                return null;
            }
            Point point = new Point();
            display.getRealSize(point);
            return point;
        } catch (Throwable th) {
            Tracer.d("DeviceParamsDataProvider: collecting screen size exception: ", th);
            return null;
        }
    }
}
