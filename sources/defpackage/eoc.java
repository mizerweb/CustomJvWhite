package defpackage;

import android.content.Context;
import android.media.MediaRecorder;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.CapturerObserver;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.YuvConverter;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class eoc implements CameraVideoCapturer, j8e {
    public final Object a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public volatile Object f;

    public eoc(String str, ex8 ex8Var, cf7 cf7Var, gu4 gu4Var) {
        this.a = str;
        this.b = ex8Var;
        this.c = cf7Var;
        this.d = gu4Var;
        this.e = new Object();
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void addMediaRecorderToCamera(MediaRecorder mediaRecorder, CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        mediaRecorder.getClass();
        mediaRecorderHandler.getClass();
        ((CidLogger) this.c).log("PatchedVideoCapturer", "addMediaRecorderToCamera");
    }

    @Override // org.webrtc.VideoCapturer
    public void changeCaptureFormat(int i, int i2, int i3) {
        ((CameraVideoCapturer) this.a).changeCaptureFormat(i, i2, i3);
    }

    @Override // org.webrtc.VideoCapturer
    public void dispose() {
        ((CameraVideoCapturer) this.a).dispose();
    }

    @Override // org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        surfaceTextureHelper.getClass();
        context.getClass();
        capturerObserver.getClass();
        CidLogger cidLogger = (CidLogger) this.c;
        cidLogger.log("PatchedVideoCapturer", "initialize");
        if (((SurfaceTextureHelper) this.e) != null) {
            ore.k("Repeated initialization");
            return;
        }
        this.e = surfaceTextureHelper;
        try {
            Field declaredField = SurfaceTextureHelper.class.getDeclaredField("yuvConverter");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(surfaceTextureHelper);
            obj.getClass();
            this.d = (YuvConverter) obj;
        } catch (IllegalAccessException e) {
            cidLogger.logException("PatchedVideoCapturer", "Cant get yuv converter", e);
        } catch (NoSuchFieldException e2) {
            cidLogger.logException("PatchedVideoCapturer", "Cant get yuv converter", e2);
        }
        ((CameraVideoCapturer) this.a).initialize(surfaceTextureHelper, context, new ih(this, capturerObserver, false));
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        ((CidLogger) this.c).log("PatchedVideoCapturer", "isScreencast");
        return ((CameraVideoCapturer) this.a).isScreencast();
    }

    @Override // defpackage.j8e
    public Object m(Object obj, zv8 zv8Var) {
        qdd qddVar;
        Context context = (Context) obj;
        qdd qddVar2 = (qdd) this.f;
        if (qddVar2 != null) {
            return qddVar2;
        }
        synchronized (this.e) {
            try {
                if (((qdd) this.f) == null) {
                    Context applicationContext = context.getApplicationContext();
                    ex8 ex8Var = (ex8) this.b;
                    List list = (List) ((cf7) this.c).invoke(applicationContext);
                    this.f = new qdd(new m9g(new qv(5, new kr0(applicationContext, 3, this)), Collections.singletonList(new n04(1, null, list)), ex8Var, (gu4) this.d));
                }
                qddVar = (qdd) this.f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qddVar;
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void removeMediaRecorderFromCamera(CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        mediaRecorderHandler.getClass();
        ((CidLogger) this.c).log("PatchedVideoCapturer", "removeMediaRecorderFromCamera");
    }

    @Override // org.webrtc.VideoCapturer
    public void startCapture(int i, int i2, int i3) {
        ((CidLogger) this.c).log("PatchedVideoCapturer", "startCapture");
        ((CameraVideoCapturer) this.a).startCapture(i, i2, i3);
    }

    @Override // org.webrtc.VideoCapturer
    public void stopCapture() throws InterruptedException {
        ((CidLogger) this.c).log("PatchedVideoCapturer", "stopCapture");
        ((CameraVideoCapturer) this.a).stopCapture();
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, String str) {
        cameraSwitchHandler.getClass();
        str.getClass();
        ((CidLogger) this.c).log("PatchedVideoCapturer", "switchCamera");
        ((CameraVideoCapturer) this.a).switchCamera(cameraSwitchHandler, str);
    }

    public eoc(CameraVideoCapturer cameraVideoCapturer, gh2 gh2Var, CidLogger cidLogger) {
        cameraVideoCapturer.getClass();
        this.a = cameraVideoCapturer;
        this.b = gh2Var;
        this.c = cidLogger;
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        cameraSwitchHandler.getClass();
        ((CidLogger) this.c).log("PatchedVideoCapturer", "switchCamera");
        ((CameraVideoCapturer) this.a).switchCamera(cameraSwitchHandler);
    }
}
