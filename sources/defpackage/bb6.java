package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import androidx.camera.core.CameraControl$OperationCanceledException;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class bb6 implements fli {
    public final db6 a;
    public eb6 b;
    public kli c;

    public bb6(db6 db6Var) {
        this.a = db6Var;
        this.b = new eb6(db6Var.d, 0, db6Var.c, db6Var.e);
    }

    public final i64 a(boolean z) {
        db6 db6Var = this.a;
        boolean z2 = db6Var.d;
        Range range = db6Var.c;
        if (!z2) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("ExposureCompensation is not supported");
            i64 i64Var = new i64();
            i64Var.j0(illegalArgumentException);
            return i64Var;
        }
        if (!range.contains(0)) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Requested ExposureCompensation 0 is not within valid range [" + range.getUpper() + " .. " + range.getLower() + ']');
            i64 i64Var2 = new i64();
            i64Var2.j0(illegalArgumentException2);
            return i64Var2;
        }
        kli kliVar = this.c;
        if (kliVar == null) {
            CameraControl$OperationCanceledException cameraControl$OperationCanceledException = new CameraControl$OperationCanceledException("Camera is not active.");
            i64 i64Var3 = db6Var.f;
            if (i64Var3 != null) {
                i64Var3.j0(cameraControl$OperationCanceledException);
            }
            i64 i64Var4 = new i64();
            i64Var4.j0(cameraControl$OperationCanceledException);
            return i64Var4;
        }
        eb6 eb6Var = this.b;
        this.b = new eb6(eb6Var.a, 0, eb6Var.c, eb6Var.d);
        zx3 zx3Var = db6Var.b;
        i64 i64Var5 = new i64();
        i64 i64Var6 = db6Var.f;
        if (i64Var6 != null) {
            if (z) {
                bc1.p("Cancelled by another setExposureCompensationIndex()", i64Var6);
            } else {
                rpl.d(i64Var5, i64Var6);
            }
        }
        db6Var.f = i64Var5;
        cb6 cb6Var = db6Var.g;
        if (cb6Var != null) {
            zx3Var.c(cb6Var);
            db6Var.g = null;
        }
        kliVar.l(Collections.singletonMap(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, 0), ili.b);
        cb6 cb6Var2 = new cb6(i64Var5);
        zx3Var.a(cb6Var2, db6Var.a.e);
        i64Var5.Y(new w14(db6Var, 15, cb6Var2));
        db6Var.g = cb6Var2;
        return i64Var5;
    }

    @Override // defpackage.fli
    public final void b(kli kliVar) {
        this.c = kliVar;
        a(false);
    }

    @Override // defpackage.fli
    public final void reset() {
        eb6 eb6Var = this.b;
        this.b = new eb6(eb6Var.a, 0, eb6Var.c, eb6Var.d);
        a(true);
    }
}
