package defpackage;

import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.EglBase;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class km {
    public final nl a;
    public final fik b;
    public final wl c;
    public final d0c d;
    public final ysj e;
    public final HandlerThread f;
    public final Handler g;
    public final HandlerThread h;
    public final HashMap i;
    public final ConcurrentHashMap j;
    public final HashMap k;
    public final LinkedHashSet l;
    public final Point m;
    public final CidLogger n;
    public final qs1 o;
    public volatile boolean p;

    public km(nl nlVar, fik fikVar, wl wlVar, EglBase eglBase, d0c d0cVar, ysj ysjVar) {
        wlVar.getClass();
        eglBase.getClass();
        this.a = nlVar;
        this.b = fikVar;
        this.c = wlVar;
        this.d = d0cVar;
        this.e = ysjVar;
        HandlerThread handlerThread = new HandlerThread("AniRDControl");
        this.f = handlerThread;
        HandlerThread handlerThread2 = new HandlerThread("AniRDOutput");
        this.h = handlerThread2;
        this.i = new HashMap();
        this.j = new ConcurrentHashMap();
        this.k = new HashMap();
        this.l = new LinkedHashSet();
        this.m = new Point();
        CidLogger cidLogger = nlVar.b;
        this.n = cidLogger;
        EglBase.Context eglBaseContext = eglBase.getEglBaseContext();
        eglBaseContext.getClass();
        int[] iArr = EglBase.CONFIG_PLAIN;
        iArr.getClass();
        this.o = new qs1(cidLogger, eglBaseContext, iArr, "CallOpenGLAnimoji");
        handlerThread.start();
        this.g = new Handler(handlerThread.getLooper());
        handlerThread2.start();
        new Handler(handlerThread2.getLooper());
    }

    public final void a(Integer num, yt1 yt1Var, float[] fArr) {
        if (yt1Var != null) {
            b(yt1Var);
        }
    }

    public final lm b(yt1 yt1Var) {
        this.c.getClass();
        return null;
    }
}
