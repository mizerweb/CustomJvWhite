package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ohb implements m1k {
    public static final List b = Collections.singletonList(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    public final kg2 a;

    public ohb(kg2 kg2Var) {
        this.a = kg2Var;
    }

    @Override // defpackage.m1k
    public final Rect B() {
        qb2 qb2Var = (qb2) this.a.b;
        Rect rect = (Rect) qb2Var.c(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (rect != null) {
            return rect;
        }
        if (tvj.f(5, "CXCP")) {
            Log.w("CXCP", "Failed to read SENSOR_INFO_ACTIVE_ARRAY_SIZE for " + ((Object) ef2.b(qb2Var.a)) + '!');
        }
        return new Rect(0, 0, y5g.CLOSE_SOCKET_CODE_TIMEOUT, 3000);
    }

    @Override // defpackage.m1k
    public final xf5 E(float f, kli kliVar) {
        return qyj.a(sbi.a);
    }

    @Override // defpackage.m1k
    public final float b() {
        return 1.0f;
    }

    @Override // defpackage.m1k
    public final xf5 i(kli kliVar) {
        return qyj.a(sbi.a);
    }

    @Override // defpackage.m1k
    public final float w() {
        return 1.0f;
    }
}
