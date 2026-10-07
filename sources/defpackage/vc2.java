package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vc2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hi2 b;
    public final /* synthetic */ CameraCaptureSession c;
    public final /* synthetic */ CaptureRequest d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;

    public /* synthetic */ vc2(hi2 hi2Var, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2, int i) {
        this.a = i;
        this.b = hi2Var;
        this.c = cameraCaptureSession;
        this.d = captureRequest;
        this.e = j;
        this.f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        hi2 hi2Var = this.b;
        switch (i) {
            case 0:
                hi2Var.a.onReadoutStarted(this.c, this.d, this.e, this.f);
                break;
            default:
                hi2Var.a.onCaptureStarted(this.c, this.d, this.e, this.f);
                break;
        }
    }
}
