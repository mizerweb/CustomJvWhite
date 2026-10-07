package defpackage;

import android.app.Application;
import android.content.Context;
import android.net.TrafficStats;
import android.telephony.TelephonyManager;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0007"}, d2 = {"Ljt5;", "Ljava/io/Closeable;", "Lsbi;", "P", "()V", "close", "a", "dpslib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class jt5 implements Closeable {
    public final ExecutorService a;
    public final acj b;
    public final dni c;
    public final gt3 d;
    public final mk5 e;
    public final boolean f;
    public final Context g;
    public final zek h;
    public final oik i;
    public final jdk j;
    public final t3k k;
    public final i4e l;
    public final rik m;
    public volatile s9k n;
    public volatile boolean o;
    public final AtomicBoolean p;
    public volatile long q;
    public final boolean r;
    public igk s;

    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b>\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u0013J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010\u0013J\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0010¢\u0006\u0004\b%\u0010\u0013J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b*\u0010)J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00002\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b1\u00102J\r\u00104\u001a\u000203¢\u0006\u0004\b4\u00105R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u00106\u001a\u0004\u0018\u00010\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010\u0015\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010R\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010$\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\bY\u0010[\"\u0004\b\\\u0010]R\"\u0010c\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010f\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bN\u0010^\u001a\u0004\bd\u0010`\"\u0004\be\u0010bR\"\u0010,\u001a\u00020+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bU\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR$\u00100\u001a\u0004\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010p¨\u0006q"}, d2 = {"Ljt5$a;", "", "<init>", "()V", "Landroid/app/Application;", CallAnalyticsApiRequest.KEY_APPLICATION, "t", "(Landroid/app/Application;)Ljt5$a;", "Lacj;", "wallClock", "N", "(Lacj;)Ljt5$a;", "Ljava/util/concurrent/ExecutorService;", "executorService", "A", "(Ljava/util/concurrent/ExecutorService;)Ljt5$a;", "", "userId", "K", "(Ljava/lang/String;)Ljt5$a;", "Ldni;", "userIdSupplier", "L", "(Ldni;)Ljt5$a;", ApiProtocol.PARAM_DEVICE_ID, "x", "Lmk5;", "deviceIdSupplier", "y", "(Lmk5;)Ljt5$a;", "version", "u", "Lgt3;", "versionSupplier", "w", "(Lgt3;)Ljt5$a;", "apiKey", "r", "", "enabled", "C", "(Z)Ljt5$a;", "I", "Li4e;", "random", "G", "(Li4e;)Ljt5$a;", "Lahk;", "httpClient", "E", "(Lahk;)Ljt5$a;", "Ljt5;", "e", "()Ljt5;", SdkMetricStatEvent.VALUE_KEY, "a", "Landroid/app/Application;", "h", "()Landroid/app/Application;", "b", "Ljava/util/concurrent/ExecutorService;", "k", "()Ljava/util/concurrent/ExecutorService;", "B", "(Ljava/util/concurrent/ExecutorService;)V", DatabaseHelper.COMPRESSED_COLUMN_NAME, "Lacj;", "q", "()Lacj;", "O", "(Lacj;)V", "d", "Ldni;", "p", "()Ldni;", "M", "(Ldni;)V", "Lgt3;", "i", "()Lgt3;", "v", "(Lgt3;)V", "clientVersion", "f", "Lmk5;", "j", "()Lmk5;", "z", "(Lmk5;)V", "g", "Ljava/lang/String;", "()Ljava/lang/String;", "s", "(Ljava/lang/String;)V", "Z", "l", "()Z", "D", "(Z)V", "foregroundDetectionEnabled", "o", "J", "tlsCheckEnabled", "Li4e;", "n", "()Li4e;", "H", "(Li4e;)V", "Lahk;", "m", "()Lahk;", "F", "(Lahk;)V", "dpslib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public Application application;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public ExecutorService executorService;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public acj wallClock;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public mk5 deviceIdSupplier;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public String apiKey;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public boolean tlsCheckEnabled;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        public ahk httpClient;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public dni userIdSupplier = new gt5();

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public gt3 clientVersion = new ht5();

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public boolean foregroundDetectionEnabled = true;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        public i4e random = i4e.a;

        public static final String a() {
            return null;
        }

        public static final String b(String str) {
            return str;
        }

        public static final String c() {
            return null;
        }

        public static final String d(String str) {
            return str;
        }

        public static final String f(String str) {
            return str;
        }

        public final a A(ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        public final void B(ExecutorService executorService) {
            this.executorService = executorService;
        }

        public final a C(boolean enabled) {
            this.foregroundDetectionEnabled = enabled;
            return this;
        }

        public final void D(boolean z) {
            this.foregroundDetectionEnabled = z;
        }

        public final a E(ahk httpClient) {
            this.httpClient = httpClient;
            return this;
        }

        public final void F(ahk ahkVar) {
            this.httpClient = ahkVar;
        }

        public final a G(i4e random) {
            this.random = random;
            return this;
        }

        public final void H(i4e i4eVar) {
            this.random = i4eVar;
        }

        public final a I(boolean enabled) {
            this.tlsCheckEnabled = enabled;
            return this;
        }

        public final void J(boolean z) {
            this.tlsCheckEnabled = z;
        }

        public final a K(final String userId) {
            this.userIdSupplier = new dni() { // from class: ft5
                @Override // defpackage.dni
                public final String getUserId() {
                    return jt5.a.f(userId);
                }
            };
            return this;
        }

        public final a L(dni userIdSupplier) {
            this.userIdSupplier = userIdSupplier;
            return this;
        }

        public final void M(dni dniVar) {
            this.userIdSupplier = dniVar;
        }

        public final a N(acj wallClock) {
            this.wallClock = wallClock;
            return this;
        }

        public final void O(acj acjVar) {
            this.wallClock = acjVar;
        }

        public final jt5 e() {
            if (this.application == null) {
                c.o(wk8.b("c395d4e2a3a4e5af8bb7f4b78bbbfbe38ba7b5b187a5e0aa90b1f1edc297f4af8ef4e6a69695e5b38ebdf6a296bdfaadcafdb5a187b2fab187f4f7b68bb8f1ebcbfa"));
                return null;
            }
            if (this.apiKey != null) {
                return new jt5(this, null);
            }
            c.o(wk8.b("444af85a1b88230f3f816a2d29d838212b8d23363f9c6464199926287a8b2f301b88230f3f81626d7a9a2f22358a2f64388d23283ed0636a"));
            return null;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getApiKey() {
            return this.apiKey;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final Application getApplication() {
            return this.application;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final gt3 getClientVersion() {
            return this.clientVersion;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final mk5 getDeviceIdSupplier() {
            return this.deviceIdSupplier;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final ExecutorService getExecutorService() {
            return this.executorService;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final boolean getForegroundDetectionEnabled() {
            return this.foregroundDetectionEnabled;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final ahk getHttpClient() {
            return this.httpClient;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final i4e getRandom() {
            return this.random;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final boolean getTlsCheckEnabled() {
            return this.tlsCheckEnabled;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final dni getUserIdSupplier() {
            return this.userIdSupplier;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final acj getWallClock() {
            return this.wallClock;
        }

        public final a r(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public final void s(String str) {
            this.apiKey = str;
        }

        public final a t(Application application) {
            this.application = application;
            return this;
        }

        public final a u(final String version) {
            this.clientVersion = new gt3() { // from class: it5
                @Override // defpackage.gt3
                public final String a() {
                    return jt5.a.b(version);
                }
            };
            return this;
        }

        public final void v(gt3 gt3Var) {
            this.clientVersion = gt3Var;
        }

        public final a w(gt3 versionSupplier) {
            this.clientVersion = versionSupplier;
            return this;
        }

        public final a x(final String deviceId) {
            this.deviceIdSupplier = new mk5() { // from class: et5
                @Override // defpackage.mk5
                public final String a() {
                    return jt5.a.d(deviceId);
                }
            };
            return this;
        }

        public final a y(mk5 deviceIdSupplier) {
            this.deviceIdSupplier = deviceIdSupplier;
            return this;
        }

        public final void z(mk5 mk5Var) {
            this.deviceIdSupplier = mk5Var;
        }
    }

    public jt5(a aVar) {
        ExecutorService executorServiceNewFixedThreadPool;
        this.p = new AtomicBoolean(false);
        Application application = aVar.getApplication();
        if (application == null) {
            c.o(wk8.b("37c6bffdbccfb65b94dca74394d0a81794cce64598ceb35e8fdaa2"));
            throw null;
        }
        if (aVar.getExecutorService() != null) {
            this.r = true;
            executorServiceNewFixedThreadPool = aVar.getExecutorService();
            if (executorServiceNewFixedThreadPool == null) {
                ore.k("Required value was null.");
                throw null;
            }
        } else {
            this.r = false;
            executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(4, new ct5(0, new AtomicInteger(0)));
        }
        this.a = executorServiceNewFixedThreadPool;
        acj wallClock = aVar.getWallClock();
        this.b = wallClock == null ? new c(25) : wallClock;
        Context applicationContext = application.getApplicationContext();
        this.g = applicationContext;
        this.l = aVar.getRandom();
        this.c = aVar.getUserIdSupplier();
        this.d = aVar.getClientVersion();
        mk5 deviceIdSupplier = aVar.getDeviceIdSupplier();
        this.e = deviceIdSupplier == null ? new t95(applicationContext) : deviceIdSupplier;
        this.f = aVar.getTlsCheckEnabled();
        this.h = new zek(applicationContext);
        this.m = new rik(applicationContext);
        this.i = new oik(applicationContext.getFilesDir());
        this.j = new jdk(applicationContext.getFilesDir());
        ifh ifhVar = new ifh(new i94(20));
        String apiKey = aVar.getApiKey();
        if (apiKey == null) {
            c.o(wk8.b("efaa54226324c3a4472d8a865174d88a5321c39d4730"));
            throw null;
        }
        ahk httpClient = aVar.getHttpClient();
        this.k = new t3k(apiKey, ifhVar, httpClient == null ? new uhk() : httpClient);
        if (aVar.getForegroundDetectionEnabled()) {
            igk igkVar = new igk(application, new d2(18, this));
            this.s = igkVar;
            application.registerActivityLifecycleCallbacks(igkVar);
        }
    }

    public static final String I() {
        return wk8.b("ad40cd90f4bd3382").concat(wk8.b("f7eb4151606fd9d963"));
    }

    public static final void K(jt5 jt5Var) {
        try {
            s9k s9kVarB = jt5Var.j.b();
            jt5Var.n = s9kVarB;
            jt5Var.q = jt5Var.j.d();
            if (jt5Var.l.b() >= s9kVarB.h) {
                jt5Var.p.set(false);
                jt5Var.p.set(false);
            } else {
                try {
                    jt5Var.A(s9kVarB);
                } catch (RejectedExecutionException unused) {
                    jt5Var.close();
                }
                jt5Var.p.set(false);
            }
        } catch (Throwable th) {
            jt5Var.p.set(false);
            throw th;
        }
    }

    public static final long a() {
        return System.currentTimeMillis();
    }

    public static final sbi b(jt5 jt5Var) {
        jt5Var.P();
        return sbi.a;
    }

    public static final Thread g(AtomicInteger atomicInteger, Runnable runnable) {
        return new Thread(runnable, wk8.b("68af065f1b56fc") + '-' + atomicInteger.getAndIncrement());
    }

    public static ArrayList l(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Long lValueOf = Long.valueOf(((eik) obj).b);
            Object arrayList = linkedHashMap.get(lValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) ((Map.Entry) it.next()).getValue()).iterator();
            if (!it2.hasNext()) {
                c.i("Empty collection can't be reduced.");
                return null;
            }
            Object next = it2.next();
            while (it2.hasNext()) {
                eik eikVar = (eik) it2.next();
                eik eikVar2 = (eik) next;
                String str = eikVar2.a;
                String str2 = eikVar2.f;
                boolean z = eikVar2.g;
                long j = eikVar2.b;
                long jMax = Math.max(eikVar2.c, eikVar.c);
                String str3 = str2;
                String str4 = eikVar2.d;
                int iMin = Math.min(eikVar2.e, eikVar.e);
                if (!z || r5h.X0(str3)) {
                    str3 = eikVar.f;
                }
                boolean z2 = z || eikVar.g;
                Map map = eikVar2.h;
                Map map2 = eikVar.h;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
                for (Map.Entry entry : map2.entrySet()) {
                    int iIntValue = ((Number) entry.getKey()).intValue();
                    byte b = ((bkk) entry.getValue()).a;
                    Iterator it3 = it;
                    bkk bkkVar = (bkk) linkedHashMap2.get(Integer.valueOf(iIntValue));
                    Iterator it4 = it2;
                    Integer numValueOf = Integer.valueOf(iIntValue);
                    if (bkkVar != null) {
                        b = (byte) (bkkVar.a | b);
                    }
                    linkedHashMap2.put(numValueOf, new bkk(b));
                    it = it3;
                    it2 = it4;
                }
                next = new eik(str, j, jMax, str4, iMin, str3, z2, linkedHashMap2);
            }
            arrayList2.add((eik) next);
        }
        return arrayList2;
    }

    public static final void y(jt5 jt5Var, j7k j7kVar, yik yikVar, long j, long j2, String str, String str2, AtomicInteger atomicInteger, s9k s9kVar) {
        int iDecrementAndGet;
        Boolean boolC;
        try {
            if (!jt5Var.m.a()) {
                if (iDecrementAndGet == 0) {
                    return;
                } else {
                    return;
                }
            }
            int iB = jt5Var.h.b();
            zek zekVar = jt5Var.h;
            Context context = zekVar.a;
            boolean zA = false;
            if (context != null) {
                try {
                    zA = (context.getPackageManager().checkPermission(cjk.a(), context.getPackageName()) != 0 || (boolC = zekVar.c()) == null) ? zek.a() : boolC.booleanValue();
                } catch (Exception unused) {
                }
            }
            boolean z = zA;
            long jNow = jt5Var.b.now();
            byte bA = j7kVar.a(j, yikVar.b);
            if (bA == -1) {
            } else {
                jt5Var.i.d(new eik(UUID.randomUUID().toString(), j2, jNow, str, iB, str2, z, Collections.singletonMap(Integer.valueOf(yikVar.a), new bkk(bA))));
            }
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                jt5Var.E(l(jt5Var.i.a()), s9kVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:76:0x0113  */
    public final void A(s9k s9kVar) throws Throwable {
        int i;
        String strC;
        Object poeVar;
        HttpURLConnection httpURLConnection;
        final jt5 jt5Var = this;
        final s9k s9kVar2 = s9kVar;
        if (jt5Var.m.a()) {
            int i2 = s9kVar2.d;
            List listSingletonList = s9kVar2.b;
            ifh ifhVar = new ifh(new t4i(4));
            HttpURLConnection httpURLConnection2 = null;
            if (listSingletonList.isEmpty()) {
                listSingletonList = null;
            }
            if (listSingletonList == null) {
                listSingletonList = Collections.singletonList(wk8.b("0e2551650d25517e166b0a210c210b630438492017240a"));
            }
            List listV1 = ww3.V1(listSingletonList);
            Collections.shuffle(listV1);
            Iterator it = ((ArrayList) listV1).iterator();
            do {
                i = 0;
                if (!it.hasNext()) {
                    strC = null;
                    break;
                }
                String str = (String) it.next();
                try {
                    TrafficStats.setThreadStatsTag(str.hashCode());
                    try {
                        httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                        httpURLConnection.setConnectTimeout(i2);
                        httpURLConnection.setReadTimeout(i2);
                        try {
                            InputStream inputStream = httpURLConnection.getInputStream();
                            try {
                                try {
                                    TrafficStats.clearThreadStatsTag();
                                    Charset charset = pt2.a;
                                    try {
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
                                        try {
                                            byte[] bArr = new byte[8192];
                                            System.nanoTime();
                                            for (int i3 = inputStream.read(bArr); i3 >= 0; i3 = inputStream.read(bArr)) {
                                                System.nanoTime();
                                                byteArrayOutputStream.write(bArr, 0, i3);
                                                if (Thread.interrupted()) {
                                                    throw new InterruptedException();
                                                }
                                                System.nanoTime();
                                                try {
                                                    throw th;
                                                } catch (Throwable th) {
                                                    rx8.n(inputStream, th);
                                                    throw th;
                                                }
                                            }
                                            byteArrayOutputStream.flush();
                                            try {
                                                byteArrayOutputStream.close();
                                                inputStream.close();
                                                String str2 = new String(byteArrayOutputStream.toByteArray(), charset);
                                                inputStream.close();
                                                tn9 tn9VarA = lge.a((lge) ifhVar.getValue(), str2);
                                                strC = tn9VarA != null ? tn9VarA.c() : null;
                                                if (strC == null) {
                                                    strC = null;
                                                } else {
                                                    if (strC.length() <= 0) {
                                                        strC = null;
                                                    }
                                                    if (strC == null || strC.equals(wk8.b("4ad58095a4b2e264a5aee564a4"))) {
                                                        strC = null;
                                                    }
                                                }
                                                httpURLConnection.disconnect();
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        } catch (Throwable th3) {
                                            try {
                                                throw th3;
                                            } catch (Throwable th4) {
                                                rx8.n(byteArrayOutputStream, th3);
                                                throw th4;
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        try {
                                            throw th5;
                                        } catch (Throwable th6) {
                                            rx8.n(inputStream, th5);
                                            throw th6;
                                        }
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused) {
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                strC = null;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            try {
                                TrafficStats.clearThreadStatsTag();
                                throw th;
                            } catch (Throwable th9) {
                                th = th9;
                                httpURLConnection2 = httpURLConnection;
                                httpURLConnection = httpURLConnection2;
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        httpURLConnection = null;
                    }
                } catch (Exception unused2) {
                    httpURLConnection = null;
                } catch (Throwable th11) {
                    th = th11;
                }
            } while (strC == null);
            final String str3 = strC == null ? "" : strC;
            c79 c79VarW = yab.w();
            c79VarW.add(new rfk(0));
            c79VarW.add(new rfk(1));
            if (jt5Var.f) {
                c79VarW.add(new rfk(2));
            }
            c79 c79VarJ = yab.j(c79VarW);
            List<yik> list = s9kVar2.c;
            long j = s9kVar2.d;
            try {
                Object systemService = jt5Var.g.getSystemService(wk8.b("fb7e5486f63c1195e3"));
                TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
                poeVar = telephonyManager != null ? telephonyManager.getNetworkOperator() + ':' + telephonyManager.getNetworkOperatorName() : null;
            } catch (Throwable th12) {
                poeVar = new poe(th12);
            }
            String str4 = (String) (poeVar instanceof poe ? null : poeVar);
            final String str5 = str4 == null ? "" : str4;
            long jNow = jt5Var.b.now();
            final AtomicInteger atomicInteger = new AtomicInteger(c79VarJ.getSize() * list.size());
            for (final yik yikVar : list) {
                ListIterator listIterator = c79VarJ.listIterator(i);
                while (true) {
                    b79 b79Var = (b79) listIterator;
                    if (b79Var.hasNext()) {
                        final j7k j7kVar = (j7k) b79Var.next();
                        final long j2 = j;
                        final long j3 = jNow;
                        jt5Var.a.execute(new Runnable() { // from class: dt5
                            @Override // java.lang.Runnable
                            public final void run() {
                                jt5.y(this.a, j7kVar, yikVar, j2, j3, str5, str3, atomicInteger, s9kVar2);
                            }
                        });
                        j = j2;
                        jNow = j3;
                        jt5Var = this;
                        s9kVar2 = s9kVar;
                        i = 0;
                    }
                }
                j = j;
                jNow = jNow;
                jt5Var = this;
                s9kVar2 = s9kVar;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0148  */
    public final void E(ArrayList arrayList, s9k s9kVar) {
        Object poeVar;
        Object poeVar2;
        Object poeVar3;
        ArrayList arrayList2;
        t3k t3kVar;
        Integer numValueOf;
        Iterator it;
        v3e ijkVar;
        if (arrayList.iterator().hasNext()) {
            long jNow = this.b.now();
            if (jNow < this.q) {
                return;
            }
            try {
                poeVar = this.c.getUserId();
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            if (poeVar instanceof poe) {
                poeVar = null;
            }
            String str = (String) poeVar;
            try {
                poeVar2 = this.d.a();
            } catch (Throwable th2) {
                poeVar2 = new poe(th2);
            }
            if (poeVar2 instanceof poe) {
                poeVar2 = null;
            }
            String str2 = (String) poeVar2;
            try {
                poeVar3 = this.e.a();
                while (true) {
                    if (!it.hasNext()) {
                        wk8.b("13e6045918688a33316b95672a24807230688377");
                        ijkVar = new ijk();
                        break;
                    } else {
                        try {
                            ijkVar = t3kVar.a((String) it.next(), arrayList2, numValueOf);
                            break;
                        } catch (Exception unused) {
                        }
                    }
                }
            } catch (Throwable th3) {
                poeVar3 = new poe(th3);
            }
            if (poeVar3 instanceof poe) {
                poeVar3 = null;
            }
            String str3 = (String) poeVar3;
            long j = jNow - s9kVar.g;
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (((eik) obj).c >= j) {
                    arrayList3.add(obj);
                }
            }
            List listN1 = ww3.N1(arrayList3, s9kVar.f);
            arrayList2 = new ArrayList(yw3.W0(listN1, 10));
            Iterator it2 = listN1.iterator();
            while (it2.hasNext()) {
                eik eikVar = (eik) it2.next();
                String str4 = eikVar.a;
                long j2 = eikVar.c;
                String str5 = str2 == null ? "" : str2;
                String str6 = eikVar.f;
                int i2 = eikVar.e;
                String str7 = eikVar.d;
                String str8 = !r5h.X0(str7) ? str7 : null;
                boolean z = eikVar.g;
                Map map = eikVar.h;
                ArrayList arrayList4 = new ArrayList(map.size());
                Iterator it3 = map.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    Iterator it4 = it2;
                    int iIntValue = ((Number) entry.getKey()).intValue();
                    byte b = ((bkk) entry.getValue()).a;
                    Iterator it5 = it3;
                    String str9 = str2;
                    if (b == -1) {
                        b = 0;
                    }
                    arrayList4.add(new sgk(iIntValue, b));
                    it2 = it4;
                    it3 = it5;
                    str2 = str9;
                }
                arrayList2.add(new wjk(str4, j2, str5, str6, i2, str8, z, str3, str, arrayList4));
                it2 = it2;
            }
            List list = s9kVar.a;
            if (list.isEmpty()) {
                list = null;
            }
            t3kVar = this.k;
            numValueOf = Integer.valueOf(s9kVar.e);
            if (list != null) {
                t3kVar.getClass();
                if (list.isEmpty()) {
                    list = null;
                }
                if (list == null) {
                    list = t3kVar.a;
                }
            } else {
                list = t3kVar.a;
            }
            List listV1 = ww3.V1(list);
            Collections.shuffle(listV1);
            it = ((ArrayList) listV1).iterator();
            if (!(ijkVar instanceof qjk)) {
                if (ijkVar instanceof pjk) {
                    close();
                    return;
                } else {
                    if (ijkVar instanceof ijk) {
                        return;
                    }
                    ore.o();
                    return;
                }
            }
            oik oikVar = this.i;
            synchronized (oikVar.b) {
                try {
                    DataOutputStream dataOutputStream = oikVar.c;
                    if (dataOutputStream != null) {
                        dataOutputStream.close();
                    }
                    oikVar.c = null;
                    oikVar.a.delete();
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            qjk qjkVar = (qjk) ijkVar;
            Long l = qjkVar.c;
            this.q = l != null ? l.longValue() : 0L;
            jdk jdkVar = this.j;
            Long l2 = qjkVar.c;
            long jLongValue = l2 != null ? l2.longValue() : 0L;
            synchronized (jdkVar.c) {
                DataOutputStream dataOutputStream2 = new DataOutputStream(new FileOutputStream(jdkVar.b));
                try {
                    dataOutputStream2.writeLong(jLongValue);
                    dataOutputStream2.close();
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        rx8.n(dataOutputStream2, th5);
                        throw th6;
                    }
                }
            }
            s9k s9kVar2 = qjkVar.b;
            if (s9kVar2 != null) {
                jdk jdkVar2 = this.j;
                synchronized (jdkVar2.c) {
                    lu6.r0(jdkVar2.a, jdk.c(s9kVar2));
                }
                this.n = s9kVar2;
            }
        }
    }

    public final void P() {
        if (!this.o && this.p.compareAndSet(false, true)) {
            s9k s9kVar = this.n;
            if (s9kVar == null || this.l.b() < s9kVar.h) {
                this.a.execute(new e6(11, this));
            } else {
                this.p.set(false);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.o) {
            return;
        }
        this.o = true;
        igk igkVar = this.s;
        if (igkVar != null) {
            igkVar.a.unregisterActivityLifecycleCallbacks(igkVar);
        }
        this.s = null;
        if (!this.r) {
            this.a.shutdownNow();
        }
        oik oikVar = this.i;
        synchronized (oikVar.b) {
            try {
                DataOutputStream dataOutputStream = oikVar.c;
                if (dataOutputStream != null) {
                    dataOutputStream.close();
                }
                oikVar.c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ jt5(a aVar, j95 j95Var) {
        this(aVar);
    }
}
