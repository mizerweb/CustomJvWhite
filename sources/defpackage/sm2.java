package defpackage;

import android.hardware.camera2.CaptureResult;
import android.util.Log;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class sm2 implements gd2, ndi {
    public final jme a;
    public final pc7 b;

    public sm2(jme jmeVar, pc7 pc7Var) {
        this.a = jmeVar;
        this.b = pc7Var;
    }

    @Override // defpackage.ndi
    public final Object W(sr3 sr3Var) {
        boolean zEquals = sr3Var.equals(zfe.a(pc7.class));
        pc7 pc7Var = this.b;
        return zEquals ? pc7Var : pc7Var.W(sr3Var);
    }

    @Override // defpackage.gd2
    public final void a(ke6 ke6Var) {
        String strValueOf;
        ArrayList arrayList = ke6Var.a;
        super.a(ke6Var);
        xg metadata = this.b.getMetadata();
        try {
            Integer num = (Integer) metadata.a.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                ke6Var.d(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            if (tvj.f(5, "CXCP")) {
                Log.w("CXCP", "Failed to get JPEG orientation.");
            }
        }
        CaptureResult.Key key = CaptureResult.SENSOR_EXPOSURE_TIME;
        CaptureResult captureResult = metadata.a;
        CaptureResult captureResult2 = metadata.a;
        Long l = (Long) captureResult.get(key);
        if (l != null) {
            ke6Var.c("ExposureTime", String.valueOf(l.longValue() / 1.0E9d), arrayList);
        }
        Float f = (Float) captureResult2.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            ke6Var.c("FNumber", String.valueOf(f.floatValue()), arrayList);
        }
        Integer num2 = (Integer) captureResult2.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            int iIntValue = num2.intValue();
            ke6Var.c("SensitivityType", String.valueOf(3), arrayList);
            ke6Var.c("PhotographicSensitivity", String.valueOf(Math.min(65535, iIntValue)), arrayList);
            Integer num3 = (Integer) captureResult2.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
            if (num3 != null) {
                int iIntValue2 = iIntValue * ((int) (num3.intValue() / 100.0f));
                ke6Var.c("SensitivityType", String.valueOf(3), arrayList);
                ke6Var.c("PhotographicSensitivity", String.valueOf(Math.min(65535, iIntValue2)), arrayList);
            }
        }
        Float f2 = (Float) captureResult2.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            ke6Var.c("FocalLength", ((long) (f2.floatValue() * 1000.0f)) + "/1000", arrayList);
        }
        Integer num4 = (Integer) captureResult2.get(CaptureResult.CONTROL_AWB_MODE);
        if (num4 != null) {
            int iD = qt4.D(num4.intValue() == 0 ? 2 : 1);
            if (iD != 0) {
                strValueOf = iD != 1 ? null : String.valueOf(1);
            } else {
                strValueOf = String.valueOf(0);
            }
            ke6Var.c("WhiteBalance", strValueOf, arrayList);
        }
    }

    @Override // defpackage.gd2
    public final int c() {
        xg metadata = this.b.getMetadata();
        Integer num = (Integer) metadata.a.get(CaptureResult.FLASH_STATE);
        int i = 2;
        if ((num == null || num.intValue() != 0) && (num == null || num.intValue() != 1)) {
            if (num != null && num.intValue() == 2) {
                return 3;
            }
            i = 4;
            if ((num == null || num.intValue() != 3) && (num == null || num.intValue() != 4)) {
                if (num != null && tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "Unknown flash state (" + num.intValue() + ") for " + ((Object) tc7.a(metadata.a.getFrameNumber())) + '!');
                }
                return 1;
            }
        }
        return i;
    }

    @Override // defpackage.gd2
    public final ghh d() {
        return (ghh) this.a.b(ihh.a, ghh.b);
    }

    @Override // defpackage.gd2
    public final long getTimestamp() {
        Object obj = this.b.getMetadata().a.get(CaptureResult.SENSOR_TIMESTAMP);
        return ((Number) (obj != null ? obj : -1L)).longValue();
    }

    @Override // defpackage.gd2
    public final dd2 r() {
        xg metadata = this.b.getMetadata();
        Integer num = (Integer) metadata.a.get(CaptureResult.CONTROL_AF_STATE);
        if (num != null && num.intValue() == 0) {
            return dd2.b;
        }
        if ((num != null && num.intValue() == 3) || (num != null && num.intValue() == 1)) {
            return dd2.c;
        }
        if (num != null && num.intValue() == 4) {
            return dd2.f;
        }
        if (num != null && num.intValue() == 5) {
            return dd2.g;
        }
        if (num != null && num.intValue() == 2) {
            return dd2.d;
        }
        if (num != null && num.intValue() == 6) {
            return dd2.e;
        }
        dd2 dd2Var = dd2.a;
        if (num != null && tvj.f(3, "CXCP")) {
            Log.d("CXCP", "Unknown AF state (" + num.intValue() + ") for " + ((Object) tc7.a(metadata.a.getFrameNumber())) + '!');
        }
        return dd2Var;
    }

    @Override // defpackage.gd2
    public final ed2 s() {
        xg metadata = this.b.getMetadata();
        Integer num = (Integer) metadata.a.get(CaptureResult.CONTROL_AWB_STATE);
        if (num != null && num.intValue() == 0) {
            return ed2.b;
        }
        if (num != null && num.intValue() == 1) {
            return ed2.c;
        }
        if (num != null && num.intValue() == 2) {
            return ed2.d;
        }
        if (num != null && num.intValue() == 3) {
            return ed2.e;
        }
        ed2 ed2Var = ed2.a;
        if (num != null && tvj.f(3, "CXCP")) {
            Log.d("CXCP", "Unknown AWB state (" + num.intValue() + ") for " + ((Object) tc7.a(metadata.a.getFrameNumber())) + '!');
        }
        return ed2Var;
    }

    @Override // defpackage.gd2
    public final cd2 w() {
        xg metadata = this.b.getMetadata();
        Integer num = (Integer) metadata.a.get(CaptureResult.CONTROL_AE_STATE);
        if (num != null && num.intValue() == 0) {
            return cd2.b;
        }
        if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 5)) {
            return cd2.c;
        }
        if (num != null && num.intValue() == 4) {
            return cd2.d;
        }
        if (num != null && num.intValue() == 2) {
            return cd2.e;
        }
        if (num != null && num.intValue() == 3) {
            return cd2.f;
        }
        cd2 cd2Var = cd2.a;
        if (num != null && tvj.f(3, "CXCP")) {
            Log.d("CXCP", "Unknown AE state (" + num.intValue() + ") for " + ((Object) tc7.a(metadata.a.getFrameNumber())) + '!');
        }
        return cd2Var;
    }
}
