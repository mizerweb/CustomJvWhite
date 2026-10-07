package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.TrafficStats;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.SystemClock;
import android.os.health.HealthStats;
import android.os.health.SystemHealthManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import one.me.metric.battery.internal.obfuscated.o;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lxo9;", "", "Lsbi;", "H", "()V", "one/me/metric/battery/internal/obfuscated/y", "a", "batterylib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class xo9 {
    public final Application a;
    public final vu0 b;
    public final lcg c;
    public final yid d;
    public final tu0 e;
    public final long f;
    public final xt4 g;
    public final m3k h;
    public final ny8 i;
    public final ny8 j;
    public final AtomicBoolean k;
    public final gu4 l;
    public final d9b m;
    public final ny8 n;
    public final ny8 o;
    public final ny8 p;
    public final ljk q;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lxo9$a;", "", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "Lvu0;", "reportListener", "f", "(Lvu0;)Lxo9$a;", "Llcg;", "snapshotRepository", "h", "(Llcg;)Lxo9$a;", "Lyid;", "processTracker", "e", "(Lyid;)Lxo9$a;", "Ltu0;", "logger", "d", "(Ltu0;)Lxo9$a;", "Lew5;", "sliceInterval", "g", "(J)Lxo9$a;", "Lxt4;", "dispatcher", "b", "(Lxt4;)Lxo9$a;", DatabaseHelper.COMPRESSED_COLUMN_NAME, "Lxo9;", "a", "()Lxo9;", "batterylib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public final Application a;
        public vu0 b;
        public lcg c;
        public yid d;
        public tu0 e;
        public ew5 f;
        public xt4 g;
        public xt4 h;

        public a(Application application) {
            this.a = application;
        }

        public final xo9 a() {
            long jO;
            vu0 vu0Var = this.b;
            if (vu0Var == null) {
                ore.k("reportListener is required");
                return null;
            }
            lcg lcgVar = this.c;
            if (lcgVar == null) {
                ore.k("snapshotRepository is required");
                return null;
            }
            tu0 tu0Var = this.e;
            if (tu0Var == null) {
                tu0Var = qqk.a;
            }
            tu0 tu0Var2 = tu0Var;
            xt4 xt4Var = this.g;
            if (xt4Var == null) {
                xt4Var = ao5.b;
            }
            xt4 xt4Var2 = xt4Var;
            xt4 xt4Var3 = this.h;
            if (xt4Var3 == null) {
                ao5 ao5Var = ao5.a;
                xt4Var3 = lb5.c;
            }
            xt4 xt4Var4 = xt4Var3;
            ew5 ew5Var = this.f;
            if (ew5Var != null) {
                jO = ew5Var.a;
            } else {
                ghb ghbVar = ew5.b;
                jO = qe7.O(60, lw5.SECONDS);
            }
            long j = jO;
            yid yidVarB = this.d;
            if (yidVarB == null) {
                yidVarB = yid.INSTANCE.b(tu0Var2);
            }
            yid yidVar = yidVarB;
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("battery_metric_prefs", 0);
            nah nahVarA = wk8.a();
            xt4Var2.getClass();
            return new xo9(this.a, vu0Var, lcgVar, yidVar, tu0Var2, j, xt4Var2, xt4Var4, new m3k(sharedPreferences, tu0Var2, cqk.a(lvb.x0(xt4Var2, nahVarA))), null);
        }

        public final a b(xt4 dispatcher) {
            this.g = dispatcher;
            return this;
        }

        public final a c(xt4 xt4Var) {
            this.h = xt4Var;
            return this;
        }

        public final a d(tu0 logger) {
            this.e = logger;
            return this;
        }

        public final a e(yid processTracker) {
            this.d = processTracker;
            return this;
        }

        public final a f(vu0 reportListener) {
            this.b = reportListener;
            return this;
        }

        public final a g(long sliceInterval) {
            this.f = new ew5(sliceInterval);
            return this;
        }

        public final a h(lcg snapshotRepository) {
            this.c = snapshotRepository;
            return this;
        }
    }

    public xo9(Application application, vu0 vu0Var, lcg lcgVar, yid yidVar, tu0 tu0Var, long j, xt4 xt4Var, xt4 xt4Var2, m3k m3kVar) {
        this.a = application;
        this.b = vu0Var;
        this.c = lcgVar;
        this.d = yidVar;
        this.e = tu0Var;
        this.f = j;
        this.g = xt4Var2;
        this.h = m3kVar;
        final int i = 3;
        this.i = rx8.P(3, new af7(this) { // from class: uo9
            public final /* synthetic */ xo9 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                xo9 xo9Var = this.b;
                switch (i2) {
                    case 0:
                        return xo9.C(xo9Var);
                    case 1:
                        return xo9.x(xo9Var);
                    case 2:
                        return xo9.b(xo9Var);
                    default:
                        return xo9.z(xo9Var);
                }
            }
        });
        final int i2 = 0;
        this.j = rx8.P(3, new af7(this) { // from class: uo9
            public final /* synthetic */ xo9 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                xo9 xo9Var = this.b;
                switch (i3) {
                    case 0:
                        return xo9.C(xo9Var);
                    case 1:
                        return xo9.x(xo9Var);
                    case 2:
                        return xo9.b(xo9Var);
                    default:
                        return xo9.z(xo9Var);
                }
            }
        });
        this.k = new AtomicBoolean(false);
        this.l = cqk.a(lvb.x0(new khk(this), xt4Var).u0(wk8.a()));
        this.m = e9i.b(0, 0, 7);
        this.n = new ifh(new bh9(3));
        final int i3 = 1;
        this.o = new ifh(new af7(this) { // from class: uo9
            public final /* synthetic */ xo9 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                xo9 xo9Var = this.b;
                switch (i4) {
                    case 0:
                        return xo9.C(xo9Var);
                    case 1:
                        return xo9.x(xo9Var);
                    case 2:
                        return xo9.b(xo9Var);
                    default:
                        return xo9.z(xo9Var);
                }
            }
        });
        final int i4 = 2;
        this.p = new ifh(new af7(this) { // from class: uo9
            public final /* synthetic */ xo9 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                xo9 xo9Var = this.b;
                switch (i5) {
                    case 0:
                        return xo9.C(xo9Var);
                    case 1:
                        return xo9.x(xo9Var);
                    case 2:
                        return xo9.b(xo9Var);
                    default:
                        return xo9.z(xo9Var);
                }
            }
        });
        this.q = new ljk(application, tu0Var, new vo9(this, 0), new vo9(this, 1));
    }

    public static final tjk A() {
        return new tjk();
    }

    public static final String B() {
        return "No previous snapshots found";
    }

    public static final gjk C(xo9 xo9Var) {
        return new gjk(xo9Var.a, xo9Var.e);
    }

    public static final String D() {
        return "Previous session dump is empty";
    }

    public static final String E() {
        return "Battery stats are invalid, skip sending";
    }

    public static final String F() {
        return "Report is empty, nothing to send";
    }

    public static final String G() {
        return "Starting interval slice of battery";
    }

    public static final sbi a(xo9 xo9Var, long j) {
        m3k m3kVar = xo9Var.h;
        if (!m3kVar.k) {
            m3kVar.g = j;
            m3kVar.h = SystemClock.uptimeMillis();
            m3kVar.j.add(Long.valueOf(j));
            m3kVar.k = true;
            m3kVar.a();
            m3kVar.b();
        }
        yab.i0(xo9Var.l, null, 0, new cik(xo9Var, j, null, 0), 3);
        return sbi.a;
    }

    public static final ActivityManager b(xo9 xo9Var) {
        Object systemService = xo9Var.a.getSystemService((Class<Object>) ActivityManager.class);
        if (systemService != null) {
            return (ActivityManager) systemService;
        }
        ore.p("Required value was null.");
        return null;
    }

    public static final String f() {
        return "Initializing battery registrar";
    }

    public static final String g(psh pshVar) {
        return "Sliced snapshot for " + ((Object) ew5.t(pshVar.b));
    }

    public static final String h(jgk jgkVar) {
        return "Calculated report -> " + ((tfk) jgkVar).a;
    }

    public static final String i(List list) {
        return "Restoring metrics from previous session, got size->" + list.size();
    }

    public static final tjk k(xo9 xo9Var) {
        return (tjk) xo9Var.n.getValue();
    }

    public static final void q(xo9 xo9Var) {
        e9i.j0(new fz6(new jz(new hde(e9i.m(e9i.I(e9i.o(new oli(xo9Var.a, null, 22))), -1, 2), 19), 11), new fpf(xo9Var, null, 21), 3), xo9Var.l);
    }

    public static final void r(xo9 xo9Var) {
        e9i.j0(new fz6(xo9Var.m, new oli(xo9Var, null, 25), 3), xo9Var.l);
    }

    public static final Object s(xo9 xo9Var, lq4 lq4Var) {
        return yab.K0(xo9Var.g, new fij(xo9Var, (lq4) null, 7), lq4Var);
    }

    public static final sbi w(xo9 xo9Var, long j) {
        m3k m3kVar = xo9Var.h;
        if (m3kVar.k) {
            m3kVar.g = j;
            m3kVar.h = SystemClock.uptimeMillis();
            m3kVar.j.add(Long.valueOf(j));
            m3kVar.k = false;
            m3kVar.a();
            m3kVar.b();
        }
        yab.i0(xo9Var.l, null, 0, new cik(xo9Var, j, null, 1), 3);
        return sbi.a;
    }

    public static final BatteryManager x(xo9 xo9Var) {
        Object systemService = xo9Var.a.getSystemService((Class<Object>) BatteryManager.class);
        if (systemService != null) {
            return (BatteryManager) systemService;
        }
        ore.p("Required value was null.");
        return null;
    }

    public static final String y() {
        return "MaxBatteryMetricRegistrar is already started or disabled";
    }

    public static final bhk z(xo9 xo9Var) {
        tu0 tu0Var = xo9Var.e;
        return new bhk(tu0Var, new lu8(), new fik(tu0Var));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [r66] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final void H() {
        ?? arrayList;
        boolean z;
        Object next;
        boolean zCompareAndSet = this.k.compareAndSet(false, true);
        tu0 tu0Var = this.e;
        if (!zCompareAndSet) {
            s2f.b(tu0Var, null, null, new bh9(10), 3);
            return;
        }
        s2f.a(tu0Var, null, new bh9(9));
        SharedPreferences sharedPreferences = this.h.a;
        long j = sharedPreferences.getLong("start_realtime", 0L);
        long j2 = sharedPreferences.getLong("start_uptime", 0L);
        long j3 = sharedPreferences.getLong("last_realtime", 0L);
        long j4 = sharedPreferences.getLong("last_uptime", 0L);
        String string = sharedPreferences.getString("visibility_times", null);
        if (string == null || string.length() == 0) {
            arrayList = r66.a;
        } else {
            List listM1 = r5h.m1(string, new String[]{","}, 6);
            arrayList = new ArrayList(yw3.W0(listM1, 10));
            Iterator it = listM1.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(Long.parseLong((String) it.next())));
            }
        }
        ku0 ku0Var = new ku0(j, j2, j3, j4, arrayList, sharedPreferences.getBoolean("is_started_in_foreground", true));
        m3k m3kVar = this.h;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.p.getValue()).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator it2 = runningAppProcesses.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((ActivityManager.RunningAppProcessInfo) next).pid != Process.myPid());
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
            if (runningAppProcessInfo == null || runningAppProcessInfo.importance <= 100) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        long startElapsedRealtime = Process.getStartElapsedRealtime();
        long startUptimeMillis = Process.getStartUptimeMillis();
        m3kVar.e = startElapsedRealtime;
        m3kVar.f = startUptimeMillis;
        m3kVar.g = startElapsedRealtime;
        m3kVar.h = startUptimeMillis;
        m3kVar.i = z;
        m3kVar.k = z;
        m3kVar.j.clear();
        m3kVar.a();
        m3kVar.b();
        ljk ljkVar = this.q;
        Application application = ljkVar.a;
        application.registerActivityLifecycleCallbacks(ljkVar.j);
        cg cgVar = new cg(application);
        ((CopyOnWriteArraySet) cgVar.b).add(ljkVar);
        ljkVar.f = cgVar;
        if (cqk.d(Looper.myLooper(), Looper.getMainLooper())) {
            qid.i.f.a(ljkVar.k);
        } else {
            new Handler(Looper.getMainLooper()).post(new kjk(ljkVar, 1));
        }
        yab.i0(this.l, null, 0, new oli(this, ku0Var, null, 28), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(long j, lq4 lq4Var) {
        wgk wgkVar;
        long jC;
        long j2;
        long j3;
        Object poeVar;
        Object poeVar2;
        int i;
        Object poeVar3;
        if (lq4Var instanceof wgk) {
            wgkVar = (wgk) lq4Var;
            int i2 = wgkVar.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wgkVar.h = i2 - Integer.MIN_VALUE;
            } else {
                wgkVar = new wgk(this, lq4Var);
            }
        } else {
            wgkVar = new wgk(this, lq4Var);
        }
        Object objK0 = wgkVar.f;
        int i3 = wgkVar.h;
        if (i3 == 0) {
            ch3.d0(objK0);
            jC = g1b.c();
            wgkVar.d = j;
            wgkVar.e = jC;
            wgkVar.h = 1;
            objK0 = yab.K0(this.g, new fij(this, (lq4) null, 7), wgkVar);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
            j2 = j;
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jC = wgkVar.e;
            long j4 = wgkVar.d;
            ch3.d0(objK0);
            j2 = j4;
        }
        hkk hkkVar = (hkk) objK0;
        gjk gjkVar = (gjk) this.j.getValue();
        String str = gjkVar.c;
        tu0 tu0Var = gjkVar.b;
        try {
            HealthStats healthStatsTakeMyUidSnapshot = ((SystemHealthManager) gjkVar.d.getValue()).takeMyUidSnapshot();
            j3 = 0;
            try {
                poeVar = new wik(new zik(healthStatsTakeMyUidSnapshot.hasMeasurement(10048) ? healthStatsTakeMyUidSnapshot.getMeasurement(10048) : 0L, healthStatsTakeMyUidSnapshot.hasMeasurement(10049) ? healthStatsTakeMyUidSnapshot.getMeasurement(10049) : 0L, healthStatsTakeMyUidSnapshot.hasMeasurement(10024) ? healthStatsTakeMyUidSnapshot.getMeasurement(10024) : 0L), new zik(healthStatsTakeMyUidSnapshot.hasMeasurement(10050) ? healthStatsTakeMyUidSnapshot.getMeasurement(10050) : 0L, healthStatsTakeMyUidSnapshot.hasMeasurement(10051) ? healthStatsTakeMyUidSnapshot.getMeasurement(10051) : 0L, healthStatsTakeMyUidSnapshot.hasMeasurement(10016) ? healthStatsTakeMyUidSnapshot.getMeasurement(10016) : 0L));
            } catch (Throwable th) {
                th = th;
                poeVar = new poe(th);
            }
        } catch (Throwable th2) {
            th = th2;
            j3 = 0;
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            tu0Var.j("MaxBatteryMetricRegistrar".concat(":".concat(str)), thA, new bdk(9));
        }
        if (poeVar instanceof poe) {
            poeVar = null;
        }
        wik wikVar = (wik) poeVar;
        try {
            int i4 = gjkVar.a.getApplicationInfo().uid;
            long uidRxBytes = TrafficStats.getUidRxBytes(i4);
            if (uidRxBytes < j3) {
                uidRxBytes = j3;
            }
            long uidTxBytes = TrafficStats.getUidTxBytes(i4);
            if (uidTxBytes < j3) {
                uidTxBytes = j3;
            }
            poeVar2 = new wik(new zik(uidRxBytes, uidTxBytes, 0L), new zik(0L, 0L, 0L));
        } catch (Throwable th3) {
            poeVar2 = new poe(th3);
        }
        Throwable thA2 = roe.a(poeVar2);
        if (thA2 != null) {
            tu0Var.j("MaxBatteryMetricRegistrar".concat(":".concat(str)), thA2, new bdk(8));
        }
        if (poeVar2 instanceof poe) {
            poeVar2 = null;
        }
        wik wikVar2 = (wik) poeVar2;
        if (wikVar != null) {
            s2f.a(tu0Var, str, new vbi(27, wikVar2));
        } else if (wikVar2 != null) {
            s2f.a(tu0Var, str, new bdk(6));
        } else {
            s2f.a(tu0Var, str, new bdk(7));
        }
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Application application = this.a;
        Intent intentRegisterReceiver = Build.VERSION.SDK_INT >= 33 ? application.registerReceiver(null, intentFilter, 4) : application.registerReceiver(null, intentFilter);
        if (intentRegisterReceiver != null) {
            int intExtra = intentRegisterReceiver.getIntExtra("temperature", 0);
            if (intExtra < 0) {
                intExtra = 0;
            }
            i = intExtra;
        } else {
            i = 0;
        }
        Application application2 = this.a;
        try {
            Object systemService = application2.getSystemService((Class<Object>) PowerManager.class);
            if (systemService == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            poeVar3 = Boolean.valueOf(((PowerManager) systemService).isIgnoringBatteryOptimizations(application2.getPackageName()));
            if (poeVar3 instanceof poe) {
                poeVar3 = null;
            }
            Boolean bool = (Boolean) poeVar3;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            boolean zIsBackgroundRestricted = Build.VERSION.SDK_INT >= 28 ? ((ActivityManager) this.p.getValue()).isBackgroundRestricted() : false;
            long j5 = hkkVar.a;
            long j6 = hkkVar.b;
            long j7 = hkkVar.c;
            long j8 = j2;
            long j9 = hkkVar.d;
            int intProperty = ((BatteryManager) this.o.getValue()).getIntProperty(4);
            psh pshVar = new psh(ish.a(jC), new pv0(j8, j5, j6, j7, j9, intProperty < 0 ? 0 : intProperty, i, wikVar != null ? wikVar.a.a : -1L, wikVar != null ? wikVar.a.b : -1L, wikVar != null ? wikVar.a.c : -1L, wikVar != null ? wikVar.b.a : -1L, wikVar != null ? wikVar.b.b : -1L, wikVar != null ? wikVar.b.c : -1L, wikVar2 != null ? wikVar2.a.a : -1L, wikVar2 != null ? wikVar2.a.b : -1L, this.d.k(), zBooleanValue, zIsBackgroundRestricted, null));
            s2f.a(this.e, null, new ww8(12, pshVar));
            return pshVar;
        } catch (Throwable th4) {
            poeVar3 = new poe(th4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0366  */
    /* JADX WARN: Code duplicated, block: B:141:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:143:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:144:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:57:0x019b A[PHI: r12 r15
  0x019b: PHI (r12v6 boolean) = (r12v3 boolean), (r12v3 boolean), (r12v3 boolean), (r12v8 boolean) binds: [B:76:0x01ec, B:72:0x01d6, B:63:0x01b2, B:56:0x0199] A[DONT_GENERATE, DONT_INLINE]
  0x019b: PHI (r15v4 java.util.Iterator) = (r15v1 java.util.Iterator), (r15v1 java.util.Iterator), (r15v1 java.util.Iterator), (r15v6 java.util.Iterator) binds: [B:76:0x01ec, B:72:0x01d6, B:63:0x01b2, B:56:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x019f A[PHI: r12 r15
  0x019f: PHI (r12v4 boolean) = (r12v3 boolean), (r12v3 boolean), (r12v3 boolean), (r12v7 boolean) binds: [B:76:0x01ec, B:72:0x01d6, B:63:0x01b2, B:58:0x019d] A[DONT_GENERATE, DONT_INLINE]
  0x019f: PHI (r15v2 java.util.Iterator) = (r15v1 java.util.Iterator), (r15v1 java.util.Iterator), (r15v1 java.util.Iterator), (r15v5 java.util.Iterator) binds: [B:76:0x01ec, B:72:0x01d6, B:63:0x01b2, B:58:0x019d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object d(ku0 ku0Var, lq4 lq4Var) {
        egk egkVar;
        ku0 ku0Var2;
        int i;
        int i2;
        Object tfkVar;
        ArrayList arrayList;
        Iterator it;
        boolean z;
        ekk ekkVar;
        ArrayList arrayList2;
        fik fikVar;
        int i3;
        ylc ylcVar;
        if (lq4Var instanceof egk) {
            egkVar = (egk) lq4Var;
            int i4 = egkVar.g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                egkVar.g = i4 - Integer.MIN_VALUE;
            } else {
                egkVar = new egk(this, lq4Var);
            }
        } else {
            egkVar = new egk(this, lq4Var);
        }
        Object objH = egkVar.e;
        int i5 = egkVar.g;
        int i6 = 1;
        if (i5 == 0) {
            ch3.d0(objH);
            lcg lcgVar = this.c;
            egkVar.d = ku0Var;
            egkVar.g = 1;
            objH = lcgVar.H(egkVar);
            hu4 hu4Var = hu4.a;
            if (objH == hu4Var) {
                return hu4Var;
            }
            ku0Var2 = ku0Var;
        } else {
            if (i5 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ku0Var2 = egkVar.d;
            ch3.d0(objH);
        }
        List list = (List) objH;
        boolean zIsEmpty = list.isEmpty();
        tu0 tu0Var = this.e;
        sbi sbiVar = sbi.a;
        if (zIsEmpty) {
            s2f.b(tu0Var, null, null, new bh9(5), 3);
            return sbiVar;
        }
        s2f.a(tu0Var, null, new wo9(0, list));
        if (ku0Var2.r()) {
            s2f.b(this.e, null, null, new bh9(6), 3);
            return sbiVar;
        }
        bhk bhkVar = (bhk) this.i.getValue();
        lu8 lu8Var = bhkVar.b;
        ny8 ny8Var = bhkVar.d;
        ny8 ny8Var2 = bhkVar.e;
        boolean zIsEmpty2 = list.isEmpty();
        ldk ldkVar = ldk.a;
        int i7 = 2;
        if (zIsEmpty2 || ku0Var2.r()) {
            i = 1;
            i2 = 2;
            tfkVar = ldkVar;
        } else {
            List listM1 = ww3.M1(list, new crg(8));
            if (listM1.size() < 2) {
                i = i6;
                i2 = i7;
                ylcVar = null;
            } else {
                int size = listM1.size();
                int i8 = 1;
                while (true) {
                    if (i8 < size) {
                        i2 = i7;
                        pv0 pv0Var = (pv0) listM1.get(i8 - 1);
                        i = i6;
                        pv0 pv0Var2 = (pv0) listM1.get(i8);
                        if (pv0Var2.u() > pv0Var.u()) {
                            ylcVar = new ylc(pv0Var, pv0Var2);
                        } else {
                            i8++;
                            i7 = i2;
                            i6 = i;
                        }
                    } else {
                        i = i6;
                        i2 = i7;
                        ylcVar = null;
                    }
                }
            }
            if (ylcVar != null) {
                Object obj = ylcVar.b;
                pv0 pv0Var3 = (pv0) ylcVar.a;
                int iU = pv0Var3.u();
                pv0 pv0Var4 = (pv0) obj;
                int iU2 = pv0Var4.u();
                long sliceTime = pv0Var3.getSliceTime();
                long sliceTime2 = pv0Var4.getSliceTime();
                int size2 = listM1.size();
                StringBuilder sbP = qv1.p("Battery percent increased between snapshots: prevPercent=", iU, ",currPercent=", iU2, ",delta=");
                sbP.append(iU2 - iU);
                sbP.append(",prevSliceTime=");
                sbP.append(sliceTime);
                qt4.z(sliceTime2, ",currSliceTime=", ",snapshotsCount=", sbP);
                sbP.append(size2);
                tfkVar = new bfk(new o(sbP.toString()));
            } else {
                tfkVar = null;
            }
        }
        if (tfkVar == null) {
            List listM2 = ww3.M1(list, new crg(6));
            boolean zS = ku0Var2.s();
            List<f7k> listA = ku0Var2.a();
            boolean zIsEmpty3 = listM2.isEmpty();
            ekk ekkVar2 = ekk.b;
            ekk ekkVar3 = ekk.a;
            if (zIsEmpty3) {
                arrayList = new ArrayList();
            } else {
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = listM2.iterator();
                while (it2.hasNext()) {
                    pv0 pv0Var5 = (pv0) it2.next();
                    long sliceTime3 = pv0Var5.getSliceTime();
                    if (!listA.isEmpty()) {
                        f7k f7kVar = listA.get(0);
                        it = it2;
                        z = zS;
                        if (sliceTime3 > f7kVar.b) {
                            int size3 = listA.size();
                            int i9 = 0;
                            while (true) {
                                if (i9 < size3) {
                                    f7k f7kVar2 = listA.get(i9);
                                    int i10 = size3;
                                    int i11 = i9;
                                    long j = f7kVar2.b;
                                    if (sliceTime3 > f7kVar2.c || j > sliceTime3) {
                                        i9 = i11 + 1;
                                        size3 = i10;
                                    } else if (f7kVar2.a) {
                                        ekkVar = ekkVar3;
                                    } else {
                                        ekkVar = ekkVar2;
                                    }
                                } else if (listA.get(listA.size() - 1).a) {
                                    ekkVar = ekkVar3;
                                } else {
                                    ekkVar = ekkVar2;
                                }
                            }
                        } else if (f7kVar.a) {
                            ekkVar = ekkVar3;
                        } else {
                            ekkVar = ekkVar2;
                        }
                    } else if (zS) {
                        it = it2;
                        z = zS;
                        ekkVar = ekkVar3;
                    } else {
                        it = it2;
                        z = zS;
                        ekkVar = ekkVar2;
                    }
                    arrayList3.add(new yjk(pv0Var5, ekkVar));
                    zS = z;
                    it2 = it;
                }
                arrayList = arrayList3;
            }
            if (arrayList.isEmpty()) {
                tfkVar = ldkVar;
            } else {
                fik fikVar2 = bhkVar.c;
                LinkedHashMap linkedHashMapS0 = wm9.S0(new ylc(ekkVar3, new qik()), new ylc(ekkVar2, new qik()));
                yjk yjkVar = (yjk) arrayList.get(0);
                ((qik) wm9.N0(linkedHashMapS0, yjkVar.b)).a(yjkVar.a);
                int size4 = arrayList.size();
                int i12 = i;
                while (i12 < size4) {
                    yjk yjkVar2 = (yjk) arrayList.get(i12 - 1);
                    yjk yjkVar3 = (yjk) arrayList.get(i12);
                    pv0 pv0Var6 = yjkVar3.a;
                    long sliceTime4 = pv0Var6.getSliceTime();
                    pv0 pv0Var7 = yjkVar2.a;
                    if (sliceTime4 <= pv0Var7.getSliceTime()) {
                        s2f.b((tu0) fikVar2.b, null, (String) fikVar2.c, new j0i(yjkVar3, 21, yjkVar2), i);
                        arrayList2 = arrayList;
                        fikVar = fikVar2;
                    } else {
                        qik qikVar = (qik) wm9.N0(linkedHashMapS0, yjkVar3.b);
                        qikVar.a(pv0Var6);
                        long j2 = qikVar.a;
                        arrayList2 = arrayList;
                        fikVar = fikVar2;
                        long jU = ((long) pv0Var7.u()) - ((long) pv0Var6.u());
                        if (jU < 0) {
                            jU = 0;
                        }
                        qikVar.a = jU + j2;
                        long j3 = qikVar.b;
                        long jV = pv0Var6.v() - pv0Var7.v();
                        if (jV < 0) {
                            jV = 0;
                        }
                        qikVar.b = jV + j3;
                        if (pv0Var7.O() || pv0Var6.O()) {
                            i = 1;
                            qikVar.j |= 1;
                        } else {
                            boolean z2 = pv0Var7.N() && pv0Var6.N();
                            if (z2) {
                                long jZ = pv0Var6.z() - pv0Var7.z();
                                if (jZ < 0) {
                                    jZ = 0;
                                }
                                long healthStatsMobileTxBytes = pv0Var6.getHealthStatsMobileTxBytes() - pv0Var7.getHealthStatsMobileTxBytes();
                                if (healthStatsMobileTxBytes < 0) {
                                    healthStatsMobileTxBytes = 0;
                                }
                                long healthStatsWifiRxBytes = pv0Var6.getHealthStatsWifiRxBytes() - pv0Var7.getHealthStatsWifiRxBytes();
                                if (healthStatsWifiRxBytes < 0) {
                                    healthStatsWifiRxBytes = 0;
                                }
                                long healthStatsWifiTxBytes = pv0Var6.getHealthStatsWifiTxBytes() - pv0Var7.getHealthStatsWifiTxBytes();
                                if (healthStatsWifiTxBytes < 0) {
                                    healthStatsWifiTxBytes = 0;
                                }
                                if (jZ + healthStatsMobileTxBytes + healthStatsWifiRxBytes + healthStatsWifiTxBytes > 0) {
                                    qikVar.c += jZ;
                                    qikVar.d += healthStatsMobileTxBytes;
                                    long j4 = qikVar.e;
                                    long jY = pv0Var6.y() - pv0Var7.y();
                                    if (jY < 0) {
                                        jY = 0;
                                    }
                                    qikVar.e = jY + j4;
                                    qikVar.f += healthStatsWifiRxBytes;
                                    qikVar.g += healthStatsWifiTxBytes;
                                    long j5 = qikVar.h;
                                    long healthStatsWifiIdleMs = pv0Var6.getHealthStatsWifiIdleMs() - pv0Var7.getHealthStatsWifiIdleMs();
                                    qikVar.h = (healthStatsWifiIdleMs >= 0 ? healthStatsWifiIdleMs : 0L) + j5;
                                    qikVar.j |= 2;
                                } else if (pv0Var7.getTrafficStatsMobileRxBytes() >= 0 || pv0Var6.getTrafficStatsMobileRxBytes() < 0) {
                                    i3 = qikVar.j;
                                    if (z2) {
                                        qikVar.j = i3 | 2;
                                    } else {
                                        qikVar.j = i3 | 1;
                                    }
                                } else {
                                    long j6 = qikVar.c;
                                    long trafficStatsMobileRxBytes = pv0Var6.getTrafficStatsMobileRxBytes() - pv0Var7.getTrafficStatsMobileRxBytes();
                                    if (trafficStatsMobileRxBytes < 0) {
                                        trafficStatsMobileRxBytes = 0;
                                    }
                                    qikVar.c = trafficStatsMobileRxBytes + j6;
                                    long j7 = qikVar.d;
                                    long trafficStatsMobileTxBytes = pv0Var6.getTrafficStatsMobileTxBytes() - pv0Var7.getTrafficStatsMobileTxBytes();
                                    qikVar.d = (trafficStatsMobileTxBytes >= 0 ? trafficStatsMobileTxBytes : 0L) + j7;
                                    qikVar.j |= 4;
                                }
                            } else if (pv0Var7.getTrafficStatsMobileRxBytes() >= 0) {
                                i3 = qikVar.j;
                                if (z2) {
                                    qikVar.j = i3 | 2;
                                } else {
                                    qikVar.j = i3 | 1;
                                }
                            } else {
                                i3 = qikVar.j;
                                if (z2) {
                                    qikVar.j = i3 | 2;
                                } else {
                                    qikVar.j = i3 | 1;
                                }
                            }
                            i = 1;
                        }
                    }
                    i12++;
                    arrayList = arrayList2;
                    fikVar2 = fikVar;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(wm9.P0(linkedHashMapS0.size()));
                for (Map.Entry entry : linkedHashMapS0.entrySet()) {
                    Object key = entry.getKey();
                    qik qikVar2 = (qik) entry.getValue();
                    linkedHashMap.put(key, new xu0(qikVar2.a, qikVar2.b, qikVar2.c, qikVar2.d, qikVar2.e, qikVar2.f, qikVar2.g, qikVar2.h, qikVar2.i, qikVar2.j, qikVar2.k, qikVar2.l, qikVar2.m, null));
                }
                ylc ylcVarK = ku0Var2.k();
                long j8 = ((ew5) ylcVarK.a).a;
                long j9 = ((ew5) ylcVarK.b).a;
                xu0 xu0Var = (xu0) wm9.N0(linkedHashMap, ekkVar3);
                xu0 xu0Var2 = (xu0) wm9.N0(linkedHashMap, ekkVar2);
                tfkVar = new tfk(new uu0(ku0Var2.l(), ku0Var2.j(), j8, j9, ((Number) ny8Var2.getValue()).doubleValue(), xhc.a(xu0Var, j8, ((Number) ny8Var.getValue()).intValue(), ((Number) ny8Var2.getValue()).doubleValue()), xhc.a(xu0Var2, j9, ((Number) ny8Var.getValue()).intValue(), ((Number) ny8Var2.getValue()).doubleValue()), xu0Var, xu0Var2, null));
            }
        }
        if (tfkVar instanceof tfk) {
            tfk tfkVar2 = (tfk) tfkVar;
            s2f.a(this.e, null, new ww8(13, tfkVar2));
            this.b.b(tfkVar2.a);
            return sbiVar;
        }
        if (tfkVar instanceof bfk) {
            s2f.b(this.e, ((bfk) tfkVar).a, null, new bh9(7), i2);
            return sbiVar;
        }
        if (tfkVar.equals(ldkVar)) {
            s2f.b(this.e, null, null, new bh9(8), 3);
            return sbiVar;
        }
        ore.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[PHI: r10
  0x0086: PHI (r10v3 java.lang.Object) = (r10v8 java.lang.Object), (r10v1 java.lang.Object) binds: [B:25:0x0083, B:16:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0094 -> B:19:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(defpackage.lq4 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.thk
            if (r0 == 0) goto L13
            r0 = r10
            thk r0 = (defpackage.thk) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            thk r0 = new thk
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.d
            int r1 = r0.f
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            hu4 r6 = defpackage.hu4.a
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L38
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2e
            defpackage.ch3.d0(r10)
            goto L4a
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r9)
            return r5
        L34:
            defpackage.ch3.d0(r10)
            goto L86
        L38:
            defpackage.ch3.d0(r10)
            goto L79
        L3c:
            defpackage.ch3.d0(r10)
            tu0 r10 = r9.e
            bh9 r1 = new bh9
            r7 = 4
            r1.<init>(r7)
            defpackage.s2f.a(r10, r5, r1)
        L4a:
            vt4 r10 = r0.getContext()
            boolean r10 = defpackage.vd7.E(r10)
            if (r10 == 0) goto L97
            long r7 = r9.f
            ew5 r10 = new ew5
            r10.<init>(r7)
            lw5 r1 = defpackage.lw5.SECONDS
            r5 = 10
            long r7 = defpackage.qe7.O(r5, r1)
            ew5 r1 = new ew5
            r1.<init>(r7)
            java.lang.Comparable r10 = defpackage.oc9.s(r10, r1)
            ew5 r10 = (defpackage.ew5) r10
            long r7 = r10.a
            r0.f = r4
            java.lang.Object r10 = defpackage.rx8.u(r7, r0)
            if (r10 != r6) goto L79
            goto L96
        L79:
            r0.f = r3
            long r7 = android.os.SystemClock.elapsedRealtime()
            java.lang.Object r10 = r9.c(r7, r0)
            if (r10 != r6) goto L86
            goto L96
        L86:
            psh r10 = (defpackage.psh) r10
            java.lang.Object r10 = r10.a
            pv0 r10 = (defpackage.pv0) r10
            d9b r1 = r9.m
            r0.f = r2
            java.lang.Object r10 = r1.emit(r10, r0)
            if (r10 != r6) goto L4a
        L96:
            return r6
        L97:
            sbi r9 = defpackage.sbi.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xo9.e(lq4):java.lang.Object");
    }

    public /* synthetic */ xo9(Application application, vu0 vu0Var, lcg lcgVar, yid yidVar, tu0 tu0Var, long j, xt4 xt4Var, xt4 xt4Var2, m3k m3kVar, j95 j95Var) {
        this(application, vu0Var, lcgVar, yidVar, tu0Var, j, xt4Var, xt4Var2, m3kVar);
    }
}
