package defpackage;

import android.content.Context;
import android.media.projection.MediaProjection;
import org.webrtc.CapturerObserver;
import org.webrtc.EglBase;
import org.webrtc.ScreenCapturerAndroid;
import org.webrtc.Size;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* JADX INFO: loaded from: classes3.dex */
public final class bc7 extends MediaProjection.Callback implements CapturerObserver, ub9 {
    public final EglBase.Context a;
    public final Context b;
    public final y3e c;
    public volatile SurfaceTextureHelper e;
    public volatile ScreenCapturerAndroid f;
    public VideoSink g;
    public boolean i;
    public boolean j;
    public final ufk k;
    public final qq4 d = new qq4("SSFrameCapturer");
    public final nsh h = new nsh();

    public bc7(EglBase.Context context, Context context2, ufk ufkVar, y3e y3eVar) {
        this.a = context;
        this.b = context2;
        this.c = y3eVar;
        this.k = ufkVar;
    }

    @Override // defpackage.ub9
    public final void a(int i, int i2) {
        this.d.b(new q31(this, i, i2, 2));
    }

    public final void b(Size size, int i) {
        if (!this.i || this.j) {
            return;
        }
        try {
            this.f.startCapture(size.width, size.height, 0);
            this.j = true;
        } catch (SecurityException e) {
            this.c.logException("FrameCapturerImpl", "Error starting screen capture", e);
            if (i > 10) {
                this.c.reportException("FrameCapturerImpl", c0a.k(i, "Error: ", "times of restart screen capture did fail"), e);
                this.d.b(new ac7(this, 0));
            } else {
                qq4 qq4Var = this.d;
                qq4Var.a.postDelayed(new uc2(this, size, i, 7), 400L);
            }
        } catch (RuntimeException e2) {
            this.c.reportException("FrameCapturerImpl", "Error starting screen capture", e2);
            this.d.b(new ac7(this, 0));
        }
    }

    @Override // org.webrtc.CapturerObserver
    public final void onCapturerStarted(boolean z) {
        ufk ufkVar;
        this.c.log("FrameCapturerImpl", "Screen capture did start success=" + z);
        if (!z || (ufkVar = this.k) == null) {
            return;
        }
        ufkVar.a.N.log("OKRTCCall", "Screen capture has started, fast=false");
    }

    @Override // org.webrtc.CapturerObserver
    public final void onCapturerStopped() {
        this.c.log("FrameCapturerImpl", "Screen capture did stop");
        ufk ufkVar = this.k;
        if (ufkVar != null) {
            ufkVar.a(false);
        }
    }

    @Override // org.webrtc.CapturerObserver
    public final void onFrameCaptured(VideoFrame videoFrame) {
        this.h.a();
        VideoSink videoSink = this.g;
        if (videoSink != null) {
            videoSink.onFrame(videoFrame);
        }
    }

    @Override // android.media.projection.MediaProjection.Callback
    public final void onStop() {
        this.d.b(new ac7(this, 0));
    }
}
