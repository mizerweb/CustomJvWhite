package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VpxDecoderWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class y55 implements VideoSink, VpxDecoderWrapper.ErrorCallback {
    public final c5f b;
    public final y3e c;
    public final HandlerThread d;
    public final Handler e;
    public final int f;
    public final /* synthetic */ bak o;
    public volatile boolean g = false;
    public volatile boolean h = false;
    public volatile boolean i = true;
    public final AtomicInteger j = new AtomicInteger(0);
    public final AtomicInteger k = new AtomicInteger(0);
    public final AtomicInteger l = new AtomicInteger(-1);
    public final AtomicInteger m = new AtomicInteger(-1);
    public final AtomicInteger n = new AtomicInteger(-1);
    public final VpxDecoderWrapper a = new VpxDecoderWrapper();

    public y55(bak bakVar, int i, c5f c5fVar, y3e y3eVar) {
        this.o = bakVar;
        this.b = c5fVar;
        this.c = y3eVar;
        HandlerThread handlerThread = new HandlerThread("DecoderWrapperVpxQueue");
        this.d = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.e = handler;
        this.f = i;
        handler.post(new ai(this, i, 8));
    }

    public final void a() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.c.log("DecoderWrapper", "releasing decoder " + System.identityHashCode(this));
        HandlerThread handlerThread = this.d;
        Handler handler = this.o.e;
        VpxDecoderWrapper vpxDecoderWrapper = this.a;
        Objects.requireNonNull(vpxDecoderWrapper);
        jj2 jj2Var = new jj2(12, vpxDecoderWrapper);
        handler.removeCallbacksAndMessages(null);
        handler.post(jj2Var);
        handlerThread.quitSafely();
        this.h = true;
    }

    @Override // org.webrtc.VpxDecoderWrapper.ErrorCallback
    public final void onDecodeError(int i) {
        y3e y3eVar = this.c;
        StringBuilder sbY = zo5.y(i, "onDecodeError vpx_error_code:", " System.identityHashCode: ");
        sbY.append(System.identityHashCode(this));
        y3eVar.log("DecoderWrapper", sbY.toString());
        bak bakVar = this.o;
        bakVar.x.a();
        bakVar.t.incrementAndGet();
        this.i = true;
        this.l.set(this.k.get());
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        if (this.g) {
            return;
        }
        this.o.s.incrementAndGet();
        this.o.w.a();
        if (SystemClock.elapsedRealtimeNanos() > 100000000) {
            c5f c5fVar = this.b;
            d5f d5fVar = (d5f) c5fVar.b;
            yt1 yt1Var = (yt1) c5fVar.c;
            if (!d5fVar.g) {
                d5fVar.f.a(yt1Var, videoFrame);
            }
        }
        this.m.set(videoFrame.getRotatedWidth());
        this.n.set(videoFrame.getRotatedHeight());
    }
}
