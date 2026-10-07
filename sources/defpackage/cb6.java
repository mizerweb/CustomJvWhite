package defpackage;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: loaded from: classes2.dex */
public final class cb6 implements cle {
    public final /* synthetic */ i64 a;

    public cb6(i64 i64Var) {
        this.a = i64Var;
    }

    @Override // defpackage.cle
    public final void k0(jme jmeVar, long j, wg wgVar) {
        xg xgVar = wgVar.b;
        Integer num = (Integer) xgVar.a.get(CaptureResult.CONTROL_AE_STATE);
        Integer num2 = (Integer) xgVar.a.get(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
        i64 i64Var = this.a;
        if (num == null || num2 == null) {
            if (num2 == null || num2.intValue() != 0) {
                return;
            }
            i64Var.Q(0);
            return;
        }
        int iIntValue = num.intValue();
        if ((iIntValue == 2 || iIntValue == 3 || iIntValue == 4) && num2.intValue() == 0) {
            i64Var.Q(0);
        }
    }
}
