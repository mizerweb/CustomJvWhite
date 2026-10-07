package defpackage;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import android.widget.ScrollView;
import androidx.media3.transformer.ExportException;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.vk.push.core.network.http.BaseHttpHeadersHolder;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import one.me.chatmedia.viewer.VideoWebViewScreen;
import one.me.settings.twofa.creation.TwoFACreationScreen;
import one.me.settings.twofa.password.TwoFACheckPassScreen;
import one.video.transloader.task.UploadTask;
import org.apache.http.conn.params.ConnManagerParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.VideoFileRenderer;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManagerImpl;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;
import ru.ok.tracer.lite.crash.report.TracerCrashReportLite;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f4g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f4g(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException, InterruptedException {
        du1 du1Var;
        yt1 yt1Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                p11 p11Var = (p11) obj;
                p11Var.c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) p11Var.e;
                j7j j7jVar = sideSheetBehavior.i;
                if (j7jVar != null && j7jVar.f()) {
                    p11Var.a(p11Var.b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.s(p11Var.b);
                        return;
                    }
                    return;
                }
            case 1:
                ((q4g) obj).g();
                return;
            case 2:
                y5g.b((y5g) obj);
                return;
            case 3:
                wb0 wb0Var = (wb0) ((rj5) obj).b;
                wb0Var.q = true;
                if (wb0Var.g == 2) {
                    wb0Var.a();
                    return;
                }
                return;
            case 4:
                gj2 gj2Var = (gj2) obj;
                ((n8g) gj2Var.c).d.b(gj2Var.b);
                return;
            case 5:
                ((e53) obj).invoke();
                return;
            case 6:
                ((CountDownLatch) obj).countDown();
                return;
            case 7:
                aw5 aw5Var = (aw5) ((xde) obj).d;
                if (aw5Var != null) {
                    Iterator it = aw5Var.values().iterator();
                    while (it.hasNext()) {
                        ((zbh) it.next()).c();
                    }
                    return;
                }
                return;
            case 8:
                ((oo) obj).g();
                return;
            case 9:
                ((AnimationDrawable) ((Drawable) obj)).start();
                return;
            case 10:
                ExecutorService executorService = (ExecutorService) obj;
                executorService.shutdownNow();
                executorService.awaitTermination(1L, TimeUnit.SECONDS);
                return;
            case 11:
                mvh mvhVar = (mvh) obj;
                mvhVar.l = null;
                mvhVar.a();
                return;
            case 12:
                TracerCrashReportLite.reportException$lambda$1((TracerCrashReportLite) obj);
                return;
            case 13:
                File file = (File) obj;
                snf snfVar = swh.e;
                if (snfVar == null) {
                    snfVar = null;
                }
                snfVar.b();
                igh ighVar = snfVar.h;
                if (ighVar != null) {
                    swh swhVar = swh.a;
                    swh.c().get(f55.c);
                    Iterable iterable = r66.a;
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
                        try {
                            c79 c79VarF = yr8.f(dataInputStream);
                            dataInputStream.close();
                            iterable = c79VarF;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                rx8.n(dataInputStream, th);
                                throw th2;
                            }
                        }
                    } catch (IOException unused) {
                        Objects.toString(file);
                    }
                    file.delete();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj2 : iterable) {
                        String str = ((irc) obj2).a;
                        Object arrayList = linkedHashMap.get(str);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(str, arrayList);
                        }
                        ((List) arrayList).add(obj2);
                    }
                    Iterator it2 = linkedHashMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        List<irc> list = (List) ((Map.Entry) it2.next()).getValue();
                        fbc fbcVar = a8g.g;
                        if (fbcVar == null) {
                            ore.k("Tracer settings are not initialized.");
                            return;
                        }
                        if (!gol.a(fbcVar, "system.shutdown.until.ts") && !gol.a(fbcVar, "system.PERFORMANCE_METRICS.shutdown.until.ts") && !list.isEmpty()) {
                            list.size();
                            String strA = swh.a();
                            if (strA == null) {
                                continue;
                            } else {
                                irc ircVar = (irc) ww3.r1(list);
                                JSONObject jSONObjectF0 = yab.F0(ighVar);
                                jSONObjectF0.put("sessionUuid", ircVar.a);
                                jSONObjectF0.put("clientTimeUnixNano", (SystemClock.elapsedRealtimeNanos() + add.a) - add.b);
                                JSONArray jSONArray = new JSONArray();
                                for (irc ircVar2 : list) {
                                    JSONObject jSONObject = new JSONObject();
                                    long j = ircVar2.b;
                                    Map map = ircVar2.f;
                                    jSONObject.put("timeUnixNano", j);
                                    jSONObject.put(SdkMetricStatEvent.NAME_KEY, ircVar2.c);
                                    jSONObject.put(SdkMetricStatEvent.VALUE_KEY, ircVar2.d);
                                    jSONObject.put("unit", ircVar2.e);
                                    if (!map.isEmpty()) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        for (Map.Entry entry : map.entrySet()) {
                                            String str2 = (String) entry.getKey();
                                            Object value = entry.getValue();
                                            if (value instanceof String) {
                                                jSONObject2.put(str2, value);
                                            } else if (value instanceof Boolean) {
                                                jSONObject2.put(str2, ((Boolean) value).booleanValue());
                                            } else if (value instanceof Long) {
                                                jSONObject2.put(str2, ((Number) value).longValue());
                                            } else if (value instanceof Double) {
                                                jSONObject2.put(str2, ((Number) value).doubleValue());
                                            } else if ((value instanceof Byte) || (value instanceof Short)) {
                                                jSONObject2.put(str2, value);
                                            } else if (value instanceof Integer) {
                                                jSONObject2.put(str2, ((Number) value).intValue());
                                            } else if (value instanceof Float) {
                                                jSONObject2.put(str2, value);
                                            } else {
                                                jSONObject2.put(str2, value.toString());
                                            }
                                        }
                                        jSONObject.put("attributes", jSONObject2);
                                    }
                                    jSONArray.put(jSONObject);
                                }
                                jSONObjectF0.put("samples", jSONArray);
                                Object obj3 = swh.c().get(cqk.b);
                                lt4 lt4Var = obj3 instanceof lt4 ? (lt4) obj3 : null;
                                if (lt4Var == null) {
                                    lt4Var = new lt4(new v2a(18));
                                }
                                try {
                                    a28 a28VarB = ((l28) swh.h.getValue()).b(new euc(Uri.parse(lt4Var.b()).buildUpon().appendEncodedPath("api/perf/upload").appendQueryParameter("crashToken", strA).toString(), new pr6(BaseHttpHeadersHolder.CONTENT_TYPE_JSON, 1, jSONObjectF0.toString().getBytes(pt2.a))));
                                    try {
                                        int i2 = a28VarB.b;
                                        String strF0 = z5h.F0((byte[]) ((pr6) a28VarB.d).c);
                                        so2.Q(strF0, "PERFORMANCE_METRICS");
                                        if (i2 != 200) {
                                            Log.e("Tracer", "HTTP " + i2 + ", " + strF0);
                                        }
                                    } catch (Throwable th3) {
                                        try {
                                            throw th3;
                                        } catch (Throwable th4) {
                                            rx8.n(a28VarB, th3);
                                            throw th4;
                                        }
                                    }
                                } catch (Exception unused2) {
                                }
                            }
                        }
                    }
                    return;
                }
                return;
            case 14:
                TwoFACheckPassScreen twoFACheckPassScreen = (TwoFACheckPassScreen) obj;
                zv8[] zv8VarArr = TwoFACheckPassScreen.n;
                if (twoFACheckPassScreen.getView() != null) {
                    ((ScrollView) twoFACheckPassScreen.j.m(twoFACheckPassScreen, TwoFACheckPassScreen.n[1])).fullScroll(130);
                    return;
                }
                return;
            case 15:
                TwoFACreationScreen twoFACreationScreen = (TwoFACreationScreen) obj;
                zv8[] zv8VarArr2 = TwoFACreationScreen.n;
                if (twoFACreationScreen.getView() != null) {
                    ((ScrollView) twoFACreationScreen.j.m(twoFACreationScreen, TwoFACreationScreen.n[1])).fullScroll(130);
                    return;
                }
                return;
            case 16:
                UploadTask uploadTask = (UploadTask) obj;
                if (uploadTask.b()) {
                    return;
                }
                uploadTask.a.b("UploadTask", new yfi(5));
                v56 v56Var = uploadTask.k;
                v56Var.K(new i0i(uploadTask, 4));
                try {
                    uploadTask.e();
                    return;
                } catch (Throwable th5) {
                    v56Var.K(new lji(uploadTask, th5, 3));
                    return;
                }
            case 17:
                UrlSharingListenerManagerImpl.saveUrlSharing$lambda$1((UrlSharingListenerManagerImpl) obj);
                return;
            case 18:
                ((bui) obj).s();
                return;
            case 19:
                tvi tviVar = (tvi) obj;
                aec aecVar = tviVar.l;
                if (aecVar != null) {
                    tviVar.t(aecVar);
                    tviVar.r();
                    return;
                }
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((r72) ((i5b) obj).j).b(null);
                return;
            case 21:
                ((VideoFileRenderer) obj).lambda$release$3();
                return;
            case 22:
                zwi zwiVar = (zwi) obj;
                zwiVar.a.postVsyncCallback(zwiVar);
                return;
            case 23:
                g1j g1jVar = (g1j) obj;
                je9 je9Var = je9.d;
                String str3 = g1jVar.h;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str3, "VideoMessage Recording. onFirstVideoFrameRendered", null);
                }
                xxi xxiVar = g1jVar.o;
                if (xxiVar != null) {
                    pni pniVar = new pni(2, g1jVar);
                    t0j t0jVar = xxiVar.e;
                    if (t0jVar == null) {
                        t0jVar = null;
                    }
                    if (t0jVar != null) {
                        String str4 = t0jVar.a;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                            a4cVar2.c(je9Var, str4, "captureFrame", null);
                        }
                        t0j.g(t0jVar, new j0i(t0jVar, 9, pniVar), new o0j(0), 2);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                e4j e4jVar = (e4j) obj;
                long jElapsedRealtime = SystemClock.elapsedRealtime() - e4jVar.h;
                if (e4jVar.k == 0 || jElapsedRealtime < e4jVar.f) {
                    return;
                }
                e4jVar.a.invoke();
                return;
            case 25:
                zv8[] zv8VarArr3 = VideoWebViewScreen.A;
                ((VideoWebViewScreen) obj).G1(false);
                return;
            case 26:
                mkc mkcVar = (mkc) ((ot4) obj).b;
                if (((Boolean) ((nr1) mkcVar.c).invoke()).booleanValue()) {
                    if (!mkcVar.a) {
                        ((CidLogger) mkcVar.b).log("OwnTalkingReporter", "on voice start detected and reported");
                        h91 h91Var = (h91) mkcVar.f;
                        if (h91Var != null) {
                            ru1 ru1Var = h91Var.a;
                            du1 du1Var2 = ru1Var.a;
                            boolean zE = du1Var2.e();
                            du1Var2.o = true;
                            if (zE != du1Var2.e() && (yt1Var = (du1Var = ru1Var.a).a) != null) {
                                ru1Var.f(ru1Var.c(yt1Var), Collections.singletonList(du1Var));
                            }
                        }
                        mkcVar.a = true;
                    }
                    ((qyd) mkcVar.d).d(sbi.a);
                    return;
                }
                return;
            case 27:
                WaitingRoomParticipants.loadWaitingParticipantIdsPageSingle$lambda$0$1((f8g) obj);
                return;
            case 28:
                g2i g2iVar = (g2i) ((vuf) obj).b;
                long j2 = g2iVar.e;
                LinkedHashMap linkedHashMap2 = g55.a;
                synchronized (g55.class) {
                }
                Locale locale = Locale.US;
                ExportException exportException = new ExportException("Muxer error", new IllegalStateException(nbh.s(j2, "Abort: no output sample written in the last ", " milliseconds. DebugTrace: \"Tracing disabled\"")), 7002, null);
                k2i k2iVar = g2iVar.s;
                k2iVar.getClass();
                k2iVar.d(exportException);
                return;
            default:
                zxj zxjVar = (zxj) obj;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + zxjVar.a.getAction() + " finishing.");
                zxjVar.b.d(null);
                return;
        }
    }
}
