package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tc2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hi2 b;
    public final /* synthetic */ CameraCaptureSession c;
    public final /* synthetic */ CaptureRequest d;
    public final /* synthetic */ CaptureResult e;

    public /* synthetic */ tc2(hi2 hi2Var, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult, int i) {
        this.a = i;
        this.b = hi2Var;
        this.c = cameraCaptureSession;
        this.d = captureRequest;
        this.e = captureResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CaptureResult captureResult = this.e;
        CaptureRequest captureRequest = this.d;
        CameraCaptureSession cameraCaptureSession = this.c;
        hi2 hi2Var = this.b;
        switch (i) {
            case 0:
                hi2Var.a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                break;
            default:
                hi2Var.a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                break;
        }
    }
}
