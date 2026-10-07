package defpackage;

import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class gh implements vm2 {
    public final i4h a;

    public gh(i4h i4hVar) {
        this.a = i4hVar;
    }

    @Override // defpackage.vm2
    public final um2 a(le2 le2Var, Map map, zm2 zm2Var) throws Exception {
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((Surface) ((Map.Entry) it.next()).getValue());
        }
        if (le2Var.v0(arrayList, zm2Var)) {
            return new tm2(s66.a, ikl.a(map, this.a));
        }
        Log.w("CXCP", "Failed to create ConstrainedHighSpeedCaptureSession from " + le2Var + " for " + zm2Var + '!');
        zm2Var.b();
        return so2.e;
    }
}
