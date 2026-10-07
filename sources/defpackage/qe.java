package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.SystemClock;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerAttribution;
import com.my.tracker.core.handlers.AttributionHandler;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.core.ipc.BaseIPCClient;
import com.vk.push.core.ipc.BaseIPCClient$BindingResult$Ok;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.calls.impl.service.CallServiceImpl;
import one.me.calls.impl.service.b;
import one.me.calls.ui.ui.call.CallScreen;
import org.apache.http.conn.params.ConnManagerParams;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextNotInitialized;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qe(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        x70 x70Var;
        switch (this.a) {
            case 0:
                ((ux3) this.b).r((s88) this.c);
                return;
            case 1:
                ((n78) this.c).n((ch) this.b);
                return;
            case 2:
                return;
            case 3:
                km kmVar = (km) this.b;
                mf mfVar = (mf) this.c;
                fik fikVar = kmVar.b;
                int i2 = mfVar.b;
                nsk nskVar = (nsk) mfVar.c;
                o91 o91Var = (o91) fikVar.b;
                yt1 yt1VarZ = o91Var.j0.u() > 1 ? ((vn7) fikVar.c).z(i2) : o91Var.v();
                if (yt1VarZ == null) {
                    kmVar.a.b.log("AniRenderDispatch", "unknown ssrc: " + i2);
                }
                if (nskVar instanceof rl) {
                    kmVar.a(Integer.valueOf(i2), yt1VarZ, ((rl) nskVar).a);
                    return;
                }
                if (!(nskVar instanceof tl)) {
                    if (nskVar instanceof ul) {
                        return;
                    }
                    if (!(nskVar instanceof vl)) {
                        ore.o();
                        return;
                    }
                    Throwable th = new Throwable("Unknown animoji message type");
                    CidLogger cidLogger = kmVar.n;
                    String message = th.getMessage();
                    if (message == null) {
                        message = "animoji error";
                    }
                    cidLogger.reportException("AniRenderDispatch", message, th);
                    return;
                }
                Integer numValueOf = Integer.valueOf(i2);
                int i3 = ((tl) nskVar).a;
                HashMap map = kmVar.k;
                if (yt1VarZ != null) {
                    kmVar.b(yt1VarZ);
                }
                CidLogger cidLogger2 = kmVar.n;
                tre.M(16);
                String string = Long.toString(((long) i3) & 4294967295L, 16);
                string.getClass();
                cidLogger2.log("AniRenderDispatch", "renderer is not ready to process background color (" + r5h.c1(string, string.length() > 6 ? 8 : 6, '0') + ") for ssrc:participant (" + numValueOf + ":" + yt1VarZ + ")");
                map.put(numValueOf, Integer.valueOf(i3));
                return;
            case 4:
                iif iifVar = (iif) this.b;
                try {
                    ((Runnable) this.c).run();
                    return;
                } finally {
                    iifVar.a();
                }
            case 5:
                v30 v30Var = (v30) this.b;
                su6 su6Var = (su6) this.c;
                ((mt9) v30Var.f).a();
                y30 y30Var = (y30) v30Var.e;
                synchronized (y30Var.a) {
                    y30Var.b();
                    su6Var.run();
                    break;
                }
                return;
            case 6:
                AttributionHandler.a((MyTracker.AttributionListener) this.b, (MyTrackerAttribution) this.c);
                return;
            case 7:
                v2a v2aVar = (v2a) this.b;
                String str = (String) this.c;
                ob0 ob0Var = (ob0) v2aVar.c;
                String str2 = vqi.a;
                ob0Var.l(str);
                return;
            case 8:
                v2a v2aVar2 = (v2a) this.b;
                pu3 pu3Var = (pu3) this.c;
                ob0 ob0Var2 = (ob0) v2aVar2.c;
                String str3 = vqi.a;
                ob0Var2.E(pu3Var);
                return;
            case 9:
                wb0 wb0Var = (wb0) this.b;
                i86 i86Var = (i86) this.c;
                int iD = qt4.D(wb0Var.g);
                if (iD == 0 || iD == 1) {
                    if (wb0Var.l != i86Var) {
                        wb0Var.b(i86Var);
                        return;
                    }
                    return;
                } else {
                    if (iD != 2) {
                        return;
                    }
                    c.e("AudioSource is released");
                    return;
                }
            case 10:
                wb0 wb0Var2 = (wb0) this.b;
                r72 r72Var = (r72) this.c;
                wb0Var2.getClass();
                try {
                    int iD2 = qt4.D(wb0Var2.g);
                    if (iD2 == 0 || iD2 == 1) {
                        wb0Var2.b(null);
                        ((AtomicBoolean) wb0Var2.e.e).getAndSet(true);
                        e41 e41Var = wb0Var2.d;
                        if (e41Var.b.getAndSet(true)) {
                            i = 3;
                        } else {
                            i = 3;
                            e41Var.d.execute(new c41(e41Var, 3));
                        }
                        wb0Var2.e();
                        wb0Var2.d(i);
                    }
                    r72Var.b(null);
                    return;
                } catch (Throwable th2) {
                    r72Var.d(th2);
                    return;
                }
            case 11:
                ((dee) ((kzi) this.c).b).g0 = ((wb0) this.b).t;
                return;
            case 12:
                kzi kziVar = (kzi) this.b;
                Throwable th3 = (Throwable) this.c;
                kziVar.getClass();
                tvj.d("Recorder", "Error occurred after audio source started.", th3);
                if (th3 instanceof AudioSourceAccessException) {
                    ((ro7) kziVar.a).accept(th3);
                    return;
                }
                return;
            case 13:
                ljf ljfVar = (ljf) this.b;
                AudioDeviceInfo routedDevice = ((AudioRouting) this.c).getRoutedDevice();
                if (routedDevice != null) {
                    ((Handler) ljfVar.d).post(new qe(ljfVar, 14, routedDevice));
                    return;
                }
                return;
            case 14:
                ljf ljfVar2 = (ljf) this.b;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.c;
                if (((fc0) ljfVar2.e) == null || (x70Var = ((jc0) ((w4) ljfVar2.c).a).h) == null) {
                    return;
                }
                x70Var.m(audioDeviceInfo);
                return;
            case 15:
                ma maVar = (ma) this.b;
                Object objMo41apply = ((jn4) this.c).mo41apply(maVar.f);
                maVar.f = objMo41apply;
                qe qeVar = new qe(maVar, 16, objMo41apply);
                sfh sfhVar = (sfh) maVar.c;
                if (sfhVar.a.getLooper().getThread().isAlive()) {
                    sfhVar.f(qeVar);
                    return;
                }
                return;
            case 16:
                ma maVar2 = (ma) this.b;
                Object obj = this.c;
                int i4 = maVar2.a - 1;
                maVar2.a = i4;
                if (i4 == 0) {
                    maVar2.G(obj);
                    return;
                }
                return;
            case 17:
                BaseIPCClient baseIPCClient = (BaseIPCClient) this.b;
                cf7 cf7Var = (cf7) this.c;
                synchronized (baseIPCClient.k) {
                    try {
                        Iterator it = baseIPCClient.k.iterator();
                        while (it.hasNext()) {
                            cf7Var.invoke(it.next());
                        }
                        baseIPCClient.k.clear();
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
            case 18:
                BaseIPCClient baseIPCClient2 = (BaseIPCClient) this.b;
                kr6 kr6Var = (kr6) this.c;
                BaseIPCClient.Companion companion = BaseIPCClient.INSTANCE;
                Logger.DefaultImpls.info$default(baseIPCClient2.getLogger(), "Sleeping 1000 ms before next bind attempt", null, 2, null);
                SystemClock.sleep(1000L);
                AppInfo appInfo = (AppInfo) kr6Var.a;
                boolean zD = cqk.d(baseIPCClient2.b(appInfo, (ComponentName) kr6Var.b), BaseIPCClient$BindingResult$Ok.INSTANCE);
                Logger.DefaultImpls.info$default(baseIPCClient2.getLogger(), "bindService to " + appInfo.getPackageName() + " result: " + zD, null, 2, null);
                if (zD) {
                    return;
                }
                Logger.DefaultImpls.warn$default(baseIPCClient2.getLogger(), "Failed to bind again. Giving up.", null, 2, null);
                ir0 ir0Var = new ir0(baseIPCClient2, 1);
                if (baseIPCClient2.k.isEmpty()) {
                    return;
                }
                baseIPCClient2.j.submit(new qe(baseIPCClient2, 17, ir0Var));
                return;
            case 19:
                nz0 nz0Var = (nz0) this.b;
                ebb ebbVar = (ebb) this.c;
                try {
                    Future future = nz0Var.g;
                    nz0Var.d(future != null ? (ibb) future.get() : null, ebbVar);
                    return;
                } catch (Throwable th5) {
                    if (th5 instanceof ExecutionException) {
                        Throwable cause = th5.getCause();
                        if (cause != null) {
                            ebbVar.onFailed(cause);
                        }
                    } else {
                        ebbVar.onFailed(th5);
                    }
                    if (nz0Var.e) {
                        nz0Var.c(ebbVar);
                        nz0Var.f();
                        return;
                    }
                    return;
                }
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                o91 o91Var2 = (o91) this.b;
                JSONObject jSONObject = (JSONObject) this.c;
                j5g j5gVar = (j5g) o91Var2.G0.getValue();
                CidLogger cidLogger3 = j5gVar.a;
                try {
                    if (j5gVar.b.shouldHideSensitiveInformation()) {
                        cidLogger3.log("OKRTCCall", "handleSignalingNotification, " + new JSONObject(lql.c(jSONObject.toString())).toString(2));
                    } else {
                        cidLogger3.log("OKRTCCall", "handleSignalingNotification, " + jSONObject.toString(2));
                    }
                    return;
                } catch (JSONException e) {
                    cidLogger3.log("OKRTCCall", "error during notification logging: " + e.getMessage());
                    return;
                }
            case 21:
                sd1 sd1Var = (sd1) this.b;
                try {
                    sd1Var.b = (iid) ((bp2) this.c).get();
                    sd1Var.c.invoke();
                    return;
                } catch (Throwable th6) {
                    gm0.X("CameraPreviewHelper", th6, th6.getMessage(), new Object[0]);
                    return;
                }
            case 22:
                ms1 ms1Var = (ms1) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                try {
                    CidLogger cidLogger4 = ms1Var.a;
                    String str4 = ms1Var.j;
                    cidLogger4.log(str4, "Starting release process");
                    EGLContext eGLContext = ms1Var.d;
                    CidLogger cidLogger5 = ms1Var.a;
                    if (eGLContext == null) {
                        cidLogger5.log(str4, "Released, notify awaiting...");
                        countDownLatch.countDown();
                        return;
                    }
                    cidLogger5.log(str4, "Not yet released, continue");
                    EGLDisplay eGLDisplay = ms1Var.e;
                    if (eGLDisplay == null) {
                        throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
                    }
                    GLES20.glUseProgram(0);
                    try {
                        ms1Var.b.invoke(ms1Var);
                        break;
                    } catch (Throwable th7) {
                        ms1Var.a.reportException(ms1Var.j, "Error on call dependent release callback", th7);
                    }
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    ms1Var.g = eGLSurface;
                    EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                    EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                    EGL14.eglReleaseThread();
                    EGL14.eglTerminate(eGLDisplay);
                    ms1Var.d = null;
                    ms1Var.e = null;
                    ms1Var.f = null;
                    ms1Var.a.log(ms1Var.j, "Quitting handler thread");
                    ms1Var.c.quit();
                    ms1Var.a.log(ms1Var.j, "Released, notify awaiting...");
                    countDownLatch.countDown();
                    return;
                } catch (Throwable th8) {
                    ms1Var.a.log(ms1Var.j, "Released, notify awaiting...");
                    countDownLatch.countDown();
                    throw th8;
                }
            case 23:
                CallScreen callScreen = (CallScreen) this.b;
                String str5 = (String) this.c;
                l6m l6mVar = CallScreen.D1;
                h02 h02VarR1 = callScreen.R1();
                h02VarR1.getClass();
                if (str5.equals("CONFIRM_STOP_RECORD")) {
                    a8j.x(h02VarR1.G, zx1.F);
                    return;
                }
                return;
            case 24:
                b bVar = (b) this.b;
                Context context = (Context) this.c;
                if (!((Boolean) bVar.a.H6.a(e5d.S6[400]).i()).booleanValue()) {
                    b.f(context);
                    return;
                }
                gm0.n("CallServiceTag", "stopServiceFromInside: send stop action to service");
                try {
                    Intent intent = new Intent(context, (Class<?>) CallServiceImpl.class);
                    intent.putExtra("ACTION", 1);
                    context.startForegroundService(intent);
                    return;
                } catch (Throwable th9) {
                    CallServiceImpl.CallServiceException callServiceException = new CallServiceImpl.CallServiceException("cant start foreground service for stop", th9);
                    gm0.V("CallServiceTag", callServiceException.getMessage(), callServiceException);
                    b.f(context);
                    return;
                }
            case 25:
                i92 i92Var = (i92) this.b;
                HashSet hashSet = i92Var.f;
                long j = ((yq0) this.c).a;
                if (j == i92Var.g) {
                    i92Var.g = 0L;
                    if (hashSet.isEmpty()) {
                        return;
                    }
                    i92Var.g(new e92(i92Var, 3));
                    return;
                }
                if (j == i92Var.h) {
                    i92Var.h = 0L;
                    if (hashSet.isEmpty()) {
                        return;
                    }
                    i92Var.d();
                    return;
                }
                return;
            case 26:
                i92 i92Var2 = (i92) this.b;
                gui guiVar = (gui) this.c;
                long j2 = i92Var2.g;
                long j3 = guiVar.a;
                if ((j2 == j3 || i92Var2.h == j3) && guiVar.g.b() > 0) {
                    lw8 lw8Var = guiVar.g;
                    gm0.n("i92", "onMissedMessages size: " + lw8Var.b());
                    lw8 lw8Var2 = i92Var2.c.f;
                    lw8Var2.getClass();
                    for (Map.Entry entry : ((LinkedHashMap) lw8Var.a).entrySet()) {
                        Iterator it2 = ((List) entry.getValue()).iterator();
                        while (it2.hasNext()) {
                            lw8Var2.a(entry.getKey(), it2.next());
                        }
                    }
                    i92Var2.h();
                }
                long j4 = i92Var2.g;
                long j5 = guiVar.a;
                if (j4 != j5) {
                    if (i92Var2.h == j5) {
                        long j6 = guiVar.b;
                        long j7 = guiVar.c;
                        long j8 = guiVar.e;
                        boolean z = guiVar.f;
                        i92Var2.h = 0L;
                        if (j6 == 0 || j6 >= i92Var2.c.a.a) {
                            j6 = i92Var2.c.a.a;
                        }
                        if (i92Var2.c.a.b != 0) {
                            j7 = i92Var2.c.a.b;
                        }
                        ex2 ex2Var = new ex2(j6, j7);
                        gm0.n("i92", "onLoadNext: chunk change \nfrom: " + sb8.b0(i92Var2.c.a) + "\n  to: " + sb8.b0(ex2Var));
                        gm0.n("i92", "onLoadNext: hasNext change from: " + i92Var2.c.d + " to: " + z);
                        i92Var2.c.a = ex2Var;
                        i92Var2.c.d = z;
                        i92Var2.c.c = j8;
                        i92Var2.h();
                        i92Var2.g(new nb0(i92Var2, false, 4));
                        return;
                    }
                    return;
                }
                long j9 = guiVar.b;
                long j10 = guiVar.c;
                long j11 = guiVar.d;
                long j12 = guiVar.e;
                boolean z2 = guiVar.f;
                i92Var2.g = 0L;
                if (i92Var2.c.a.a != 0) {
                    j9 = i92Var2.c.a.a;
                }
                if (j10 <= i92Var2.c.a.b) {
                    j10 = i92Var2.c.a.b;
                }
                ex2 ex2Var2 = new ex2(j9, j10);
                gm0.n("i92", "onSync: chunk change \nfrom: " + sb8.b0(i92Var2.c.a) + "\n  to: " + sb8.b0(ex2Var2));
                gm0.n("i92", "onSync: hasPrev change from: " + i92Var2.c.e + " to: " + z2);
                i92Var2.c.a = ex2Var2;
                i92Var2.c.e = z2;
                if (j11 != 0) {
                    i92Var2.c.b = j11;
                }
                if (i92Var2.c.c == 0) {
                    gm0.n("i92", "onSync: set backwardMarker to: " + j12);
                    i92Var2.c.c = j12;
                }
                i92Var2.h();
                if (i92Var2.a) {
                    Iterator it3 = i92Var2.d.iterator();
                    long j13 = 0;
                    while (it3.hasNext()) {
                        long j14 = ((fda) it3.next()).a.c;
                        if (j14 > j13) {
                            j13 = j14;
                        }
                    }
                    long j15 = j13 + 1;
                    long j16 = i92Var2.c.a.b;
                    gm0.n("i92", "onSync: load from db" + vd7.K(Long.valueOf(j15)) + " to: " + vd7.K(Long.valueOf(j16)));
                    i92Var2.a(0, i92Var2.m.h(j15, j16));
                } else {
                    i92Var2.g(new e92(i92Var2, 2));
                }
                i92Var2.f();
                if (!i92Var2.c.e) {
                    i92Var2.i();
                    return;
                } else {
                    gm0.n("i92", "onSync: hasPrev == true, load one more page");
                    i92Var2.g(new e92(i92Var2, 3));
                    return;
                }
            case 27:
                i92 i92Var3 = (i92) this.b;
                s3b s3bVar = (s3b) this.c;
                if (s3bVar.a == i92Var3.i) {
                    i92Var3.i = 0L;
                    if (p90.C(s3bVar.b.b)) {
                        return;
                    }
                    gm0.n("i92", "onEvent: MsgGetErrorEvent, remove " + s3bVar.d.size() + " messagesIds from state");
                    for (Long l : s3bVar.d) {
                        List list = (List) ((LinkedHashMap) i92Var3.c.f.a).get(Long.valueOf(s3bVar.c));
                        if (list != null) {
                            list.remove(l);
                        }
                    }
                    i92Var3.h();
                    return;
                }
                return;
            case 28:
                i92 i92Var4 = (i92) this.b;
                long j17 = ((lc8) this.c).c;
                i92Var4.e();
                gm0.n("i92", "onNewMessage hasPrev=" + i92Var4.c.e);
                if (i92Var4.c.e) {
                    return;
                }
                try {
                    gb9 gb9Var = i92Var4.k;
                    gb9Var.getClass();
                    fda fdaVarA = gb9Var.a(j17, true);
                    if (fdaVarA.a.K()) {
                        ex2 ex2Var3 = new ex2(i92Var4.c.a.a == 0 ? fdaVarA.a.c : i92Var4.c.a.a, fdaVarA.a.c);
                        gm0.n("i92", "inIncomingMessage: chunk change \nfrom: " + sb8.b0(i92Var4.c.a) + "\n  to: " + sb8.b0(ex2Var3));
                        i92Var4.c.a = ex2Var3;
                        i92Var4.h();
                        if (i92Var4.a) {
                            i92Var4.a(0, Collections.singletonList(fdaVarA));
                            i92Var4.f();
                        }
                        i92Var4.i();
                        return;
                    }
                    return;
                } catch (IllegalStateException e2) {
                    gm0.V("i92", "Failed to get message when process IncomingMessageEvent", e2);
                    return;
                }
            default:
                i92 i92Var5 = (i92) this.b;
                boolean z3 = ((bg9) this.c).d;
                i92Var5.e();
                long jI = i92Var5.r.a.i();
                gm0.n("i92", "onLogin: hasNewCalls: " + z3 + " callsLastSync: " + jI);
                if (z3) {
                    i92Var5.c.e = true;
                    i92Var5.g(new e92(i92Var5, 3));
                } else if (jI == 0) {
                    i92Var5.c.e = false;
                    i92Var5.c.d = false;
                    i92Var5.i();
                } else {
                    i92Var5.g(new e92(i92Var5, 2));
                    i92Var5.b();
                }
                i92Var5.h();
                return;
        }
    }
}
