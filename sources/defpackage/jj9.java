package defpackage;

import android.hardware.camera2.CaptureResult;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class jj9 implements cle {
    public final /* synthetic */ kj9 a;

    public jj9(kj9 kj9Var) {
        this.a = kj9Var;
    }

    @Override // defpackage.cle
    public final void W(jme jmeVar, long j, wg wgVar) {
        if (Build.VERSION.SDK_INT >= 35) {
            kj9 kj9Var = this.a;
            if (kj9Var.c == null || !kj9Var.e) {
                return;
            }
            Integer num = (Integer) wgVar.b.a.get(CaptureResult.CONTROL_LOW_LIGHT_BOOST_STATE);
            if (num != null) {
                kj9Var.c(kj9Var.f, num.intValue() != 1 ? 0 : 1);
            }
        }
    }
}
