package defpackage;

import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CameraExtensionSession$ExtensionCaptureCallback;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class ig extends CameraExtensionSession$ExtensionCaptureCallback {
    public final /* synthetic */ int a;
    public final vb2 b;
    public final /* synthetic */ jg c;
    public final Serializable d;

    public ig(jg jgVar, vb2 vb2Var) {
        this.a = 0;
        this.c = jgVar;
        this.b = vb2Var;
        this.d = new ConcurrentLinkedQueue();
    }

    private final void a(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
    }

    private final void b(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
    }

    public final void onCaptureFailed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
        int i = this.a;
        vb2 vb2Var = this.b;
        Serializable serializable = this.d;
        switch (i) {
            case 0:
                if (((ConcurrentLinkedQueue) serializable).isEmpty()) {
                    jg jgVar = this.c;
                    h40 h40Var = jgVar.f;
                    h40Var.getClass();
                    long jIncrementAndGet = h40.b.incrementAndGet(h40Var);
                    jgVar.g.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet));
                    ((ConcurrentLinkedQueue) serializable).add(Long.valueOf(jIncrementAndGet));
                }
                vb2Var.d(captureRequest, ((Number) ((ConcurrentLinkedQueue) serializable).remove()).longValue());
                break;
            default:
                int size = ((List) ((LinkedHashMap) serializable).get(captureRequest)).size();
                LinkedHashMap linkedHashMap = (LinkedHashMap) serializable;
                if (size != 1) {
                    Log.i("CXCP", "onCaptureFailed is not triggered for repeating requests. Request frame numbers: " + ((List) linkedHashMap.get(captureRequest)).stream());
                } else {
                    vb2Var.d(captureRequest, ((Number) ((List) linkedHashMap.get(captureRequest)).get(0)).longValue());
                }
                break;
        }
    }

    public final void onCaptureProcessProgressed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, int i) {
        int i2 = this.a;
        vb2 vb2Var = this.b;
        switch (i2) {
            case 0:
                vb2Var.e(captureRequest, i);
                break;
            default:
                vb2Var.e(captureRequest, i);
                break;
        }
    }

    public final void onCaptureProcessStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
        int i = this.a;
    }

    public void onCaptureResultAvailable(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        switch (this.a) {
            case 0:
                Serializable serializable = this.d;
                if (((ConcurrentLinkedQueue) serializable).isEmpty()) {
                    jg jgVar = this.c;
                    h40 h40Var = jgVar.f;
                    h40Var.getClass();
                    long jIncrementAndGet = h40.b.incrementAndGet(h40Var);
                    jgVar.g.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet));
                    ((ConcurrentLinkedQueue) serializable).add(Long.valueOf(jIncrementAndGet));
                }
                this.b.c(captureRequest, totalCaptureResult, ((Number) ((ConcurrentLinkedQueue) serializable).remove()).longValue());
                break;
            default:
                super.onCaptureResultAvailable(cameraExtensionSession, captureRequest, totalCaptureResult);
                break;
        }
    }

    public final void onCaptureSequenceAborted(CameraExtensionSession cameraExtensionSession, int i) {
        switch (this.a) {
            case 0:
                this.b.f(i);
                break;
            default:
                this.b.f(i);
                break;
        }
    }

    public final void onCaptureSequenceCompleted(CameraExtensionSession cameraExtensionSession, int i) {
        int i2 = this.a;
        vb2 vb2Var = this.b;
        jg jgVar = this.c;
        switch (i2) {
            case 0:
                vb2Var.g(i, ((Long) jgVar.g.get(cameraExtensionSession)).longValue());
                break;
            default:
                vb2Var.g(i, ((Long) jgVar.g.get(cameraExtensionSession)).longValue());
                break;
        }
    }

    public final void onCaptureStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, long j) {
        int i = this.a;
        Serializable serializable = this.d;
        jg jgVar = this.c;
        switch (i) {
            case 0:
                h40 h40Var = jgVar.f;
                h40Var.getClass();
                long jIncrementAndGet = h40.b.incrementAndGet(h40Var);
                jgVar.g.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet));
                ((ConcurrentLinkedQueue) serializable).add(Long.valueOf(jIncrementAndGet));
                this.b.h(captureRequest, jIncrementAndGet, j);
                break;
            default:
                h40 h40Var2 = jgVar.f;
                h40Var2.getClass();
                long jIncrementAndGet2 = h40.b.incrementAndGet(h40Var2);
                jgVar.g.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet2));
                LinkedHashMap linkedHashMap = (LinkedHashMap) serializable;
                Object arrayList = linkedHashMap.get(captureRequest);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(captureRequest, arrayList);
                }
                ((List) arrayList).add(Long.valueOf(jIncrementAndGet2));
                this.b.h(captureRequest, jIncrementAndGet2, j);
                break;
        }
    }

    public ig(jg jgVar, vb2 vb2Var, LinkedHashMap linkedHashMap) {
        this.a = 1;
        this.c = jgVar;
        this.b = vb2Var;
        this.d = linkedHashMap;
    }
}
