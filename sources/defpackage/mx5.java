package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class mx5 implements kx5 {
    public static final b1k a = new b1k(13, new mx5());
    public static final Set b = Collections.singleton(fx5.d);

    @Override // defpackage.kx5
    public final DynamicRangeProfiles a() {
        return null;
    }

    @Override // defpackage.kx5
    public final Set b(fx5 fx5Var) {
        qyj.h("DynamicRange is not supported: " + fx5Var, fx5.d.equals(fx5Var));
        return b;
    }

    @Override // defpackage.kx5
    public final Set c() {
        return b;
    }
}
