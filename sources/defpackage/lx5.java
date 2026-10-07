package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import android.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class lx5 implements kx5 {
    public final DynamicRangeProfiles a;

    public lx5(DynamicRangeProfiles dynamicRangeProfiles) {
        this.a = dynamicRangeProfiles;
    }

    public static Set d(Set set) {
        if (set.isEmpty()) {
            return c76.a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            fx5 fx5Var = (fx5) gx5.a.get(Long.valueOf(jLongValue));
            if (fx5Var == null && tvj.f(5, "CXCP")) {
                Log.w("CXCP", "Dynamic range profile cannot be converted to a DynamicRange object: " + jLongValue);
            }
            if (fx5Var != null) {
                linkedHashSet.add(fx5Var);
            }
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // defpackage.kx5
    public final DynamicRangeProfiles a() {
        return this.a;
    }

    @Override // defpackage.kx5
    public final Set b(fx5 fx5Var) {
        LinkedHashMap linkedHashMap = gx5.a;
        Long lA = gx5.a(fx5Var, this.a);
        if (lA != null) {
            return d(this.a.getProfileCaptureRequestConstraints(lA.longValue()));
        }
        ore.e(fx5Var, "DynamicRange is not supported: ");
        return null;
    }

    @Override // defpackage.kx5
    public final Set c() {
        return d(this.a.getSupportedProfiles());
    }
}
