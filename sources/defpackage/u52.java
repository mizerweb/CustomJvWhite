package defpackage;

import android.opengl.EGL14;
import android.view.Surface;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import ru.ok.android.externcalls.sdk.ui.internal.VoipVideoRenderer;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.ok.android.webrtc.opengl.CallVideoFrameDrawer$CallVideoFrameDrawerError;

/* JADX INFO: loaded from: classes3.dex */
public final class u52 extends ns1 {
    public static final AtomicInteger m = new AtomicInteger(0);
    public final String b;
    public final CopyOnWriteArrayList c;
    public final AtomicReference d;
    public final uw e;
    public final xp9 f;
    public qs1 g;
    public final Object h;
    public Surface i;
    public final String j;
    public RendererCommon.GlDrawer k;
    public final v52 l;

    public u52(String str) {
        this.a = EGL14.EGL_NO_SURFACE;
        this.b = str;
        this.c = new CopyOnWriteArrayList();
        this.d = new AtomicReference(null);
        this.e = new uw(3);
        this.f = new xp9(7);
        this.h = new Object();
        this.j = "CallOpenGL_drawer_".concat(str);
        this.l = new v52(str, new yk1(12, this));
    }

    @Override // defpackage.ns1
    public final v52 a() {
        return this.l;
    }

    @Override // defpackage.ns1
    public final void b(ms1 ms1Var, Object obj) {
        ms1Var.getClass();
        obj.getClass();
        this.k = (RendererCommon.GlDrawer) obj;
        long jNanoTime = System.nanoTime();
        v52 v52Var = this.l;
        v52Var.g = jNanoTime;
        v52Var.f = 0;
        v52Var.h = 0L;
        v52Var.i = 0L;
        v52Var.c.set(0);
        v52Var.d.set(0);
        qs1 qs1Var = this.g;
        if (qs1Var == null) {
            throw new CallVideoFrameDrawer$CallVideoFrameDrawerError("Render is missing inside onInitialize() callback");
        }
        qs1Var.a.log(this.j, nbh.r(m.incrementAndGet(), "Instance ", this.b, " initialized. Total count is "));
    }

    @Override // defpackage.ns1
    public final void c(ms1 ms1Var) {
        ms1Var.getClass();
        synchronized (this.h) {
            this.i = null;
            qs1 qs1Var = this.g;
            if (qs1Var != null) {
                CidLogger cidLogger = qs1Var.a;
                this.g = null;
                VideoFrame videoFrame = (VideoFrame) this.d.getAndSet(null);
                if (videoFrame != null) {
                    videoFrame.release();
                }
                RendererCommon.GlDrawer glDrawer = this.k;
                if (glDrawer != null) {
                    glDrawer.release();
                }
                this.k = null;
                cidLogger.log(this.j, nbh.r(m.decrementAndGet(), "Instance ", this.b, " released. Remaining count is "));
            }
        }
    }

    @Override // defpackage.ns1
    public final void d(qs1 qs1Var, ms1 ms1Var) {
        float fFloatValue;
        qs1Var.getClass();
        ms1Var.getClass();
        VideoFrame videoFrame = (VideoFrame) this.d.getAndSet(null);
        if (videoFrame == null) {
            return;
        }
        uw uwVar = this.e;
        synchronized (uwVar) {
            long j = uwVar.c;
            if (j > 0) {
                if (j != BuildConfig.MAX_TIME_TO_UPLOAD) {
                    long jNanoTime = System.nanoTime();
                    long j2 = uwVar.b;
                    if (jNanoTime >= j2) {
                        long j3 = j2 + uwVar.c;
                        uwVar.b = j3;
                        uwVar.b = Math.max(j3, jNanoTime);
                    }
                }
            }
            try {
                int rotatedWidth = videoFrame.getRotatedWidth();
                int rotatedHeight = videoFrame.getRotatedHeight();
                float f = rotatedWidth / rotatedHeight;
                xp9 xp9Var = this.f;
                Float fValueOf = (Float) ((AtomicReference) xp9Var.b).get();
                if (cqk.c(fValueOf, 0.0f)) {
                    fValueOf = Float.valueOf(f);
                }
                float f2 = 1.0f;
                if (f > fValueOf.floatValue()) {
                    float fFloatValue2 = fValueOf.floatValue() / f;
                    fFloatValue = 1.0f;
                    f2 = fFloatValue2;
                } else {
                    fFloatValue = f / fValueOf.floatValue();
                }
                qs1Var.c(ms1Var, this, videoFrame, new qw1(f2, fFloatValue, ((AtomicBoolean) xp9Var.c).get()));
                this.l.f++;
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    VoipVideoRenderer.drawerListener$lambda$0(((xaj) ((t52) it.next())).a, rotatedWidth, rotatedHeight);
                }
            } finally {
                videoFrame.release();
            }
        }
    }
}
