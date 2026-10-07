package defpackage;

import android.hardware.camera2.CaptureFailure;

/* JADX INFO: loaded from: classes2.dex */
public final class mg implements eme {
    public final CaptureFailure a;
    public final int b;
    public final boolean c;

    public mg(CaptureFailure captureFailure) {
        this.a = captureFailure;
        captureFailure.getFrameNumber();
        this.b = captureFailure.getReason();
        this.c = captureFailure.wasImageCaptured();
    }

    @Override // defpackage.ndi
    public final Object W(sr3 sr3Var) {
        if (sr3Var.equals(zfe.a(CaptureFailure.class))) {
            return this.a;
        }
        return null;
    }

    @Override // defpackage.eme
    public final boolean l() {
        return this.c;
    }

    @Override // defpackage.eme
    public final int r0() {
        return this.b;
    }
}
