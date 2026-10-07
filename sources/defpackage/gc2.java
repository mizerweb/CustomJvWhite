package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class gc2 {
    public final zqh a;
    public final lc2 b;
    public final ipe c;

    public gc2(zqh zqhVar, lc2 lc2Var, ipe ipeVar) {
        this.a = zqhVar;
        this.b = lc2Var;
        this.c = ipeVar;
    }

    public static final void a(gc2 gc2Var, le2 le2Var) throws InterruptedException {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        Surface surface = new Surface(surfaceTexture);
        b40 b40VarA = gvk.a(false);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (le2Var.z0(Collections.singletonList(surface), new fc2(countDownLatch, b40VarA, surface, surfaceTexture))) {
            countDownLatch.await();
            return;
        }
        Log.e("CXCP", "Failed to create a blank capture session! Surfaces may not be disconnected properly.");
        if (b40VarA.a()) {
            surface.release();
            surfaceTexture.release();
        }
    }

    public final void b(le2 le2Var, CameraDevice cameraDevice, lg lgVar, pb0 pb0Var, boolean z, boolean z2) {
        ll0 ll0Var;
        ylc ylcVar = null;
        CameraDevice cameraDevice2 = le2Var != null ? (CameraDevice) le2Var.W(zfe.a(CameraDevice.class)) : null;
        if (cameraDevice2 == null) {
            if (cameraDevice != null) {
                c(cameraDevice, lgVar);
                return;
            }
            return;
        }
        String id = cameraDevice2.getId();
        ef2.a(id);
        if (cameraDevice != null && !id.equals(cameraDevice.getId())) {
            StringBuilder sbV = qt4.v("Unwrapped camera device has camera ID ", id, ", but the wrapped camera device has camera ID ");
            sbV.append(cameraDevice.getId());
            sbV.append('!');
            throw new IllegalStateException(sbV.toString().toString());
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i >= 30) {
            pb0Var.e.remove(le2Var);
        }
        Log.d("CXCP", "handleQuirksBeforeClosing(" + cameraDevice2 + ')');
        String strY = le2Var.Y();
        if (z) {
            try {
                Trace.beginSection("Camera2DeviceCloserImpl#reopenCameraDevice");
                Log.d("CXCP", "Reopening camera device");
                c(cameraDevice2, lgVar);
                ll0Var = this.c.a(strY, this);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            ll0Var = new ll0(le2Var, lgVar);
        }
        le2 le2Var2 = ll0Var.a;
        lg lgVar2 = ll0Var.b;
        if (le2Var2 == null || lgVar2 == null) {
            Log.e("CXCP", "Failed to retain an opened camera device!");
        } else {
            if (z2) {
                try {
                    Trace.beginSection("Camera2DeviceCloserImpl#createCaptureSession");
                    Log.d("CXCP", "Creating an empty capture session before closing " + ((Object) ef2.b(strY)));
                    a(this, le2Var2);
                    Log.d("CXCP", "Created an empty capture session.");
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            ylcVar = new ylc(le2Var2, lgVar2);
        }
        if (ylcVar == null) {
            Log.e("CXCP", "Failed to handle quirks before closing the camera device!");
            le2Var.y();
            le2Var.I0();
            lgVar.d(cameraDevice2);
            return;
        }
        le2 le2Var3 = (le2) ylcVar.a;
        lg lgVar3 = (lg) ylcVar.b;
        Object objW = le2Var3.W(zfe.a(CameraDevice.class));
        if (objW == null) {
            ore.k("Required value was null.");
            return;
        }
        le2Var.y();
        c((CameraDevice) objW, lgVar3);
        le2Var.I0();
        if (z) {
            lgVar.d(cameraDevice2);
        }
    }

    public final void c(CameraDevice cameraDevice, lg lgVar) {
        String id = cameraDevice.getId();
        Log.d("CXCP", "closeCameraDevice(" + id + ')');
        sfe sfeVar = new sfe();
        if (((sbi) this.a.b(7000L, new ec2(cameraDevice, sfeVar, null, 0))) == null) {
            Log.e("CXCP", "Failed to close CameraDevice(" + id + ") after 7000ms. The camera is likely in a bad state.");
        }
        String id2 = cameraDevice.getId();
        ef2.a(id2);
        lc2 lc2Var = this.b;
        lc2Var.b.getClass();
        ag2 ag2Var = bg2.U;
        bg2 bg2VarD = lc2Var.a.d(id2);
        ag2Var.getClass();
        if (ag2.b(bg2VarD) && sfeVar.a) {
            Log.d("CXCP", "Waiting for OnClosed from " + ((Object) ef2.b(id2)));
            if (lgVar.r.await(2000L, TimeUnit.MILLISECONDS)) {
                Log.d("CXCP", "Received OnClosed for " + ((Object) ef2.b(id2)));
            } else {
                Log.w("CXCP", "Failed to close " + ((Object) ef2.b(id2)) + " after 2000ms!");
            }
        }
    }
}
