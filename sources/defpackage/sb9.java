package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import org.webrtc.CapturerObserver;
import org.webrtc.EglBase;
import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.Size;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoSink;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;
import org.webrtc.YuvConverter;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class sb9 {
    public final nue C;
    public final xde D;
    public final ufk E;
    public final EglBase.Context a;
    public final or1 b;
    public final Context d;
    public final fwg e;
    public final lb9 f;
    public final Executor g;
    public final MediaStream h;
    public final gb0 i;
    public final gb0 j;
    public final String k;
    public final String l;
    public final String m;
    public final CidLogger n;
    public final boolean o;
    public z3j p;
    public volatile VideoSink q;
    public volatile kd2 r;
    public volatile eg2 s;
    public volatile b4f t;
    public volatile g5f u;
    public volatile qpc v;
    public final boolean w;
    public ufk x;
    public final p3j y;
    public final v4f z;
    public final CopyOnWriteArraySet c = new CopyOnWriteArraySet();
    public final DisplayMetrics A = new DisplayMetrics();
    public final Size B = new Size(0, 0);

    public sb9(rb9 rb9Var) {
        this.w = false;
        CidLogger cidLogger = rb9Var.h;
        this.n = cidLogger;
        this.d = rb9Var.d;
        PeerConnectionFactory peerConnectionFactory = rb9Var.a;
        this.e = rb9Var.b;
        this.f = rb9Var.q;
        this.g = rb9Var.c;
        String str = rb9Var.g;
        String str2 = rb9Var.f;
        this.m = rb9Var.e;
        this.o = rb9Var.p;
        this.a = rb9Var.i;
        boolean z = rb9Var.k;
        this.b = rb9Var.j;
        this.w = rb9Var.l;
        String strW = zo5.w(new StringBuilder(), rb9Var.e, "sc0");
        this.k = strW;
        String strW2 = zo5.w(new StringBuilder(), rb9Var.e, "as0");
        this.l = strW2;
        MediaStream mediaStreamCreateLocalMediaStream = peerConnectionFactory.createLocalMediaStream(rb9Var.e);
        this.h = mediaStreamCreateLocalMediaStream;
        MediaStream mediaStreamCreateLocalMediaStream2 = peerConnectionFactory.createLocalMediaStream(strW);
        this.D = rb9Var.o ? new xde(this) : null;
        this.E = rb9Var.r;
        mediaStreamCreateLocalMediaStream = z ? mediaStreamCreateLocalMediaStream : null;
        gb0 gb0Var = new gb0(peerConnectionFactory, str, mediaStreamCreateLocalMediaStream, cidLogger);
        this.i = gb0Var;
        gb0Var.k();
        if (rb9Var.v) {
            cidLogger.log("OKRTCLmsAdapter", "Will not disable audio record on start");
        } else {
            gb0Var.m(false);
        }
        gb0 gb0Var2 = new gb0(peerConnectionFactory, strW2, mediaStreamCreateLocalMediaStream, cidLogger);
        this.j = gb0Var2;
        gb0Var2.k();
        gb0Var2.m(false);
        p3j p3jVar = new p3j(peerConnectionFactory, str2, mediaStreamCreateLocalMediaStream, rb9Var.s, rb9Var.t, rb9Var.u, new yki(this), cidLogger);
        this.y = p3jVar;
        p3jVar.k();
        v4f v4fVar = new v4f(peerConnectionFactory, strW, mediaStreamCreateLocalMediaStream2, cidLogger, rb9Var.r, rb9Var.m);
        this.z = v4fVar;
        v4fVar.k();
        this.C = rb9Var.m;
    }

    public final void a() {
        z3j z3jVar = this.p;
        if (z3jVar != null) {
            z3jVar.a = null;
            this.n.log("OKRTCLmsAdapter", this + ": " + uza.b(this.p) + " was cleared");
        }
    }

    public final void b(ub9 ub9Var) {
        xde xdeVar = this.D;
        if (xdeVar != null) {
            rda rdaVar = (rda) xdeVar.d;
            Handler handler = (Handler) xdeVar.c;
            if (ub9Var == null) {
                return;
            }
            xdeVar.b = ub9Var;
            handler.removeCallbacks(rdaVar);
            ((sb9) xdeVar.e).n.log("OKRTCLmsAdapter", "Schedule check screen dimensions in 1500ms");
            handler.postDelayed(rdaVar, 1500L);
        }
    }

    public final void c(eoc eocVar) {
        CapturerObserver capturerObserver;
        this.n.log("OKRTCLmsAdapter", "createVideoTrackForCamera for ".concat(uza.b(eocVar)));
        this.y.k();
        p3j p3jVar = this.y;
        Context context = this.d;
        EglBase.Context context2 = this.a;
        p3jVar.getClass();
        context.getClass();
        context2.getClass();
        VideoSource videoSource = (VideoSource) ((MediaSource) p3jVar.d);
        if (videoSource == null || (capturerObserver = videoSource.getCapturerObserver()) == null) {
            ore.k("Can't set capture in absence of video source");
            return;
        }
        if (p3jVar.i != null) {
            ore.k(qv1.m("An attempt to create surface texture screencast=", ", while got one", p3jVar.g));
            return;
        }
        SurfaceTextureHelper surfaceTextureHelperCreate = SurfaceTextureHelper.create("VideoCapturerThread", context2, false, new YuvConverter(), null, p3jVar);
        p3jVar.i = surfaceTextureHelperCreate;
        p3jVar.j = new phf(p3jVar, 10, capturerObserver);
        eocVar.initialize(surfaceTextureHelperCreate, context.getApplicationContext(), p3jVar.j);
        if (this.w) {
            eocVar.f = this.q;
            return;
        }
        VideoTrack videoTrack = (VideoTrack) ((MediaStreamTrack) this.y.e);
        if (videoTrack != null) {
            if (this.p == null) {
                z3j z3jVar = new z3j();
                this.p = z3jVar;
                z3jVar.a = this.q;
            }
            videoTrack.addSink(this.p);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:51:0x0157  */
    /* JADX WARN: Code duplicated, block: B:52:0x015c  */
    /* JADX WARN: Code duplicated, block: B:54:0x015f  */
    /* JADX WARN: Code duplicated, block: B:55:0x016e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0173  */
    /* JADX WARN: Code duplicated, block: B:61:0x017f A[LOOP:0: B:59:0x0179->B:61:0x017f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x0189 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x00d0, please report this as an issue */
    public final void d(p8b p8bVar) {
        kd2 kd2VarA;
        kd2 kd2Var;
        boolean z;
        boolean z2;
        gb0 gb0Var;
        MediaStreamTrack mediaStreamTrack;
        boolean zEnabled;
        Iterator it;
        this.n.log("OKRTCLmsAdapter", "apply, isVideoEnabled=" + p8bVar.f + ", isAudioEnabled=" + p8bVar.e);
        boolean z3 = p8bVar.f;
        this.n.log("OKRTCLmsAdapter", zo5.s("startCameraVideoCapture, start=", z3));
        boolean z4 = true;
        if (this.e == null) {
            this.n.log("OKRTCLmsAdapter", this + ": has no video capturer factory");
        } else {
            kd2 kd2Var2 = this.r;
            if (z3) {
                if (kd2Var2 != null) {
                    kd2 kd2Var3 = this.r;
                    if (kd2Var3 != null) {
                        kd2Var3.a();
                        this.y.m(true);
                    }
                } else {
                    a();
                    g();
                    fwg fwgVar = this.e;
                    eg2 eg2Var = this.s;
                    ((CidLogger) fwgVar.d).log("OKRTCSvcFactory", "createCameraCapturer");
                    lb9 lb9Var = (lb9) fwgVar.e;
                    if (lb9Var == null || !lb9Var.d) {
                        ((CidLogger) fwgVar.d).log("OKRTCSvcFactory", "No video permissions");
                    } else {
                        try {
                            kd2VarA = fwgVar.a(eg2Var);
                        } catch (Throwable th) {
                            ((CidLogger) fwgVar.d).reportException("OKRTCSvcFactory", "Camera capturer creation failed. Is Camera2: " + fwgVar.b, th);
                            if (fwgVar.b) {
                                ((CidLogger) fwgVar.d).log("OKRTCSvcFactory", "Failed to create camera capturer using camera2 API. Fallback to camera1");
                                fwgVar.b = false;
                                try {
                                    kd2VarA = fwgVar.a(eg2Var);
                                } catch (Throwable th2) {
                                    ((CidLogger) fwgVar.d).reportException("OKRTCSvcFactory", "Camera capturer creation failed after fallback to camera1", th2);
                                    kd2VarA = null;
                                }
                            } else {
                                kd2VarA = null;
                            }
                        }
                        this.r = kd2VarA;
                        if (this.r == null) {
                            this.n.log("OKRTCLmsAdapter", this + ": can't get camera capturer from factory");
                        } else {
                            this.r.f.add(this);
                            try {
                                c((eoc) this.r.c.b);
                                kd2Var = this.r;
                                if (kd2Var != null) {
                                    kd2Var.a();
                                    this.y.m(true);
                                }
                            } catch (RuntimeException e) {
                                this.n.reportException("OKRTCLmsAdapter", "camera.video.track.create", e);
                                kd2 kd2Var4 = this.r;
                                kd2Var4.e.log("CameraCapturerAdapter", "release");
                                kd2Var4.f.clear();
                                kd2Var4.b();
                                ((eoc) kd2Var4.c.b).dispose();
                                this.r = null;
                                g();
                            }
                        }
                        z = true;
                    }
                    kd2VarA = null;
                    this.r = kd2VarA;
                    if (this.r == null) {
                        this.n.log("OKRTCLmsAdapter", this + ": can't get camera capturer from factory");
                    } else {
                        this.r.f.add(this);
                        c((eoc) this.r.c.b);
                        kd2Var = this.r;
                        if (kd2Var != null) {
                            kd2Var.a();
                            this.y.m(true);
                        }
                    }
                    z = true;
                }
                z2 = p8bVar.e;
                gb0Var = this.i;
                mediaStreamTrack = (MediaStreamTrack) gb0Var.e;
                if (mediaStreamTrack != null) {
                    zEnabled = mediaStreamTrack.enabled();
                } else {
                    zEnabled = false;
                }
                if (zEnabled != z2) {
                    this.n.log("OKRTCLmsAdapter", zo5.s("setAudioTrackEnabled, enabled=", z2));
                    gb0Var.m(z2);
                } else {
                    z4 = false;
                }
                if (z || z4) {
                    it = this.c.iterator();
                    while (it.hasNext()) {
                        ((tb9) it.next()).b(this);
                    }
                }
            }
            if (kd2Var2 != null) {
                boolean z5 = this.o;
                kd2 kd2Var5 = this.r;
                if (z5) {
                    kd2Var5.b();
                } else if (kd2Var5 != null) {
                    kd2Var5.a();
                    this.y.m(false);
                }
            }
        }
        z = false;
        z2 = p8bVar.e;
        gb0Var = this.i;
        mediaStreamTrack = (MediaStreamTrack) gb0Var.e;
        if (mediaStreamTrack != null) {
            zEnabled = mediaStreamTrack.enabled();
        } else {
            zEnabled = false;
        }
        if (zEnabled != z2) {
            this.n.log("OKRTCLmsAdapter", zo5.s("setAudioTrackEnabled, enabled=", z2));
            gb0Var.m(z2);
        } else {
            z4 = false;
        }
        if (z || z4) {
            it = this.c.iterator();
            while (it.hasNext()) {
                ((tb9) it.next()).b(this);
            }
        }
    }

    public final void e() {
        Display[] displays = ((DisplayManager) this.d.getSystemService("display")).getDisplays();
        if (displays.length > 0) {
            displays[0].getRealMetrics(this.A);
        }
    }

    public final void f(VideoCapturer videoCapturer) {
        CapturerObserver capturerObserver;
        this.n.log("OKRTCLmsAdapter", "createVideoTrackForScreenCapture for ".concat(uza.b(videoCapturer)));
        if (videoCapturer == null) {
            ore.p("videoCapturer must not be null");
            return;
        }
        v4f v4fVar = this.z;
        v4fVar.k();
        Context applicationContext = this.d.getApplicationContext();
        applicationContext.getClass();
        EglBase.Context context = this.a;
        context.getClass();
        euc eucVar = v4fVar.h;
        VideoSource videoSource = (VideoSource) ((MediaSource) v4fVar.d);
        if (videoSource == null || (capturerObserver = videoSource.getCapturerObserver()) == null) {
            ore.k("Can't set capture in absence of video source");
            return;
        }
        eucVar.getClass();
        eucVar.d = capturerObserver;
        SurfaceTextureHelper surfaceTextureHelper = v4fVar.g;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
        }
        SurfaceTextureHelper surfaceTextureHelperCreate = SurfaceTextureHelper.create("ScreenCapturerThread", context);
        v4fVar.g = surfaceTextureHelperCreate;
        videoCapturer.initialize(surfaceTextureHelperCreate, applicationContext.getApplicationContext(), eucVar);
    }

    public final void g() {
        z3j z3jVar;
        CidLogger cidLogger = this.n;
        cidLogger.log("OKRTCLmsAdapter", "releaseCameraVideoTrack");
        a();
        p3j p3jVar = this.y;
        VideoTrack videoTrack = (VideoTrack) ((MediaStreamTrack) p3jVar.e);
        if (videoTrack != null && (z3jVar = this.p) != null) {
            try {
                videoTrack.removeSink(z3jVar);
            } catch (Exception unused) {
            }
            cidLogger.log("OKRTCLmsAdapter", this + ": " + uza.b(this.p) + " was removed from " + uza.b(videoTrack));
        }
        this.p = null;
        p3jVar.l();
    }

    public final Size h() {
        kd2 kd2Var = this.r;
        if (kd2Var == null) {
            return new Size(0, 0);
        }
        Size size = new Size(kd2Var.n, kd2Var.m);
        p3j p3jVar = this.y;
        p3jVar.getClass();
        Size sizeB = p3jVar.k.b(size.width, size.height);
        return sizeB == null ? size : sizeB;
    }

    public final void i(kd2 kd2Var, boolean z) {
        this.n.log("OKRTCLmsAdapter", zo5.s("onCameraCapturerSwitchDone, switched ? ", z));
        if (z) {
            ufk ufkVar = this.x;
            if (ufkVar != null) {
                ufkVar.a.n(oh1.g, Boolean.TRUE);
            }
            if (kd2Var != this.r) {
                IllegalStateException illegalStateException = new IllegalStateException("Wrong camera capturer on camera switch done");
                kd2 kd2Var2 = this.r;
                CidLogger cidLogger = this.n;
                if (kd2Var2 == null) {
                    cidLogger.logException("OKRTCLmsAdapter", "No camera capturer when switch done", illegalStateException);
                } else {
                    cidLogger.reportException("OKRTCLmsAdapter", "camera.switch.check", illegalStateException);
                }
            }
        }
    }

    public final void j(VideoSink videoSink) {
        this.n.log("OKRTCLmsAdapter", "setVideoRenderer, ".concat(uza.b(videoSink)));
        this.q = videoSink;
        if (this.w) {
            kd2 kd2Var = this.r;
            eoc eocVar = kd2Var != null ? (eoc) kd2Var.c.b : null;
            if (eocVar != null) {
                eocVar.f = videoSink;
            } else if (eocVar != null) {
                ore.p("Video capturer is expected to be an implementation of ".concat(eoc.class.getName()));
                return;
            }
        }
        z3j z3jVar = this.p;
        if (z3jVar != null) {
            z3jVar.a = videoSink;
        }
    }

    public final void k(eg2 eg2Var) {
        jf2 jf2VarI;
        this.n.log("OKRTCLmsAdapter", "switchCamera, " + this);
        if (this.r == null) {
            if (eg2Var != null) {
                this.n.log("OKRTCLmsAdapter", "Got cameraParams while no capturer created yet. Remember for future use");
                this.s = eg2Var;
                return;
            } else {
                this.n.log("OKRTCLmsAdapter", this + ": has no camera capturer");
                return;
            }
        }
        kd2 kd2Var = this.r;
        kd2Var.e.log("CameraCapturerAdapter", "switchCamera");
        if (!kd2Var.k) {
            kd2Var.e.log("CameraCapturerAdapter", "Camera is not started");
            return;
        }
        if (kd2Var.j) {
            synchronized (kd2Var.g) {
                try {
                    if (kd2Var.j) {
                        kd2Var.e.log("CameraCapturerAdapter", "Camera switch is pending");
                        return;
                    }
                    kd2Var.j = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (eg2Var == null) {
            jf2VarI = kd2Var.d.I(kd2Var.i ? 2 : 1);
        } else {
            jf2VarI = kd2Var.d.I(eg2Var.a);
        }
        if (jf2VarI == null || Objects.equals(kd2Var.h, jf2VarI.a())) {
            return;
        }
        String strA = jf2VarI.a();
        ((eoc) kd2Var.c.b).switchCamera(new fik(kd2Var, 8, strA), strA);
    }

    public final String toString() {
        return uza.b(this);
    }
}
