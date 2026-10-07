package one.me.android;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import com.vk.push.core.base.AidlException;
import defpackage.a2c;
import defpackage.a4c;
import defpackage.a5d;
import defpackage.a8g;
import defpackage.af7;
import defpackage.as6;
import defpackage.b7b;
import defpackage.b9b;
import defpackage.bk5;
import defpackage.c0g;
import defpackage.c46;
import defpackage.cqk;
import defpackage.d7c;
import defpackage.dk0;
import defpackage.dq4;
import defpackage.e5d;
import defpackage.ew5;
import defpackage.ex5;
import defpackage.f5d;
import defpackage.f5h;
import defpackage.fi3;
import defpackage.ghb;
import defpackage.gm0;
import defpackage.ha4;
import defpackage.ha9;
import defpackage.ic9;
import defpackage.ifh;
import defpackage.j68;
import defpackage.j6b;
import defpackage.ja4;
import defpackage.jcj;
import defpackage.je9;
import defpackage.kc9;
import defpackage.lw5;
import defpackage.m6b;
import defpackage.m94;
import defpackage.mm;
import defpackage.nk0;
import defpackage.ol;
import defpackage.pw;
import defpackage.q1f;
import defpackage.qd6;
import defpackage.qe7;
import defpackage.qig;
import defpackage.qr7;
import defpackage.qrc;
import defpackage.qv1;
import defpackage.qvb;
import defpackage.qzb;
import defpackage.r5h;
import defpackage.r66;
import defpackage.rg9;
import defpackage.rgb;
import defpackage.ste;
import defpackage.tk9;
import defpackage.tre;
import defpackage.u03;
import defpackage.v5;
import defpackage.ww3;
import defpackage.wxb;
import defpackage.x77;
import defpackage.xj5;
import defpackage.xvc;
import defpackage.y5h;
import defpackage.y6b;
import defpackage.yj5;
import defpackage.yw3;
import defpackage.z1c;
import defpackage.zo5;
import defpackage.zv8;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import one.me.android.OneMeApplication;

/* JADX INFO: loaded from: classes.dex */
public class OneMeApplication extends Application implements ha4 {
    public static final long e = SystemClock.uptimeMillis();
    public static final long f;
    public static final /* synthetic */ int g = 0;
    public a4c a;
    public final ifh b = new ifh(new j68(25));
    public final String c = getClass().getName();
    public final ifh d;

    static {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        f = jElapsedRealtime;
        qig qigVar = qig.g;
        qigVar.getClass();
        qig.n = qrc.x(qigVar, null, null, Long.valueOf(jElapsedRealtime), null, 11);
        rg9 rg9Var = rg9.i;
        Long lValueOf = Long.valueOf(jElapsedRealtime);
        rg9Var.getClass();
        b9b b9bVar = q1f.b;
        rg9Var.C(lValueOf, b9bVar);
        u03 u03Var = u03.i;
        Long lValueOf2 = Long.valueOf(jElapsedRealtime);
        u03Var.getClass();
        u03Var.C(lValueOf2, b9bVar);
    }

    public OneMeApplication() {
        Looper.getMainLooper();
        new tk9();
        wxb wxbVar = wxb.a;
        this.d = new ifh(new v5(this, 2));
    }

