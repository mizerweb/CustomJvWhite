package defpackage;

import android.hardware.camera2.CameraManager;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class rb2 extends CameraManager.AvailabilityCallback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ njd b;
    public final /* synthetic */ Object c;

    public rb2(njd njdVar, sb2 sb2Var) {
        this.b = njdVar;
        this.c = sb2Var;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public void onCameraAccessPrioritiesChanged() {
        switch (this.a) {
            case 0:
                Log.d("CXCP", "Camera access priorities have changed");
                if (all.b(this.b, wh2.a) instanceof cs2) {
                    Log.w("CXCP", "Failed to emit CameraPrioritiesChanged");
                }
                break;
            default:
                super.onCameraAccessPrioritiesChanged();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        int i = this.a;
        njd njdVar = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (str.equals(((sb2) obj).b)) {
                    Log.d("CXCP", "Camera " + str + " has become available");
                    ef2.a(str);
                    if (all.b(njdVar, new vh2(str)) instanceof cs2) {
                        Log.w("CXCP", "Failed to emit CameraAvailable(" + str + ')');
                    }
                    break;
                }
                break;
            default:
                dc2.a((dc2) obj, njdVar, str, true);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        int i = this.a;
        njd njdVar = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (str.equals(((sb2) obj).b)) {
                    Log.d("CXCP", "Camera " + str + " has become unavailable");
                    ef2.a(str);
                    if (all.b(njdVar, new xh2(str)) instanceof cs2) {
                        Log.w("CXCP", "Failed to emit CameraUnavailable(" + str + ')');
                    }
                    break;
                }
                break;
            default:
                dc2.a((dc2) obj, njdVar, str, false);
                break;
        }
    }

    public rb2(dc2 dc2Var, njd njdVar) {
        this.c = dc2Var;
        this.b = njdVar;
    }
}
