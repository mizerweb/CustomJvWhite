package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class lu0 {
    public final boolean a;
    public final trc b;
    public final Context c;
    public final ny8 d;

    public lu0(ny8 ny8Var, boolean z, trc trcVar, Context context) {
        this.a = z;
        this.b = trcVar;
        this.c = context;
        this.d = ny8Var;
    }

    public static ul9 a(long j, wu0 wu0Var, double d) {
        ul9 ul9Var = new ul9();
        ul9Var.put("duration", Long.valueOf(ew5.g(j)));
        ul9Var.put("score", Double.valueOf(d));
        ul9Var.put("capacity", Long.valueOf(wu0Var.a));
        ul9Var.put("cpu", Long.valueOf(wu0Var.b));
        ul9Var.put("temp", Double.valueOf(wu0Var.k / 10.0d));
        ul9Var.put("bo", Boolean.valueOf(wu0Var.l));
        ul9Var.put("ba", Boolean.valueOf(wu0Var.m));
        ul9Var.put("processes", Long.valueOf(wu0Var.i));
        ul9Var.put("netTypes", Integer.valueOf(wu0Var.j));
        ul9Var.put("mrx", Long.valueOf(wu0Var.c));
        ul9Var.put("mtx", Long.valueOf(wu0Var.d));
        ul9Var.put("midle", Long.valueOf(wu0Var.e));
        ul9Var.put("wrx", Long.valueOf(wu0Var.f));
        ul9Var.put("wtx", Long.valueOf(wu0Var.g));
        ul9Var.put("widle", Long.valueOf(wu0Var.h));
        return ul9Var.b();
    }

    public static wu0 c(xu0 xu0Var) {
        return new wu0(xu0Var.p(), xu0Var.q(), xu0Var.t(), xu0Var.u(), xu0Var.s(), xu0Var.getWifiRxBytes(), xu0Var.getWifiTxBytes(), xu0Var.z(), xu0Var.w(), xu0Var.v(), xu0Var.r(), xu0Var.y(), xu0Var.x());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x015f  */
    public final void b(nu0 nu0Var) {
        Object obj;
        Object poeVar;
        int intExtra;
        int i;
        if (this.a) {
            yj5 yj5Var = (yj5) this.d.getValue();
            xj5 xj5Var = xj5.BATTERY;
            float fG = ew5.g(nu0Var.a);
            float fG2 = ew5.g(nu0Var.b);
            float fG3 = ew5.g(nu0Var.c);
            float fG4 = ew5.g(nu0Var.d);
            float f = (float) nu0Var.e;
            int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
            if (iAvailableProcessors < 1) {
                iAvailableProcessors = 1;
            }
            float f2 = iAvailableProcessors;
            float f3 = lvb.w0(this.c).a;
            float f4 = (float) nu0Var.f;
            float f5 = (float) nu0Var.g;
            wu0 wu0Var = nu0Var.h;
            float f6 = wu0Var.a;
            wu0 wu0Var2 = nu0Var.i;
            float f7 = wu0Var2.a;
            float f8 = wu0Var.b;
            float f9 = wu0Var2.b;
            float f10 = wu0Var.i;
            float f11 = wu0Var2.i;
            String strB = cel.b(wu0Var);
            String strB2 = cel.b(nu0Var.i);
            wu0 wu0Var3 = nu0Var.h;
            wu0 wu0Var4 = nu0Var.i;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = new cu8(linkedHashMap).toString();
            wu0 wu0Var5 = nu0Var.h;
            wu0 wu0Var6 = nu0Var.i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            String string2 = new cu8(linkedHashMap2).toString();
            wu0 wu0Var7 = nu0Var.h;
            wu0 wu0Var8 = nu0Var.i;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            String string3 = new cu8(linkedHashMap3).toString();
            try {
                poeVar = np4.z(this.c, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), null, null, 4);
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            String string4 = null;
            if (poeVar instanceof poe) {
                poeVar = null;
            }
            Intent intent = (Intent) poeVar;
            if (intent == null) {
                String name = lu0.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, "Can't retrieve info about battery", null);
                    }
                }
            } else {
                string3 = string3;
                int intExtra2 = intent.getIntExtra("health", 1);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 36) {
                    intExtra = intent.getIntExtra("android.os.extra.CYCLE_COUNT", -1);
                    i = 36;
                } else {
                    intExtra = -1;
                    i = 36;
                }
                int intExtra3 = i2 >= i ? intent.getIntExtra("android.os.extra.CAPACITY_LEVEL", -1) : -1;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                string4 = new cu8(linkedHashMap4).toString();
            }
            obj = "fg";
            yj5.a(yj5Var, xj5Var, fG, fG2, fG3, fG4, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, 0.0f, strB, strB2, string, string2, string3, string4, null, -8323072);
        } else {
            obj = "fg";
        }
        trc trcVar = this.b;
        ul9 ul9Var = new ul9();
        ul9Var.put("estimated", Long.valueOf(ew5.g(nu0Var.a)));
        ul9Var.put("cached", Long.valueOf(ew5.g(nu0Var.b)));
        ul9Var.put("clkTck", Double.valueOf(nu0Var.e));
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        if (iAvailableProcessors2 < 1) {
            iAvailableProcessors2 = 1;
        }
        ul9Var.put("cores", Integer.valueOf(iAvailableProcessors2));
        ul9Var.put("class", Byte.valueOf(lvb.w0(this.c).a));
        ul9Var.put(obj, a(nu0Var.c, nu0Var.h, nu0Var.f));
        ul9Var.put("bg", a(nu0Var.d, nu0Var.i, nu0Var.g));
        ae9.k((ae9) trcVar.c.getValue(), "PERF_BATTERY", "battery", ul9Var.b(), 8);
    }
}
