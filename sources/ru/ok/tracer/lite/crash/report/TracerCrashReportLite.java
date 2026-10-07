package ru.ok.tracer.lite.crash.report;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.vk.push.core.network.http.BaseHttpHeadersHolder;
import defpackage.a28;
import defpackage.b79;
import defpackage.c79;
import defpackage.dxh;
import defpackage.e9i;
import defpackage.ee9;
import defpackage.euc;
import defpackage.f4g;
import defpackage.fe9;
import defpackage.iql;
import defpackage.ixh;
import defpackage.j95;
import defpackage.kv4;
import defpackage.l28;
import defpackage.lhh;
import defpackage.myl;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.oc9;
import defpackage.oxh;
import defpackage.pe9;
import defpackage.pr6;
import defpackage.pt2;
import defpackage.pv5;
import defpackage.pwf;
import defpackage.qv;
import defpackage.r5h;
import defpackage.rj5;
import defpackage.rv5;
import defpackage.rx8;
import defpackage.sc2;
import defpackage.swh;
import defpackage.uuh;
import defpackage.ww3;
import defpackage.yab;
import defpackage.ywh;
import defpackage.yxl;
import defpackage.z5h;
import defpackage.zwh;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPOutputStream;
import javax.inject.Inject;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.ok.tracer.lite.TracerLite;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 <2\u00020\u0001:\u0002=\u0004B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001b\u0010)\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lru/ok/tracer/lite/crash/report/TracerCrashReportLite;", "", "Lru/ok/tracer/lite/TracerLite;", "tracer", "Lzwh;", "configuration", "<init>", "(Lru/ok/tracer/lite/TracerLite;Lzwh;)V", "", "severity", "", "e", "issueKey", "Lsbi;", "reportException", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "report", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "Lpwf;", "(Lpwf;Ljava/lang/Throwable;Ljava/lang/String;)V", "msg", "log", "(Ljava/lang/String;)V", "Lru/ok/tracer/lite/TracerLite;", "Lzwh;", "Lpe9;", "logStorage", "Lpe9;", "Loxh;", "limits", "Loxh;", "Lkv4;", "uploader", "Lkv4;", "", "tracerIsDisabled", "Z", "nonFatalsEnabled$delegate", "Lny8;", "getNonFatalsEnabled", "()Z", "nonFatalsEnabled", "Luuh;", "nonFatalBucket", "Luuh;", "Ljava/util/concurrent/atomic/AtomicInteger;", "nonFatalDropCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "Llhh;", "getTagsStorage", "()Llhh;", "tagsStorage", "Ljava/util/concurrent/Executor;", "getIoExecutor", "()Ljava/util/concurrent/Executor;", "ioExecutor", "Lpv5;", "getDropManager", "()Lpv5;", "dropManager", "Companion", "ywh", "tracer-lite-crash-report_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TracerCrashReportLite {
    public static final /* synthetic */ int a = 0;
    private final zwh configuration;
    private final oxh limits;
    private final pe9 logStorage;
    private final uuh nonFatalBucket;
    private final AtomicInteger nonFatalDropCount;

    /* JADX INFO: renamed from: nonFatalsEnabled$delegate, reason: from kotlin metadata */
    private final ny8 nonFatalsEnabled;
    private final TracerLite tracer;
    private volatile boolean tracerIsDisabled;
    private final kv4 uploader;
    private static final ywh Companion = new ywh();
    private static final ConcurrentHashMap<String, uuh> nonFatalBuckets = new ConcurrentHashMap<>();

    @Inject
    public TracerCrashReportLite(TracerLite tracerLite, zwh zwhVar) {
        uuh uuhVarPutIfAbsent;
        this.tracer = tracerLite;
        this.configuration = zwhVar;
        this.logStorage = new pe9();
        oxh limits = tracerLite.getLimits();
        this.limits = limits;
        this.uploader = new kv4(tracerLite, limits);
        this.nonFatalsEnabled = rx8.P(2, new qv(9, this));
        ConcurrentHashMap<String, uuh> concurrentHashMap = nonFatalBuckets;
        String libraryPackageName = tracerLite.getLibraryPackageName();
        uuh uuhVar = concurrentHashMap.get(libraryPackageName);
        if (uuhVar == null && (uuhVarPutIfAbsent = concurrentHashMap.putIfAbsent(libraryPackageName, (uuhVar = new uuh(BuildConfig.MAX_TIME_TO_UPLOAD)))) != null) {
            uuhVar = uuhVarPutIfAbsent;
        }
        this.nonFatalBucket = uuhVar;
        this.nonFatalDropCount = new AtomicInteger();
    }

    private final pv5 getDropManager() {
        return (pv5) this.tracer.getDropHolder().a.getValue();
    }

    private final Executor getIoExecutor() {
        return this.tracer.getExecutorHolder().a;
    }

    private final boolean getNonFatalsEnabled() {
        return ((Boolean) this.nonFatalsEnabled.getValue()).booleanValue();
    }

    private final lhh getTagsStorage() {
        return this.tracer.getTagsStorage();
    }

    public static /* synthetic */ void report$default(TracerCrashReportLite tracerCrashReportLite, Throwable th, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        tracerCrashReportLite.report(th, str);
    }

    private final void reportException(String severity, Throwable e, String issueKey) {
        if (this.tracerIsDisabled) {
            Log.d("Tracer", "Tracer is disabled");
            return;
        }
        if (getNonFatalsEnabled()) {
            if (this.limits.b()) {
                Log.e("Tracer", "Feature CRASH_REPORT limited");
            } else {
                if (uuh.a(this.nonFatalBucket)) {
                    getIoExecutor().execute(new sc2(this, severity, e, issueKey, 15));
                    return;
                }
                Log.d("Tracer", "Can't handle non fatal exception. Max non fatal count is reached.");
                this.nonFatalDropCount.incrementAndGet();
                getIoExecutor().execute(new f4g(12, this));
            }
        }
    }

    public static final void reportException$lambda$1(TracerCrashReportLite tracerCrashReportLite) {
        int andSet = tracerCrashReportLite.nonFatalDropCount.getAndSet(0);
        tracerCrashReportLite.configuration.getClass();
        tracerCrashReportLite.getDropManager().a(andSet);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    public static final void reportException$lambda$2(TracerCrashReportLite tracerCrashReportLite, String str, Throwable th, String str2) throws JSONException, IOException {
        String strU1;
        List<ee9> listT1;
        String str3;
        String strP;
        Context context;
        String strG;
        JSONArray jSONArray;
        String string;
        byte[] byteArray;
        String string2;
        String string3;
        if (tracerCrashReportLite.tracer.isDisabled()) {
            Log.d("Tracer", "Tracer is disabled");
            tracerCrashReportLite.tracerIsDisabled = true;
            return;
        }
        if (tracerCrashReportLite.limits.b()) {
            Log.e("Tracer", "Feature CRASH_REPORT limited");
            return;
        }
        kv4 kv4Var = tracerCrashReportLite.uploader;
        if (str2 == null || (string3 = r5h.y1(str2).toString()) == null) {
            strU1 = null;
        } else {
            if (string3.length() <= 0) {
                string3 = null;
            }
            if (string3 != null) {
                strU1 = r5h.u1(32, string3);
            } else {
                strU1 = null;
            }
        }
        pe9 pe9Var = tracerCrashReportLite.logStorage;
        synchronized (pe9Var.b) {
            listT1 = ww3.T1(pe9Var.b);
        }
        lhh tagsStorage = tracerCrashReportLite.getTagsStorage();
        tagsStorage.getClass();
        c79 c79VarW = yab.w();
        synchronized (tagsStorage.a) {
            for (Map.Entry entry : tagsStorage.a.entrySet()) {
                c79VarW.add(((String) entry.getKey()) + "=" + ((String) entry.getValue()));
            }
        }
        c79 c79VarJ = yab.j(c79VarW);
        TracerLite tracerLite = kv4Var.a;
        try {
            String libToken = tracerLite.getLibToken();
            if (libToken == null) {
                throw new IllegalStateException("No lib token");
            }
            Context context2 = tracerLite.getContext();
            try {
                swh swhVar = swh.a;
                str3 = (String) swh.class.getMethod("getAppToken", null).invoke(swh.class.getField("INSTANCE").get(null), null);
            } catch (Exception unused) {
                if (myl.c(context2.getPackageName()) != null) {
                    str3 = "t6QnlHov0Gq1UBGYG9GPqZu0EiVMZ922FKvwyAEASa90";
                } else {
                    String strP2 = oc9.P(context2, "tracer_app_token");
                    str3 = (strP2 == null || strP2.equals("0000000000000000000000000000000000000000000")) ? null : strP2;
                }
            }
            Context context3 = tracerLite.getContext();
            dxh libraryInfo = tracerLite.getLibraryInfo();
            String sessionUuid = tracerLite.getSessionUuid();
            Date date = new Date();
            if (c79VarJ.isEmpty()) {
                c79VarJ = null;
            }
            PackageInfo packageInfoD0 = e9i.d0(context3.getPackageManager(), context3.getPackageName());
            if (myl.c(context3.getPackageName()) != null) {
                strP = "8029e1d0-9b0b-11f1-9268-0c152d90928f";
                context = context3;
            } else {
                strP = oc9.P(context3, "tracer_mapping_uuid");
                if (strP == null) {
                    context = context3;
                } else {
                    context = context3;
                    if (strP.equals("00000000-0000-0000-0000-000000000000")) {
                    }
                }
                strP = null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("packageName", packageInfoD0.packageName);
            jSONObject.put("versionName", packageInfoD0.versionName);
            jSONObject.put("versionCode", n1g.z(packageInfoD0));
            jSONObject.put("buildUuid", strP);
            jSONObject.put("sessionUuid", sessionUuid);
            String str4 = Build.MODEL;
            jSONObject.put("device", str4);
            jSONObject.put(ApiProtocol.PARAM_DEVICE_ID, yab.I(context));
            String str5 = Build.MANUFACTURER;
            jSONObject.put("vendor", str5);
            int i = Build.VERSION.SDK_INT;
            jSONObject.put("osVersion", String.valueOf(i));
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            int i2 = runningAppProcessInfo.importance;
            String str6 = str3;
            jSONObject.put("inBackground", !(i2 == 100 || i2 == 200));
            try {
                strG = yab.G(context);
            } catch (Exception unused2) {
                strG = "UNKNOWN";
            }
            jSONObject.put("connection", strG);
            jSONObject.put("isRooted", yab.f0(context));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("date", iql.a(date));
            jSONObject2.put("board", Build.BOARD);
            jSONObject2.put("brand", Build.BRAND);
            jSONObject2.put("cpuABI", TextUtils.join(", ", Build.SUPPORTED_ABIS));
            jSONObject2.put("device", Build.DEVICE);
            jSONObject2.put(AnalyticsBaseParamsConstantsKt.MANUFACTURER, str5);
            jSONObject2.put("model", str4);
            jSONObject2.put("cpuCount", String.valueOf(Runtime.getRuntime().availableProcessors()));
            jSONObject2.put("osVersionSdkInt", String.valueOf(i));
            jSONObject2.put("osVersionRelease", Build.VERSION.RELEASE);
            if (strU1 != null) {
                jSONObject2.put("issueKey", strU1);
            }
            jSONObject.put("properties", jSONObject2);
            if (c79VarJ != null) {
                jSONArray = new JSONArray();
                ListIterator listIterator = c79VarJ.listIterator(0);
                while (true) {
                    b79 b79Var = (b79) listIterator;
                    if (!b79Var.hasNext()) {
                        break;
                    } else {
                        jSONArray.put((String) b79Var.next());
                    }
                }
            } else {
                jSONArray = null;
            }
            jSONObject.put("tags", jSONArray);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("packageName", libraryInfo.a);
            jSONObject3.put("versionName", libraryInfo.b);
            jSONObject3.put("buildUuid", libraryInfo.c);
            jSONObject3.put("environment", libraryInfo.d);
            jSONObject.put("libraryInfo", jSONObject3);
            String string4 = jSONObject.toString();
            StringBuilder sb = new StringBuilder();
            yxl.b(th, sb);
            byte[] bytes = sb.toString().getBytes(pt2.a);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bytes);
            gZIPOutputStream.close();
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            if (listT1.isEmpty()) {
                string = null;
            } else {
                StringBuilder sb2 = new StringBuilder();
                int i3 = 0;
                for (ee9 ee9Var : listT1) {
                    int i4 = i3 + 1;
                    ee9Var.getClass();
                    sb2.append((CharSequence) "#");
                    sb2.append((CharSequence) String.valueOf(i3));
                    sb2.append((CharSequence) " ");
                    String str7 = fe9.a.format(new Date(ee9Var.a));
                    int length = str7.length();
                    int i5 = length - 2;
                    sb2.append((CharSequence) str7, 0, i5);
                    sb2.append(':');
                    sb2.append((CharSequence) str7, i5, length);
                    sb2.append((CharSequence) " | ");
                    sb2.append((CharSequence) ee9Var.b);
                    sb2.append((CharSequence) "\n");
                    i3 = i4;
                }
                string = sb2.toString();
            }
            if (string != null) {
                byte[] bytes2 = string.getBytes(pt2.a);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream2);
                gZIPOutputStream2.write(bytes2);
                gZIPOutputStream2.close();
                byteArray = byteArrayOutputStream2.toByteArray();
            } else {
                byteArray = null;
            }
            Collection collectionE = ((pv5) kv4Var.a.getDropHolder().a.getValue()).e();
            Collection<rv5> collection = !collectionE.isEmpty() ? collectionE : null;
            if (collection != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (rv5 rv5Var : collection) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("event", rv5Var.a);
                    jSONObject4.put("reason", rv5Var.b);
                    jSONObject4.put("count", rv5Var.c);
                    jSONArray2.put(jSONObject4);
                }
                string2 = jSONArray2.toString();
            } else {
                string2 = null;
            }
            ixh ixhVar = tracerLite.getConfiguration().a;
            Uri.Builder builderAppendQueryParameter = Uri.parse("https://0.0.0.0").buildUpon().appendEncodedPath("api/crash/upload").appendQueryParameter("crashToken", libToken);
            if (str6 != null) {
                builderAppendQueryParameter.appendQueryParameter("crashHostAppToken", str6);
            }
            String string5 = builderAppendQueryParameter.toString();
            rj5 rj5Var = new rj5(16);
            rj5Var.E("type", "NON_FATAL");
            rj5Var.E("format", "JVM_STACKTRACE");
            rj5Var.E("severity", str);
            rj5Var.C("stackTrace", "stack.gzip", new pr6("application/octet-stream", 1, byteArray2));
            Charset charset = pt2.a;
            rj5Var.C("uploadBean", null, new pr6(BaseHttpHeadersHolder.CONTENT_TYPE_JSON, 1, string4.getBytes(charset)));
            if (byteArray != null) {
                rj5Var.C("logs", "logs.gzip", new pr6("application/octet-stream", 1, byteArray));
            }
            if (string2 != null) {
                rj5Var.C("drops", "drops.json", new pr6("application/json", 1, string2.getBytes(charset)));
            }
            try {
                a28 a28VarB = ((l28) kv4Var.b.c.getValue()).b(new euc(string5, rj5Var.I()));
                try {
                    int i6 = a28VarB.b;
                    String str8 = (String) a28VarB.c;
                    pr6 pr6Var = (pr6) a28VarB.d;
                    kv4Var.c.u((String) pr6Var.b, z5h.F0((byte[]) pr6Var.c));
                    if (i6 == 200) {
                        return;
                    }
                    throw new IOException("HTTP " + i6 + " " + str8);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        rx8.n(a28VarB, th2);
                        throw th3;
                    }
                }
            } catch (IOException e) {
                Log.e("ru.ok.tracer", "Tracer crash report failed", e);
                ((pv5) kv4Var.a.getDropHolder().a.getValue()).b(collectionE);
            }
            Log.e("ru.ok.tracer", "Tracer crash report failed", e);
            ((pv5) kv4Var.a.getDropHolder().a.getValue()).b(collectionE);
        } catch (Exception unused3) {
            Log.e("Tracer", "No lib token");
        }
    }

    public final void log(String msg) {
        if (this.tracerIsDisabled) {
            Log.d("Tracer", "Tracer is disabled");
            return;
        }
        pe9 pe9Var = this.logStorage;
        pe9Var.getClass();
        String strU1 = r5h.u1(65500, msg);
        ee9 ee9Var = new ee9(System.currentTimeMillis(), strU1);
        synchronized (pe9Var.b) {
            pe9Var.b.addLast(ee9Var);
            pe9Var.a = strU1.length() + 36 + pe9Var.a;
            while (pe9Var.a > 65536) {
                pe9Var.a -= ((ee9) pe9Var.b.removeFirst()).b.length() + 36;
            }
        }
    }

    public final void report(Throwable e, String issueKey) {
    }

    public final void report(pwf severity, Throwable e, String issueKey) {
        String str;
        if (severity == pwf.b) {
            str = "FATAL";
        } else if (severity == pwf.c) {
            str = "ERROR";
        } else if (severity == pwf.d) {
            str = "WARNING";
        } else if (severity != pwf.e) {
            str = severity != pwf.f ? "DEBUG" : "INFO";
        } else {
            str = "NOTICE";
        }
        reportException(str, e, issueKey);
    }

    public static /* synthetic */ void report$default(TracerCrashReportLite tracerCrashReportLite, pwf pwfVar, Throwable th, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        tracerCrashReportLite.report(pwfVar, th, str);
    }

    public final void report(Throwable th) {
        report$default(this, th, null, 2, null);
    }

    public final void report(pwf pwfVar, Throwable th) {
        report$default(this, pwfVar, th, null, 4, null);
    }

    @Inject
    public TracerCrashReportLite(TracerLite tracerLite) {
        this(tracerLite, null, 2, null);
    }

    public TracerCrashReportLite(TracerLite tracerLite, zwh zwhVar, int i, j95 j95Var) {
        this(tracerLite, (i & 2) != 0 ? new zwh() : zwhVar);
    }
}