    @Override // defpackage.ha4
    public final ja4 a() {
        String str = this.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Work manager requesting it configuration", null);
            }
        }
        return (ja4) b().getAccessor().c(1108);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [c46, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Iterable, r66] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.List] */
    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        String strF1;
        Context contextC;
        ?? SingletonList;
        File file;
        String name;
        je9 je9Var = je9.e;
        pw pwVar = kc9.a;
        try {
            File[] fileArrListFiles = context.getFilesDir().listFiles(new ic9(0));
            strF1 = (fileArrListFiles == null || (file = (File) kotlin.collections.a.b1(fileArrListFiles)) == null || (name = file.getName()) == null) ? null : r5h.f1(name, "locale_");
        } catch (IOException e2) {
            gm0.V("LocaleHelper", "localizeBaseContext: io exception while updating lang file", e2);
        } catch (SecurityException e3) {
            gm0.V("LocaleHelper", "localizeBaseContext: security exception while updating lang file", e3);
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var2 = je9.d;
            if (a4cVar.b(je9Var2)) {
                a4cVar.c(je9Var2, "LocaleHelper", qv1.k("localizing base context with lang: ", strF1), null);
            }
        }
        if (strF1 == null) {
            contextC = null;
        } else if (Build.VERSION.SDK_INT >= 33) {
            contextC = context;
        } else {
            kc9.g(strF1);
            contextC = kc9.c(context, strF1);
        }
        if (contextC == null) {
            c0g c0gVar = new c0g(context, m94.l);
            String string = ((SharedPreferences) ((ConcurrentHashMap) c0gVar.b.getValue()).computeIfAbsent("user.prefs", new mm(18, new ol(16, c0gVar, "user.prefs")))).getString("user.lang", "ru");
            if (string == null) {
                string = "";
            }
            if (Build.VERSION.SDK_INT >= 33) {
                contextC = context;
            } else {
                kc9.g(string);
                contextC = kc9.c(context, string);
            }
        }
        super.attachBaseContext(contextC);
        jcj jcjVar = jcj.a;
        jcjVar.getClass();
        ifh ifhVar = new ifh(new rgb(context, 15));
        jcj.d = ifhVar;
        if (jcjVar.f(context)) {
            ghb ghbVar = ew5.b;
            long jNanoTime = System.nanoTime();
            lw5 lw5Var = lw5.NANOSECONDS;
            long jP = qe7.P(jNanoTime, lw5Var);
            f5h f5hVar = f5h.a;
            String str = f5h.b;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9 je9Var3 = je9.c;
                if (a4cVar2.b(je9Var3)) {
                    a4cVar2.c(je9Var3, "f5h", "deactivate", null);
                }
            }
            z1c z1cVarA = jcj.a();
            boolean z = ((as6) ifhVar.getValue()).getBoolean("enabled", jcj.a().a);
            as6 as6Var = (as6) ifhVar.getValue();
            long j = jcj.a().d;
            lw5 lw5Var2 = lw5.SECONDS;
            jcjVar.b(new z1c(z, ((as6) ifhVar.getValue()).getBoolean("idle_sleep", jcj.a().b), ((as6) ifhVar.getValue()).getBoolean("scheduler_enabled", jcj.a().c), qe7.P(as6Var.getLong("stuck", ew5.s(j, lw5Var2)), lw5Var2), qe7.P(((as6) ifhVar.getValue()).getLong("hang", ew5.s(jcj.a().e, lw5Var2)), lw5Var2), ((as6) ifhVar.getValue()).getBoolean("save", jcj.a().f), ((as6) ifhVar.getValue()).getBoolean("short_meta", jcj.a().g), z1cVarA.h, z1cVarA.i, z1cVarA.j));
            String name2 = jcj.class.getName();
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, name2, "applied watchdog config in " + ew5.t(ew5.o(qe7.P(System.nanoTime(), lw5Var), jP)) + ": " + jcj.a(), null);
            }
        }
        xvc.p = xvc.o.f(context);
        a8g.c = a8g.b.f(context);
        final int i = 1;
        dq4 dq4VarA = cqk.a(new qd6(a2c.g((a2c) m94.i.getValue(), "logs", 1, 0, 36)));
        wxb wxbVar = wxb.a;
        a4c a4cVar4 = new a4c(new v5(this, 3), new v5(this, 4), new v5(this, 5), dq4VarA);
        this.a = a4cVar4;
        gm0.f = a4cVar4;
        tre.b = new qr7(19);
        f5h f5hVar2 = f5h.a;
        ?? c46Var = new c46();
        final ste steVar = new ste(c46Var);
        a4c a4cVar5 = this.a;
        if (a4cVar5 == null) {
            a4cVar5 = null;
        }
        final int i2 = 0;
        af7 af7Var = new af7(this) { // from class: rte
            public final /* synthetic */ OneMeApplication b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                poe poeVar;
                Object poeVar2;
                switch (i2) {
                    case 0:
                        OneMeApplication oneMeApplication = this.b;
                        ste steVar2 = steVar;
                        try {
                            vxh.a(oneMeApplication);
                            gm0.n(steVar2.b, "Tracer init success!");
                            Object obj = null;
                            try {
                                try {
                                    poeVar2 = swh.a;
                                    if (swh.b) {
                                        poeVar2 = null;
                                    }
                                } catch (Throwable th) {
                                    poeVar2 = new poe(th);
                                }
                                if (poeVar2 instanceof poe) {
                                    poeVar2 = null;
                                }
                                if (((swh) poeVar2) != null) {
                                    wxb wxbVar2 = wxb.a;
                                }
                                wxb wxbVar3 = wxb.a;
                                poeVar = null;
                            } catch (Throwable th2) {
                                poeVar = new poe(th2);
                            }
                            if (poeVar == null) {
                                obj = poeVar;
                            }
                            if (((f5h) obj) != null) {
                                f5h f5hVar3 = f5h.a;
                            }
                        } catch (Throwable th3) {
                            gm0.V(steVar2.b.concat("/Tracer"), "failed when init", th3);
                        }
                        break;
                    default:
                        OneMeApplication oneMeApplication2 = this.b;
                        ste steVar3 = steVar;
                        try {
                            f0b.a(oneMeApplication2);
                        } catch (IllegalStateException e4) {
                            gm0.V(steVar3.b, "fail to init mlkit context", e4);
                        }
                        break;
                }
                return sbi.a;
            }
        };
        ?? arrayList = r66.a;
        x77 x77VarF = c46Var.f("Tracer", arrayList, af7Var);
        x77 x77VarF2 = c46Var.f("RootScoutScope", Collections.singletonList(x77VarF), new fi3(this, 1, a4cVar5));
        int i3 = 9;
        c46Var.f("MultiaccountManager", Collections.singletonList(x77VarF2), new a5d(i3));
        c46Var.f("RootVisibilityController", Collections.singletonList(x77VarF2), new a5d(10));
        c46Var.f("MlKit", Collections.singletonList(x77VarF), new af7(this) { // from class: rte
            public final /* synthetic */ OneMeApplication b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                poe poeVar;
                Object poeVar2;
                switch (i) {
                    case 0:
                        OneMeApplication oneMeApplication = this.b;
                        ste steVar2 = steVar;
                        try {
                            vxh.a(oneMeApplication);
                            gm0.n(steVar2.b, "Tracer init success!");
                            Object obj = null;
                            try {
                                try {
                                    poeVar2 = swh.a;
                                    if (swh.b) {
                                        poeVar2 = null;
                                    }
                                } catch (Throwable th) {
                                    poeVar2 = new poe(th);
                                }
                                if (poeVar2 instanceof poe) {
                                    poeVar2 = null;
                                }
                                if (((swh) poeVar2) != null) {
                                    wxb wxbVar2 = wxb.a;
                                }
                                wxb wxbVar3 = wxb.a;
                                poeVar = null;
                            } catch (Throwable th2) {
                                poeVar = new poe(th2);
                            }
                            if (poeVar == null) {
                                obj = poeVar;
                            }
                            if (((f5h) obj) != null) {
                                f5h f5hVar3 = f5h.a;
                            }
                        } catch (Throwable th3) {
                            gm0.V(steVar2.b.concat("/Tracer"), "failed when init", th3);
                        }
                        break;
                    default:
                        OneMeApplication oneMeApplication2 = this.b;
                        ste steVar3 = steVar;
                        try {
                            f0b.a(oneMeApplication2);
                        } catch (IllegalStateException e4) {
                            gm0.V(steVar3.b, "fail to init mlkit context", e4);
                        }
                        break;
                }
                return sbi.a;
            }
        });
        c46Var.f("DynamicFont", Collections.singletonList(x77VarF2), new ex5(this, 0));
        c46Var.f("Protobuf", Collections.singletonList(x77VarF), new a5d(11));
        c46Var.d();
        c46Var.f("OneLog", r66.a, new j68(24));
        m6b m6bVar = (m6b) d7c.a.getAccessor().c(173);
        ol olVar = new ol((Object) c46Var, i3, this);
        gm0.x(m6bVar.c, "initAccounts()", null);
        m6bVar.f = olVar;
        ha9 ha9Var = ha9.b;
        if (m6bVar.b) {
            File[] fileArrListFiles2 = m6bVar.a.a.listFiles();
            if (fileArrListFiles2 != null) {
                arrayList = new ArrayList();
                for (File file2 : fileArrListFiles2) {
                    Integer numB0 = y5h.B0(file2.getName());
                    ha9 ha9Var2 = numB0 != null ? new ha9(numB0.intValue()) : null;
                    if (ha9Var2 != null) {
                        arrayList.add(ha9Var2);
                    }
                }
            }
            boolean zIsEmpty = ((Collection) arrayList).isEmpty();
            ?? SingletonList2 = arrayList;
            if (zIsEmpty) {
                SingletonList2 = 0;
            }
            if (SingletonList2 == 0) {
                SingletonList2 = Collections.singletonList(ha9Var);
            }
            boolean zContains = SingletonList2.contains(ha9Var);
            SingletonList = SingletonList2;
            if (!zContains) {
                ArrayList arrayList2 = new ArrayList((Collection) SingletonList2);
                arrayList2.add(0, ha9Var);
                SingletonList = arrayList2;
            }
        } else {
            SingletonList = Collections.singletonList(ha9Var);
        }
        String str2 = m6bVar.c;
        a4c a4cVar6 = gm0.f;
        if (a4cVar6 != null && a4cVar6.b(je9Var)) {
            a4cVar6.c(je9Var, str2, "getInitialAccounts() accounts = " + SingletonList, null);
        }
        Iterable iterable = (Iterable) SingletonList;
        ArrayList arrayList3 = new ArrayList(yw3.W0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList3.add((qvb) olVar.invoke((ha9) it.next()));
        }
        m6bVar.e = arrayList3;
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            ((qvb) it2.next()).b();
        }
    }

    public final qzb b() {
        return (qzb) this.b.getValue();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        Context applicationContext = super.getApplicationContext();
        return applicationContext == null ? this : applicationContext;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SharedPreferences getSharedPreferences(String str, int i) {
        c0g c0gVar = (c0g) this.d.getValue();
        return (SharedPreferences) ((ConcurrentHashMap) c0gVar.b.getValue()).computeIfAbsent(str, new mm(18, new ol(16, c0gVar, str)));
    }

    @Override // android.app.Application
    public final void onCreate() {
        je9 je9Var = je9.f;
        qig qigVar = qig.g;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        qigVar.getClass();
        String str = qig.n;
        if (str != null) {
            qrc.k(qigVar, "app_create", 0, str, false, Long.valueOf(jElapsedRealtime), null, AidlException.SDK_IS_NOT_INITIALIZED);
        } else {
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "onCreate", "Got empty traceId in method=onCreate", null);
            }
        }
        gm0.n(this.c, "onCreate");
        super.onCreate();
        m6b m6bVar = (m6b) d7c.a.getAccessor().c(173);
        gm0.x(m6bVar.c, "awaitInitialization()", null);
        ArrayList arrayList = m6bVar.e;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((qvb) it.next()).a();
            }
        }
        f5h f5hVar = f5h.a;
        boolean zBooleanValue = ((Boolean) ((f5d) b().d()).a.f3.a(e5d.S6[215]).i()).booleanValue();
        je9 je9Var2 = je9.c;
        String str2 = f5h.b;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
            a4cVar2.c(je9Var2, str2, zo5.s("updateLogging: isEnabled=", zBooleanValue), null);
        }
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
            a4cVar3.c(je9Var2, str2, "updateLogging: not allowed", null);
        }
        af7 af7Var = nk0.a;
        nk0.a = new ex5(this, 1);
        dk0.e = new ex5(this, 2);
        gm0.x(m6bVar.c, "warmup()", null);
        ArrayList arrayList2 = m6bVar.e;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((qvb) it2.next()).c();
            }
        }
        m6bVar.e = null;
        Map map = (Map) ((y6b) m6bVar.d.getValue()).h.a.getValue();
        int size = map.size();
        if (size == 0) {
            gm0.n(m6bVar.c, "skip multiaccount stat: no logged in accounts");
        } else {
            b7b b7bVar = (b7b) ((j6b) ww3.q1(map.values())).getAccessor().c(167);
            je9 je9Var3 = je9.d;
            bk5 bk5Var = (bk5) ((e5d) b7bVar.c.getValue()).j().i();
            bk5Var.getClass();
            zv8 zv8Var = bk5.c[10];
            boolean zB = bk5Var.b("multiaccount");
            String str3 = b7bVar.a;
            if (zB) {
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null && a4cVar4.b(je9Var3)) {
                    a4cVar4.c(je9Var3, str3, zo5.h(size, "Sending Multiaccount stat, loggedInAccountCount="), null);
                }
                if (size > 1) {
                    yj5.a((yj5) b7bVar.b.getValue(), xj5.MULTIACCOUNT, size, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, -4);
                }
            } else {
                a4c a4cVar5 = gm0.f;
                if (a4cVar5 != null && a4cVar5.b(je9Var3)) {
                    a4cVar5.c(je9Var3, str3, zo5.h(size, "Multiaccount stat not send, loggedInAccountCount="), null);
                }
            }
        }
        ((qig) b().getAccessor().c(1123)).getClass();
        String str4 = qig.n;
        if (str4 != null) {
            qrc.k(qig.g, "app_init", 1, str4, true, null, null, 112);
            return;
        }
        a4c a4cVar6 = gm0.f;
        if (a4cVar6 != null && a4cVar6.b(je9Var)) {
            a4cVar6.c(je9Var, "onAppCreated", "Got empty traceId in method=onAppCreated", null);
        }
    }
}
