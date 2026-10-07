package defpackage;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class qig extends qrc {
    public static final qig g;
    public static final ifh h;
    public static final ifh i;
    public static final ifh j;
    public static final ifh k;
    public static final ifh l;
    public static final ifh m;
    public static volatile String n;

    static {
        bsc bscVar = new bsc();
        drc drcVar = new drc();
        drcVar.c = true;
        drcVar.b("startup_report");
        drcVar.b = bscVar;
        g = new qig(drcVar.a());
        h = new ifh(new a5d(18));
        i = new ifh(new a5d(19));
        j = new ifh(new a5d(20));
        k = new ifh(new a5d(21));
        l = new ifh(new a5d(22));
        m = new ifh(new a5d(23));
    }

    public static u9c z() {
        return (u9c) i.getValue();
    }

    @Override // defpackage.zqc
    public final void c(pxa pxaVar, int i2) {
        n = null;
    }

    @Override // defpackage.zqc
    public final b9b d(pxa pxaVar) {
        Object poeVar;
        boolean zIsBackgroundRestricted;
        Object value;
        Number number;
        Object poeVar2;
        Object poeVar3;
        long[] jArr = q1f.a;
        b9b b9bVar = new b9b();
        g.getClass();
        u9c u9cVarZ = z();
        gvb gvbVar = u9cVarZ.h;
        zv8[] zv8VarArr = u9c.l;
        if (((Boolean) gvbVar.m(u9cVarZ, zv8VarArr[3])).booleanValue()) {
            b9bVar.k("anr", 1);
            u9c u9cVarZ2 = z();
            u9cVarZ2.h.B(u9cVarZ2, zv8VarArr[3], Boolean.FALSE);
        }
        ifh ifhVar = j;
        if (((Number) ((cjg) ifhVar.getValue()).a.getValue()).intValue() != 0) {
            b9bVar.k("crash", Integer.valueOf(((Number) ((cjg) ifhVar.getValue()).a.getValue()).intValue()));
        }
        ifh ifhVar2 = k;
        Object systemService = ((Context) ifhVar2.getValue()).getSystemService((Class<Object>) PowerManager.class);
        if (systemService == null) {
            ore.p("Required value was null.");
            return null;
        }
        try {
            poeVar = Boolean.valueOf(((PowerManager) systemService).isIgnoringBatteryOptimizations(((Context) ifhVar2.getValue()).getPackageName()));
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (poeVar instanceof poe) {
            poeVar = null;
        }
        Boolean bool = (Boolean) poeVar;
        int reason = 0;
        if (bool != null ? bool.booleanValue() : false) {
            b9bVar.k("ignore_bo", 1);
        }
        qig qigVar = g;
        if (Build.VERSION.SDK_INT >= 28) {
            qigVar.getClass();
            zIsBackgroundRestricted = ((ActivityManager) l.getValue()).isBackgroundRestricted();
        } else {
            qigVar.getClass();
            zIsBackgroundRestricted = false;
        }
        if (zIsBackgroundRestricted) {
            b9bVar.k("no_background", 1);
        }
        qigVar.getClass();
        u9c u9cVarZ3 = z();
        int iIntValue = ((Number) u9cVarZ3.g.m(u9cVarZ3, u9c.l[2])).intValue();
        Integer numValueOf = Integer.valueOf(iIntValue);
        if (iIntValue <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            b9bVar.k("value1", Integer.valueOf(numValueOf.intValue()));
        }
        dd6 dd6Var = (dd6) m.getValue();
        mjg mjgVar = dd6Var.b;
        do {
            value = mjgVar.getValue();
            number = (Number) value;
            number.intValue();
        } while (!mjgVar.h(value, 0));
        int iIntValue2 = number.intValue();
        if (iIntValue2 == 0) {
            SharedPreferences sharedPreferencesA = dd6Var.a();
            if (sharedPreferencesA != null) {
                try {
                    iIntValue2 = sharedPreferencesA.getInt("exc_count", 0);
                } catch (Throwable th2) {
                    dd6Var.b();
                    Log.e("ExceptionCountStat", "fail to fetch value", th2);
                    iIntValue2 = 0;
                }
            } else {
                iIntValue2 = 0;
            }
        }
        dd6Var.b();
        String name = dd6.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, zo5.h(iIntValue2, "getAndClear "), null);
            }
        }
        Integer numValueOf2 = Integer.valueOf(iIntValue2);
        if (iIntValue2 <= 0) {
            numValueOf2 = null;
        }
        if (numValueOf2 != null) {
            b9bVar.k("nonfatals", Integer.valueOf(numValueOf2.intValue()));
        }
        g.getClass();
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            poeVar2 = Float.valueOf((float) ((statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / 1048576.0d));
        } catch (Throwable th3) {
            poeVar2 = new poe(th3);
        }
        Object objValueOf = Float.valueOf(0.0f);
        if (poeVar2 instanceof poe) {
            poeVar2 = objValueOf;
        }
        Float fC0 = yab.c0(Float.valueOf(((Number) poeVar2).floatValue()));
        if (fC0 != null) {
            b9bVar.k("free_space", Float.valueOf(fC0.floatValue()));
        }
        qig qigVar2 = g;
        qigVar2.getClass();
        u9c u9cVarZ4 = z();
        pgg pggVar = u9cVarZ4.j;
        zv8[] zv8VarArr2 = u9c.l;
        bjg bjgVar = (bjg) pggVar.m(u9cVarZ4, zv8VarArr2[6]);
        Long lQ = sb8.Q(Long.valueOf(bjgVar.a));
        if (lQ != null) {
            b9bVar.k("img_total", Long.valueOf(lQ.longValue()));
        }
        Long lQ2 = sb8.Q(Long.valueOf(bjgVar.b));
        if (lQ2 != null) {
            b9bVar.k("img_cache", Long.valueOf(lQ2.longValue()));
        }
        Long lQ3 = sb8.Q(Long.valueOf(bjgVar.c));
        if (lQ3 != null) {
            b9bVar.k("img_err", Long.valueOf(lQ3.longValue()));
        }
        Long lQ4 = sb8.Q(Long.valueOf(bjgVar.a));
        if (lQ4 != null) {
            b9bVar.k("image_media_requests", Long.valueOf(lQ4.longValue()));
        }
        Long lQ5 = sb8.Q(Long.valueOf(bjgVar.d));
        if (lQ5 != null) {
            b9bVar.k("image_cdn_total", Long.valueOf(lQ5.longValue()));
        }
        Long lQ6 = sb8.Q(Long.valueOf(bjgVar.e));
        if (lQ6 != null) {
            b9bVar.k("image_cdn_success", Long.valueOf(lQ6.longValue()));
        }
        Long lQ7 = sb8.Q(Long.valueOf(bjgVar.f));
        if (lQ7 != null) {
            b9bVar.k("image_cdn_min_time_fb", Long.valueOf(lQ7.longValue()));
        }
        Long lQ8 = sb8.Q(Long.valueOf(bjgVar.g));
        if (lQ8 != null) {
            b9bVar.k("image_cdn_max_time_fb", Long.valueOf(lQ8.longValue()));
        }
        Long lQ9 = sb8.Q(Long.valueOf(bjgVar.h));
        if (lQ9 != null) {
            b9bVar.k("image_cdn_min_time_integral", Long.valueOf(lQ9.longValue()));
        }
        Long lQ10 = sb8.Q(Long.valueOf(bjgVar.i));
        if (lQ10 != null) {
            b9bVar.k("image_cdn_max_time_integral", Long.valueOf(lQ10.longValue()));
        }
        Long lQ11 = sb8.Q(Long.valueOf(bjgVar.j));
        if (lQ11 != null) {
            b9bVar.k("image_home_total", Long.valueOf(lQ11.longValue()));
        }
        Long lQ12 = sb8.Q(Long.valueOf(bjgVar.k));
        if (lQ12 != null) {
            b9bVar.k("image_home_success", Long.valueOf(lQ12.longValue()));
        }
        Long lQ13 = sb8.Q(Long.valueOf(bjgVar.l));
        if (lQ13 != null) {
            b9bVar.k("image_home_min_time_fb", Long.valueOf(lQ13.longValue()));
        }
        Long lQ14 = sb8.Q(Long.valueOf(bjgVar.m));
        if (lQ14 != null) {
            b9bVar.k("image_home_max_time_fb", Long.valueOf(lQ14.longValue()));
        }
        Long lQ15 = sb8.Q(Long.valueOf(bjgVar.n));
        if (lQ15 != null) {
            b9bVar.k("image_home_min_time_integral", Long.valueOf(lQ15.longValue()));
        }
        Long lQ16 = sb8.Q(Long.valueOf(bjgVar.o));
        if (lQ16 != null) {
            b9bVar.k("image_home_max_time_integral", Long.valueOf(lQ16.longValue()));
        }
        Long lQ17 = sb8.Q(Long.valueOf(bjgVar.p));
        if (lQ17 != null) {
            b9bVar.k("image_cache_total", Long.valueOf(lQ17.longValue()));
        }
        Long lQ18 = sb8.Q(Long.valueOf(bjgVar.q));
        if (lQ18 != null) {
            b9bVar.k("image_cache_success", Long.valueOf(lQ18.longValue()));
        }
        u9c u9cVarZ5 = z();
        bjg.Companion.getClass();
        u9cVarZ5.j.B(u9cVarZ5, zv8VarArr2[6], bjg.r);
        u9c u9cVarZ6 = z();
        String str = (String) u9cVarZ6.e.m(u9cVarZ6, zv8VarArr2[0]);
        if (r5h.X0(str)) {
            str = null;
        }
        if (str != null) {
            b9bVar.k("value2", str);
        }
        u9c u9cVarZ7 = z();
        u9cVarZ7.e.B(u9cVarZ7, zv8VarArr2[0], "");
        int i2 = Build.VERSION.SDK_INT;
        b9bVar.k("bucket", Integer.valueOf(i2 >= 28 ? ((UsageStatsManager) ((Context) k.getValue()).getSystemService("usagestats")).getAppStandbyBucket() : 10));
        ifh ifhVar3 = l;
        b9bVar.k("memory", Integer.valueOf(((ActivityManager) ifhVar3.getValue()).getMemoryClass()));
        b9bVar.k("large_memory", Integer.valueOf(((ActivityManager) ifhVar3.getValue()).getLargeMemoryClass()));
        b9bVar.k("class", Byte.valueOf(qigVar2.a.c().a()));
        if (i2 >= 30) {
            Context context = (Context) k.getValue();
            try {
                Object systemService2 = context.getSystemService((Class<Object>) ActivityManager.class);
                if (systemService2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                poeVar3 = r4.d(ww3.t1(((ActivityManager) systemService2).getHistoricalProcessExitReasons(null, 0, 1)));
                Throwable thA = roe.a(poeVar3);
                if (thA != null) {
                    String name2 = context.getClass().getName();
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        je9 je9Var2 = je9.f;
                        if (a4cVar2.b(je9Var2)) {
                            a4cVar2.c(je9Var2, name2, "Error during retrieving exit reason!", thA);
                        }
                    }
                }
                ApplicationExitInfo applicationExitInfoD = r4.d(poeVar3 instanceof poe ? null : poeVar3);
                if (applicationExitInfoD != null) {
                    reason = applicationExitInfoD.getReason();
                }
            } catch (Throwable th4) {
                poeVar3 = new poe(th4);
            }
        }
        b9bVar.k("exit_reason", Integer.valueOf(reason));
        return b9bVar;
    }
}
