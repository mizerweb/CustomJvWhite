package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk;

/* JADX INFO: loaded from: classes2.dex */
public final class li2 extends ji2 {
    public static final li2 b = new li2();

    @Override // defpackage.ji2
    public final void a(cmi cmiVar, j28 j28Var) {
        super.a(cmiVar, j28Var);
        if (!(cmiVar instanceof a68)) {
            ore.p("config is not ImageCaptureConfig");
            return;
        }
        w8b w8bVarE = w8b.e();
        a68 a68Var = (a68) cmiVar;
        if (((ImageCapturePixelHDRPlusQuirk) uk5.a(ImageCapturePixelHDRPlusQuirk.class)) != null) {
            bh0 bh0Var = a68.b;
            if (a68Var.f(bh0Var)) {
                int iIntValue = ((Integer) a68Var.i(bh0Var)).intValue();
                if (iIntValue == 0) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
                    w8bVarE.m(shl.a(key), Boolean.TRUE);
                } else if (iIntValue == 1) {
                    CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                    w8bVarE.m(shl.a(key2), Boolean.FALSE);
                }
            }
        }
        j28Var.o(new jc2(dhc.a(w8bVarE)));
    }
}
