package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.AudioTrack;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.os.Build;
import android.os.Handler;
import androidx.camera.video.internal.encoder.EncodeException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import one.me.calls.impl.service.a;
import org.apache.http.conn.params.ConnManagerParams;
import org.json.JSONObject;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextException;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextGLException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i0(fe5 fe5Var, fx5 fx5Var, r72 r72Var) {
        this.a = 17;
        Map map = Collections.EMPTY_MAP;
        this.b = fe5Var;
        this.c = fx5Var;
        this.d = r72Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nf2 nf2Var;
        b99 b99VarB;
        x26 x26Var;
        int i = 0;
        Object obj = null;
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) this.b;
                j0 j0Var = (j0) this.c;
                List list = (List) this.d;
                if (th != null) {
                    j0Var.b.onError(th);
                    return;
                } else {
                    j0Var.b.a(list);
                    return;
                }
            case 1:
                km kmVar = (km) this.b;
                HashMap map = (HashMap) this.c;
                Point point = (Point) this.d;
                kmVar.getClass();
                Point point2 = kmVar.m;
                point2.x = point.x;
                point2.y = point.y;
                for (Map.Entry entry : kmVar.i.entrySet()) {
                    mg1 mg1Var = (mg1) map.get(entry.getKey());
                    lm lmVar = (lm) entry.getValue();
                    if (mg1Var == null) {
                        lmVar.getClass();
                        throw null;
                    }
                    yvi yviVar = mg1Var.b;
                    int i2 = yviVar.a;
                    int i3 = yviVar.b;
                    Point point3 = kmVar.m;
                    lmVar.f(i2, i3, (i2 < point3.x || i3 < point3.y) ? 2 : 3);
                }
                if (kmVar.p || kmVar.l.isEmpty()) {
                    return;
                }
                ArrayList arrayList = new ArrayList(kmVar.l);
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    yt1 yt1Var = (yt1) obj2;
                    yt1Var.getClass();
                    kmVar.b(yt1Var);
                    kmVar.n.log("AniRenderDispatch", "Postponed renderer for " + yt1Var + " still can not be created");
                }
                return;
            case 2:
                ((km) this.b).a(null, (yt1) this.c, (float[]) this.d);
                return;
            case 3:
                v2a v2aVar = (v2a) this.b;
                b87 b87Var = (b87) this.c;
                w55 w55Var = (w55) this.d;
                ob0 ob0Var = (ob0) v2aVar.c;
                String str = vqi.a;
                ob0Var.n(b87Var, w55Var);
                return;
            case 4:
                wb0 wb0Var = (wb0) this.b;
                Executor executor = (Executor) this.c;
                kzi kziVar = (kzi) this.d;
                int iD = qt4.D(wb0Var.g);
                if (iD == 0) {
                    wb0Var.j = executor;
                    wb0Var.k = kziVar;
                    return;
                } else {
                    if (iD == 1 || iD == 2) {
                        c.e("The audio recording callback must be registered before the audio source is started.");
                        return;
                    }
                    return;
                }
            case 5:
                AudioTrack audioTrack = (AudioTrack) this.b;
                Handler handler = (Handler) this.c;
                u89 u89Var = (u89) this.d;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new c3(13, u89Var));
                    }
                    synchronized (ic0.p) {
                        try {
                            int i4 = ic0.r - 1;
                            ic0.r = i4;
                            if (i4 == 0) {
                                ScheduledExecutorService scheduledExecutorService = ic0.q;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                ic0.q = null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th3) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new c3(13, u89Var));
                    }
                    synchronized (ic0.p) {
                        try {
                            int i5 = ic0.r - 1;
                            ic0.r = i5;
                            if (i5 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = ic0.q;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                ic0.q = null;
                            }
                            throw th3;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            case 6:
                e41 e41Var = (e41) this.b;
                rj5 rj5Var = (rj5) this.c;
                eif eifVar = (eif) this.d;
                ac0 ac0Var = e41Var.g;
                qyj.l("AudioStream can not be started when setCallback.", !ac0Var.d.get());
                ac0Var.a();
                ac0Var.h = rj5Var;
                ac0Var.i = eifVar;
                if (Build.VERSION.SDK_INT >= 29) {
                    zb0 zb0Var = ac0Var.k;
                    if (zb0Var != null) {
                        io.n(ac0Var.a, zb0Var);
                    }
                    if (ac0Var.k == null) {
                        ac0Var.k = new zb0(ac0Var);
                    }
                    io.h(ac0Var.a, eifVar, ac0Var.k);
                    return;
                }
                return;
            case 7:
                o91 o91Var = (o91) this.b;
                oh1 oh1Var = (oh1) this.c;
                Object obj3 = this.d;
                ArrayList arrayList2 = o91Var.F;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj4 = arrayList2.get(i);
                    i++;
                    try {
                        ((l91) obj4).onEvent(o91Var, oh1Var, obj3);
                    } catch (Throwable th5) {
                        o91Var.N.logException("OKRTCCall", "Error on dispatch event " + oh1Var, th5);
                    }
                }
                return;
            case 8:
                o91 o91Var2 = (o91) this.b;
                yt1 yt1Var2 = (yt1) this.c;
                JSONObject jSONObject = (JSONObject) this.d;
                k91 k91Var = o91Var2.r0;
                if (k91Var != null) {
                    k91Var.onCustomData(yt1Var2, jSONObject);
                    return;
                }
                return;
            case 9:
                ms1 ms1Var = (ms1) this.b;
                int[] iArr = (int[]) this.c;
                EGLContext eGLContext = (EGLContext) this.d;
                CidLogger cidLogger = ms1Var.a;
                String str2 = ms1Var.j;
                cidLogger.log(str2, "Initialize OpenGL context on openGL thread");
                EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                    cidLogger.log(str2, "No default display found, will not initialize");
                    return;
                }
                int[] iArr2 = new int[2];
                if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1)) {
                    throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "Unable to initialize EGL14");
                }
                eGLDisplayEglGetDisplay.getClass();
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr3 = new int[1];
                if (!EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr3, 0)) {
                    throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "getEglConfig()");
                }
                if (iArr3[0] <= 0) {
                    throw new CallOpenGLContext$CallOpenGLContextException("No valid OpenGL context present, can not continue");
                }
                EGLConfig eGLConfig = eGLConfigArr[0];
                if (eGLConfig == null) {
                    throw new CallOpenGLContext$CallOpenGLContextException("Returned matching OpenGL context is null");
                }
                EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, eGLContext, new int[]{12440, EglBase.getOpenGlesVersionFromConfig(EglBase.CONFIG_PLAIN), 12344}, 0);
                if (eGLContextEglCreateContext == EGL14.EGL_NO_CONTEXT) {
                    throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "Failed to create EGL context");
                }
                ms1Var.d = eGLContextEglCreateContext;
                ms1Var.e = eGLDisplayEglGetDisplay;
                ms1Var.f = eGLConfig;
                return;
            case 10:
                a.b((Context) this.b, (Intent) this.c, (k42) this.d);
                return;
            case 11:
                ((zc2) this.b).b(yc2.d((jme) this.c), (sm2) this.d);
                return;
            case 12:
                ((zc2) this.b).c(yc2.d((jme) this.c), (zpe) this.d);
                return;
            case 13:
                ArrayList arrayList3 = (ArrayList) this.b;
                srb srbVar = (srb) this.c;
                String str3 = (String) this.d;
                try {
                    for (Object obj5 : arrayList3) {
                        if (cqk.d(((nf2) obj5).g(), str3)) {
                            obj = obj5;
                            nf2Var = (nf2) obj;
                            if (nf2Var != null || (b99VarB = nf2Var.b()) == null) {
                                return;
                            }
                            b99VarB.j(srbVar);
                            return;
                        }
                    }
                    nf2Var = (nf2) obj;
                    if (nf2Var != null) {
                        return;
                    } else {
                        return;
                    }
                } catch (IllegalArgumentException unused) {
                    return;
                }
            case 14:
                ((ClipboardManager) ((Context) this.b).getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText((String) this.c, (String) this.d));
                return;
            case 15:
                gz4 gz4Var = (gz4) this.b;
                String str4 = (String) this.c;
                String str5 = (String) this.d;
                pgg pggVar = ((fz4) gz4Var.b.b).b;
                if (pggVar != null) {
                    ldc ldcVar = (ldc) pggVar.a;
                    ldcVar.m.b(ldcVar, str4, str5);
                    return;
                }
                return;
            case 16:
                id5 id5Var = (id5) this.b;
                ij0 ij0Var = (ij0) this.c;
                String str6 = ij0Var.a;
                kh0 kh0Var = (kh0) this.d;
                id5Var.getClass();
                Logger logger = id5.f;
                try {
                    c4i c4iVarA = id5Var.c.a(str6);
                    if (c4iVarA == null) {
                        String str7 = "Transport backend '" + str6 + "' is not registered";
                        logger.warning(str7);
                        new IllegalArgumentException(str7);
                    } else {
                        id5Var.e.K(new oo(id5Var, ij0Var, ((go2) c4iVarA).a(kh0Var), 3));
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    return;
                }
            case 17:
                fe5 fe5Var = (fe5) this.b;
                fx5 fx5Var = (fx5) this.c;
                Map map2 = Collections.EMPTY_MAP;
                r72 r72Var = (r72) this.d;
                try {
                    fe5Var.a.n(fx5Var);
                    r72Var.b(null);
                    return;
                } catch (RuntimeException e2) {
                    r72Var.d(e2);
                    return;
                }
            case 18:
                fe5 fe5Var2 = (fe5) this.b;
                Runnable runnable = (Runnable) this.c;
                Runnable runnable2 = (Runnable) this.d;
                if (fe5Var2.j) {
                    runnable.run();
                    return;
                } else {
                    runnable2.run();
                    return;
                }
            case 19:
                pn5 pn5Var = (pn5) this.b;
                Runnable runnable3 = (Runnable) this.c;
                nn5 nn5Var = (nn5) this.d;
                pn5Var.getClass();
                runnable3.run();
                di.d(new gf5(pn5Var, 6, nn5Var));
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                rn5 rn5Var = (rn5) this.b;
                Runnable runnable4 = (Runnable) this.c;
                nn5 nn5Var2 = (nn5) this.d;
                rn5Var.getClass();
                runnable4.run();
                ((ScheduledExecutorService) cqk.e.j.a.getValue()).execute(new gf5(rn5Var, 7, nn5Var2));
                return;
            case 21:
                av5 av5Var = (av5) this.b;
                ((bv5) this.c).a(av5Var.a, av5Var.b, (Exception) this.d);
                return;
            case 22:
                av5 av5Var2 = (av5) this.b;
                ((bv5) this.c).s(av5Var2.a, av5Var2.b, (iw8) this.d);
                return;
            case 23:
                zv5 zv5Var = (zv5) this.b;
                fx5 fx5Var2 = (fx5) this.c;
                Map map3 = Collections.EMPTY_MAP;
                r72 r72Var2 = (r72) this.d;
                try {
                    zv5Var.a.n(fx5Var2);
                    r72Var2.b(null);
                    return;
                } catch (RuntimeException e3) {
                    r72Var2.d(e3);
                    return;
                }
            case 24:
                zv5 zv5Var2 = (zv5) this.b;
                Runnable runnable5 = (Runnable) this.c;
                Runnable runnable6 = (Runnable) this.d;
                if (zv5Var2.f) {
                    runnable5.run();
                    return;
                } else {
                    runnable6.run();
                    return;
                }
            case 25:
                c36 c36Var = (c36) this.b;
                y26 y26Var = (y26) this.c;
                fm0 fm0Var = (fm0) this.d;
                boolean z = c36Var.k;
                ArrayList arrayList4 = c36Var.d;
                g36 g36Var = c36Var.a;
                if (y26Var != null) {
                    List<x26> layers = g36Var.getLayers();
                    for (int size3 = layers.size() - 1; size3 >= 0; size3--) {
                        x26 x26Var2 = layers.get(size3);
                        if (!(x26Var2 instanceof fm0)) {
                            g36Var.a.remove(x26Var2);
                            g36Var.invalidate();
                        }
                    }
                    arrayList4.clear();
                    c36Var.e.clear();
                }
                Rect rect = new Rect();
                if ((y26Var != null && y26Var.d) || z) {
                    int width = g36Var.getWidth();
                    int height = g36Var.getHeight();
                    fm0Var.c = width;
                    fm0Var.d = height;
                } else if (fm0Var.c == -1 && fm0Var.d == -1) {
                    if (y26Var != null) {
                        Rect rect2 = y26Var.c;
                        int iWidth = rect2.width();
                        int iHeight = rect2.height();
                        fm0Var.c = iWidth;
                        fm0Var.d = iHeight;
                    } else {
                        int width2 = g36Var.getWidth();
                        int measuredHeight = g36Var.getMeasuredHeight();
                        fm0Var.c = width2;
                        fm0Var.d = measuredHeight;
                    }
                }
                if (z) {
                    rect.set(0, 0, g36Var.getWidth(), g36Var.getHeight());
                } else {
                    fm0Var.a(g36Var.getMeasuredWidth(), g36Var.getMeasuredHeight(), rect);
                }
                g36Var.setBounds(rect);
                if (y26Var != null) {
                    Rect bounds = g36Var.getBounds();
                    ArrayList arrayList5 = new ArrayList();
                    HashMap map4 = new HashMap();
                    Iterator it = y26Var.a.iterator();
                    while (it.hasNext()) {
                        AbstractMap.SimpleEntry simpleEntryA = jy8.a((jy8) it.next(), y26Var.c, bounds);
                        if (simpleEntryA != null) {
                            arrayList5.add((x26) simpleEntryA.getValue());
                            map4.put((Integer) simpleEntryA.getKey(), (x26) simpleEntryA.getValue());
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    for (cy3 cy3Var : y26Var.b) {
                        hb hbVar = (qt4.D(cy3Var.a) == 0 && (x26Var = (x26) map4.get(Integer.valueOf(cy3Var.b))) != null) ? new hb(x26Var) : null;
                        if (hbVar != null) {
                            arrayList6.add(hbVar);
                        }
                    }
                    Iterator it2 = arrayList5.iterator();
                    while (it2.hasNext()) {
                        g36Var.a.add((x26) it2.next());
                        g36Var.invalidate();
                    }
                    arrayList4.addAll(arrayList6);
                    g36Var.setDrawStickerEnabled(y26Var.d);
                }
                c36Var.c();
                return;
            case 26:
                ((EglRenderer) this.b).lambda$removeFrameListener$2((CountDownLatch) this.c, (EglRenderer.FrameListener) this.d);
                return;
            case 27:
                ((EglRenderer) this.b).lambda$removeRenderListener$3((CountDownLatch) this.c, (EglRenderer.RenderListener) this.d);
                return;
            case 28:
                ax0 ax0Var = (ax0) this.b;
                svl svlVar = (svl) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    e77 e77VarA = hrl.a(ax0Var.a);
                    if (e77VarA == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    d77 d77Var = (d77) e77VarA.a;
                    synchronized (d77Var.d) {
                        d77Var.f = threadPoolExecutor;
                        break;
                    }
                    e77VarA.a.a(new n46(svlVar, threadPoolExecutor));
                    return;
                } catch (Throwable th6) {
                    svlVar.b(th6);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                ((w76) this.c).i(new EncodeException((String) this.d, (Throwable) this.b));
                return;
        }
    }

    public /* synthetic */ i0(id5 id5Var, ij0 ij0Var, dzh dzhVar, kh0 kh0Var) {
        this.a = 16;
        this.b = id5Var;
        this.c = ij0Var;
        this.d = kh0Var;
    }

    public /* synthetic */ i0(zc2 zc2Var, yc2 yc2Var, jme jmeVar, Object obj, int i) {
        this.a = i;
        this.b = zc2Var;
        this.c = jmeVar;
        this.d = obj;
    }

    public /* synthetic */ i0(zv5 zv5Var, fx5 fx5Var, r72 r72Var) {
        this.a = 23;
        Map map = Collections.EMPTY_MAP;
        this.b = zv5Var;
        this.c = fx5Var;
        this.d = r72Var;
    }

    public /* synthetic */ i0(w76 w76Var, int i, String str, Throwable th) {
        this.a = 29;
        this.c = w76Var;
        this.d = str;
        this.b = th;
    }

    public /* synthetic */ i0(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
