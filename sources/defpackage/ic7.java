package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.EncodedImage;
import org.webrtc.EncoderCallback;
import org.webrtc.GlUtil;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VpxEncoderWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class ic7 implements EncoderCallback, VideoSink {
    public final y3e b;
    public final nue c;
    public volatile VpxEncoderWrapper d;
    public volatile wc7 e;
    public volatile wc7 f;
    public volatile long g;
    public volatile boolean k;
    public volatile long l;
    public final AtomicInteger j = new AtomicInteger(0);
    public final qq4 a = new qq4("SSFrameEncoder");
    public final nsh h = new nsh();
    public final nsh i = new nsh();

    public ic7(y3e y3eVar, nue nueVar) {
        this.b = y3eVar;
        this.c = nueVar;
    }

    public final void a() {
        this.k = false;
        VpxEncoderWrapper vpxEncoderWrapper = this.d;
        if (vpxEncoderWrapper != null) {
            vpxEncoderWrapper.release();
        }
        this.d = null;
    }

    @Override // org.webrtc.EncoderCallback
    public final void onEncodedImage(EncodedImage encodedImage) {
        this.h.a();
        EncodedImage.FrameType frameType = encodedImage.frameType;
        EncodedImage.FrameType frameType2 = EncodedImage.FrameType.VideoFrameKey;
        if (frameType == frameType2) {
            this.g = SystemClock.elapsedRealtime();
        }
        if (this.e != null) {
            wc7 wc7Var = this.e;
            if (!wc7Var.a) {
                encodedImage.release();
                return;
            }
            if (encodedImage.frameType == frameType2) {
                wc7Var.h = false;
            }
            wc7Var.c.add(encodedImage);
            wc7Var.d.addAndGet(encodedImage.buffer.remaining());
            wc7.b(wc7Var.g);
        }
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        wc7 wc7Var = this.f;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (jElapsedRealtimeNanos < this.l + 100000000) {
            return;
        }
        if ((wc7Var == null || (wc7Var.c.size() <= 15 && wc7Var.d.get() <= 4000000)) && this.j.get() < 5) {
            try {
                VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
                if (i420 == null) {
                    this.b.log("SSFrameEncoder", "toI420 didn't result in valid buffer, skipping");
                    return;
                }
                float rotation = videoFrame.getRotation() + 360;
                this.c.getClass();
                float f = (rotation + 0.0f) % 360.0f;
                this.b.log("SSFrameEncoder", "rotation angle = " + f);
                VideoFrame videoFrame2 = new VideoFrame(i420, (int) f, videoFrame.getTimestampNs());
                this.l = jElapsedRealtimeNanos;
                this.j.incrementAndGet();
                this.a.b(new d86(this, wc7Var, videoFrame2, 7));
            } catch (GlUtil.GlOutOfMemoryException unused) {
                this.b.log("SSFrameEncoder", "gl oom @ toI420, skipping");
            }
        }
    }

    @Override // org.webrtc.EncoderCallback
    public final void onFrameDropped(int i) {
        this.i.a();
    }
}
