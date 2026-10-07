package defpackage;

import android.hardware.camera2.CameraManager;

/* JADX INFO: loaded from: classes2.dex */
public final class ab2 extends CameraManager.AvailabilityCallback {
    public final /* synthetic */ njd a;

    public ab2(njd njdVar) {
        this.a = njdVar;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        ef2.a(str);
        all.b(this.a, new ef2(str));
    }
}
