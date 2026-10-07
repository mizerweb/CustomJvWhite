package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: loaded from: classes4.dex */
public final class xg implements mwa, ndi {
    public final CaptureResult a;
    public final String b;

    public xg(CaptureResult captureResult, String str) {
        this.a = captureResult;
        this.b = str;
    }

    @Override // defpackage.ndi
    public final Object W(sr3 sr3Var) {
        boolean zEquals = sr3Var.equals(zfe.a(CaptureResult.class));
        CaptureResult captureResult = this.a;
        if (zEquals) {
            return captureResult;
        }
        if (!sr3Var.equals(zfe.a(TotalCaptureResult.class)) || captureResult == null) {
            return null;
        }
        return captureResult;
    }

    public final String toString() {
        return "FrameMetadata(camera: " + ((Object) ef2.b(this.b)) + ", frameNumber: " + this.a.getFrameNumber() + ')';
    }
}
